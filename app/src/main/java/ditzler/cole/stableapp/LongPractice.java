package ditzler.cole.stableapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class LongPractice extends AppCompatActivity {










        int arraystarter = 50;
    double[] intarray00 = new double [arraystarter];
    double[] intarray01 = new double [intarray00.length*2];
    double[] intarray02 = new double [intarray01.length*2];
    double[] intarray03 = new double [intarray02.length*2];
    double[] intarray04 = new double [intarray03.length*2];
    double[] intarray05 = new double [intarray04.length*2];
    int z = 0;
      int counter, Stopint = 0;

    Timer timer;
    Button stopbutton, startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.long_activity);


        
        for ( int x = 0; x<intarray00.length-1; x++){
            intarray00[x]= new Random().nextInt(5)+3;
        }


        for ( int x = 0; x<intarray00.length-1; x++){
            intarray01[z]=intarray00[x];
            z++;
            intarray01[z]= (intarray00[x]+intarray00[x+1])/2;
            z++;

        }intarray01[z]=intarray00[intarray00.length-1];z=0;

        
        for ( int x = 0; x<intarray01.length-1; x++){
            intarray02[z]=intarray01[x];
            z++;
            intarray02[z]= (intarray01[x]+intarray01[x+1])/2;
            z++;
            
        }intarray02[z]=intarray01[intarray01.length-1];z=0;
        
        
        for ( int x = 0; x<intarray02.length-1; x++){
            intarray03[z]=intarray02[x];
            z++;
            intarray03[z]= (intarray02[x]+intarray02[x+1])/2;
            z++;
            
        }intarray03[z]=intarray02[intarray02.length-1];z=0;
        
        
        for ( int x = 0; x<intarray03.length-1; x++){
            intarray04[z]=intarray03[x];
            z++;
            intarray04[z]= (intarray03[x]+intarray03[x+1])/2;
            z++;
            
        }intarray04[z]=intarray03[intarray03.length-1];z=0;
        
        
        for ( int x = 0; x<intarray04.length-1; x++){
            intarray05[z]=intarray04[x];
            z++;
            intarray05[z]= (intarray04[x]+intarray04[x+1])/2;
            z++;
            
        }intarray05[z]=intarray04[intarray04.length-1];z=0;
        
        
        
        

        startbutton = (Button) findViewById(R.id.StartButton);
        stopbutton = (Button) findViewById(R.id.StopButton);


        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Stopint=0;
            SomekindOfMethod();
            }
        });
        stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Stopint = 1;
            }
        });
    }



    
    
    
    

    public void SomekindOfMethod(){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                counter++;
                if (Stopint != 0) {
                    Stopint = 0;
                timer.cancel(); // cancel time
            }


            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    GraphView graph =(GraphView) findViewById(R.id.Graphh);
                    double ranger = (counter * 1.1);
                    graph.getViewport().setMinX(1);
                    graph.getViewport().setMaxX(ranger);
                    graph.getViewport().setXAxisBoundsManual(true);
                    PointsGraphSeries<DataPoint> serie0, serie1, serie2, serie3, serie4, serie5;
                    serie0 = new PointsGraphSeries<>(data0());
                    serie1 = new PointsGraphSeries<>(data1());
                    serie2 = new PointsGraphSeries<>(data2());
                    serie3 = new PointsGraphSeries<>(data3());
                    serie4 = new PointsGraphSeries<>(data4());
                    serie5 = new PointsGraphSeries<>(data5());
                    graph.addSeries(serie0);
                    graph.addSeries(serie1);
                    graph.addSeries(serie2);
                    graph.addSeries(serie3);
                    graph.addSeries(serie4);
                    graph.addSeries(serie5);
                    serie0.setSize(3);
                    serie1.setSize(3);
                    serie2.setSize(3);
                    serie3.setSize(3);
                    serie4.setSize(3);
                    serie5.setSize(3);
                    serie0.setColor(Color.DKGRAY);
                    serie1.setColor(Color.MAGENTA);
                    serie2.setColor(Color.BLUE);
                    serie3.setColor(Color.RED);
                    serie4.setColor(Color.BLACK);
                    serie5.setColor(Color.LTGRAY);




                }
            });

    }




    },0,1000);

}


    protected DataPoint[]        data0(){
        DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray00[counter%(intarray00.length-1)]);
            values[i] = V;
        }
        return values;
    }
    protected DataPoint[]        data1(){
  DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray01[counter%(intarray01.length-1)]);
            values[i] = V;
        }
        return values;
    }
    protected DataPoint[]        data2(){
  DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray02[counter%(intarray02.length-1)]);
            values[i] = V;
        }
        return values;
    }
    protected DataPoint[]        data3(){
  DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray03[counter%(intarray03.length-1)]);
            values[i] = V;
        }
        return values;
    }
    protected DataPoint[]        data4(){
  DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray04[counter%(intarray04.length-1)]);
            values[i] = V;
        }
        return values;
    }
    protected DataPoint[]        data5(){
  DataPoint[] values = new DataPoint[counter];
        for( int i = 0; i < counter; i++){
            DataPoint V = new DataPoint(counter, intarray05[counter%(intarray05.length-1)]);
            values[i] = V;
        }
        return values;
    }
}
