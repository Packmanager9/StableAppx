package ditzler.cole.stableapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

import java.util.Timer;
import java.util.TimerTask;

public class FontTile extends AppCompatActivity {

    private Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
Typeface tf1;
    Timer timer;
    int i01 = 0;
    int i02 = 1;
    int i03;
    int i04;
    int i05;
    int i06;
    int i07;
    int i08;
    int i09;
    int i10;
    int i11;
    int i12;
    int wcounter, zcounter, truecount, kount;

    PointsGraphSeries<DataPoint> Series = null;
    String showmeme = "";
    String Eggstrings = "%s";
    TextView iView01,iView02,iView03,iView04,iView05,iView06,iView07,iView08,iView09,iView10,iView11,iView12,iView13,iView14,iView15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.font_tiles);
        iView01 = (TextView) findViewById(R.id.text01);
        iView02 = (TextView) findViewById(R.id.text02);
        iView03 = (TextView) findViewById(R.id.text03);
        iView04 = (TextView) findViewById(R.id.text04);
        iView05 = (TextView) findViewById(R.id.text05);
        iView06 = (TextView) findViewById(R.id.text06);
        iView07 = (TextView) findViewById(R.id.text07);
        iView08 = (TextView) findViewById(R.id.text08);
        iView09 = (TextView) findViewById(R.id.text09);
        iView10 = (TextView) findViewById(R.id.text10);
        iView11 = (TextView) findViewById(R.id.text11);
        iView12 = (TextView) findViewById(R.id.text12);
        iView13 = (TextView) findViewById(R.id.text13);
        iView14 = (TextView) findViewById(R.id.text14);
        iView15 = (TextView) findViewById(R.id.text15);
        final GraphView Praph = (GraphView) findViewById(R.id.Graph);

        tf1 = Typeface.createFromAsset(getAssets(), "bar.ttf");
        iView01.setTypeface(tf1);

        iView01.setTypeface(tf1);
        iView02.setTypeface(tf1);
        iView03.setTypeface(tf1);
        iView04.setTypeface(tf1);
        iView05.setTypeface(tf1);
        iView06.setTypeface(tf1);
        iView07.setTypeface(tf1);
        iView08.setTypeface(tf1);
        iView09.setTypeface(tf1);
        iView10.setTypeface(tf1);
        iView11.setTypeface(tf1);
        iView12.setTypeface(tf1);
        iView13.setTypeface(tf1);
        iView14.setTypeface(tf1);
        iView15.setTypeface(tf1);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                truecount++;
                truecount = truecount%12960000;
                i01++;
                if (i01 == 3600){
                    i01 = 0;
                    i02++;
                    if (i02 == 3600) {
                        i02 = 0;
                    }
                }
                i03 = (i02*i01);

                double countpass = i03;
                int[] trueprimes = new int[100];


                for(kount = 2; kount <= i03; kount++) {

                    if (countpass > 0){
                        if ((countpass%kount) == 0) {
                            countpass = (int) countpass / kount;
                            trueprimes[zcounter] = (int) kount;
                            zcounter = zcounter + 1;
                            kount = 1;
                        }
                    }
                }

                for (wcounter = 0; wcounter <= (zcounter); wcounter++){
                    if (wcounter < (zcounter-1)) {
                        showmeme = String.format(showmeme + String.format(Eggstrings, A(trueprimes[wcounter]) + "X"));
                    }else if (trueprimes[wcounter] != 0){
                        showmeme = String.format(showmeme + String.format(Eggstrings, A(trueprimes[wcounter])));
                    }
                }
                if (showmeme.equals("") && i03 == 1){
                    showmeme = "1";
                }else if (showmeme.equals("") && i03 == 0){
                    showmeme = "0";
                }

                Series = new PointsGraphSeries<>(dataPrime());

                zcounter = 0;
                wcounter = 0;

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView01.setText(A(i01));
                        iView02.setText(A(i02));
                        iView03.setText(A(i03));
                        iView04.setText(showmeme);
                        showmeme = "";


                        Praph.getViewport().setMinX(0);
                        Praph.getViewport().setMaxX(i03);
                        Praph.getViewport().setXAxisBoundsManual(true);

                        Series.setSize(4);
                        Praph.addSeries(Series);

                    }});}}, 0, 2160);

        /*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i02++;
                i02 = i02%60;
                i03 = (i02*i01);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView02.setText(A(i02));
                        iView03.setText(A(i03));
                    }});}}, 0, 30000/1);
        /*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i02++;
                i02 = i02%60;
                i03 = (i02*i01);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView02.setText(A(i02));
                        iView03.setText(A(i03));
                    }});}}, 0, 30000/1);

        /*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i03 = (i02*i01);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }});}}, 0, 100);

        /*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i04++;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView04.setText(A(i04));
                    }});}}, 0, 1000/4); 
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i05++;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView05.setText(A(i05));
                    }});}}, 0, 1000/5); 
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                i06++;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        iView06.setText(A(i06));
                    }});}}, 0, 1000/6); 
    
    */
    
    }


    public String A(int prime){

        if(prime > 59){
            int lastdigit = (prime%60);
            int seconddigit = (((prime-lastdigit)/60))%60;
            int thirddigit = (((prime-seconddigit)/3600))%60;
            int fourthdigit = (((prime-thirddigit)/216000))%60;
            int fifthdigit = (((prime-fourthdigit)/12960000))%60;



            if (prime < 3600){
                return (String.format(A(seconddigit) + A(lastdigit)));

            }else if (prime < 216000){

                return (String.format(A(thirddigit) + A(seconddigit) + A(lastdigit)));

            }else if (prime < 12960000){

                return (String.format(A(fourthdigit) + A(thirddigit) + A(seconddigit) + A(lastdigit)));

            }else if (prime > 12959999){

                return (String.format(A(fifthdigit) + A(fourthdigit) + A(thirddigit) + A(seconddigit) + A(lastdigit)));

            }
        }else{

            switch (prime){

                case 0:
                    return "0";
                case 1:
                    return "1";
                case 2:
                    return "☻";
                case 3:
                    return "♥";
                case 4:
                    return "♦";
                case 5:
                    return "♣";
                case 6:
                    return "♠";
                case 7:
                    return "•";
                case 8:
                    return "◘";
                case 9:
                    return "○";
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



    protected DataPoint[] dataPrime(){
        DataPoint[] values = new DataPoint[i03];
        for( int i = 0; i < i03; i++){
            DataPoint V = new DataPoint(i03, Math.abs(zcounter));
            values[i] = V;



        }
        return values;
    }
}

