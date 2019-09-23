package ditzler.cole.stableapp;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

@RequiresApi(api = Build.VERSION_CODES.N)
public class AOC extends AppCompatActivity {



    int Xappa = 1;
    double holder = ((Math.pow(60, 31))+(6*Math.pow(60,18)+ (6*Math.pow(60,17)+ (6*Math.pow(60,16)+1))));
    int fx = 0;
    MediaPlayer HappyTrackPlayer;
    int sound = 1;
    String notechar = "";
    TextView AView;
    Button AButton, Mute;
    String Eggstring = "";
    String Eggstringss = "%s,";
    String Eggstrings = "%.9f,";
    String testString = "C = A + B;";
    double HappinessCounter = 0;
    double currentvalue = 0;
    double HappinessCounteress = 0;
    int Magicalpowercounter = 2;
    int seriousbuisness;
    int needstobeeight;
    int lazybuisness;
    double Base = 60;
    double BaseTwo = Base*Base;
    double BaseThree = Base*Base*Base;
    double BaseFour = Base*Base*Base*Base;
    double BaseFive = Base*Base*Base*Base*Base;
    double BaseSix = Base*Base*Base*Base*Base*Base;
    int[] sanddancerset = new int[999999];
    int current = 1;
    double currentd = holder-1;
    Typeface tf1;

    Timer timer;
    int days;
    int hours;
    int minutes;
    int seconds;
    int daysa;
    int hoursa;
    int minutesa;
    int secondsa;
    int speedz = 1000;
    int truecount = 0;
    String TimeString = "";
    String TimeStrings = "%s:%s";
    String TimeStringss = "%s:%s:%s";
    String TimeStringsso = "%s:%s%s:%s%s";
    String TimeStringsse = "%s:%s%s:%s";
    String TimeStringssm = "%s:%s:%s%s";
    Button FasterButton, SlowerButton;
    ImageView daysview, hoursview, minutesview, secondsview;
    double goal;
    double kount;
    int xcounter, zcounter;
    int ycounter, wcounter;
    int ZEROx = 0;
    String showme = "";
    String showmeme = "";
    int z;


    double zd;


    double showmedouble;
    double bigggg;
    double smol;


    int tokens = 1000;

    int[] Intarray = new int[]{-16,12,-18,-1,5,-8,9,-15,12,6,11,7,-9,13,5,-4,-4,-2,-5,19,4,14,7,8,-16,-9,16,8,-11,-7,12,8,13,11,12,-19,11,7,9,-7,-16,-5,11,-1,8,5,12,-1,-1,6,-2,-12,6,-18,11,5,13,-12,-15,-8,-13,2,-11,1,-14,-6,11,-15,11,8,18,-8,18,-7,-9,-24,-12,2,20,-9,-5,-14,-6,16,-1,-12,-16,8,9,-15,-8,-2,-4,-16,-18,-8,10,10,2,3,-8,-10,-1,-2,20,-5,-4,-13,10,9,-12,-19,15,-4,-13,-11,-9,-4,-12,3,-7,-4,13,8,-5,10,-11,7,10,13,10,-17,-21,11,3,9,-15,-11,15,10,-3,17,6,11,16,19,8,8,4,9,7,15,2,15,22,19,11,3,19,9,-4,9,-19,-16,6,2,-3,5,5,-18,1,-14,-6,-20,10,-13,19,-18,-17,5,-39,2,33,2,24,-16,45,9,21,6,20,4,-12,-7,-3,8,12,5,-1,8,18,-13,-9,3,16,-4,15,13,-10,-8,-13,-21,15,17,13,-4,-18,-15,3,11,5,3,10,-11,9,19,-2,9,3,-13,2,-7,-14,-2,-7,-19,7,3,-13,6,10,5,-9,-20,-8,5,-17,11,-12,17,-12,-14,24,-22,-13,15,15,1,-4,13,-30,12,17,8,45,4,-3,-5,3,-9,13,8,14,2,-12,-3,9,20,7,1,1,-17,-10,3,-2,4,-6,16,-8,15,16,8,-11,-14,-4,2,15,19,12,14,17,-18,-18,-18,-1,-1,-7,-17,-2,-18,15,-3,5,-20,39,-1,6,8,10,16,-19,11,19,15,-6,19,-8,6,1,-2,-20,-4,18,2,-17,-10,-10,-12,18,2,-16,-8,14,-15,12,-14,-19,-16,-21,-17,21,-12,-34,-22,-25,-15,14,-12,-10,11,-20,4,-6,-11,14,21,74,40,3,15,-4,16,12,3,6,2,11,10,-3,17,-5,10,13,5,-13,-4,13,-8,17,-2,6,-12,7,2,13,-2,-9,18,15,-11,4,3,-21,-17,3,12,-1,-12,-3,-20,-10,13,-6,-4,-20,7,15,-6,-15,-26,13,6,-23,-9,-1,44,8,-14,26,13,5,31,24,7,-2,7,-4,17,-16,-3,36,-10,-22,-11,62,-7,21,-17,-10,-18,11,4,5,-23,-26,-40,2,32,62,23,45,109,-37,-10,-99,-210,-21,-33,379,262,66,66407,13,-8,-14,-16,-6,-19,12,15,-10,-19,-8,12,13,-11,18,7,-11,14,-12,-11,-2,4,-19,-9,3,-5,7,-4,9,-19,20,7,-14,-2,-7,-8,-2,-16,8,-10,1,-4,-16,2,1,-13,-2,-3,-16,5,-6,-17,3,9,14,1,-11,6,-2,-12,-10,11,19,-9,5,-11,-8,-17,-19,8,-3,-17,13,14,-16,-8,19,17,-16,-16,-13,-11,9,-19,6,12,5,-12,-12,-16,-14,-6,7,8,-12,-18,12,13,-17,3,-5,1,6,-4,-18,1,11,2,-8,-15,-17,16,-10,-12,16,-14,-1,-11,5,14,20,16,-18,16,17,13,-9,-6,-16,19,13,8,-13,1,19,-12,-20,-20,-11,-12,4,12,6,-17,-9,-3,-18,-15,-2,-5,17,12,-8,4,-12,-7,-18,-4,-1,-19,1,-7,-8,5,1,19,-7,-19,18,12,6,19,8,-1,20,-17,-16,-5,-1,-3,6,-13,-2,6,-8,12,-13,-3,-13,8,4,-16,19,18,16,-13,-1,3,9,18,1,3,14,10,3,1,-8,18,4,26,22,13,-12,-7,-3,6,-17,5,14,-7,12,10,-7,8,-7,18,17,-6,12,17,2,3,-9,18,10,-17,-10,-2,-13,6,4,17,12,14,-15,5,17,4,-1,-14,-19,-1,5,-15,-16,1,-11,-13,-5,15,-4,-15,1,22,17,-20,-21,13,1,-2,17,23,-35,-14,-18,6,1,1,-13,-10,34,35,8,4,14,24,16,-5,-2,10,16,-10,-11,1,-2,-3,7,5,20,-14,2,2,-5,14,-18,23,-3,2,4,2,7,8,3,-16,-5,4,12,-20,-15,-22,5,-10,31,-2,9,10,-14,18,6,3,19,-15,9,7,18,-1,-8,19,12,1,16,-5,-4,-9,16,13,2,7,5,-3,-19,12,9,2,9,16,-17,-13,12,-5,11,4,-1,2,-6,18,19,-10,3,-19,-19,-13,-16,-2,-13,8,18,6,-11,2,-16,11,12,-20,18,17,14,-13,26,-1,20,-1,-17,-11,-8,13,-7,-5,-5,-7,18,-20,-4,29,-2,21,21,16,15,14,21,-15,-14,17,5,-10,-27,-18,10,-20,34,-13,18,17,-21,32,13,6,6,28,-37,20,29,-25,-69,-57,-3,-59,3,-21,-9,14,-19,-18,20,-5,15,5,-9,-24,20,-14,-10,-15,30,21,-9,-34,4,-31,25,-85,25,38,-36,-28,58,121,-31,13,202,66221,-5,-19,-10,-7,-8,-2,6,-5,-6,8,-17,10,18,16,3,-12,-2,-11,14,7,11,-1,-5,10,9,-5,-3,-3,-11,-13,18,-8,-5,18,17,-6,3,19,-18,5,5,-4,-12,7,14,19,-6,10,-8,-11,10,-17,9,11,7,-133358};
    int Length = Intarray.length;
    int[] answerarray = new int[9999999];


    private Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
    private Integer Emagos[] = {R.drawable.noerrorsmall, R.drawable.errorsmall,};

    int five;
    int four;
    int three;
    int two;
    int one;

    int sixa;
    int fivea = 1;
    int foura;
    int threea;
    int twoa;
    int onea;
    int count;

    int ZERO = 0;

    int ONE = 0;

    int TWO = 0;

    int THREE = 0;

    int FOUR = 0;

    int FIVE = 0;

    int SIX = 0;

    int SEVEN = 0;

    int EIGHT = 0;

    int NINE = 0;

    int TEN = 0;

    int ELEVEN = 0;

    int TWELVE = 0;





    int a = 2;
    int b = 3;
    int c = 5;
    int d = 7;
    int e = 11;
    int f = 13;
    int g = 17;
    int h = 19;
    int i = 23;
    int j = 29;
    int k = 31;
    int l = 37;
    int Q = 200;
    int W = 300;
    int E = 500;
    int r = 700;
    int T = 1100;
    int Y = 1300;
    int U = 1700;
    int I = 1900;
    int O = 2300;
    int P = 2900;
    int Z = 3100;
    int X = 3700;
    int O2 = 2300;
    int P2 = 2900;
    int Z2 = 3100;
    int X2 = 3700;
    int fuck;

    boolean[] dictionaryOfMonsters = new boolean[83];

    int score = 0;


    IntBinaryOperator Plus = (a, b) -> a + b;
    IntBinaryOperator Minus = (a, b) -> a - b;
    IntBinaryOperator MinusSelf = (a, b) -> a - (a*a);
    IntUnaryOperator Ö = (a) -> (a+367)/(a+367) * (53);
    IntUnaryOperator fiss = (a) -> a%3;
    IntUnaryOperator buss = (a) -> a%5;
    IntUnaryOperator fissbuss = (a) -> a%15;
    int Input = new Random().nextInt(100)+1;

    IntBinaryOperator Mult = (a, b) -> (a*b);
    IntBinaryOperator Test = (a, b) -> (((a+b)*(a*a))-(b+a));
   // IntBinaryOperator Tested = (a, b) -> Mult.applyAsInt(Mult.applyAsInt(Minus.applyAsInt((((Plus.applyAsInt(a,b)),Mult.applyAsInt(a,a)-(b+a)))),(((Plus.applyAsInt(a,b)))),(Minus.applyAsInt(Mult.applyAsInt(a,a), Plus.applyAsInt(a,b)))));

    IntBinaryOperator Tester = (a, b) -> Mult.applyAsInt(Mult.applyAsInt(Plus.applyAsInt(a,b),MinusSelf.applyAsInt(b,a)), Minus.applyAsInt(a,b));

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happylayout_aoc);

        Fissbuss(Input, fiss, buss, fissbuss);


        AView = (TextView) findViewById(R.id.TextViewA);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/wf.ttf");
        AView.setTypeface(typeface);
        AButton = (Button) findViewById(R.id.ButtonA);

        AButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                /*
                for (int i = 0; i < 86400; i++){
                    onea++;
                    if (onea == 10) {
                        twoa++;
                        onea = 0;
                        if (twoa == 6) {
                            threea++;
                            twoa = 0;
                            if (threea == 10) {
                                foura++;
                                threea = 0;
                                if (foura == 6) {
                                    fivea++;
                                    foura = 0;
                                    if (fivea == 10) {
                                        sixa++;
                                        fivea = 1;
                                    }
                                }
                            }
                        }
                    }if(sixa == 1 || fivea == 2){
                        fivea = 0;
                        sixa = 0;
                    }
                    if (onea == 1 || twoa == 1 || threea == 1 || foura == 1 || fivea == 1 || sixa == 1){
                        one = 1;
                    }
                    if (onea == 2 || twoa == 2 || threea == 2 || foura == 2 || fivea == 2 || sixa == 2){
                        two = 1;
                    }
                    if (onea == 3 || twoa == 3 || threea == 3 || foura == 3 || fivea == 3 || sixa == 3){
                        three = 1;
                    }
                    if (onea == 4 || twoa == 4 || threea == 4 || foura == 4 || fivea == 4 || sixa == 4){
                        four = 1;
                    }
                    if (onea == 5 || twoa == 5 || threea == 5 || foura == 5 || fivea == 5 || sixa == 5){
                        five = 1;
                    }
                    int total = (one+two+three+four+five);
                    if (total == 5){
                        count++;
                    }

                    one = 0;
                    two = 0;
                    three = 0;
                    four = 0;
                    five = 0;
                }
                */


                int Output;
                Output = MathsMethod(Plus);
                int Crazy;
                Crazy = MathsMethod(Test);

                int wut;
                wut = Plus.applyAsInt(Tester.applyAsInt(Output, Crazy), Tester.applyAsInt(Crazy, Output));


                //   Eggstring = String.format(Eggstring + String.format(Eggstringss, Output));
                //    Eggstring = Eggstring + String.format(String.format(Eggstringss, Crazy));
                //    Eggstring = Eggstring + String.format(String.format(Eggstringss, wut));
                Eggstring = Eggstring + String.format(String.format(Eggstringss, count));


                RunLottery(tokens);
                String goo = "%s";
                String goo1 = String.format(goo, ZERO);
                String goo2 = String.format(goo, ONE);
                String goo3 = String.format(goo, TWO);
                String goo4 = String.format(goo, THREE);
                String goo5 = String.format(goo, FOUR);
                String goo6 = String.format(goo, FIVE);
                String goo7 = String.format(goo, SIX);
                String goo8 = String.format(goo, SEVEN);
                String goo9 = String.format(goo, EIGHT);
                String goo10 = String.format(goo, NINE);
                String goo11 = String.format(goo, TEN);
                String goo12 = String.format(goo, ELEVEN);
                String goo13 = String.format(goo, TWELVE);

                String runnn = String.format(goo, tokens);

                Eggstring = String.format(goo1 + ", " + goo2 + ", " + goo3 + ", " + goo4 + ", " + goo5 + ", " + goo6 + ", " + goo7 + ", " + goo8 + ", " + goo9 + ", " + goo10 + ", " + goo11 + ", " + goo12 + ", " + goo13 + ", " + runnn);


                for (int x = 1; x < 31; x++) {
                    bigggg = Math.pow(x, x);
                    smol = 1 / bigggg;
                    showmedouble = showmedouble + smol;
                }


                Eggstring = String.format(Eggstrings, showmedouble);

                Eggstring = "";

                //Xappa = Xappa+12960000;


                for (current = 1; current < 1; current++) { //777600000 // 25920000
                    //  if (absolutelyfuckingstupidmethod(current) != -1) {
                    z = (absolutelyfuckingstupidmethod(current));


                    switch (practicemethod(z).length()) { ///*

                        case 0:
                            break;
                        case 1:
                            Eggstring = String.format(Eggstring + practicemethod(z) + ", ");
                            fx++;
                            if (fx == 9) {
                                Eggstring = String.format(Eggstring + "\n" + "\n");
                                fx = 0;
                            }
                            break;
                        case 2:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                Eggstring = String.format(Eggstring + practicemethod(z) + ", ");
                                fx++;
                                if (fx == 9) {
                                    Eggstring = String.format(Eggstring + "\n" + "\n");
                                    fx = 0;
                                }
                            }
                            break;
                        case 3:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                Eggstring = String.format(Eggstring + practicemethod(z) + ", ");
                                fx++;
                                if (fx == 9) {
                                    Eggstring = String.format(Eggstring + "\n" + "\n");
                                    fx = 0;
                                }
                            }
                            break;
                        case 4:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                if (practicemethod(z).charAt(1) == practicemethod(z).charAt(practicemethod(z).length() - 2)) {
                                    Eggstring = String.format(Eggstring + practicemethod(z) + ", ");


                                    fx++;
                                    if (fx == 9) {
                                        Eggstring = String.format(Eggstring + "\n"); //+ "\n"
                                        fx = 0;
                                    }
                                }
                            }
                            break;
                        case 5:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                if (practicemethod(z).charAt(1) == practicemethod(z).charAt(practicemethod(z).length() - 2)) {
                                    Eggstring = String.format(Eggstring + practicemethod(z) + ", ");


                                    fx++;
                                    if (fx == 9) {
                                        Eggstring = String.format(Eggstring + "\n" + "\n");
                                        fx = 0;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                if (practicemethod(z).charAt(1) == practicemethod(z).charAt(practicemethod(z).length() - 2)) {
                                    if (practicemethod(z).charAt(2) == practicemethod(z).charAt(practicemethod(z).length() - 3)) {
                                        Eggstring = String.format(Eggstring + practicemethod(z) + ", ");


                                        fx++;
                                        if (fx == 9) {
                                            Eggstring = String.format(Eggstring + "\n" + "\n");
                                            fx = 0;
                                        }
                                    }
                                }
                            }
                            break;
                        case 7:
                            if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length() - 1)) {
                                if (practicemethod(z).charAt(1) == practicemethod(z).charAt(practicemethod(z).length() - 2)) {
                                    if (practicemethod(z).charAt(2) == practicemethod(z).charAt(practicemethod(z).length() - 3)) {
                                        Eggstring = String.format(Eggstring + practicemethod(z) + ", ");


                                        fx++;
                                        if (fx == 9) {
                                            Eggstring = String.format(Eggstring + "\n" + "\n");
                                            fx = 0;
                                        }
                                    }
                                }
                            }
                            break;
                    } //*/


                    // if (practicemethod(z).charAt(0) == practicemethod(z).charAt(practicemethod(z).length()-1) ) {
                    //      Eggstring = String.format(Eggstring + practicemethod(z) + ", ");


                    //      fx++;
                    //      if(fx == 9) {
                    //          Eggstring = String.format(Eggstring + "\n"+ "\n");
                    //          fx = 0;
                    //      }
                    //  }
                    //  }
                }

                AView.setText(Eggstring);
                String holderstring = "";

                for (current = 2; current < 216000; current++) { //777600000 // 25920000


                    holderstring = practicemethod(current);

                    switch (holderstring.length()) { ///*

                        case 0:
                            break;
                        case 1:
                            if (absolutelyfuckingstupidmethod(current) != -1) {
                                //       z = (absolutelyfuckingstupidmethod(current));
                                Eggstring = String.format(Eggstring + practicemethod(current) + ", ");
                                fx++;
                            }
                            break;
                        case 2:
                            if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                if (absolutelyfuckingstupidmethod(current) != -1) {
                                    //      z = (absolutelyfuckingstupidmethod(current));

                                    Eggstring = String.format(Eggstring + practicemethod(current) + ", ");
                                    fx++;

                                }
                            }
                            break;
                        case 3:
                            if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                if (absolutelyfuckingstupidmethod(current) != -1) {
                                    //          z = (absolutelyfuckingstupidmethod(current));
                                    Eggstring = String.format(Eggstring + practicemethod(current) + ", ");
                                    fx++;

                                }
                            }
                            break;
                        case 4:

                            current = 12960000;

                                /*if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                    if (holderstring.charAt(1) == holderstring.charAt(holderstring.length() - 2)) {
                                        if (absolutelyfuckingstupidmethod(current) != -1) {
                                      //      z = (absolutelyfuckingstupidmethod(current));
                                        Eggstring = String.format(Eggstring + practicemethod(current) + ", ");


                                        fx++;
                                        if (fx == 9) {
                                            Eggstring = String.format(Eggstring + "\n"); //+ "\n"
                                            fx = 0;
                                        }
                                    }
                                }}*/
                            break;
                        case 5:
                            if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                if (holderstring.charAt(1) == holderstring.charAt(holderstring.length() - 2)) {
                                    if (absolutelyfuckingstupidmethod(current) != -1) {
                                        //     z = (absolutelyfuckingstupidmethod(current));
                                        Eggstring = String.format(Eggstring + practicemethod(current) + ", ");


                                        fx++;

                                    }
                                }
                            }
                            break;
                        case 6:
                            if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                if (holderstring.charAt(1) == holderstring.charAt(holderstring.length() - 2)) {
                                    if (holderstring.charAt(2) == holderstring.charAt(holderstring.length() - 3)) {
                                        if (absolutelyfuckingstupidmethod(current) != -1) {
                                            //     z = (absolutelyfuckingstupidmethod(current));
                                            Eggstring = String.format(Eggstring + practicemethod(current) + ", ");


                                            fx++;

                                        }
                                    }
                                }
                            }
                            break;
                        case 7:
                            if (holderstring.charAt(0) == holderstring.charAt(holderstring.length() - 1)) {
                                if (holderstring.charAt(1) == holderstring.charAt(holderstring.length() - 2)) {
                                    if (holderstring.charAt(2) == holderstring.charAt(holderstring.length() - 3)) {
                                        if (absolutelyfuckingstupidmethod(current) != -1) {
                                            // z = (absolutelyfuckingstupidmethod(current));
                                            Eggstring = String.format(Eggstring + practicemethod(current) + ", ");
                                            fx++;

                                        }
                                    }
                                }
                            }
                            break;

                    }
                    if (fx == 9) {
                        Eggstring = String.format(Eggstring + "\n" + "\n");
                        fx = 0;
                    }
                }


                AView.setText(Eggstring);
/*
                for(currentd = (holder-1); currentd < holder+1; currentd++) { //777600000 // 25920000
                    if (absolutelyfuckingstupidmethodd(currentd) != -1) {
                        zd = (absolutelyfuckingstupidmethodd(currentd));


                         switch (practicemethod(zd).length()){ ///*

                            case 0:
                                break;
                            case 1:
                                Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");
                                fx++;
                                if(fx == 9) {
                                    Eggstring = String.format(Eggstring + "\n"+ "\n");
                                    fx = 0;
                                }
                                break;
                            case 2:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");
                                    fx++;
                                    if (fx == 9) {
                                        Eggstring = String.format(Eggstring + "\n" + "\n");
                                        fx = 0;
                                    }
                                }
                                break;
                            case 3:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");
                                    fx++;
                                    if(fx == 9) {
                                        Eggstring = String.format(Eggstring + "\n"+ "\n");
                                        fx = 0;
                                    }
                                }
                                break;
                            case 4:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    if (practicemethod(zd).charAt(1) == practicemethod(zd).charAt(practicemethod(zd).length()-2)) {
                                        Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");


                                        fx++;
                                        if (fx == 9) {
                                            Eggstring = String.format(Eggstring + "\n" ); //+ "\n"
                                            fx = 0;
                                        }
                                    }
                                }
                            break;
                            case 5:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    if (practicemethod(zd).charAt(1) == practicemethod(zd).charAt(practicemethod(zd).length()-2)) {
                                        Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");


                                        fx++;
                                        if (fx == 9) {
                                            Eggstring = String.format(Eggstring + "\n" + "\n");
                                            fx = 0;
                                        }
                                    }
                                }
                            break;
                            case 6:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    if (practicemethod(zd).charAt(1) == practicemethod(zd).charAt(practicemethod(zd).length() - 2)) {
                                        if (practicemethod(zd).charAt(2) == practicemethod(zd).charAt(practicemethod(zd).length() - 3)) {
                                            Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");


                                            fx++;
                                            if (fx == 9) {
                                                Eggstring = String.format(Eggstring + "\n" + "\n");
                                                fx = 0;
                                            }
                                        }
                                    }
                                }
                            break;
                            case 7:
                                if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                                    if (practicemethod(zd).charAt(1) == practicemethod(zd).charAt(practicemethod(zd).length() - 2)) {
                                        if (practicemethod(zd).charAt(2) == practicemethod(zd).charAt(practicemethod(zd).length() - 3)) {
                                            Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");


                                            fx++;
                                            if (fx == 9) {
                                                Eggstring = String.format(Eggstring + "\n" + "\n");
                                                fx = 0;
                                            }
                                        }
                                    }
                                }
                            break;
                        } //



                      // if (practicemethod(zd).charAt(0) == practicemethod(zd).charAt(practicemethod(zd).length()-1) ) {
                      //      Eggstring = String.format(Eggstring + practicemethod(zd) + ", ");


                      //      fx++;
                      //      if(fx == 9) {
                      //          Eggstring = String.format(Eggstring + "\n"+ "\n");
                      //          fx = 0;
                      //      }
                      //  }
                    }
                }


                String StringAZ = "%s";
                String AandZ = "";
                StringBuilder StringgoZ = new StringBuilder();
                    for (int gogo = 0; gogo < 91; gogo++) {

                        AandZ = String.format(StringAZ, (char) (((char)gogo)));
                        StringgoZ.append(", ").append(AandZ);

                    }*/

                String boolcheck = String.valueOf(dictionaryOfMonsters[23]);

                for (int w = 0; w < 101; w++){
                    Eggstring = Eggstring + ", " + fizzbuzz(w);
            }
                AView.setText(Eggstring);
                AView.setText("Hello this is a font test \n Gladly it contains enough text \n to illustrate the way the text looks on screen");
                score = 0;
                    }
                });
            }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int MathsMethod (IntBinaryOperator sign){
        int A = 5;
        int B = 13;
        return sign.applyAsInt(A, B);
    }
    public void RunLottery (int token) {

        for (int runner = token; tokens > 0 && runner > 0; runner--){
            lottery();

        switch (score) {
            case 0:
ZERO++;
                tokens++;
                tokens++;
                break;
            case 1:

                ONE++;
                tokens++;
                break;
            case 2:

                TWO++;
                break;
            case 3:

                THREE++;
                break;
            case 4:
                FOUR++;
                tokens++;
                break;
            case 5:
                FIVE++;
                tokens = tokens + 3;
                break;
            case 6:
                SIX++;
                tokens = tokens + 9;
                break;
            case 7:
                SEVEN++;
                tokens = tokens + 20;
                break;
            case 8:
                EIGHT++;
                tokens = tokens + 67;
                break;
            case 9:
                NINE++;
                tokens = tokens + 500;
                break;
            case 10:
                TEN++;
                tokens = tokens + 1000;
                break;
            case 11:
                ELEVEN++;
                tokens = tokens + 2000;
                break;
            case 12:
                TWELVE++;
                tokens = tokens + 4000;
                break;


        }
        tokens--;
        score = 0;
    }
    }
    public String lottery(){
        String lotterysomething = "";



      Q  = Generaterandoms();
      W = Generaterandoms();
      E = Generaterandoms();
      r = Generaterandoms();
      T = Generaterandoms();
      Y = Generaterandoms();
      U = Generaterandoms();
      I = Generaterandoms();
      O = Generaterandoms();
      P = Generaterandoms();
      Z  = Generaterandoms();
      X  = Generaterandoms();
      O2 = Generaterandoms();
      P2 = Generaterandoms();
      Z2  = Generaterandoms();
      X2  = Generaterandoms();

      Score(Q);
      Score(W);
      Score(E);
      Score(r);
      Score(Q);
      Score(Y);
      Score(U);
      Score(I);
      Score(O);
      Score(P);
      Score(Z);
      Score(X);
      Score(O2);
      Score(P2);
      Score(Z2);
      Score(X2);

      String thing = "%s";
      String.format(thing, score);

       return lotterysomething;
    }

    public int Generaterandoms(){

        int rerun = new Random().nextInt(67);
        int literallyenslavedtoincrementforever = 0;
        
        for (rerun = new Random().nextInt(67); rerun == Q || rerun == W || rerun == E || rerun == r || rerun == T || rerun == Y || rerun == U || rerun == I || rerun == O || rerun == P || rerun == Z || rerun == X || rerun == O2 || rerun == P2 || rerun == Z2 || rerun == X2;literallyenslavedtoincrementforever++ ){

            rerun = new Random().nextInt(67);

        }
        return rerun;
    }
    public int Score(int gimme){

        if (gimme == a){
            score++;
        }
        if (gimme == b){
            score++;
        }
        if (gimme == c){
            score++;
        }
        if (gimme == d){
            score++;
        }
        if (gimme == e){
            score++;
        }
        if (gimme == f){
            score++;
        }
        if (gimme == g){
            score++;
        }
        if (gimme == h){
            score++;
        }
        if (gimme == i){
            score++;
        }
        if (gimme == k){
            score++;
        }
        if (gimme == l){
            score++;
        }

        return score;
    }



    public String Fissbuss(int input, IntUnaryOperator Fizz, IntUnaryOperator Buzz, IntUnaryOperator FizzBuzz){
        String notfissorbuss = "%s";
        notfissorbuss = String.format(notfissorbuss, input);

        if(Fizz.applyAsInt(input) == 0){
            notfissorbuss = "Fizz";
        }
        if(Buzz.applyAsInt(input) == 0){
            notfissorbuss = "Buzz";
        }
        if(FizzBuzz.applyAsInt(input) == 0){
            notfissorbuss = "FizzBuzz";
        }
        return  notfissorbuss;
    }



    public String practicemethod(int prime){

        if(prime > 59){
            int lastdigit = (prime%60);
            int seconddigit = (((prime-lastdigit)/60))%60;
            int thirddigit = (((prime-seconddigit)/3600))%60;
            int fourthdigit = (((prime-thirddigit)/216000))%60;
            int fifthdigit = (((prime-fourthdigit)/12960000))%60;
            int sixthdigit = (((prime-fifthdigit)/777600000))%60;



            if (prime < 3600){
                return (String.format(practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 216000){

                return (String.format(practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 12960000){

                return (String.format(practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 777600000){

                return (String.format(practicemethod(fifthdigit) + practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime > 777599999){

                return (String.format(practicemethod(sixthdigit) + practicemethod(fifthdigit) + practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }
        }else{

            switch (prime){

                case 0:
                    return "0";
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "◙";
                case 11:
                    return "♂";
                case 12:
                    return "♀";
                case 13:
                    return "♪";
                case 14:
                    return "♫";
                case 15:
                    return "☼";
                case 16:
                    return "►";
                case 17:
                    return "◄";
                case 18:
                    return "↕";
                case 19:
                    return "‼";
                case 20:
                    return "¶";
                case 21:
                    return "§";
                case 22:
                    return "▬";
                case 23:
                    return "↨";
                case 24:
                    return "↑";
                case 25:
                    return "↓";
                case 26:
                    return "→";
                case 27:
                    return "←";
                case 28:
                    return "∟";
                case 29:
                    return "↔";
                case 30:
                    return "▲";
                case 31:
                    return "▼";
                case 32:
                    return "ä";
                case 33:
                    return "à";
                case 34:
                    return "å";
                case 35:
                    return "ç";
                case 36:
                    return "ê";
                case 37:
                    return "ë";
                case 38:
                    return "è";
                case 39:
                    return "ï";
                case 40:
                    return "î";
                case 41:
                    return "ì";
                case 42:
                    return "Ä";
                case 43:
                    return "Å";
                case 44:
                    return "É";
                case 45:
                    return "æ";
                case 46:
                    return "Æ";
                case 47:
                    return "ô";
                case 48:
                    return "ö";
                case 49:
                    return "ò";
                case 50:
                    return "û";
                case 51:
                    return "ù";
                case 52:
                    return "ÿ";
                case 53:
                    return "Ö";
                case 54:
                    return "Ü";
                case 55:
                    return "¢";
                case 56:
                    return "£";
                case 57:
                    return "¥";
                case 58:
                    return "₧";
                case 59:
                    return "ƒ";







            }


        }



        return "○";

    }

    /*
    public String practicemethod(double prime){

        if(prime > 59){
            double lastdigit = (prime%60);
            double seconddigit = (((prime-lastdigit)/60))%60;
            double thirddigit = (((prime-seconddigit)/3600))%60;
            double fourthdigit = (((prime-thirddigit)/216000))%60;
            double fifthdigit = (((prime-fourthdigit)/12960000))%60;
            double sixthdigit = (((prime-fifthdigit)/777600000))%60;


            if (prime < 3600){
                return (String.format(practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 216000){

                return (String.format(practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 12960000){

                return (String.format(practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime < 777600000){

                return (String.format(practicemethod(fifthdigit) + practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }else if (prime > 777599999){

                return (String.format(practicemethod(sixthdigit) + practicemethod(fifthdigit) + practicemethod(fourthdigit) + practicemethod(thirddigit) + practicemethod(seconddigit) + practicemethod(lastdigit)));

            }
        }else{

            switch (prime){

                case 0:
                    return "0";
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "◙";
                case 11:
                    return "♂";
                case 12:
                    return "♀";
                case 13:
                    return "♪";
                case 14:
                    return "♫";
                case 15:
                    return "☼";
                case 16:
                    return "►";
                case 17:
                    return "◄";
                case 18:
                    return "↕";
                case 19:
                    return "‼";
                case 20:
                    return "¶";
                case 21:
                    return "§";
                case 22:
                    return "▬";
                case 23:
                    return "↨";
                case 24:
                    return "↑";
                case 25:
                    return "↓";
                case 26:
                    return "→";
                case 27:
                    return "←";
                case 28:
                    return "∟";
                case 29:
                    return "↔";
                case 30:
                    return "▲";
                case 31:
                    return "▼";
                case 32:
                    return "ä";
                case 33:
                    return "à";
                case 34:
                    return "å";
                case 35:
                    return "ç";
                case 36:
                    return "ê";
                case 37:
                    return "ë";
                case 38:
                    return "è";
                case 39:
                    return "ï";
                case 40:
                    return "î";
                case 41:
                    return "ì";
                case 42:
                    return "Ä";
                case 43:
                    return "Å";
                case 44:
                    return "É";
                case 45:
                    return "æ";
                case 46:
                    return "Æ";
                case 47:
                    return "ô";
                case 48:
                    return "ö";
                case 49:
                    return "ò";
                case 50:
                    return "û";
                case 51:
                    return "ù";
                case 52:
                    return "ÿ";
                case 53:
                    return "Ö";
                case 54:
                    return "Ü";
                case 55:
                    return "¢";
                case 56:
                    return "£";
                case 57:
                    return "¥";
                case 58:
                    return "₧";
                case 59:
                    return "ƒ";







            }


        }



        return "○";

    }*/

    public int absolutelyfuckingstupidmethod(int fuckyou) {
        int whocarestho = fuckyou;

        for (int jesusreally = 1; jesusreally <= (int)(Math.ceil((Math.sqrt(fuckyou)))); jesusreally++) {
            if (fuckyou % jesusreally == 0) {
                fuckyou = fuckyou / jesusreally;
                jesusreally = 1;
            }
        }
        if (whocarestho == fuckyou) {
            return whocarestho;
        } else {
            return -1;
        }
    }

    public String fizzbuzz(int input) {
        String catcher = "%s";
        int total = 1;
        int two = 2;
        int three = 3;
        double test = input;
        for (int x = -1; test > 1; x++){
            test = (test/3);
        }
        if (test == 1){
            total = total*two;
        }
        test = input;
        for (int x = -1; test > 1; x++){
            test = (test/5);
        }
        if (test == 1){
            total = total*three;
        }
        if (test == 2){
            catcher = "fizz";
        }else if(test == 3){
            catcher = "buzz";
        }else if (test == 6){
            catcher = "fizzbuzz";
        }else {
            catcher = String.format(catcher, input);
        }
        return catcher;
    }

    /*
    public double absolutelyfuckingstupidmethodd(double fuckyou) {
        double whocarestho = fuckyou;

        for (int jesusreally = 1; jesusreally <= (double)(Math.ceil((Math.sqrt(fuckyou)))); jesusreally++) {
            if (fuckyou % jesusreally == 0) {
                fuckyou = fuckyou / jesusreally;
                jesusreally = 1;
            }
        }
        if (whocarestho == fuckyou) {
            return whocarestho;
        } else {
            return -1;
        }
    }*/

}

/* ){
            if( attackermonster.Health >= (elongatedwoundpowerA + elongatedhealwoundpowerA + elongatedglugpowerP)) {
                Teller = SpecialAttack;
            }
        }


        if (Teller == Status){
           if (ratiohealth < 50){
               switch (new Random().nextInt(3)) {

                   case 0:
                       Teller = SpecialAttack;
                       break;
                   case 1:
                       Teller = Turn;
                       break;
                   case 2:
                           if(ratiohealth >= 45 && ratiohealth <= 80){
                               if (attackermonster.Moveslotheal == 1){
                                   if (delayedhealtimerA == 0){
                                       Teller = HealButton;
                                   }else {
                                       switch (new Random().nextInt(3)) {
                                           case 0:
                                               Teller = SpecialAttack;
                                               break;
                                           case 1:
                                               if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                   Teller = SpecialAttack;
                                               } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                   Teller = SpecialAttack;
                                               }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                   Teller = Turn;
                                               }else {
                                                   Teller = Turn;
                                               }
                                               break;
                                           case 2:
                                               if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                   Teller = SpecialAttack;
                                               } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                   Teller = SpecialAttack;
                                               }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                   Teller = Turn;
                                               }else {
                                                   Teller = Turn;
                                               }
                                               break;
                                       }
                                   }
                               }
                           }else {
                               if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                   Teller = SpecialAttack;
                               } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                   Teller = SpecialAttack;
                               }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                   Teller = Turn;
                               }else {
                                   Teller = Turn;
                               }
                       }
                       break;

               }
           }
        }

        if(delayedblastpowerA != 0){
            if (Teller == SpecialAttack){
                Teller = Turn;
            }

        }else if (delayedhealtimerA == 0 && attackermonster.Moveslotattack == 1){
            if (playermonster.Speed <= (playermonster.Defense * 1.3)) {
                Teller = SpecialAttack;
            }
        }

        if (attackermonster.Moveslotheal == 1){
            if(Teller == HealButton){
                if (delayedhealtimerA != 0){
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                }

            }
        }

        if (attackermonster.Moveslotheal == 2 && elongatedhealtimerA == 0 && (ratiohealth > 49 && ratiohealth < 99)){
            Teller = HealButton;
        }


        if (Teller != SpecialAttack && attackermonster.Moveslotattack == 3 && elongatedglugtimerA == 0 && attackermonster.Speed >= playermonster.Defense){
                Teller = SpecialAttack;
        }

        if (Teller != Turn){
            Damage = ((attackermonster.Attack / playermonster.Defense) * 51);
            if(playermonster.Health <= Damage){
                Teller = Turn;
            }
        }



        if (attackermonster.Speed < playermonster.Speed && ( attackermonster.Moveslotspeed == 0 ||   attackermonster.Moveslotspeed == 1 ||   attackermonster.Moveslotspeed == 3 ||   attackermonster.Moveslotspeed == 4 ||   attackermonster.Moveslotspeed == 7 ||   attackermonster.Moveslotspeed == 8 ||  attackermonster.Moveslotspeed == 9 ||   attackermonster.Moveslotspeed == 11 )){
            switch (attackermonster.Moveslotspeed){

                case 0:
                    if ((attackermonster.Speed * FrrtTwo) > playermonster.Speed){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                case 1:
                    if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    break;
                case 2:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 3:
                    if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    break;
                case 4:
                    if ((attackermonster.Speed * SqrtTwo) > playermonster.Speed){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    break;
                case 5:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 6:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 7:
                    if (((attackermonster.Speed * CbrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) &&(attackermonster.Health > (((playermonster.Attack/attackermonster.Defense)*71)))){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    if (Teller != Turn){
                    Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                    if(playermonster.Health <= Damage){
                        Teller = Turn;
                    }
                }
                    break;
                case 8:
                    if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) &&(attackermonster.Health > (((playermonster.Attack/attackermonster.Defense)*71)))){
                    Teller = Status;
                }else {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 9:
                    if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) &&(attackermonster.Health > (((playermonster.Attack/attackermonster.Defense)*71)))){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 10:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 11:
                    if (((attackermonster.Speed * 2) > playermonster.Speed) && (AttackerStatDelayTimer == -1) &&(attackermonster.Health > (((playermonster.Attack/attackermonster.Defense)*71)))){
                        Teller = Status;
                    }else {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 12:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
                case 13:
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                    if (Teller != Turn){
                        Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                        if(playermonster.Health <= Damage){
                            Teller = Turn;
                        }
                    }
                    break;
            }
        }



  */
        /*
        int BrainNumb = new Random().nextInt(10);
        switch (BrainNumb){

            case 0:
                Teller = SpecialAttack;
                break;
            case 1:
                Teller = Turn;
                break;
            case 2:
                Teller = Turn;
                break;
            case 3:
                Teller = Turn;
                break;
            case 4:
                Teller = HealButton;
                break;
            case 5:
                Teller = HealButton;
                break;
            case 6:
                Teller = Status;
                break;
            case 7:
                Teller = Status;
                break;
            case 8:
                Teller = SpecialAttack;
                break;
            case 9:
                Teller = Turn;
                break;



        }

        if (Teller != Status){
            if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                    Teller = SpecialAttack;
                } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                    Teller = SpecialAttack;
                }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                    Teller = Turn;
                } else {
                    switch (new Random().nextInt(6)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Status;
                            break;
                        case 2:
                            Teller = Status;
                            break;
                        case 3:
                            Teller = Status;
                            break;
                        case 4:
                            Teller = Turn;
                            break;
                        case 5:
                            Teller = Turn;
                            break;

                    }

                }
            }
        }

        if (Teller == Status){
            if (!(attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {
                switch (new Random().nextInt(3)) {

                    case 0:
                        Teller = SpecialAttack;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }else {
                            Teller= Turn;
                        }
                        break;

                }
            }
            if (AttackerStatDelayTimer != -1){
                switch (new Random().nextInt(3)) {

                    case 0:
                        Teller = SpecialAttack;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }else {
                            Teller= Turn;
                        }
                        break;

                }
            }

        }

        double ratiohealth = (100*attackermonster.Health/MaxHealthAttacker);

        double testdamage = ((attackermonster.Attack / playermonster.Defense) * 50);
        double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);


        if (ratiohealth < 37 || ((attackermonster.Health < testdamage && (attackermonster.Health + testheal) > testdamage) && (attackermonster.Moveslotheal != 1 && attackermonster.Moveslotheal != 3 && attackermonster.Moveslotheal != 5 ))){
            if(healblocktgimerA == 0 && elongatedhealwoundpowerA == 0 && delayedhealtimerA == 0){
                if ((attackermonster.Speed > playermonster.Attack && attackermonster.Speed > attackermonster.Defense) && attackermonster.Moveslotheal != 3) {
                    if (attackermonster.Moveslotheal == 4){
                        if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0)  && attackermonster.Moveslotheal == 4){
                            Teller = HealButton;
                        }else if(ratiohealth >= 45 && ratiohealth <= 80){
                            if (attackermonster.Moveslotheal == 1){
                                if (delayedhealtimerA == 0){
                                    Teller = HealButton;
                                }else {
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                        Teller = SpecialAttack;
                                    }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                        Teller = Turn;
                                    }else {
                                        switch (new Random().nextInt(6)) {
                                            case 0:
                                                Teller = SpecialAttack;
                                                break;
                                            case 1:
                                                Teller = Status;
                                                break;
                                            case 2:
                                                Teller = Status;
                                                break;
                                            case 3:
                                                Teller = Status;
                                                break;
                                            case 4:
                                                Teller = Turn;
                                                break;
                                            case 5:
                                                Teller = Turn;
                                                break;

                                        }
                                    }
                                }
                            }
                        }else {
                            switch (new Random().nextInt(3)) {

                                case 0:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                        Teller = SpecialAttack;
                                    }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                        Teller = Turn;
                                    }else {
                                        Teller = Turn;
                                    }
                                    break;
                                case 1:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                        Teller = SpecialAttack;
                                    }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                        Teller = Turn;
                                    }else {
                                        Teller = Turn;
                                    }
                                    break;
                                case 2:
                                    if (attackermonster.Health < MaxHealthAttacker) {
                                        Teller = HealButton;
                                    }else {
                                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                            Teller = SpecialAttack;
                                        } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                            Teller = SpecialAttack;
                                        }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                            Teller = Turn;
                                        }else {
                                            Teller = Turn;
                                        }
                                    }
                                    break;

                            }
                        }
                    }else {
                        Teller = HealButton;
                    }
                }
                if(attackermonster.Moveslotheal == 3){
                    double what = (attackermonster.Attack / playermonster.Defense)/(attackermonster.Speed / attackermonster.Defense);
                    if (what > 1.0 ){
                        Teller = HealButton;
                    }
                }

                // should probably make something that keeps the monster from using heal over time over and over

                if (elongatedhealtimerA != 0 && attackermonster.Moveslotheal == 2){ // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }else {
                                Teller= Turn;
                            }
                            break;

                    }
                }


                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0)  && attackermonster.Moveslotheal == 4){
                    Teller = HealButton;
                }


            }

        }else if(ratiohealth >= 45 && ratiohealth <= 80){
            if (attackermonster.Moveslotheal == 1){
                if (delayedhealtimerA == 0){
                    Teller = HealButton;
                }else {
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;
                        case 2:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;

                    }
                }
            }
        }

            if (attackermonster.Moveslotheal ==  5){
                if (new Random().nextInt(100) == 59){
                    Teller = HealButton;
                }else {
                    switch (new Random().nextInt(9)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;
                        case 2:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;
                        case 3:
                            Teller = SpecialAttack;
                            break;
                        case 4:
                            Teller = Turn;
                            break;
                        case 5:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;

                        case 6:
                            Teller = SpecialAttack;
                            break;
                        case 7:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                Teller = SpecialAttack;
                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                Teller = Turn;
                            }else {
                                Teller = Turn;
                            }
                            break;
                        case 8:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }else {
                                Teller= Turn;
                            }
                            break;

                    }

                }
            }


        if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85)))) /*&& delayedblasttimerP < 2*/
