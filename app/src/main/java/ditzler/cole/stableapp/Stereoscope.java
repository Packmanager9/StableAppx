package ditzler.cole.stableapp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Stereoscope extends AppCompatActivity{

    Typeface tf1;

    private  Integer imagos[] = {R.drawable.s0, R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15, R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24, R.drawable.s25, R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, R.drawable.s31, R.drawable.s32, R.drawable.s33, R.drawable.s34, R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43, R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52, R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59};
 
    private  Integer imagosbig[] = {R.drawable.b0, R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6, R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14, R.drawable.b15, R.drawable.b16, R.drawable.b17, R.drawable.b18, R.drawable.b19, R.drawable.b20, R.drawable.b21, R.drawable.b22, R.drawable.b23, R.drawable.b24, R.drawable.b25, R.drawable.b26, R.drawable.b27, R.drawable.b28, R.drawable.b29, R.drawable.b30, R.drawable.b31, R.drawable.b32, R.drawable.b33, R.drawable.b34, R.drawable.b35, R.drawable.b36, R.drawable.b37, R.drawable.b38, R.drawable.b39, R.drawable.b40, R.drawable.b41, R.drawable.b42, R.drawable.b43, R.drawable.b44, R.drawable.b45, R.drawable.b46, R.drawable.b47, R.drawable.b48, R.drawable.b49, R.drawable.b50, R.drawable.b51, R.drawable.b52, R.drawable.b53, R.drawable.b54, R.drawable.b55, R.drawable.b56, R.drawable.b57, R.drawable.b58, R.drawable.b59};

    private  Integer imagosmedium[] = {R.drawable.s0, R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15, R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24, R.drawable.s25, R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, R.drawable.s31, R.drawable.s32, R.drawable.s33, R.drawable.s34, R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43, R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52, R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59};
    String Eggstrings =  "%s";
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
    TextView factorwindow, timewindow, TrueWindow;
    Button FasterButton, SlowerButton;
    ImageView daysview, hoursview, minutesview, secondsview, rainbowview0, rainbowview1, rainbowview2, rainbowview3, rainbowview4, rainbowview5, rainbowview6, faceview0, faceview1, faceview2, faceview3, faceview4, faceview5, faceview6;
    double goal;
    double kount;
    int xcounter, zcounter;
    int ycounter, wcounter;
    int ZERO = 0;
    String showme = "";
    String showmeme = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stereoscope_layout);
        daysview = (ImageView)  findViewById(R.id.red);
        hoursview = (ImageView)  findViewById(R.id.black);
        minutesview = (ImageView)  findViewById(R.id.blue);


        daysview.setAlpha(128);
        minutesview.setAlpha(128);

        rainbowview0 =(ImageView)  findViewById(R.id.rainbow0);
        rainbowview1 =(ImageView)  findViewById(R.id.rainbow1);
        rainbowview2 =(ImageView)  findViewById(R.id.rainbow2);
        rainbowview3 =(ImageView)  findViewById(R.id.rainbow3);
        rainbowview4 =(ImageView)  findViewById(R.id.rainbow4);
        rainbowview5 =(ImageView)  findViewById(R.id.rainbow5);
        rainbowview6 =(ImageView)  findViewById(R.id.rainbow6);

        faceview0 =(ImageView)  findViewById(R.id.face0);
        faceview1 =(ImageView)  findViewById(R.id.face1);
        faceview2 =(ImageView)  findViewById(R.id.face2);
        faceview3 =(ImageView)  findViewById(R.id.face3);
        faceview4 =(ImageView)  findViewById(R.id.face4);
        faceview5 =(ImageView)  findViewById(R.id.face5);
        faceview6 =(ImageView)  findViewById(R.id.face6);


        /*
        faceview0.setImageResource(R.drawable.clockfaceprotofour);
        faceview1.setImageResource(R.drawable.clockfaceprotofour);
        faceview2.setImageResource(R.drawable.clockfaceprotofour);
        faceview3.setImageResource(R.drawable.clockfaceprotofour);
        faceview4.setImageResource(R.drawable.clockfaceprotofour);
        faceview5.setImageResource(R.drawable.clockfaceprotofour);
        faceview6.setImageResource(R.drawable.clockfaceprotofour);
        */
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                xcounter++;
                xcounter = xcounter %60;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        daysview.setImageResource(imagosmedium[xcounter]);
                        hoursview.setImageResource(imagosmedium[xcounter]);
                        minutesview.setImageResource(imagosmedium[xcounter]);

                        rainbowview0.setImageResource(imagos[xcounter]);
                        rainbowview1.setImageResource(imagos[xcounter]);
                        rainbowview2.setImageResource(imagos[xcounter]);
                        rainbowview3.setImageResource(imagos[xcounter]);
                        rainbowview4.setImageResource(imagos[xcounter]);
                        rainbowview5.setImageResource(imagos[xcounter]);
                        rainbowview6.setImageResource(imagos[xcounter]);
                        
                        daysview.setColorFilter(Color.argb(255, 255, 0, 0));
                        hoursview.setColorFilter(Color.argb(255, 0, 0, 0));
                        minutesview.setColorFilter(Color.argb(255, 0, 0, 255));
                    }
                });
            }


        }, 0, 1400);

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


        }, 0, 50);
    }
}



