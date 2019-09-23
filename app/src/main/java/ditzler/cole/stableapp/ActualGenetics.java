package ditzler.cole.stableapp;

public class ActualGenetics {








/*

from math import floor
from numpy import array
from PIL import Image
import os
import time
import json
import sys

start_time = time.time()

finaldata_file_path = "assets\\cache\\final_data"
file_check_tries = 0

project_path = ""
cache_path = "assets\\cache"
conversion_list = []
sprite_folder_list = []

error_log = {}
progress_log = {}

project_sprite_total = 0

sprite_eligibility_notes = {"0": [], "1": [], "2": []}
max_colors = 256  # If the total color count of a png exceeds this value, it will be ignored

# GET STDIN DATA FROM ELECTRON------------------------------------------------------------------------------------------

stdin_data_obj = json.loads(sys.argv[1])

project_path = stdin_data_obj["project_path"].replace('\\', '/')
conversion_list = stdin_data_obj["conversions"]
sprite_folder_list = stdin_data_obj["sprite_folder_names"]
appdata_folder_path = stdin_data_obj["appdata_path"].replace('\\', '/')


# go through all colors in conversion list and change the data type of every value from a string to an int
for i, conversion in enumerate(conversion_list):
    for j, color in enumerate(conversion):
        for k, val in enumerate(color):
            conversion_list[i][j][k] = int(val)


# CHECK ELIGIBILITY OF IMAGE -----------------------------------------------------------------------------------------
# RETURNS TRUE IF IMAGE IS ELIGIBLE FOR PALETTE CHANGE, ELSE RETURNS FALSE


def check_sprite_eligibility(file_path, sprite_folder_name):

    file_path_split = split_path(file_path)
    sprite_file_name = file_path_split[len(file_path_split)-1]

    # CHECK IMG HAS PNG EXTENSION
    if file_path[-4:] != '.png':
        return False

    # CHECK IF THIS SPRITE IS ONE OF THOSE SELECTED BY THE USER
    if sprite_folder_name not in sprite_folder_list:
        return False

    global project_sprite_total
    project_sprite_total += 1

    # CHECK IMAGE CAN BE READ
    try:
        img = Image.open(file_path)
    except:
        log_sprite_eligibility_note(sprite_folder_name, sprite_file_name, file_path, 0)
        return False

    img = img.convert('RGBA')

    # CHECK THE IMAGE DOES NOT EXCEED OUR MAXIMUM NUMBER OF COLOURS
    img_color_data = img.getcolors(maxcolors=max_colors)

    if img_color_data is None:
        log_sprite_eligibility_note(sprite_folder_name, sprite_file_name, file_path, 1)
        return False

    # CHECK IF THE IMAGE CONTAINS THE COLOUR WHICH IS TO BE CONVERTED
    contains_at_least_one_old_color = False

    for conversion_old_new in conversion_list:
        rgba_old = conversion_old_new[0]

        for i in img_color_data:
            if (i[1][0] == rgba_old[0]) and (i[1][1] == rgba_old[1]) and (i[1][2] == rgba_old[2]) and (i[1][3] == rgba_old[3]):
                contains_at_least_one_old_color = True
                break
            if (i[1][3] == 0) and (rgba_old[3] == 0):
                contains_at_least_one_old_color = True
                break

    if not contains_at_least_one_old_color:
        log_sprite_eligibility_note(sprite_folder_name, sprite_file_name, file_path, 2)
        return False

    return True

# ----------------------------------------------------------------------------------------------------------------------
# RETURNS AN ARRAY FILLED WITH PATHS TO EACH OF THE ELIGIBLE PNG IMAGES IN THE SPRITE FOLDER


def get_sprite_path_list(project_folder_path):

    project_folder_path = project_folder_path.replace('\\', '/')

    sprite_folder_path = os.path.join(project_folder_path, "sprites")

    sprite_path_list = []

    sprites_folder_depth = len(split_path(sprite_folder_path))

    if os.path.exists(sprite_folder_path):

        for root, dirs, files in os.walk(sprite_folder_path):

            for file in files:

                path = os.path.join(root, file).replace('\\', '/')

                sprite_folder_name = split_path(path)[sprites_folder_depth]

                if check_sprite_eligibility(path, sprite_folder_name):
                    sprite_path_list.append(path)

    else:
        print("ERROR, NO SPRITES FOLDER FOUND IN PROJECT")

    return sprite_path_list


# ----------------------------------------------------------------------------------------------------------------------
# FUNCTION FOR LOGGING ERRORS IN THE GLOBAL ERROR LOG DICTIONARY
# THE IMAGE FILE PATH IS THE KEY, AND THE VALUE IS AN ARRAY OF ERROR STRINGS


def log_sprite_eligibility_note(folder_name, sprite_file_name,  file_path, error_string):

    # we don't need to send the entire path over with every sprite
    # the path to the sprites folder is the same every time, and we already know the name of the png file
    # and we also know the name of this sprite's main folder
    # so strip everything from the path except the parts between those
    # then reassemble the path when it gets to electron like so:
    # path-to-sprite-folder / sprite-folder-name /  + <THIS PATH> + / png-image-name

    # strip file name from end of path
    file_path = os.path.dirname(file_path)

    # strip up to and including the "sprites" folder from path
    file_path = os.path.relpath(file_path, os.path.join(project_path, "sprites", folder_name)).replace('\\', '/')

    if file_path == ".":
        file_path = ""

    global sprite_eligibility_notes
    error_string = str(error_string)

    if error_string in sprite_eligibility_notes:
        sprite_eligibility_notes[error_string].append([folder_name, sprite_file_name, file_path])
    else:
        sprite_eligibility_notes[error_string] = [[folder_name, sprite_file_name, file_path]]


# ----------------------------------------------------------------------------------------------------------------------
# TAKES A FILE PATH FOR THE IMAGE, AN [R,G,B,A] TO BE CONVERTED, AND A TARGET [R,G,B,A] TO CONVERT TO


def convert_sprite_colors(sprite_path):

    img = Image.open(sprite_path)
    img = img.convert('RGBA')

    # this var is just for checking whether the color actually exists in the image before we bother to try change it
    img_color_data = img.getcolors(maxcolors=max_colors)

    for conversion_old_new in conversion_list:
        rgba_old = conversion_old_new[0]
        rgba_new = conversion_old_new[1]
        old_color_in_image = False

        # check whether the old color is in the image before wasting time converting
        for i in img_color_data:
            if (i[1][0] == rgba_old[0]) and (i[1][1] == rgba_old[1]) and (i[1][2] == rgba_old[2]) and (i[1][3] == rgba_old[3]):
                old_color_in_image = True
                break
            if (i[1][3] == 0) and (rgba_old[3] == 0):
                old_color_in_image = True
                break

        # skip to next in loop if color isn't present
        if not old_color_in_image:
            continue

        # convert the color
        data = array(img)

        r1, g1, b1, a1 = rgba_old[0], rgba_old[1], rgba_old[2], rgba_old[3]
        r2, g2, b2, a2 = rgba_new[0], rgba_new[1], rgba_new[2], rgba_new[3]

        red, green, blue, alpha = data[:, :, 0], data[:, :, 1], data[:, :, 2], data[:, :, 3]
        if a1 == 0:
            mask = True & True & True & (alpha == a1)
        else:
            mask = (red == r1) & (green == g1) & (blue == b1) & (alpha == a1)

        data[:, :, :4][mask] = [r2, g2, b2, a2]
        img = Image.fromarray(data)

    # save the new image
    img.save(sprite_path)


# ----------------------------------------------------------------------------------------------------------------------
# TAKES A PATH AND SPLITS IT INTO AN ARRAY

def split_path(path):

    all_parts = []
    while 1:
        parts = os.path.split(path)
        if parts[0] == path:
            all_parts.insert(0, parts[0])
            break
        elif parts[1] == path:
            all_parts.insert(0, parts[1])
            break
        else:
            path = parts[0]
            all_parts.insert(0, parts[1])
    return all_parts

# ----------------------------------------------------------------------------------------------------------------------


def write_load_live(percent):

    loading_data = {
        "done": "false",
        "percent": percent,
        "time": "",
        "error_log": {},
        "total_converted": -1,
        "total_images": -1,
        "sprite_file_path": "",
    }

    print(json.dumps(loading_data), flush=True)


# ----------------------------------------------------------------------------------------------------------------------

# get list of eligible sprites based on the users list of selected sprites, and whether those sprites are compatible
eligible_sprite_path_list = get_sprite_path_list(project_path)

# get a count for the total number of sprites eligible to be converted
total_number_of_sprites_to_convert = len(eligible_sprite_path_list)
i = 0

# convert the sprites and log the loading data
for sprite in eligible_sprite_path_list:

    i += 1
    convert_sprite_colors(sprite)
    percent_done = floor((i / total_number_of_sprites_to_convert) * 100)

    # log loading data
    write_load_live(percent_done)


# save the error log

final_data = {
    "done": "true",
    "percent": 100,
    "time": str(floor((time.time() - start_time) * 100) / 100),
    "error_log": sprite_eligibility_notes,
    "total_converted": len(eligible_sprite_path_list),
    "total_images": project_sprite_total,
    "sprite_file_path": os.path.join(project_path, "sprites").replace('\\', '/'),
}

print(json.dumps(final_data), flush=True)

dump_file = open(appdata_folder_path, "w")
dump_file.write(json.dumps(final_data))
dump_file.close()












    Instead of doing this:

    class Projectile
    {
        float Velocity=100.f;

        void Update(float DeltaTime)
        {
            this.Position +=this.getForwardVector() * Velocity * DeltaTime;
        }
    }
*/
/*
do this:
*//*
    class ProjectileCorrect
    {
        float TerminalVelocity=100.f;
        float Acceleration = 50.f;
        float CurrentVelocity = 0.f;

        void Update(float DeltaTime)
        {
            this.Position +=this.getForwardVector() * TerminalVelocity*TerminalVelocity/Acceleration*(Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity))+Acceleration*DeltaTime/TerminalVelocity+Math::exp(-Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity)) -a*DeltaTime/TerminalVelocity)-1.f);
            CurrentVelocity =TerminalVelocity-TerminalVelocity*Math::exp(-Math::ln(TerminalVelocity/(TerminalVelocity-CurrentVelocity)) -
                Acceleration*DeltaTime/TerminalVelocity);
        }
    }
*/



/*
    public double ReturnsFour(int NotFour){
    int four = 4;
    double StillNotFour = NotFour;
    double SquareRootOfStillNotFour = Math.sqrt(StillNotFour);
    double SquareRootOfSquareRootOfStillNotFour = Math.sqrt(SquareRootOfStillNotFour);
    double MightBeFour = Math.log10(StillNotFour)/Math.log10(SquareRootOfSquareRootOfStillNotFour);
   if(MightBeFour == four){
    return MightBeFour;
   }else {
    return 4;
  }
}
*/







/*

    int GeneticsLength = 201;
    String[] CrazyStrings = new String[GeneticsLength];

    String[0] = "%s";





    generate an array of genes and go through each parent to create crossedover gametes. Fuse gametes, repeat in next generation.
    the crossover can work by generating a random (0-length to to end of array) and check it vs how many steps have been on one side already.
    For instance Randomly chooses a allele to start, the chromosome is of length 10, So after the first stem the roll is Random (0-9) and it is checked against 1,
    It is unlikely to terminate after the first step, then the second step gives Random(0-8) and this is checked against 2. The likelyhood of swapping sides increases as the distance gets shorter
    this would lead to some more chaotic results toward the end of long chromosomes. This can be where the genes in high flux go, the more stable genes go toward the start.
     */

/*
    public void DoesYourHomework(int StarterInt) {

        TextView TextViewOne;
        TextViewOne = (TextView) findViewById(R.id.OnlyTextView);
        double[] Output = new double[9];

        int IntLength = String.valueOf(StarterInt).length();
        int LoopCounter;
        double ModCounter = Math.pow(10, IntLength);

        for (LoopCounter = 0; LoopCounter < (IntLength + 1); LoopCounter++) {

            Output[LoopCounter] = Math.floor(StarterInt / ModCounter);
            ModCounter = ModCounter/10;

        }
        TextViewOne.setText(" " + Output[0] + " " + Output[1] + " " + Output[2] + " " + Output[3] + " " + Output[4] + " " + Output[5] + " " + Output[6] + " " + Output[7] + " " + Output[8]);

    }
*/
}
