package ditzler.cole.stableapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class StatAdjustments extends AppCompatActivity {

    protomon.monst CustomizerMonst = new protomon.monst(0,0,0,0,0,0,0,0,0,0);

    Button GoBackButton;
    SeekBar SeekStatsBarD, SeekStatsBarH, SeekStatsBarS, SeekStatsBarA ;
    int slideminimum = 51, slidemaximum = 462, currentA = 101, currentD = 101, currentH = 101, currentS = 101;
    TextView DisplaySliderBoxH, DisplaySliderBoxA, DisplaySliderBoxS, DisplaySliderBoxD, DisplaySliderBox;
    String o = "%s", of = "%.0f / 111 (Maximum)";
    double total = 0;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monster_customizer_stats_activity);
        GoBackButton = (Button) findViewById(R.id.GoBack);
        SeekStatsBarH= (SeekBar) findViewById(R.id.SlideStatsH);
        SeekStatsBarD= (SeekBar) findViewById(R.id.SlideStatsD);
        SeekStatsBarA= (SeekBar) findViewById(R.id.SlideStatsA);
        SeekStatsBarS= (SeekBar) findViewById(R.id.SlideStatsS);
        DisplaySliderBox = (TextView) findViewById(R.id.DisplaySlider);
        DisplaySliderBoxH = (TextView) findViewById(R.id.DisplaySliderH);
        DisplaySliderBoxD = (TextView) findViewById(R.id.DisplaySliderD);
        DisplaySliderBoxA = (TextView) findViewById(R.id.DisplaySliderA);
        DisplaySliderBoxS = (TextView) findViewById(R.id.DisplaySliderS);

        Gathering();



        SeekStatsBarH.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarH.setProgress(currentH - slideminimum);

        String Gadget = String.format(o, currentH);
        DisplaySliderBoxH.setText(Gadget);

        SeekStatsBarD.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarD.setProgress(currentD - slideminimum);

        String GadgetD = String.format(o, currentD);
        DisplaySliderBoxD.setText(GadgetD);

        SeekStatsBarA.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarA.setProgress(currentA - slideminimum);

        String GadgetA = String.format(o, currentA);
        DisplaySliderBoxA.setText(GadgetA);

        SeekStatsBarS.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarS.setProgress(currentS - slideminimum);

        String GadgetS = String.format(o, currentS);
        DisplaySliderBoxS.setText(GadgetS);


        CustomizerMonst.Speed = currentS;

        CustomizerMonst.Attack = currentA;

        CustomizerMonst.Defense = currentD;

        CustomizerMonst.Health = currentH;

        TotalCheck();


GoBackButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        CustomizerMonst.Idnum = 91;

        String DustMe = "%s";
        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Bundle b = new Bundle();
        String BustMe = String.format("CustomSlot");
        Gson gson = new Gson();
        String jsonY = prefs.getString("CustomSlotX", "");

        String json = gson.toJson(CustomizerMonst);
        editor.putString(BustMe, json);
        editor.commit();

            if (total < 112) {
                finish();
            }
    }
    });



        SeekStatsBarH.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentH = progress + slideminimum;
                String GadgetH = String.format(o, currentH);
                DisplaySliderBoxH.setText(GadgetH);
                
                TotalCheck();
                String Gadget = String.format(of, total);
                DisplaySliderBox.setText(Gadget);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                TotalCheck();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                TotalCheck();
                CustomizerMonst.Speed = currentS;

                CustomizerMonst.Attack = currentA;

                CustomizerMonst.Defense = currentD;

                CustomizerMonst.Health = currentH;

            }
        });


        SeekStatsBarA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentA = progress + slideminimum;
                String GadgetA = String.format(o, currentA);
                DisplaySliderBoxA.setText(GadgetA);
                
                TotalCheck();
                String Gadget = String.format(of, total);
                DisplaySliderBox.setText(Gadget);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                TotalCheck();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                TotalCheck();

                CustomizerMonst.Speed = currentS;

                CustomizerMonst.Attack = currentA;

                CustomizerMonst.Defense = currentD;

                CustomizerMonst.Health = currentH;
            }
        });


        SeekStatsBarS.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentS = progress + slideminimum;
                String GadgetS = String.format(o, currentS);
                DisplaySliderBoxS.setText(GadgetS);
                
                TotalCheck();
                String Gadget = String.format(of, total);
                DisplaySliderBox.setText(Gadget);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                TotalCheck();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                TotalCheck();

                CustomizerMonst.Speed = currentS;

                CustomizerMonst.Attack = currentA;

                CustomizerMonst.Defense = currentD;

                CustomizerMonst.Health = currentH;
            }
        });


        SeekStatsBarD.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentD = progress + slideminimum;
                String GadgetD = String.format(o, currentD);
                DisplaySliderBoxD.setText(GadgetD);
                
                TotalCheck();
                String Gadget = String.format(of, total);
                DisplaySliderBox.setText(Gadget);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                TotalCheck();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                TotalCheck();

                CustomizerMonst.Speed = currentS;

                CustomizerMonst.Attack = currentA;

                CustomizerMonst.Defense = currentD;

                CustomizerMonst.Health = currentH;
            }
        });







    }

    public void TotalCheck(){
        total = Math.floor(((double)currentA*(double)currentD*(double)currentH*(double)currentS)/1000000);
        String Gadget = String.format(of, total);
        DisplaySliderBox.setText(Gadget);
    }
    public void Gathering(){

        String DustMe = "%s";
        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Bundle b = new Bundle();
        String BustMe = String.format("CustomSlot");
        Gson gson = new Gson();
        String jsonY = prefs.getString("CustomSlotX", "");
        if (gson.fromJson(jsonY, (Type) protomon.monst.class) != null) {



            protomon.monst HoldMe = (gson.fromJson(jsonY, (Type) protomon.monst.class));

            currentA = (int) HoldMe.Attack;
            currentS = (int) HoldMe.Speed;
            currentH = (int) HoldMe.Health;
            currentD = (int) HoldMe.Defense;

            if(currentA <= 51){
                currentA = 51;
            }
            if(currentD <= 51){
                currentD = 51;
            }
            if(currentS <= 51){
                currentS = 51;
            }
            if(currentH <= 51){
                currentH = 51;
            }



        }


        SeekStatsBarH.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarH.setProgress(currentH - slideminimum);

        String Gadget = String.format(o, currentH);
        DisplaySliderBoxH.setText(Gadget);

        SeekStatsBarD.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarD.setProgress(currentD - slideminimum);

        String GadgetD = String.format(o, currentD);
        DisplaySliderBoxD.setText(GadgetD);

        SeekStatsBarA.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarA.setProgress(currentA - slideminimum);

        String GadgetA = String.format(o, currentA);
        DisplaySliderBoxA.setText(GadgetA);

        SeekStatsBarS.setMax(slidemaximum - slideminimum);
        // SeekStatsBar.setMin(slideminimum);
        SeekStatsBarS.setProgress(currentS - slideminimum);

        String GadgetS = String.format(o, currentS);
        DisplaySliderBoxA.setText(GadgetS);



    }
}


