package ditzler.cole.stableapp;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class StereoscopePendulum extends AppCompatActivity{

    Typeface tf1;

    private  Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
 
    private  Integer imagosbig[] = {R.drawable.b0, R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6, R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14, R.drawable.b15, R.drawable.b16, R.drawable.b17, R.drawable.b18, R.drawable.b19, R.drawable.b20, R.drawable.b21, R.drawable.b22, R.drawable.b23, R.drawable.b24, R.drawable.b25, R.drawable.b26, R.drawable.b27, R.drawable.b28, R.drawable.b29, R.drawable.b30, R.drawable.b31, R.drawable.b32, R.drawable.b33, R.drawable.b34, R.drawable.b35, R.drawable.b36, R.drawable.b37, R.drawable.b38, R.drawable.b39, R.drawable.b40, R.drawable.b41, R.drawable.b42, R.drawable.b43, R.drawable.b44, R.drawable.b45, R.drawable.b46, R.drawable.b47, R.drawable.b48, R.drawable.b49, R.drawable.b50, R.drawable.b51, R.drawable.b52, R.drawable.b53, R.drawable.b54, R.drawable.b55, R.drawable.b56, R.drawable.b57, R.drawable.b58, R.drawable.b59};

    private  Integer imagosmedium[] = {R.drawable.d0, R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6, R.drawable.d7, R.drawable.d8, R.drawable.d9, R.drawable.d10, R.drawable.d11, R.drawable.d12, R.drawable.d13, R.drawable.d14, R.drawable.d15, R.drawable.d16, R.drawable.d17, R.drawable.d18, R.drawable.d19, R.drawable.d20, R.drawable.d21, R.drawable.d22, R.drawable.d23, R.drawable.d24, R.drawable.d25, R.drawable.d26, R.drawable.d27, R.drawable.d28, R.drawable.d29, R.drawable.d30, R.drawable.d31, R.drawable.d32, R.drawable.d33, R.drawable.d34, R.drawable.d35, R.drawable.d36, R.drawable.d37, R.drawable.d38, R.drawable.d39, R.drawable.d40, R.drawable.d41, R.drawable.d42, R.drawable.d43, R.drawable.d44, R.drawable.d45, R.drawable.d46, R.drawable.d47, R.drawable.d48, R.drawable.d49, R.drawable.d50, R.drawable.d51, R.drawable.d52, R.drawable.d53, R.drawable.d54, R.drawable.d55, R.drawable.d56, R.drawable.d57, R.drawable.d58, R.drawable.d59};
    String Eggstrings =  "%s";
    Timer timer;
    Button fasterbutton, slowerbutton;
    int days;
    int fastercatch, slowercatch;
    int hours;
    int minutes;
    int seconds;
    int daysa;
    int hoursa;
    int minutesa;
    int secondsa;
    int speedz = 100;
    int z = 0;
    int truecount = 0;
    int colorswitch;
    int timerdelayer;
    int imagecounter;
    int arrayreversal;
    ProgressBar LoadingScreenBar;
    String TimeString = "";
    String TimeStrings = "%s:%s";
    String TimeStringss = "%s:%s:%s";
    String TimeStringsso = "%s:%s%s:%s%s";
    String TimeStringsse = "%s:%s%s:%s";
    String TimeStringssm = "%s:%s:%s%s";
    TextView factorwindow, timewindow, TrueWindow;
    Button FasterButton, SlowerButton;
    ImageView daysview, hoursview, minutesview,rainbowview0z, secondsview, rainbowview0, rainbowview1, rainbowview2, rainbowview3, rainbowview4, rainbowview5, rainbowview6, rainbowview01, rainbowview11, rainbowview21, rainbowview31, rainbowview41, rainbowview51, rainbowview61, faceview0, faceview1, faceview2, faceview3, faceview4, faceview5, faceview6;
    double goal;
    double kount;
    int xcounter, zcounter;
    int ycounter, wcounter;
    int canvascounter;
    int ZERO = 0;
    String showme = "";
    String showmeme = "";
    int[] speedarray = new int[201];
    ImageView clockface, clockhandsecond, clockhandminute, clockhandhour, pendulumface;
    int angle, arcminute, pendirector0, pendirector1, pendirector2, pendirector3, pendirector4, pendirector5, pendirector6, penset;

    /*
                    double onehalf0 = 0.090;
                    double onehalf1 = 0.105;
                    double onehalf2 = 0.120;
                    double onehalf3 = 0.135;
                    double onehalf4 = 0.150;
                    double onehalf5 = 0.165;
                    dble onehalf6 = 0.180; */
    /*
                    double onehalf0 = 0.09;
                    double onehalf1 = 0.095;
                    double onehalf2 = 0.100;
                    double onehalf3 = 0.105;
                    double onehalf4 = 0.110;
                    double onehalf5 = 0.115;
                    double onehalf6 = 0.120;
*/int kcounter;
                    double onehalf0 = 0.09;
                    double onehalf1 = 0.10285;
                    double onehalf2 = 0.11570;
                    double onehalf3 = 0.12855;
                    double onehalf4 = 0.14140;
                    double onehalf5 = 0.15425;
                    double onehalf6 = 0.16710;
                    double onehalf01 = 0.36/4;
                    double onehalf11 = 0.37285/4;
                    double onehalf21 = 0.38570/4;
                    double onehalf31 = 0.39855/4;
                    double onehalf41 = 0.41140/4;
                    double onehalf51 = 0.42425/4;
                    double onehalf61 = 0.43710/4;
                    /*
                    double onehalf01 = 0.36/2;
                    double onehalf11 = 0.365/2;
                    double onehalf21 = 0.37/2;
                    double onehalf31 = 0.375/2;
                    double onehalf41 = 0.38/2;
                    double onehalf51 = 0.385/2;
                    double onehalf61 = 0.39/2;*/
        double[] intarray0 = new double[180];
        double[] intarray1 = new double[180];
        double[] intarray2 = new double[180];
        double[] intarray3 = new double[180];
        double[] intarray4 = new double[180];
        double[] intarray5 = new double[180];
        double[] intarray6 = new double[180];

        double[] intarray01 = new double[360];
        double[] intarray11 = new double[360];
        double[] intarray21 = new double[360];
        double[] intarray31 = new double[360];
        double[] intarray41 = new double[360];
        double[] intarray51 = new double[360];
        double[] intarray61 = new double[360];

        double[] intarray02 = new double[721];
        double[] intarray12 = new double[721];
        double[] intarray22 = new double[721];
        double[] intarray32 = new double[721];
        double[] intarray42 = new double[721];
        double[] intarray52 = new double[721];
        double[] intarray62 = new double[721];/*
        double[] intarray01 = new double[501];
        double[] intarray11 = new double[501];
        double[] intarray21 = new double[501];
        double[] intarray31 = new double[501];
        double[] intarray41 = new double[501];
        double[] intarray51 = new double[501];
        double[] intarray61 = new double[501];*/
        int x;
        int mix;
                int  bix = 255;
                int syx = 128;
                int kix;
        double y = 90;
    double y1;
    Matrix[] matarray0 = new Matrix[180];
    Matrix[] matarray1 = new Matrix[180];
    Matrix[] matarray2 = new Matrix[180];
    Matrix[] matarray3 = new Matrix[180];
    Matrix[] matarray4 = new Matrix[180];
    Matrix[] matarray5 = new Matrix[180];
    Matrix[] matarray6 = new Matrix[180];
    /*
    Matrix[] matarray01z = new Matrix[501];
    Matrix[] matarray11 = new Matrix[501];
    Matrix[] matarray21 = new Matrix[501];
    Matrix[] matarray31 = new Matrix[501];
    Matrix[] matarray41 = new Matrix[501];
    Matrix[] matarray51 = new Matrix[501];
    Matrix[] matarray61 = new Matrix[501];*/
    Matrix[] matarray01z = new Matrix[361];
    Matrix[] matarray11 = new Matrix[361];
    Matrix[] matarray21 = new Matrix[361];
    Matrix[] matarray31 = new Matrix[361];
    Matrix[] matarray41 = new Matrix[361];
    Matrix[] matarray51 = new Matrix[361];
    Matrix[] matarray61 = new Matrix[361];

    final Bitmap[] bMapRotatepen0 = new Bitmap[180];
    final Bitmap[] bMapRotatepen1 = new Bitmap[180];
    final Bitmap[] bMapRotatepen2 = new Bitmap[180];
    final Bitmap[] bMapRotatepen3 = new Bitmap[180];
    final Bitmap[] bMapRotatepen4 = new Bitmap[180];
    final Bitmap[] bMapRotatepen5 = new Bitmap[180];
    final Bitmap[] bMapRotatepen6 = new Bitmap[180];
    /*
    final Bitmap[] bMapRotatepen01 = new Bitmap[501];
    final Bitmap[] bMapRotatepen11 = new Bitmap[501];
    final Bitmap[] bMapRotatepen21 = new Bitmap[501];
    final Bitmap[] bMapRotatepen31 = new Bitmap[501];
    final Bitmap[] bMapRotatepen41 = new Bitmap[501];
    final Bitmap[] bMapRotatepen51 = new Bitmap[501];
    final Bitmap[] bMapRotatepen61 = new Bitmap[501];
    final Bitmap[] cancelarray = new Bitmap[502];*/
    final Bitmap[] bMapRotatepen01 = new Bitmap[361];
    final Bitmap[] bMapRotatepen11 = new Bitmap[361];
    final Bitmap[] bMapRotatepen21 = new Bitmap[361];
    final Bitmap[] bMapRotatepen31 = new Bitmap[361];
    final Bitmap[] bMapRotatepen41 = new Bitmap[361];
    final Bitmap[] bMapRotatepen51 = new Bitmap[361];
    final Bitmap[] bMapRotatepen61 = new Bitmap[361];
    final Bitmap[] cancelarray = new Bitmap[721];

    int summit;
    int asterisk = 1;
    int[] redarray = new int[769];
    int[] greenarray = new int[769];
    int[] bluearray = new int[769];

    int[] redarray0 = new int[769];
    int[] greenarray0 = new int[769];
    int[] bluearray0 = new int[769];

    int[] redarray1 = new int[769];
    int[] greenarray1 = new int[769];
    int[] bluearray1 = new int[769];

    int[] redarray2 = new int[769];
    int[] greenarray2 = new int[769];
    int[] bluearray2 = new int[769];

    int[] redarray3 = new int[769];
    int[] greenarray3 = new int[769];
    int[] bluearray3 = new int[769];

    int[] redarray4 = new int[769];
    int[] greenarray4 = new int[769];
    int[] bluearray4 = new int[769];

    int[] redarray5 = new int[769];
    int[] greenarray5 = new int[769];
    int[] bluearray5 = new int[769];

    int[] redicarray = new int[361];

    Canvas[] canvas = new Canvas[722];
   // Canvas[] canvas = new Canvas[502];

    int[] redarray6 = new int[769];
    int[] greenarray6 = new int[769];
    int[] bluearray6 = new int[769];
    double penangle0, penangle1, penangle2, penangle3, penangle4, penangle5, penangle6,penangle01, penangle11, penangle21, penangle31, penangle41, penangle51, penangle61, pencounter0, pencounter1, pencounter2, pencounter3, pencounter4, pencounter5, pencounter6, pencounter01, pencounter11, pencounter21, pencounter31, pencounter41, pencounter51, pencounter61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stereoscope_layout_pendulum);
        Context context = getApplicationContext();
        daysview = (ImageView)  findViewById(R.id.red);
        hoursview = (ImageView)  findViewById(R.id.black);
        minutesview = (ImageView)  findViewById(R.id.blue);
        fasterbutton = (Button) findViewById(R.id.faster);
        slowerbutton = (Button) findViewById(R.id.slower);
        LoadingScreenBar = (ProgressBar)  findViewById(R.id.LoadBar);
        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.dotssix);
        Bitmap transparentmap = BitmapFactory.decodeResource(getResources(), R.drawable.tinytransparent);

        Bitmap mutablepenmap = transparentmap.copy(Bitmap.Config.ARGB_4444, true);

        LoadingScreenBar.setProgress(9);


        init();


        whytho();


/*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (intarray0[zcounter] <= 0) {
                    ycounter--;
                    ycounter = ycounter % 7;
                    if (ycounter == -1) {
                        ycounter = 6;
                    }
                }else {
                    ycounter++;
                    ycounter = ycounter % 7;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        switch (ycounter) {
                            case 0:
                                rainbowview0.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 1:

                                rainbowview1.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 2:

                                rainbowview2.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 3:

                                rainbowview3.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 4:

                                rainbowview4.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 5:

                                rainbowview5.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 6:

                                rainbowview6.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                        }
                    }
                });
            }
        }, 0, ((4501)));
*/
/*
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                if (pendirector0 == 0) {
                    pencounter0 = pencounter0 + onehalf0;
                    penangle0 = pencounter0 + penangle0;
                    if (penangle0 >= 0) {
                        pendirector0 = 1;
                    }
                } else {
                    pencounter0 = pencounter0 - onehalf0;
                    penangle0 = penangle0 + pencounter0;
                    if (penangle0 <= 0) {
                        pendirector0 = 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter1 = pencounter1 + onehalf1;
                    penangle1 = pencounter1+ penangle1;
                    if (penangle1 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter1= pencounter1- onehalf1;
                    penangle1 = penangle1 + pencounter1;
                    if (penangle1 <= 0) {
                        pendirector0= 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter2 = pencounter2 + onehalf2;
                    penangle2 = pencounter2+ penangle2;
                    if (penangle2 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter2= pencounter2- onehalf2;
                    penangle2 = penangle2 + pencounter2;
                    if (penangle2 <= 0) {
                        pendirector0= 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter3 = pencounter3 + onehalf3;
                    penangle3 = pencounter3+ penangle3;
                    if (penangle3 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter3= pencounter3- onehalf3;
                    penangle3 = penangle3 + pencounter3;
                    if (penangle3 <= 0) {
                        pendirector0= 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter4 = pencounter4 + onehalf4;
                    penangle4 = pencounter4+ penangle4;
                    if (penangle4 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter4= pencounter4- onehalf4;
                    penangle4 = penangle4 + pencounter4;
                    if (penangle4 <= 0) {
                        pendirector0= 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter5 = pencounter5 + onehalf5;
                    penangle5 = pencounter5+ penangle5;
                    if (penangle5 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter5= pencounter5- onehalf5;
                    penangle5 = penangle5 + pencounter5;
                    if (penangle5 <= 0) {
                        pendirector0= 0;
                    }
                }


                if (pendirector0== 0) {

                    pencounter6 = pencounter6 + onehalf6;
                    penangle6 = pencounter6+ penangle6;
                    if (penangle6 >= 0) {
                        pendirector0= 1;
                    }
                } else {
                    pencounter6= pencounter6- onehalf6;
                    penangle6 = penangle6 + pencounter6;
                    if (penangle6 <= 0) {
                        pendirector0= 0;
                    }
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

/*
                        Matrix matpen0 = new Matrix();
                        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.pendulumhandtwosmall);

                        int penmapwidth = penmap.getWidth();
                        int penmapheight = penmap.getHeight();
                        int newWidthpen = 600;
                        int newHeightpen = 600;

                        float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
                        float scaleHeightpen = ((float) newHeightpen) / penmapheight;


                        matpen0.postScale(scaleWidthpen, scaleHeightpen);


                        matpen0.postRotate(((int)penangle0));
                        Bitmap bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview0.setImageBitmap(bMapRotatepen0);


                        matpen0.postRotate(((int)(penangle1-penangle0)));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview1.setImageBitmap(bMapRotatepen0);


                        matpen0.postRotate(((int)(penangle2 -penangle1)));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview2.setImageBitmap(bMapRotatepen0);


                        matpen0.postRotate(((int)(penangle3-penangle2)));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview3.setImageBitmap(bMapRotatepen0);

                        matpen0.postRotate(((int)(penangle4-penangle3)));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview4.setImageBitmap(bMapRotatepen0);

                        matpen0.postRotate(((int)(penangle5 - penangle4)));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview5.setImageBitmap(bMapRotatepen0);

                        matpen0.postRotate(((int)(penangle6 - penangle5 )));
                        bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        rainbowview6.setImageBitmap(bMapRotatepen0);


                        rainbowview0.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview1.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview2.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview3.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview4.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview5.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview6.setScaleType(ImageView.ScaleType.CENTER);

                        Matrix matpen0 = new Matrix();
                        Matrix matpen1 = new Matrix();
                        Matrix matpen2 = new Matrix();
                        Matrix matpen3 = new Matrix();
                        Matrix matpen4 = new Matrix();
                        Matrix matpen5 = new Matrix();
                        Matrix matpen6 = new Matrix();
                        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.a45);

                        int penmapwidth = penmap.getWidth();
                        int penmapheight = penmap.getHeight();
                        int newWidthpen = 250;
                        int newHeightpen = 250;

                        matpen0.postRotate(((int)penangle0));
                        matpen1.postRotate(((int)penangle1));
                        matpen2.postRotate(((int)penangle2));
                        matpen3.postRotate(((int)penangle3));
                        matpen4.postRotate(((int)penangle4));
                        matpen5.postRotate(((int)penangle5));
                        matpen6.postRotate(((int)penangle6));

                        float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
                        float scaleHeightpen = ((float) newHeightpen) / penmapheight;
                        matpen0.postScale(scaleWidthpen, scaleHeightpen);
                        matpen1.postScale(scaleWidthpen, scaleHeightpen);
                        matpen2.postScale(scaleWidthpen, scaleHeightpen);
                        matpen3.postScale(scaleWidthpen, scaleHeightpen);
                        matpen4.postScale(scaleWidthpen, scaleHeightpen);
                        matpen5.postScale(scaleWidthpen, scaleHeightpen);
                        matpen6.postScale(scaleWidthpen, scaleHeightpen);
                        Bitmap bMapRotatepen0 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen0, true);
                        Bitmap bMapRotatepen1 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen1, true);
                        Bitmap bMapRotatepen2 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen2, true);
                        Bitmap bMapRotatepen3 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen3, true);
                        Bitmap bMapRotatepen4 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen4, true);
                        Bitmap bMapRotatepen5 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen5, true);
                        Bitmap bMapRotatepen6 = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen6, true);

                        rainbowview0.setImageBitmap(bMapRotatepen0);
                        rainbowview1.setImageBitmap(bMapRotatepen1);
                        rainbowview2.setImageBitmap(bMapRotatepen2);
                        rainbowview3.setImageBitmap(bMapRotatepen3);
                        rainbowview4.setImageBitmap(bMapRotatepen4);
                        rainbowview5.setImageBitmap(bMapRotatepen5);
                        rainbowview6.setImageBitmap(bMapRotatepen6);

                        rainbowview0.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview1.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview2.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview3.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview4.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview5.setScaleType(ImageView.ScaleType.CENTER);
                        rainbowview6.setScaleType(ImageView.ScaleType.CENTER);

                    }
                });
            }
        }, 0, 19);
*/
        /*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ycounter++;
                ycounter = ycounter %7;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        switch (ycounter) {
                            case 0:

                                rainbowview0.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview0.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview1.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview2.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview3.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview4.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview5.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview6.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 1:

                                rainbowview1.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview1.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview2.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview3.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview4.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview5.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview6.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview0.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 2:

                                rainbowview2.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview2.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview3.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview4.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview5.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview6.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview0.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview1.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 3:

                                rainbowview3.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview4.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview3.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview4.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview5.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview6.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview0.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview1.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview2.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 4:

                                rainbowview4.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview5.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview4.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview5.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview6.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview0.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview1.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview2.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview3.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 5:

                                rainbowview5.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview6.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview5.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview6.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview0.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview1.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview2.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview3.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview4.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                            case 6:

                                rainbowview6.setColorFilter(Color.argb(255, 255, 0, 0));
                                rainbowview0.setColorFilter(Color.argb(255, 255, 128, 0));
                                rainbowview1.setColorFilter(Color.argb(255, 255, 255, 0));
                                rainbowview2.setColorFilter(Color.argb(255, 0, 255, 0));
                                rainbowview3.setColorFilter(Color.argb(255, 0, 255, 255));
                                rainbowview4.setColorFilter(Color.argb(255, 0, 128, 255));
                                rainbowview5.setColorFilter(Color.argb(255, 0, 0, 255));

                                faceview6.setColorFilter(Color.argb(255, 255, 0, 0));
                                faceview0.setColorFilter(Color.argb(255, 255, 128, 0));
                                faceview1.setColorFilter(Color.argb(255, 255, 255, 0));
                                faceview2.setColorFilter(Color.argb(255, 0, 255, 0));
                                faceview3.setColorFilter(Color.argb(255, 0, 255, 255));
                                faceview4.setColorFilter(Color.argb(255, 0, 128, 255));
                                faceview5.setColorFilter(Color.argb(255, 0, 0, 255));
                                break;
                        }
                    }
                });
            }


        }, 0, 50);*/
    }

    private Bitmap createSingleImageFromMultipleImages() {


        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.tinytransparent);
/*        int penmapwidth = penmap.getWidth();  //423
        int penmapheight = penmap.getHeight();  //423
        Matrix DefaultMatrix = new Matrix();

        double newWidthpen = (penmapwidth)*1;
        double newHeightpen = (penmapheight)*1;
        float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
        float scaleHeightpen = ((float) newHeightpen) / penmapheight;
        DefaultMatrix.postScale(scaleWidthpen, scaleHeightpen);
        */
        Bitmap realpenmap = penmap.copy(Bitmap.Config.ARGB_8888, true);
        //Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, DefaultMatrix, true);
        // Bitmap realistpenmap = realpenmap.copy(Bitmap.Config.ARGB_8888, true);
        canvas[canvascounter] = new Canvas(realpenmap);


        Bitmap Temp0 = bMapRotatepen01[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp1 = bMapRotatepen11[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp2 = bMapRotatepen21[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp3 = bMapRotatepen31[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp4 = bMapRotatepen41[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp5 = bMapRotatepen51[imagecounter].copy(Bitmap.Config.ARGB_4444, true);
        Bitmap Temp6 = bMapRotatepen61[imagecounter].copy(Bitmap.Config.ARGB_4444, true);

        changeColorRed(Temp0);
        changeColorOrange(Temp1);
        changeColorYellow(Temp2);
        changeColorGreen(Temp3);
        changeColorBlue(Temp4);
        changeColorIndigo(Temp5);
        changeColorViolet(Temp6);
        //  canvas[canvascounter].drawBitmap(changeColorRed(Temp0), Temp0.getWidth()/2, Temp0.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorOrange(Temp1), Temp1.getWidth()/2, Temp1.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorYellow(Temp2), Temp2.getWidth()/2, Temp2.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorGreen(Temp3), Temp3.getWidth()/2, Temp3.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorBlue(Temp4), Temp4.getWidth()/2, Temp4.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorIndigo(Temp5), Temp5.getWidth()/2, Temp5.getHeight()/2, null);
        //  canvas[canvascounter].drawBitmap(changeColorViolet(Temp6), Temp6.getWidth()/2, Temp6.getHeight()/2, null);
        if (imagecounter >= (bMapRotatepen01.length - 2)){
            arrayreversal = 1;
        }
        if (arrayreversal==0) {
            imagecounter++;
        }else {
            imagecounter--;
            if (imagecounter < 0){
                imagecounter = 0;
            }
        }
        canvascounter++;
        return realpenmap;
    }

    private void changeColorRed(Bitmap takein){
     changeBitmapColor0(takein, Color.parseColor("#ff0000"));

    }
    private void changeColorOrange(Bitmap takein){
       changeBitmapColor1(takein, Color.parseColor("#ff8800"));

    }
    private void changeColorYellow(Bitmap takein){
       changeBitmapColor2(takein, Color.parseColor("#ffff00"));

    }
    private void changeColorGreen(Bitmap takein){
       changeBitmapColor3(takein, Color.parseColor("#00ff00"));

    }
    private void changeColorBlue(Bitmap takein){
       changeBitmapColor4(takein, Color.parseColor("#00ff88"));

    }
    private void changeColorIndigo(Bitmap takein){
         changeBitmapColor5(takein, Color.parseColor("#0088ff"));

    }
    private void changeColorViolet(Bitmap takein){


        changeBitmapColor6(takein, Color.parseColor("#0000ff"));

    }
    private void changeBitmapColor0(Bitmap sourceBitmap, int color) {


        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);


        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#ff0000"));
        p.setColorFilter(filter);
        /*
        int topheight = sourceBitmap.getHeight()/2;
        int topwidth = sourceBitmap.getWidth()/2;
*/

        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor1(Bitmap sourceBitmap, int color) {

        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);
        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#ff8800"));
        p.setColorFilter(filter);
        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor2(Bitmap sourceBitmap, int color) {
        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);

        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#ffff00"));
        p.setColorFilter(filter);
        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor3(Bitmap sourceBitmap, int color) {

        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);

        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#88ff00"));
        p.setColorFilter(filter);
        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor4(Bitmap sourceBitmap, int color) {

        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);

        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#00ff00"));
        p.setColorFilter(filter);
        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor5(Bitmap sourceBitmap, int color) {

        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);

        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#0088ff"));
        p.setColorFilter(filter);
        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
    }

    private void changeBitmapColor6(Bitmap sourceBitmap, int color) {

        int canvaswidth = canvas[canvascounter].getWidth();
        int canvasheight = canvas[canvascounter].getHeight();
        int penwidth = sourceBitmap.getWidth();
        int penheight = sourceBitmap.getHeight();
        int centerx = ((canvaswidth - penwidth)/2);
        int centery = ((canvasheight - penheight)/2);

        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,
                sourceBitmap.getWidth(), sourceBitmap.getHeight());
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(color, Color.parseColor("#0000ff"));
        p.setColorFilter(filter);

        canvas[canvascounter].drawBitmap(resultBitmap, centerx, centery, p);
        //canvas[canvascounter].drawBitmap(resultBitmap, resultBitmap.getWidth()/2, resultBitmap.getHeight()/2, p); // this one makes them bounce around
    }

    public void whytho() {


        LoadingScreenBar.setVisibility(View.INVISIBLE);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                zcounter++;
                kcounter++;
                kcounter = kcounter%720;
               // kcounter = redicarray[kcounter+1];
                zcounter = zcounter%180;
                if (zcounter == 179){
                    xcounter++;
                    xcounter = xcounter%201;

                    timer.cancel(); // cancel time
                  whytho(); // start the time again with a new period time
                }


                if (fastercatch > 0){
                    if (speedz <= 10){
                        speedz--;
                    }else {
                        speedz = speedz - 5;
                    }
                    if (speedz <= 0){
                        speedz = 1;
                    }
                    fastercatch = 0;

                    timer.cancel(); // cancel time
                    whytho(); // start the time again with a new period time
                }

                if (slowercatch > 0){

                    if (speedz <= 10){
                        speedz++;
                    }else {
                        speedz = speedz + 5;
                    }
                    slowercatch = 0;

                    timer.cancel(); // cancel time
                    whytho(); // start the time again with a new period time
                }

                /*
                if (zcounter == 179){
                    ycounter++;
                    ycounter = ycounter%7;
                }
*/
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rainbowview0.setImageBitmap(cancelarray[kcounter]);

                        rainbowview0.setScaleType(ImageView.ScaleType.CENTER);

                        rainbowview0z.setImageBitmap(bMapRotatepen0[zcounter]);
                        rainbowview1.setImageBitmap(bMapRotatepen1[zcounter]);
                        rainbowview2.setImageBitmap(bMapRotatepen2[zcounter]);
                        rainbowview3.setImageBitmap(bMapRotatepen3[zcounter]);
                        rainbowview4.setImageBitmap(bMapRotatepen4[zcounter]);
                        rainbowview5.setImageBitmap(bMapRotatepen5[zcounter]);
                        rainbowview6.setImageBitmap(bMapRotatepen6[zcounter]);  /*
*/

                        rainbowview01.setImageBitmap(bMapRotatepen0[Math.abs(zcounter-90)]);
                        rainbowview11.setImageBitmap(bMapRotatepen1[Math.abs(zcounter-90)]);
                        rainbowview21.setImageBitmap(bMapRotatepen2[Math.abs(zcounter-90)]);
                        rainbowview31.setImageBitmap(bMapRotatepen3[Math.abs(zcounter-90)]);
                        rainbowview41.setImageBitmap(bMapRotatepen4[Math.abs(zcounter-90)]);
                        rainbowview51.setImageBitmap(bMapRotatepen5[Math.abs(zcounter-90)]);
                        rainbowview61.setImageBitmap(bMapRotatepen6[Math.abs(zcounter-90)]);

/*
                        rainbowview01.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview11.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview21.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview31.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview41.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview51.setColorFilter(Color.argb(255, bix, syx, mix));
                        rainbowview61.setColorFilter(Color.argb(255, bix, syx, mix));
                        */
                    }
                });
            }
        }, 0, /*speedarray[xcounter]*/ speedz);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                colorswitch = (colorswitch + 1)%769;

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rainbowview01.setColorFilter(Color.argb(255, redarray0[(colorswitch)%768], greenarray0[(colorswitch)%768], bluearray0[(colorswitch)%768]));
                        rainbowview11.setColorFilter(Color.argb(255, redarray1[(colorswitch)%768], greenarray1[(colorswitch)%768], bluearray1[(colorswitch)%768]));
                        rainbowview21.setColorFilter(Color.argb(255, redarray2[(colorswitch)%768], greenarray2[(colorswitch)%768], bluearray2[(colorswitch)%768]));
                        rainbowview31.setColorFilter(Color.argb(255, redarray3[(colorswitch)%768], greenarray3[(colorswitch)%768], bluearray3[(colorswitch)%768]));
                        rainbowview41.setColorFilter(Color.argb(255, redarray4[(colorswitch)%768], greenarray4[(colorswitch)%768], bluearray4[(colorswitch)%768]));
                        rainbowview51.setColorFilter(Color.argb(255, redarray5[(colorswitch)%768], greenarray5[(colorswitch)%768], bluearray5[(colorswitch)%768]));
                        rainbowview61.setColorFilter(Color.argb(255, redarray6[(colorswitch)%768], greenarray6[(colorswitch)%768], bluearray6[(colorswitch)%768]));
                        
                        /*
                        rainbowview01.setColorFilter(Color.argb(255, redarray[(colorswitch+657)%768], greenarray[(colorswitch+657)%768], bluearray[(colorswitch+657)%768]));
                        rainbowview11.setColorFilter(Color.argb(255, redarray[(colorswitch+548)%768], greenarray[(colorswitch+548)%768], bluearray[(colorswitch+548)%768]));
                        rainbowview21.setColorFilter(Color.argb(255, redarray[(colorswitch+439)%768], greenarray[(colorswitch+439)%768], bluearray[(colorswitch+439)%768]));
                        rainbowview31.setColorFilter(Color.argb(255, redarray[(colorswitch+330)%768], greenarray[(colorswitch+330)%768], bluearray[(colorswitch+330)%768]));
                        rainbowview41.setColorFilter(Color.argb(255, redarray[(colorswitch+220)%768], greenarray[(colorswitch+220)%768], bluearray[(colorswitch+220)%768]));
                        rainbowview51.setColorFilter(Color.argb(255, redarray[(colorswitch+110)%768], greenarray[(colorswitch+110)%768], bluearray[(colorswitch+110)%768]));
                        rainbowview61.setColorFilter(Color.argb(255, redarray[(colorswitch)%768], greenarray[(colorswitch)%768], bluearray[(colorswitch)%768]));
                        */
                    }
                });
            }
        }, 0, 1);

    }

    public void init(){




        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.dotssix);

        Bitmap transparentmap = BitmapFactory.decodeResource(getResources(), R.drawable.tinytransparent);

        Bitmap mutablepenmap = transparentmap.copy(Bitmap.Config.ARGB_4444, true);


/*
        for ( int q = 0; q < 721;q++ ){
            canvas[q] = new Canvas(mutablepenmap);
        }
*/
        for ( int q = 0; q < 359;q++ ){
            redicarray[q] = q;
        }
        redicarray[360]  = 0;

/*
        for ( int q = 0; q < 502;q++ ){
            canvas[q] = new Canvas(mutablepenmap);
        }*/



  /*
        penangle0 = 90;
        penangle1 = 102;
        penangle2 = 114;
        penangle3 = 126;
        penangle4 = 138;
        penangle5 = 150;
        penangle6 = 162;
    */
        penangle0 = 90;
        penangle1 = 95;
        penangle2 = 100;
        penangle3 = 105;
        penangle4 = 110;
        penangle5 = 115;
        penangle6 = 120;
        penangle01 = 360;
        penangle11 = 365;
        penangle21 = 370;
        penangle31 = 375;
        penangle41 = 380;
        penangle51 = 385;
        penangle61 = 390;
      /*
        penangle0 = 60;
        penangle1 = 63;
        penangle2 = 66;
        penangle3 = 69;
        penangle4 = 72;
        penangle5 = 75;
        penangle6 = 78;
 */

        for ( int colorswitch = 0; colorswitch < 769;colorswitch++ ){
            if(colorswitch <= 127){
                bix = bix - 1; // from 255 to  128
                syx = syx + 1; // from 128 to 255
            }
            if(colorswitch <= 255 && colorswitch > 127){
                bix--; // from 128 to 0
                mix++; // from 0 to 128
            }
            if(colorswitch >= 256 && colorswitch < 383){
                mix = mix + 1; // from 128 to 255
                syx--; // from 255 to 128
            }
            if(colorswitch >= 384 && colorswitch < 512){
                syx--; // from 128 to 0
                bix++; // from 0 to 128
            }
            if(colorswitch >= 513 && colorswitch < 640){
                mix--; // from 255 to 128
                bix++; // from 128 to 255
            }
            if(colorswitch >= 641 && colorswitch < 769){
                mix--; // from 128 to 0
                syx++; // from 0 to 128

            }
            if (colorswitch == 0){
                bix = 255;
                syx = 128;
                mix = 0;
            }
            redarray[colorswitch] = bix;
            greenarray[colorswitch] = syx;
            bluearray[colorswitch] = mix;
        }

        for ( int z = 0; z <= redarray.length;z++ ) {


            redarray0[(z) % 769] = redarray[(z + 110) % 769];
            redarray1[(z) % 769] = redarray[(z + 219) % 769];
            redarray2[(z) % 769] = redarray[(z + 329) % 769];
            redarray3[(z) % 769] = redarray[(z + 438) % 769];
            redarray4[(z) % 769] = redarray[(z + 548) % 769];
            redarray5[(z) % 769] = redarray[(z + 657) % 769];
            redarray6[(z) % 769] = redarray[(z + 767) % 769];


            bluearray0[(z) % 769] = bluearray[(z + 110) % 769];
            bluearray1[(z) % 769] = bluearray[(z + 219) % 769];
            bluearray2[(z) % 769] = bluearray[(z + 329) % 769];
            bluearray3[(z) % 769] = bluearray[(z + 438) % 769];
            bluearray4[(z) % 769] = bluearray[(z + 548) % 769];
            bluearray5[(z) % 769] = bluearray[(z + 657) % 769];
            bluearray6[(z) % 769] = bluearray[(z + 767) % 769];


            greenarray0[(z) % 769] = greenarray[(z + 110) % 769];
            greenarray1[(z) % 769] = greenarray[(z + 219) % 769];
            greenarray2[(z) % 769] = greenarray[(z + 329) % 769];
            greenarray3[(z) % 769] = greenarray[(z + 438) % 769];
            greenarray4[(z) % 769] = greenarray[(z + 548) % 769];
            greenarray5[(z) % 769] = greenarray[(z + 657) % 769];
            greenarray6[(z) % 769] = greenarray[(z + 767) % 769];

        }


        colorswitch = 0;
        summit = 50;

        for ( int x = 0; x < 201;x++ ){
            summit = summit - asterisk;
            if ( summit == 1){
                asterisk = -1;
            }
            if (summit == 50){
                asterisk = 1;
            }

            speedarray[x] = summit;

        }


        // y1 = 360;pendirector0=0;
        y1 = 360;pendirector0=0;
        for (int x = 0; x < 360; x++){
            intarray01[x] = y1;
            if (pendirector0 == 0) {
                pencounter01 = pencounter01 + onehalf01;
                y1 = pencounter01 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter01 = pencounter01 - onehalf01;
                y1 = y1 + pencounter01;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }//pendirector0=0;
        //y1 = 365;
        pendirector0=0;
        y1 = 372.85;
        for (int x = 0; x < 360; x++){
            intarray11[x] = y1;
            if (pendirector0 == 0) {
                pencounter11 = pencounter11 + onehalf11;
                y1 = pencounter11 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter11 = pencounter11 - onehalf11;
                y1 = y1 + pencounter11;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }pendirector0=0;
        //y1 = 370;
        y1 = 385.70;
        for (int x = 0; x < 360; x++){
            intarray21[x] = y1;
            if (pendirector0 == 0) {
                pencounter21 = pencounter21 + onehalf21;
                y1 = pencounter21 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter21 = pencounter21 - onehalf21;
                y1 = y1 + pencounter21;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }pendirector0=0;
        //y1 = 375;
        y1 = 398.55;
        for (int x = 0; x < 360; x++){
            intarray31[x] = y1;
            if (pendirector0 == 0) {
                pencounter31 = pencounter31 + onehalf31;
                y1 = pencounter31 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter31 = pencounter31 - onehalf31;
                y1 = y1 + pencounter31;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }pendirector0=0;
        //y1 = 380;
        y1 = 411.40;
        for (int x = 0; x < 360; x++){
            intarray41[x] = y1;
            if (pendirector0 == 0) {
                pencounter41 = pencounter41 + onehalf41;
                y1 = pencounter41 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter41 = pencounter41 - onehalf41;
                y1 = y1 + pencounter41;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }pendirector0=0;
        //y1 = 385;
        y1 = 424.25;
        for (int x = 0; x < 360; x++){
            intarray51[x] = y1;
            if (pendirector0 == 0) {
                pencounter51 = pencounter51 + onehalf51;
                y1 = pencounter51 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter51 = pencounter51 - onehalf51;
                y1 = y1 + pencounter51;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }pendirector0=0;
        // y1 = 390;
        y1 = 437.10;
        for (int x = 0; x < 360; x++){
            intarray61[x] = y1;
            if (pendirector0 == 0) {
                pencounter61 = pencounter61 + onehalf61;
                y1 = pencounter61 + y1;
                if (y1 >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter61 = pencounter61 - onehalf61;
                y1 = y1 + pencounter61;
                if (y1 <= 0) {
                    pendirector0 = 0;
                }
            }
        }

        double y = 90;pendirector0=0;
        for (int x = 0; x < 180; x++){
            intarray0[x] = y;
            if (pendirector0 == 0) {
                pencounter0 = pencounter0 + onehalf0;
                y = pencounter0 + y;
                if (y >= 0) {
                    pendirector0 = 1;
                }
            } else {
                pencounter0 = pencounter0 - onehalf0;
                y = y + pencounter0;
                if (y <= 0) {
                    pendirector0 = 0;
                }
            }
        }
        y = 102.85;
        for (int x = 0; x < 180; x++){
            intarray1[x] = y;
            if (pendirector1== 0) {

                pencounter1 = pencounter1 + onehalf1;
                y = pencounter1+  y;
                if ( y >= 0) {
                    pendirector1= 1;
                }
            } else {
                pencounter1= pencounter1- onehalf1;
                y =  y + pencounter1;
                if ( y <= 0) {
                    pendirector1= 0;
                }
            }

        }
        y = 115.7;
        for (int x = 0; x < 180; x++){
            intarray2[x] = y;


            if (pendirector2== 0) {

                pencounter2 = pencounter2 + onehalf2;
                y = pencounter2+ y;
                if (y >= 0) {
                    pendirector2= 1;
                }
            } else {
                pencounter2= pencounter2- onehalf2;
                y = y + pencounter2;
                if (y <= 0) {
                    pendirector2= 0;
                }
            }
        }
        y = 128.55;
        for (int x = 0; x < 180; x++){
            intarray3[x] = y;

            if (pendirector3== 0) {

                pencounter3 = pencounter3 + onehalf3;
                y = pencounter3+ y;
                if (y >= 0) {
                    pendirector3= 1;
                }
            } else {
                pencounter3= pencounter3- onehalf3;
                y = y + pencounter3;
                if (y <= 0) {
                    pendirector3= 0;
                }
            }
        }
        y = 141.4;
        for (int x = 0; x < 180; x++){
            intarray4[x] = y;

            if (pendirector4== 0) {

                pencounter4 = pencounter4 + onehalf4;
                y = pencounter4+ y;
                if (y >= 0) {
                    pendirector4= 1;
                }
            } else {
                pencounter4= pencounter4- onehalf4;
                y = y + pencounter4;
                if (y <= 0) {
                    pendirector4= 0;
                }
            }
        }
        y = 154.25;
        for (int x = 0; x < 180; x++){
            intarray5[x] = y;


            if (pendirector5== 0) {

                pencounter5 = pencounter5 + onehalf5;
                y = pencounter5+ y;
                if (y >= 0) {
                    pendirector5= 1;
                }
            } else {
                pencounter5= pencounter5- onehalf5;
                y = y + pencounter5;
                if (y <= 0) {
                    pendirector5= 0;
                }
            }
        }
        y = 167.1;
        for (int x = 0; x < 180; x++){
            intarray6[x] = y;

            if (pendirector6== 0) {

                pencounter6 = pencounter6 + onehalf6;
                y = pencounter6+ y;
                if (y >= 0) {
                    pendirector6= 1;
                }
            } else {
                pencounter6= pencounter6- onehalf6;
                y = y + pencounter6;
                if (y <= 0) {
                    pendirector6= 0;
                }
            }
        }


        LoadingScreenBar.setProgress(30);


        for (int x = 0; x < (intarray01.length-1); x++){
            intarray02[z] = intarray01[x];
            z++;
            intarray02[z] = ((intarray01[x]+intarray01[x+1])/2);
            z++;
            //   intarray02[z] = intarray01[x+1];
            //   z++;
        }z=0;
        for (int x = 0; x < (intarray11.length-1); x++){
            intarray12[z] = intarray11[x];
            z++;
            intarray12[z] = ((intarray11[x]+intarray11[x+1])/2);
            z++;
            //   intarray12[z] = intarray11[x+1];
            //   z++;
        }z=0;
        for (int x = 0; x < (intarray61.length-1); x++){
            intarray62[z] = intarray61[x];
            z++;
            intarray62[z] = ((intarray61[x]+intarray61[x+1])/2);
            z++;
            //   intarray62[z] = intarray61[x+1];
            //   z++;
        }z=0;
        for (int x = 0; x < (intarray21.length-1); x++){
            intarray22[z] = intarray21[x];
            z++;
            intarray22[z] = ((intarray21[x]+intarray21[x+1])/2);
            z++;
            // intarray22[z] = intarray21[x+1];
            //  z++;
        }z=0;
        for (int x = 0; x < (intarray31.length-1); x++){
            intarray32[z] = intarray31[x];
            z++;
            intarray32[z] = ((intarray31[x]+intarray31[x+1])/2);
            z++;
            //   intarray32[z] = intarray31[x+1];
            //   z++;
        }z=0;
        for (int x = 0; x < (intarray41.length-1); x++){
            intarray42[z] = intarray41[x];
            z++;
            intarray42[z] = ((intarray41[x]+intarray41[x+1])/2);
            z++;
            //   intarray42[z] = intarray41[x+1];
            //  z++;
        }z=0;
        for (int x = 0; x < (intarray51.length-1); x++){
            intarray52[z] = intarray51[x];
            z++;
            intarray52[z] = ((intarray51[x]+intarray51[x+1])/2);
            z++;
            //  intarray52[z] = intarray51[x+1];
            //  z++;
        }z=0;
        for (int x = 0; x < (intarray61.length-1); x++){
            intarray62[z] = intarray61[x];
            z++;
            intarray62[z] = ((intarray61[x]+intarray61[x+1])/2);
            z++;
            //  intarray62[z] = intarray61[x+1];
            //  z++;
        }z=0;




        rainbowview0z =(ImageView)  findViewById(R.id.rainbow0z);
        rainbowview0 =(ImageView)  findViewById(R.id.rainbow0);
        rainbowview1 =(ImageView)  findViewById(R.id.rainbow1);
        rainbowview2 =(ImageView)  findViewById(R.id.rainbow2);
        rainbowview3 =(ImageView)  findViewById(R.id.rainbow3);
        rainbowview4 =(ImageView)  findViewById(R.id.rainbow4);
        rainbowview5 =(ImageView)  findViewById(R.id.rainbow5);
        rainbowview6 =(ImageView)  findViewById(R.id.rainbow6);

        rainbowview01 =(ImageView)  findViewById(R.id.rainbow01);
        rainbowview11 =(ImageView)  findViewById(R.id.rainbow11);
        rainbowview21 =(ImageView)  findViewById(R.id.rainbow21);
        rainbowview31 =(ImageView)  findViewById(R.id.rainbow31);
        rainbowview41 =(ImageView)  findViewById(R.id.rainbow41);
        rainbowview51 =(ImageView)  findViewById(R.id.rainbow51);
        rainbowview61 =(ImageView)  findViewById(R.id.rainbow61);





        int penmapwidth = mutablepenmap.getWidth();  //423
        int penmapheight = mutablepenmap.getHeight();  //423

        // double newWidthpen = (penmapwidth)*.575;
        //  double newHeightpen = (penmapheight)*.575;
        double newWidthpen = (penmapwidth)*.5;
        double newHeightpen = (penmapheight)*.5;
        /*
        int newWidthpen = 446;
        int newHeightpen = 446;
        */

        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray01z[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray01z[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray01z[x].postRotate((int)intarray02[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray01z[x], true);
            bMapRotatepen01[x] = Bitmapmaker;
        }
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray11[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray11[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray11[x].postRotate((int)intarray12[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray11[x], true);
            bMapRotatepen11[x] = Bitmapmaker;
        }
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray21[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray21[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray21[x].postRotate((int)intarray22[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray21[x], true);
            bMapRotatepen21[x] = Bitmapmaker;
        }
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray31[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray31[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray31[x].postRotate((int)intarray32[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray31[x], true);
            bMapRotatepen31[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(35);

        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray41[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray41[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray41[x].postRotate((int)intarray42[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray41[x], true);
            bMapRotatepen41[x] = Bitmapmaker;
        }

        LoadingScreenBar.setProgress(40);

        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray51[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray51[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray51[x].postRotate((int)intarray52[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray51[x], true);
            bMapRotatepen51[x] = Bitmapmaker;
        }

        LoadingScreenBar.setProgress(45);

        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray61[x] = matarray71;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray61[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray61[x].postRotate((int)intarray62[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray61[x], true);
            bMapRotatepen61[x] = Bitmapmaker;
        }
        // weird and normal divide

        LoadingScreenBar.setProgress(50);

        for (int x = 0; x < 180; x++){
            Matrix matarray01 = new Matrix();
            matarray0[x] = matarray01;

            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray0[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray0[x].postRotate((int)intarray0[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray0[x], true);
            bMapRotatepen0[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(55);

        for (int x = 0; x < 180; x++){
            Matrix matarray01 = new Matrix();
            matarray1[x] = matarray01;
            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray1[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray1[x].postRotate((int)intarray1[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray1[x], true);
            bMapRotatepen1[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(60);

        for (int x = 0; x < 180; x++){
            Matrix matarray02 = new Matrix();
            matarray2[x] = matarray02;


            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray2[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray2[x].postRotate((int)intarray2[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray2[x], true);
            bMapRotatepen2[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(65);

        for (int x = 0; x < 180; x++){
            Matrix matarray03 = new Matrix();
            matarray3[x] = matarray03;


            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray3[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray3[x].postRotate((int)intarray3[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray3[x], true);
            bMapRotatepen3[x] = Bitmapmaker;
        }

        LoadingScreenBar.setProgress(70);

        for (int x = 0; x < 180; x++){
            Matrix matarray04 = new Matrix();
            matarray4[x] = matarray04;


            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray4[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray4[x].postRotate((int)intarray4[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray4[x], true);
            bMapRotatepen4[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(75);

        for (int x = 0; x < 180; x++){
            Matrix matarray05 = new Matrix();
            matarray5[x] = matarray05;


            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray5[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray5[x].postRotate((int)intarray5[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray5[x], true);
            bMapRotatepen5[x] = Bitmapmaker;
        }


        LoadingScreenBar.setProgress(80);

        for (int x = 0; x < 180; x++){
            Matrix matarray06 = new Matrix();
            matarray6[x] = matarray06;


            float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
            float scaleHeightpen = ((float) newHeightpen) / penmapheight;
            matarray6[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray6[x].postRotate((int)intarray6[x]);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray6[x], true);
            bMapRotatepen6[x] = Bitmapmaker;
        }

        LoadingScreenBar.setProgress(85);




        for ( int f = 0; f < 720;f++ ){
            Bitmap mutableroto = createSingleImageFromMultipleImages().copy(Bitmap.Config.ARGB_4444, true);
            cancelarray[f] = mutableroto;
        }
        LoadingScreenBar.setProgress(90);
/*


        for ( int f = 0; f < 501;f++ ){
            Bitmap mutableroto = createSingleImageFromMultipleImages().copy(Bitmap.Config.ARGB_8888, true);
           cancelarray[f] = mutableroto;
        }*/


        /*
        rainbowview0.setAlpha(128);
        rainbowview1.setAlpha(128);
        rainbowview2.setAlpha(128);
        rainbowview3.setAlpha(128);
        rainbowview4.setAlpha(128);
        rainbowview5.setAlpha(128);
        rainbowview6.setAlpha(128);
*/
        faceview0 =(ImageView)  findViewById(R.id.face0);
        faceview1 =(ImageView)  findViewById(R.id.face1);
        faceview2 =(ImageView)  findViewById(R.id.face2);
        faceview3 =(ImageView)  findViewById(R.id.face3);
        faceview4 =(ImageView)  findViewById(R.id.face4);
        faceview5 =(ImageView)  findViewById(R.id.face5);
        faceview6 =(ImageView)  findViewById(R.id.face6);
/*
        rainbowview0.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview1.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview2.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview3.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview4.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview5.setImageResource(R.drawable.pendulumhandtwosmalldot);
        rainbowview6.setImageResource(R.drawable.pendulumhandtwosmalldot);
*/

        rainbowview0z.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview1.setColorFilter(Color.argb(255, 255, 128, 0));
        rainbowview2.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview4.setColorFilter(Color.argb(255, 0, 255, 255));
        rainbowview5.setColorFilter(Color.argb(255, 0, 128, 255));
        rainbowview6.setColorFilter(Color.argb(255, 0, 0, 255));
/*
        rainbowview01.setColorFilter(Color.argb(255, 0, 255, 255));
        rainbowview11.setColorFilter(Color.argb(255, 0, 128, 255));
        rainbowview21.setColorFilter(Color.argb(255, 0, 0, 255));
        rainbowview31.setColorFilter(Color.argb(255, 255, 0, 255));
        rainbowview41.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview51.setColorFilter(Color.argb(255, 255, 128, 0));
        rainbowview61.setColorFilter(Color.argb(255, 255, 255, 0));
       */  /*
        rainbowview6.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview5.setColorFilter(Color.argb(255, 255, 127, 0));
        rainbowview4.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview2.setColorFilter(Color.argb(255, 0, 0, 255));
        rainbowview1.setColorFilter(Color.argb(255, 75, 0, 130));
        rainbowview0.setColorFilter(Color.argb(255, 148, 0, 211));

        rainbowview0.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview1.setColorFilter(Color.argb(255, 255, 127, 0));
        rainbowview2.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview4.setColorFilter(Color.argb(255, 0, 0, 255));
        rainbowview5.setColorFilter(Color.argb(255, 75, 0, 130));
        rainbowview6.setColorFilter(Color.argb(255, 148, 0, 211));
        /*
        rainbowview01.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview11.setColorFilter(Color.argb(255, 255, 127, 0));
        rainbowview21.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview31.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview41.setColorFilter(Color.argb(255, 0, 0, 255));
        rainbowview51.setColorFilter(Color.argb(255, 75, 0, 130));
        rainbowview61.setColorFilter(Color.argb(255, 148, 0, 211));
        /*
        rainbowview01.setColorFilter(Color.argb(255, 0, 0, 255));
        rainbowview11.setColorFilter(Color.argb(255, 0, 128, 255));
        rainbowview21.setColorFilter(Color.argb(255, 0, 255, 255));
        rainbowview31.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview41.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview51.setColorFilter(Color.argb(255, 255, 128, 0));
        rainbowview61.setColorFilter(Color.argb(255, 255, 0, 0));
        /*
        faceview0.setImageResource(R.drawable.clockfaceprotofour);
        faceview1.setImageResource(R.drawable.clockfaceprotofour);
        faceview2.setImageResource(R.drawable.clockfaceprotofour);
        faceview3.setImageResource(R.drawable.clockfaceprotofour);
        faceview4.setImageResource(R.drawable.clockfaceprotofour);
        faceview5.setImageResource(R.drawable.clockfaceprotofour);
        faceview6.setImageResource(R.drawable.clockfaceprotofour);
        */

        rainbowview0z.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview0.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview1.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview2.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview3.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview4.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview5.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview6.setScaleType(ImageView.ScaleType.CENTER);


        rainbowview01.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview11.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview21.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview31.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview41.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview51.setScaleType(ImageView.ScaleType.CENTER);
        rainbowview61.setScaleType(ImageView.ScaleType.CENTER);

        timerdelayer = 1;


        fasterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fastercatch++;
            }
        });

        slowerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slowercatch++;
            }
        });


        LoadingScreenBar.setProgress(100);


    }

}



