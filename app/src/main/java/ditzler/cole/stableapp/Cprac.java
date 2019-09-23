package ditzler.cole.stableapp; // Replace this with your package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Cprac extends AppCompatActivity{

    Button PressMeButton;
    ImageView ImageDisplayForCircle; // declaring our elements
    private  Integer ImageArray[] = {R.drawable.tinycircle}; //this array has one image in it, and the image is indexed to 0 (zero) so when I refrence this array later, and ask for image 0, it displays it.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cprac_layout);
        PressMeButton = findViewById(R.id.RandomizerButton); // initialization of out elements, this is a button
        ImageDisplayForCircle = findViewById(R.id.CircleImageView);


        PressMeButton.setOnClickListener(new View.OnClickListener() { //button syntax1
            @Override
            public void onClick(View v) {
                int ScalerForCircle = (new Random().nextInt(20)+10); //this creates the random size of the circle these numbers are arbitrary but if it goes below +3 then there can be a fatal error as long as you are dividing later by 3 or more.
                int CircleColorBlue =  (new Random().nextInt(255)); // blue value
                int CircleColorGreen =  (new Random().nextInt(255)); // green value
                int CircleColorRed =  (new Random().nextInt(255)); //this creates the random color's number for the red circle, the combinations of these numbers is the same as 000000 through FFFFFF from hexidecimal, thus making any hex color
                int ColorSaturation = (new Random().nextInt(255)); // this sets the saturation, 0 is none, 255 is 100%



                Bitmap CircleBitmap = BitmapFactory.decodeResource(getResources(), ImageArray[0]); // this creates a workable copy of our image
                int Size = CircleBitmap.getWidth(); // since its a square image I used width as both width and height

                Matrix mat1 = new Matrix(); // to be honest I still don't know exactly how matrices work, but they are used to scale or rotate bitmaps
                mat1.postScale(ScalerForCircle/3,ScalerForCircle/3); // the division by 3 is arbitrary, but not all numbers work here anything less than 10 is safe, but 0 is obviously bad, and the lower you go the bigger the image will be on average
                Bitmap Bitmapmaker = Bitmap.createBitmap(CircleBitmap, 0, 0, Size, Size, mat1, true); // this takes the working copy of the bitmap and the dimensions from the matrix to make the image


                ImageDisplayForCircle.setImageBitmap(Bitmapmaker); // this sets the image bitmap into the imageview
                ImageDisplayForCircle.setColorFilter(Color.argb(ColorSaturation, CircleColorRed, CircleColorGreen, CircleColorBlue)); // this tints the image

            }
        });
    }

    public int convertToDp(int input) { // Get the screen's density scale so that we can fit images onto it better. Call this method when you want to convert an images dimensions to fit on your screen.
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }


}



