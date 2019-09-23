package ditzler.cole.stableapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class AnalogSixtyClock extends AppCompatActivity {
    Timer timer;
    ImageView clockface, clockhandsecond, clockhandminute, clockhandhour, pendulumface;
    int angle, arcminute, pendirector, penset;

    Matrix[] matarray1 = new Matrix[361];
    Bitmap[] bMapRotatepen1 = new Bitmap[361];
    Matrix[] matarray2 = new Matrix[361];
    Bitmap[] bMapRotatepen2 = new Bitmap[361];
    Matrix[] matarray3 = new Matrix[361];
    Bitmap[] bMapRotatepen3 = new Bitmap[361];

    double onehalf = 0.07875;
    double penangle, pencounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analog_layout);
        clockface = (ImageView) findViewById(R.id.face);
        clockhandsecond = (ImageView) findViewById(R.id.secondhand);
        clockhandminute = (ImageView) findViewById(R.id.minutehand);
        clockhandhour = (ImageView) findViewById(R.id.hourhand);
        pendulumface = (ImageView) findViewById(R.id.pendulum);

        pendulumface.setImageResource(R.drawable.pendulumhandtwo);
        clockface.setImageResource(R.drawable.clockfaceprotofour);
        clockhandsecond.setImageResource(R.drawable.clockhandprotofive);
        clockhandminute.setImageResource(R.drawable.clockhandprotofour);
        clockhandhour.setImageResource(R.drawable.clockhandprotosix);
        angle = (3600 * (6 * 23)) + (60 * (6 * 46));
        penangle = 60;
        pencounter = 0;

        Bitmap clockhandprotomap = BitmapFactory.decodeResource(getResources(), R.drawable.clockhandprotofive);
        Bitmap clockhandprotomapminute = BitmapFactory.decodeResource(getResources(), R.drawable.clockhandprotofour);
        Bitmap clockhandprotomaphour = BitmapFactory.decodeResource(getResources(), R.drawable.clockhandprotosix);


        int width = clockhandprotomap.getWidth();
        int height = clockhandprotomap.getHeight();
        int widthminute = clockhandprotomapminute.getWidth();
        int heightminute = clockhandprotomapminute.getHeight();
        int widthhour = clockhandprotomaphour.getWidth();
        int heighthour = clockhandprotomaphour.getHeight();
           int newWidth = 650;
          int newHeight = 650;
        int newWidthminute = 490;
        int newHeightminute = 490;
        int newWidthhour = 360;
        int newHeighthour = 360;
        
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray1[x] = matarray71;

            float scaleWidthpen = ((float) newWidth) / width;
            float scaleHeightpen = ((float) newHeight) / height;
            matarray1[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray1[x].postRotate(x);
            Bitmap Bitmapmaker = Bitmap.createBitmap(clockhandprotomap, 0, 0, width, height, matarray1[x], true);
            bMapRotatepen1[x] = Bitmapmaker;
            
        }
        
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray2[x] = matarray71;

            float scaleWidthpen = ((float) newWidthminute) / widthminute;
            float scaleHeightpen = ((float) newHeightminute) / heightminute;
            matarray2[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray2[x].postRotate(x);
            Bitmap Bitmapmaker = Bitmap.createBitmap(clockhandprotomap, 0, 0, widthminute, heightminute, matarray2[x], true);
            bMapRotatepen2[x] = Bitmapmaker;
            
        }
        
        for (int x = 0; x < 360; x++){
            Matrix matarray71 = new Matrix();
            matarray3[x] = matarray71;

            float scaleWidthpen = ((float) newWidthhour) / widthhour;
            float scaleHeightpen = ((float) newHeighthour) / heighthour;
            matarray3[x].postScale(scaleWidthpen, scaleHeightpen);
            matarray3[x].postRotate(x);
            Bitmap Bitmapmaker = Bitmap.createBitmap(clockhandprotomap, 0, 0, widthhour, heighthour, matarray3[x], true);
            bMapRotatepen3[x] = Bitmapmaker;
            
        }


        clockhandminute.setColorFilter(Color.argb(255, 0, 64, 181));
        clockhandsecond.setColorFilter(Color.argb(255, 255, 0, 0));

        clockhandsecond.setScaleType(ImageView.ScaleType.CENTER);
        clockhandminute.setScaleType(ImageView.ScaleType.CENTER);
        clockhandhour.setScaleType(ImageView.ScaleType.CENTER);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                arcminute++;

                if (arcminute == 1) {
                    angle = angle + 1;
                    angle = angle % 46656000;
                    arcminute = 0;
                }


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                     //   final float scale = getResources().getDisplayMetrics().density;
                      //  Matrix mat = new Matrix();
                     //   Matrix matminute = new Matrix();
                     //   Matrix mathour = new Matrix();
                    //    Bitmap clockhandprotomap = BitmapFactory.decodeResource(getResources(), R.drawable.clockhandprotofive);


                      //  mat.postRotate(angle);
                     //   matminute.postRotate((angle / 60));
                     //   mathour.postRotate((angle / 3600));
                    //    int scaleit = (int) (139 * scale + 0.5f);

                      //  float scaleWidth = ((float) newWidth) / width;
                     //   float scaleHeight = ((float) newHeight) / height;
                        //   float scaleWidthminute = ((float) newWidthminute) / widthminute;
                        //   float scaleHeightminute = ((float) newHeightminute) / heightminute;
                        //    float scaleWidthhour = ((float) newWidthhour) / widthhour;
                        //    float scaleHeighthour = ((float) newHeighthour) / heighthour;

                     //   mat.postScale(scaleWidth, scaleHeight);
                        //    matminute.postScale(scaleWidthminute, scaleHeightminute);
                        //    mathour.postScale(scaleWidthhour, scaleHeighthour);
                      //  Bitmap bMapRotate = Bitmap.createBitmap(clockhandprotomap, 0, 0, width, height, mat, true);
                        //   Bitmap bMapRotateminute = Bitmap.createBitmap(clockhandprotomapminute, 0, 0, widthminute, heightminute, matminute, true);
                        //   Bitmap bMapRotatehour = Bitmap.createBitmap(clockhandprotomaphour, 0, 0, widthhour, heighthour, mathour, true);

                       // clockhandsecond.setImageBitmap(bMapRotate);
                        clockhandsecond.setImageBitmap(bMapRotatepen1[angle%360]);
                        clockhandminute.setImageBitmap(bMapRotatepen2[((int)(angle / 60))%360]);

                        clockhandhour.setImageBitmap(bMapRotatepen3[((int)(angle / 3600))%360]);

                    }
                });
            }
        }, 0, 120);
/*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                if (pendirector == 0) {
                    pencounter = pencounter + onehalf;
                    penangle = pencounter + penangle;
                    if (penangle >= 0) {
                        pendirector = 1;
                    }
                } else {
                    pencounter = pencounter - onehalf;
                    penangle = penangle + pencounter;
                    if (penangle <= 0) {
                        pendirector = 0;
                    }
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        Matrix matpen = new Matrix();
                        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.pendulumhandtwo);

                        int penmapwidth = penmap.getWidth();
                        int penmapheight = penmap.getHeight();
                        int newWidthpen = 450;
                        int newHeightpen = 450;

                        matpen.postRotate(((int)penangle));

                        float scaleWidthpen = ((float) newWidthpen) / penmapwidth;
                        float scaleHeightpen = ((float) newHeightpen) / penmapheight;
                        matpen.postScale(scaleWidthpen, scaleHeightpen);
                        Bitmap bMapRotatepen = Bitmap.createBitmap(penmap, 0, 0, penmapwidth, penmapheight, matpen, true);

                        pendulumface.setImageBitmap(bMapRotatepen);
                        pendulumface.setScaleType(ImageView.ScaleType.CENTER);
                    }
                });
            }
        }, 0, 19);*/
    }

        public int convertToDp(int input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }

}
