package ditzler.cole.stableapp;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.Timer;
import java.util.TimerTask;

public class NumbersPractice extends AppCompatActivity{

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
    int speedz = 1000;
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
                    int arraystartinglength = 360;
        double[] intarray0 = new double[180];
        double[] intarray01 = new double[arraystartinglength];
        double[] intarray02 = new double[(intarray01.length*2)];
        double[] intarray03 = new double[(intarray02.length*2)];
        double[] intarray04 = new double[(intarray03.length*2)];
        double[] intarray05 = new double[(intarray04.length*2)];
        int x;
        int mix;
                int  bix = 255;
                int syx = 128;
                int kix;
        double y = 90;
    double y1;


    int summit;
    int asterisk = 1;
    int[] redicarray = new int[1089];

    double penangle0, penangle1, penangle2, penangle3, penangle4, penangle5, penangle6,penangle01, penangle11, penangle21, penangle31, penangle41, penangle51, penangle61, pencounter0, pencounter1, pencounter2, pencounter3, pencounter4, pencounter5, pencounter6, pencounter01, pencounter11, pencounter21, pencounter31, pencounter41, pencounter51, pencounter61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stereoscope_layout_pendulum_graph);
        daysview = (ImageView)  findViewById(R.id.red);
        hoursview = (ImageView)  findViewById(R.id.black);
        minutesview = (ImageView)  findViewById(R.id.blue);
        fasterbutton = (Button) findViewById(R.id.faster);
        slowerbutton = (Button) findViewById(R.id.slower);

        GraphView graph =(GraphView) findViewById(R.id.graphx);

        Bitmap penmap = BitmapFactory.decodeResource(getResources(), R.drawable.doteight);
        Bitmap transparentmap = BitmapFactory.decodeResource(getResources(), R.drawable.fittransparent);


        y1 = 360;pendirector0=0;
        for (int x = 0; x < arraystartinglength; x++){
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
          intarray05[z] = intarray04[x];
          z++;
          intarray05[z] = ((intarray04[x]+intarray04[x+1])/2);
          z++;
      }
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


    public void whytho() {

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                zcounter++;
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

                        GraphView graph =(GraphView) findViewById(R.id.graphx);
                        double ranger = (zcounter * 1.1);
                        graph.getViewport().setMinX(1);
                        graph.getViewport().setMaxX(ranger);
                        graph.getViewport().setXAxisBoundsManual(true);
                        PointsGraphSeries<DataPoint> seriez, seried, seriea, serieq, seriep;       //an Object of the PointsGraphSeries for plotting scatter graphs
                        seriez = new PointsGraphSeries<>(data());
                        seried = new PointsGraphSeries<>(datadoub());
                        serieq = new PointsGraphSeries<>(dataquad());
                        seriea = new PointsGraphSeries<>(datatrip());
                        seriep = new PointsGraphSeries<>(datapent());   //initializing/defining series to get the data from the method 'data()'
                        graph.addSeries(seriez);
                        graph.addSeries(seried);
                        graph.addSeries(serieq);
                        graph.addSeries(seriea);
                        graph.addSeries(seriep);                   //adding the series to the GraphView
                        //  seriez.setShape(PointsGraphSeries.Shape.POINT);
                        seriez.setSize(3);
                        seried.setSize(3);
                        serieq.setSize(3);
                        seriep.setSize(3);
                        seriea.setColor(Color.GREEN);
                        seriep.setColor(Color.YELLOW);
                        seriea.setSize(3);
                        seriez.setColor(Color.BLUE);
                        seried.setColor(Color.RED);
                        serieq.setColor(Color.BLACK);


                    }
                });
            }
        }, 0, speedz);


    }
    protected DataPoint[] data(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[zcounter];
        for( int i = 0; i < zcounter; i++){
            DataPoint V = new DataPoint(zcounter, intarray01[zcounter%intarray01.length]);
            values[i] = V;




        }
        return values;
    }
    protected DataPoint[] datadoub(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[zcounter];
        for( int i = 0; i < zcounter; i++){
            DataPoint V = new DataPoint(zcounter, intarray02[zcounter%intarray02.length]);
            values[i] = V;




        }
        return values;
    }
    protected DataPoint[] datatrip(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[zcounter];
        for( int i = 0; i < zcounter; i++){
            DataPoint V = new DataPoint(zcounter, intarray03[zcounter%intarray03.length]);
            values[i] = V;




        }
        return values;
    }
    protected DataPoint[] dataquad(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[zcounter];
        for( int i = 0; i < zcounter; i++){
            DataPoint V = new DataPoint(zcounter, intarray04[zcounter%intarray04.length]);
            values[i] = V;




        }
        return values;
    }
    protected DataPoint[] datapent(){

        //double TotalSellChecker = SINESellChecker + TRTLSellChecker + DICESellChecker + BTCSellChecker + PLNTSellChecker + LOSSSellChecker + HARESellChecker;
        DataPoint[] values = new DataPoint[zcounter];
        for( int i = 0; i < zcounter; i++){
            DataPoint V = new DataPoint(zcounter, intarray05[zcounter%intarray05.length]);
            values[i] = V;




        }
        return values;
    }
}



