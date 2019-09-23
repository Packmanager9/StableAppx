package ditzler.cole.stableapp;


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
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationPractice extends AppCompatActivity{

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
    int xcounter, zcounter, canvascounter, arrayreversal;
    int ycounter, wcounter;
    int ZERO = 0;
    String showme = "";
    String showmeme = "";
    int[] speedarray = new int[201];
    ImageView clockface, clockhandsecond, clockhandminute, clockhandhour, pendulumface;
    int angle, arcminute, pendirector0, pendirector1, pendirector2, pendirector3, pendirector4, pendirector5, pendirector6, penset;
    int kcounter;
                    double onehalf0 = 0.09;
                    double onehalf01 = 0.36;
        double[] intarray0 = new double[180];
        double[] intarray01 = new double[180];
        double[] intarray02 = new double[360];
        double[] intarray03 = new double[720];
        double[] intarray04 = new double[1440];
        int[] intarray04z = new int[1440];
        int[] intarray04i = new int[1440];
        int x;
        int mix;
                int  bix = 255;
                int syx = 128;
                int kix;
        double y = 90;
    double y1;
    Matrix[] matarray0 = new Matrix[180];
    Matrix[] matarray01z = new Matrix[2880];

    final Bitmap[] bMapRotatepen0 = new Bitmap[180];
    final Bitmap[] bMapRotatepen01 = new Bitmap[1440];
    final Bitmap[] cancelarray = new Bitmap[2880];

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

    int[] redicarray = new int[1089];

    Canvas[] canvas = new Canvas[2880];
   // Canvas[] canvas = new Canvas[502];

    int[] redarray6 = new int[769];
    int[] greenarray6 = new int[769];
    int[] bluearray6 = new int[769];
    double penangle0, penangle1, penangle2, penangle3, penangle4, penangle5, penangle6,penangle01, penangle11, penangle21, penangle31, penangle41, penangle51, penangle61, pencounter0, pencounter1, pencounter2, pencounter3, pencounter4, pencounter5, pencounter6, pencounter01, pencounter11, pencounter21, pencounter31, pencounter41, pencounter51, pencounter61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stereoscope_layout_pendulum);
        daysview = (ImageView)  findViewById(R.id.red);
        hoursview = (ImageView)  findViewById(R.id.black);
        minutesview = (ImageView)  findViewById(R.id.blue);
        fasterbutton = (Button) findViewById(R.id.faster);
        slowerbutton = (Button) findViewById(R.id.slower);
        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.doteight);
        Bitmap transparentmap = BitmapFactory.decodeResource(getResources(), R.drawable.fittransparent);

        Bitmap mutablepenmap = transparentmap.copy(Bitmap.Config.ARGB_4444, true);



/*
        for ( int q = 0; q < 2880;q++ ){
            canvas[q] = new Canvas(mutablepenmap);
        }
*/
        for ( int q = 0; q < 1079;q++ ){
            redicarray[q] = q;
        }
            redicarray[1080]  = 0;


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
        y1 = 360;pendirector0=1;
        for (int x = 0; x < 180; x++){
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



      for (int x = 0; x < (intarray01.length-1); x++){
          intarray02[z] = intarray01[x];
          z++;
          intarray02[z] = ((intarray01[x]+intarray01[x+1])/2);
          z++;
          //intarray02[z] = intarray01[x+1];
         //z++;
      }
z=0;
      for (int x = 0; x < (intarray02.length-1); x++){
          intarray03[z] = intarray02[x];
          z++;
          intarray03[z] = ((intarray02[x]+intarray02[x+1])/2);
          z++;
      }
z=0;
      for (int x = 0; x < (intarray03.length-1); x++){
          intarray04[z] = intarray03[x];
          z++;
          intarray04[z] = ((intarray03[x]+intarray03[x+1])/2);
          z++;
      }
z=0;
      for (int x = 0; x < (intarray04.length-1); x++){
          intarray04z[z] = (int)intarray04[x];
          z++;
      }
z=0;
      for (int x = 0; x < (intarray04z.length-1); x++){
          intarray04i[z] = Math.abs(360-Math.abs(intarray04z[x]));
          z++;
      }




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





        int penmapwidth = penmap.getWidth();  //423
        int penmapheight = penmap.getHeight();  //423

       // double newWidthpen = (penmapwidth)*.575;
      //  double newHeightpen = (penmapheight)*.575;
        double newWidthpen = (penmapwidth)*1;
        double newHeightpen = (penmapheight)*1;
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
            //matarray01z[x].postRotate((int)intarray01[(x%intarray01.length)]);
            matarray01z[x].postRotate(x);
            Bitmap Bitmapmaker = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matarray01z[x], true);
            bMapRotatepen01[x] = Bitmapmaker;
        }
        // weird and normal divide
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
        for ( int f = 0; f < 360;f++ ){
            Bitmap mutableroto = createSingleImageFromMultipleImages().copy(Bitmap.Config.ARGB_4444, true);
           cancelarray[f] = mutableroto;
        }



        faceview0 =(ImageView)  findViewById(R.id.face0);
        faceview1 =(ImageView)  findViewById(R.id.face1);
        faceview2 =(ImageView)  findViewById(R.id.face2);
        faceview3 =(ImageView)  findViewById(R.id.face3);
        faceview4 =(ImageView)  findViewById(R.id.face4);
        faceview5 =(ImageView)  findViewById(R.id.face5);
        faceview6 =(ImageView)  findViewById(R.id.face6);

        rainbowview0z.setColorFilter(Color.argb(255, 255, 0, 0));
        rainbowview1.setColorFilter(Color.argb(255, 255, 128, 0));
        rainbowview2.setColorFilter(Color.argb(255, 255, 255, 0));
        rainbowview3.setColorFilter(Color.argb(255, 0, 255, 0));
        rainbowview4.setColorFilter(Color.argb(255, 0, 255, 255));
        rainbowview5.setColorFilter(Color.argb(255, 0, 128, 255));
        rainbowview6.setColorFilter(Color.argb(255, 0, 0, 255));
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
        whytho();
    }

    private Bitmap createSingleImageFromMultipleImages() {


        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.fittransparent);

        Bitmap realpenmap = penmap.copy(Bitmap.Config.ARGB_8888, true);
        canvas[canvascounter] = new Canvas(realpenmap);


        if (arrayreversal == 0) {
            if (imagecounter >= 36) {
                Bitmap Temp6 = bMapRotatepen01[(imagecounter - 36) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorRed(Temp6);
            }
            if (imagecounter >= 30) {
                Bitmap Temp5 = bMapRotatepen01[(imagecounter - 30) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorOrange(Temp5);
            }
            if (imagecounter >= 24) {
                Bitmap Temp4 = bMapRotatepen01[(imagecounter - 24) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorYellow(Temp4);
            }
            if (imagecounter >= 18) {
                Bitmap Temp3 = bMapRotatepen01[(imagecounter - 18) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorGreen(Temp3);
            }
            if (imagecounter >= 12) {
                Bitmap Temp2 = bMapRotatepen01[(imagecounter - 12) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorBlue(Temp2);
            }
            if (imagecounter >= 6) {
                Bitmap Temp1 = bMapRotatepen01[(imagecounter - 6) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorIndigo(Temp1);
            }
            Bitmap Temp0 = bMapRotatepen01[(imagecounter) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
            changeColorViolet(Temp0);
        }else {
            if ((bMapRotatepen01.length-imagecounter) >= 36) {
                Bitmap Temp6 = bMapRotatepen01[(imagecounter + 35) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorRed(Temp6);
            }
            if ((bMapRotatepen01.length-imagecounter) >= 30) {
                Bitmap Temp5 = bMapRotatepen01[(imagecounter + 29) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorOrange(Temp5);
            }
            if ((bMapRotatepen01.length-imagecounter) >= 24) {
                Bitmap Temp4 = bMapRotatepen01[(imagecounter + 23) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorYellow(Temp4);
            }
            if ((bMapRotatepen01.length-imagecounter) >= 18) {
                Bitmap Temp3 = bMapRotatepen01[(imagecounter + 17) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorGreen(Temp3);
            }
            if ((bMapRotatepen01.length-imagecounter) >= 12) {
                Bitmap Temp2 = bMapRotatepen01[(imagecounter + 11) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorBlue(Temp2);
            }
            if ((bMapRotatepen01.length-imagecounter) >= 6) {
                Bitmap Temp1 = bMapRotatepen01[(imagecounter + 5) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
                changeColorIndigo(Temp1);
            }
            Bitmap Temp0 = bMapRotatepen01[(imagecounter) % bMapRotatepen01.length].copy(Bitmap.Config.ARGB_4444, true);
            changeColorViolet(Temp0);
        }
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

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                zcounter++;
                kcounter++;
                //kcounter = kcounter%360;
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
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        rainbowview0.setImageBitmap(cancelarray[intarray04i[kcounter%(intarray04i.length-1)]]);

                        rainbowview0.setScaleType(ImageView.ScaleType.CENTER);

                       // if (zcounter >= 0) {
                            rainbowview0z.setImageBitmap(bMapRotatepen0[zcounter]);
                            /*)
                        } if (zcounter >= 3) {
                            rainbowview1.setImageBitmap(bMapRotatepen0[zcounter-3]);
                        } if (zcounter >= 6) {
                            rainbowview2.setImageBitmap(bMapRotatepen0[zcounter-6]);
                        } if (zcounter >= 9) {
                            rainbowview3.setImageBitmap(bMapRotatepen0[zcounter-9]);
                        } if (zcounter >= 12) {
                            rainbowview4.setImageBitmap(bMapRotatepen0[zcounter-12]);
                        } if (zcounter >= 15) {
                            rainbowview5.setImageBitmap(bMapRotatepen0[zcounter-15]);
                        } if (zcounter >= 18) {
                            rainbowview6.setImageBitmap(bMapRotatepen0[zcounter-18]);
                        }*/


                        rainbowview01.setImageBitmap(bMapRotatepen0[Math.abs(zcounter-90)]);


                    }
                });
            }
        }, 0, speedz);
      

    }
}



