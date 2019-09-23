package ditzler.cole.stableapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class RabbitHutchBranch extends AppCompatActivity {

 int Pageinitializer = 0;
    int PagesCounter = 0;
    int PagesMin = 0;
    int PagesMax = 1;
    String catchname = "%s%s";
    int Truebabydisplaycounter, babydisplaycounter, ReverseCheckCounter, Occurence = 0; int babycounter = 0;
    String Male = "Male";
    ImageView DisplayBodyTwo, DisplayEarsTwo, DisplayEyesTwo, DisplayBodyThree, DisplayEarsThree, DisplayEyesThree, DisplayBodyFour, DisplayEarsFour, DisplayEyesFour, DisplayBodyFive, DisplayEarsFive, DisplayEyesFive, DisplayBodySix, DisplayEarsSix, DisplayEyesSix, DisplayBodySeven, DisplayEarsSeven, DisplayEyesSeven, DisplayBodyEight, DisplayEarsEight, DisplayEyesEight, DisplayBodyNine, DisplayEarsNine, DisplayEyesNine, DisplayBodyTen, DisplayEarsTen, DisplayEyesTen, DisplayBodyEleven, DisplayEarsEleven, DisplayEyesEleven,  DisplayBodyThirteen, DisplayEarsThirteen, DisplayEyesThirteen, DisplayBodyFourteen, DisplayEarsFourteen, DisplayEyesFourteen, DisplayBodyFifteen, DisplayEarsFifteen, DisplayEyesFifteen ,DisplayBodySixteen, DisplayEarsSixteen, DisplayEyesSixteen;
    ImageButton DisplayTailSelectedOne, DisplayBodyOne, DisplayEarsOne, DisplayTailOne, DisplayTailTwo,DisplayTailThree, DisplayTailFour, DisplayTailFive, DisplayBodyTwelve, DisplayEarsTwelve, DisplayEyesTwelve, DisplayTailSix, DisplayTailSeven, DisplayTailEight, DisplayTailNine, DisplayTailTen,DisplayTailEleven, DisplayTailTwelve, DisplayTailThirteen, DisplayTailFourteen, DisplayTailFifteen, DisplayTailSixteen, DisplayEyesOne, DisplayBodySelectedOne, DisplayEarsSelectedOne, DisplayEyesSelectedOne;
TextView DisplaySelectedSex;
    Button DisplayAll,DisplayAllPast, PickOnLola, PickOnHairy;
    private Integer Bodies[] = {R.drawable.rabbitbody, R.drawable.rabbitbodyspotsone, R.drawable.rabbitbodyspotstwo, R.drawable.rabbitbodystar, R.drawable.rabbitbodyrings, R.drawable.rabbitbodystripes, R.drawable.rabbitbodystripestwo, R.drawable.rabbitbodybeans, R.drawable.rabbitbodybigspot, R.drawable.rabbitbodytarget, R.drawable.rabbitbodyx, R.drawable.rabbitbodynine};

    private Integer Ears[] = {R.drawable.rabbitearsroundspotlongsplit, R.drawable.rabbitearsroundspotlongsplitvery,R.drawable.rabbitearsroundspotlongsplithuge, R.drawable.rabbitearspointylong, R.drawable.rabbitearspointyclose, R.drawable.rabbitearsroundlong, R.drawable.rabbitearsroundspotlongclose, R.drawable.rabbitearsnarwhalhorn};

    private Integer Eyes[] = {R.drawable.rabbiteyesmedium, R.drawable.rabbiteyeswide, R.drawable.rabbiteyes};

    private Integer Tail[] = {R.drawable.rabbitfluffytailflat, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfeathertail, R.drawable.rabbitfeathertailnarrow, R.drawable.rabbitfeathertailtwo, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide};


    HareSplitting.Hare Hairy, Lola, BabyButtonOneSelecterHare, BabyButtonTwoSelecterHare, BabyButtonThreeSelecterHare, BabyButtonFourSelecterHare, BabyButtonFiveSelecterHare, BabyButtonSixSelecterHare, BabyButtonSevenSelecterHare, BabyButtonEightSelecterHare,BabyButtonNineSelecterHare,BabyButtonTenSelecterHare,BabyButtonElevenSelecterHare,BabyButtonTwelveSelecterHare,BabyButtonThirteenSelecterHare,BabyButtonFourteenSelecterHare,BabyButtonFifteenSelecterHare,BabyButtonSixteenSelecterHare= null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hare_hutch);

        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);

        DisplayAll = (Button) findViewById(R.id.Display);
        DisplayAllPast = (Button) findViewById(R.id.DisplayPast);
        PickOnLola = (Button) findViewById(R.id.PickLola);
        PickOnHairy = (Button) findViewById(R.id.PickHairy);

        DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);

        DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
        DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
        DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);
        DisplayTailOne = (ImageButton) findViewById(R.id.DisplayBabyOneTail);
        DisplayTailTwo = (ImageButton) findViewById(R.id.DisplayBabyTwoTail);
        DisplayTailThree = (ImageButton) findViewById(R.id.DisplayBabyThreeTail);
        DisplayTailFour = (ImageButton) findViewById(R.id.DisplayBabyFourTail);
        DisplayTailFive = (ImageButton) findViewById(R.id.DisplayBabyFiveTail);
        DisplayTailSix = (ImageButton) findViewById(R.id.DisplayBabySixTail);
        DisplayTailSeven = (ImageButton) findViewById(R.id.DisplayBabySevenTail);
        DisplayTailEight = (ImageButton) findViewById(R.id.DisplayBabyEightTail);
        DisplayTailNine = (ImageButton) findViewById(R.id.DisplayBabyNineTail);
        DisplayTailTen = (ImageButton) findViewById(R.id.DisplayBabyTenTail);
        DisplayTailEleven = (ImageButton) findViewById(R.id.DisplayBabyElevenTail);
        DisplayTailTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveTail);
        DisplayTailThirteen = (ImageButton) findViewById(R.id.DisplayBabyThirteenTail);
        DisplayTailFourteen = (ImageButton) findViewById(R.id.DisplayBabyFourteenTail);
        DisplayTailFifteen = (ImageButton) findViewById(R.id.DisplayBabyFifteenTail);
        DisplayTailSixteen = (ImageButton) findViewById(R.id.DisplayBabySixteenTail);
        DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
        DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
        DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);
        DisplayBodySelectedOne = (ImageButton) findViewById(R.id.DisplayBabyBodyLarge);
        DisplayEarsSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEarsLarge);
        DisplayEyesSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEyesLarge);
        DisplayTailSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyTailLarge);
        


        DisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHutch = getIntent();
                String catchname = "%s%s";
                String babyharecallnameOne = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareOne = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameOne);
                double StupidBabyNumber = intentHutch.getIntExtra("StupidBabyNumber", 402);
                int IncrediblyRetardedBabyNumber = (int) StupidBabyNumber;

                HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[IncrediblyRetardedBabyNumber];
                DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
                DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
                DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);
                DisplayTailOne = (ImageButton) findViewById(R.id.DisplayBabyOneTail);

                

                if (HareOne != null) {
                    DisplayBodyOne.setImageResource(Bodies[HareOne.BodyType]);
                    DisplayEarsOne.setImageResource(Ears[HareOne.EarsType]);
                    DisplayEyesOne.setImageResource(Eyes[HareOne.EyesType]);
                    int Red = ((HareOne.At * 16) + HareOne.Bt);
                    int Green = ((HareOne.Ct * 16) + HareOne.Dt);
                    int Blue = ((HareOne.Et * 16) + HareOne.Ft);
                    DisplayBodyOne.setColorFilter(Color.argb(HareOne.HareAlpha, Red, Green, Blue));
                    int Rede1 = ((HareOne.earAt * 16) + HareOne.earBt);
                    int Greene1 = ((HareOne.earCt * 16) + HareOne.earDt);
                    int Bluee1 = ((HareOne.earEt * 16) + HareOne.earFt);
                    DisplayEarsOne.setColorFilter(Color.argb(HareOne.HareAlpha, Rede1, Greene1, Bluee1));
                    int Rede2 = ((HareOne.eyeAt * 16) + HareOne.eyeBt);
                    int Greene2 = ((HareOne.eyeCt * 16) + HareOne.eyeDt);
                    int Bluee2 = ((HareOne.eyeEt * 16) + HareOne.eyeFt);
                    DisplayEyesOne.setColorFilter(Color.argb(HareOne.HareAlpha, Rede2, Greene2, Bluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameTwo = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareTwo = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameTwo);
                DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
                DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
                DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);


                if (HareTwo != null) {
                    DisplayBodyTwo.setImageResource(Bodies[HareTwo.BodyType]);
                    DisplayEarsTwo.setImageResource(Ears[HareTwo.EarsType]);
                    DisplayEyesTwo.setImageResource(Eyes[HareTwo.EyesType]);
                    int TwoRed = ((HareTwo.At * 16) + HareTwo.Bt);
                    int TwoGreen = ((HareTwo.Ct * 16) + HareTwo.Dt);
                    int TwoBlue = ((HareTwo.Et * 16) + HareTwo.Ft);
                    DisplayBodyTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRed, TwoGreen, TwoBlue));
                    int TwoRede1 = ((HareTwo.earAt * 16) + HareTwo.earBt);
                    int TwoGreene1 = ((HareTwo.earCt * 16) + HareTwo.earDt);
                    int TwoBluee1 = ((HareTwo.earEt * 16) + HareTwo.earFt);
                    DisplayEarsTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRede1, TwoGreene1, TwoBluee1));
                    int TwoRede2 = ((HareTwo.eyeAt * 16) + HareTwo.eyeBt);
                    int TwoGreene2 = ((HareTwo.eyeCt * 16) + HareTwo.eyeDt);
                    int TwoBluee2 = ((HareTwo.eyeEt * 16) + HareTwo.eyeFt);
                    DisplayEyesTwo.setColorFilter(Color.argb(HareTwo.HareAlpha, TwoRede2, TwoGreene2, TwoBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameThree = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareThree = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameThree);
                DisplayBodyThree = (ImageView) findViewById(R.id.DisplayBabyThreeBody);
                DisplayEarsThree = (ImageView) findViewById(R.id.DisplayBabyThreeEars);
                DisplayEyesThree = (ImageView) findViewById(R.id.DisplayBabyThreeEyes);


                if (HareThree != null) {
                    DisplayBodyThree.setImageResource(Bodies[HareThree.BodyType]);
                    DisplayEarsThree.setImageResource(Ears[HareThree.EarsType]);
                    DisplayEyesThree.setImageResource(Eyes[HareThree.EyesType]);
                    int ThreeRed = ((HareThree.At * 16) + HareThree.Bt);
                    int ThreeGreen = ((HareThree.Ct * 16) + HareThree.Dt);
                    int ThreeBlue = ((HareThree.Et * 16) + HareThree.Ft);
                    DisplayBodyThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRed, ThreeGreen, ThreeBlue));
                    int ThreeRede1 = ((HareThree.earAt * 16) + HareThree.earBt);
                    int ThreeGreene1 = ((HareThree.earCt * 16) + HareThree.earDt);
                    int ThreeBluee1 = ((HareThree.earEt * 16) + HareThree.earFt);
                    DisplayEarsThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRede1, ThreeGreene1, ThreeBluee1));
                    int ThreeRede2 = ((HareThree.eyeAt * 16) + HareThree.eyeBt);
                    int ThreeGreene2 = ((HareThree.eyeCt * 16) + HareThree.eyeDt);
                    int ThreeBluee2 = ((HareThree.eyeEt * 16) + HareThree.eyeFt);
                    DisplayEyesThree.setColorFilter(Color.argb(HareThree.HareAlpha, ThreeRede2, ThreeGreene2, ThreeBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }

                String babyharecallnameFour = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareFour = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameFour);
                DisplayBodyFour = (ImageView) findViewById(R.id.DisplayBabyFourBody);
                DisplayEarsFour = (ImageView) findViewById(R.id.DisplayBabyFourEars);
                DisplayEyesFour = (ImageView) findViewById(R.id.DisplayBabyFourEyes);


                if (HareFour != null) {
                    DisplayBodyFour.setImageResource(Bodies[HareFour.BodyType]);
                    DisplayEarsFour.setImageResource(Ears[HareFour.EarsType]);
                    DisplayEyesFour.setImageResource(Eyes[HareFour.EyesType]);
                    int FourRed = ((HareFour.At * 16) + HareFour.Bt);
                    int FourGreen = ((HareFour.Ct * 16) + HareFour.Dt);
                    int FourBlue = ((HareFour.Et * 16) + HareFour.Ft);
                    DisplayBodyFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRed, FourGreen, FourBlue));
                    int FourRede1 = ((HareFour.earAt * 16) + HareFour.earBt);
                    int FourGreene1 = ((HareFour.earCt * 16) + HareFour.earDt);
                    int FourBluee1 = ((HareFour.earEt * 16) + HareFour.earFt);
                    DisplayEarsFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRede1, FourGreene1, FourBluee1));
                    int FourRede2 = ((HareFour.eyeAt * 16) + HareFour.eyeBt);
                    int FourGreene2 = ((HareFour.eyeCt * 16) + HareFour.eyeDt);
                    int FourBluee2 = ((HareFour.eyeEt * 16) + HareFour.eyeFt);
                    DisplayEyesFour.setColorFilter(Color.argb(HareFour.HareAlpha, FourRede2, FourGreene2, FourBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameFive = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareFive = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameFive);
                DisplayBodyFive = (ImageView) findViewById(R.id.DisplayBabyFiveBody);
                DisplayEarsFive = (ImageView) findViewById(R.id.DisplayBabyFiveEars);
                DisplayEyesFive = (ImageView) findViewById(R.id.DisplayBabyFiveEyes);


                if (HareFive != null) {
                    DisplayBodyFive.setImageResource(Bodies[HareFive.BodyType]);
                    DisplayEarsFive.setImageResource(Ears[HareFive.EarsType]);
                    DisplayEyesFive.setImageResource(Eyes[HareFive.EyesType]);
                    int FiveRed = ((HareFive.At * 16) + HareFive.Bt);
                    int FiveGreen = ((HareFive.Ct * 16) + HareFive.Dt);
                    int FiveBlue = ((HareFive.Et * 16) + HareFive.Ft);
                    DisplayBodyFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRed, FiveGreen, FiveBlue));
                    int FiveRede1 = ((HareFive.earAt * 16) + HareFive.earBt);
                    int FiveGreene1 = ((HareFive.earCt * 16) + HareFive.earDt);
                    int FiveBluee1 = ((HareFive.earEt * 16) + HareFive.earFt);
                    DisplayEarsFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRede1, FiveGreene1, FiveBluee1));
                    int FiveRede2 = ((HareFive.eyeAt * 16) + HareFive.eyeBt);
                    int FiveGreene2 = ((HareFive.eyeCt * 16) + HareFive.eyeDt);
                    int FiveBluee2 = ((HareFive.eyeEt * 16) + HareFive.eyeFt);
                    DisplayEyesFive.setColorFilter(Color.argb(HareFive.HareAlpha, FiveRede2, FiveGreene2, FiveBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameSix = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareSix = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameSix);
                DisplayBodySix = (ImageView) findViewById(R.id.DisplayBabySixBody);
                DisplayEarsSix = (ImageView) findViewById(R.id.DisplayBabySixEars);
                DisplayEyesSix = (ImageView) findViewById(R.id.DisplayBabySixEyes);


                if (HareSix != null) {
                    DisplayBodySix.setImageResource(Bodies[HareSix.BodyType]);
                    DisplayEarsSix.setImageResource(Ears[HareSix.EarsType]);
                    DisplayEyesSix.setImageResource(Eyes[HareSix.EyesType]);
                    int SixRed = ((HareSix.At * 16) + HareSix.Bt);
                    int SixGreen = ((HareSix.Ct * 16) + HareSix.Dt);
                    int SixBlue = ((HareSix.Et * 16) + HareSix.Ft);
                    DisplayBodySix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRed, SixGreen, SixBlue));
                    int SixRede1 = ((HareSix.earAt * 16) + HareSix.earBt);
                    int SixGreene1 = ((HareSix.earCt * 16) + HareSix.earDt);
                    int SixBluee1 = ((HareSix.earEt * 16) + HareSix.earFt);
                    DisplayEarsSix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRede1, SixGreene1, SixBluee1));
                    int SixRede2 = ((HareSix.eyeAt * 16) + HareSix.eyeBt);
                    int SixGreene2 = ((HareSix.eyeCt * 16) + HareSix.eyeDt);
                    int SixBluee2 = ((HareSix.eyeEt * 16) + HareSix.eyeFt);
                    DisplayEyesSix.setColorFilter(Color.argb(HareSix.HareAlpha, SixRede2, SixGreene2, SixBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameSeven = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareSeven = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameSeven);
                DisplayBodySeven = (ImageView) findViewById(R.id.DisplayBabySevenBody);
                DisplayEarsSeven = (ImageView) findViewById(R.id.DisplayBabySevenEars);
                DisplayEyesSeven = (ImageView) findViewById(R.id.DisplayBabySevenEyes);


                if (HareSeven != null) {
                    DisplayBodySeven.setImageResource(Bodies[HareSeven.BodyType]);
                    DisplayEarsSeven.setImageResource(Ears[HareSeven.EarsType]);
                    DisplayEyesSeven.setImageResource(Eyes[HareSeven.EyesType]);
                    int SevenRed = ((HareSeven.At * 16) + HareSeven.Bt);
                    int SevenGreen = ((HareSeven.Ct * 16) + HareSeven.Dt);
                    int SevenBlue = ((HareSeven.Et * 16) + HareSeven.Ft);
                    DisplayBodySeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRed, SevenGreen, SevenBlue));
                    int SevenRede1 = ((HareSeven.earAt * 16) + HareSeven.earBt);
                    int SevenGreene1 = ((HareSeven.earCt * 16) + HareSeven.earDt);
                    int SevenBluee1 = ((HareSeven.earEt * 16) + HareSeven.earFt);
                    DisplayEarsSeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRede1, SevenGreene1, SevenBluee1));
                    int SevenRede2 = ((HareSeven.eyeAt * 16) + HareSeven.eyeBt);
                    int SevenGreene2 = ((HareSeven.eyeCt * 16) + HareSeven.eyeDt);
                    int SevenBluee2 = ((HareSeven.eyeEt * 16) + HareSeven.eyeFt);
                    DisplayEyesSeven.setColorFilter(Color.argb(HareSeven.HareAlpha, SevenRede2, SevenGreene2, SevenBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }


                String babyharecallnameEight = String.format(catchname, "NewHare", babycounter);
                HareSplitting.Hare HareEight = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameEight);
                DisplayBodyEight = (ImageView) findViewById(R.id.DisplayBabyEightBody);
                DisplayEarsEight = (ImageView) findViewById(R.id.DisplayBabyEightEars);
                DisplayEyesEight = (ImageView) findViewById(R.id.DisplayBabyEightEyes);


                if (HareEight != null) {
                    DisplayBodyEight.setImageResource(Bodies[HareEight.BodyType]);
                    DisplayEarsEight.setImageResource(Ears[HareEight.EarsType]);
                    DisplayEyesEight.setImageResource(Eyes[HareEight.EyesType]);
                    int EightRed = ((HareEight.At * 16) + HareEight.Bt);
                    int EightGreen = ((HareEight.Ct * 16) + HareEight.Dt);
                    int EightBlue = ((HareEight.Et * 16) + HareEight.Ft);
                    DisplayBodyEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRed, EightGreen, EightBlue));
                    int EightRede1 = ((HareEight.earAt * 16) + HareEight.earBt);
                    int EightGreene1 = ((HareEight.earCt * 16) + HareEight.earDt);
                    int EightBluee1 = ((HareEight.earEt * 16) + HareEight.earFt);
                    DisplayEarsEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRede1, EightGreene1, EightBluee1));
                    int EightRede2 = ((HareEight.eyeAt * 16) + HareEight.eyeBt);
                    int EightGreene2 = ((HareEight.eyeCt * 16) + HareEight.eyeDt);
                    int EightBluee2 = ((HareEight.eyeEt * 16) + HareEight.eyeFt);
                    DisplayEyesEight.setColorFilter(Color.argb(HareEight.HareAlpha, EightRede2, EightGreene2, EightBluee2));
                    babycounter = (babycounter + 1) % IncrediblyRetardedBabyNumber;
                }



                ButtonImageScalerOne(HareOne);
                ButtonImageScalerTwo(HareTwo);
                ButtonImageScalerThree(HareThree);
                ButtonImageScalerFour(HareFour);
                ButtonImageScalerFive(HareFive); 
                ButtonImageScalerSix(HareSix);
                ButtonImageScalerSeven(HareSeven);
                ButtonImageScalerEight(HareEight);

            }
        });

    }

    public void ButtonLargeImageScalerOne(HareSplitting.Hare Escape){

        if (Escape == null){
            return;
        }


        DisplayBodySelectedOne.setImageResource(Bodies[Escape.BodyType]);
        DisplayEarsSelectedOne.setImageResource(Ears[Escape.EarsType]);
        DisplayEyesSelectedOne.setImageResource(Eyes[Escape.EyesType]);
        DisplayTailSelectedOne.setImageResource(Tail[Escape.TailType]);

        int scaler = (200*Escape.size)/150;
        FrameLayout DisplayBabyOneButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyOneButtonFrame);
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) DisplayBabyOneButtonFrame.getLayoutParams();
        DisplayEarsSelectedOne.requestLayout();
        DisplayEyesSelectedOne.requestLayout();
        DisplayBodySelectedOne.requestLayout();
        DisplayTailSelectedOne.requestLayout();

        DisplayEarsSelectedOne.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        DisplayBodySelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayBodySelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayEyesSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayEyesSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayEarsSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayEarsSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayTailSelectedOne.getLayoutParams().width = convertToDp(scaler);
        DisplayTailSelectedOne.getLayoutParams().height = convertToDp(scaler);
        DisplayBodySelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEarsSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayEyesSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        DisplayTailSelectedOne.setScaleType(ImageButton.ScaleType.FIT_XY);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        DisplayBodySelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        DisplayEarsSelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        DisplayEyesSelectedOne.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        DisplayTailSelectedOne.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));

        DisplayTailOne.setVisibility(View.INVISIBLE);
        DisplayEyesOne.setVisibility(View.INVISIBLE);
        DisplayEarsOne.setVisibility(View.INVISIBLE);
        DisplayBodyOne.setVisibility(View.INVISIBLE);

        DisplayEyesTwo.setVisibility(View.INVISIBLE);
        DisplayEarsTwo.setVisibility(View.INVISIBLE);
        DisplayBodyTwo.setVisibility(View.INVISIBLE);

        DisplayEyesThree.setVisibility(View.INVISIBLE);
        DisplayEarsThree.setVisibility(View.INVISIBLE);
        DisplayBodyThree.setVisibility(View.INVISIBLE);

        DisplayEyesFour.setVisibility(View.INVISIBLE);
        DisplayEarsFour.setVisibility(View.INVISIBLE);
        DisplayBodyFour.setVisibility(View.INVISIBLE);

        DisplayEyesFive.setVisibility(View.INVISIBLE);
        DisplayEarsFive.setVisibility(View.INVISIBLE);
        DisplayBodyFive.setVisibility(View.INVISIBLE);

        DisplayEyesSix.setVisibility(View.INVISIBLE);
        DisplayEarsSix.setVisibility(View.INVISIBLE);
        DisplayBodySix.setVisibility(View.INVISIBLE);

        DisplayEyesSeven.setVisibility(View.INVISIBLE);
        DisplayEarsSeven.setVisibility(View.INVISIBLE);
        DisplayBodySeven.setVisibility(View.INVISIBLE);

        DisplayEyesEight.setVisibility(View.INVISIBLE);
        DisplayEarsEight.setVisibility(View.INVISIBLE);
        DisplayBodyEight.setVisibility(View.INVISIBLE);


        DisplayTailOne.setVisibility(View.INVISIBLE);
        DisplayTailTwo.setVisibility(View.INVISIBLE);
        DisplayTailThree.setVisibility(View.INVISIBLE);
        DisplayTailFour.setVisibility(View.INVISIBLE);
        DisplayTailFive.setVisibility(View.INVISIBLE);
        DisplayTailSix.setVisibility(View.INVISIBLE);
        DisplayTailSeven.setVisibility(View.INVISIBLE);;
        DisplayTailEight.setVisibility(View.INVISIBLE);


        DisplayEyesNine.setVisibility(View.INVISIBLE);
        DisplayEarsNine.setVisibility(View.INVISIBLE);
        DisplayBodyNine.setVisibility(View.INVISIBLE);
        DisplayTailNine.setVisibility(View.INVISIBLE);

        DisplayEyesTen.setVisibility(View.INVISIBLE);
        DisplayEarsTen.setVisibility(View.INVISIBLE);
        DisplayBodyTen.setVisibility(View.INVISIBLE);
        DisplayTailTen.setVisibility(View.INVISIBLE);

        DisplayEyesEleven.setVisibility(View.INVISIBLE);
        DisplayEarsEleven.setVisibility(View.INVISIBLE);
        DisplayBodyEleven.setVisibility(View.INVISIBLE);
        DisplayTailEleven.setVisibility(View.INVISIBLE);

        DisplayEyesTwelve.setVisibility(View.INVISIBLE);
        DisplayEarsTwelve.setVisibility(View.INVISIBLE);
        DisplayBodyTwelve.setVisibility(View.INVISIBLE);
        DisplayTailTwelve.setVisibility(View.INVISIBLE);

        DisplayEyesThirteen.setVisibility(View.INVISIBLE);
        DisplayEarsThirteen.setVisibility(View.INVISIBLE);
        DisplayBodyThirteen.setVisibility(View.INVISIBLE);
        DisplayTailThirteen.setVisibility(View.INVISIBLE);

        DisplayEyesFourteen.setVisibility(View.INVISIBLE);
        DisplayEarsFourteen.setVisibility(View.INVISIBLE);
        DisplayBodyFourteen.setVisibility(View.INVISIBLE);
        DisplayTailFourteen.setVisibility(View.INVISIBLE);

        DisplayEyesFifteen.setVisibility(View.INVISIBLE);
        DisplayEarsFifteen.setVisibility(View.INVISIBLE);
        DisplayBodyFifteen.setVisibility(View.INVISIBLE);
        DisplayTailFifteen.setVisibility(View.INVISIBLE);

        DisplayEyesSixteen.setVisibility(View.INVISIBLE);
        DisplayEarsSixteen.setVisibility(View.INVISIBLE);
        DisplayBodySixteen.setVisibility(View.INVISIBLE);
        DisplayTailSixteen.setVisibility(View.INVISIBLE);

        HideDisplayButtons();


        DisplayEyesSelectedOne.setVisibility(View.VISIBLE);
        DisplayEarsSelectedOne.setVisibility(View.VISIBLE);
        DisplayBodySelectedOne.setVisibility(View.VISIBLE);
        DisplayTailSelectedOne.setVisibility(View.VISIBLE);
    }



    public void ButtonViewMethod(HareSplitting.Hare Escape, ImageView BodyView, ImageView EarsView, ImageView EyesView, ImageView TailView, FrameLayout Frames) {
      
        if (Escape == null){

            BodyView.setImageResource(R.drawable.noerror);
            EarsView.setImageResource(R.drawable.noerror);
            EyesView.setImageResource(R.drawable.noerror);
            TailView.setImageResource(R.drawable.noerror);
            BodyView.setVisibility(View.INVISIBLE);
            EarsView.setVisibility(View.INVISIBLE);
            EyesView.setVisibility(View.INVISIBLE);
            TailView.setVisibility(View.INVISIBLE);

            return;
        }


        BodyView.setVisibility(View.VISIBLE);
        EarsView.setVisibility(View.VISIBLE);
        EyesView.setVisibility(View.VISIBLE);
        TailView.setVisibility(View.VISIBLE);

        BodyView.setImageResource(Bodies[Escape.BodyType]);
        EarsView.setImageResource(Ears[Escape.EarsType]);
        EyesView.setImageResource(Eyes[Escape.EyesType]);
        TailView.setImageResource(Tail[Escape.TailType]);

        int scaler = (100*Escape.size)/150;
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) Frames.getLayoutParams();
        EarsView.requestLayout();
        EyesView.requestLayout();
        BodyView.requestLayout();
        TailView.requestLayout();
        EarsView.getLayoutParams().height = convertToDp(scaler);
        EarsView.getLayoutParams().width = convertToDp(scaler);
        params.height = convertToDp(scaler);
        params.width = convertToDp(scaler);
        EyesView.getLayoutParams().width = convertToDp(scaler);
        EyesView.getLayoutParams().height = convertToDp(scaler);
        BodyView.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        TailView.setScaleType(ImageButton.ScaleType.FIT_XY);
        EarsView.setScaleType(ImageButton.ScaleType.FIT_XY);
        EyesView.setScaleType(ImageButton.ScaleType.FIT_XY);
        int Red = ((Escape.At * 16) + Escape.Bt);
        int Green = ((Escape.Ct * 16) + Escape.Dt);
        int Blue = ((Escape.Et * 16) + Escape.Ft);
        BodyView.setColorFilter(Color.argb(Escape.HareAlpha, Red, Green, Blue));


        int Rede1 = ((Escape.earAt * 16) + Escape.earBt);
        int Greene1 = ((Escape.earCt * 16) + Escape.earDt);
        int Bluee1 = ((Escape.earEt * 16) + Escape.earFt);
        EarsView.setColorFilter(Color.argb(Escape.HareAlpha, Rede1, Greene1, Bluee1));

        int Rede2 = ((Escape.eyeAt * 16) + Escape.eyeBt);
        int Greene2 = ((Escape.eyeCt * 16) + Escape.eyeDt);
        int Bluee2 = ((Escape.eyeEt * 16) + Escape.eyeFt);
        EyesView.setColorFilter(Color.argb(Escape.HareAlpha, Rede2, Greene2, Bluee2));


        int RedT = ((Escape.tailAt * 16) + Escape.tailBt);
        int GreenT = ((Escape.tailCt * 16) + Escape.tailDt);
        int BlueT = ((Escape.tailEt * 16) + Escape.tailFt);
        TailView.setColorFilter(Color.argb(Escape.TailAlpha, RedT, GreenT, BlueT));
  
    }

    public void ButtonImageScalerOne(HareSplitting.Hare Escape){

        FrameLayout DisplayBabyOneButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyOneButtonFrame);
      
        ButtonViewMethod(Escape, DisplayBodyOne, DisplayEarsOne, DisplayEyesOne, DisplayTailOne,DisplayBabyOneButtonFrame);

        BabyButtonOneSelecterHare = Escape;

    }
    public void ButtonImageScalerTwo(HareSplitting.Hare Escape){



        FrameLayout DisplayBabyTwoButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTwoButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyTwo, DisplayEarsTwo, DisplayEyesTwo, DisplayTailTwo, DisplayBabyTwoButtonFrame);
        BabyButtonTwoSelecterHare = Escape;

    }


    public void ButtonImageScalerThree(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyThreeButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyThreeButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyThree, DisplayEarsThree, DisplayEyesThree, DisplayTailThree, DisplayBabyThreeButtonFrame);

        BabyButtonThreeSelecterHare = Escape;

    }
    public void ButtonImageScalerFour(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyFourButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFourButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyFour, DisplayEarsFour, DisplayEyesFour, DisplayTailFour, DisplayBabyFourButtonFrame);
        BabyButtonFourSelecterHare = Escape;

    }
    public void ButtonImageScalerFive(HareSplitting.Hare Escape){



        FrameLayout DisplayBabyFiveButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFiveButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyFive, DisplayEarsFive, DisplayEyesFive, DisplayTailFive, DisplayBabyFiveButtonFrame);
        BabyButtonFiveSelecterHare = Escape;
    }
    public void ButtonImageScalerSix(HareSplitting.Hare Escape){


        FrameLayout DisplayBabySixButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySixButtonFrame);

        ButtonViewMethod(Escape, DisplayBodySix, DisplayEarsSix, DisplayEyesSix, DisplayTailSix, DisplayBabySixButtonFrame);
        BabyButtonSixSelecterHare = Escape;
    }
    public void ButtonImageScalerSeven(HareSplitting.Hare Escape){


        FrameLayout DisplayBabySevenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySevenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodySeven, DisplayEarsSeven, DisplayEyesSeven, DisplayTailSeven, DisplayBabySevenButtonFrame);
        BabyButtonSevenSelecterHare = Escape;

    }
    
    
    
    public void ButtonImageScalerEight(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyEightButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyEightButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyEight, DisplayEarsEight, DisplayEyesEight, DisplayTailEight, DisplayBabyEightButtonFrame);
        BabyButtonEightSelecterHare = Escape;

    }


    public void ButtonImageScalerNine(HareSplitting.Hare Escape){



        FrameLayout DisplayBabyNineButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyNineButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyNine, DisplayEarsNine, DisplayEyesNine, DisplayTailNine, DisplayBabyNineButtonFrame);
        BabyButtonNineSelecterHare = Escape;
    }
    
    public void ButtonImageScalerTen(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyTenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyTen, DisplayEarsTen, DisplayEyesTen, DisplayTailTen, DisplayBabyTenButtonFrame);
        BabyButtonTenSelecterHare = Escape;

    }
    public void ButtonImageScalerEleven(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyElevenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyElevenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyEleven, DisplayEarsEleven, DisplayEyesEleven, DisplayTailEleven, DisplayBabyElevenButtonFrame);
        BabyButtonElevenSelecterHare = Escape;

    }
    public void ButtonImageScalerTwelve(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyTwelveButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyTwelveButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyTwelve, DisplayEarsTwelve, DisplayEyesTwelve, DisplayTailTwelve, DisplayBabyTwelveButtonFrame);
        BabyButtonTwelveSelecterHare = Escape;
    }
    public void ButtonImageScalerThirteen(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyThirteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyThirteenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyThirteen, DisplayEarsThirteen, DisplayEyesThirteen, DisplayTailThirteen, DisplayBabyThirteenButtonFrame);
        BabyButtonThirteenSelecterHare = Escape;

    }
    public void ButtonImageScalerFourteen(HareSplitting.Hare Escape){


        FrameLayout DisplayBabyFourteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFourteenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyFourteen, DisplayEarsFourteen, DisplayEyesFourteen, DisplayTailFourteen, DisplayBabyFourteenButtonFrame);
        BabyButtonFourteenSelecterHare = Escape;

    }

    public void ButtonImageScalerFifteen(HareSplitting.Hare Escape){



        FrameLayout DisplayBabyFifteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabyFifteenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodyFifteen, DisplayEarsFifteen, DisplayEyesFifteen, DisplayTailFifteen, DisplayBabyFifteenButtonFrame);
        BabyButtonFifteenSelecterHare = Escape;

    }
    public void ButtonImageScalerSixteen(HareSplitting.Hare Escape){



        FrameLayout DisplayBabySixteenButtonFrame = (FrameLayout) findViewById(R.id.DisplayBabySixteenButtonFrame);

        ButtonViewMethod(Escape, DisplayBodySixteen, DisplayEarsSixteen, DisplayEyesSixteen, DisplayTailSixteen, DisplayBabySixteenButtonFrame);
        BabyButtonSixteenSelecterHare = Escape;

    }

    public int convertToDp(int input) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (input * scale + 0.5f);
    }


    protected void onSaveInstanceState(Bundle HareCatcher) {
        super.onSaveInstanceState(HareCatcher);
        Log.i("Instance state", "onSaveInstanceState");

    }

    protected void onRestoreInstanceState(Bundle HareCatcher) {
        super.onSaveInstanceState(HareCatcher);
        Log.i("Instance state", "onRestoreInstanceState");

    }

    public void onBackPressed(HareSplitting.Hare NewHairy){

        int NewHairySize = NewHairy.size;
        int NewHairyAT = NewHairy.At;
        int NewHairyBT = NewHairy.Bt;
        int NewHairyCT = NewHairy.Ct;
        int NewHairyDT = NewHairy.Dt;
        int NewHairyET = NewHairy.Et;
        int NewHairyFT = NewHairy.Ft;
        int NewHairyAT0 = NewHairy.At0;
        int NewHairyBT0 = NewHairy.Bt0;
        int NewHairyCT0 = NewHairy.Ct0;
        int NewHairyDT0 = NewHairy.Dt0;
        int NewHairyET0 = NewHairy.Et0;
        int NewHairyFT0 = NewHairy.Ft0;
        int NewHairyAT1 = NewHairy.At1;
        int NewHairyBT1 = NewHairy.Bt1;
        int NewHairyCT1 = NewHairy.Ct1;
        int NewHairyDT1 = NewHairy.Dt1;
        int NewHairyET1 = NewHairy.Et1;
        int NewHairyFT1 = NewHairy.Ft1;
        int NewHairyAT2 = NewHairy.At2;
        int NewHairyBT2 = NewHairy.Bt2;
        int NewHairyCT2 = NewHairy.Ct2;
        int NewHairyDT2 = NewHairy.Dt2;
        int NewHairyET2 = NewHairy.Et2;
        int NewHairyFT2 = NewHairy.Ft2;
        int NewHairyAT3 = NewHairy.At3;
        int NewHairyBT3 = NewHairy.Bt3;
        int NewHairyCT3 = NewHairy.Ct3;
        int NewHairyDT3 = NewHairy.Dt3;
        int NewHairyET3 = NewHairy.Et3;
        int NewHairyFT3 = NewHairy.Ft3;
        int NewHairyAT4 = NewHairy.At4;
        int NewHairyBT4 = NewHairy.Bt4;
        int NewHairyCT4 = NewHairy.Ct4;
        int NewHairyDT4 = NewHairy.Dt4;
        int NewHairyET4 = NewHairy.Et4;
        int NewHairyFT4 = NewHairy.Ft4;
        int NewHairyearAT = NewHairy.earAt;
        int NewHairyearBT = NewHairy.earBt;
        int NewHairyearCT = NewHairy.earCt;
        int NewHairyearDT = NewHairy.earDt;
        int NewHairyearET = NewHairy.earEt;
        int NewHairyearFT = NewHairy.earFt;
        int NewHairyeyeAT = NewHairy.eyeAt;
        int NewHairyeyeBT = NewHairy.eyeBt;
        int NewHairyeyeCT = NewHairy.eyeCt;
        int NewHairyeyeDT = NewHairy.eyeDt;
        int NewHairyeyeET = NewHairy.eyeEt;
        int NewHairyeyeFT = NewHairy.eyeFt;
        int NewHairytailAT = NewHairy.tailAt;
        int NewHairytailBT = NewHairy.tailBt;
        int NewHairytailCT = NewHairy.tailCt;
        int NewHairytailDT = NewHairy.tailDt;
        int NewHairytailET = NewHairy.tailEt;
        int NewHairytailFT = NewHairy.tailFt;
        int NewHairyearAT0 = NewHairy.earAt0;
        int NewHairyearBT0 = NewHairy.earBt0;
        int NewHairyearCT0 = NewHairy.earCt0;
        int NewHairyearDT0 = NewHairy.earDt0;
        int NewHairyearET0 = NewHairy.earEt0;
        int NewHairyearFT0 = NewHairy.earFt0;
        int NewHairyeyeAT0 = NewHairy.eyeAt0;
        int NewHairyeyeBT0 = NewHairy.eyeBt0;
        int NewHairyeyeCT0 = NewHairy.eyeCt0;
        int NewHairyeyeDT0 = NewHairy.eyeDt0;
        int NewHairyeyeET0 = NewHairy.eyeEt0;
        int NewHairyeyeFT0 = NewHairy.eyeFt0;
        int NewHairytailAT0 = NewHairy.tailAt0;
        int NewHairytailBT0 = NewHairy.tailBt0;
        int NewHairytailCT0 = NewHairy.tailCt0;
        int NewHairytailDT0 = NewHairy.tailDt0;
        int NewHairytailET0 = NewHairy.tailEt0;
        int NewHairytailFT0 = NewHairy.tailFt0;
        int NewHairyearAT1 = NewHairy.earAt1;
        int NewHairyearBT1 = NewHairy.earBt1;
        int NewHairyearCT1 = NewHairy.earCt1;
        int NewHairyearDT1 = NewHairy.earDt1;
        int NewHairyearET1 = NewHairy.earEt1;
        int NewHairyearFT1 = NewHairy.earFt1;
        int NewHairyeyeAT1 = NewHairy.eyeAt1;
        int NewHairyeyeBT1 = NewHairy.eyeBt1;
        int NewHairyeyeCT1 = NewHairy.eyeCt1;
        int NewHairyeyeDT1 = NewHairy.eyeDt1;
        int NewHairyeyeET1 = NewHairy.eyeEt1;
        int NewHairyeyeFT1 = NewHairy.eyeFt1;
        int NewHairytailAT1 = NewHairy.tailAt1;
        int NewHairytailBT1 = NewHairy.tailBt1;
        int NewHairytailCT1 = NewHairy.tailCt1;
        int NewHairytailDT1 = NewHairy.tailDt1;
        int NewHairytailET1 = NewHairy.tailEt1;
        int NewHairytailFT1 = NewHairy.tailFt1;
        int NewHairyearAT2 = NewHairy.earAt2;
        int NewHairyearBT2 = NewHairy.earBt2;
        int NewHairyearCT2 = NewHairy.earCt2;
        int NewHairyearDT2 = NewHairy.earDt2;
        int NewHairyearET2 = NewHairy.earEt2;
        int NewHairyearFT2 = NewHairy.earFt2;
        int NewHairyeyeAT2 = NewHairy.eyeAt2;
        int NewHairyeyeBT2 = NewHairy.eyeBt2;
        int NewHairyeyeCT2 = NewHairy.eyeCt2;
        int NewHairyeyeDT2 = NewHairy.eyeDt2;
        int NewHairyeyeET2 = NewHairy.eyeEt2;
        int NewHairyeyeFT2 = NewHairy.eyeFt2;
        int NewHairytailAT2 = NewHairy.tailAt2;
        int NewHairytailBT2 = NewHairy.tailBt2;
        int NewHairytailCT2 = NewHairy.tailCt2;
        int NewHairytailDT2 = NewHairy.tailDt2;
        int NewHairytailET2 = NewHairy.tailEt2;
        int NewHairytailFT2 = NewHairy.tailFt2;
        int NewHairyearAT3 = NewHairy.earAt3;
        int NewHairyearBT3 = NewHairy.earBt3;
        int NewHairyearCT3 = NewHairy.earCt3;
        int NewHairyearDT3 = NewHairy.earDt3;
        int NewHairyearET3 = NewHairy.earEt3;
        int NewHairyearFT3 = NewHairy.earFt3;
        int NewHairyeyeAT3 = NewHairy.eyeAt3;
        int NewHairyeyeBT3 = NewHairy.eyeBt3;
        int NewHairyeyeCT3 = NewHairy.eyeCt3;
        int NewHairyeyeDT3 = NewHairy.eyeDt3;
        int NewHairyeyeET3 = NewHairy.eyeEt3;
        int NewHairyeyeFT3 = NewHairy.eyeFt3;
        int NewHairytailAT3 = NewHairy.tailAt3;
        int NewHairytailBT3 = NewHairy.tailBt3;
        int NewHairytailCT3 = NewHairy.tailCt3;
        int NewHairytailDT3 = NewHairy.tailDt3;
        int NewHairytailET3 = NewHairy.tailEt3;
        int NewHairytailFT3 = NewHairy.tailFt3;
        int NewHairyearAT4 = NewHairy.earAt4;
        int NewHairyearBT4 = NewHairy.earBt4;
        int NewHairyearCT4 = NewHairy.earCt4;
        int NewHairyearDT4 = NewHairy.earDt4;
        int NewHairyearET4 = NewHairy.earEt4;
        int NewHairyearFT4 = NewHairy.earFt4;
        int NewHairyeyeAT4 = NewHairy.eyeAt4;
        int NewHairyeyeBT4 = NewHairy.eyeBt4;
        int NewHairyeyeCT4 = NewHairy.eyeCt4;
        int NewHairyeyeDT4 = NewHairy.eyeDt4;
        int NewHairyeyeET4 = NewHairy.eyeEt4;
        int NewHairyeyeFT4 = NewHairy.eyeFt4;
        int NewHairytailAT4 = NewHairy.tailAt4;
        int NewHairytailBT4 = NewHairy.tailBt4;
        int NewHairytailCT4 = NewHairy.tailCt4;
        int NewHairytailDT4 = NewHairy.tailDt4;
        int NewHairytailET4 = NewHairy.tailEt4;
        int NewHairytailFT4 = NewHairy.tailFt4;


        String NewHairySex = NewHairy.Sex;
        String NewHairyColor = NewHairy.Color;
        int NewHairyHareAlpha = NewHairy.HareAlpha;
        int NewHairyTailAlpha = NewHairy.TailAlpha;
        int NewHairyBodyType = NewHairy.BodyType;
        int NewHairyEarsType = NewHairy.EarsType;
        int NewHairyEarsLength = NewHairy.EarsLength;
        int NewHairyEyesType =  NewHairy.EyesType;
        int NewHairyTailType =  NewHairy.TailType;
        double NewHairyPrice = NewHairy.Price;
        
        
        
        Intent F = new Intent();
        F.putExtra("Hairysize", NewHairySize);
        F.putExtra("HairyAT", NewHairyAT);
        F.putExtra("HairyBT", NewHairyBT);
        F.putExtra("HairyCT", NewHairyCT);
        F.putExtra("HairyDT", NewHairyDT);
        F.putExtra("HairyET", NewHairyET);
        F.putExtra("HairyFT", NewHairyFT);
        F.putExtra("HairyAT0", NewHairyAT0);
        F.putExtra("HairyBT0", NewHairyBT0);
        F.putExtra("HairyCT0", NewHairyCT0);
        F.putExtra("HairyDT0", NewHairyDT0);
        F.putExtra("HairyET0", NewHairyET0);
        F.putExtra("HairyFT0", NewHairyFT0);
        F.putExtra("HairyAT1", NewHairyAT1);
        F.putExtra("HairyBT1", NewHairyBT1);
        F.putExtra("HairyCT1", NewHairyCT1);
        F.putExtra("HairyDT1", NewHairyDT1);
        F.putExtra("HairyET1", NewHairyET1);
        F.putExtra("HairyFT1", NewHairyFT1);
        F.putExtra("HairyAT2", NewHairyAT2);
        F.putExtra("HairyBT2", NewHairyBT2);
        F.putExtra("HairyCT2", NewHairyCT2);
        F.putExtra("HairyDT2", NewHairyDT2);
        F.putExtra("HairyET2", NewHairyET2);
        F.putExtra("HairyFT2", NewHairyFT2);
        F.putExtra("HairyAT3", NewHairyAT3);
        F.putExtra("HairyBT3", NewHairyBT3);
        F.putExtra("HairyCT3", NewHairyCT3);
        F.putExtra("HairyDT3", NewHairyDT3);
        F.putExtra("HairyET3", NewHairyET3);
        F.putExtra("HairyFT3", NewHairyFT3);
        F.putExtra("HairyAT4", NewHairyAT4);
        F.putExtra("HairyBT4", NewHairyBT4);
        F.putExtra("HairyCT4", NewHairyCT4);
        F.putExtra("HairyDT4", NewHairyDT4);
        F.putExtra("HairyET4", NewHairyET4);
        F.putExtra("HairyFT4", NewHairyFT4);
        F.putExtra("HairyearAT", NewHairyearAT);
        F.putExtra("HairyearBT", NewHairyearBT);
        F.putExtra("HairyearCT", NewHairyearCT);
        F.putExtra("HairyearDT", NewHairyearDT);
        F.putExtra("HairyearET", NewHairyearET);
        F.putExtra("HairyearFT", NewHairyearFT);
        F.putExtra("HairyeyeAT", NewHairyeyeAT);
        F.putExtra("HairyeyeBT", NewHairyeyeBT);
        F.putExtra("HairyeyeCT", NewHairyeyeCT);
        F.putExtra("HairyeyeDT", NewHairyeyeDT);
        F.putExtra("HairyeyeET", NewHairyeyeET);
        F.putExtra("HairyeyeFT", NewHairyeyeFT);
        F.putExtra("HairytailAT", NewHairytailAT);
        F.putExtra("HairytailBT", NewHairytailBT);
        F.putExtra("HairytailCT", NewHairytailCT);
        F.putExtra("HairytailDT", NewHairytailDT);
        F.putExtra("HairytailET", NewHairytailET);
        F.putExtra("HairytailFT", NewHairytailFT);
        F.putExtra("HairyearAT0", NewHairyearAT0);
        F.putExtra("HairyearBT0", NewHairyearBT0);
        F.putExtra("HairyearCT0", NewHairyearCT0);
        F.putExtra("HairyearDT0", NewHairyearDT0);
        F.putExtra("HairyearET0", NewHairyearET0);
        F.putExtra("HairyearFT0", NewHairyearFT0);
        F.putExtra("HairyeyeAT0", NewHairyeyeAT0);
        F.putExtra("HairyeyeBT0", NewHairyeyeBT0);
        F.putExtra("HairyeyeCT0", NewHairyeyeCT0);
        F.putExtra("HairyeyeDT0", NewHairyeyeDT0);
        F.putExtra("HairyeyeET0", NewHairyeyeET0);
        F.putExtra("HairyeyeFT0", NewHairyeyeFT0);
        F.putExtra("HairytailAT0", NewHairytailAT0);
        F.putExtra("HairytailBT0", NewHairytailBT0);
        F.putExtra("HairytailCT0", NewHairytailCT0);
        F.putExtra("HairytailDT0", NewHairytailDT0);
        F.putExtra("HairytailET0", NewHairytailET0);
        F.putExtra("HairytailFT0", NewHairytailFT0);
        F.putExtra("HairyearAT1", NewHairyearAT1);
        F.putExtra("HairyearBT1", NewHairyearBT1);
        F.putExtra("HairyearCT1", NewHairyearCT1);
        F.putExtra("HairyearDT1", NewHairyearDT1);
        F.putExtra("HairyearET1", NewHairyearET1);
        F.putExtra("HairyearFT1", NewHairyearFT1);
        F.putExtra("HairyeyeAT1", NewHairyeyeAT1);
        F.putExtra("HairyeyeBT1", NewHairyeyeBT1);
        F.putExtra("HairyeyeCT1", NewHairyeyeCT1);
        F.putExtra("HairyeyeDT1", NewHairyeyeDT1);
        F.putExtra("HairyeyeET1", NewHairyeyeET1);
        F.putExtra("HairyeyeFT1", NewHairyeyeFT1);
        F.putExtra("HairytailAT1", NewHairytailAT1);
        F.putExtra("HairytailBT1", NewHairytailBT1);
        F.putExtra("HairytailCT1", NewHairytailCT1);
        F.putExtra("HairytailDT1", NewHairytailDT1);
        F.putExtra("HairytailET1", NewHairytailET1);
        F.putExtra("HairytailFT1", NewHairytailFT1);
        F.putExtra("HairyearAT2", NewHairyearAT2);
        F.putExtra("HairyearBT2", NewHairyearBT2);
        F.putExtra("HairyearCT2", NewHairyearCT2);
        F.putExtra("HairyearDT2", NewHairyearDT2);
        F.putExtra("HairyearET2", NewHairyearET2);
        F.putExtra("HairyearFT2", NewHairyearFT2);
        F.putExtra("HairyeyeAT2", NewHairyeyeAT2);
        F.putExtra("HairyeyeBT2", NewHairyeyeBT2);
        F.putExtra("HairyeyeCT2", NewHairyeyeCT2);
        F.putExtra("HairyeyeDT2", NewHairyeyeDT2);
        F.putExtra("HairyeyeET2", NewHairyeyeET2);
        F.putExtra("HairyeyeFT2", NewHairyeyeFT2);
        F.putExtra("HairytailAT2", NewHairytailAT2);
        F.putExtra("HairytailBT2", NewHairytailBT2);
        F.putExtra("HairytailCT2", NewHairytailCT2);
        F.putExtra("HairytailDT2", NewHairytailDT2);
        F.putExtra("HairytailET2", NewHairytailET2);
        F.putExtra("HairytailFT2", NewHairytailFT2);
        F.putExtra("HairyearAT3", NewHairyearAT3);
        F.putExtra("HairyearBT3", NewHairyearBT3);
        F.putExtra("HairyearCT3", NewHairyearCT3);
        F.putExtra("HairyearDT3", NewHairyearDT3);
        F.putExtra("HairyearET3", NewHairyearET3);
        F.putExtra("HairyearFT3", NewHairyearFT3);
        F.putExtra("HairyeyeAT3", NewHairyeyeAT3);
        F.putExtra("HairyeyeBT3", NewHairyeyeBT3);
        F.putExtra("HairyeyeCT3", NewHairyeyeCT3);
        F.putExtra("HairyeyeDT3", NewHairyeyeDT3);
        F.putExtra("HairyeyeET3", NewHairyeyeET3);
        F.putExtra("HairyeyeFT3", NewHairyeyeFT3);
        F.putExtra("HairytailAT3", NewHairytailAT3);
        F.putExtra("HairytailBT3", NewHairytailBT3);
        F.putExtra("HairytailCT3", NewHairytailCT3);
        F.putExtra("HairytailDT3", NewHairytailDT3);
        F.putExtra("HairytailET3", NewHairytailET3);
        F.putExtra("HairytailFT3", NewHairytailFT3);
        F.putExtra("HairyearAT4", NewHairyearAT4);
        F.putExtra("HairyearBT4", NewHairyearBT4);
        F.putExtra("HairyearCT4", NewHairyearCT4);
        F.putExtra("HairyearDT4", NewHairyearDT4);
        F.putExtra("HairyearET4", NewHairyearET4);
        F.putExtra("HairyearFT4", NewHairyearFT4);
        F.putExtra("HairyeyeAT4", NewHairyeyeAT4);
        F.putExtra("HairyeyeBT4", NewHairyeyeBT4);
        F.putExtra("HairyeyeCT4", NewHairyeyeCT4);
        F.putExtra("HairyeyeDT4", NewHairyeyeDT4);
        F.putExtra("HairyeyeET4", NewHairyeyeET4);
        F.putExtra("HairyeyeFT4", NewHairyeyeFT4);
        F.putExtra("HairytailAT4", NewHairytailAT4);
        F.putExtra("HairytailBT4", NewHairytailBT4);
        F.putExtra("HairytailCT4", NewHairytailCT4);
        F.putExtra("HairytailDT4", NewHairytailDT4);
        F.putExtra("HairytailET4", NewHairytailET4);
        F.putExtra("HairytailFT4", NewHairytailFT4);
        F.putExtra("HairySex", NewHairySex);
        F.putExtra("HairyColor", NewHairyColor);
        F.putExtra("HairyHareAlpha", NewHairyHareAlpha);
        F.putExtra("HairyTailAlpha", NewHairyTailAlpha);
        F.putExtra("HairyBodyType", NewHairyBodyType);
        F.putExtra("HairyEarsType", NewHairyEarsType);
        F.putExtra("HairyTailType", NewHairyTailType);
        F.putExtra("HairyEarsLength", NewHairyEarsLength);
        F.putExtra("HairyEyesType", NewHairyEyesType);
        F.putExtra("HairyPrice", NewHairyPrice);



        setResult(RESULT_OK, F);
        finish();
    }

    public void onSmackPressed(HareSplitting.Hare NewLola){



        int NewLolaSize = NewLola.size;
        int NewLolaAT = NewLola.At;
        int NewLolaBT = NewLola.Bt;
        int NewLolaCT = NewLola.Ct;
        int NewLolaDT = NewLola.Dt;
        int NewLolaET = NewLola.Et;
        int NewLolaFT = NewLola.Ft;
        int NewLolaAT0 = NewLola.At0;
        int NewLolaBT0 = NewLola.Bt0;
        int NewLolaCT0 = NewLola.Ct0;
        int NewLolaDT0 = NewLola.Dt0;
        int NewLolaET0 = NewLola.Et0;
        int NewLolaFT0 = NewLola.Ft0;
        int NewLolaAT1 = NewLola.At1;
        int NewLolaBT1 = NewLola.Bt1;
        int NewLolaCT1 = NewLola.Ct1;
        int NewLolaDT1 = NewLola.Dt1;
        int NewLolaET1 = NewLola.Et1;
        int NewLolaFT1 = NewLola.Ft1;
        int NewLolaAT2 = NewLola.At2;
        int NewLolaBT2 = NewLola.Bt2;
        int NewLolaCT2 = NewLola.Ct2;
        int NewLolaDT2 = NewLola.Dt2;
        int NewLolaET2 = NewLola.Et2;
        int NewLolaFT2 = NewLola.Ft2;
        int NewLolaAT3 = NewLola.At3;
        int NewLolaBT3 = NewLola.Bt3;
        int NewLolaCT3 = NewLola.Ct3;
        int NewLolaDT3 = NewLola.Dt3;
        int NewLolaET3 = NewLola.Et3;
        int NewLolaFT3 = NewLola.Ft3;
        int NewLolaAT4 = NewLola.At4;
        int NewLolaBT4 = NewLola.Bt4;
        int NewLolaCT4 = NewLola.Ct4;
        int NewLolaDT4 = NewLola.Dt4;
        int NewLolaET4 = NewLola.Et4;
        int NewLolaFT4 = NewLola.Ft4;
        int NewLolaearAT = NewLola.earAt;
        int NewLolaearBT = NewLola.earBt;
        int NewLolaearCT = NewLola.earCt;
        int NewLolaearDT = NewLola.earDt;
        int NewLolaearET = NewLola.earEt;
        int NewLolaearFT = NewLola.earFt;
        int NewLolaeyeAT = NewLola.eyeAt;
        int NewLolaeyeBT = NewLola.eyeBt;
        int NewLolaeyeCT = NewLola.eyeCt;
        int NewLolaeyeDT = NewLola.eyeDt;
        int NewLolaeyeET = NewLola.eyeEt;
        int NewLolaeyeFT = NewLola.eyeFt;
        int NewLolatailAT = NewLola.tailAt;
        int NewLolatailBT = NewLola.tailBt;
        int NewLolatailCT = NewLola.tailCt;
        int NewLolatailDT = NewLola.tailDt;
        int NewLolatailET = NewLola.tailEt;
        int NewLolatailFT = NewLola.tailFt;
        int NewLolaearAT0 = NewLola.earAt0;
        int NewLolaearBT0 = NewLola.earBt0;
        int NewLolaearCT0 = NewLola.earCt0;
        int NewLolaearDT0 = NewLola.earDt0;
        int NewLolaearET0 = NewLola.earEt0;
        int NewLolaearFT0 = NewLola.earFt0;
        int NewLolaeyeAT0 = NewLola.eyeAt0;
        int NewLolaeyeBT0 = NewLola.eyeBt0;
        int NewLolaeyeCT0 = NewLola.eyeCt0;
        int NewLolaeyeDT0 = NewLola.eyeDt0;
        int NewLolaeyeET0 = NewLola.eyeEt0;
        int NewLolaeyeFT0 = NewLola.eyeFt0;
        int NewLolatailAT0 = NewLola.tailAt0;
        int NewLolatailBT0 = NewLola.tailBt0;
        int NewLolatailCT0 = NewLola.tailCt0;
        int NewLolatailDT0 = NewLola.tailDt0;
        int NewLolatailET0 = NewLola.tailEt0;
        int NewLolatailFT0 = NewLola.tailFt0;
        int NewLolaearAT1 = NewLola.earAt1;
        int NewLolaearBT1 = NewLola.earBt1;
        int NewLolaearCT1 = NewLola.earCt1;
        int NewLolaearDT1 = NewLola.earDt1;
        int NewLolaearET1 = NewLola.earEt1;
        int NewLolaearFT1 = NewLola.earFt1;
        int NewLolaeyeAT1 = NewLola.eyeAt1;
        int NewLolaeyeBT1 = NewLola.eyeBt1;
        int NewLolaeyeCT1 = NewLola.eyeCt1;
        int NewLolaeyeDT1 = NewLola.eyeDt1;
        int NewLolaeyeET1 = NewLola.eyeEt1;
        int NewLolaeyeFT1 = NewLola.eyeFt1;
        int NewLolatailAT1 = NewLola.tailAt1;
        int NewLolatailBT1 = NewLola.tailBt1;
        int NewLolatailCT1 = NewLola.tailCt1;
        int NewLolatailDT1 = NewLola.tailDt1;
        int NewLolatailET1 = NewLola.tailEt1;
        int NewLolatailFT1 = NewLola.tailFt1;
        int NewLolaearAT2 = NewLola.earAt2;
        int NewLolaearBT2 = NewLola.earBt2;
        int NewLolaearCT2 = NewLola.earCt2;
        int NewLolaearDT2 = NewLola.earDt2;
        int NewLolaearET2 = NewLola.earEt2;
        int NewLolaearFT2 = NewLola.earFt2;
        int NewLolaeyeAT2 = NewLola.eyeAt2;
        int NewLolaeyeBT2 = NewLola.eyeBt2;
        int NewLolaeyeCT2 = NewLola.eyeCt2;
        int NewLolaeyeDT2 = NewLola.eyeDt2;
        int NewLolaeyeET2 = NewLola.eyeEt2;
        int NewLolaeyeFT2 = NewLola.eyeFt2;
        int NewLolatailAT2 = NewLola.tailAt2;
        int NewLolatailBT2 = NewLola.tailBt2;
        int NewLolatailCT2 = NewLola.tailCt2;
        int NewLolatailDT2 = NewLola.tailDt2;
        int NewLolatailET2 = NewLola.tailEt2;
        int NewLolatailFT2 = NewLola.tailFt2;
        int NewLolaearAT3 = NewLola.earAt3;
        int NewLolaearBT3 = NewLola.earBt3;
        int NewLolaearCT3 = NewLola.earCt3;
        int NewLolaearDT3 = NewLola.earDt3;
        int NewLolaearET3 = NewLola.earEt3;
        int NewLolaearFT3 = NewLola.earFt3;
        int NewLolaeyeAT3 = NewLola.eyeAt3;
        int NewLolaeyeBT3 = NewLola.eyeBt3;
        int NewLolaeyeCT3 = NewLola.eyeCt3;
        int NewLolaeyeDT3 = NewLola.eyeDt3;
        int NewLolaeyeET3 = NewLola.eyeEt3;
        int NewLolaeyeFT3 = NewLola.eyeFt3;
        int NewLolatailAT3 = NewLola.tailAt3;
        int NewLolatailBT3 = NewLola.tailBt3;
        int NewLolatailCT3 = NewLola.tailCt3;
        int NewLolatailDT3 = NewLola.tailDt3;
        int NewLolatailET3 = NewLola.tailEt3;
        int NewLolatailFT3 = NewLola.tailFt3;
        int NewLolaearAT4 = NewLola.earAt4;
        int NewLolaearBT4 = NewLola.earBt4;
        int NewLolaearCT4 = NewLola.earCt4;
        int NewLolaearDT4 = NewLola.earDt4;
        int NewLolaearET4 = NewLola.earEt4;
        int NewLolaearFT4 = NewLola.earFt4;
        int NewLolaeyeAT4 = NewLola.eyeAt4;
        int NewLolaeyeBT4 = NewLola.eyeBt4;
        int NewLolaeyeCT4 = NewLola.eyeCt4;
        int NewLolaeyeDT4 = NewLola.eyeDt4;
        int NewLolaeyeET4 = NewLola.eyeEt4;
        int NewLolaeyeFT4 = NewLola.eyeFt4;
        int NewLolatailAT4 = NewLola.tailAt4;
        int NewLolatailBT4 = NewLola.tailBt4;
        int NewLolatailCT4 = NewLola.tailCt4;
        int NewLolatailDT4 = NewLola.tailDt4;
        int NewLolatailET4 = NewLola.tailEt4;
        int NewLolatailFT4 = NewLola.tailFt4;


        String NewLolaSex = NewLola.Sex;
        String NewLolaColor = NewLola.Color;
        int NewLolaHareAlpha = NewLola.HareAlpha;
        int NewLolaTailAlpha = NewLola.TailAlpha;
        int NewLolaBodyType = NewLola.BodyType;
        int NewLolaEarsType = NewLola.EarsType;
        int NewLolaEarsLength = NewLola.EarsLength;
        int NewLolaEyesType =  NewLola.EyesType;
        int NewLolaTailType =  NewLola.TailType;
        double NewLolaPrice = NewLola.Price;



        Intent F = new Intent();
        F.putExtra("Lolasize", NewLolaSize);
        F.putExtra("LolaAT", NewLolaAT);
        F.putExtra("LolaBT", NewLolaBT);
        F.putExtra("LolaCT", NewLolaCT);
        F.putExtra("LolaDT", NewLolaDT);
        F.putExtra("LolaET", NewLolaET);
        F.putExtra("LolaFT", NewLolaFT);
        F.putExtra("LolaAT0", NewLolaAT0);
        F.putExtra("LolaBT0", NewLolaBT0);
        F.putExtra("LolaCT0", NewLolaCT0);
        F.putExtra("LolaDT0", NewLolaDT0);
        F.putExtra("LolaET0", NewLolaET0);
        F.putExtra("LolaFT0", NewLolaFT0);
        F.putExtra("LolaAT1", NewLolaAT1);
        F.putExtra("LolaBT1", NewLolaBT1);
        F.putExtra("LolaCT1", NewLolaCT1);
        F.putExtra("LolaDT1", NewLolaDT1);
        F.putExtra("LolaET1", NewLolaET1);
        F.putExtra("LolaFT1", NewLolaFT1);
        F.putExtra("LolaAT2", NewLolaAT2);
        F.putExtra("LolaBT2", NewLolaBT2);
        F.putExtra("LolaCT2", NewLolaCT2);
        F.putExtra("LolaDT2", NewLolaDT2);
        F.putExtra("LolaET2", NewLolaET2);
        F.putExtra("LolaFT2", NewLolaFT2);
        F.putExtra("LolaAT3", NewLolaAT3);
        F.putExtra("LolaBT3", NewLolaBT3);
        F.putExtra("LolaCT3", NewLolaCT3);
        F.putExtra("LolaDT3", NewLolaDT3);
        F.putExtra("LolaET3", NewLolaET3);
        F.putExtra("LolaFT3", NewLolaFT3);
        F.putExtra("LolaAT4", NewLolaAT4);
        F.putExtra("LolaBT4", NewLolaBT4);
        F.putExtra("LolaCT4", NewLolaCT4);
        F.putExtra("LolaDT4", NewLolaDT4);
        F.putExtra("LolaET4", NewLolaET4);
        F.putExtra("LolaFT4", NewLolaFT4);
        F.putExtra("LolaearAT", NewLolaearAT);
        F.putExtra("LolaearBT", NewLolaearBT);
        F.putExtra("LolaearCT", NewLolaearCT);
        F.putExtra("LolaearDT", NewLolaearDT);
        F.putExtra("LolaearET", NewLolaearET);
        F.putExtra("LolaearFT", NewLolaearFT);
        F.putExtra("LolaeyeAT", NewLolaeyeAT);
        F.putExtra("LolaeyeBT", NewLolaeyeBT);
        F.putExtra("LolaeyeCT", NewLolaeyeCT);
        F.putExtra("LolaeyeDT", NewLolaeyeDT);
        F.putExtra("LolaeyeET", NewLolaeyeET);
        F.putExtra("LolaeyeFT", NewLolaeyeFT);
        F.putExtra("LolatailAT", NewLolatailAT);
        F.putExtra("LolatailBT", NewLolatailBT);
        F.putExtra("LolatailCT", NewLolatailCT);
        F.putExtra("LolatailDT", NewLolatailDT);
        F.putExtra("LolatailET", NewLolatailET);
        F.putExtra("LolatailFT", NewLolatailFT);
        F.putExtra("LolaearAT0", NewLolaearAT0);
        F.putExtra("LolaearBT0", NewLolaearBT0);
        F.putExtra("LolaearCT0", NewLolaearCT0);
        F.putExtra("LolaearDT0", NewLolaearDT0);
        F.putExtra("LolaearET0", NewLolaearET0);
        F.putExtra("LolaearFT0", NewLolaearFT0);
        F.putExtra("LolaeyeAT0", NewLolaeyeAT0);
        F.putExtra("LolaeyeBT0", NewLolaeyeBT0);
        F.putExtra("LolaeyeCT0", NewLolaeyeCT0);
        F.putExtra("LolaeyeDT0", NewLolaeyeDT0);
        F.putExtra("LolaeyeET0", NewLolaeyeET0);
        F.putExtra("LolaeyeFT0", NewLolaeyeFT0);
        F.putExtra("LolatailAT0", NewLolatailAT0);
        F.putExtra("LolatailBT0", NewLolatailBT0);
        F.putExtra("LolatailCT0", NewLolatailCT0);
        F.putExtra("LolatailDT0", NewLolatailDT0);
        F.putExtra("LolatailET0", NewLolatailET0);
        F.putExtra("LolatailFT0", NewLolatailFT0);
        F.putExtra("LolaearAT1", NewLolaearAT1);
        F.putExtra("LolaearBT1", NewLolaearBT1);
        F.putExtra("LolaearCT1", NewLolaearCT1);
        F.putExtra("LolaearDT1", NewLolaearDT1);
        F.putExtra("LolaearET1", NewLolaearET1);
        F.putExtra("LolaearFT1", NewLolaearFT1);
        F.putExtra("LolaeyeAT1", NewLolaeyeAT1);
        F.putExtra("LolaeyeBT1", NewLolaeyeBT1);
        F.putExtra("LolaeyeCT1", NewLolaeyeCT1);
        F.putExtra("LolaeyeDT1", NewLolaeyeDT1);
        F.putExtra("LolaeyeET1", NewLolaeyeET1);
        F.putExtra("LolaeyeFT1", NewLolaeyeFT1);
        F.putExtra("LolatailAT1", NewLolatailAT1);
        F.putExtra("LolatailBT1", NewLolatailBT1);
        F.putExtra("LolatailCT1", NewLolatailCT1);
        F.putExtra("LolatailDT1", NewLolatailDT1);
        F.putExtra("LolatailET1", NewLolatailET1);
        F.putExtra("LolatailFT1", NewLolatailFT1);
        F.putExtra("LolaearAT2", NewLolaearAT2);
        F.putExtra("LolaearBT2", NewLolaearBT2);
        F.putExtra("LolaearCT2", NewLolaearCT2);
        F.putExtra("LolaearDT2", NewLolaearDT2);
        F.putExtra("LolaearET2", NewLolaearET2);
        F.putExtra("LolaearFT2", NewLolaearFT2);
        F.putExtra("LolaeyeAT2", NewLolaeyeAT2);
        F.putExtra("LolaeyeBT2", NewLolaeyeBT2);
        F.putExtra("LolaeyeCT2", NewLolaeyeCT2);
        F.putExtra("LolaeyeDT2", NewLolaeyeDT2);
        F.putExtra("LolaeyeET2", NewLolaeyeET2);
        F.putExtra("LolaeyeFT2", NewLolaeyeFT2);
        F.putExtra("LolatailAT2", NewLolatailAT2);
        F.putExtra("LolatailBT2", NewLolatailBT2);
        F.putExtra("LolatailCT2", NewLolatailCT2);
        F.putExtra("LolatailDT2", NewLolatailDT2);
        F.putExtra("LolatailET2", NewLolatailET2);
        F.putExtra("LolatailFT2", NewLolatailFT2);
        F.putExtra("LolaearAT3", NewLolaearAT3);
        F.putExtra("LolaearBT3", NewLolaearBT3);
        F.putExtra("LolaearCT3", NewLolaearCT3);
        F.putExtra("LolaearDT3", NewLolaearDT3);
        F.putExtra("LolaearET3", NewLolaearET3);
        F.putExtra("LolaearFT3", NewLolaearFT3);
        F.putExtra("LolaeyeAT3", NewLolaeyeAT3);
        F.putExtra("LolaeyeBT3", NewLolaeyeBT3);
        F.putExtra("LolaeyeCT3", NewLolaeyeCT3);
        F.putExtra("LolaeyeDT3", NewLolaeyeDT3);
        F.putExtra("LolaeyeET3", NewLolaeyeET3);
        F.putExtra("LolaeyeFT3", NewLolaeyeFT3);
        F.putExtra("LolatailAT3", NewLolatailAT3);
        F.putExtra("LolatailBT3", NewLolatailBT3);
        F.putExtra("LolatailCT3", NewLolatailCT3);
        F.putExtra("LolatailDT3", NewLolatailDT3);
        F.putExtra("LolatailET3", NewLolatailET3);
        F.putExtra("LolatailFT3", NewLolatailFT3);
        F.putExtra("LolaearAT4", NewLolaearAT4);
        F.putExtra("LolaearBT4", NewLolaearBT4);
        F.putExtra("LolaearCT4", NewLolaearCT4);
        F.putExtra("LolaearDT4", NewLolaearDT4);
        F.putExtra("LolaearET4", NewLolaearET4);
        F.putExtra("LolaearFT4", NewLolaearFT4);
        F.putExtra("LolaeyeAT4", NewLolaeyeAT4);
        F.putExtra("LolaeyeBT4", NewLolaeyeBT4);
        F.putExtra("LolaeyeCT4", NewLolaeyeCT4);
        F.putExtra("LolaeyeDT4", NewLolaeyeDT4);
        F.putExtra("LolaeyeET4", NewLolaeyeET4);
        F.putExtra("LolaeyeFT4", NewLolaeyeFT4);
        F.putExtra("LolatailAT4", NewLolatailAT4);
        F.putExtra("LolatailBT4", NewLolatailBT4);
        F.putExtra("LolatailCT4", NewLolatailCT4);
        F.putExtra("LolatailDT4", NewLolatailDT4);
        F.putExtra("LolatailET4", NewLolatailET4);
        F.putExtra("LolatailFT4", NewLolatailFT4);
        F.putExtra("LolaSex", NewLolaSex);
        F.putExtra("LolaColor", NewLolaColor);
        F.putExtra("LolaHareAlpha", NewLolaHareAlpha);
        F.putExtra("LolaTailAlpha", NewLolaTailAlpha);
        F.putExtra("LolaBodyType", NewLolaBodyType);
        F.putExtra("LolaEarsType", NewLolaEarsType);
        F.putExtra("LolaTailType", NewLolaTailType);
        F.putExtra("LolaEarsLength", NewLolaEarsLength);
        F.putExtra("LolaEyesType", NewLolaEyesType);
        F.putExtra("LolaPrice", NewLolaPrice);


        setResult(420, F);
        finish();
    }


    protected void onResume() {

        super.onResume();
        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);

        DisplayAll = (Button) findViewById(R.id.Display);
        DisplayAllPast = (Button) findViewById(R.id.DisplayPast);
        PickOnLola = (Button) findViewById(R.id.PickLola);
        PickOnHairy = (Button) findViewById(R.id.PickHairy);
        DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);

        PickOnLola.setVisibility(View.INVISIBLE);
        PickOnHairy.setVisibility(View.INVISIBLE);

        DisplayBodyOne = (ImageButton) findViewById(R.id.DisplayBabyOneBody);
        DisplayEarsOne = (ImageButton) findViewById(R.id.DisplayBabyOneEars);
        DisplayEyesOne = (ImageButton) findViewById(R.id.DisplayBabyOneEyes);

        DisplayBodySelectedOne = (ImageButton) findViewById(R.id.DisplayBabyBodyLarge);
        DisplayEarsSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEarsLarge);
        DisplayEyesSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyEyesLarge);
        DisplayTailSelectedOne = (ImageButton) findViewById(R.id.DisplayBabyTailLarge);
        DisplayBodyTwo = (ImageView) findViewById(R.id.DisplayBabyTwoBody);
        DisplayEarsTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEars);
        DisplayEyesTwo = (ImageView) findViewById(R.id.DisplayBabyTwoEyes);
        DisplayBodyThree = (ImageView) findViewById(R.id.DisplayBabyThreeBody);
        DisplayEarsThree = (ImageView) findViewById(R.id.DisplayBabyThreeEars);
        DisplayEyesThree = (ImageView) findViewById(R.id.DisplayBabyThreeEyes);
        DisplayBodyFour = (ImageView) findViewById(R.id.DisplayBabyFourBody);
        DisplayEarsFour = (ImageView) findViewById(R.id.DisplayBabyFourEars);
        DisplayEyesFour = (ImageView) findViewById(R.id.DisplayBabyFourEyes);
        DisplayBodyFive = (ImageView) findViewById(R.id.DisplayBabyFiveBody);
        DisplayEarsFive = (ImageView) findViewById(R.id.DisplayBabyFiveEars);
        DisplayEyesFive = (ImageView) findViewById(R.id.DisplayBabyFiveEyes);
        DisplayBodySix = (ImageView) findViewById(R.id.DisplayBabySixBody);
        DisplayEarsSix = (ImageView) findViewById(R.id.DisplayBabySixEars);
        DisplayEyesSix = (ImageView) findViewById(R.id.DisplayBabySixEyes);
        DisplayBodySeven = (ImageView) findViewById(R.id.DisplayBabySevenBody);
        DisplayEarsSeven = (ImageView) findViewById(R.id.DisplayBabySevenEars);
        DisplayEyesSeven = (ImageView) findViewById(R.id.DisplayBabySevenEyes);
        DisplayBodyEight = (ImageView) findViewById(R.id.DisplayBabyEightBody);
        DisplayEarsEight = (ImageView) findViewById(R.id.DisplayBabyEightEars);
        DisplayEyesEight = (ImageView) findViewById(R.id.DisplayBabyEightEyes);
        DisplayBodyNine = (ImageView) findViewById(R.id.DisplayBabyNineBody);
        DisplayEarsNine = (ImageView) findViewById(R.id.DisplayBabyNineEars);
        DisplayEyesNine = (ImageView) findViewById(R.id.DisplayBabyNineEyes);
        DisplayBodyTen = (ImageView) findViewById(R.id.DisplayBabyTenBody);
        DisplayEarsTen = (ImageView) findViewById(R.id.DisplayBabyTenEars);
        DisplayEyesTen = (ImageView) findViewById(R.id.DisplayBabyTenEyes);
        DisplayBodyEleven = (ImageView) findViewById(R.id.DisplayBabyElevenBody);
        DisplayEarsEleven = (ImageView) findViewById(R.id.DisplayBabyElevenEars);
        DisplayEyesEleven = (ImageView) findViewById(R.id.DisplayBabyElevenEyes);
        DisplayBodyTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveBody);
        DisplayEarsTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveEars);
        DisplayEyesTwelve = (ImageButton) findViewById(R.id.DisplayBabyTwelveEyes);
        DisplayBodyThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenBody);
        DisplayEarsThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenEars);
        DisplayEyesThirteen = (ImageView) findViewById(R.id.DisplayBabyThirteenEyes);
        DisplayBodyFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenBody);
        DisplayEarsFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenEars);
        DisplayEyesFourteen = (ImageView) findViewById(R.id.DisplayBabyFourteenEyes);
        DisplayBodyFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenBody);
        DisplayEarsFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenEars);
        DisplayEyesFifteen = (ImageView) findViewById(R.id.DisplayBabyFifteenEyes);
        DisplayBodySixteen = (ImageView) findViewById(R.id.DisplayBabySixteenBody);
        DisplayEarsSixteen = (ImageView) findViewById(R.id.DisplayBabySixteenEars);
        DisplayEyesSixteen = (ImageView) findViewById(R.id.DisplayBabySixteenEyes);



        String SexShower = "%s";

        DisplayBodyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);




                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayTailOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);




                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayEarsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayEyesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonOneSelecterHare); ButtonLargeImageScalerOne(BabyButtonOneSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonOneSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonOneSelecterHare);
                    }
                });
            }
        });
        DisplayTailSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayBodySelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayEarsSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayEyesSelectedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayCurrentBabiesSizeCollapser();
                DisplaySelectedStats(null);
                UnhideDisplayButtons();
            }
        });
        DisplayBodyTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);

                

                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayTailTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonTwoSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwoSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwoSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwoSelecterHare);
                    }
                });
            }
        });
        DisplayBodyThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayEarsThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                
                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayEyesThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayTailThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonThreeSelecterHare); ButtonLargeImageScalerOne(BabyButtonThreeSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThreeSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThreeSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayTailFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                DisplaySelectedStats(BabyButtonFourSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourSelecterHare);
                
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });

        DisplayTailFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFiveSelecterHare); ButtonLargeImageScalerOne(BabyButtonFiveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFiveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFiveSelecterHare);
                    }
                });
            }
        });
        DisplayBodySix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayTailSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixSelecterHare);
                    }
                });
            }
        });
        DisplayBodySeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayTailSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonSevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSevenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });
        DisplayEarsEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });
        DisplayEyesEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });

        DisplayTailEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonEightSelecterHare); ButtonLargeImageScalerOne(BabyButtonEightSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonEightSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonEightSelecterHare);
                    }
                });
            }
        });

        DisplayBodyNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayEarsNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayEyesNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });

        DisplayTailNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonNineSelecterHare); ButtonLargeImageScalerOne(BabyButtonNineSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonNineSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonNineSelecterHare);
                    }
                });
            }
        });
        DisplayBodyTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });

        DisplayTailTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTenSelecterHare); ButtonLargeImageScalerOne(BabyButtonTenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });

        DisplayTailEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonElevenSelecterHare); ButtonLargeImageScalerOne(BabyButtonElevenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonElevenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonElevenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayEarsTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayEyesTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });

        DisplayTailTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonTwelveSelecterHare); ButtonLargeImageScalerOne(BabyButtonTwelveSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonTwelveSelecterHare);
                    }
                });
            }
        });
        DisplayBodyThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);
                
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonThirteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonThirteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonThirteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFourteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFourteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFourteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodyFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonFifteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonFifteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonFifteenSelecterHare);
                    }
                });
            }
        });
        DisplayBodySixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                

                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });
        DisplayEarsSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });
        DisplayEyesSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });

        DisplayTailSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickOnLola.setVisibility(View.VISIBLE);
                PickOnHairy.setVisibility(View.VISIBLE);

                
                DisplaySelectedStats(BabyButtonSixteenSelecterHare); ButtonLargeImageScalerOne(BabyButtonSixteenSelecterHare);
                PickOnLola.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onSmackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
                PickOnHairy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed(BabyButtonSixteenSelecterHare);
                    }
                });
            }
        });

        DisplayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHutch = getIntent();
                String catchname = "%s%s";
                int StupidBabyNumber = intentHutch.getIntExtra("StupidBabyNumber", 402);
                int ReallyStupidBabyNumber = (int) StupidBabyNumber;
                HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[ReallyStupidBabyNumber];

                     BabyHares[0] = (HareSplitting.Hare) intentHutch.getSerializableExtra("NewHare0");
                     BabyHares[1] = (HareSplitting.Hare) intentHutch.getSerializableExtra("NewHare1");

                String babyharecallnameloop;
                int babynumberlooper = 0;
                int babynumberlooper2 = 0;
                if (Occurence == 0) {
                    for (babynumberlooper = 0; babynumberlooper < ReallyStupidBabyNumber; babynumberlooper++) {

                        babyharecallnameloop = String.format(catchname, "NewHare", (babynumberlooper));
                        BabyHares[babynumberlooper2] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);
                        babycounter = (babycounter + 1)% ReallyStupidBabyNumber ;
                        babynumberlooper2 = babynumberlooper2 + 1;
                    }
                }


                Hairy = (HareSplitting.Hare) intentHutch.getSerializableExtra("HairyArk");

                Lola = (HareSplitting.Hare) intentHutch.getSerializableExtra("LolaArk");

                 HareSplitting.Hare TotalHareDummy = null;


                if (PagesCounter < PagesMin) {
                    PagesCounter = 0;
                }

                if ((ReallyStupidBabyNumber%16) == 2){


                    double PassPagesCheck = ReallyStupidBabyNumber/16;
                    PagesMax = (int) Math.ceil(PassPagesCheck);
                }

                if ((ReallyStupidBabyNumber%16) == 10){


                    double PassPagesCheck = ReallyStupidBabyNumber/16;
                    PagesMax = (int) Math.ceil(PassPagesCheck);
                }
                if (PagesCounter > PagesMax) {

                    PagesCounter = PagesMax;
                }
                if (Pageinitializer == 0) {
                    babydisplaycounter = (PagesCounter * 16);
                    Pageinitializer=1;
                }else {
                    babydisplaycounter = (PagesCounter * 16);
                    PagesCounter = PagesCounter + 1;
                    Pageinitializer=1;
                }

                DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);
                String PagesCounterS = String.format("Page: "+PagesCounter);DisplaySelectedSex.setText(PagesCounterS);

             
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerOne(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerOne(TotalHareDummy);
                    ButtonImageScalerTwo(TotalHareDummy);
                    ButtonImageScalerThree(TotalHareDummy);
                    ButtonImageScalerFour(TotalHareDummy);
                    ButtonImageScalerFive(TotalHareDummy);
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerTwo(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerThree(TotalHareDummy);
                    ButtonImageScalerFour(TotalHareDummy);
                    ButtonImageScalerFive(TotalHareDummy);
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerThree(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerThree(TotalHareDummy);
                    ButtonImageScalerFour(TotalHareDummy);
                    ButtonImageScalerFive(TotalHareDummy);
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerFour(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerFour(TotalHareDummy);
                    ButtonImageScalerFive(TotalHareDummy);
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerFive(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerFive(TotalHareDummy);
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerSix(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerSix(TotalHareDummy);
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerSeven(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerSeven(TotalHareDummy);
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerEight(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerEight(TotalHareDummy);
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerNine(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerNine(TotalHareDummy);
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerTen(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerTen(TotalHareDummy);
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerEleven(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerEleven(TotalHareDummy);
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerTwelve(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerTwelve(TotalHareDummy);
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerThirteen(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerThirteen(TotalHareDummy);
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerFourteen(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerFourteen(TotalHareDummy);
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerFifteen(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerFifteen(TotalHareDummy);
                    ButtonImageScalerSixteen(TotalHareDummy);
                }
                if (babydisplaycounter < StupidBabyNumber) {
                    ButtonImageScalerSixteen(BabyHares[babydisplaycounter]);
                    babydisplaycounter = ((babydisplaycounter + 1));
                    Truebabydisplaycounter = (Truebabydisplaycounter + 1);

                }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                    ButtonImageScalerSixteen(TotalHareDummy);
                }




            }
        });

       

        DisplayAllPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentHutch = getIntent();
                int StupidBabyNumber = intentHutch.getIntExtra("StupidBabyNumber", babydisplaycounter);
                int StupidBabyInt = (int) StupidBabyNumber;


                if (babydisplaycounter > 0) {
                    int StupidBabyDisplayCounterInt = babydisplaycounter + 1;
                    HareSplitting.Hare BabyHares[] = new HareSplitting.Hare[StupidBabyInt];

                        String babyharecallnameloop;
                        int babynumberlooper = 0;
                        int babynumberlooper2 = 1;

                        for (babynumberlooper = 0; babynumberlooper < StupidBabyNumber; babynumberlooper++) {
                            babyharecallnameloop = String.format(catchname, "NewHare", babycounter);
                            BabyHares[babynumberlooper] = (HareSplitting.Hare) intentHutch.getSerializableExtra(babyharecallnameloop);
                            babycounter = (babycounter + 1) % StupidBabyInt;
                        }

                    Hairy = (HareSplitting.Hare) intentHutch.getSerializableExtra("HairyArk");

                    Lola = (HareSplitting.Hare) intentHutch.getSerializableExtra("LolaArk");


                    HareSplitting.Hare TotalHareDummy = null;




                    PagesCounter = PagesCounter - 1;
                    if (PagesCounter < PagesMin) {
                        PagesCounter = 0;
                    }





                    if ((StupidBabyInt%16) == 2){


                        double PassPagesCheck = StupidBabyInt/16;
                        PagesMax = (int) Math.ceil(PassPagesCheck);
                    }

                    if ((StupidBabyInt%16) == 10){


                        double PassPagesCheck = (int) StupidBabyInt/16;
                        PagesMax = (int) Math.ceil(PassPagesCheck);
                    }
                    if (PagesCounter > PagesMax) {

                        PagesCounter = PagesMax;
                    }
                    if (Pageinitializer == 0) {
                        babydisplaycounter = (PagesCounter * 16);
                    }else {


                        babydisplaycounter = (PagesCounter * 16);

                        Pageinitializer=1;
                    }



                    DisplaySelectedSex = (TextView) findViewById(R.id.DisplaySex);
                    String PagesCounterS = String.format("Page: "+PagesCounter);DisplaySelectedSex.setText(PagesCounterS);

                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerOne(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerOne(TotalHareDummy);
                        ButtonImageScalerTwo(TotalHareDummy);
                        ButtonImageScalerThree(TotalHareDummy);
                        ButtonImageScalerFour(TotalHareDummy);
                        ButtonImageScalerFive(TotalHareDummy);
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerTwo(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerThree(TotalHareDummy);
                        ButtonImageScalerFour(TotalHareDummy);
                        ButtonImageScalerFive(TotalHareDummy);
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerThree(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerThree(TotalHareDummy);
                        ButtonImageScalerFour(TotalHareDummy);
                        ButtonImageScalerFive(TotalHareDummy);
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerFour(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerFour(TotalHareDummy);
                        ButtonImageScalerFive(TotalHareDummy);
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerFive(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerFive(TotalHareDummy);
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerSix(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerSix(TotalHareDummy);
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerSeven(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerSeven(TotalHareDummy);
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerEight(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerEight(TotalHareDummy);
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerNine(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerNine(TotalHareDummy);
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerTen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerTen(TotalHareDummy);
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerEleven(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerEleven(TotalHareDummy);
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerTwelve(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerTwelve(TotalHareDummy);
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerThirteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerThirteen(TotalHareDummy);
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerFourteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerFourteen(TotalHareDummy);
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerFifteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));Truebabydisplaycounter = (Truebabydisplaycounter + 1);
                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerFifteen(TotalHareDummy);
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }
                    if (babydisplaycounter < StupidBabyNumber) {
                        ButtonImageScalerSixteen(BabyHares[babydisplaycounter]);
                        babydisplaycounter = ((babydisplaycounter + 1));
                        Truebabydisplaycounter = (Truebabydisplaycounter + 1);

                    }else {Truebabydisplaycounter = (Truebabydisplaycounter + 1);babydisplaycounter = ((babydisplaycounter + 1));
                        ButtonImageScalerSixteen(TotalHareDummy);
                    }

                }

                if (PagesCounter > PagesMax) {
                    PagesCounter = PagesMax;
                }

                if (PagesCounter < PagesMin) {
                    PagesCounter = 0;
                }
            }
});

        
        
        
        
        
        
        
        
    }

    private void DisplayCurrentBabiesSizeCollapser() {

        DisplayEyesSelectedOne.setVisibility(View.INVISIBLE);
        DisplayEarsSelectedOne.setVisibility(View.INVISIBLE);
        DisplayBodySelectedOne.setVisibility(View.INVISIBLE);
        DisplayTailSelectedOne.setVisibility(View.INVISIBLE);


        DisplayEyesOne.setVisibility(View.VISIBLE);
        DisplayEarsOne.setVisibility(View.VISIBLE);
        DisplayBodyOne.setVisibility(View.VISIBLE);
        DisplayTailOne.setVisibility(View.VISIBLE);

        DisplayEyesTwo.setVisibility(View.VISIBLE);
        DisplayEarsTwo.setVisibility(View.VISIBLE);
        DisplayBodyTwo.setVisibility(View.VISIBLE);
        DisplayTailTwo.setVisibility(View.VISIBLE);

        DisplayEyesThree.setVisibility(View.VISIBLE);
        DisplayEarsThree.setVisibility(View.VISIBLE);
        DisplayBodyThree.setVisibility(View.VISIBLE);
        DisplayTailThree.setVisibility(View.VISIBLE);

        DisplayEyesFour.setVisibility(View.VISIBLE);
        DisplayEarsFour.setVisibility(View.VISIBLE);
        DisplayBodyFour.setVisibility(View.VISIBLE);
        DisplayTailFour.setVisibility(View.VISIBLE);

        DisplayEyesFive.setVisibility(View.VISIBLE);
        DisplayEarsFive.setVisibility(View.VISIBLE);
        DisplayBodyFive.setVisibility(View.VISIBLE);
        DisplayTailFive.setVisibility(View.VISIBLE);

        DisplayEyesSix.setVisibility(View.VISIBLE);
        DisplayEarsSix.setVisibility(View.VISIBLE);
        DisplayBodySix.setVisibility(View.VISIBLE);
        DisplayTailSix.setVisibility(View.VISIBLE);

        DisplayEyesSeven.setVisibility(View.VISIBLE);
        DisplayEarsSeven.setVisibility(View.VISIBLE);
        DisplayBodySeven.setVisibility(View.VISIBLE);
        DisplayTailSeven.setVisibility(View.VISIBLE);

        DisplayEyesEight.setVisibility(View.VISIBLE);
        DisplayEarsEight.setVisibility(View.VISIBLE);
        DisplayBodyEight.setVisibility(View.VISIBLE);
        DisplayTailEight.setVisibility(View.VISIBLE);

        DisplayEyesNine.setVisibility(View.VISIBLE);
        DisplayEarsNine.setVisibility(View.VISIBLE);
        DisplayBodyNine.setVisibility(View.VISIBLE);
        DisplayTailNine.setVisibility(View.VISIBLE);

        DisplayEyesTen.setVisibility(View.VISIBLE);
        DisplayEarsTen.setVisibility(View.VISIBLE);
        DisplayBodyTen.setVisibility(View.VISIBLE);
        DisplayTailTen.setVisibility(View.VISIBLE);

        DisplayEyesEleven.setVisibility(View.VISIBLE);
        DisplayEarsEleven.setVisibility(View.VISIBLE);
        DisplayBodyEleven.setVisibility(View.VISIBLE);
        DisplayTailEleven.setVisibility(View.VISIBLE);

        DisplayEyesTwelve.setVisibility(View.VISIBLE);
        DisplayEarsTwelve.setVisibility(View.VISIBLE);
        DisplayBodyTwelve.setVisibility(View.VISIBLE);
        DisplayTailTwelve.setVisibility(View.VISIBLE);

        DisplayEyesThirteen.setVisibility(View.VISIBLE);
        DisplayEarsThirteen.setVisibility(View.VISIBLE);
        DisplayBodyThirteen.setVisibility(View.VISIBLE);
        DisplayTailThirteen.setVisibility(View.VISIBLE);

        DisplayEyesFourteen.setVisibility(View.VISIBLE);
        DisplayEarsFourteen.setVisibility(View.VISIBLE);
        DisplayBodyFourteen.setVisibility(View.VISIBLE);
        DisplayTailFourteen.setVisibility(View.VISIBLE);

        DisplayEyesFifteen.setVisibility(View.VISIBLE);
        DisplayEarsFifteen.setVisibility(View.VISIBLE);
        DisplayBodyFifteen.setVisibility(View.VISIBLE);
        DisplayTailFifteen.setVisibility(View.VISIBLE);

        DisplayEyesSixteen.setVisibility(View.VISIBLE);
        DisplayEarsSixteen.setVisibility(View.VISIBLE);
        DisplayBodySixteen.setVisibility(View.VISIBLE);
        DisplayTailSixteen.setVisibility(View.VISIBLE);


    }

    public void DisplaySelectedStats(HareSplitting.Hare selected){

        TextView selectedsexdisplay = (TextView) findViewById(R.id.DisplaySelectedSex);
        TextView selectedSizedisplay = (TextView) findViewById(R.id.DisplaySelectedSize);
        TextView selectedEarColordisplay = (TextView) findViewById(R.id.DisplaySelectedEarColor);
        TextView selectedEyeColordisplay = (TextView) findViewById(R.id.DisplaySelectedEyeColor);
        TextView selectedBodyColordisplay = (TextView) findViewById(R.id.DisplaySelectedBodyColor);
        TextView selectedTailColordisplay = (TextView) findViewById(R.id.DisplaySelectedTailColor);
        TextView selectedAlphasdisplay = (TextView) findViewById(R.id.DisplaySelectedAlphas);
        TextView selectedPricedisplay = (TextView) findViewById(R.id.DisplaySelectedPrice);


        if ( ReverseCheckCounter == 0) {



            String SexFormat = "Sex: %s";
            String SexFormatF = String.format(SexFormat, selected.Sex);
            selectedsexdisplay.setText(SexFormatF);

            String SizeFormat = "Size: %s";
            String SizeFormatF = String.format(SizeFormat, selected.size);
            selectedSizedisplay.setText(SizeFormatF);

            String EarColorFormat = "Ear Color: %s,%s,%s,%s,%s,%s";
            String EarColorFormatF = String.format(EarColorFormat, selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt);
            
            
            String EarColor = ("Ear Color:" + FinalColorMethod(selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt));
            selectedEarColordisplay.setText(EarColor);
            selectedEarColordisplay.setTextColor(Color.parseColor(FinalColorMethod(selected.earAt, selected.earBt, selected.earCt, selected.earDt, selected.earEt, selected.earFt)));

            String BodyColor = ("Body Color:" + FinalColorMethod(selected.At, selected.Bt, selected.Ct, selected.Dt, selected.Et, selected.Ft));
            selectedBodyColordisplay.setText(BodyColor);
            selectedBodyColordisplay.setTextColor(Color.parseColor(FinalColorMethod(selected.At, selected.Bt, selected.Ct, selected.Dt, selected.Et, selected.Ft)));

            String EyeColor = ("Eye Color:" + FinalColorMethod(selected.eyeAt, selected.eyeBt, selected.eyeCt, selected.eyeDt, selected.eyeEt, selected.eyeFt));
            selectedEyeColordisplay.setText(EyeColor);
            selectedEyeColordisplay.setTextColor(Color.parseColor(FinalColorMethod(selected.eyeAt, selected.eyeBt, selected.eyeCt, selected.eyeDt, selected.eyeEt, selected.eyeFt)));

            String TailColor = ("Tail Color:" + FinalColorMethod(selected.tailAt, selected.tailBt, selected.tailCt, selected.tailDt, selected.tailEt, selected.tailFt));
            selectedTailColordisplay.setText(TailColor);
            selectedTailColordisplay.setTextColor(Color.parseColor(FinalColorMethod(selected.tailAt, selected.tailBt, selected.tailCt, selected.tailDt, selected.tailEt, selected.tailFt)));

            String AlphaFormat = "Tint/256: Body %s, Tail %s";
            String AlphaFormatF = String.format(AlphaFormat, selected.HareAlpha, selected.TailAlpha);
            selectedAlphasdisplay.setText(AlphaFormatF);

            String PriceFormat = "Price: $%s";
            String PriceFormatF = String.format(PriceFormat, selected.Price);
            selectedPricedisplay.setText(PriceFormatF);

            selectedsexdisplay.setVisibility(View.VISIBLE);
            selectedSizedisplay.setVisibility(View.VISIBLE);
            selectedEarColordisplay.setVisibility(View.VISIBLE);
            selectedBodyColordisplay.setVisibility(View.VISIBLE);
            selectedEyeColordisplay.setVisibility(View.VISIBLE);
            selectedTailColordisplay.setVisibility(View.VISIBLE);
            selectedAlphasdisplay.setVisibility(View.VISIBLE);
            selectedPricedisplay.setVisibility(View.VISIBLE);
            ReverseCheckCounter = (ReverseCheckCounter + 1)%2;

        }else {

            selectedsexdisplay.setVisibility(View.INVISIBLE);
            selectedSizedisplay.setVisibility(View.INVISIBLE);
            selectedEarColordisplay.setVisibility(View.INVISIBLE);
            selectedBodyColordisplay.setVisibility(View.INVISIBLE);
            selectedEyeColordisplay.setVisibility(View.INVISIBLE);
            selectedTailColordisplay.setVisibility(View.INVISIBLE);
            selectedAlphasdisplay.setVisibility(View.INVISIBLE);
selectedPricedisplay.setVisibility(View.INVISIBLE);
            ReverseCheckCounter = (ReverseCheckCounter + 1)%2;

        }
    }

    public void HideDisplayButtons(){
        DisplayAllPast.setVisibility(View.INVISIBLE);
        DisplayAll.setVisibility(View.INVISIBLE);

        PickOnLola.setVisibility(View.VISIBLE);
        PickOnHairy.setVisibility(View.VISIBLE);


    }
    public void UnhideDisplayButtons(){
        DisplayAllPast.setVisibility(View.VISIBLE);
        DisplayAll.setVisibility(View.VISIBLE);

        PickOnLola.setVisibility(View.INVISIBLE);
        PickOnHairy.setVisibility(View.INVISIBLE);

    }




    public String FinalColorMethod(int A, int B, int C, int D, int E, int F) {
            String PassColor = "#%s%s%s%s%s%s";
            String As = Integer.toHexString(A).toUpperCase();
            String Bs = Integer.toHexString(B).toUpperCase();
            String Cs = Integer.toHexString(C).toUpperCase();
            String Ds = Integer.toHexString(D).toUpperCase();
            String Es = Integer.toHexString(E).toUpperCase();
            String Fs = Integer.toHexString(F).toUpperCase();
            return String.format(PassColor, As, Bs, Cs, Ds, Es, Fs);
        }
}
