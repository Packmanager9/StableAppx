package ditzler.cole.stableapp;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Random;

import ditzler.cole.stableapp.hare.HareColor;


public class HareSplitting extends AppCompatActivity {
    Intent intentHutch;



    int stringcounter,ColorCounter =0;
    TextView Genetics,Geneticsa,Geneticsb,Geneticsc,BoxColors, Colorone, Colortwo, Colorthree, Colorfour;
    String A[] = new String[100];
    String B[] = new String[100];
    String C[] = new String[100];
    String I[] = new String[100];
    String Q[] = new String[5];
    int ArrayCreationLoopCounter;
    String Theprintout = "";String Theprintouta = "";String Theprintoutb = "";String Theprintoutc = "";String Hash = "#";
    String Colors = "";
    int countup;
    int Lengthcointer = 0;
    int steps = 0;
    int swapcounter = 0;
int angletesterone, angletestertwo = 0;
int angleproduct = 1;
    int babycountercounter = 0; // 2 for the parents
    int hairyandlolaArk, hairyandlolaArkTwo;
    Button BuyFoodButton, ShopButton, BreedButton, StartButton, SellBabies, KeepBabies;
    ImageButton SelectParentOneImageButton, SelectParentEyesOneImageButton, SelectParentEarsOneImageButton;
    String SizeTest = "%s";
    String PassColor = "#%s%s%s%s%s%s";
    int babyonesizedummy;
    int harealphaeight;
    int shopcounter, BabyNumber = 2;
    double HareMoney;
    double food = 99999;
    TextView HareMoneyDisplay, HareFoodDisplay;
    int SellBabiesUnlocker, babycounter, babyOneCreatedCounter, babyTwoCreatedCounter, babyThreeCreatedCounter, babyFourCreatedCounter, babyFiveCreatedCounter, babySixCreatedCounter, babySevenCreatedCounter, babyEightCreatedCounter, ShopCounterBabyNonNullifier = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hare_splitting);
        ShopButton = (Button) findViewById(R.id.Shop);
        BuyFoodButton = (Button) findViewById(R.id.BuyFood);
        BreedButton = (Button) findViewById(R.id.Breed);
        BreedButton.setVisibility(View.INVISIBLE);
        StartButton = (Button) findViewById(R.id.Start);
        KeepBabies = (Button) findViewById(R.id.KeepAll);
        SellBabies = (Button) findViewById(R.id.SellAll);
        SelectParentEyesOneImageButton = (ImageButton) findViewById(R.id.SelectParentEyesOneButton);
        SelectParentEarsOneImageButton = (ImageButton) findViewById(R.id.SelectParentEarsOneButton);
        SelectParentOneImageButton = (ImageButton) findViewById(R.id.SelectParentOneButton);
        SelectParentOneImageButton.setImageResource(R.drawable.rabbitbody);
        SelectParentEarsOneImageButton.setImageResource(R.drawable.rabbitearsroundspotlongsplit);
        SelectParentEyesOneImageButton.setImageResource(R.drawable.rabbiteyesmedium);
        SelectParentOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentEyesOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentEarsOneImageButton.setBackgroundColor(Color.TRANSPARENT);
        SelectParentOneImageButton.setVisibility(View.INVISIBLE);
        SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
        SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
        SellBabies.setVisibility(View.INVISIBLE);
        KeepBabies.setVisibility(View.INVISIBLE);
        BuyFoodButton.setVisibility(View.INVISIBLE);


        KeepBabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeepBabies.setVisibility(View.INVISIBLE);
                SellBabies.setVisibility(View.INVISIBLE);
                SellBabiesUnlocker = 1;
                SetBabiesDeleted();
                SetBabiesInvisible();
                OpenHutch(); // somehow make babies go into hutch

            }
        });


        SellBabies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!hairy.Sex.equals(lola.Sex) && babyEightCreatedCounter != 0){
                KeepBabies.setVisibility(View.INVISIBLE);
                SellBabies.setVisibility(View.INVISIBLE);
                babyOneCreatedCounter = 0;
                babyTwoCreatedCounter = 0;
                babyThreeCreatedCounter = 0;
                babyFourCreatedCounter = 0;
                babyFiveCreatedCounter = 0;
                babySixCreatedCounter = 0;
                babySevenCreatedCounter = 0;
                babyEightCreatedCounter = 0;
                    SetBabiesDeleted();
                    SetBabiesInvisible();
                HareMoney = HareMoney + (BabyOne.Price + BabyTwo.Price + BabyThree.Price + BabyFour.Price + BabyFive.Price + BabySix.Price + BabySeven.Price + BabyEight.Price);
                String HareMoneyPass = "Money: %s";
                String HarePassAgain = String.format(HareMoneyPass, HareMoney);
                HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                HareMoneyDisplay.setText(HarePassAgain);
                // add money equal to the sum of the babies sell prices (create sell price and sell price determining method) to HareMoney, Delete babies.
                SelectRabbitHutch();
                }
            }
        });

        SelectParentOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });


        SelectParentEarsOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });


        SelectParentEyesOneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayBodyBabyFiveMethod();
                SelectParentOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEarsOneImageButton.setVisibility(View.INVISIBLE);
                SelectParentEyesOneImageButton.setVisibility(View.INVISIBLE);
            }
        });

        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SelectParentOneImageButton.setVisibility(View.VISIBLE);
                // SelectParentEarsOneImageButton.setVisibility(View.VISIBLE);
                // SelectParentEyesOneImageButton.setVisibility(View.VISIBLE);
                BreedButton.setVisibility(View.VISIBLE);
                StartButton.setVisibility(View.INVISIBLE);
                //  DisplayButtonMethod();
                SizeTextViewTwoMethod();
                SexTextViewTwoMethod();
                SexTextViewOneMethod();
                SizeTextViewOneMethod();
                DisplayBodyOneMethod();
                DisplayEarsOneMethod();
                DisplayEyesOneMethod();
                DisplayTailOneMethod();
                DisplayBodyTwoMethod();
                DisplayEyeTwoMethod();
                DisplayEarsTwoMethod();
                DisplayTailTwoMethod();
            }
        });

        ShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


if (ShopCounterBabyNonNullifier == 1) {
    if ((shopcounter % 2) == 0) {
        SetAdultsInvisible();
        SetBabiesInvisible();
        DisappearTextViews();
        BreedButton.setVisibility(View.INVISIBLE);
        KeepBabies.setVisibility(View.INVISIBLE);
        SellBabies.setVisibility(View.INVISIBLE);
        BuyFoodButton.setVisibility(View.VISIBLE);
        shopcounter = shopcounter + 1;
    } else {
        SetAdultsVisible();
        ReappearTextViews();
        DisplayAllBabies();

        KeepBabies.setVisibility(View.VISIBLE);
        BreedButton.setVisibility(View.VISIBLE);
        SellBabies.setVisibility(View.VISIBLE);

        BuyFoodButton.setVisibility(View.INVISIBLE);
        shopcounter = shopcounter + 1;
    }

}

            }
        });

        BuyFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            food = HareMoney + food;
                String HareFoodPass = "Food: %s";

                String HareMoneyPass = "Money: %s";
                String HarePassAgain = String.format(HareFoodPass, food);
                HareFoodDisplay = (TextView) findViewById(R.id.HareFoodView);
                HareFoodDisplay.setText(HarePassAgain);
            HareMoney = 0;
                String HarePassMoneyAgain = String.format(HareMoneyPass, HareMoney);
                HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                HareMoneyDisplay.setText(HarePassMoneyAgain);

            }
        });


        BreedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               if (hairyandlolaArk == 0) {
                   try {
                       StoreParents();
                   } catch (CloneNotSupportedException e) {
                       e.printStackTrace();
                   }
                   hairyandlolaArk = 1;
                }
                if (food >= BabyNumber) {
                    food = food - BabyNumber;

                    String HareFoodPass = "Food: %s";

                    String HareMoneyPass = "Money: %s";
                    String HarePassAgain = String.format(HareFoodPass, food);
                    String HarePassMoneyAgain = String.format(HareMoneyPass, HareMoney);
                    HareFoodDisplay = (TextView) findViewById(R.id.HareFoodView);
                    HareFoodDisplay.setText(HarePassAgain);

                    HareMoneyDisplay = (TextView) findViewById(R.id.HareMoneyView);
                    HareMoneyDisplay.setText(HarePassMoneyAgain);
                    CreateBabies();
                    DisplayAllBabies();
                    KeepBabies.setVisibility(View.VISIBLE);
                    if (SellBabiesUnlocker == 1) {
                        SellBabies.setVisibility(View.VISIBLE);
                    }

                    if (hairy.Sex.equals(lola.Sex)) {

                        SetBabiesInvisible();
                    }
                }
            }
        });

    }


    private Integer Bodies[] = {R.drawable.rabbitbody, R.drawable.rabbitbodyspotsone, R.drawable.rabbitbodyspotstwo, R.drawable.rabbitbodystar, R.drawable.rabbitbodyrings, R.drawable.rabbitbodystripes, R.drawable.rabbitbodystripestwo, R.drawable.rabbitbodybeans, R.drawable.rabbitbodybigspot, R.drawable.rabbitbodytarget, R.drawable.rabbitbodyx, R.drawable.rabbitbodynine};

    private Integer Ears[] = {R.drawable.rabbitearsroundspotlongsplit, R.drawable.rabbitearsroundspotlongsplitvery,R.drawable.rabbitearsroundspotlongsplithuge, R.drawable.rabbitearspointylong, R.drawable.rabbitearspointyclose, R.drawable.rabbitearsroundlong, R.drawable.rabbitearsroundspotlongclose, R.drawable.rabbitearsnarwhalhorn};

    private Integer Eyes[] = {R.drawable.rabbiteyesmediumgif, R.drawable.rabbiteyesmedium, R.drawable.rabbiteyeswide, R.drawable.rabbiteyes};

    private Integer Tail[] = {R.drawable.rabbitfluffytailflat, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfeathertail, R.drawable.rabbitfeathertailnarrow, R.drawable.rabbitfeathertailtwo, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide, R.drawable.rabbitfluffytail, R.drawable.rabbitfluffytailwide};

    ImageView HareTailTwoView, HareTailBabyEightView, HareTailBabySevenView, HareTailBabySixView, HareTailBabyFiveView, HareTailBabyFourView, HareTailBabyThreeView, HareTailBabyTwoView, HareTailBabyOneView, HareTailOneView, HareEarsTwoView, HareEyesTwoView, HareEarsBabyThreeView, HareEyesBabyThreeView, HareEarsBabyFourView, HareEyesBabyFourView, HareEarsBabyFiveView, HareEyesBabyFiveView, HareEarsBabySixView, HareEyesBabySixView, HareEarsBabySevenView, HareEyesBabySevenView, HareEarsBabyEightView, HareEyesBabyEightView, HareEyesBabyTwoView, HareEarsBabyTwoView, HareEarsBabyOneView, HareEyesBabyOneView, HareEyesOneView, HareEarsOneView, HareBodyOneView, HareBodyBabyOneView, HareBodyBabyTwoView, HareBodyTwoView, HareBodyBabyThreeView, HareBodyBabyFourView, HareBodyBabyFiveView, HareBodyBabySixView, HareBodyBabySevenView, HareBodyBabyEightView;
    TextView SexViewOneView, SizeViewOneView, OoneView, OtwoView, OthreeView, SexViewTwoView, SizeViewTwoView;
    // int sizesetter;
    String Male = "Male";
    String Female = "Female";


    static class Hare implements Cloneable, Serializable  {

        public String Sex;
        public String Color;
        public int sizeA;
        public int sizeB;
        public int sizeC;
        public int sizeD;
        public int sizeE;
        public int size;
        int HareAlpha;
        int TailAlpha;
        int BodyType;

        public int tailAt;
        public int tailBt;
        public int tailCt;
        public int tailDt;
        public int tailEt;
        public int tailFt;
        public int tailAt0;
        public int tailBt0;
        public int tailCt0;
        public int tailDt0;
        public int tailEt0;
        public int tailFt0;
        public int tailAt1;
        public int tailBt1;
        public int tailCt1;
        public int tailDt1;
        public int tailEt1;
        public int tailFt1;
        public int tailAt2;
        public int tailBt2;
        public int tailCt2;
        public int tailDt2;
        public int tailEt2;
        public int tailFt2;
        public int tailAt3;
        public int tailBt3;
        public int tailCt3;
        public int tailDt3;
        public int tailEt3;
        public int tailFt3;
        public int tailAt4;
        public int tailBt4;
        public int tailCt4;
        public int tailDt4;
        public int tailEt4;
        public int tailFt4;

        public int At;
        public int Bt;
        public int Ct;
        public int Dt;
        public int Et;
        public int Ft;
        public int At0;
        public int Bt0;
        public int Ct0;
        public int Dt0;
        public int Et0;
        public int Ft0;
        public int At1;
        public int Bt1;
        public int Ct1;
        public int Dt1;
        public int Et1;
        public int Ft1;
        public int At2;
        public int Bt2;
        public int Ct2;
        public int Dt2;
        public int Et2;
        public int Ft2;
        public int At3;
        public int Bt3;
        public int Ct3;
        public int Dt3;
        public int Et3;
        public int Ft3;
        public int At4;
        public int Bt4;
        public int Ct4;
        public int Dt4;
        public int Et4;
        public int Ft4;

        public int eyeAt;
        public int eyeBt;
        public int eyeCt;
        public int eyeDt;
        public int eyeEt;
        public int eyeFt;
        public int eyeAt0;
        public int eyeBt0;
        public int eyeCt0;
        public int eyeDt0;
        public int eyeEt0;
        public int eyeFt0;
        public int eyeAt1;
        public int eyeBt1;
        public int eyeCt1;
        public int eyeDt1;
        public int eyeEt1;
        public int eyeFt1;
        public int eyeAt2;
        public int eyeBt2;
        public int eyeCt2;
        public int eyeDt2;
        public int eyeEt2;
        public int eyeFt2;
        public int eyeAt3;
        public int eyeBt3;
        public int eyeCt3;
        public int eyeDt3;
        public int eyeEt3;
        public int eyeFt3;
        public int eyeAt4;
        public int eyeBt4;
        public int eyeCt4;
        public int eyeDt4;
        public int eyeEt4;
        public int eyeFt4;

        public int earAt;
        public int earBt;
        public int earCt;
        public int earDt;
        public int earEt;
        public int earFt;
        public int earAt0;
        public int earBt0;
        public int earCt0;
        public int earDt0;
        public int earEt0;
        public int earFt0;
        public int earAt1;
        public int earBt1;
        public int earCt1;
        public int earDt1;
        public int earEt1;
        public int earFt1;
        public int earAt2;
        public int earBt2;
        public int earCt2;
        public int earDt2;
        public int earEt2;
        public int earFt2;
        public int earAt3;
        public int earBt3;
        public int earCt3;
        public int earDt3;
        public int earEt3;
        public int earFt3;
        public int earAt4;
        public int earBt4;
        public int earCt4;
        public int earDt4;
        public int earEt4;
        public int earFt4;

        public int TailType;
        public int EarsType;
        public int EarsLength;
        public int EyesType;
        public int AngleOne;
        public int AngleTwo;
        public int AngleThree;
        public int AngleFour;
        public int AngleFive;
        public int AngleSix;
        public int AngleSeven;
        public int AngleEight;
        public int AngleNine;
        public int AngleTen;
        public int AngleTotal;
        int[] Samething = new int[137];

        public double Price;

        public Hare(String sex, int SizeA, int SizeB, int SizeC, int SizeD, int SizeE, String color, int harealpha,int tailalpha, int bodytype, int at, int bt, int ct, int dt, int et, int ft,int at1, int bt1, int ct1, int dt1, int et1, int ft1,int at2, int bt2, int ct2, int dt2, int et2, int ft2,int at3, int bt3, int ct3, int dt3, int et3, int ft3,int at4, int bt4, int ct4, int dt4, int et4, int ft4, int eyeat1, int eyebt1, int eyect1, int eyedt1, int eyeet1, int eyeft1, int eyeat2, int eyebt2, int eyect2, int eyedt2, int eyeet2, int eyeft2, int eyeat3, int eyebt3, int eyect3, int eyedt3, int eyeet3, int eyeft3, int eyeat4, int eyebt4, int eyect4, int eyedt4, int eyeet4, int eyeft4, int eyeat5, int eyebt5, int eyect5, int eyedt5, int eyeet5, int eyeft5, int earat5, int earbt5, int earct5, int eardt5, int earet5, int earft5,  int tailat1, int tailbt1, int tailct1, int taildt1, int tailet1, int tailft1, int tailat2, int tailbt2, int tailct2, int taildt2, int tailet2, int tailft2, int tailat3, int tailbt3, int tailct3, int taildt3, int tailet3, int tailft3, int tailat4, int tailbt4, int tailct4, int taildt4, int tailet4, int tailft4, int tailat5, int tailbt5, int tailct5, int taildt5, int tailet5, int tailft5,int earat1, int earbt1, int earct1, int eardt1, int earet1, int earft1, int earat2, int earbt2, int earct2, int eardt2, int earet2, int earft2, int earat3, int earbt3, int earct3, int eardt3, int earet3, int earft3, int earat4, int earbt4, int earct4, int eardt4, int earet4, int earft4, int earstype, int tailstype, int earslength, int eyestype, double price, int angleone, int angletwo, int anglethree, int anglefour, int anglefive, int anglesix, int angleseven, int angleeight, int anglenine, int angleten) {
            Sex = sex;
            
            
            sizeA = SizeA;
            sizeB = SizeB;
            sizeC =SizeC;
            sizeD = SizeD;
            sizeE = SizeE;
            
            
            
            size = (sizeA+sizeB+sizeC+sizeD+sizeE);
            Color = color;
            HareAlpha = harealpha;
            TailAlpha = tailalpha;
            BodyType = bodytype;
            At0 = at1;
            Samething[0] = At0;
            Bt0 = bt1;
            Samething[1] = Bt0;
            Ct0 = ct1;
            Samething[2] = Ct0;
            Dt0 = dt1;
            Samething[3] = Dt0;
            Et0 = et1;
            Samething[4] = Et0;
            Ft0 = ft1;
            Samething[5] = Ft0;
            At1 = at2;
            Samething[6] = At1;
            Bt1 = bt2;
            Samething[7] = Bt1;
            Ct1 = ct2;
            Samething[8] = Ct1;
            Dt1 = dt2;
            Samething[9] =  Dt1;
            Et1 = et2;
            Samething[10] = Et1;
            Ft1 = ft2;
            Samething[11] =  Ft1;
            At2 = at3;
            Samething[12] = At2;
            Bt2 = bt3;
            Samething[13] = Bt2;
            Ct2 = ct3;
            Samething[14] = Ct2;
            Dt2 = dt3;
            Samething[15] = Dt2;
            Et2 = et3;
            Samething[16] = Et2;
            Ft2 = ft3;
            Samething[17] =  Ft2;
            At3 = at4;
            Samething[18] = At3;
            Bt3 = bt4;
            Samething[19] = Bt3;
            Ct3 = ct4;
            Samething[20] = Ct3;
            Dt3 = dt4;
            Samething[21] = Dt3;
            Et3 = et4;
            Samething[22] = Et3;
            Ft3 = ft4;
            Samething[23] = Ft3;
            At4 = at;
            Samething[24] = At4;
            Bt4 = bt;
            Samething[25] = Bt4;
            Ct4 = ct;
            Samething[26] = Ct4;
            Dt4 = dt;
            Samething[27] = Dt4;
            Et4 = et;
            Samething[28] = Et4;
            Ft4 = ft;
            Samething[29] =  Ft4;


            eyeAt0 = eyeat1;
            Samething[30] = eyeAt0;
            eyeBt0 = eyebt1;
            Samething[31] = eyeBt0;
            eyeCt0 = eyect1;
            Samething[32] =  eyeCt0;
            eyeDt0 = eyedt1;
            Samething[33] = eyeDt0;
            eyeEt0 = eyeet1;
            Samething[34] = eyeEt0;
            eyeFt0 = eyeft1;
            Samething[35] = eyeFt0;
            eyeAt1 = eyeat2;
            Samething[36] = eyeAt1;
            eyeBt1 = eyebt2;
            Samething[37] = eyeBt1;
            eyeCt1 = eyect2;
            Samething[38] = eyeCt1;
            eyeDt1 = eyedt2;
            Samething[39] =  eyeDt1;
            eyeEt1 = eyeet2;
            Samething[40] = eyeEt1;
            eyeFt1 = eyeft2;
            Samething[41] = eyeFt1;
            eyeAt2 = eyeat3;
            Samething[42] = eyeAt2;
            eyeBt2 = eyebt3;
            Samething[43] =  eyeBt2;
            eyeCt2 = eyect3;
            Samething[44] = eyeCt2;
            eyeDt2 = eyedt3;
            Samething[45] = eyeDt2;
            eyeEt2 = eyeet3;
            Samething[46] = eyeEt2;
            eyeFt2 = eyeft3;
            Samething[47] = eyeFt2;
            eyeAt3 = eyeat4;
            Samething[48] =eyeAt3;
            eyeBt3 = eyebt4;
            Samething[49] =eyeBt3;
            eyeCt3 = eyect4;
            Samething[50] =eyeCt3;
            eyeDt3 = eyedt4;
            Samething[51] =  eyeDt3;
            eyeEt3 = eyeet4;
            Samething[52] = eyeEt3;
            eyeFt3 = eyeft4;
            Samething[53] = eyeFt3;
            eyeAt4 = eyeat5;
            Samething[54] =  eyeAt4;
            eyeBt4 = eyebt5;
            Samething[55] = eyeBt4;
            eyeCt4 = eyect5;
            Samething[56] =  eyeCt4;
            eyeDt4 = eyedt5;
            Samething[57] = eyeDt4;
            eyeEt4 = eyeet5;
            Samething[58] =  eyeEt4;
            eyeFt4 = eyeft5;
            Samething[59] = eyeFt4;


            tailAt0 = tailat1;
            Samething[60] =tailAt0;
            tailBt0 = tailbt1;
            Samething[61] =tailBt0;
            tailCt0 = tailct1;
            Samething[62] =tailCt0;
            tailDt0 = taildt1;
            Samething[63] =tailDt0;
            tailEt0 = tailet1;
            Samething[64] =tailEt0;
            tailFt0 = tailft1;
            Samething[65] =tailFt0;
            tailAt1 = tailat2;
            Samething[66] =tailAt1;
            tailBt1 = tailbt2;
            Samething[67] =tailBt1;
            tailCt1 = tailct2;
            Samething[68] =tailCt1;
            tailDt1 = taildt2;
            Samething[69] =tailDt1;
            tailEt1 = tailet2;
            Samething[70] =tailEt1;
            tailFt1 = tailft2;
            Samething[71] =tailFt1;
            tailAt2 = tailat3;
            Samething[72] =tailAt2;
            tailBt2 = tailbt3;
            Samething[73] =tailBt2;
            tailCt2 = tailct3;
            Samething[74] =tailCt2;
            tailDt2 = taildt3;
            Samething[75] =tailDt2;
            tailEt2 = tailet3;
            Samething[76] =tailEt2;
            tailFt2 = tailft3;
            Samething[77] =tailFt2;
            tailAt3 = tailat4;
            Samething[78] =tailAt3;
            tailBt3 = tailbt4;
            Samething[79] =tailBt3;
            tailCt3 = tailct4;
            Samething[80] =tailCt3;
            tailDt3 = taildt4;
            Samething[81] =tailDt3;
            tailEt3 = tailet4;
            Samething[82] =tailEt3;
            tailFt3 = tailft4;
            Samething[83] =tailFt3;
            tailAt4 = tailat5;
            Samething[84] =tailAt4;
            tailBt4 = tailbt5;
            Samething[85] =tailBt4;
            tailCt4 = tailct5;
            Samething[86] =tailCt4;
            tailDt4 = taildt5;
            Samething[87] =tailDt4;
            tailEt4 = tailet5;
            Samething[88] =tailEt4;
            tailFt4 = tailft5;
            Samething[89] =tailFt4;


            earAt0 = earat1;
            Samething[90] =earAt0;
            earBt0 = earbt1;
            Samething[91] =earBt0;
            earCt0 = earct1;
            Samething[92] =earCt0;
            earDt0 = eardt1;
            Samething[93] =earDt0;
            earEt0 = earet1;
            Samething[94] =earEt0;
            earFt0 = earft1;
            Samething[95] =earFt0;
            earAt1 = earat2;
            Samething[96] =earAt1;
            earBt1 = earbt2;
            Samething[97] =earBt1;
            earCt1 = earct2;
            Samething[98] =earCt1;
            earDt1 = eardt2;
            Samething[99] =earDt1;
            earEt1 = earet2;
            Samething[100] =earEt1;
            earFt1 = earft2;
            Samething[101] =earFt1;
            earAt2 = earat3;
            Samething[102] =earAt2;
            earBt2 = earbt3;
            Samething[103] =earBt2;
            earCt2 = earct3;
            Samething[104] =earCt2;
            earDt2 = eardt3;
            Samething[105] =earDt2;
            earEt2 = earet3;
            Samething[106] =earEt2;
            earFt2 = earft3;
            Samething[107] =earFt2;
            earAt3 = earat4;
            Samething[108] =earAt3;
            earBt3 = earbt4;
            Samething[109] =earBt3;
            earCt3 = earct4;
            Samething[110] =earCt3;
            earDt3 = eardt4;
            Samething[111] =earDt3;
            earEt3 = earet4;
            Samething[112] =earEt3;
            earFt3 = earft4;
            Samething[113] =earFt3;
            earAt4 = earat5;
            Samething[114] =earAt4;
            earBt4 = earbt5;
            Samething[115] =earBt4;
            earCt4 = earct5;
            Samething[116] =earCt4;
            earDt4 = eardt5;
            Samething[117] =earDt4;
            earEt4 = earet5;
            Samething[118] =earEt4;
            earFt4 = earft5;
            Samething[119] =earFt4;

        




            At = At0 + At1 + At2 + At3 + At4;
            Bt = Bt0 + Bt1 + Bt2 + Bt3 + Bt4;
            Ct = Ct0 + Ct1 + Ct2 + Ct3 + Ct4;
            Dt = Dt0 + Dt1 + Dt2 + Dt3 + Dt4;
            Et = Et0 + Et1 + Et2 + Et3 + Et4;
            Ft = Ft0 + Ft1 + Ft2 + Ft3 + Ft4;

            eyeAt = eyeAt0 + eyeAt1 + eyeAt2 + eyeAt3 + eyeAt4;
            eyeBt = eyeBt0 + eyeBt1 + eyeBt2 + eyeBt3 + eyeBt4;
            eyeCt = eyeCt0 + eyeCt1 + eyeCt2 + eyeCt3 + eyeCt4;
            eyeDt = eyeDt0 + eyeDt1 + eyeDt2 + eyeDt3 + eyeDt4;
            eyeEt = eyeEt0 + eyeEt1 + eyeEt2 + eyeEt3 + eyeEt4;
            eyeFt = eyeFt0 + eyeFt1 + eyeFt2 + eyeFt3 + eyeFt4;

            earAt = earAt0 + earAt1 + earAt2 + earAt3 + earAt4;
            earBt = earBt0 + earBt1 + earBt2 + earBt3 + earBt4;
            earCt = earCt0 + earCt1 + earCt2 + earCt3 + earCt4;
            earDt = earDt0 + earDt1 + earDt2 + earDt3 + earDt4;
            earEt = earEt0 + earEt1 + earEt2 + earEt3 + earEt4;
            earFt = earFt0 + earFt1 + earFt2 + earFt3 + earFt4;

            tailAt = tailAt0 + tailAt1 + tailAt2 + tailAt3 + tailAt4;
            tailBt = tailBt0 + tailBt1 + tailBt2 + tailBt3 + tailBt4;
            tailCt = tailCt0 + tailCt1 + tailCt2 + tailCt3 + tailCt4;
            tailDt = tailDt0 + tailDt1 + tailDt2 + tailDt3 + tailDt4;
            tailEt = tailEt0 + tailEt1 + tailEt2 + tailEt3 + tailEt4;
            tailFt = tailFt0 + tailFt1 + tailFt2 + tailFt3 + tailFt4;


            Price = price;
            TailType = tailstype;
            EarsType = earstype;
            EarsLength = earslength;
            EyesType = eyestype;
            AngleOne = angleone;
            AngleTwo = angletwo;
            AngleThree = anglethree;
            AngleFour = anglefour;
            AngleFive = anglefive;
            AngleSix = anglesix;
            AngleSeven = angleseven;
            AngleEight = angleeight;
            AngleNine = anglenine;
            AngleTen = angleten;
            AngleTotal = AngleOne + AngleTwo + AngleThree + AngleFour + AngleFive + AngleSix + AngleSeven + AngleEight + AngleNine + AngleTen;
            
            
            
            Samething[120] =TailType;
            Samething[121] =EarsType;
            Samething[122] =EarsLength;
            Samething[123] =EyesType;
            Samething[124] =AngleOne;
            Samething[125] =AngleTwo;
            Samething[126] =AngleThree;
            Samething[127] =AngleFour;
            Samething[128] =AngleFive;
            Samething[129] =AngleSix;
            Samething[130] =AngleSeven;
            Samething[131] =AngleEight;
            Samething[132] =AngleNine;
            Samething[133] =AngleTen;
            Samething[134] =HareAlpha;
            Samething[135] =TailAlpha;
            Samething[136] =BodyType;
        }


        public Hare clone() throws CloneNotSupportedException{
            Hare CloneHare = (Hare) super.clone();
            //CloneHare = this;
            return  CloneHare;
        }

    }


/*
    static class Hare implements Serializable {

        public String Sex;
        public int size;
        public String Color;
        int HareAlpha;
        int TailAlpha;
        int BodyType;
        public int hexRed1;
        public int Bt;
        public int Ct;
        public int Dt;
        public int Et;
        public int Ft;
        public int eyeAt;
        public int eyeBt;
        public int eyeCt;
        public int eyeDt;
        public int eyeEt;
        public int eyeFt;
        public int earAt;
        public int earBt;
        public int earCt;
        public int earDt;
        public int earEt;
        public int earFt;
        public int tailAt;
        public int tailBt;
        public int tailCt;
        public int tailDt;
        public int tailEt;
        public int tailFt;
        public int TailType;
        public int EarsType;
        public int EarsLength;
        public int EyesType;
        public double Price;
        public int AngleOne;
        public int AngleTwo;
        public int AngleThree;
        public int AngleFour;
        public int AngleFive;
        public int AngleSix;
        public int AngleSeven;
        public int AngleEight;
        public int AngleNine;
        public int AngleTen;
        public int AngleTotal;

        public Hare(String sex, int Size, String color, int harealpha,int tailalpha, int bodytype, int at, int bt, int ct, int dt, int et, int ft, int eyeat, int eyebt, int eyect, int eyedt, int eyeet, int eyeft, int earat, int earbt, int earct, int eardt, int earet, int earft,  int tailat, int tailbt, int tailct, int taildt, int tailet, int tailft, int earstype, int tailstype, int earslength, int eyestype, double price, int angleone, int angletwo, int anglethree, int anglefour, int anglefive, int anglesix, int angleseven, int angleeight, int anglenine, int angleten) {
            Sex = sex;
            size = Size;
            Color = color;
            HareAlpha = harealpha;
            TailAlpha = tailalpha;
            BodyType = bodytype;
            hexRed1 = at;
            Bt = bt;
            Ct = ct;
            Dt = dt;
            Et = et;
            Ft = ft;
            eyeAt = eyeat;
            eyeBt = eyebt;
            eyeCt = eyect;
            eyeDt = eyedt;
            eyeEt = eyeet;
            eyeFt = eyeft;
            earAt = earat;
            earBt = earbt;
            earCt = earct;
            earDt = eardt;
            earEt = earet;
            earFt = earft;
            tailAt = tailat;
            tailBt = tailbt;
            tailCt = tailct;
            tailDt = taildt;
            tailEt = tailet;
            tailFt = tailft;
            TailType = tailstype;
            EarsType = earstype;
            EarsLength = earslength;
            EyesType = eyestype;
            Price = price;


             AngleOne = angleone;
             AngleTwo = angletwo;
             AngleThree = anglethree;
             AngleFour = anglefour;
             AngleFive = anglefive;
             AngleSix = anglesix;
             AngleSeven = angleseven;
             AngleEight = angleeight;
             AngleNine = anglenine;
             AngleTen = angleten;
             AngleTotal = angleone + angletwo + anglethree + anglefour + anglefive + anglesix + angleseven + angleeight + anglenine + angleten;
        }


    }
*/


    HareColor lolascolor = new HareColor(ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod());
    HareColor hairyscolor = new HareColor(ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod(), ColorSettingMethod());

    //   Hare hairy = new Hare(SetSexMethod(), SetSizeMethod(), FinalColorMethod(lolascolor.hexRed1,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 0,0,0,0,0,0);
    //   Hare lola = new Hare(SetSexMethod(), SetSizeMethod(), FinalColorMethod(hairyscolor.hexRed1,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 15, 15, 15,15,15,15 );

    Hare hairy = new Hare(Male, SetSizeMethod(), SetSizeMethod(), SetSizeMethod(), SetSizeMethod(), SetSizeMethod(), FinalColorMethod(lolascolor.hexRed1, lolascolor.Bt, lolascolor.Ct, lolascolor.Dt, lolascolor.Et, lolascolor.Ft),  SetAlphaMethod(),SetTailAlphaMethod(), BodyTypeMethod(),  A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(), SetEarMethod(), SetTailMethod(), EarLengthMethod(), 0, 0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );
    Hare lola = new Hare(Female, SetSizeMethod(),SetSizeMethod(),SetSizeMethod(),SetSizeMethod(),SetSizeMethod(), FinalColorMethod(hairyscolor.hexRed1, hairyscolor.Bt, hairyscolor.Ct, hairyscolor.Dt, hairyscolor.Et, hairyscolor.Ft), SetAlphaMethod(),SetTailAlphaMethod(), BodyTypeMethod(), A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(), SetEarMethod(), SetTailMethod(), EarLengthMethod(), 0, 0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

    Hare BabyOne, BabyTwo, BabyThree, BabyFour, BabyFive, BabySix, BabySeven, BabyEight = new Hare(null, 0,0,0,0,0, "#123456", 128,128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation());
    Hare BabyHares[] = new Hare[9999];
    final Hare HairyStorage = hairy;
    final Hare LolaStorage = lola;
    //  Hare hairy = new Hare(Male, 139, FinalColorMethod(lolascolor.hexRed1,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 0,0,0,0,15,15, ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), SetEarMethod (), EarLengthMethod(), 0);
    // Hare lola = new Hare(Female, 139, FinalColorMethod(hairyscolor.hexRed1,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(),  15,15,0,0,0,0,  ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),  ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(),ColorSettingMethod(), SetEarMethod (), EarLengthMethod(), 0);

    int BabyHareOneScaler;
    int BabyHareTwoScaler;
    int BabyHareThreeScaler;
    int BabyHareFourScaler;
    int BabyHareFiveScaler;
    int BabyHareSixScaler;
    int BabyHareSevenScaler;
    int BabyHareEightScaler;
    //   Hare hairy = new Hare(Male, SetSizeMethod(), FinalColorMethod(lolascolor.hexRed1,lolascolor.Bt,lolascolor.Ct,lolascolor.Dt,lolascolor.Et,lolascolor.Ft), SetAlphaMethod (), BodyTypeMethod(), 15, 15, 15,15,15,15);
    //   Hare lola = new Hare(Female, SetSizeMethod(), FinalColorMethod(hairyscolor.hexRed1,hairyscolor.Bt,hairyscolor.Ct,hairyscolor.Dt,hairyscolor.Et,hairyscolor.Ft), SetAlphaMethod (), BodyTypeMethod(),  0,0,0,0,0,0);

    public void SexTextViewOneMethod() {
        SexViewOneView = (TextView) findViewById(R.id.SexViewOne);


        if (hairy.Sex.equals(Male)) {
            SexViewOneView.setText(Male);

        } else {
            SexViewOneView.setText(Female);

        }


    }


    public int convertToDp(int input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }

    public void CreateBabies() { // Do the baby creations

        SizeTextViewTwoMethod();
        SexTextViewTwoMethod();
        SexTextViewOneMethod();
        SizeTextViewOneMethod();
        DisplayBodyOneMethod();
        DisplayEarsOneMethod();
        DisplayEyesOneMethod();
        DisplayTailOneMethod();
        DisplayBodyTwoMethod();
        DisplayEyeTwoMethod();
        DisplayEarsTwoMethod();
        DisplayTailTwoMethod();


        if ((hairy.Sex.equals(Male) && lola.Sex.equals(Male)) || (hairy.Sex.equals(Female) && lola.Sex.equals(Female))) {

            if (!hairy.Sex.equals(lola.Sex)){


            }




        } else {
            BabyMethod(hairy, lola);
            BabyMethodTwo(hairy, lola);

            BabyMethodThree(hairy, lola);
            BabyMethodFour(hairy, lola);
            BabyMethodFive(hairy, lola);
            BabyMethodSix(hairy, lola);
            BabyMethodSeven(hairy, lola);
            BabyMethodEight(hairy, lola);


            SetBabyEightScaler();
            DisplayEarsBabyEightMethod();
            DisplayEyesBabyEightMethod();
            DisplayBodyBabyEightMethod();
            DisplayTailBabyEightMethod();


            SetBabySevenScaler();
            DisplayEarsBabySevenMethod();
            DisplayEyesBabySevenMethod();
            DisplayBodyBabySevenMethod();
            DisplayTailBabySevenMethod();

            SetBabySixScaler();
            DisplayEarsBabySixMethod();
            DisplayEyesBabySixMethod();
            DisplayBodyBabySixMethod();
            DisplayTailBabySixMethod();

            SetBabyFiveScaler();
            DisplayEarsBabyFiveMethod();
            DisplayEyesBabyFiveMethod();
            DisplayBodyBabyFiveMethod();
            DisplayTailBabyFiveMethod();

            SetBabyFourScaler();
            DisplayBodyBabyFourMethod();
            DisplayEarsBabyFourMethod();
            DisplayEyesBabyFourMethod();
            DisplayTailBabyFourMethod();

            SetBabyThreeScaler();
            DisplayBodyBabyThreeMethod();
            DisplayEarsBabyThreeMethod();
            DisplayEyesBabyThreeMethod();
            DisplayTailBabyThreeMethod();

            SetBabyTwoScaler();
            DisplayBodyBabyTwoMethod();
            DisplayEarsBabyTwoMethod();
            DisplayEyesBabyTwoMethod();
            DisplayTailBabyTwoMethod();

            SetBabyOneScaler();
            DisplayBodyBabyOneMethod();
            DisplayEyesBabyOneMethod();
            DisplayEarsBabyOneMethod();
            DisplayTailBabyOneMethod();

        }


        OoneView = (TextView) findViewById(R.id.Oone);
        OoneView.setText("○");
        OoneView.setTextColor(Color.parseColor(FinalColorMethod(hairy.At, hairy.Bt, hairy.Ct, hairy.Dt, hairy.Et, hairy.Ft)));
        OtwoView = (TextView) findViewById(R.id.Otwo);
        OtwoView.setText("○");
        OtwoView.setTextColor(Color.parseColor(FinalColorMethod(lola.At, lola.Bt, lola.Ct, lola.Dt, lola.Et, lola.Ft)));
        OthreeView = (TextView) findViewById(R.id.Othree);
        OthreeView.setText("○");
        OthreeView.setTextColor(Color.parseColor(FinalColorMethod((BabyOne.At), (BabyOne.Bt), (BabyOne.Ct), (BabyOne.Dt), (BabyOne.Et), (BabyOne.Ft))));
/*
        if (!hairy.Sex.equals(lola.Sex)){

            SetBabiesInvisible();
        }
*/
    }


    public void DisplayAllBabies() { // Do the baby creations

        HareBodyBabyOneView.setVisibility(View.VISIBLE);
        HareBodyBabyTwoView.setVisibility(View.VISIBLE);
        HareBodyBabyThreeView.setVisibility(View.VISIBLE);
        HareBodyBabyFourView.setVisibility(View.VISIBLE);
        HareBodyBabyFiveView.setVisibility(View.VISIBLE);
        HareBodyBabySixView.setVisibility(View.VISIBLE);
        HareBodyBabySevenView.setVisibility(View.VISIBLE);
        HareBodyBabyEightView.setVisibility(View.VISIBLE);

        HareEarsBabyOneView.setVisibility(View.VISIBLE);
        HareEarsBabyTwoView.setVisibility(View.VISIBLE);
        HareEarsBabyThreeView.setVisibility(View.VISIBLE);
        HareEarsBabyFourView.setVisibility(View.VISIBLE);
        HareEarsBabyFiveView.setVisibility(View.VISIBLE);
        HareEarsBabySixView.setVisibility(View.VISIBLE);
        HareEarsBabySevenView.setVisibility(View.VISIBLE);
        HareEarsBabyEightView.setVisibility(View.VISIBLE);

        HareEyesBabyOneView.setVisibility(View.VISIBLE);
        HareEyesBabyTwoView.setVisibility(View.VISIBLE);
        HareEyesBabyThreeView.setVisibility(View.VISIBLE);
        HareEyesBabyFourView.setVisibility(View.VISIBLE);
        HareEyesBabyFiveView.setVisibility(View.VISIBLE);
        HareEyesBabySixView.setVisibility(View.VISIBLE);
        HareEyesBabySevenView.setVisibility(View.VISIBLE);
        HareEyesBabyEightView.setVisibility(View.VISIBLE);


        HareTailBabyOneView.setVisibility(View.VISIBLE);
        HareTailBabyTwoView.setVisibility(View.VISIBLE);
        HareTailBabyThreeView.setVisibility(View.VISIBLE);
        HareTailBabyFourView.setVisibility(View.VISIBLE);
        HareTailBabyFiveView.setVisibility(View.VISIBLE);
        HareTailBabySixView.setVisibility(View.VISIBLE);
        HareTailBabySevenView.setVisibility(View.VISIBLE);
        HareTailBabyEightView.setVisibility(View.VISIBLE);
    }


    public void DisappearTextViews() {
        SexViewOneView.setVisibility(View.INVISIBLE); SizeViewOneView.setVisibility(View.INVISIBLE); OoneView.setVisibility(View.INVISIBLE); OtwoView.setVisibility(View.INVISIBLE); OthreeView.setVisibility(View.INVISIBLE); SexViewTwoView.setVisibility(View.INVISIBLE); SizeViewTwoView.setVisibility(View.INVISIBLE);
    }

    public void ReappearTextViews() {
        SexViewOneView.setVisibility(View.VISIBLE); SizeViewOneView.setVisibility(View.VISIBLE); OoneView.setVisibility(View.VISIBLE); OtwoView.setVisibility(View.VISIBLE); OthreeView.setVisibility(View.VISIBLE);SexViewTwoView.setVisibility(View.VISIBLE); SizeViewTwoView.setVisibility(View.VISIBLE);
    }


    public void SexTextViewTwoMethod() {
        SexViewTwoView = (TextView) findViewById(R.id.SexViewTwo);

        if (lola.Sex.equals(Male)) {
            SexViewTwoView.setText(Male);

        } else {
            SexViewTwoView.setText(Female);

        }


    }

    public void SetBabyOneScaler() {
        BabyHareOneScaler = (BabyOne.size) + new Random().nextInt(1) - 0;
        if (BabyHareOneScaler >= 139) {
            BabyHareOneScaler = 138;
        }
        if (BabyHareOneScaler <= 39) {
            BabyHareOneScaler = 40;
        }
    }


    public void SetBabyTwoScaler() {
        BabyHareTwoScaler = (BabyTwo.size) + new Random().nextInt(1) - 0;
        if (BabyHareTwoScaler >= 139) {
            BabyHareTwoScaler = 138;
        }
        if (BabyHareTwoScaler <= 39) {
            BabyHareTwoScaler = 40;
        }
    }


    public void SetBabyThreeScaler() {
        BabyHareThreeScaler = (BabyThree.size) + new Random().nextInt(1) - 0;
        if (BabyHareThreeScaler >= 139) {
            BabyHareThreeScaler = 138;
        }
        if (BabyHareThreeScaler <= 39) {
            BabyHareThreeScaler = 40;
        }
    }


    public void SetBabyFourScaler() {
        BabyHareFourScaler = (BabyFour.size) + new Random().nextInt(1) - 0;
        if (BabyHareFourScaler >= 139) {
            BabyHareFourScaler = 138;
        }
        if (BabyHareFourScaler <= 39) {
            BabyHareFourScaler = 40;
        }
    }


    public void SetBabyFiveScaler() {
        BabyHareFiveScaler = (BabyFive.size) + new Random().nextInt(1) - 0;
        if (BabyHareFiveScaler >= 139) {
            BabyHareFiveScaler = 138;
        }
        if (BabyHareFiveScaler <= 39) {
            BabyHareFiveScaler = 40;
        }
    }

    public void SetBabySixScaler() {
        BabyHareSixScaler = (BabySix.size) + new Random().nextInt(1) - 0;
        if (BabyHareSixScaler >= 139) {
            BabyHareSixScaler = 138;
        }
        if (BabyHareSixScaler <= 39) {
            BabyHareSixScaler = 40;
        }
    }

    public void SetBabySevenScaler() {
        BabyHareSevenScaler = (BabySeven.size) + new Random().nextInt(1) - 0;
        if (BabyHareSevenScaler >= 139) {
            BabyHareSevenScaler = 138;
        }
        if (BabyHareSevenScaler <= 39) {
            BabyHareSevenScaler = 40;
        }
    }

    public void SetBabyEightScaler() {
        BabyHareEightScaler = (BabyEight.size) + new Random().nextInt(1) - 0;
        if (BabyHareEightScaler >= 139) {
            BabyHareEightScaler = 138;
        }
        if (BabyHareEightScaler <= 39) {
            BabyHareEightScaler = 40;
        }
    }


    public void SizeTextViewOneMethod() {
        SizeViewOneView = (TextView) findViewById(R.id.SizeViewOne);
        String SizePass = String.format(SizeTest, convertToDp(hairy.size));
        SizeViewOneView.setText(SizePass);


    }

    public void SizeTextViewTwoMethod() {
        SizeViewTwoView = (TextView) findViewById(R.id.SizeViewTwo);
        String SizePass = String.format(SizeTest, convertToDp(lola.size));
        SizeViewTwoView.setText(SizePass);


    }

    public void StoreParents() throws CloneNotSupportedException {

        BabyHares[0] = HairyStorage.clone();
        BabyHares[1] = LolaStorage.clone();

    }


    public String SetSexMethod() {
        int sexsetter = new Random().nextInt(2);
        if (sexsetter == 0) {
            return Male;
        } else {
            return Female;
        }
    }

    public int SetEarMethod() {
        if ((new Random().nextInt(2) != 0)) {
            int earsetter = new Random().nextInt(5);
            return earsetter;
        } else {
            int earsetter = new Random().nextInt(8);
            return earsetter;
        }
    }

    public int SetTailMethod() {
        if ((new Random().nextInt(2) != 0)) {
            int earsetter = new Random().nextInt(5);
            return earsetter;
        } else {
            int earsetter = new Random().nextInt(13);
            return earsetter;
        }
    }

    public int EarLengthMethod() {
        int eargen = new Random().nextInt(300) + 100;
        int EarPass = (eargen / 100);
        return Math.round(EarPass);
    }

    public void DisplayButtonMethod() {

        SelectParentOneImageButton.setImageResource(Bodies[hairy.BodyType]);
        SelectParentEarsOneImageButton.setImageResource(Ears[hairy.EarsType]);
        SelectParentEyesOneImageButton.setImageResource(Eyes[hairy.EyesType]);

        int RedR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));
        int GreenR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));
        int BlueR = ((new Random().nextInt(16) * 16) + new Random().nextInt(16));

        int Red = ((hairy.At * 16) + hairy.Bt);
        int Green = ((hairy.Ct * 16) + hairy.Dt);
        int Blue = ((hairy.Et * 16) + hairy.Ft);
        int earalpha = (hairy.HareAlpha / 2);
        SelectParentEarsOneImageButton.setColorFilter(Color.argb(earalpha, Red, Green, Blue));
        SelectParentEyesOneImageButton.setColorFilter(Color.argb(earalpha, RedR, GreenR, BlueR));
        SelectParentOneImageButton.setColorFilter(Color.argb(hairy.HareAlpha, Red, Green, Blue));
        ButtonImageScalerOne();

    }

    public void DisplayEarsxMethod() {
        HareEarsTwoView = (ImageView) findViewById(R.id.HareEarsViewParentTwo);
        HareEarsTwoView.setImageResource(Ears[lola.EarsType]);
        HareEarsTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEarsTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEarsTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEarsTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.earAt * 16) + lola.earBt);
        int Green = ((lola.earCt * 16) + lola.earDt);
        int Blue = ((lola.earEt * 16) + lola.earFt);
        HareEarsTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEarsOneMethod() {
        HareEarsOneView = (ImageView) findViewById(R.id.HareEarsViewOne);
        HareEarsOneView.setImageResource(Ears[hairy.EarsType]);
        HareEarsOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareEarsOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareEarsOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareEarsOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.earAt * 16) + hairy.earBt);
        int Green = ((hairy.earCt * 16) + hairy.earDt);
        int Blue = ((hairy.earEt * 16) + hairy.earFt);
        int earalpha = (hairy.HareAlpha );
        HareEarsOneView.setColorFilter(Color.argb(earalpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void ButtonImageScalerOne() {


        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) SelectParentOneImageButton.getLayoutParams();
        SelectParentEarsOneImageButton.requestLayout();
        SelectParentEyesOneImageButton.requestLayout();
        SelectParentOneImageButton.requestLayout();
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4));
        SelectParentEarsOneImageButton.getLayoutParams().height = earscaler;
        int eyescaler = ((convertToDp(hairy.size)) - (((convertToDp(hairy.size)) * 2) / 3));
        SelectParentEarsOneImageButton.getLayoutParams().width = (convertToDp(hairy.size) / 2);
        SelectParentEyesOneImageButton.getLayoutParams().height = eyescaler;
        params.height = convertToDp(hairy.size) * 2;
        SelectParentEyesOneImageButton.getLayoutParams().width = convertToDp(hairy.size);
        params.width = convertToDp(hairy.size) * 2;
        SelectParentOneImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        SelectParentEarsOneImageButton.setScaleType(ImageView.ScaleType.FIT_XY); // should be image button?
    }

    public void DisplayEyesOneMethod() {
        HareEyesOneView = (ImageView) findViewById(R.id.HareEyesViewOne);
        HareEyesOneView.setImageResource(Eyes[hairy.EyesType]);
        HareEyesOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareEyesOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareEyesOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareEyesOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.eyeAt * 16) + hairy.eyeBt);
        int Green = ((hairy.eyeCt * 16) + hairy.eyeDt);
        int Blue = ((hairy.eyeEt * 16) + hairy.eyeFt);
        int eyealpha = (hairy.HareAlpha); // / (new Random().nextInt(3) + 1));
        HareEyesOneView.setColorFilter(Color.argb(eyealpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayBodyOneMethod() {

        HareBodyOneView = (ImageView) findViewById(R.id.HareBodyViewOne);
        HareBodyOneView.setImageResource(Bodies[hairy.BodyType]);
        HareBodyOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        int earscaler = ((convertToDp(hairy.size)) - ((convertToDp(hairy.size)) / 4)); //*convertToDp(hairy.size));
        HareBodyOneView.getLayoutParams().height = convertToDp(hairy.size);
        //  Image newImage = HareEarsOneView.getScaledInstance(hairy.size, hairy.EarsLength, R.drawable.rabbitearspointy.SCALE_SMOOTH);//no clue
        HareBodyOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareBodyOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((hairy.At * 16) + hairy.Bt);
        int Green = ((hairy.Ct * 16) + hairy.Dt);
        int Blue = ((hairy.Et * 16) + hairy.Ft);
        int alpha = (hairy.HareAlpha);
        HareBodyOneView.setColorFilter(Color.argb(alpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyOneMethod() {
        HareBodyBabyOneView = (ImageView) findViewById(R.id.HareBodyViewBabyOne);
        HareBodyBabyOneView.setImageResource(Bodies[BabyOne.BodyType]);
        HareBodyBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.BabyFrameOneBody);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.At * 16) + BabyOne.Bt);
        int Green = ((BabyOne.Ct * 16) + BabyOne.Dt);
        int Blue = ((BabyOne.Et * 16) + BabyOne.Ft);
        HareBodyBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyOneMethod() {
        HareEarsBabyOneView = (ImageView) findViewById(R.id.BabyHareEarsViewOne);
        HareEarsBabyOneView.setImageResource(Ears[BabyOne.EarsType]);
        HareEarsBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneEarsLayout = (FrameLayout) findViewById(R.id.BabyFrameOneEars);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneEarsLayout.setLayoutParams(WrapParam);
        BabyFrameOneEarsLayout.setLayoutParams(CenterParam);

        HareEarsBabyOneView.setLayoutParams(CenterParam);
        HareEarsBabyOneView.setLayoutParams(WrapParam);
        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyOneView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyOne.earAt * 16) + BabyOne.earBt);
        int Green = ((BabyOne.earCt * 16) + BabyOne.earDt);
        int Blue = ((BabyOne.earEt * 16) + BabyOne.earFt);
        HareEarsBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEyesBabyOneMethod() {
        HareEyesBabyOneView = (ImageView) findViewById(R.id.BabyHareEyesViewOne);
        HareEyesBabyOneView.setImageResource(Eyes[BabyOne.EyesType]);
        HareEyesBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneEyesLayout = (FrameLayout) findViewById(R.id.BabyFrameOneEyes);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneEyesLayout.setLayoutParams(WrapParam);
        BabyFrameOneEyesLayout.setLayoutParams(CenterParam);

        int eyescaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareEyesBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareEyesBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.eyeAt * 16) + BabyOne.eyeBt);
        int Green = ((BabyOne.eyeCt * 16) + BabyOne.eyeDt);
        int Blue = ((BabyOne.eyeEt * 16) + BabyOne.eyeFt);
        HareEyesBabyOneView.setColorFilter(Color.argb(BabyOne.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyTwoMethod() {
        HareEarsBabyTwoView = (ImageView) findViewById(R.id.HareEarsViewBabyTwo);
        HareEarsBabyTwoView.setImageResource(Ears[BabyTwo.EarsType]);
        HareEarsBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoEarsLayout.setLayoutParams(WrapParam);
        BabyFrameTwoEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.earAt * 16) + BabyTwo.earBt);
        int Green = ((BabyTwo.earCt * 16) + BabyTwo.earDt);
        int Blue = ((BabyTwo.earEt * 16) + BabyTwo.earFt);
        HareEarsBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyTwoMethod() {
        HareEyesBabyTwoView = (ImageView) findViewById(R.id.HareEyesViewBabyTwo);
        HareEyesBabyTwoView.setImageResource(Eyes[BabyTwo.EyesType]);
        HareEyesBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoEyesLayout.setLayoutParams(WrapParam);
        BabyFrameTwoEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.eyeAt * 16) + BabyTwo.eyeBt);
        int Green = ((BabyTwo.eyeCt * 16) + BabyTwo.eyeDt);
        int Blue = ((BabyTwo.eyeEt * 16) + BabyTwo.eyeFt);
        HareEyesBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyTwoMethod() {
        HareBodyBabyTwoView = (ImageView) findViewById(R.id.HareBodyViewBabyTwo);

        HareBodyBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyTwoView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyTwoView.setImageResource(Bodies[BabyTwo.BodyType]);
        HareBodyBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyTwoView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.At * 16) + BabyTwo.Bt);
        int Green = ((BabyTwo.Ct * 16) + BabyTwo.Dt);
        int Blue = ((BabyTwo.Et * 16) + BabyTwo.Ft);
        HareBodyBabyTwoView.setColorFilter(Color.argb(BabyTwo.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyThreeMethod() {
        HareEarsBabyThreeView = (ImageView) findViewById(R.id.HareEarsViewBabyThree);
        HareEarsBabyThreeView.setImageResource(Ears[BabyThree.EarsType]);
        HareEarsBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeEarsLayout.setLayoutParams(WrapParam);
        BabyFrameThreeEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.earAt * 16) + BabyThree.earBt);
        int Green = ((BabyThree.earCt * 16) + BabyThree.earDt);
        int Blue = ((BabyThree.earEt * 16) + BabyThree.earFt);
        HareEarsBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyThreeMethod() {
        HareEyesBabyThreeView = (ImageView) findViewById(R.id.HareEyesViewBabyThree);
        HareEyesBabyThreeView.setImageResource(Eyes[BabyThree.EyesType]);
        HareEyesBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeEyesLayout.setLayoutParams(WrapParam);
        BabyFrameThreeEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.earAt * 16) + BabyThree.earBt);
        int Green = ((BabyThree.earCt * 16) + BabyThree.earDt);
        int Blue = ((BabyThree.earEt * 16) + BabyThree.earFt);
        HareEyesBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyThreeMethod() {
        HareBodyBabyThreeView = (ImageView) findViewById(R.id.HareBodyViewBabyThree);

        HareBodyBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyThreeView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyThreeView.setImageResource(Bodies[BabyThree.BodyType]);
        HareBodyBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyThreeView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyThree.At * 16) + BabyThree.Bt);
        int Green = ((BabyThree.Ct * 16) + BabyThree.Dt);
        int Blue = ((BabyThree.Et * 16) + BabyThree.Ft);
        HareBodyBabyThreeView.setColorFilter(Color.argb(BabyThree.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyFourMethod() {
        HareEarsBabyFourView = (ImageView) findViewById(R.id.HareEarsViewBabyFour);
        HareEarsBabyFourView.setImageResource(Ears[BabyFour.EarsType]);
        HareEarsBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourEarsLayout.setLayoutParams(WrapParam);
        BabyFrameFourEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareEarsBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);

        int Red = ((BabyFour.earAt * 16) + BabyFour.earBt);
        int Green = ((BabyFour.earCt * 16) + BabyFour.earDt);
        int Blue = ((BabyFour.earEt * 16) + BabyFour.earFt);
        HareEarsBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyFourMethod() {
        HareEyesBabyFourView = (ImageView) findViewById(R.id.HareEyesViewBabyFour);
        HareEyesBabyFourView.setImageResource(Eyes[BabyFour.EyesType]);
        HareEyesBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourEyesLayout.setLayoutParams(WrapParam);
        BabyFrameFourEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyFourView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.earAt * 16) + BabyFour.earBt);
        int Green = ((BabyFour.earCt * 16) + BabyFour.earDt);
        int Blue = ((BabyFour.earEt * 16) + BabyFour.earFt);
        HareEyesBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyFourMethod() {
        HareBodyBabyFourView = (ImageView) findViewById(R.id.HareBodyViewBabyFour);

        HareBodyBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFourView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyFourView.setImageResource(Bodies[BabyFour.BodyType]);
        HareBodyBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.At * 16) + BabyFour.Bt);
        int Green = ((BabyFour.Ct * 16) + BabyFour.Dt);
        int Blue = ((BabyFour.Et * 16) + BabyFour.Ft);
        HareBodyBabyFourView.setColorFilter(Color.argb(BabyFour.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabyFiveMethod() {
        HareEarsBabyFiveView = (ImageView) findViewById(R.id.HareEarsViewBabyFive);
        HareEarsBabyFiveView.setImageResource(Ears[BabyFive.EarsType]);
        HareEarsBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveEarsLayout.setLayoutParams(WrapParam);
        BabyFrameFiveEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.earAt * 16) + BabyFive.earBt);
        int Green = ((BabyFive.earCt * 16) + BabyFive.earDt);
        int Blue = ((BabyFive.earEt * 16) + BabyFive.earFt);
        HareEarsBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyFiveMethod() {
        HareEyesBabyFiveView = (ImageView) findViewById(R.id.HareEyesViewBabyFive);
        HareEyesBabyFiveView.setImageResource(Eyes[BabyFive.EyesType]);
        HareEyesBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveEyesLayout.setLayoutParams(WrapParam);
        BabyFrameFiveEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.earAt * 16) + BabyFive.earBt);
        int Green = ((BabyFive.earCt * 16) + BabyFive.earDt);
        int Blue = ((BabyFive.earEt * 16) + BabyFive.earFt);
        HareEyesBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyFiveMethod() {
        HareBodyBabyFiveView = (ImageView) findViewById(R.id.HareBodyViewBabyFive);

        HareBodyBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFiveView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyFiveView.setImageResource(Bodies[BabyFive.BodyType]);
        HareBodyBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyFiveView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.At * 16) + BabyFive.Bt);
        int Green = ((BabyFive.Ct * 16) + BabyFive.Dt);
        int Blue = ((BabyFive.Et * 16) + BabyFive.Ft);
        HareBodyBabyFiveView.setColorFilter(Color.argb(BabyFive.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEarsBabySixMethod() {
        HareEarsBabySixView = (ImageView) findViewById(R.id.HareEarsViewBabySix);
        HareEarsBabySixView.setImageResource(Ears[BabySix.EarsType]);
        HareEarsBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixEarsLayout.setLayoutParams(WrapParam);
        BabyFrameSixEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.earAt * 16) + BabySix.earBt);
        int Green = ((BabySix.earCt * 16) + BabySix.earDt);
        int Blue = ((BabySix.earEt * 16) + BabySix.earFt);
        HareEarsBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabySixMethod() {
        HareEyesBabySixView = (ImageView) findViewById(R.id.HareEyesViewBabySix);
        HareEyesBabySixView.setImageResource(Eyes[BabySix.EyesType]);
        HareEyesBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixEyesLayout.setLayoutParams(WrapParam);
        BabyFrameSixEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.eyeAt * 16) + BabySix.eyeBt);
        int Green = ((BabySix.eyeCt * 16) + BabySix.eyeDt);
        int Blue = ((BabySix.eyeEt * 16) + BabySix.eyeFt);
        HareEyesBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabySixMethod() {
        HareBodyBabySixView = (ImageView) findViewById(R.id.HareBodyViewBabySix);

        HareBodyBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySixView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabySixView.setImageResource(Bodies[BabySix.BodyType]);
        HareBodyBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySixView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.At * 16) + BabySix.Bt);
        int Green = ((BabySix.Ct * 16) + BabySix.Dt);
        int Blue = ((BabySix.Et * 16) + BabySix.Ft);
        HareBodyBabySixView.setColorFilter(Color.argb(BabySix.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEarsBabySevenMethod() {
        HareEarsBabySevenView = (ImageView) findViewById(R.id.HareEarsViewBabySeven);
        HareEarsBabySevenView.setImageResource(Ears[BabySeven.EarsType]);
        HareEarsBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenEarsLayout.setLayoutParams(WrapParam);
        BabyFrameSevenEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.earAt * 16) + BabySeven.earBt);
        int Green = ((BabySeven.earCt * 16) + BabySeven.earDt);
        int Blue = ((BabySeven.earEt * 16) + BabySeven.earFt);
        HareEarsBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabySevenMethod() {
        HareEyesBabySevenView = (ImageView) findViewById(R.id.HareEyesViewBabySeven);
        HareEyesBabySevenView.setImageResource(Eyes[BabySeven.EyesType]);
        HareEyesBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenEyesLayout.setLayoutParams(WrapParam);
        BabyFrameSevenEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.eyeAt * 16) + BabySeven.eyeBt);
        int Green = ((BabySeven.eyeCt * 16) + BabySeven.eyeDt);
        int Blue = ((BabySeven.eyeEt * 16) + BabySeven.eyeFt);
        HareEyesBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabySevenMethod() {
        HareBodyBabySevenView = (ImageView) findViewById(R.id.HareBodyViewBabySeven);

        HareBodyBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySevenView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabySevenView.setImageResource(Bodies[BabySeven.BodyType]);
        HareBodyBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabySevenView.getLayoutParams().width = convertToDp(babydimension);
        HareBodyBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.At * 16) + BabySeven.Bt);
        int Green = ((BabySeven.Ct * 16) + BabySeven.Dt);
        int Blue = ((BabySeven.Et * 16) + BabySeven.Ft);
        HareBodyBabySevenView.setColorFilter(Color.argb(BabySeven.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }


    public void DisplayEarsBabyEightMethod() {
        HareEarsBabyEightView = (ImageView) findViewById(R.id.HareEarsViewBabyEight);
        HareEarsBabyEightView.setImageResource(Ears[BabyEight.EarsType]);
        HareEarsBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightEarsLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightEarsLayout.setLayoutParams(WrapParam);
        BabyFrameEightEarsLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEarsBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareEarsBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareEarsBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.earAt * 16) + BabyEight.earBt);
        int Green = ((BabyEight.earCt * 16) + BabyEight.earDt);
        int Blue = ((BabyEight.earEt * 16) + BabyEight.earFt);
        HareEarsBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayEyesBabyEightMethod() {
        HareEyesBabyEightView = (ImageView) findViewById(R.id.HareEyesViewBabyEight);
        HareEyesBabyEightView.setImageResource(Eyes[BabyEight.EyesType]);
        HareEyesBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightEyesLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightEyesLayout.setLayoutParams(WrapParam);
        BabyFrameEightEyesLayout.setLayoutParams(CenterParam);

        int earscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension)) / 4));
        HareEyesBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareEyesBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareEyesBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.eyeAt * 16) + BabyEight.eyeBt);
        int Green = ((BabyEight.eyeCt * 16) + BabyEight.eyeDt);
        int Blue = ((BabyEight.eyeEt * 16) + BabyEight.eyeFt);
        HareEyesBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareEyesOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayBodyBabyEightMethod() {
        HareBodyBabyEightView = (ImageView) findViewById(R.id.HareBodyViewBabyEight);

        HareBodyBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;
        /*
        Matrix mat = new Matrix();
        Bitmap bMap = BitmapFactory.decodeResource(getResources(),Bodies[BabyEight.BodyType]);
        mat.postRotate(BabyEight.AngleTotal);

        angletesterone = BabyEight.AngleTotal%180;
        angletestertwo = angletesterone%90;

        if (angletestertwo == 1){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*348)/10000) ;
        }else if(angletestertwo == 2){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*696)/10000) ;
        }else if(angletestertwo == 3){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1044)/10000) ;
        }else if(angletestertwo == 4){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1392)/10000) ;
        }else if(angletestertwo == 5){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*1736)/10000) ;
        }else if(angletestertwo == 6){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2080)/10000) ;
        }else if(angletestertwo == 7){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2420)/10000) ;
        }else if(angletestertwo == 8){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*2756)/10000) ;
        }else if(angletestertwo == 9){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3092)/10000) ;
        }else if(angletestertwo == 10){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3420)/10000) ;
        }else if(angletestertwo == 11){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*3748)/10000) ;
        }else if(angletestertwo == 12){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4068)/10000) ;
        }else if(angletestertwo == 13){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4384)/10000) ;
        }else if(angletestertwo == 14){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*4696)/10000) ;
        }else if(angletestertwo == 15){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5000)/10000) ;
        }else if(angletestertwo == 16){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5300)/10000) ;
        }else if(angletestertwo == 17){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5592)/10000) ;
        }else if(angletestertwo == 18){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*5876)/10000) ;
        }else if(angletestertwo == 19){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6156)/10000) ;
        }else if(angletestertwo == 20){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6428)/10000) ;
        }else if(angletestertwo == 21){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6692)/10000) ;
        }else if(angletestertwo == 22){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*6948)/10000) ;
        }else if(angletestertwo == 23){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*7192)/10000) ;
        }else if(angletestertwo == 24){
            angleproduct =  convertToDp(babydimension) + ((convertToDp(babydimension)*7432)/10000) ;
        }




        Bitmap bMapRotate = Bitmap.createBitmap(bMap, 0, 0,angleproduct, angleproduct, mat, true);
        HareBodyBabyEightView.setImageBitmap(bMapRotate);
        */
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyEightView.setImageResource(Bodies[BabyEight.BodyType]);

        HareBodyBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareBodyBabyEightView.getLayoutParams().width = convertToDp(babydimension);

        HareBodyBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.At * 16) + BabyEight.Bt);
        int Green = ((BabyEight.Ct * 16) + BabyEight.Dt);
        int Blue = ((BabyEight.Et * 16) + BabyEight.Ft);
        HareBodyBabyEightView.setColorFilter(Color.argb(harealphaeight, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint



    }


    public void DisplayBodyTwoMethod() {
        HareBodyTwoView = (ImageView) findViewById(R.id.HareBodyViewParentTwo);
        HareBodyTwoView.setImageResource(Bodies[lola.BodyType]);
        HareBodyTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareBodyFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareBodyTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareBodyTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareBodyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.At * 16) + lola.Bt);
        int Green = ((lola.Ct * 16) + lola.Dt);
        int Blue = ((lola.Et * 16) + lola.Ft);
        HareBodyTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareBodyOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEarsTwoMethod() {
        HareEarsTwoView = (ImageView) findViewById(R.id.HareEarsViewParentTwo);
        HareEarsTwoView.setImageResource(Ears[lola.EarsType]);
        HareEarsTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEarsFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEarsTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEarsTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEarsTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.earAt * 16) + lola.earBt);
        int Green = ((lola.earCt * 16) + lola.earDt);
        int Blue = ((lola.earEt * 16) + lola.earFt);
        HareEarsTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEarsOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public void DisplayEyeTwoMethod() {
        HareEyesTwoView = (ImageView) findViewById(R.id.HareEyesViewParentTwo);
        HareEyesTwoView.setImageResource(Eyes[lola.EyesType]);
        HareEyesTwoView.requestLayout();
        FrameLayout BabyFrameOneLayout = (FrameLayout) findViewById(R.id.HareEyesFrameViewParentTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        BabyFrameOneLayout.setLayoutParams(WrapParam);
        BabyFrameOneLayout.setLayoutParams(CenterParam);
        HareEyesTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareEyesTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareEyesTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.eyeAt * 16) + lola.eyeBt);
        int Green = ((lola.eyeCt * 16) + lola.eyeDt);
        int Blue = ((lola.eyeEt * 16) + lola.eyeFt);
        HareEyesTwoView.setColorFilter(Color.argb(lola.HareAlpha, Red, Green, Blue)); // Random Tint
        // HareEyeOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint
    }

    public int SetSizeMethod() {
        //int sizesetter = sizesetter;
        return (Math.round(new Random().nextInt(79) + 60)/5);

    }

    public int SetRotation() {
        return (new Random().nextInt(37));
    }

    public int BodyTypeMethod() {
        int specialbody = new Random().nextInt(2);
        if (specialbody == 0) {
            return new Random().nextInt(12);
        } else {
            return new Random().nextInt(3);
        }

    }

    public int SetAlphaMethod() {

        int Alpha = (new Random().nextInt(128) + 64);
        return Alpha;
    }

    public int A(){
        return new Random().nextInt(4);

    }
    public int B() {

        int GeneticMutationFrequency = 120;
        int GeneticSwitcher = new Random().nextInt(GeneticMutationFrequency);


        if (GeneticSwitcher == 0) {

            return -1;
        } else if (GeneticSwitcher == 1) {

            return 1;
        } else {

            return 0;
        }
    }
    public int C() {

        int GeneticMutationFrequency = 12;
        int GeneticSwitcher = new Random().nextInt(GeneticMutationFrequency);


        if (GeneticSwitcher == 0) {

            return -1;
        } else if (GeneticSwitcher == 1) {

            return 1;
        } else if (GeneticSwitcher == 2) {

            return 2;
        } else if (GeneticSwitcher == 3) {

            return -2;
        } else if (GeneticSwitcher == 4) {

            return 3;
        } else if (GeneticSwitcher == 5) {

            return -3;
        } else if (GeneticSwitcher == 6) {

            return 4;
        }else if (GeneticSwitcher == 7) {

            return -4;
        } else {

            return 0;
        }
    }


    public int SetTailAlphaMethod() {

        int Alpha = (new Random().nextInt(128) + 64);
        Alpha = Alpha/2;
        Alpha = Math.round(Alpha);


        return Alpha;
    }




    public void SetBabiesInvisible() {
        HareBodyBabyOneView.setVisibility(View.INVISIBLE);
        HareBodyBabyTwoView.setVisibility(View.INVISIBLE);
        HareBodyBabyThreeView.setVisibility(View.INVISIBLE);
        HareBodyBabyFourView.setVisibility(View.INVISIBLE);
        HareBodyBabyFiveView.setVisibility(View.INVISIBLE);
        HareBodyBabySixView.setVisibility(View.INVISIBLE);
        HareBodyBabySevenView.setVisibility(View.INVISIBLE);
        HareBodyBabyEightView.setVisibility(View.INVISIBLE);

        HareEarsBabyOneView.setVisibility(View.INVISIBLE);
        HareEarsBabyTwoView.setVisibility(View.INVISIBLE);
        HareEarsBabyThreeView.setVisibility(View.INVISIBLE);
        HareEarsBabyFourView.setVisibility(View.INVISIBLE);
        HareEarsBabyFiveView.setVisibility(View.INVISIBLE);
        HareEarsBabySixView.setVisibility(View.INVISIBLE);
        HareEarsBabySevenView.setVisibility(View.INVISIBLE);
        HareEarsBabyEightView.setVisibility(View.INVISIBLE);

        HareEyesBabyOneView.setVisibility(View.INVISIBLE);
        HareEyesBabyTwoView.setVisibility(View.INVISIBLE);
        HareEyesBabyThreeView.setVisibility(View.INVISIBLE);
        HareEyesBabyFourView.setVisibility(View.INVISIBLE);
        HareEyesBabyFiveView.setVisibility(View.INVISIBLE);
        HareEyesBabySixView.setVisibility(View.INVISIBLE);
        HareEyesBabySevenView.setVisibility(View.INVISIBLE);
        HareEyesBabyEightView.setVisibility(View.INVISIBLE);


        HareTailBabyOneView.setVisibility(View.INVISIBLE);
        HareTailBabyTwoView.setVisibility(View.INVISIBLE);
        HareTailBabyThreeView.setVisibility(View.INVISIBLE);
        HareTailBabyFourView.setVisibility(View.INVISIBLE);
        HareTailBabyFiveView.setVisibility(View.INVISIBLE);
        HareTailBabySixView.setVisibility(View.INVISIBLE);
        HareTailBabySevenView.setVisibility(View.INVISIBLE);
        HareTailBabyEightView.setVisibility(View.INVISIBLE);
    }

    public void SetBabiesDeleted() {
        HareBodyBabyOneView.setImageResource(R.drawable.noerror);
        HareBodyBabyTwoView.setImageResource(R.drawable.noerror);
        HareBodyBabyThreeView.setImageResource(R.drawable.noerror);
        HareBodyBabyFourView.setImageResource(R.drawable.noerror);
        HareBodyBabyFiveView.setImageResource(R.drawable.noerror);
        HareBodyBabySixView.setImageResource(R.drawable.noerror);
        HareBodyBabySevenView.setImageResource(R.drawable.noerror);
        HareBodyBabyEightView.setImageResource(R.drawable.noerror);

        HareEarsBabyOneView.setImageResource(R.drawable.noerror);
        HareEarsBabyTwoView.setImageResource(R.drawable.noerror);
        HareEarsBabyThreeView.setImageResource(R.drawable.noerror);
        HareEarsBabyFourView.setImageResource(R.drawable.noerror);
        HareEarsBabyFiveView.setImageResource(R.drawable.noerror);
        HareEarsBabySixView.setImageResource(R.drawable.noerror);
        HareEarsBabySevenView.setImageResource(R.drawable.noerror);
        HareEarsBabyEightView.setImageResource(R.drawable.noerror);

        HareEyesBabyOneView.setImageResource(R.drawable.noerror);
        HareEyesBabyTwoView.setImageResource(R.drawable.noerror);
        HareEyesBabyThreeView.setImageResource(R.drawable.noerror);
        HareEyesBabyFourView.setImageResource(R.drawable.noerror);
        HareEyesBabyFiveView.setImageResource(R.drawable.noerror);
        HareEyesBabySixView.setImageResource(R.drawable.noerror);
        HareEyesBabySevenView.setImageResource(R.drawable.noerror);
        HareEyesBabyEightView.setImageResource(R.drawable.noerror);


        HareTailBabyOneView.setImageResource(R.drawable.noerror);
        HareTailBabyTwoView.setImageResource(R.drawable.noerror);
        HareTailBabyThreeView.setImageResource(R.drawable.noerror);
        HareTailBabyFourView.setImageResource(R.drawable.noerror);
        HareTailBabyFiveView.setImageResource(R.drawable.noerror);
        HareTailBabySixView.setImageResource(R.drawable.noerror);
        HareTailBabySevenView.setImageResource(R.drawable.noerror);
        HareTailBabyEightView.setImageResource(R.drawable.noerror);
    }

    public void SetAdultsInvisible() {

        HareTailOneView.setVisibility(View.INVISIBLE);
        HareBodyOneView.setVisibility(View.INVISIBLE);
        HareEarsOneView.setVisibility(View.INVISIBLE);
        HareEyesOneView.setVisibility(View.INVISIBLE);

        HareTailTwoView.setVisibility(View.INVISIBLE);
        HareBodyTwoView.setVisibility(View.INVISIBLE);
        HareEarsTwoView.setVisibility(View.INVISIBLE);
        HareEyesTwoView.setVisibility(View.INVISIBLE);

    }

    public void SetAdultsVisible() {

        HareTailOneView.setVisibility(View.VISIBLE);
        HareBodyOneView.setVisibility(View.VISIBLE);
        HareEarsOneView.setVisibility(View.VISIBLE);
        HareEyesOneView.setVisibility(View.VISIBLE);

        HareTailTwoView.setVisibility(View.VISIBLE);
        HareBodyTwoView.setVisibility(View.VISIBLE);
        HareEarsTwoView.setVisibility(View.VISIBLE);
        HareEyesTwoView.setVisibility(View.VISIBLE);

    }

    public Hare BabyMethod(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


            for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 136; ArrayCreationLoopCounter++) {
                int checker = new Random().nextInt((Lengthcointer - countup));
                if (checker < steps) {
                    swapcounter = (swapcounter + 1) % 2;
                    steps = 0;
                } else {
                    steps = steps + 1;
                }

                if (swapcounter == 1) {
                    babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
                } else if (swapcounter == 0) {
                    babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
                } else {
                    babyhare.Samething[ArrayCreationLoopCounter] = 0;
                }
                Lengthcointer = Lengthcointer - 1;
            }





            babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;

/*
        babyhare.tailAt0 = Math.max(parentone.tailAt0 , parenttwo.tailAt0);
        babyhare.tailBt0 = Math.max(parentone.tailBt0 , parenttwo.tailBt0);
        babyhare.tailCt0 = Math.max(parentone.tailCt0 , parenttwo.tailCt0);
        babyhare.tailDt0 = Math.max(parentone.tailDt0 , parenttwo.tailDt0);
        babyhare.tailEt0 = Math.max(parentone.tailEt0 , parenttwo.tailEt0);
        babyhare.tailFt0 = Math.max(parentone.tailFt0 , parenttwo.tailFt0);

        babyhare.tailAt1 = Math.max(parentone.tailAt1 , parenttwo.tailAt1);
        babyhare.tailBt1 = Math.max(parentone.tailBt1 , parenttwo.tailBt1);
        babyhare.tailCt1 = Math.max(parentone.tailCt1 , parenttwo.tailCt1);
        babyhare.tailDt1 = Math.max(parentone.tailDt1 , parenttwo.tailDt1);
        babyhare.tailEt1 = Math.max(parentone.tailEt1 , parenttwo.tailEt1);
        babyhare.tailFt1 = Math.max(parentone.tailFt1 , parenttwo.tailFt1);

        babyhare.tailAt2 = Math.max(parentone.tailAt2 , parenttwo.tailAt2);
        babyhare.tailBt2 = Math.max(parentone.tailBt2 , parenttwo.tailBt2);
        babyhare.tailCt2 = Math.max(parentone.tailCt2 , parenttwo.tailCt2);
        babyhare.tailDt2 = Math.max(parentone.tailDt2 , parenttwo.tailDt2);
        babyhare.tailEt2 = Math.max(parentone.tailEt2 , parenttwo.tailEt2);
        babyhare.tailFt2 = Math.max(parentone.tailFt2 , parenttwo.tailFt2);

        babyhare.tailAt3 = Math.max(parentone.tailAt3 , parenttwo.tailAt3);
        babyhare.tailBt3 = Math.max(parentone.tailBt3 , parenttwo.tailBt3);
        babyhare.tailCt3 = Math.max(parentone.tailCt3 , parenttwo.tailCt3);
        babyhare.tailDt3 = Math.max(parentone.tailDt3 , parenttwo.tailDt3);
        babyhare.tailEt3 = Math.max(parentone.tailEt3 , parenttwo.tailEt3);
        babyhare.tailFt3 = Math.max(parentone.tailFt3 , parenttwo.tailFt3);

        babyhare.tailAt4 = Math.max(parentone.tailAt4 , parenttwo.tailAt4);
        babyhare.tailBt4 = Math.max(parentone.tailBt4 , parenttwo.tailBt4);
        babyhare.tailCt4 = Math.max(parentone.tailCt4 , parenttwo.tailCt4);
        babyhare.tailDt4 = Math.max(parentone.tailDt4 , parenttwo.tailDt4);
        babyhare.tailEt4 = Math.max(parentone.tailEt4 , parenttwo.tailEt4);
        babyhare.tailFt4 = Math.max(parentone.tailFt4 , parenttwo.tailFt4);


        babyhare.eyeAt0 = Math.max(parentone.eyeAt0 , parenttwo.eyeAt0);
        babyhare.eyeBt0 = Math.max(parentone.eyeBt0 , parenttwo.eyeBt0);
        babyhare.eyeCt0 = Math.max(parentone.eyeCt0 , parenttwo.eyeCt0);
        babyhare.eyeDt0 = Math.max(parentone.eyeDt0 , parenttwo.eyeDt0);
        babyhare.eyeEt0 = Math.max(parentone.eyeEt0 , parenttwo.eyeEt0);
        babyhare.eyeFt0 = Math.max(parentone.eyeFt0 , parenttwo.eyeFt0);

        babyhare.eyeAt1 = Math.max(parentone.eyeAt1 , parenttwo.eyeAt1);
        babyhare.eyeBt1 = Math.max(parentone.eyeBt1 , parenttwo.eyeBt1);
        babyhare.eyeCt1 = Math.max(parentone.eyeCt1 , parenttwo.eyeCt1);
        babyhare.eyeDt1 = Math.max(parentone.eyeDt1 , parenttwo.eyeDt1);
        babyhare.eyeEt1 = Math.max(parentone.eyeEt1 , parenttwo.eyeEt1);
        babyhare.eyeFt1 = Math.max(parentone.eyeFt1 , parenttwo.eyeFt1);

        babyhare.eyeAt2 = Math.max(parentone.eyeAt2 , parenttwo.eyeAt2);
        babyhare.eyeBt2 = Math.max(parentone.eyeBt2 , parenttwo.eyeBt2);
        babyhare.eyeCt2 = Math.max(parentone.eyeCt2 , parenttwo.eyeCt2);
        babyhare.eyeDt2 = Math.max(parentone.eyeDt2 , parenttwo.eyeDt2);
        babyhare.eyeEt2 = Math.max(parentone.eyeEt2 , parenttwo.eyeEt2);
        babyhare.eyeFt2 = Math.max(parentone.eyeFt2 , parenttwo.eyeFt2);

        babyhare.eyeAt3 = Math.max(parentone.eyeAt3 , parenttwo.eyeAt3);
        babyhare.eyeBt3 = Math.max(parentone.eyeBt3 , parenttwo.eyeBt3);
        babyhare.eyeCt3 = Math.max(parentone.eyeCt3 , parenttwo.eyeCt3);
        babyhare.eyeDt3 = Math.max(parentone.eyeDt3 , parenttwo.eyeDt3);
        babyhare.eyeEt3 = Math.max(parentone.eyeEt3 , parenttwo.eyeEt3);
        babyhare.eyeFt3 = Math.max(parentone.eyeFt3 , parenttwo.eyeFt3);

        babyhare.eyeAt4 = Math.max(parentone.eyeAt4 , parenttwo.eyeAt4);
        babyhare.eyeBt4 = Math.max(parentone.eyeBt4 , parenttwo.eyeBt4);
        babyhare.eyeCt4 = Math.max(parentone.eyeCt4 , parenttwo.eyeCt4);
        babyhare.eyeDt4 = Math.max(parentone.eyeDt4 , parenttwo.eyeDt4);
        babyhare.eyeEt4 = Math.max(parentone.eyeEt4 , parenttwo.eyeEt4);
        babyhare.eyeFt4 = Math.max(parentone.eyeFt4 , parenttwo.eyeFt4);


        babyhare.earAt0 = Math.max(parentone.earAt0 , parenttwo.earAt0);
        babyhare.earBt0 = Math.max(parentone.earBt0 , parenttwo.earBt0);
        babyhare.earCt0 = Math.max(parentone.earCt0 , parenttwo.earCt0);
        babyhare.earDt0 = Math.max(parentone.earDt0 , parenttwo.earDt0);
        babyhare.earEt0 = Math.max(parentone.earEt0 , parenttwo.earEt0);
        babyhare.earFt0 = Math.max(parentone.earFt0 , parenttwo.earFt0);

        babyhare.earAt1 = Math.max(parentone.earAt1 , parenttwo.earAt1);
        babyhare.earBt1 = Math.max(parentone.earBt1 , parenttwo.earBt1);
        babyhare.earCt1 = Math.max(parentone.earCt1 , parenttwo.earCt1);
        babyhare.earDt1 = Math.max(parentone.earDt1 , parenttwo.earDt1);
        babyhare.earEt1 = Math.max(parentone.earEt1 , parenttwo.earEt1);
        babyhare.earFt1 = Math.max(parentone.earFt1 , parenttwo.earFt1);

        babyhare.earAt2 = Math.max(parentone.earAt2 , parenttwo.earAt2);
        babyhare.earBt2 = Math.max(parentone.earBt2 , parenttwo.earBt2);
        babyhare.earCt2 = Math.max(parentone.earCt2 , parenttwo.earCt2);
        babyhare.earDt2 = Math.max(parentone.earDt2 , parenttwo.earDt2);
        babyhare.earEt2 = Math.max(parentone.earEt2 , parenttwo.earEt2);
        babyhare.earFt2 = Math.max(parentone.earFt2 , parenttwo.earFt2);

        babyhare.earAt3 = Math.max(parentone.earAt3 , parenttwo.earAt3);
        babyhare.earBt3 = Math.max(parentone.earBt3 , parenttwo.earBt3);
        babyhare.earCt3 = Math.max(parentone.earCt3 , parenttwo.earCt3);
        babyhare.earDt3 = Math.max(parentone.earDt3 , parenttwo.earDt3);
        babyhare.earEt3 = Math.max(parentone.earEt3 , parenttwo.earEt3);
        babyhare.earFt3 = Math.max(parentone.earFt3 , parenttwo.earFt3);

        babyhare.earAt4 = Math.max(parentone.earAt4 , parenttwo.earAt4);
        babyhare.earBt4 = Math.max(parentone.earBt4 , parenttwo.earBt4);
        babyhare.earCt4 = Math.max(parentone.earCt4 , parenttwo.earCt4);
        babyhare.earDt4 = Math.max(parentone.earDt4 , parenttwo.earDt4);
        babyhare.earEt4 = Math.max(parentone.earEt4 , parenttwo.earEt4);
        babyhare.earFt4 = Math.max(parentone.earFt4 , parenttwo.earFt4);
*/

        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;




        babyhare.Sex = SetSexMethod();




        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }
        babyonesizedummy = babyhare.size;

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);

        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }



        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }

        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        // Intent intentHutch = new Intent(this, RabbitHutch.class);
        //  String catchname = "%s%s";
        //  String babyharecallname = String.format(catchname, "NewHare", babycounter);
        // intentHutch.putExtra(babyharecallname, babyhare);
        // intentHutch.putExtra("NewHare", hairy);
        if (babyOneCreatedCounter == 0) {
            BabyOne = babyhare;
            BabyHares[BabyNumber] = BabyOne;
            BabyNumber = BabyNumber + 1;
            babyOneCreatedCounter = babyOneCreatedCounter + 1;
            return BabyOne;
        } else {
            return BabyOne;
        }


    }

    public Hare BabyMethodTwo(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );


        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }





        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;

/*
        int childAt = (parentone.hexRed1 + parenttwo.hexRed1) / 2;
        babyhare.hexRed1 = Math.round(childAt);
        int childBt = (parentone.Bt + parenttwo.Bt) / 2;
        babyhare.Bt = Math.round(childBt);
        int childCt = (parentone.Ct + parenttwo.Ct) / 2;
        babyhare.Ct = Math.round(childCt);
        int childDt = (parentone.Dt + parenttwo.Dt) / 2;
        babyhare.Dt = Math.round(childDt);
        int childEt = (parentone.Et + parenttwo.Et) / 2;
        babyhare.Et = Math.round(childEt);
        int childFt = (parentone.Ft + parenttwo.Ft) / 2;
        babyhare.Ft = Math.round(childFt);


        int childeyeAt = (parentone.eyeAt + parenttwo.eyeAt) / 2;
        babyhare.eyeAt = Math.round(childeyeAt);
        int childeyeBt = (parentone.eyeBt + parenttwo.eyeBt) / 2;
        babyhare.eyeBt = Math.round(childeyeBt);
        int childeyeCt = (parentone.eyeCt + parenttwo.eyeCt) / 2;
        babyhare.eyeCt = Math.round(childeyeCt);
        int childeyeDt = (parentone.eyeDt + parenttwo.eyeDt) / 2;
        babyhare.eyeDt = Math.round(childeyeDt);
        int childeyeEt = (parentone.eyeEt + parenttwo.eyeEt) / 2;
        babyhare.eyeEt = Math.round(childeyeEt);
        int childeyeFt = (parentone.eyeFt + parenttwo.eyeFt) / 2;
        babyhare.eyeFt = Math.round(childeyeFt);

        int childtailAt = (parentone.tailAt + parenttwo.tailAt) / 2;
        babyhare.tailAt = Math.round(childtailAt);
        int childtailBt = (parentone.tailBt + parenttwo.tailBt) / 2;
        babyhare.tailBt = Math.round(childtailBt);
        int childtailCt = (parentone.tailCt + parenttwo.tailCt) / 2;
        babyhare.tailCt = Math.round(childtailCt);
        int childtailDt = (parentone.tailDt + parenttwo.tailDt) / 2;
        babyhare.tailDt = Math.round(childtailDt);
        int childtailEt = (parentone.tailEt + parenttwo.tailEt) / 2;
        babyhare.tailEt = Math.round(childtailEt);
        int childtailFt = (parentone.tailFt + parenttwo.tailFt) / 2;
        babyhare.tailFt = Math.round(childtailFt);


        int childearAt = (parentone.earAt + parenttwo.earAt) / 2;
        babyhare.earAt = Math.round(childearAt);
        int childearBt = (parentone.earBt + parenttwo.earBt) / 2;
        babyhare.earBt = Math.round(childearBt);
        int childearCt = (parentone.earCt + parenttwo.earCt) / 2;
        babyhare.earCt = Math.round(childearCt);
        int childearDt = (parentone.earDt + parenttwo.earDt) / 2;
        babyhare.earDt = Math.round(childearDt);
        int childearEt = (parentone.earEt + parenttwo.earEt) / 2;
        babyhare.earEt = Math.round(childearEt);
        int childearFt = (parentone.earFt + parenttwo.earFt) / 2;
        babyhare.earFt = Math.round(childearFt);
        */

        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyTwoCreatedCounter == 0) {
            BabyTwo = babyhare;
            BabyHares[BabyNumber] = BabyTwo;
            BabyNumber = BabyNumber + 1;
            babyTwoCreatedCounter = babyTwoCreatedCounter + 1;
            return BabyTwo;
        }
        return BabyTwo;
    }

    public Hare BabyMethodThree(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }





        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;

        /*
        babyhare.hexRed1 = (parentone.hexRed1 + parenttwo.hexRed1) % 16;
        babyhare.Bt = (parentone.Bt + parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct + parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt + parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et + parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft + parenttwo.Ft) % 16;

        babyhare.earAt = (parentone.earAt + parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt + parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt + parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt + parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt + parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt + parenttwo.earFt) % 16;

        babyhare.eyeAt = (parentone.eyeAt + parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt + parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt + parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt + parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt + parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt + parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt + parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt + parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt + parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt + parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt + parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt + parenttwo.tailFt) % 16;
*/
        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyThreeCreatedCounter == 0) {
            BabyThree = babyhare;
            BabyHares[BabyNumber] = BabyThree;
            BabyNumber = BabyNumber + 1;
            babyThreeCreatedCounter = babyThreeCreatedCounter + 1;
            return BabyThree;
        }
        return BabyThree;

    }

    public Hare BabyMethodFour(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }




        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;



        /*
        babyhare.hexRed1 = Math.abs(parentone.hexRed1 - parenttwo.hexRed1);
        babyhare.Bt = Math.abs(parentone.Bt - parenttwo.Bt);
        babyhare.Ct = Math.abs(parentone.Ct - parenttwo.Ct);
        babyhare.Dt = Math.abs(parentone.Dt - parenttwo.Dt);
        babyhare.Et = Math.abs(parentone.Et - parenttwo.Et);
        babyhare.Ft = Math.abs(parentone.Ft - parenttwo.Ft);

        babyhare.earAt = Math.abs(parentone.earAt - parenttwo.earAt);
        babyhare.earBt = Math.abs(parentone.earBt - parenttwo.earBt);
        babyhare.earCt = Math.abs(parentone.earCt - parenttwo.earCt);
        babyhare.earDt = Math.abs(parentone.earDt - parenttwo.earDt);
        babyhare.earEt = Math.abs(parentone.earEt - parenttwo.earEt);
        babyhare.earFt = Math.abs(parentone.earFt - parenttwo.earFt);

        babyhare.eyeAt = Math.abs(parentone.eyeAt - parenttwo.eyeAt);
        babyhare.eyeBt = Math.abs(parentone.eyeBt - parenttwo.eyeBt);
        babyhare.eyeCt = Math.abs(parentone.eyeCt - parenttwo.eyeCt);
        babyhare.eyeDt = Math.abs(parentone.eyeDt - parenttwo.eyeDt);
        babyhare.eyeEt = Math.abs(parentone.eyeEt - parenttwo.eyeEt);
        babyhare.eyeFt = Math.abs(parentone.eyeFt - parenttwo.eyeFt);

        babyhare.tailAt = Math.abs(parentone.tailAt - parenttwo.tailAt);
        babyhare.tailBt = Math.abs(parentone.tailBt - parenttwo.tailBt);
        babyhare.tailCt = Math.abs(parentone.tailCt - parenttwo.tailCt);
        babyhare.tailDt = Math.abs(parentone.tailDt - parenttwo.tailDt);
        babyhare.tailEt = Math.abs(parentone.tailEt - parenttwo.tailEt);
        babyhare.tailFt = Math.abs(parentone.tailFt - parenttwo.tailFt);
*/
        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);;
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);;
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }
        babyhare.Price = PriceSettingMethod(babyhare);

        if (babyFourCreatedCounter == 0) {
            BabyFour = babyhare;
            BabyHares[BabyNumber] = BabyFour;
            BabyNumber = BabyNumber + 1;
            babyFourCreatedCounter = babyFourCreatedCounter + 1;
            return BabyFour;
        }
        return BabyFour;

    }

    public Hare BabyMethodFive(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }




        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;



        /*
        if (parentone.hexRed1 > parenttwo.hexRed1) {
            babyhare.hexRed1 = parentone.hexRed1;
        } else {
            babyhare.hexRed1 = parenttwo.hexRed1;
        }
        if (parentone.Bt > parenttwo.Bt) {
            babyhare.Bt = parentone.Bt;
        } else {
            babyhare.Bt = parenttwo.Bt;
        }
        if (parentone.Ct > parenttwo.Ct) {
            babyhare.Ct = parentone.Ct;
        } else {
            babyhare.Ct = parenttwo.Ct;
        }
        if (parentone.Dt > parenttwo.Dt) {
            babyhare.Dt = parentone.Dt;
        } else {
            babyhare.Dt = parenttwo.Dt;
        }
        if (parentone.Et > parenttwo.Et) {
            babyhare.Et = parentone.Et;
        } else {
            babyhare.Et = parenttwo.Et;
        }
        if (parentone.Ft > parenttwo.Ft) {
            babyhare.Ft = parentone.Ft;
        } else {
            babyhare.Ft = parenttwo.Ft;
        }
        if (parentone.earAt > parenttwo.earAt) {
            babyhare.earAt = parentone.earAt;
        } else {
            babyhare.earAt = parenttwo.earAt;
        }
        if (parentone.earBt > parenttwo.earBt) {
            babyhare.earBt = parentone.earBt;
        } else {
            babyhare.earBt = parenttwo.earBt;
        }
        if (parentone.earCt > parenttwo.earCt) {
            babyhare.earCt = parentone.earCt;
        } else {
            babyhare.earCt = parenttwo.earCt;
        }
        if (parentone.earDt > parenttwo.earDt) {
            babyhare.earDt = parentone.earDt;
        } else {
            babyhare.earDt = parenttwo.earDt;
        }
        if (parentone.earEt > parenttwo.earEt) {
            babyhare.earEt = parentone.earEt;
        } else {
            babyhare.earEt = parenttwo.earEt;
        }
        if (parentone.earFt > parenttwo.earFt) {
            babyhare.earFt = parentone.earFt;
        } else {
            babyhare.earFt = parenttwo.earFt;
        }
        if (parentone.Ft > parenttwo.Ft) {
            babyhare.Ft = parentone.Ft;
        } else {
            babyhare.Ft = parenttwo.Ft;
        }
        if (parentone.eyeAt > parenttwo.eyeAt) {
            babyhare.eyeAt = parentone.eyeAt;
        } else {
            babyhare.eyeAt = parenttwo.eyeAt;
        }
        if (parentone.eyeBt > parenttwo.eyeBt) {
            babyhare.eyeBt = parentone.eyeBt;
        } else {
            babyhare.eyeBt = parenttwo.eyeBt;
        }
        if (parentone.eyeCt > parenttwo.eyeCt) {
            babyhare.eyeCt = parentone.eyeCt;
        } else {
            babyhare.eyeCt = parenttwo.eyeCt;
        }
        if (parentone.eyeDt > parenttwo.eyeDt) {
            babyhare.eyeDt = parentone.eyeDt;
        } else {
            babyhare.eyeDt = parenttwo.eyeDt;
        }
        if (parentone.eyeEt > parenttwo.eyeEt) {
            babyhare.eyeEt = parentone.eyeEt;
        } else {
            babyhare.eyeEt = parenttwo.eyeEt;
        }
        if (parentone.eyeFt > parenttwo.eyeFt) {
            babyhare.eyeFt = parentone.eyeFt;
        } else {
            babyhare.eyeFt = parenttwo.eyeFt;
        }


        if (parentone.tailAt > parenttwo.tailAt) {
            babyhare.tailAt = parentone.tailAt;
        } else {
            babyhare.tailAt = parenttwo.tailAt;
        }
        if (parentone.tailBt > parenttwo.tailBt) {
            babyhare.tailBt = parentone.tailBt;
        } else {
            babyhare.tailBt = parenttwo.tailBt;
        }
        if (parentone.tailCt > parenttwo.tailCt) {
            babyhare.tailCt = parentone.tailCt;
        } else {
            babyhare.tailCt = parenttwo.tailCt;
        }
        if (parentone.tailDt > parenttwo.tailDt) {
            babyhare.tailDt = parentone.tailDt;
        } else {
            babyhare.tailDt = parenttwo.tailDt;
        }
        if (parentone.tailEt > parenttwo.tailEt) {
            babyhare.tailEt = parentone.tailEt;
        } else {
            babyhare.tailEt = parenttwo.tailEt;
        }
        if (parentone.tailFt > parenttwo.tailFt) {
            babyhare.tailFt = parentone.tailFt;
        } else {
            babyhare.tailFt = parenttwo.tailFt;
        }

        */

        babyhare.Sex = SetSexMethod();
        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyFiveCreatedCounter == 0) {
            BabyFive = babyhare;
            BabyHares[BabyNumber] = BabyFive;
            BabyNumber = BabyNumber + 1;
            babyFiveCreatedCounter = babyFiveCreatedCounter + 1;
            return BabyFive;
        }
        return BabyFive;

    }

    public Hare BabyMethodSix(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }





        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;

        /*

        babyhare.hexRed1 = (parentone.hexRed1 * parenttwo.hexRed1) % 16;
        babyhare.Bt = (parentone.Bt * parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct * parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt * parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et * parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft * parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt * parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt * parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt * parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt * parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt * parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt * parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt * parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt * parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt * parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt * parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt * parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt * parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt * parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt * parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt * parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt * parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt * parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt * parenttwo.earFt) % 16;
*/
        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babySixCreatedCounter == 0) {
            BabySix = babyhare;
            BabyHares[BabyNumber] = BabySix;
            BabyNumber = BabyNumber + 1;
            babySixCreatedCounter = babySixCreatedCounter + 1;
            return BabySix;
        }
        return BabySix;

    }


    public Hare BabyMethodSeven(Hare parentone, Hare parenttwo) {

        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );

        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }



        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;



/*
        babyhare.hexRed1 = (parentone.hexRed1 & parenttwo.hexRed1) % 16;
        babyhare.Bt = (parentone.Bt & parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct & parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt & parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et & parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft & parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt & parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt & parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt & parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt & parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt & parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt & parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt & parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt & parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt & parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt & parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt & parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt & parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt & parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt & parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt & parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt & parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt & parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt & parenttwo.earFt) % 16;


*/
        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);;
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);;
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        int harealpha = babyhare.HareAlpha;
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babySevenCreatedCounter == 0) {
            BabySeven = babyhare;
            BabyHares[BabyNumber] = BabySeven;
            BabyNumber = BabyNumber + 1;
            babySevenCreatedCounter = babySevenCreatedCounter + 1;
            return BabySeven;
        }
        return BabySeven;

    }


    public Hare BabyMethodEight(Hare parentone, Hare parenttwo) {


        Hare babyhare = new Hare("a", 50,0,0,0,0, "a", 1,1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,0, 0, 1, SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation(),SetRotation() );




        Lengthcointer = hairy.Samething.length;


        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++) {
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps) {
                swapcounter = (swapcounter + 1) % 2;
                steps = 0;
            } else {
                steps = steps + 1;
            }

            if (swapcounter == 1) {
                babyhare.Samething[ArrayCreationLoopCounter] = hairy.Samething[ArrayCreationLoopCounter];
            } else if (swapcounter == 0) {
                babyhare.Samething[ArrayCreationLoopCounter] = lola.Samething[ArrayCreationLoopCounter];
            } else {
                babyhare.Samething[ArrayCreationLoopCounter] = 0;
            }
            Lengthcointer = Lengthcointer - 1;
        }




        babyhare.At0 = Math.abs(babyhare.Samething[0]+B())%4;
        babyhare.Bt0 = Math.abs(babyhare.Samething[1]+B())%4;
        babyhare.Ct0 = Math.abs(babyhare.Samething[2]+B())%4;
        babyhare.Dt0 = Math.abs(babyhare.Samething[3]+B())%4;
        babyhare.Et0 = Math.abs(babyhare.Samething[4]+B())%4;
        babyhare.Ft0 = Math.abs(babyhare.Samething[5]+B())%4;

        babyhare.At1= Math.abs(babyhare.Samething[6]+B())%4;
        babyhare.Bt1 = Math.abs(babyhare.Samething[7]+B())%4;
        babyhare.Ct1= Math.abs(babyhare.Samething[8]+B())%4;
        babyhare.Dt1 = Math.abs(babyhare.Samething[9]+B())%4;
        babyhare.Et1 = Math.abs(babyhare.Samething[10]+B())%4;
        babyhare.Ft1 = Math.abs(babyhare.Samething[11]+B())%4;

        babyhare.At2 = Math.abs(babyhare.Samething[12]+B())%4;
        babyhare.Bt2 = Math.abs(babyhare.Samething[13]+B())%4;
        babyhare.Ct2 = Math.abs(babyhare.Samething[14]+B())%4;
        babyhare.Dt2 = Math.abs(babyhare.Samething[15]+B())%4;
        babyhare.Et2 = Math.abs(babyhare.Samething[16]+B())%4;
        babyhare.Ft2 = Math.abs(babyhare.Samething[17]+B())%4;

        babyhare.At3 = Math.abs(babyhare.Samething[18]+B())%4;
        babyhare.Bt3 = Math.abs(babyhare.Samething[19]+B())%4;
        babyhare.Ct3 = Math.abs(babyhare.Samething[20]+B())%4;
        babyhare.Dt3 = Math.abs(babyhare.Samething[21]+B())%4;
        babyhare.Et3 = Math.abs(babyhare.Samething[22]+B())%4;
        babyhare.Ft3 = Math.abs(babyhare.Samething[23]+B())%4;

        babyhare.At4 = Math.abs(babyhare.Samething[24]+B())%4;
        babyhare.Bt4 = Math.abs(babyhare.Samething[25]+B())%4;
        babyhare.Ct4 = Math.abs(babyhare.Samething[26]+B())%4;
        babyhare.Dt4 = Math.abs(babyhare.Samething[27]+B())%4;
        babyhare.Et4 = Math.abs(babyhare.Samething[28]+B())%4;
        babyhare.Ft4 = Math.abs(babyhare.Samething[29]+B())%4;


        babyhare.eyeAt0 = Math.abs(babyhare.Samething[30]+B())%4;
        babyhare.eyeBt0 = Math.abs(babyhare.Samething[31]+B())%4;
        babyhare.eyeCt0 = Math.abs(babyhare.Samething[32]+B())%4;
        babyhare.eyeDt0 = Math.abs(babyhare.Samething[33]+B())%4;
        babyhare.eyeEt0 = Math.abs(babyhare.Samething[34]+B())%4;
        babyhare.eyeFt0 = Math.abs(babyhare.Samething[35]+B())%4;

        babyhare.eyeAt1= Math.abs(babyhare.Samething[36]+B())%4;
        babyhare.eyeBt1 = Math.abs(babyhare.Samething[37]+B())%4;
        babyhare.eyeCt1= Math.abs(babyhare.Samething[38]+B())%4;
        babyhare.eyeDt1 = Math.abs(babyhare.Samething[39]+B())%4;
        babyhare.eyeEt1 = Math.abs(babyhare.Samething[40]+B())%4;
        babyhare.eyeFt1 = Math.abs(babyhare.Samething[41]+B())%4;

        babyhare.eyeAt2 = Math.abs(babyhare.Samething[42]+B())%4;
        babyhare.eyeBt2 = Math.abs(babyhare.Samething[43]+B())%4;
        babyhare.eyeCt2 = Math.abs(babyhare.Samething[44]+B())%4;
        babyhare.eyeDt2 = Math.abs(babyhare.Samething[45]+B())%4;
        babyhare.eyeEt2 = Math.abs(babyhare.Samething[46]+B())%4;
        babyhare.eyeFt2 = Math.abs(babyhare.Samething[47]+B())%4;

        babyhare.eyeAt3 = Math.abs(babyhare.Samething[48]+B())%4;
        babyhare.eyeBt3 = Math.abs(babyhare.Samething[49]+B())%4;
        babyhare.eyeCt3 = Math.abs(babyhare.Samething[50]+B())%4;
        babyhare.eyeDt3 = Math.abs(babyhare.Samething[51]+B())%4;
        babyhare.eyeEt3 = Math.abs(babyhare.Samething[52]+B())%4;
        babyhare.eyeFt3 = Math.abs(babyhare.Samething[53]+B())%4;

        babyhare.eyeAt4 = Math.abs(babyhare.Samething[54]+B())%4;
        babyhare.eyeBt4 = Math.abs(babyhare.Samething[55]+B())%4;
        babyhare.eyeCt4 = Math.abs(babyhare.Samething[56]+B())%4;
        babyhare.eyeDt4 = Math.abs(babyhare.Samething[57]+B())%4;
        babyhare.eyeEt4 = Math.abs(babyhare.Samething[58]+B())%4;
        babyhare.eyeFt4 = Math.abs(babyhare.Samething[59]+B())%4;


        babyhare.earAt0 = Math.abs(babyhare.Samething[60]+B())%4;
        babyhare.earBt0 = Math.abs(babyhare.Samething[61]+B())%4;
        babyhare.earCt0 = Math.abs(babyhare.Samething[62]+B())%4;
        babyhare.earDt0 = Math.abs(babyhare.Samething[63]+B())%4;
        babyhare.earEt0 = Math.abs(babyhare.Samething[64]+B())%4;
        babyhare.earFt0 = Math.abs(babyhare.Samething[65]+B())%4;

        babyhare.earAt1= Math.abs(babyhare.Samething[66]+B())%4;
        babyhare.earBt1 = Math.abs(babyhare.Samething[67]+B())%4;
        babyhare.earCt1= Math.abs(babyhare.Samething[68]+B())%4;
        babyhare.earDt1 = Math.abs(babyhare.Samething[69]+B())%4;
        babyhare.earEt1 = Math.abs(babyhare.Samething[70]+B())%4;
        babyhare.earFt1 = Math.abs(babyhare.Samething[71]+B())%4;

        babyhare.earAt2 = Math.abs(babyhare.Samething[72]+B())%4;
        babyhare.earBt2 = Math.abs(babyhare.Samething[73]+B())%4;
        babyhare.earCt2 = Math.abs(babyhare.Samething[74]+B())%4;
        babyhare.earDt2 = Math.abs(babyhare.Samething[75]+B())%4;
        babyhare.earEt2 = Math.abs(babyhare.Samething[76]+B())%4;
        babyhare.earFt2 = Math.abs(babyhare.Samething[77]+B())%4;

        babyhare.earAt3 = Math.abs(babyhare.Samething[78]+B())%4;
        babyhare.earBt3 = Math.abs(babyhare.Samething[79]+B())%4;
        babyhare.earCt3 = Math.abs(babyhare.Samething[80]+B())%4;
        babyhare.earDt3 = Math.abs(babyhare.Samething[81]+B())%4;
        babyhare.earEt3 = Math.abs(babyhare.Samething[82]+B())%4;
        babyhare.earFt3 = Math.abs(babyhare.Samething[83]+B())%4;

        babyhare.earAt4 = Math.abs(babyhare.Samething[84]+B())%4;
        babyhare.earBt4 = Math.abs(babyhare.Samething[85]+B())%4;
        babyhare.earCt4 = Math.abs(babyhare.Samething[86]+B())%4;
        babyhare.earDt4 = Math.abs(babyhare.Samething[87]+B())%4;
        babyhare.earEt4 = Math.abs(babyhare.Samething[88]+B())%4;
        babyhare.earFt4 = Math.abs(babyhare.Samething[89]+B())%4;


        babyhare.tailAt0 = Math.abs(babyhare.Samething[90]+B())%4;
        babyhare.tailBt0 = Math.abs(babyhare.Samething[91]+B())%4;
        babyhare.tailCt0 = Math.abs(babyhare.Samething[92]+B())%4;
        babyhare.tailDt0 = Math.abs(babyhare.Samething[93]+B())%4;
        babyhare.tailEt0 = Math.abs(babyhare.Samething[94]+B())%4;
        babyhare.tailFt0 = Math.abs(babyhare.Samething[95]+B())%4;

        babyhare.tailAt1= Math.abs(babyhare.Samething[96]+B())%4;
        babyhare.tailBt1 = Math.abs(babyhare.Samething[97]+B())%4;
        babyhare.tailCt1= Math.abs(babyhare.Samething[98]+B())%4;
        babyhare.tailDt1 = Math.abs(babyhare.Samething[99]+B())%4;
        babyhare.tailEt1 = Math.abs(babyhare.Samething[100]+B())%4;
        babyhare.tailFt1 = Math.abs(babyhare.Samething[101]+B())%4;

        babyhare.tailAt2 = Math.abs(babyhare.Samething[102]+B())%4;
        babyhare.tailBt2 = Math.abs(babyhare.Samething[103]+B())%4;
        babyhare.tailCt2 = Math.abs(babyhare.Samething[104]+B())%4;
        babyhare.tailDt2 = Math.abs(babyhare.Samething[105]+B())%4;
        babyhare.tailEt2 = Math.abs(babyhare.Samething[106]+B())%4;
        babyhare.tailFt2 = Math.abs(babyhare.Samething[107]+B())%4;

        babyhare.tailAt3 = Math.abs(babyhare.Samething[108]+B())%4;
        babyhare.tailBt3 = Math.abs(babyhare.Samething[109]+B())%4;
        babyhare.tailCt3 = Math.abs(babyhare.Samething[110]+B())%4;
        babyhare.tailDt3 = Math.abs(babyhare.Samething[111]+B())%4;
        babyhare.tailEt3 = Math.abs(babyhare.Samething[112]+B())%4;
        babyhare.tailFt3 = Math.abs(babyhare.Samething[113]+B())%4;

        babyhare.tailAt4 = Math.abs(babyhare.Samething[114]+B())%4;
        babyhare.tailBt4 = Math.abs(babyhare.Samething[115]+B())%4;
        babyhare.tailCt4 = Math.abs(babyhare.Samething[116]+B())%4;
        babyhare.tailDt4 = Math.abs(babyhare.Samething[117]+B())%4;
        babyhare.tailEt4 = Math.abs(babyhare.Samething[118]+B())%4;
        babyhare.tailFt4 = Math.abs(babyhare.Samething[119]+B())%4;
        babyhare.At = babyhare.At0 + babyhare.At1 + babyhare.At2 + babyhare.At3 + babyhare.At4;
        babyhare.Bt = babyhare.Bt0 + babyhare.Bt1 + babyhare.Bt2 + babyhare.Bt3 + babyhare.Bt4;
        babyhare.Ct = babyhare.Ct0 + babyhare.Ct1 + babyhare.Ct2 + babyhare.Ct3 + babyhare.Ct4;
        babyhare.Dt = babyhare.Dt0 + babyhare.Dt1 + babyhare.Dt2 + babyhare.Dt3 + babyhare.Dt4;
        babyhare.Et = babyhare.Et0 + babyhare.Et1 + babyhare.Et2 + babyhare.Et3 + babyhare.Et4;
        babyhare.Ft = babyhare.Ft0 + babyhare.Ft1 + babyhare.Ft2 + babyhare.Ft3 + babyhare.Ft4;

        babyhare.tailAt = babyhare.tailAt0 + babyhare.tailAt1 + babyhare.tailAt2 + babyhare.tailAt3 + babyhare.tailAt4;
        babyhare.tailBt = babyhare.tailBt0 + babyhare.tailBt1 + babyhare.tailBt2 + babyhare.tailBt3 + babyhare.tailBt4;
        babyhare.tailCt = babyhare.tailCt0 + babyhare.tailCt1 + babyhare.tailCt2 + babyhare.tailCt3 + babyhare.tailCt4;
        babyhare.tailDt = babyhare.tailDt0 + babyhare.tailDt1 + babyhare.tailDt2 + babyhare.tailDt3 + babyhare.tailDt4;
        babyhare.tailEt = babyhare.tailEt0 + babyhare.tailEt1 + babyhare.tailEt2 + babyhare.tailEt3 + babyhare.tailEt4;
        babyhare.tailFt = babyhare.tailFt0 + babyhare.tailFt1 + babyhare.tailFt2 + babyhare.tailFt3 + babyhare.tailFt4;

        babyhare.earAt = babyhare.earAt0 + babyhare.earAt1 + babyhare.earAt2 + babyhare.earAt3 + babyhare.earAt4;
        babyhare.earBt = babyhare.earBt0 + babyhare.earBt1 + babyhare.earBt2 + babyhare.earBt3 + babyhare.earBt4;
        babyhare.earCt = babyhare.earCt0 + babyhare.earCt1 + babyhare.earCt2 + babyhare.earCt3 + babyhare.earCt4;
        babyhare.earDt = babyhare.earDt0 + babyhare.earDt1 + babyhare.earDt2 + babyhare.earDt3 + babyhare.earDt4;
        babyhare.earEt = babyhare.earEt0 + babyhare.earEt1 + babyhare.earEt2 + babyhare.earEt3 + babyhare.earEt4;
        babyhare.earFt = babyhare.earFt0 + babyhare.earFt1 + babyhare.earFt2 + babyhare.earFt3 + babyhare.earFt4;


        babyhare.eyeAt = babyhare.eyeAt0 + babyhare.eyeAt1 + babyhare.eyeAt2 + babyhare.eyeAt3 + babyhare.eyeAt4;
        babyhare.eyeBt = babyhare.eyeBt0 + babyhare.eyeBt1 + babyhare.eyeBt2 + babyhare.eyeBt3 + babyhare.eyeBt4;
        babyhare.eyeCt = babyhare.eyeCt0 + babyhare.eyeCt1 + babyhare.eyeCt2 + babyhare.eyeCt3 + babyhare.eyeCt4;
        babyhare.eyeDt = babyhare.eyeDt0 + babyhare.eyeDt1 + babyhare.eyeDt2 + babyhare.eyeDt3 + babyhare.eyeDt4;
        babyhare.eyeEt = babyhare.eyeEt0 + babyhare.eyeEt1 + babyhare.eyeEt2 + babyhare.eyeEt3 + babyhare.eyeEt4;
        babyhare.eyeFt = babyhare.eyeFt0 + babyhare.eyeFt1 + babyhare.eyeFt2 + babyhare.eyeFt3 + babyhare.eyeFt4;



/*
        babyhare.hexRed1 = (parentone.hexRed1 | parenttwo.hexRed1) % 16;
        babyhare.Bt = (parentone.Bt | parenttwo.Bt) % 16;
        babyhare.Ct = (parentone.Ct | parenttwo.Ct) % 16;
        babyhare.Dt = (parentone.Dt | parenttwo.Dt) % 16;
        babyhare.Et = (parentone.Et | parenttwo.Et) % 16;
        babyhare.Ft = (parentone.Ft | parenttwo.Ft) % 16;

        babyhare.eyeAt = (parentone.eyeAt | parenttwo.eyeAt) % 16;
        babyhare.eyeBt = (parentone.eyeBt | parenttwo.eyeBt) % 16;
        babyhare.eyeCt = (parentone.eyeCt | parenttwo.eyeCt) % 16;
        babyhare.eyeDt = (parentone.eyeDt | parenttwo.eyeDt) % 16;
        babyhare.eyeEt = (parentone.eyeEt | parenttwo.eyeEt) % 16;
        babyhare.eyeFt = (parentone.eyeFt | parenttwo.eyeFt) % 16;

        babyhare.tailAt = (parentone.tailAt | parenttwo.tailAt) % 16;
        babyhare.tailBt = (parentone.tailBt | parenttwo.tailBt) % 16;
        babyhare.tailCt = (parentone.tailCt | parenttwo.tailCt) % 16;
        babyhare.tailDt = (parentone.tailDt | parenttwo.tailDt) % 16;
        babyhare.tailEt = (parentone.tailEt | parenttwo.tailEt) % 16;
        babyhare.tailFt = (parentone.tailFt | parenttwo.tailFt) % 16;

        babyhare.earAt = (parentone.earAt | parenttwo.earAt) % 16;
        babyhare.earBt = (parentone.earBt | parenttwo.earBt) % 16;
        babyhare.earCt = (parentone.earCt | parenttwo.earCt) % 16;
        babyhare.earDt = (parentone.earDt | parenttwo.earDt) % 16;
        babyhare.earEt = (parentone.earEt | parenttwo.earEt) % 16;
        babyhare.earFt = (parentone.earFt | parenttwo.earFt) % 16;
*/
        babyhare.Sex = SetSexMethod();

        babyhare.sizeA = Math.abs(((parenttwo.sizeA + parentone.sizeA) / 2) + C());
        babyhare.sizeB = Math.abs(((parenttwo.sizeB + parentone.sizeB) / 2) + C());
        babyhare.sizeC = Math.abs(((parenttwo.sizeC + parentone.sizeC) / 2) + C());
        babyhare.sizeD = Math.abs(((parenttwo.sizeD + parentone.sizeD) / 2) + C());
        babyhare.sizeE = Math.abs(((parenttwo.sizeE + parentone.sizeE) / 2) + C());

        babyhare.size = babyhare.sizeA + babyhare.sizeB + babyhare.sizeC + babyhare.sizeD + babyhare.sizeE;
        if (babyhare.size >= 149) {
            babyhare.size = 149;
        }
      if (babyhare.size <= 29) {
            babyhare.size = 30;
        }

        babyhare.Color = FinalColorMethod(babyhare.At, babyhare.Bt, babyhare.Ct, babyhare.Dt, babyhare.Et, babyhare.Ft);

        babyhare.HareAlpha = (((parenttwo.HareAlpha + parentone.HareAlpha) / 2) + new Random().nextInt(17) - 8);;
        babyhare.TailAlpha = (((parenttwo.TailAlpha + parentone.TailAlpha) / 2) + new Random().nextInt(17) - 8);;
        if (babyhare.TailAlpha >= 128){
            babyhare.TailAlpha = 127;
        }
        harealphaeight = babyhare.HareAlpha ;
        int babybodysetter = new Random().nextInt(5);
        int babyearsetter = new Random().nextInt(5);
        int babytailsetter = new Random().nextInt(5);

        if (babytailsetter == 0 || babytailsetter == 1) {
            babyhare.TailType = parentone.TailType;
        } else if (babytailsetter == 2 || babytailsetter == 3) {
            babyhare.TailType = parenttwo.TailType;
        } else {
            babyhare.TailType = SetTailMethod();
        }
        if (babybodysetter == 0 || babybodysetter == 1) {
            babyhare.BodyType = parentone.BodyType;
        } else if (babybodysetter == 2 || babybodysetter == 3) {
            babyhare.BodyType = parenttwo.BodyType;
        } else {
            babyhare.BodyType = BodyTypeMethod();
        }
        if (babyearsetter == 0 || babyearsetter == 1) {
            babyhare.EarsType = parentone.EarsType;
        } else if (babyearsetter == 2 || babyearsetter == 3) {
            babyhare.EarsType = parenttwo.EarsType;
        } else {
            babyhare.EarsType = SetEarMethod();
        }

        babyhare.Price = PriceSettingMethod(babyhare);
        if (babyEightCreatedCounter == 0) {
            BabyEight = babyhare;
            BabyHares[BabyNumber] = BabyEight;
            BabyNumber = BabyNumber + 1;
            babyEightCreatedCounter = babyEightCreatedCounter + 1;
            ShopCounterBabyNonNullifier = 1;
            return BabyEight;
        }
        return BabyEight;

    }

    public double PriceSettingMethod(Hare babyhare) {
        int colordifference;
        int sizeexoticity;
        int RedDominant = babyhare.At + babyhare.earAt + babyhare.eyeAt + babyhare.tailAt;
        int RedRecessive = babyhare.Bt + babyhare.earBt + babyhare.eyeBt + babyhare.tailBt;
        int GreenDominant = babyhare.Ct + babyhare.earCt + babyhare.eyeCt + babyhare.tailCt;
        int GreenRecessive = babyhare.Dt + babyhare.earDt + babyhare.eyeDt + babyhare.tailDt;
        int BlueDominant = babyhare.Et + babyhare.earEt + babyhare.eyeEt + babyhare.tailEt;
        int BlueRecessive = babyhare.Ft + babyhare.earFt + babyhare.eyeFt + babyhare.tailFt;
        int RedSixteen = RedDominant * 16;
        int GreenSixteen = GreenDominant * 16;
        int BlueSixteen = BlueDominant * 16;
        int RedTotal = RedRecessive + RedSixteen;
        int GreenTotal = GreenRecessive + GreenSixteen;
        int BlueTotal = BlueRecessive + BlueSixteen;
        if (RedTotal > GreenTotal && RedTotal > BlueTotal) {
            colordifference = (RedTotal - GreenTotal) + (RedTotal - BlueTotal);
        } else if (GreenTotal > RedTotal && GreenTotal > BlueTotal) {
            colordifference = (GreenTotal - RedTotal) + (GreenTotal - BlueTotal);
        } else if (BlueTotal > RedTotal && BlueTotal > GreenTotal) {
            colordifference = (BlueTotal - GreenTotal) + (BlueTotal - GreenTotal);
        } else {
            colordifference = 1;
        }
        sizeexoticity = Math.abs(babyhare.size - 90);

        babyhare.Price = 1 + ((colordifference * sizeexoticity) / 1000);

        if (babyhare.BodyType == 3){
            babyhare.Price = (babyhare.Price*5);

        }
        if (babyhare.EarsType == 7){
            babyhare.Price = (babyhare.Price*5);

        }

        return babyhare.Price;
    }


    public int ColorSettingMethod() {
        return new Random().nextInt(16);
    }
    public String FinalColorMethod(int A, int B, int C, int D, int E, int F) {
        String As = Integer.toHexString(A);
        String Bs = Integer.toHexString(B);
        String Cs = Integer.toHexString(C);
        String Ds = Integer.toHexString(D);
        String Es = Integer.toHexString(E);
        String Fs = Integer.toHexString(F);
        return String.format(PassColor, As, Bs, Cs, Ds, Es, Fs);
    }
    public void OpenHutch() {

   intentHutch = new Intent(this, RabbitHutchBranch.class);


/*

         if (hairyandlolaArkTwo == 7) {
             hairyandlolaArkTwo = 1;
             HairyStorage = hairy;
             LolaStorage = lola;

             BabyHares[0] = HairyStorage;
             BabyHares[1] = LolaStorage;
             intentHutch.putExtra("HairyArk", BabyHares[0]);
             intentHutch.putExtra("LolaArk", BabyHares[1]);
             intentHutch.putExtra("NewHare0", BabyHares[0]);
             intentHutch.putExtra("NewHare1", BabyHares[1]);
        }else {*/
             intentHutch.putExtra("NewHare0", BabyHares[0]);
             intentHutch.putExtra("NewHare1", BabyHares[1]);
            intentHutch.putExtra("HairyArk", HairyStorage);
            intentHutch.putExtra("LolaArk", LolaStorage);
       // }

        int babynumberlooper;
        int BabyCaller = 0;
        int StupidBabyNumber = BabyNumber;

        for (babynumberlooper = 0; babynumberlooper < (BabyNumber); babynumberlooper++) {
            String catchname = "%s%s";
            String babyharecallname = String.format(catchname, "NewHare", (BabyCaller));
            // intentHutch.putExtra(babyharecallname, babyhare);
            intentHutch.putExtra(babyharecallname, BabyHares[BabyCaller]);
            BabyCaller = BabyCaller + 1;
            babycounter = babycounter + 1;
        }





        babynumberlooper = 0;


        babycountercounter = BabyNumber;



        intentHutch.putExtra("StupidBabyNumber", (babycountercounter));


       // startActivity(intentHutch);

        babycounter = babycounter; // % BabyNumber;
        BabyCaller = BabyCaller % BabyNumber;
        babyOneCreatedCounter = 0;
        babyTwoCreatedCounter = 0;
        babyThreeCreatedCounter = 0;
        babyFourCreatedCounter = 0;
        babyFiveCreatedCounter = 0;
        babySixCreatedCounter = 0;
        babySevenCreatedCounter = 0;
        babyEightCreatedCounter = 0;


        startActivityForResult(intentHutch, 123);

    }


    public void SelectRabbitHutch() {

        intentHutch = new Intent(this, RabbitHutchBranch.class);
        int babynumberlooper;
        int BabyCaller = babycounter;
        //   if (BabyCaller != 0){
        //       BabyCaller = BabyCaller - 8;
        //  }
        int seriousalteration = BabyNumber - 8;
        // babycounter = babycounter - 8;


        int babynullifierOne = BabyNumber;
        int babynullifierTwo = BabyNumber - 1;
        int babynullifierThree = BabyNumber - 2;
        int babynullifierFour = BabyNumber - 3;
        int babynullifierFive = BabyNumber - 4;
        int babynullifierSix = BabyNumber - 5;
        int babynullifierSeven = BabyNumber - 6;
        int babynullifierEight = BabyNumber - 7;


        BabyHares[babynullifierEight] = null;
        BabyHares[babynullifierSeven] = null;
        BabyHares[babynullifierSix] = null;
        BabyHares[babynullifierFive] = null;
        BabyHares[babynullifierFour] = null;
        BabyHares[babynullifierThree] = null;
        BabyHares[babynullifierTwo] = null;
        BabyHares[babynullifierOne] = null;

        for (babynumberlooper = 0; babynumberlooper < seriousalteration; babynumberlooper++) {
            String catchname = "%s%s";
            String babyharecallname = String.format(catchname, "NewHare", BabyCaller);
            // intentHutch.putExtra(babyharecallname, babyhare);
            //int minoralterations = BabyCaller-8;
            intentHutch.putExtra(babyharecallname, BabyHares[BabyCaller]);
            BabyCaller = BabyCaller + 1;
            //   babycounter = babycounter + 1;
        }


        babycounter = (babycounter); // %BabyNumber;

        if (BabyNumber == 10){
            BabyNumber = BabyNumber - 10;
    }else{
            BabyNumber = BabyNumber - 8;
    }

        //   intentHutch.putExtra("StupidBabyNumber", babycountercounter);

      //  startActivityForResult(intentHutch, 123);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 123 && resultCode == RESULT_OK) {
            BabyHares[0] = BabyHares[0];
            hairy.size = (int) data.getIntExtra("Hairysize", hairy.size);
            hairy.At = (int) data.getIntExtra("HairyAT", hairy.At);
            hairy.Bt = (int) data.getIntExtra("HairyBT", hairy.Bt);
            hairy.Ct = (int) data.getIntExtra("HairyCT", hairy.Ct);
            hairy.Dt = (int) data.getIntExtra("HairyDT", hairy.Dt);
            hairy.Et = (int) data.getIntExtra("HairyET", hairy.Et);
            hairy.Ft = (int) data.getIntExtra("HairyFT", hairy.Ft);
            hairy.earAt = (int) data.getIntExtra("HairyearAT", hairy.earAt);
            hairy.earBt = (int) data.getIntExtra("HairyearBT", hairy.earBt);
            hairy.earCt = (int) data.getIntExtra("HairyearCT", hairy.earCt);
            hairy.earDt = (int) data.getIntExtra("HairyearDT", hairy.earDt);
            hairy.earEt = (int) data.getIntExtra("HairyearET", hairy.earEt);
            hairy.earFt = (int) data.getIntExtra("HairyearFT", hairy.earFt);
            hairy.eyeAt = (int) data.getIntExtra("HairyeyeAT", hairy.eyeAt);
            hairy.eyeBt = (int) data.getIntExtra("HairyeyeBT", hairy.eyeBt);
            hairy.eyeCt = (int) data.getIntExtra("HairyeyeCT", hairy.eyeCt);
            hairy.eyeDt = (int) data.getIntExtra("HairyeyeDT", hairy.eyeDt);
            hairy.eyeEt = (int) data.getIntExtra("HairyeyeET", hairy.eyeEt);
            hairy.eyeFt = (int) data.getIntExtra("HairyeyeFT", hairy.eyeFt);
            hairy.tailAt = (int) data.getIntExtra("HairytailAT", hairy.tailAt);
            hairy.tailBt = (int) data.getIntExtra("HairytailBT", hairy.tailBt);
            hairy.tailCt = (int) data.getIntExtra("HairytailCT", hairy.tailCt);
            hairy.tailDt = (int) data.getIntExtra("HairytailDT", hairy.tailDt);
            hairy.tailEt = (int) data.getIntExtra("HairytailET", hairy.tailEt);
            hairy.tailFt = (int) data.getIntExtra("HairytailFT", hairy.tailFt);
            hairy.At0 = (int) data.getIntExtra("HairyAT0", hairy.At0);
            hairy.Bt0 = (int) data.getIntExtra("HairyBT0", hairy.Bt0);
            hairy.Ct0 = (int) data.getIntExtra("HairyCT0", hairy.Ct0);
            hairy.Dt0 = (int) data.getIntExtra("HairyDT0", hairy.Dt0);
            hairy.Et0 = (int) data.getIntExtra("HairyET0", hairy.Et0);
            hairy.Ft0 = (int) data.getIntExtra("HairyFT0", hairy.Ft0);
            hairy.earAt0 = (int) data.getIntExtra("HairyearAT0", hairy.earAt0);
            hairy.earBt0 = (int) data.getIntExtra("HairyearBT0", hairy.earBt0);
            hairy.earCt0 = (int) data.getIntExtra("HairyearCT0", hairy.earCt0);
            hairy.earDt0 = (int) data.getIntExtra("HairyearDT0", hairy.earDt0);
            hairy.earEt0 = (int) data.getIntExtra("HairyearET0", hairy.earEt0);
            hairy.earFt0 = (int) data.getIntExtra("HairyearFT0", hairy.earFt0);
            hairy.eyeAt0 = (int) data.getIntExtra("HairyeyeAT0", hairy.eyeAt0);
            hairy.eyeBt0 = (int) data.getIntExtra("HairyeyeBT0", hairy.eyeBt0);
            hairy.eyeCt0 = (int) data.getIntExtra("HairyeyeCT0", hairy.eyeCt0);
            hairy.eyeDt0 = (int) data.getIntExtra("HairyeyeDT0", hairy.eyeDt0);
            hairy.eyeEt0 = (int) data.getIntExtra("HairyeyeET0", hairy.eyeEt0);
            hairy.eyeFt0 = (int) data.getIntExtra("HairyeyeFT0", hairy.eyeFt0);
            hairy.tailAt0 = (int) data.getIntExtra("HairytailAT0", hairy.tailAt0);
            hairy.tailBt0 = (int) data.getIntExtra("HairytailBT0", hairy.tailBt0);
            hairy.tailCt0 = (int) data.getIntExtra("HairytailCT0", hairy.tailCt0);
            hairy.tailDt0 = (int) data.getIntExtra("HairytailDT0", hairy.tailDt0);
            hairy.tailEt0 = (int) data.getIntExtra("HairytailET0", hairy.tailEt0);
            hairy.tailFt0 = (int) data.getIntExtra("HairytailFT0", hairy.tailFt0);
            hairy.At1 = (int) data.getIntExtra("HairyAT1", hairy.At1);
            hairy.Bt1 = (int) data.getIntExtra("HairyBT1", hairy.Bt1);
            hairy.Ct1 = (int) data.getIntExtra("HairyCT1", hairy.Ct1);
            hairy.Dt1 = (int) data.getIntExtra("HairyDT1", hairy.Dt1);
            hairy.Et1 = (int) data.getIntExtra("HairyET1", hairy.Et1);
            hairy.Ft1 = (int) data.getIntExtra("HairyFT1", hairy.Ft1);
            hairy.earAt1 = (int) data.getIntExtra("HairyearAT1", hairy.earAt1);
            hairy.earBt1 = (int) data.getIntExtra("HairyearBT1", hairy.earBt1);
            hairy.earCt1 = (int) data.getIntExtra("HairyearCT1", hairy.earCt1);
            hairy.earDt1 = (int) data.getIntExtra("HairyearDT1", hairy.earDt1);
            hairy.earEt1 = (int) data.getIntExtra("HairyearET1", hairy.earEt1);
            hairy.earFt1 = (int) data.getIntExtra("HairyearFT1", hairy.earFt1);
            hairy.eyeAt1 = (int) data.getIntExtra("HairyeyeAT1", hairy.eyeAt1);
            hairy.eyeBt1 = (int) data.getIntExtra("HairyeyeBT1", hairy.eyeBt1);
            hairy.eyeCt1 = (int) data.getIntExtra("HairyeyeCT1", hairy.eyeCt1);
            hairy.eyeDt1 = (int) data.getIntExtra("HairyeyeDT1", hairy.eyeDt1);
            hairy.eyeEt1 = (int) data.getIntExtra("HairyeyeET1", hairy.eyeEt1);
            hairy.eyeFt1 = (int) data.getIntExtra("HairyeyeFT1", hairy.eyeFt1);
            hairy.tailAt1 = (int) data.getIntExtra("HairytailAT1", hairy.tailAt1);
            hairy.tailBt1 = (int) data.getIntExtra("HairytailBT1", hairy.tailBt1);
            hairy.tailCt1 = (int) data.getIntExtra("HairytailCT1", hairy.tailCt1);
            hairy.tailDt1 = (int) data.getIntExtra("HairytailDT1", hairy.tailDt1);
            hairy.tailEt1 = (int) data.getIntExtra("HairytailET1", hairy.tailEt1);
            hairy.tailFt1 = (int) data.getIntExtra("HairytailFT1", hairy.tailFt1);
            hairy.At2 = (int) data.getIntExtra("HairyAT2", hairy.At2);
            hairy.Bt2 = (int) data.getIntExtra("HairyBT2", hairy.Bt2);
            hairy.Ct2 = (int) data.getIntExtra("HairyCT2", hairy.Ct2);
            hairy.Dt2 = (int) data.getIntExtra("HairyDT2", hairy.Dt2);
            hairy.Et2 = (int) data.getIntExtra("HairyET2", hairy.Et2);
            hairy.Ft2 = (int) data.getIntExtra("HairyFT2", hairy.Ft2);
            hairy.earAt2 = (int) data.getIntExtra("HairyearAT2", hairy.earAt2);
            hairy.earBt2 = (int) data.getIntExtra("HairyearBT2", hairy.earBt2);
            hairy.earCt2 = (int) data.getIntExtra("HairyearCT2", hairy.earCt2);
            hairy.earDt2 = (int) data.getIntExtra("HairyearDT2", hairy.earDt2);
            hairy.earEt2 = (int) data.getIntExtra("HairyearET2", hairy.earEt2);
            hairy.earFt2 = (int) data.getIntExtra("HairyearFT2", hairy.earFt2);
            hairy.eyeAt2 = (int) data.getIntExtra("HairyeyeAT2", hairy.eyeAt2);
            hairy.eyeBt2 = (int) data.getIntExtra("HairyeyeBT2", hairy.eyeBt2);
            hairy.eyeCt2 = (int) data.getIntExtra("HairyeyeCT2", hairy.eyeCt2);
            hairy.eyeDt2 = (int) data.getIntExtra("HairyeyeDT2", hairy.eyeDt2);
            hairy.eyeEt2 = (int) data.getIntExtra("HairyeyeET2", hairy.eyeEt2);
            hairy.eyeFt2 = (int) data.getIntExtra("HairyeyeFT2", hairy.eyeFt2);
            hairy.tailAt2 = (int) data.getIntExtra("HairytailAT2", hairy.tailAt2);
            hairy.tailBt2 = (int) data.getIntExtra("HairytailBT2", hairy.tailBt2);
            hairy.tailCt2 = (int) data.getIntExtra("HairytailCT2", hairy.tailCt2);
            hairy.tailDt2 = (int) data.getIntExtra("HairytailDT2", hairy.tailDt2);
            hairy.tailEt2 = (int) data.getIntExtra("HairytailET2", hairy.tailEt2);
            hairy.tailFt2 = (int) data.getIntExtra("HairytailFT2", hairy.tailFt2);
            hairy.At3 = (int) data.getIntExtra("HairyAT3", hairy.At3);
            hairy.Bt3 = (int) data.getIntExtra("HairyBT3", hairy.Bt3);
            hairy.Ct3 = (int) data.getIntExtra("HairyCT3", hairy.Ct3);
            hairy.Dt3 = (int) data.getIntExtra("HairyDT3", hairy.Dt3);
            hairy.Et3 = (int) data.getIntExtra("HairyET3", hairy.Et3);
            hairy.Ft3 = (int) data.getIntExtra("HairyFT3", hairy.Ft3);
            hairy.earAt3 = (int) data.getIntExtra("HairyearAT3", hairy.earAt3);
            hairy.earBt3 = (int) data.getIntExtra("HairyearBT3", hairy.earBt3);
            hairy.earCt3 = (int) data.getIntExtra("HairyearCT3", hairy.earCt3);
            hairy.earDt3 = (int) data.getIntExtra("HairyearDT3", hairy.earDt3);
            hairy.earEt3 = (int) data.getIntExtra("HairyearET3", hairy.earEt3);
            hairy.earFt3 = (int) data.getIntExtra("HairyearFT3", hairy.earFt3);
            hairy.eyeAt3 = (int) data.getIntExtra("HairyeyeAT3", hairy.eyeAt3);
            hairy.eyeBt3 = (int) data.getIntExtra("HairyeyeBT3", hairy.eyeBt3);
            hairy.eyeCt3 = (int) data.getIntExtra("HairyeyeCT3", hairy.eyeCt3);
            hairy.eyeDt3 = (int) data.getIntExtra("HairyeyeDT3", hairy.eyeDt3);
            hairy.eyeEt3 = (int) data.getIntExtra("HairyeyeET3", hairy.eyeEt3);
            hairy.eyeFt3 = (int) data.getIntExtra("HairyeyeFT3", hairy.eyeFt3);
            hairy.tailAt3 = (int) data.getIntExtra("HairytailAT3", hairy.tailAt3);
            hairy.tailBt3 = (int) data.getIntExtra("HairytailBT3", hairy.tailBt3);
            hairy.tailCt3 = (int) data.getIntExtra("HairytailCT3", hairy.tailCt3);
            hairy.tailDt3 = (int) data.getIntExtra("HairytailDT3", hairy.tailDt3);
            hairy.tailEt3 = (int) data.getIntExtra("HairytailET3", hairy.tailEt3);
            hairy.tailFt3 = (int) data.getIntExtra("HairytailFT3", hairy.tailFt3);
            hairy.At4 = (int) data.getIntExtra("HairyAT4", hairy.At4);
            hairy.Bt4 = (int) data.getIntExtra("HairyBT4", hairy.Bt4);
            hairy.Ct4 = (int) data.getIntExtra("HairyCT4", hairy.Ct4);
            hairy.Dt4 = (int) data.getIntExtra("HairyDT4", hairy.Dt4);
            hairy.Et4 = (int) data.getIntExtra("HairyET4", hairy.Et4);
            hairy.Ft4 = (int) data.getIntExtra("HairyFT4", hairy.Ft4);
            hairy.earAt4 = (int) data.getIntExtra("HairyearAT4", hairy.earAt4);
            hairy.earBt4 = (int) data.getIntExtra("HairyearBT4", hairy.earBt4);
            hairy.earCt4 = (int) data.getIntExtra("HairyearCT4", hairy.earCt4);
            hairy.earDt4 = (int) data.getIntExtra("HairyearDT4", hairy.earDt4);
            hairy.earEt4 = (int) data.getIntExtra("HairyearET4", hairy.earEt4);
            hairy.earFt4 = (int) data.getIntExtra("HairyearFT4", hairy.earFt4);
            hairy.eyeAt4 = (int) data.getIntExtra("HairyeyeAT4", hairy.eyeAt4);
            hairy.eyeBt4 = (int) data.getIntExtra("HairyeyeBT4", hairy.eyeBt4);
            hairy.eyeCt4 = (int) data.getIntExtra("HairyeyeCT4", hairy.eyeCt4);
            hairy.eyeDt4 = (int) data.getIntExtra("HairyeyeDT4", hairy.eyeDt4);
            hairy.eyeEt4 = (int) data.getIntExtra("HairyeyeET4", hairy.eyeEt4);
            hairy.eyeFt4 = (int) data.getIntExtra("HairyeyeFT4", hairy.eyeFt4);
            hairy.tailAt4 = (int) data.getIntExtra("HairytailAT4", hairy.tailAt4);
            hairy.tailBt4 = (int) data.getIntExtra("HairytailBT4", hairy.tailBt4);
            hairy.tailCt4 = (int) data.getIntExtra("HairytailCT4", hairy.tailCt4);
            hairy.tailDt4 = (int) data.getIntExtra("HairytailDT4", hairy.tailDt4);
            hairy.tailEt4 = (int) data.getIntExtra("HairytailET4", hairy.tailEt4);
            hairy.tailFt4 = (int) data.getIntExtra("HairytailFT4", hairy.tailFt4);


            hairy.Sex = (String) data.getStringExtra("HairySex");
            hairy.Color = data.getStringExtra("HairyColor");
            hairy.HareAlpha = (int) data.getIntExtra("HairyHareAlpha", hairy.HareAlpha);
            hairy.TailAlpha = (int) data.getIntExtra("HairyTailAlpha", hairy.TailAlpha);
            hairy.BodyType = data.getIntExtra("HairyBodyType", hairy.BodyType);
            hairy.EarsType = data.getIntExtra("HairyEarsType",  hairy.EarsType);
            hairy.TailType = data.getIntExtra("HairyTailType",  hairy.TailType);
            hairy.EarsLength = data.getIntExtra("HairyEarsLength", hairy.EarsLength);
            hairy.EyesType = data.getIntExtra("HairyEyesType", hairy.EyesType);
            hairy.Price = data.getDoubleExtra("HairyPrice", hairy.Price);

        }

        if (resultCode == RESULT_CANCELED) {
            hairy = hairy;


        }
        DisplayBodyOneMethod();
        DisplayEarsOneMethod();
        DisplayEyesOneMethod();
        DisplayTailOneMethod();
        DisplayBodyTwoMethod();
        DisplayEarsTwoMethod();
        DisplayEyeTwoMethod();
        DisplayTailTwoMethod();
        SexTextViewOneMethod();
        SizeTextViewOneMethod();
        SexTextViewTwoMethod();
        SizeTextViewTwoMethod();

        if (requestCode == 123 && resultCode == 420) {


            BabyHares[1] = BabyHares[1];
            lola.size = (int) data.getIntExtra("Lolasize", lola.size);
                
                
                
                /*
                lola.hexRed1 = (int) data.getIntExtra("LolaAT", lola.hexRed1);
                lola.Bt = (int) data.getIntExtra("LolaBT", lola.Bt);
                lola.Ct = (int) data.getIntExtra("LolaCT", lola.Ct);
                lola.Dt = (int) data.getIntExtra("LolaDT", lola.Dt);
                lola.Et = (int) data.getIntExtra("LolaET", lola.Et);
                lola.Ft = (int) data.getIntExtra("LolaFT", lola.Ft);
                lola.earAt = (int) data.getIntExtra("LolaearAT", lola.earAt);
                lola.earBt = (int) data.getIntExtra("LolaearBT", lola.earBt);
                lola.earCt = (int) data.getIntExtra("LolaearCT", lola.earCt);
                lola.earDt = (int) data.getIntExtra("LolaearDT", lola.earDt);
                lola.earEt = (int) data.getIntExtra("LolaearET", lola.earEt);
                lola.earFt = (int) data.getIntExtra("LolaearFT", lola.earFt);
                lola.eyeAt = (int) data.getIntExtra("LolaeyeAT", lola.eyeAt);
                lola.eyeBt = (int) data.getIntExtra("LolaeyeBT", lola.eyeBt);
                lola.eyeCt = (int) data.getIntExtra("LolaeyeCT", lola.eyeCt);
                lola.eyeDt = (int) data.getIntExtra("LolaeyeDT", lola.eyeDt);
                lola.eyeEt = (int) data.getIntExtra("LolaeyeET", lola.eyeEt);
                lola.eyeFt = (int) data.getIntExtra("LolaeyeFT", lola.eyeFt);
                lola.tailAt = (int) data.getIntExtra("LolatailAT", lola.tailAt);
                lola.tailBt = (int) data.getIntExtra("LolatailBT", lola.tailBt);
                lola.tailCt = (int) data.getIntExtra("LolatailCT", lola.tailCt);
                lola.tailDt = (int) data.getIntExtra("LolatailDT", lola.tailDt);
                lola.tailEt = (int) data.getIntExtra("LolatailET", lola.tailEt);
                lola.tailFt = (int) data.getIntExtra("LolatailFT", lola.tailFt);
                */

            lola.At = (int) data.getIntExtra("LolaAT", lola.At);
            lola.Bt = (int) data.getIntExtra("LolaBT", lola.Bt);
            lola.Ct = (int) data.getIntExtra("LolaCT", lola.Ct);
            lola.Dt = (int) data.getIntExtra("LolaDT", lola.Dt);
            lola.Et = (int) data.getIntExtra("LolaET", lola.Et);
            lola.Ft = (int) data.getIntExtra("LolaFT", lola.Ft);
            lola.earAt = (int) data.getIntExtra("LolaearAT", lola.earAt);
            lola.earBt = (int) data.getIntExtra("LolaearBT", lola.earBt);
            lola.earCt = (int) data.getIntExtra("LolaearCT", lola.earCt);
            lola.earDt = (int) data.getIntExtra("LolaearDT", lola.earDt);
            lola.earEt = (int) data.getIntExtra("LolaearET", lola.earEt);
            lola.earFt = (int) data.getIntExtra("LolaearFT", lola.earFt);
            lola.eyeAt = (int) data.getIntExtra("LolaeyeAT", lola.eyeAt);
            lola.eyeBt = (int) data.getIntExtra("LolaeyeBT", lola.eyeBt);
            lola.eyeCt = (int) data.getIntExtra("LolaeyeCT", lola.eyeCt);
            lola.eyeDt = (int) data.getIntExtra("LolaeyeDT", lola.eyeDt);
            lola.eyeEt = (int) data.getIntExtra("LolaeyeET", lola.eyeEt);
            lola.eyeFt = (int) data.getIntExtra("LolaeyeFT", lola.eyeFt);
            lola.tailAt = (int) data.getIntExtra("LolatailAT", lola.tailAt);
            lola.tailBt = (int) data.getIntExtra("LolatailBT", lola.tailBt);
            lola.tailCt = (int) data.getIntExtra("LolatailCT", lola.tailCt);
            lola.tailDt = (int) data.getIntExtra("LolatailDT", lola.tailDt);
            lola.tailEt = (int) data.getIntExtra("LolatailET", lola.tailEt);
            lola.tailFt = (int) data.getIntExtra("LolatailFT", lola.tailFt);
            lola.At0 = (int) data.getIntExtra("LolaAT0", lola.At0);
            lola.Bt0 = (int) data.getIntExtra("LolaBT0", lola.Bt0);
            lola.Ct0 = (int) data.getIntExtra("LolaCT0", lola.Ct0);
            lola.Dt0 = (int) data.getIntExtra("LolaDT0", lola.Dt0);
            lola.Et0 = (int) data.getIntExtra("LolaET0", lola.Et0);
            lola.Ft0 = (int) data.getIntExtra("LolaFT0", lola.Ft0);
            lola.earAt0 = (int) data.getIntExtra("LolaearAT0", lola.earAt0);
            lola.earBt0 = (int) data.getIntExtra("LolaearBT0", lola.earBt0);
            lola.earCt0 = (int) data.getIntExtra("LolaearCT0", lola.earCt0);
            lola.earDt0 = (int) data.getIntExtra("LolaearDT0", lola.earDt0);
            lola.earEt0 = (int) data.getIntExtra("LolaearET0", lola.earEt0);
            lola.earFt0 = (int) data.getIntExtra("LolaearFT0", lola.earFt0);
            lola.eyeAt0 = (int) data.getIntExtra("LolaeyeAT0", lola.eyeAt0);
            lola.eyeBt0 = (int) data.getIntExtra("LolaeyeBT0", lola.eyeBt0);
            lola.eyeCt0 = (int) data.getIntExtra("LolaeyeCT0", lola.eyeCt0);
            lola.eyeDt0 = (int) data.getIntExtra("LolaeyeDT0", lola.eyeDt0);
            lola.eyeEt0 = (int) data.getIntExtra("LolaeyeET0", lola.eyeEt0);
            lola.eyeFt0 = (int) data.getIntExtra("LolaeyeFT0", lola.eyeFt0);
            lola.tailAt0 = (int) data.getIntExtra("LolatailAT0", lola.tailAt0);
            lola.tailBt0 = (int) data.getIntExtra("LolatailBT0", lola.tailBt0);
            lola.tailCt0 = (int) data.getIntExtra("LolatailCT0", lola.tailCt0);
            lola.tailDt0 = (int) data.getIntExtra("LolatailDT0", lola.tailDt0);
            lola.tailEt0 = (int) data.getIntExtra("LolatailET0", lola.tailEt0);
            lola.tailFt0 = (int) data.getIntExtra("LolatailFT0", lola.tailFt0);
            lola.At1 = (int) data.getIntExtra("LolaAT1", lola.At1);
            lola.Bt1 = (int) data.getIntExtra("LolaBT1", lola.Bt1);
            lola.Ct1 = (int) data.getIntExtra("LolaCT1", lola.Ct1);
            lola.Dt1 = (int) data.getIntExtra("LolaDT1", lola.Dt1);
            lola.Et1 = (int) data.getIntExtra("LolaET1", lola.Et1);
            lola.Ft1 = (int) data.getIntExtra("LolaFT1", lola.Ft1);
            lola.earAt1 = (int) data.getIntExtra("LolaearAT1", lola.earAt1);
            lola.earBt1 = (int) data.getIntExtra("LolaearBT1", lola.earBt1);
            lola.earCt1 = (int) data.getIntExtra("LolaearCT1", lola.earCt1);
            lola.earDt1 = (int) data.getIntExtra("LolaearDT1", lola.earDt1);
            lola.earEt1 = (int) data.getIntExtra("LolaearET1", lola.earEt1);
            lola.earFt1 = (int) data.getIntExtra("LolaearFT1", lola.earFt1);
            lola.eyeAt1 = (int) data.getIntExtra("LolaeyeAT1", lola.eyeAt1);
            lola.eyeBt1 = (int) data.getIntExtra("LolaeyeBT1", lola.eyeBt1);
            lola.eyeCt1 = (int) data.getIntExtra("LolaeyeCT1", lola.eyeCt1);
            lola.eyeDt1 = (int) data.getIntExtra("LolaeyeDT1", lola.eyeDt1);
            lola.eyeEt1 = (int) data.getIntExtra("LolaeyeET1", lola.eyeEt1);
            lola.eyeFt1 = (int) data.getIntExtra("LolaeyeFT1", lola.eyeFt1);
            lola.tailAt1 = (int) data.getIntExtra("LolatailAT1", lola.tailAt1);
            lola.tailBt1 = (int) data.getIntExtra("LolatailBT1", lola.tailBt1);
            lola.tailCt1 = (int) data.getIntExtra("LolatailCT1", lola.tailCt1);
            lola.tailDt1 = (int) data.getIntExtra("LolatailDT1", lola.tailDt1);
            lola.tailEt1 = (int) data.getIntExtra("LolatailET1", lola.tailEt1);
            lola.tailFt1 = (int) data.getIntExtra("LolatailFT1", lola.tailFt1);
            lola.At2 = (int) data.getIntExtra("LolaAT2", lola.At2);
            lola.Bt2 = (int) data.getIntExtra("LolaBT2", lola.Bt2);
            lola.Ct2 = (int) data.getIntExtra("LolaCT2", lola.Ct2);
            lola.Dt2 = (int) data.getIntExtra("LolaDT2", lola.Dt2);
            lola.Et2 = (int) data.getIntExtra("LolaET2", lola.Et2);
            lola.Ft2 = (int) data.getIntExtra("LolaFT2", lola.Ft2);
            lola.earAt2 = (int) data.getIntExtra("LolaearAT2", lola.earAt2);
            lola.earBt2 = (int) data.getIntExtra("LolaearBT2", lola.earBt2);
            lola.earCt2 = (int) data.getIntExtra("LolaearCT2", lola.earCt2);
            lola.earDt2 = (int) data.getIntExtra("LolaearDT2", lola.earDt2);
            lola.earEt2 = (int) data.getIntExtra("LolaearET2", lola.earEt2);
            lola.earFt2 = (int) data.getIntExtra("LolaearFT2", lola.earFt2);
            lola.eyeAt2 = (int) data.getIntExtra("LolaeyeAT2", lola.eyeAt2);
            lola.eyeBt2 = (int) data.getIntExtra("LolaeyeBT2", lola.eyeBt2);
            lola.eyeCt2 = (int) data.getIntExtra("LolaeyeCT2", lola.eyeCt2);
            lola.eyeDt2 = (int) data.getIntExtra("LolaeyeDT2", lola.eyeDt2);
            lola.eyeEt2 = (int) data.getIntExtra("LolaeyeET2", lola.eyeEt2);
            lola.eyeFt2 = (int) data.getIntExtra("LolaeyeFT2", lola.eyeFt2);
            lola.tailAt2 = (int) data.getIntExtra("LolatailAT2", lola.tailAt2);
            lola.tailBt2 = (int) data.getIntExtra("LolatailBT2", lola.tailBt2);
            lola.tailCt2 = (int) data.getIntExtra("LolatailCT2", lola.tailCt2);
            lola.tailDt2 = (int) data.getIntExtra("LolatailDT2", lola.tailDt2);
            lola.tailEt2 = (int) data.getIntExtra("LolatailET2", lola.tailEt2);
            lola.tailFt2 = (int) data.getIntExtra("LolatailFT2", lola.tailFt2);
            lola.At3 = (int) data.getIntExtra("LolaAT3", lola.At3);
            lola.Bt3 = (int) data.getIntExtra("LolaBT3", lola.Bt3);
            lola.Ct3 = (int) data.getIntExtra("LolaCT3", lola.Ct3);
            lola.Dt3 = (int) data.getIntExtra("LolaDT3", lola.Dt3);
            lola.Et3 = (int) data.getIntExtra("LolaET3", lola.Et3);
            lola.Ft3 = (int) data.getIntExtra("LolaFT3", lola.Ft3);
            lola.earAt3 = (int) data.getIntExtra("LolaearAT3", lola.earAt3);
            lola.earBt3 = (int) data.getIntExtra("LolaearBT3", lola.earBt3);
            lola.earCt3 = (int) data.getIntExtra("LolaearCT3", lola.earCt3);
            lola.earDt3 = (int) data.getIntExtra("LolaearDT3", lola.earDt3);
            lola.earEt3 = (int) data.getIntExtra("LolaearET3", lola.earEt3);
            lola.earFt3 = (int) data.getIntExtra("LolaearFT3", lola.earFt3);
            lola.eyeAt3 = (int) data.getIntExtra("LolaeyeAT3", lola.eyeAt3);
            lola.eyeBt3 = (int) data.getIntExtra("LolaeyeBT3", lola.eyeBt3);
            lola.eyeCt3 = (int) data.getIntExtra("LolaeyeCT3", lola.eyeCt3);
            lola.eyeDt3 = (int) data.getIntExtra("LolaeyeDT3", lola.eyeDt3);
            lola.eyeEt3 = (int) data.getIntExtra("LolaeyeET3", lola.eyeEt3);
            lola.eyeFt3 = (int) data.getIntExtra("LolaeyeFT3", lola.eyeFt3);
            lola.tailAt3 = (int) data.getIntExtra("LolatailAT3", lola.tailAt3);
            lola.tailBt3 = (int) data.getIntExtra("LolatailBT3", lola.tailBt3);
            lola.tailCt3 = (int) data.getIntExtra("LolatailCT3", lola.tailCt3);
            lola.tailDt3 = (int) data.getIntExtra("LolatailDT3", lola.tailDt3);
            lola.tailEt3 = (int) data.getIntExtra("LolatailET3", lola.tailEt3);
            lola.tailFt3 = (int) data.getIntExtra("LolatailFT3", lola.tailFt3);
            lola.At4 = (int) data.getIntExtra("LolaAT4", lola.At4);
            lola.Bt4 = (int) data.getIntExtra("LolaBT4", lola.Bt4);
            lola.Ct4 = (int) data.getIntExtra("LolaCT4", lola.Ct4);
            lola.Dt4 = (int) data.getIntExtra("LolaDT4", lola.Dt4);
            lola.Et4 = (int) data.getIntExtra("LolaET4", lola.Et4);
            lola.Ft4 = (int) data.getIntExtra("LolaFT4", lola.Ft4);
            lola.earAt4 = (int) data.getIntExtra("LolaearAT4", lola.earAt4);
            lola.earBt4 = (int) data.getIntExtra("LolaearBT4", lola.earBt4);
            lola.earCt4 = (int) data.getIntExtra("LolaearCT4", lola.earCt4);
            lola.earDt4 = (int) data.getIntExtra("LolaearDT4", lola.earDt4);
            lola.earEt4 = (int) data.getIntExtra("LolaearET4", lola.earEt4);
            lola.earFt4 = (int) data.getIntExtra("LolaearFT4", lola.earFt4);
            lola.eyeAt4 = (int) data.getIntExtra("LolaeyeAT4", lola.eyeAt4);
            lola.eyeBt4 = (int) data.getIntExtra("LolaeyeBT4", lola.eyeBt4);
            lola.eyeCt4 = (int) data.getIntExtra("LolaeyeCT4", lola.eyeCt4);
            lola.eyeDt4 = (int) data.getIntExtra("LolaeyeDT4", lola.eyeDt4);
            lola.eyeEt4 = (int) data.getIntExtra("LolaeyeET4", lola.eyeEt4);
            lola.eyeFt4 = (int) data.getIntExtra("LolaeyeFT4", lola.eyeFt4);
            lola.tailAt4 = (int) data.getIntExtra("LolatailAT4", lola.tailAt4);
            lola.tailBt4 = (int) data.getIntExtra("LolatailBT4", lola.tailBt4);
            lola.tailCt4 = (int) data.getIntExtra("LolatailCT4", lola.tailCt4);
            lola.tailDt4 = (int) data.getIntExtra("LolatailDT4", lola.tailDt4);
            lola.tailEt4 = (int) data.getIntExtra("LolatailET4", lola.tailEt4);
            lola.tailFt4 = (int) data.getIntExtra("LolatailFT4", lola.tailFt4);
                
                
                lola.Sex = (String) data.getStringExtra("LolaSex");
                lola.Color = data.getStringExtra("LolaColor");
                lola.HareAlpha = (int) data.getIntExtra("LolaHareAlpha", lola.HareAlpha);
                lola.TailAlpha = (int) data.getIntExtra("LolaTailAlpha", lola.TailAlpha);
                lola.BodyType = data.getIntExtra("LolaBodyType", lola.BodyType);
                lola.EarsType = data.getIntExtra("LolaEarsType",  lola.EarsType);
                lola.TailType = data.getIntExtra("LolaTailType",  lola.TailType);
                lola.EarsLength = data.getIntExtra("LolaEarsLength", lola.EarsLength);
                lola.EyesType = data.getIntExtra("LolaEyesType", lola.EyesType);
                lola.Price = data.getDoubleExtra("LolaPrice", lola.Price);

            }

            if (resultCode == RESULT_CANCELED) {
                lola = lola;


            }
            DisplayBodyOneMethod();
            DisplayEarsOneMethod();
            DisplayEyesOneMethod();
            DisplayTailOneMethod();
            DisplayBodyTwoMethod();
            DisplayEarsTwoMethod();
            DisplayEyeTwoMethod();
            DisplayTailTwoMethod();
            SexTextViewOneMethod();
            SizeTextViewOneMethod();
            SexTextViewTwoMethod();
            SizeTextViewTwoMethod();

        }


    public void DisplayTailOneMethod() {
        HareTailOneView = (ImageView) findViewById(R.id.HareTailViewOne);
        HareTailOneView.setImageResource(Tail[hairy.TailType]);
        HareTailOneView.requestLayout();

        FrameLayout FrameOneLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewOne);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(hairy.size), convertToDp(hairy.size), Gravity.CENTER);
        FrameOneLayout.setLayoutParams(WrapParam);
        FrameOneLayout.setLayoutParams(CenterParam);
        HareTailOneView.getLayoutParams().height = convertToDp(hairy.size);
        HareTailOneView.getLayoutParams().width = convertToDp(hairy.size);
        HareTailOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((hairy.tailAt * 16) + hairy.tailBt);
        int Green = ((hairy.tailCt * 16) + hairy.tailDt);
        int Blue = ((hairy.tailEt * 16) + hairy.tailFt);
        HareTailOneView.setColorFilter(Color.argb(hairy.TailAlpha, Red, Green, Blue));
    }

    public void DisplayTailTwoMethod() {
        HareTailTwoView = (ImageView) findViewById(R.id.HareTailViewTwo);
        HareTailTwoView.setImageResource(Tail[lola.TailType]);
        HareTailTwoView.requestLayout();

        FrameLayout FrameTwoLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(lola.size), convertToDp(lola.size), Gravity.CENTER);
        FrameTwoLayout.setLayoutParams(WrapParam);
        FrameTwoLayout.setLayoutParams(CenterParam);
        HareTailTwoView.getLayoutParams().height = convertToDp(lola.size);
        HareTailTwoView.getLayoutParams().width = convertToDp(lola.size);
        HareTailTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((lola.tailAt * 16) + lola.tailBt);
        int Green = ((lola.tailCt * 16) + lola.tailDt);
        int Blue = ((lola.tailEt * 16) + lola.tailFt);
        HareTailTwoView.setColorFilter(Color.argb(lola.TailAlpha, Red, Green, Blue));
    }
    public void DisplayTailBabyOneMethod() {
        HareTailBabyOneView = (ImageView) findViewById(R.id.BabyHareTailViewOne);
        HareTailBabyOneView.setImageResource(Tail[BabyOne.TailType]);
        HareTailBabyOneView.requestLayout();
        int babydimension = (80 * BabyHareOneScaler) / 150;

        FrameLayout BabyFrameOneTailLayout = (FrameLayout) findViewById(R.id.BabyFrameOneTail);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameOneTailLayout.setLayoutParams(WrapParam);
        BabyFrameOneTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyOneView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyOneView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyOneView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyOne.tailAt * 16) + BabyOne.tailBt);
        int Green = ((BabyOne.tailCt * 16) + BabyOne.tailDt);
        int Blue = ((BabyOne.tailEt * 16) + BabyOne.tailFt);
        HareTailBabyOneView.setColorFilter(Color.argb(BabyOne.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailOneView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }   
    
    public void DisplayTailBabyTwoMethod() {
        HareTailBabyTwoView = (ImageView) findViewById(R.id.HareTailViewBabyTwo);
        HareTailBabyTwoView.setImageResource(Tail[BabyTwo.TailType]);
        HareTailBabyTwoView.requestLayout();
        int babydimension = (80 * BabyHareTwoScaler) / 150;

        FrameLayout BabyFrameTwoTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyTwo);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameTwoTailLayout.setLayoutParams(WrapParam);
        BabyFrameTwoTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyTwoView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyTwoView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyTwoView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyTwo.tailAt * 16) + BabyTwo.tailBt);
        int Green = ((BabyTwo.tailCt * 16) + BabyTwo.tailDt);
        int Blue = ((BabyTwo.tailEt * 16) + BabyTwo.tailFt);
        HareTailBabyTwoView.setColorFilter(Color.argb(BabyTwo.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailTwoView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyThreeMethod() {
        HareTailBabyThreeView = (ImageView) findViewById(R.id.HareTailViewBabyThree);
        HareTailBabyThreeView.setImageResource(Tail[BabyThree.TailType]);
        HareTailBabyThreeView.requestLayout();
        int babydimension = (80 * BabyHareThreeScaler) / 150;

        FrameLayout BabyFrameThreeTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyThree);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameThreeTailLayout.setLayoutParams(WrapParam);
        BabyFrameThreeTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyThreeView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyThreeView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyThreeView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyThree.tailAt * 16) + BabyThree.tailBt);
        int Green = ((BabyThree.tailCt * 16) + BabyThree.tailDt);
        int Blue = ((BabyThree.tailEt * 16) + BabyThree.tailFt);
        HareTailBabyThreeView.setColorFilter(Color.argb(BabyThree.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailThreeView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyFourMethod() {
        HareTailBabyFourView = (ImageView) findViewById(R.id.HareTailViewBabyFour);
        HareTailBabyFourView.setImageResource(Tail[BabyFour.TailType]);
        HareTailBabyFourView.requestLayout();
        int babydimension = (80 * BabyHareFourScaler) / 150;

        FrameLayout BabyFrameFourTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyFour);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFourTailLayout.setLayoutParams(WrapParam);
        BabyFrameFourTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyFourView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyFourView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyFourView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFour.tailAt * 16) + BabyFour.tailBt);
        int Green = ((BabyFour.tailCt * 16) + BabyFour.tailDt);
        int Blue = ((BabyFour.tailEt * 16) + BabyFour.tailFt);
        HareTailBabyFourView.setColorFilter(Color.argb(BabyFour.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailFourView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyFiveMethod() {
        HareTailBabyFiveView = (ImageView) findViewById(R.id.HareTailViewBabyFive);
        HareTailBabyFiveView.setImageResource(Tail[BabyFive.TailType]);
        HareTailBabyFiveView.requestLayout();
        int babydimension = (80 * BabyHareFiveScaler) / 150;

        FrameLayout BabyFrameFiveTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyFive);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameFiveTailLayout.setLayoutParams(WrapParam);
        BabyFrameFiveTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyFiveView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyFiveView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyFiveView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyFive.tailAt * 16) + BabyFive.tailBt);
        int Green = ((BabyFive.tailCt * 16) + BabyFive.tailDt);
        int Blue = ((BabyFive.tailEt * 16) + BabyFive.tailFt);
        HareTailBabyFiveView.setColorFilter(Color.argb(BabyFive.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailFiveView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabySixMethod() {
        HareTailBabySixView = (ImageView) findViewById(R.id.HareTailViewBabySix);
        HareTailBabySixView.setImageResource(Tail[BabySix.TailType]);
        HareTailBabySixView.requestLayout();
        int babydimension = (80 * BabyHareSixScaler) / 150;

        FrameLayout BabyFrameSixTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabySix);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSixTailLayout.setLayoutParams(WrapParam);
        BabyFrameSixTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabySixView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabySixView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabySixView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySix.tailAt * 16) + BabySix.tailBt);
        int Green = ((BabySix.tailCt * 16) + BabySix.tailDt);
        int Blue = ((BabySix.tailEt * 16) + BabySix.tailFt);
        HareTailBabySixView.setColorFilter(Color.argb(BabySix.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailSixView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabySevenMethod() {
        HareTailBabySevenView = (ImageView) findViewById(R.id.HareTailViewBabySeven);
        HareTailBabySevenView.setImageResource(Tail[BabySeven.TailType]);
        HareTailBabySevenView.requestLayout();
        int babydimension = (80 * BabyHareSevenScaler) / 150;

        FrameLayout BabyFrameSevenTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabySeven);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameSevenTailLayout.setLayoutParams(WrapParam);
        BabyFrameSevenTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabySevenView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabySevenView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabySevenView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabySeven.tailAt * 16) + BabySeven.tailBt);
        int Green = ((BabySeven.tailCt * 16) + BabySeven.tailDt);
        int Blue = ((BabySeven.tailEt * 16) + BabySeven.tailFt);
        HareTailBabySevenView.setColorFilter(Color.argb(BabySeven.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailSevenView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

    public void DisplayTailBabyEightMethod() {
        HareTailBabyEightView = (ImageView) findViewById(R.id.HareTailViewBabyEight);
        HareTailBabyEightView.setImageResource(Tail[BabyEight.TailType]);
        HareTailBabyEightView.requestLayout();
        int babydimension = (80 * BabyHareEightScaler) / 150;

        FrameLayout BabyFrameEightTailLayout = (FrameLayout) findViewById(R.id.HareTailFrameViewBabyEight);
        FrameLayout.LayoutParams WrapParam = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout.LayoutParams CenterParam = new FrameLayout.LayoutParams(convertToDp(babydimension), convertToDp(babydimension), Gravity.CENTER);
        BabyFrameEightTailLayout.setLayoutParams(WrapParam);
        BabyFrameEightTailLayout.setLayoutParams(CenterParam);

        int tailscaler = ((convertToDp(babydimension)) - ((convertToDp(babydimension) * 2) / 3)); //*convertToDp(hairy.size));
        HareTailBabyEightView.getLayoutParams().height = convertToDp(babydimension);
        HareTailBabyEightView.getLayoutParams().width = convertToDp(babydimension);
        HareTailBabyEightView.setScaleType(ImageView.ScaleType.FIT_XY);
        int Red = ((BabyEight.tailAt * 16) + BabyEight.tailBt);
        int Green = ((BabyEight.tailCt * 16) + BabyEight.tailDt);
        int Blue = ((BabyEight.tailEt * 16) + BabyEight.tailFt);
        HareTailBabyEightView.setColorFilter(Color.argb(BabyEight.TailAlpha, Red, Green, Blue)); // Random Tint
        // HareTailEightView.setColorFilter(Color.argb(128, 255, 255, 255)); // white Tint

    }

}