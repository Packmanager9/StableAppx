package ditzler.cole.stableapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class CalculatorBlueHerring extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herring_display_layout);


        final TextView Genetics, Geneticsa, Geneticsb, Geneticsc, BoxColors, Colorone, Colortwo, Colorthree, Colorfour;
        Genetics = (TextView) findViewById(R.id.Genes);
        Geneticsa = (TextView) findViewById(R.id.GenesA);
        Geneticsb = (TextView) findViewById(R.id.GenesB);
        Geneticsc = (TextView) findViewById(R.id.GenesC);
        Colorone = (TextView) findViewById(R.id.ColorOne);
        Colortwo = (TextView) findViewById(R.id.ColorTwo);
        Colorthree = (TextView) findViewById(R.id.ColorThree);
        Colorfour = (TextView) findViewById(R.id.ColorFour);
        BoxColors = (TextView) findViewById(R.id.Colorsbox);



        abstract class CalculatorBlueHerringTime extends AsyncTask {
            Timer timer;

            public void run() {
             //   doInBackground(new Runnable() {
                       //            @Override
                      //             public void run() {


                                       timer = new Timer();
                                       timer.schedule(new TimerTask() {
                                           @Override
                                           public void run() {
                                               String A = String.format("%s", (new Random().nextInt(10) + 1));
                                               String B = String.format("%s", (new Random().nextInt(10) + 1));
                                               String C = String.format("%s", (new Random().nextInt(10) + 1));
                                               String D = String.format("%s", (new Random().nextInt(10) + 1));
                                               String E = String.format("%s", (new Random().nextInt(10) + 1));
                                               String F = String.format("%s", (new Random().nextInt(10) + 1));
                                               String G = String.format("%s", (new Random().nextInt(10) + 1));
                                               String H = String.format("%s", (new Random().nextInt(10) + 1));
                                               String I = String.format("%s", (new Random().nextInt(10) + 1));


                                               Genetics.setText(A);
                                               Geneticsa.setText(B);
                                               Geneticsb.setText(C);
                                               Geneticsc.setText(D);
                                               Colorone.setText(E);
                                               Colortwo.setText(F);
                                               Colorthree.setText(G);
                                               Colorfour.setText(H);
                                               BoxColors.setText(I);

                                               //onProgressUpdate();


                                           }
                                       }, 100, 250);
                                   }
                               }
            }

        }


/*
            private void doInBackground(Runnable runnable) {
            }

            @Override
            protected Object doInBackground(Object[] objects) {
                return null;
            }
            protected void onProgressUpdate(String... values) {
                super.onProgressUpdate(values);

                String A = String.format("%s", (new Random().nextInt(10) + 1));
                String B = String.format("%s", (new Random().nextInt(10) + 1));
                String C = String.format("%s", (new Random().nextInt(10) + 1));
                String D = String.format("%s", (new Random().nextInt(10) + 1));
                String E = String.format("%s", (new Random().nextInt(10) + 1));
                String F = String.format("%s", (new Random().nextInt(10) + 1));
                String G = String.format("%s", (new Random().nextInt(10) + 1));
                String H = String.format("%s", (new Random().nextInt(10) + 1));
                String I = String.format("%s", (new Random().nextInt(10) + 1));

                Genetics.setText(A);
                Geneticsa.setText(B);
                Geneticsb.setText(C);
                Geneticsc.setText(D);
                Colorone.setText(E);
                Colortwo.setText(F);
                Colorthree.setText(G);
                Colorfour.setText(H);
                BoxColors.setText(I);
            }
        }
        new CalculatorBlueHerringTime(); */






/*
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herring_display_layout);



        Hare A = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare B = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare C = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );



        Genetics =(TextView) findViewById(R.id.Genes);
        Geneticsa =(TextView) findViewById(R.id.GenesA);
        Geneticsb =(TextView) findViewById(R.id.GenesB);
        Geneticsc =(TextView) findViewById(R.id.GenesC);
        Colorone =(TextView) findViewById(R.id.ColorOne);
        Colortwo =(TextView) findViewById(R.id.ColorTwo);
        Colorthree =(TextView) findViewById(R.id.ColorThree);
        Colorfour =(TextView) findViewById(R.id.ColorFour);
        BoxColors =(TextView) findViewById(R.id.Colorsbox);
        HareMethod();

        Genetics.setText(Theprintout);
        Geneticsa.setText(Theprintouta);
        Geneticsb.setText(Theprintoutb);
        Geneticsc.setText(Theprintoutc);
        BoxColors.setText(Colors);

        Colorone.setText(Q[0]);
        Colortwo.setText(Q[1]);
        Colorthree.setText(Q[2]);
        Colorfour.setText(Q[3]);
        BoxColors.setText(Colors);

        String ColorOne = Q[0];
        String ColorTwo = Q[1];
        String ColorThree = Q[2];
        String ColorFour = Q[3] ;

        Colorone.setTextColor(android.graphics.Color.parseColor(ColorOne));
        Colortwo.setTextColor(android.graphics.Color.parseColor(ColorTwo));
        Colorthree.setTextColor(android.graphics.Color.parseColor(ColorThree));
        Colorfour.setTextColor(android.graphics.Color.parseColor(ColorFour));

    }

    public void UnknownMethod(){
        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 100; ArrayCreationLoopCounter++){

            int BbCaseRandomizer = new Random().nextInt(2);
            int AaCaseRandomizer = new Random().nextInt(2);
            int CcCaseRandomizer = new Random().nextInt(2);
            if (AaCaseRandomizer == 0){
                A[ArrayCreationLoopCounter] = "A";
            }else {
                A[ArrayCreationLoopCounter] = "a";
            }
            if (BbCaseRandomizer == 0){
                B[ArrayCreationLoopCounter] = "B";
            }else {
                B[ArrayCreationLoopCounter] = "b";
            }
            if (CcCaseRandomizer == 0){
                C[ArrayCreationLoopCounter] = "C";
            }else {
                C[ArrayCreationLoopCounter] = "c";
            }

        }

        UnknownMethodTwo();

    }

    public void UnknownMethodTwo(){
        Lengthcointer = A.length;



        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 100; ArrayCreationLoopCounter++){
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps){
                swapcounter = (swapcounter+1)%3;
                steps = 0;
            }else {
                steps = steps + 1;
            }

            if (swapcounter == 1){
                I[ArrayCreationLoopCounter] = A[ArrayCreationLoopCounter];
            }else if (swapcounter == 0){
                I[ArrayCreationLoopCounter] = B[ArrayCreationLoopCounter];
            }else {
                I[ArrayCreationLoopCounter] = C[ArrayCreationLoopCounter];
            }
            Lengthcointer = Lengthcointer  - 1;

            Theprintout = String.format(Theprintout+I[ArrayCreationLoopCounter]);
        }



    }

    public void HareMethod(){

        /*
        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 120; ArrayCreationLoopCounter++){

            int BbCaseRandomizer = new Random().nextInt(2);
            int AaCaseRandomizer = new Random().nextInt(2);
            int CcCaseRandomizer = new Random().nextInt(2);
            if (AaCaseRandomizer == 0){
                A[ArrayCreationLoopCounter] = "A";
            }else {
                A[ArrayCreationLoopCounter] = "a";
            }
            if (BbCaseRandomizer == 0){
                B[ArrayCreationLoopCounter] = "B";
            }else {
                B[ArrayCreationLoopCounter] = "b";
            }
            if (CcCaseRandomizer == 0){
                C[ArrayCreationLoopCounter] = "C";
            }else {
                C[ArrayCreationLoopCounter] = "c";
            }

        }

        HareMethodTwo();

    }

    public void HareMethodTwo(){

        Hare A = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare B = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare C = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

                Hare D = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );


        Lengthcointer = A.Samething.length;



        for (ArrayCreationLoopCounter = 0; ArrayCreationLoopCounter < 121; ArrayCreationLoopCounter++){
            int checker = new Random().nextInt((Lengthcointer - countup));
            if (checker < steps){
                swapcounter = (swapcounter+1)%3;
                steps = 0;
            }else {
                steps = steps + 1;
            }

            if (swapcounter == 1){
                D.Samething[ArrayCreationLoopCounter] = A.Samething[ArrayCreationLoopCounter];
            }else if (swapcounter == 0){
                D.Samething[ArrayCreationLoopCounter] = B.Samething[ArrayCreationLoopCounter];
            }else {
                D.Samething[ArrayCreationLoopCounter] = C.Samething[ArrayCreationLoopCounter];
            }
            Lengthcointer = Lengthcointer  - 1;

            Theprintout = String.format(Theprintout+D.Samething[ArrayCreationLoopCounter]);

            Theprintouta = String.format(Theprintouta+A.Samething[ArrayCreationLoopCounter]);

            Theprintoutb = String.format(Theprintoutb+B.Samething[ArrayCreationLoopCounter]);

            Theprintoutc = String.format(Theprintoutc+C.Samething[ArrayCreationLoopCounter]);


            if ((ArrayCreationLoopCounter%5) == 0 && ArrayCreationLoopCounter != 0){


                int thisgoestocolor = (D.Samething[ArrayCreationLoopCounter-1]+D.Samething[ArrayCreationLoopCounter-2]+D.Samething[ArrayCreationLoopCounter-3]+D.Samething[ArrayCreationLoopCounter-4]+D.Samething[ArrayCreationLoopCounter-5]);

                Hash = String.format(Hash+FinalColorMethod(thisgoestocolor));
                stringcounter = stringcounter+1;

            }
            if (stringcounter == 6 && ArrayCreationLoopCounter != 0) {
                Colors = String.format(Colors + Hash);
                stringcounter = 0;
                Q[ColorCounter] = Hash;
                Hash = "#";


                ColorCounter = ColorCounter+1;
            }
        }



    }








    static class Hare implements Serializable {//static abstract class Hare extends AsyncTask {

        public int Sex;
        public int Color;
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

        public int hexRed1;
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
        int[] Samething = new int[124];

        public Hare(int sex, int Size, int color, int harealpha,int tailalpha, int bodytype, int at, int bt, int ct, int dt, int et, int ft,int at1, int bt1, int ct1, int dt1, int et1, int ft1,int at2, int bt2, int ct2, int dt2, int et2, int ft2,int at3, int bt3, int ct3, int dt3, int et3, int ft3,int at4, int bt4, int ct4, int dt4, int et4, int ft4, int eyeat1, int eyebt1, int eyect1, int eyedt1, int eyeet1, int eyeft1, int eyeat2, int eyebt2, int eyect2, int eyedt2, int eyeet2, int eyeft2, int eyeat3, int eyebt3, int eyect3, int eyedt3, int eyeet3, int eyeft3, int eyeat4, int eyebt4, int eyect4, int eyedt4, int eyeet4, int eyeft4, int eyeat5, int eyebt5, int eyect5, int eyedt5, int eyeet5, int eyeft5, int earat5, int earbt5, int earct5, int eardt5, int earet5, int earft5,  int tailat1, int tailbt1, int tailct1, int taildt1, int tailet1, int tailft1, int tailat2, int tailbt2, int tailct2, int taildt2, int tailet2, int tailft2, int tailat3, int tailbt3, int tailct3, int taildt3, int tailet3, int tailft3, int tailat4, int tailbt4, int tailct4, int taildt4, int tailet4, int tailft4, int tailat5, int tailbt5, int tailct5, int taildt5, int tailet5, int tailft5,int earat1, int earbt1, int earct1, int eardt1, int earet1, int earft1, int earat2, int earbt2, int earct2, int eardt2, int earet2, int earft2, int earat3, int earbt3, int earct3, int eardt3, int earet3, int earft3, int earat4, int earbt4, int earct4, int eardt4, int earet4, int earft4, int earstype, int tailstype, int earslength, int eyestype, double price, int angleone, int angletwo, int anglethree, int anglefour, int anglefive, int anglesix, int angleseven, int angleeight, int anglenine, int angleten) {
            Sex = sex;
            size = Size;
            Color = color;
            HareAlpha = harealpha;
            TailAlpha = tailalpha;
            BodyType = bodytype;
            At0 = at1;
            Samething[0] = At0;
            Bt0 = bt1;
            Samething[1] = Bt0;
            Ct0 = ct1;
            Samething[2] = Ct;
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
            Samething[29] = Et4;
            Ft4 = ft;
            Samething[30] =  Ft4;


            eyeAt0 = eyeat1;
            Samething[31] = eyeAt0;
            eyeBt0 = eyebt1;
            Samething[32] = eyeBt0;
            eyeCt0 = eyect1;
            Samething[33] =  eyeCt0;
            eyeDt0 = eyedt1;
            Samething[34] = eyeDt0;
            eyeEt0 = eyeet1;
            Samething[35] = eyeEt0;
            eyeFt0 = eyeft1;
            Samething[36] = eyeFt0;
            eyeAt1 = eyeat2;
            Samething[37] = eyeAt1;
            eyeBt1 = eyebt2;
            Samething[38] = eyeBt1;
            eyeCt1 = eyect2;
            Samething[39] = eyeCt1;
            eyeDt1 = eyedt2;
            Samething[40] =  eyeDt1;
            eyeEt1 = eyeet2;
            Samething[41] = eyeEt1;
            eyeFt1 = eyeft2;
            Samething[42] = eyeFt1;
            eyeAt2 = eyeat3;
            Samething[43] = eyeAt2;
            eyeBt2 = eyebt3;
            Samething[44] =  eyeBt2;
            eyeCt2 = eyect3;
            Samething[45] = eyeCt2;
            eyeDt2 = eyedt3;
            Samething[46] = eyeDt2;
            eyeEt2 = eyeet3;
            Samething[47] = eyeEt2;
            eyeFt2 = eyeft3;
            Samething[48] = eyeFt2;
            eyeAt3 = eyeat4;
            Samething[49] =eyeAt3;
            eyeBt3 = eyebt4;
            Samething[50] =eyeBt3;
            eyeCt3 = eyect4;
            Samething[51] =eyeCt3;
            eyeDt3 = eyedt4;
            Samething[52] =  eyeDt3;
            eyeEt3 = eyeet4;
            Samething[53] = eyeEt3;
            eyeFt3 = eyeft4;
            Samething[54] = eyeFt3;
            eyeAt4 = eyeat5;
            Samething[55] =  eyeAt4;
            eyeBt4 = eyebt5;
            Samething[56] = eyeBt4;
            eyeCt4 = eyect5;
            Samething[57] =  eyeCt4;
            eyeDt4 = eyedt5;
            Samething[58] = eyeDt4;
            eyeEt4 = eyeet5;
            Samething[59] =  eyeEt4;
            eyeFt4 = eyeft5;
            Samething[60] = eyeFt4;


            tailAt0 = tailat1;
            Samething[61] =tailAt0;
            tailBt0 = tailbt1;
            Samething[62] =tailBt0;
            tailCt0 = tailct1;
            Samething[63] =tailCt0;
            tailDt0 = taildt1;
            Samething[64] =tailDt0;
            tailEt0 = tailet1;
            Samething[65] =tailEt0;
            tailFt0 = tailft1;
            Samething[66] =tailFt0;
            tailAt1 = tailat2;
            Samething[67] =tailAt1;
            tailBt1 = tailbt2;
            Samething[68] =tailBt1;
            tailCt1 = tailct2;
            Samething[69] =tailCt1;
            tailDt1 = taildt2;
            Samething[70] =tailDt1;
            tailEt1 = tailet2;
            Samething[71] =tailEt1;
            tailFt1 = tailft2;
            Samething[72] =tailFt1;
            tailAt2 = tailat3;
            Samething[73] =tailAt2;
            tailBt2 = tailbt3;
            Samething[74] =tailBt2;
            tailCt2 = tailct3;
            Samething[75] =tailCt2;
            tailDt2 = taildt3;
            Samething[76] =tailDt2;
            tailEt2 = tailet3;
            Samething[77] =tailEt2;
            tailFt2 = tailft3;
            Samething[78] =tailFt2;
            tailAt3 = tailat4;
            Samething[79] =tailAt3;
            tailBt3 = tailbt4;
            Samething[80] =tailBt3;
            tailCt3 = tailct4;
            Samething[81] =tailCt3;
            tailDt3 = taildt4;
            Samething[82] =tailDt3;
            tailEt3 = tailet4;
            Samething[83] =tailEt3;
            tailFt3 = tailft4;
            Samething[84] =tailFt3;
            tailAt4 = tailat5;
            Samething[85] =tailAt4;
            tailBt4 = tailbt5;
            Samething[86] =tailBt4;
            tailCt4 = tailct5;
            Samething[87] =tailCt4;
            tailDt4 = taildt5;
            Samething[88] =tailDt4;
            tailEt4 = tailet5;
            Samething[89] =tailEt4;
            tailFt4 = tailft5;
            Samething[90] =tailFt4;


            earAt0 = earat1;
            Samething[91] =earAt0;
            earBt0 = earbt1;
            Samething[92] =earBt0;
            earCt0 = earct1;
            Samething[93] =earCt0;
            earDt0 = eardt1;
            Samething[94] =earDt0;
            earEt0 = earet1;
            Samething[95] =earEt0;
            earFt0 = earft1;
            Samething[96] =earFt0;
            earAt1 = earat2;
            Samething[97] =earAt1;
            earBt1 = earbt2;
            Samething[98] =earBt1;
            earCt1 = earct2;
            Samething[99] =earCt1;
            earDt1 = eardt2;
            Samething[100] =earDt1;
            earEt1 = earet2;
            Samething[101] =earEt1;
            earFt1 = earft2;
            Samething[102] =earFt1;
            earAt2 = earat3;
            Samething[103] =earAt2;
            earBt2 = earbt3;
            Samething[104] =earBt2;
            earCt2 = earct3;
            Samething[105] =earCt2;
            earDt2 = eardt3;
            Samething[106] =earDt2;
            earEt2 = earet3;
            Samething[107] =earEt2;
            earFt2 = earft3;
            Samething[107] =earFt2;
            earAt3 = earat4;
            Samething[109] =earAt3;
            earBt3 = earbt4;
            Samething[110] =earBt3;
            earCt3 = earct4;
            Samething[111] =earCt3;
            earDt3 = eardt4;
            Samething[112] =earDt3;
            earEt3 = earet4;
            Samething[113] =earEt3;
            earFt3 = earft4;
            Samething[114] =earFt3;
            earAt4 = earat5;
            Samething[115] =earAt4;
            earBt4 = earbt5;
            Samething[116] =earBt4;
            earCt4 = earct5;
            Samething[117] =earCt4;
            earDt4 = eardt5;
            Samething[118] =earDt4;
            earEt4 = earet5;
            Samething[119] =earEt4;
            earFt4 = earft5;
            Samething[120] =earFt4;

            Samething[121] =0;

            Samething[122]  =0;

            Samething[123] =0;




             hexRed1 = At0 + At1 + At2 + At3 + At4;
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
            AngleTotal = angleone + angletwo + anglethree + anglefour + anglefive + anglesix + angleseven + angleeight + anglenine + angleten;
        }


    }

public void HareGeneticsTest(){

        Hare A = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare B = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );

        Hare C = new Hare(Haresexint(),Haresizeint(), A(), Harealpha(), Harealpha(), 0, A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A(),A() );



}

public int A(){
        return new Random().nextInt(4);

}
public int Haresexint(){
        return new Random().nextInt(3);

}
public int Harealpha(){
        return (new Random().nextInt(128)+64);

}
public int Haresizeint(){
        return (new Random().nextInt(99)+40);

}

public void HareGeneticsTet(){

}

    public String FinalColorMethod(int A){
        String As = null;

        if (A==0){
            As = "0";
        }
        if (A==1){
            As = "1";
        }
        if (A==2){
            As = "2";
        }
        if (A==3){
            As = "3";
        }
        if (A==4){
            As = "4";
        }      if (A==5){
            As = "5";
        }
        if (A==6){
            As = "6";
        }
        if (A==7){
            As = "7";
        }
        if (A==8){
            As = "8";
        }
        if (A==9){
            As = "9";
        } if (A==10){
            As = "A";
        }
        if (A==11){
            As = "B";
        }
        if (A==12){
            As = "C";
        }
        if (A==13){
            As = "D";
        }
        if (A==14){
            As = "E";
        } if (A==15){
            As = "F";
        }

        return String.format(As);
    }


}
*/
