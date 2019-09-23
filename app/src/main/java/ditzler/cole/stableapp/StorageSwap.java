package ditzler.cole.stableapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Random;

public class StorageSwap extends AppCompatActivity {


    private Vibrator Rockit;

    int[] listorder = new int[100];
    int[] listorderI = new int[100];
    int[] listorderO = new int[100];

    int Passback;
    Bundle outStated;

    CustomMonsterTopLayer.StringObject NameObjectHolder;
    boolean[] dictionaryOfMonsters;
    int x = 0;
    int storagesize = 0;
    int cast = 0;

    ImageButton Desk;
    Button Return, Store, Print, PrintTwo, CustomButton, Dynamics;
    TextView PrintWindow;
    public View DarkView;
    int VisibilityHolder = 0;
    protomon.monst passedmonster;
    protomon.monst[] passedmonsters;
    protomon.monst[] passedmonstersJ = new protomon.monst[101];
    protomon.monst[] passedmonstersXJ = new protomon.monst[101];
    protomon.monst[] passedmonstersXJ9 = new protomon.monst[101];
    protomon.monst[] passedmonstersTwo = new protomon.monst[101];
    String o = "%.0f";


    int countthroughmonstersx = 0;
    int countthroughmonstersz = 0;
    int countthroughmonsters = 0;
    int countthroughmonstersy = 0;
    TextView LongView;
    EditText edit;
    Button Select;

    int howmanytoswitch = 0;
    int xhowmanytoswitch = 0;

    int switchcounter = 0;
    int xswitchcounter = 0;
    int canswapin0 = 0;
    int canswapin1 = 0;
    int canswapin2 = 0;
    int canswapin3 = 0;
    int canswapin4 = 0;
    int canswapin5 = 0;
    int canswapin6 = 0;
    int canswapin7 = 0;
    int canswapin8 = 0;
    int canswapin9 = 0;
    int canswapin10 = 0;
    int canswapin11 = 0;
    int canswapin12 = 0;
    int canswapin13 = 0;
    int canswapin14 = 0;
    int canswapin15 = 0;
    int canswapin16 = 0;
    int canswapout0 = 0;
    int canswapout1 = 0;
    int canswapout2 = 0;
    int canswapout3 = 0;
    int canswapout4 = 0;
    int canswapout5 = 0;
    int canswapout6 = 0;
    int canswapout7 = 0;
    int canswapout8 = 0;
    int canswapout9 = 0;
    int canswapout10 = 0;
    int canswapout11 = 0;
    int canswapout12 = 0;
    int canswapout13 = 0;
    int canswapout14 = 0;
    int canswapout15 = 0;
    int canswapout16 = 0;
    
    ImageButton[] views = new ImageButton[17];
    TextView[] tviews = new TextView[17];
    
    ImageButton[] viewsx = new ImageButton[17];
    TextView[] tviewsx = new TextView[17];


    Context ProtomonContext;

    SharedPreferences prefs;

    protomon.monst Swithcer = new protomon.monst(0,0,0,0,0,0,0,0,0,0);

    protomon.monst xSwithcer = null;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


         ProtomonContext = getApplicationContext();

         prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Rockit = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.storage_swap);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        views[0] = findViewById(R.id.Current);
        viewsx[0] = findViewById(R.id.thing);
        
        views[1] = findViewById(R.id.box0101);
        views[2] = findViewById(R.id.box0102);
        views[3] = findViewById(R.id.box0103);
        views[4] = findViewById(R.id.box0104);
        views[5] = findViewById(R.id.box0201);
        views[6] = findViewById(R.id.box0202);
        views[7] = findViewById(R.id.box0203);
        views[8] = findViewById(R.id.box0204);
        views[9] = findViewById(R.id.box0301);
        views[10] = findViewById(R.id.box0302);
        views[11] = findViewById(R.id.box0303);
        views[12] = findViewById(R.id.box0304);
        views[13] = findViewById(R.id.box0401);
        views[14] = findViewById(R.id.box0402);
        views[15] = findViewById(R.id.box0403);
        views[16] = findViewById(R.id.box0404);
        
        tviews[0] = findViewById(R.id.text0101);
        tviews[1] = findViewById(R.id.text0102);
        tviews[2] = findViewById(R.id.text0103);
        tviews[3] = findViewById(R.id.text0104);
        tviews[4] = findViewById(R.id.text0201);
        tviews[5] = findViewById(R.id.text0202);
        tviews[6] = findViewById(R.id.text0203);
        tviews[7] = findViewById(R.id.text0204);
        tviews[8] = findViewById(R.id.text0301);
        tviews[9] = findViewById(R.id.text0302);
        tviews[10] = findViewById(R.id.text0303);
        tviews[11] = findViewById(R.id.text0304);
        tviews[12] = findViewById(R.id.text0401);
        tviews[13] = findViewById(R.id.text0402);
        tviews[14] = findViewById(R.id.text0403);
        tviews[15] = findViewById(R.id.text0404);
        
        viewsx[1] = findViewById(R.id.xbox0101);
        viewsx[2] = findViewById(R.id.xbox0102);
        viewsx[3] = findViewById(R.id.xbox0103);
        viewsx[4] = findViewById(R.id.xbox0104);
        viewsx[5] = findViewById(R.id.xbox0201);
        viewsx[6] = findViewById(R.id.xbox0202);
        viewsx[7] = findViewById(R.id.xbox0203);
        viewsx[8] = findViewById(R.id.xbox0204);
        viewsx[9] = findViewById(R.id.xbox0301);
        viewsx[10] = findViewById(R.id.xbox0302);
        viewsx[11] = findViewById(R.id.xbox0303);
        viewsx[12] = findViewById(R.id.xbox0304);
        viewsx[13] = findViewById(R.id.xbox0401);
        viewsx[14] = findViewById(R.id.xbox0402);
        viewsx[15] = findViewById(R.id.xbox0403);
        viewsx[16] = findViewById(R.id.xbox0404);
        
        tviewsx[0] = findViewById(R.id.xtext0101);
        tviewsx[1] = findViewById(R.id.xtext0102);
        tviewsx[2] = findViewById(R.id.xtext0103);
        tviewsx[3] = findViewById(R.id.xtext0104);
        tviewsx[4] = findViewById(R.id.xtext0201);
        tviewsx[5] = findViewById(R.id.xtext0202);
        tviewsx[6] = findViewById(R.id.xtext0203);
        tviewsx[7] = findViewById(R.id.xtext0204);
        tviewsx[8] = findViewById(R.id.xtext0301);
        tviewsx[9] = findViewById(R.id.xtext0302);
        tviewsx[10] = findViewById(R.id.xtext0303);
        tviewsx[11] = findViewById(R.id.xtext0304);
        tviewsx[12] = findViewById(R.id.xtext0401);
        tviewsx[13] = findViewById(R.id.xtext0402);
        tviewsx[14] = findViewById(R.id.xtext0403);
        tviewsx[15] = findViewById(R.id.xtext0404);


      //  LongView = findViewById(R.id.ScrollerLongText);
        edit = findViewById(R.id.editTextBox);
        Select = findViewById(R.id.SelectButton);



  //      Context ProtomonContext = getApplicationContext();

    //    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
     //   SharedPreferences.Editor editor = prefs.edit();



        storagesize = 2;
        int bee;
        Bundle b = getIntent().getExtras();
     //   if (b != null) {

            storagesize = b.getInt("Storage");
            cast = b.getInt("Cast");
            dictionaryOfMonsters = b.getBooleanArray("Dictionary");

            passedmonsters = new protomon.monst[storagesize];
            int i = 0;
            while (i < storagesize) {

                String DustMe = "Monster%s";
                String BustMe = String.format(DustMe, i);

                passedmonsters[i] = b.getParcelable(BustMe);

              //  bee = (int) passedmonsters[i].Idnum;
             //   bee = bee;
              //  bee = bee;


                Gson gson = new Gson();
                String json = prefs.getString(BustMe, "");
                passedmonstersTwo[i] = gson.fromJson(json, protomon.monst.class);


                i++;

            }
       // }

        String s = "%s";
        String ss = "%s";
        String x = "";
        String y = ". ";


        for ( int dd = storagesize; dd < views.length; dd++){
            views[dd].setVisibility(View.INVISIBLE);
        }
 //       for (int f = 0; f < 99; f++){
//

            
   //         ss = String.format(s, (f+1));
   //         x = String.format(x+ss + y + names(passedmonsters[f].Idnum) +"\n");
//
  //      }



        for (int f = 0; f < passedmonsters.length; f++){

            if(f < cast) {
                listorder[f] = f;
            }else if (f == cast){
                listorder[17] = f;
            }else if ( f > cast) {
                listorder[f] = f;
            }





        }

        for (int f = 0; f < views.length; f++){
          viewsx[f].setHapticFeedbackEnabled(true);
          views[f].setHapticFeedbackEnabled(true);
            
        }


       // LongView.setText(x);
        
        
   //     for(int g = 0; g < views.length && g < passedmonsters.length-1; g++){
   //         if(g < cast) {
  //              ImageZXG(views[g],passedmonsters[g]);
  //          }else if (g == cast){
  //              ImageZXG(views[0],passedmonsters[cast]);
  //          }else if ( g > cast){
  //              ImageZXG(views[g],passedmonsters[g+1]);
  //          }

   //         if (cast == 0){
 //              ImageZXG(views[g],passedmonsters[g]);
    //        }
  //      }

        for(int g = 0; g < views.length && g < passedmonsters.length ; g++){

                ImageZXG(views[g],passedmonsters[listorder[g]]);

        }

        ImageZXG(views[0],passedmonsters[listorder[17]]);



        for(int g = 0; g < storagesize-1; g++){
                tviews[g].setText(String.valueOf((g+1)));
        }


        Select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                if (howmanytoswitch == xhowmanytoswitch) {


                    for (int r = 0; r < xhowmanytoswitch; r++){

                        passedmonstersXJ9[r] = passedmonstersXJ[listorderO[r]];


                    }
                    for (int r = 0; r < howmanytoswitch; r++){
                        for (int rr = 0; rr < passedmonsters.length; rr++ ){
                            if(passedmonstersXJ[rr] == null){
                                passedmonstersXJ[rr] = passedmonsters[listorderI[r]];
                              //  passedmonsters[listorderI[r]] = xSwithcer;
                              break;
                            }
                        }
                    }
                    for(int k =  0; k < passedmonsters.length;k++){
                        for(int kr =  0; kr < passedmonsters.length;kr++){
                            if(passedmonsters[k] == passedmonstersXJ[kr] || (passedmonsters[k] == passedmonsters[kr] && k != kr)){
                                passedmonsters[k] = null;
                            }
                        }
                    }
                    for(int k =  0; k < passedmonsters.length;k++){
                        for(int kr =  0; kr < passedmonsters.length;kr++){
                            if((passedmonsters[k] == passedmonstersXJ[kr] || (passedmonstersXJ[k] == passedmonstersXJ[kr]&& k != kr) )){
                                passedmonstersXJ[kr] = null;
                            }
                        }
                    }
                    for (int r = 0; r < howmanytoswitch;){
                        for (int rr = 0; rr < passedmonsters.length; rr++ ){
                            if(passedmonsters[rr] == null){
                                passedmonsters[rr] = passedmonstersXJ9[r];
                                r++;
                            }
                        }
                    }
                    for(int k =  0; k < passedmonsters.length;k++){
                        for(int kr =  0; kr < passedmonsters.length;kr++){
                            if((passedmonsters[k] == passedmonstersXJ[kr] || (passedmonstersXJ[k] == passedmonstersXJ[kr]&& k != kr) )){
                                passedmonstersXJ[kr] = null;
                            }
                        }
                    }
                    for(int k =  0; k < passedmonsters.length;k++){
                        for(int kr =  0; kr < passedmonsters.length;kr++){
                            if(passedmonsters[k] == passedmonstersXJ[kr] || (passedmonsters[k] == passedmonsters[kr] && k != kr)){
                                passedmonsters[k] = null;
                            }
                        }
                    }

                    xhowmanytoswitch = 0;
                    howmanytoswitch = 0;

                     canswapin0 = 0;
                     canswapin1 = 0;
                     canswapin2 = 0;
                     canswapin3 = 0;
                     canswapin4 = 0;
                     canswapin5 = 0;
                     canswapin6 = 0;
                     canswapin7 = 0;
                     canswapin8 = 0;
                     canswapin9 = 0;
                     canswapin10 = 0;
                     canswapin11 = 0;
                     canswapin12 = 0;
                     canswapin13 = 0;
                     canswapin14 = 0;
                     canswapin15 = 0;
                     canswapin16 = 0;
                     canswapout0 = 0;
                     canswapout1 = 0;
                     canswapout2 = 0;
                     canswapout3 = 0;
                     canswapout4 = 0;
                     canswapout5 = 0;
                     canswapout6 = 0;
                     canswapout7 = 0;
                     canswapout8 = 0;
                     canswapout9 = 0;
                     canswapout10 = 0;
                     canswapout11 = 0;
                     canswapout12 = 0;
                     canswapout13 = 0;
                     canswapout14 = 0;
                     canswapout15 = 0;
                     canswapout16 = 0;
                }


                for(int g = 0; g < views.length && g < passedmonsters.length ; g++){

                    if (passedmonstersXJ[g] != null) {
                        ImageZXG(viewsx[g], passedmonstersXJ[g]);
                    }else {
                        viewsx[g].setImageResource(android.R.color.transparent);
                    }

                    if (passedmonsters[g] != null) {
                        ImageZXG(views[g], passedmonsters[g]);
                    }else {
                        views[g].setImageResource(android.R.color.transparent);
                    }

                }

               listorderI = new int[100];
               listorderO = new int[100];

                /*
                if (switchcounter == xswitchcounter) {
                    for (int y = 0; y < switchcounter; y++) {

                        Swithcer = passedmonstersJ[y];
                        if (passedmonstersXJ[y] != null) {
                            passedmonstersJ[y] = passedmonstersXJ9[y];
                        }else {

                            passedmonstersJ[y] = null;
                        }
                        passedmonstersXJ[y] = Swithcer;

                    }

                switchcounter = 0;
                xswitchcounter = 0;
                for(int g = 0; g < views.length && g < passedmonsters.length ; g++){

                    if (passedmonstersXJ[g] != null) {
                        ImageZXG(viewsx[g], passedmonstersXJ[g]);
                    }else {
                        viewsx[g].setImageResource(android.R.color.transparent);
                    }

                    if (passedmonstersJ[g] != null) {
                        ImageZXG(views[g], passedmonstersJ[g]);
                    }else {
                        views[g].setImageResource(android.R.color.transparent);
                    }

                }
            }

            */


                 countthroughmonstersx = 0;
                 countthroughmonstersz = 0;
                 countthroughmonsters = 0;
                 countthroughmonstersy = 0;


                for(int ggg = 0; ggg < passedmonsters.length; ggg++){

                    if(passedmonsters[ggg] != null){
                        countthroughmonsters++;
                    }
                }

                for(int ggg = 0; ggg < passedmonstersXJ.length; ggg++){

                    if(passedmonstersXJ[ggg] != null){
                        countthroughmonstersy++;
                    }
                }

                String DustMe = "%s";
                // String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));




                //  protomon.monst Passablemonster = new protomon.monst(monstlist(playerid)).clone();
                Intent intentGumble = new Intent();
                Bundle b = new Bundle();
                b.putInt("RetStorage", countthroughmonsters);
                while (countthroughmonstersx < countthroughmonsters){



                    String BustMe = String.format("RetMonster"+String.format(DustMe, countthroughmonstersx));
                    b.putParcelable(BustMe, passedmonsters[countthroughmonstersx]);




                    Gson gson = new Gson();
                    String json = gson.toJson(passedmonsters[countthroughmonstersx]);
                    editor.putString(BustMe, json);
                    editor.apply();
                    intentGumble.putExtra(BustMe, (Parcelable) passedmonsters[countthroughmonstersx]);

                    countthroughmonstersx++;
                }
                while (countthroughmonstersz < countthroughmonstersy){



                    String BustMe = String.format("MonsterStored"+String.format(DustMe, countthroughmonstersz));
                    b.putParcelable(BustMe, passedmonstersXJ[countthroughmonstersz]);



                    intentGumble.putExtra(BustMe, (Parcelable) passedmonstersXJ[countthroughmonstersz]);

                    Gson gson = new Gson();
                    String json = gson.toJson(passedmonstersXJ[countthroughmonstersz]);
                    editor.putString(BustMe, json);
                    editor.apply();

                    countthroughmonstersz++;
                }


                //     i.putExtra("Dictionary", dictionaryOfMonsters);


                //   b.putParcelable("Monster", Passablemonster);





                intentGumble.putExtra("MonsterChoice", Passback);


                intentGumble.putExtras(b);
                intentGumble.setClass(ProtomonContext, protomon.class);

            }
        });

        views[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(5);

                 Passback = cast;

                if (canswapin0 == 0){
                    canswapin0 = 1;
                    views[0].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin0 = 0;
                    views[0].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
           //      passedmonstersJ[switchcounter] = passedmonsters[Passback];
        //         switchcounter++;
//if(passedmonsters[cast].Health <= 0){

 //                  }else {
                  //     onswackPressed();

  //                 }

            }
        });

        views[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(10);
                Passback = listorder[1];

                if (canswapin1 == 0){
                    canswapin1 = 1;
                    views[1].setBackgroundColor((Color.parseColor("#000f00")));
                    listorderI[howmanytoswitch] = Passback;
                    howmanytoswitch++;

                }else {

                    canswapin1 = 0;
                    views[1].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }




                   
       //          passedmonstersJ[switchcounter] = passedmonsters[Passback];
       //          switchcounter++;
//if(passedmonsters[listorder[1]].Health <= 0){

            //       }else {
                       
           //        }

            }
        });

        views[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(15);
                Passback = listorder[2];
                if (canswapin2 == 0){
                    canswapin2 = 1;
                    views[2].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin2 = 0;
                    views[2].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
         //
         //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
         //        switchcounter++;

            }
        });


        views[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(20);

                Passback = listorder[3];
                if (canswapin3 == 0){
                    canswapin3 = 3;
                    views[3].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin3 = 0;
                    views[3].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
                   
         //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
         //        switchcounter++;

            }
        });

        views[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(25);
                Passback = listorder[4];

                if (canswapin4 == 0){
                    canswapin4 = 4;
                    views[4].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin4 = 0;
                    views[4].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
                   
         //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
         //        switchcounter++;
                   

            }
        });
        views[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(30);

                Passback = listorder[5];

                if (canswapin5 == 0){
                    canswapin5 = 5;
                    views[5].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin5 = 0;
                    views[5].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
                   
         //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
         //        switchcounter++;

            }
        });
        views[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(35);
                Passback = listorder[6];

                if (canswapin6 == 0){
                    canswapin6 = 6;
                    views[6].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin6 = 0;
                    views[6].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //       passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //       switchcounter++;

            }
        });
        views[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Rockit.vibrate(40);
                Passback = listorder[7];

                if (canswapin7 == 0){
                    canswapin7 = 7;
                    views[7].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin7 = 0;
                    views[7].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //         switchcounter++;

            }
        });
        views[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(45);
                Passback = listorder[8];

                if (canswapin8 == 0){
                    canswapin8 = 8;
                    views[8].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin8 = 0;
                    views[8].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //         passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //         switchcounter++;

            }
        });
        views[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(50);
                Passback = listorder[9];

                if (canswapin9 == 0){
                    canswapin9 = 9;
                    views[9].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin9 = 0;
                    views[9].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //        switchcounter++;

            }
        });
        views[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[10];

                if (canswapin10 == 0){
                    canswapin10 = 10;
                    views[10].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin10 = 0;
                    views[10].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //        switchcounter++;

            }
        });
        views[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[11];


                if (canswapin11 == 0){
                    canswapin11 = 11;
                    views[11].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin11 = 0;
                    views[11].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }
                //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //        switchcounter++;

            }
        });
        views[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[12];

                if (canswapin12 == 0){
                    canswapin12 = 12;
                    views[12].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin12 = 0;
                    views[12].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //       passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //       switchcounter++;

            }
        });
        views[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[13];

                if (canswapin13 == 0){
                    canswapin13 = 13;
                    views[13].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin13 = 0;
                    views[13].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //        passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //       switchcounter++;

            }
        });
        views[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[14];

                if (canswapin14 == 0){
                    canswapin14 = 14;
                    views[14].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin14 = 0;
                    views[14].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //       passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //       switchcounter++;

            }
        });
        views[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[15];

                if (canswapin15 == 0){
                    canswapin15 = 15;
                    views[15].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin15 = 0;
                    views[15].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //      passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //      switchcounter++;

            }
        });
        views[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Passback = listorder[16];

                if (canswapin16 == 0){
                    canswapin16 = 16;
                    views[16].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderI[howmanytoswitch] = Passback;howmanytoswitch++;
                }else {

                    canswapin16 = 0;
                    views[16].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderI[howmanytoswitch] = -27;
                    howmanytoswitch--;
                }

                //       passedmonstersJ[switchcounter] = passedmonsters[Passback];
                //       switchcounter++;

            }
        });


        // CUTOFF

        viewsx[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);
                if (canswapout0 == 0){
                    canswapout0 = 1;
                    viewsx[0].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 0;xhowmanytoswitch++;
                }else {

                    canswapout0 = 0;
                    viewsx[0].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
             //   passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
          //    xswitchcounter++;
                // ImageZXG(viewsx[0], passedmonsters[listorder[0]]);

            }
        });

        viewsx[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(60);

               // ImageZXG(viewsx[1], passedmonsters[listorder[Passback]]);
                if (canswapout1 == 0){
                    canswapout1 = 1;
                    viewsx[1].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 1;  xhowmanytoswitch++;
                }else {

                    canswapout1 = 0;
                    viewsx[1].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
                   
            //     passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
            //   xswitchcounter++;
//if(passedmonsters[listorder[1]].Health <= 0){

        //           }else {
                       
          //         }

            }
        });

        viewsx[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

               // ImageZXG(viewsx[2], passedmonsters[listorder[Passback]]);
                if (canswapout2 == 0){
                    canswapout2 = 1;
                    viewsx[2].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 2;  xhowmanytoswitch++;
                }else {

                    canswapout2 = 0;
                    viewsx[2].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
                   
              //   passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
              // xswitchcounter++;
//if(passedmonsters[listorder[2]].Health <= 0){

    //               }else {
                       
 //                  }

            }
        });


        viewsx[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);
                if (canswapout3 == 0){
                    canswapout3 = 1;
                    viewsx[3].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 3;  xhowmanytoswitch++;
                }else {

                    canswapout3 = 0;
                    viewsx[3].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[3], passedmonsters[listorder[Passback]]);

                   
  //               passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
 //              xswitchcounter++;

            }
        });

        viewsx[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);
                if (canswapout4 == 0){
                    canswapout4 = 1;
                    viewsx[4].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 4;  xhowmanytoswitch++;
                }else {

                    canswapout4 = 0;
                    viewsx[4].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                } 
               // ImageZXG(viewsx[4], passedmonsters[listorder[Passback]]);

                   
  //               passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
 //              xswitchcounter++;

            }
        });
        viewsx[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canswapout5 == 0){
                    canswapout5 = 1;
                    viewsx[5].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 5;  xhowmanytoswitch++;
                }else {

                    canswapout5 = 0;
                    viewsx[5].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
                Rockit.vibrate(50);
               // ImageZXG(viewsx[5], passedmonsters[listorder[Passback]]);

                   
   //              passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
    //           xswitchcounter++;

            }
        });
        viewsx[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);
                if (canswapout6 == 0){
                    canswapout6 = 6;
                    viewsx[6].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 6;  xhowmanytoswitch++;
                }else {

                    canswapout6 = 0;
                    viewsx[6].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[6], passedmonsters[listorder[Passback]]);

                   
     //            passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
     //         xswitchcounter++;

            }
        });
        viewsx[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout7 == 0){
                    canswapout7 = 7;
                    viewsx[7].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 7;  xhowmanytoswitch++;
                }else {

                    canswapout7 = 0;
                    viewsx[7].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[7], passedmonsters[listorder[Passback]]);

                   
     //            passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
      ///         xswitchcounter++;

            }
        });
        viewsx[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout8 == 0){
                    canswapout8 = 8;
                    viewsx[8].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 8;  xhowmanytoswitch++;
                }else {

                    canswapout8 = 0;
                    viewsx[8].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[8], passedmonsters[listorder[Passback]]);

                   
      //           passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
       //        xswitchcounter++;

            }
        });
        viewsx[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Rockit.vibrate(50);


                if (canswapout9 == 0){
                    canswapout9 = 9;
                    viewsx[9].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 9;  xhowmanytoswitch++;
                }else {

                    canswapout9 = 0;
                    viewsx[9].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[9], passedmonsters[listorder[Passback]]);


                //        passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
       //        xswitchcounter++;

            }
        });
        viewsx[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout10 == 0){
                    canswapout10 = 10;
                    viewsx[10].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 10;  xhowmanytoswitch++;
                }else {

                    canswapout10 = 0;
                    viewsx[10].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[10], passedmonsters[listorder[Passback]]);


                //         passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
                //       xswitchcounter++;

            }
        });
        viewsx[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout11 == 0){
                    canswapout11 = 11;
                    viewsx[11].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 11;  xhowmanytoswitch++;
                }else {

                    canswapout11 = 0;
                    viewsx[11].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[11], passedmonsters[listorder[Passback]]);


                //            passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
                //          xswitchcounter++;

            }
        });
        viewsx[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout12 == 0){
                    canswapout12 = 14;
                    viewsx[12].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 12;  xhowmanytoswitch++;
                }else {

                    canswapout12 = 0;
                    viewsx[12].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[12], passedmonsters[listorder[Passback]]);


                //             passedmonstersXJ9[xswitchcounter] = passedmonsters[Passback];
                //          xswitchcounter++;

            }
        });
        viewsx[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout13 == 0){
                    canswapout13 = 13;
                    viewsx[13].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 13;  xhowmanytoswitch++;
                }else {

                    canswapout13 = 0;
                    viewsx[13].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[13], passedmonsters[listorder[Passback]]);


                //            passedmonstersXJ9[switchcounter] = passedmonsters[Passback];
                //           xswitchcounter++;

            }
        });
        viewsx[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout14 == 0){
                    canswapout14 = 14;
                    viewsx[14].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 14;  xhowmanytoswitch++;
                }else {

                    canswapout14 = 0;
                    viewsx[14].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[14], passedmonsters[listorder[Passback]]);


                //           passedmonstersXJ9[switchcounter] = passedmonsters[Passback];
                //         xswitchcounter++;

            }
        });
        viewsx[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);

                if (canswapout15 == 0){
                    canswapout15 = 15;
                    viewsx[15].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] =15;  xhowmanytoswitch++;
                }else {

                    canswapout15 = 0;
                    viewsx[15].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }

               // ImageZXG(viewsx[15], passedmonsters[listorder[Passback]]);


                //          passedmonstersXJ9[switchcounter] = passedmonsters[Passback];
                //        xswitchcounter++;

            }
        });
        viewsx[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Rockit.vibrate(50);


                if (canswapout16 == 0){
                    canswapout16 = 16;
                    viewsx[16].setBackgroundColor((Color.parseColor("#000f00")));

                    listorderO[xhowmanytoswitch] = 16;  xhowmanytoswitch++;
                }else {

                    canswapout16 = 0;
                    viewsx[16].setBackgroundColor((Color.parseColor("#ffffff00")));
                    listorderO[xhowmanytoswitch] = -27;
                    xhowmanytoswitch--;
                }
               // ImageZXG(viewsx[16], passedmonsters[listorder[Passback]]);


                //        passedmonstersXJ9[switchcounter] = passedmonsters[Passback];
                //       xswitchcounter++;

            }
        });


    }
    public String names(double idnumber){


        if (idnumber > -1) {
            switch ((int)idnumber) {

                case 0:
                    return "errantnope";
                case 1:
                    return "Kunk";
                case 2:
                    return "Kohboh";
                case 3:
                    return "Djoper";
                case 4:
                    return "Schorp";
                case 5:
                    return "Zaume";
                case 6:
                    return "Nhainhai";
                case 7:
                    return "Degeissdt";
                case 8:
                    return "Yuggle";
                case 9:
                    return "Bongu";
                case 10:
                    return "Giteriglia";
                case 11:
                    return "Cyosteroth";
                case 12:
                    return "Nentopode";
                case 13:
                    return "Centiclak";
                case 14:
                    return "Uggnawb";
                case 15:
                    return "Grobhost";
                case 16:
                    return "Illelonab";
                case 17:
                    return "Rongzeed";
                case 18:
                    return "Blattle";
                case 19:
                    return "Swogharnler";
                case 20:
                    return "Adenolish";
                case 21:
                    return "Genaupresang";
                case 22:
                    return "Daahnida";
                case 23:
                    return "Sorba";
                case 24:
                    return "Jiyou";
                case 25:
                    return "Sparvae";
                case 26:
                    return "Vellup";
                case 27:
                    return "Bellaja";
                case 28:
                    return "Levdzell";
                case 29:
                    return "Rytegg";
                case 30:
                    return "Flashmer";
                case 31:
                    return "Schmodozer";
                case 32:
                    return "Octgotot";
                case 33:
                    return "Triaural";
                case 34:
                    return "Dicyto";
                case 35:
                    return "Monopteryx";
                case 36:
                    return "Elastocark";
                case 37:
                    return "Toobapath";
                case 38:
                    return "Weeliosbop";
                case 39:
                    return "Ihmpdrap";
                case 40:
                    return "Epibazang";
                case 41:
                    return "Hemtan";
                case 42:
                    return "Ogo";
                case 43:
                    return "Strachid";
                case 44:
                    return "Toximastica";
                case 45:
                    return "Urcuria";
                case 46:
                    return "Hyuntress";
                case 47:
                    return "Mondosplak";
                case 48:
                    return "Kaheksaguge";
                case 49:
                    return "Sapiosuant";
                case 50:
                    return "Munegull";
                case 51:
                    return "Sudakleez";
                case 52:
                    return "Halocordate";
                case 53:
                    return "Fædendron";
                case 54:
                    return "Osteoplang";
                case 55:
                    return "Жrachnid";
                case 56:
                    return "Ϫlitch";
                case 57:
                    return "በ";
                case 58:
                    return "Mantidile";
                case 59:
                    return "Nokoyl";
                case 60:
                    return "Яallod";
                case 61:
                    return "Algaetizer";
                case 62:
                    return "Kachort";
                case 63:
                    return "Slamelion";
                case 64:
                    return "Ayateda";
                case 65:
                    return "Wochem";
                case 66:
                    return "Ƕmun";
                case 67:
                    return "Ψkobath";
                case 68:
                    return "Gytanic";
                case 69:
                    return "βeiß";
                case 70:
                    return "Gungholio";
                case 71:
                    return "Honigkönig";
                case 72:
                    return "Kungulp";
                case 73:
                    return "Σatinella";
                case 74:
                    return "Elocurl";
                case 75:
                    return "Takobie";
                case 76:
                    return "Ōbchovy";
                case 77:
                    return "Nimnamnom";
                case 78:
                    return "Tutewtoo";
                case 79:
                    return "Blanqast";
                case 80:
                    return "Indeo";
                case 81:
                    return "Deblobbio";
                case 82:
                    return "Knightstacean";
                case 83:
                    return "Prostrax";
                case 84:
                    return "Haptozahen";
                case 85:
                    return "Minkohabod";
                case 86:
                    return "Zeen";
                case 87:
                    return "Tacroach";
                case 88:
                    return "Manterfly";
                case 89:
                    return "Beary";
                case 90:
                    return "Sluggernaut";
                case 91:

                    String Name;

                    Gson gson = new Gson();
                    Context ProtomonContext = getApplicationContext();
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();
                    String json = prefs.getString("Name", "");
                    if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                        NameObjectHolder = gson.fromJson(json, (Type) CustomMonsterTopLayer.StringObject.class);
                        return NameObjectHolder.NameString;
                    }else {
                        return "Failstorm";
                    }
                case 92:
                    return "Memeek";
                case 93:
                    return "Doughgnat";
                case 94:
                    return "R@ic";
                case 95:
                    return "Missileaneous";
                case 96:
                    return "Runnybabbit";
                case 97:
                    return "Zubgondrakter";
                case 98:
                    return "Whumpuhmp";
                case 99:
                    return "Mangoon";
                case 100:
                    return "Scarbeque";
                case 101:
                    return "Fwuffynumpkins";
                case 102:
                    return "Dothog";
                case 103:
                    return "Reefcake";
                case 104:
                    return "Cheetza";
                case 105:
                    return "Sortsand";
                case 106:
                    return "Chilldebeest";
                case 107:
                    return "Communigator";
                case 108:
                    return "Bossmoss";
                case 109:
                    return "Vamprey";
                case 110:
                    return "Parafoxical";
                case 111:
                    return "Rhischlosseros";  //Rhischlosserous
                case 112:
                    return "Hykeyna";
                case 113:
                    return "Tafantula";
                case 114:
                    return "Farmot";
                case 115:
                    return "Beeurchin";
                case 116:
                    return "Flyinsoup";
                case 117:
                    return "Meloncollie";
                case 118:
                    return "Scorphibian";
                case 119:
                    return "Geliphant";
                case 120:
                    return "Chimpansy";
                case 121:
                    return "Xaltoxis";
                case 122:
                    return "Avokaboom";
                case 123:
                    return "Eggress";
                case 124:
                    return "Zentapede";
                case 125:
                    return "Probocetus";


            }
        }else{
            return "error";
        }
        return "realerror";

    }



    public void onswackPressed(){

        Intent q = new Intent();
        q.putExtra("MonsterChoice", Passback);
        setResult(RESULT_OK, q);
    }

    public void onBackPressed(){



finish();
        //startActivity(intentGumble);
     //   setResult(RESULT_CANCELED, q);
     //   finish();
    }

    public void ImageZXG(ImageButton insideview, protomon.monst PlayerMonsterHandle){

        insideview.setColorFilter(Color.argb(0, 0, 0, 0));



        int n = new Random().nextInt(99);
        switch((int) PlayerMonsterHandle.Idnum) {

            case 0:
                insideview.setImageResource(R.drawable.errantnope);
                break;
            case 1:
                insideview.setImageResource(R.drawable.kunk);
                break;
            case 2:
                insideview.setImageResource(R.drawable.kohboh);
                break;
            case 3:
                insideview.setImageResource(R.drawable.djoper);
                break;
            case 4:
                insideview.setImageResource(R.drawable.schorp);
                break;
            case 5:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    insideview.setImageResource(R.drawable.zaume);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.zaumer);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    insideview.setImageResource(R.drawable.zaumeb);
                } else {
                    insideview.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.nhainhai);
                } else {
                    insideview.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                insideview.setImageResource(R.drawable.degeissdt);
                break;
            case 8:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    insideview.setImageResource(R.drawable.yuggle);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.yugglee);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    insideview.setImageResource(R.drawable.yugglet);
                } else {
                    insideview.setImageResource(R.drawable.yuggler);
                }
                break;
            case 9:
                insideview.setImageResource(R.drawable.bongu);
                break;
            case 10:
                insideview.setImageResource(R.drawable.giteriglia);
                break;
            case 11:
                insideview.setImageResource(R.drawable.cyosteroth);
                break;
            case 12:
                insideview.setImageResource(R.drawable.nentopode);
                break;
            case 13:
                insideview.setImageResource(R.drawable.centiclak);
                break;
            case 14:
                insideview.setImageResource(R.drawable.uggnawb);
                break;
            case 15:
                insideview.setImageResource(R.drawable.grobhost);
                break;
            case 16:
                insideview.setImageResource(R.drawable.illelonab);
                break;
            case 17:
                insideview.setImageResource(R.drawable.rongzeed);
                break;
            case 18:
                insideview.setImageResource(R.drawable.blattle);
                break;
            case 19:


                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.swogharnlera);
                } else {
                    insideview.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                insideview.setImageResource(R.drawable.adenolish);
                break;
            case 21:

                if (PlayerMonsterHandle.UniqueID < 70000000) {
                    insideview.setImageResource(R.drawable.genaupresangb);
                } else {
                    insideview.setImageResource(R.drawable.genaupresangc);
                }

                break;
            case 22:
                if (PlayerMonsterHandle.UniqueID < 20000000) {
                    insideview.setImageResource(R.drawable.daahnida);
                } else if (PlayerMonsterHandle.UniqueID < 40000000) {
                    insideview.setImageResource(R.drawable.daahnidaa);
                } else if (PlayerMonsterHandle.UniqueID < 60000000) {
                    insideview.setImageResource(R.drawable.daahnidab);
                } else if (PlayerMonsterHandle.UniqueID < 80000000) {
                    insideview.setImageResource(R.drawable.daahnidac);
                } else {
                    insideview.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = PlayerMonsterHandle.UniqueID % 7; //>>>
                int daahnidacolorcontroller = PlayerMonsterHandle.UniqueID % 255;

                switch (daahnidacolorsetter) {
                    case 0:
                        insideview.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        insideview.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255));
                        break;
                    case 2:
                        insideview.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255));
                        break;
                    case 3:
                        insideview.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        insideview.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                    case 5:
                        insideview.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255));
                        break;
                    case 6:
                        insideview.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                }


                break;
            case 23:
                insideview.setImageResource(R.drawable.sorba);
                break;
            case 24:
                insideview.setImageResource(R.drawable.jiyou);
                break;
            case 25:
                insideview.setImageResource(R.drawable.sparvae);
                break;
            case 26:
                insideview.setImageResource(R.drawable.vellup);
                break;
            case 27:
                insideview.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                insideview.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.ryteggg);
                } else {
                    insideview.setImageResource(R.drawable.rytegg);
                }
                break;
            case 30:
                insideview.setImageResource(R.drawable.flashmer);
                break;
            case 31:
                insideview.setImageResource(R.drawable.schmodozer);
                break;
            case 32:
                insideview.setImageResource(R.drawable.octgotot);
                break;
            case 33:
                insideview.setImageResource(R.drawable.triaural);
                break;
            case 34:
                insideview.setImageResource(R.drawable.dicyto);
                break;
            case 35:
                insideview.setImageResource(R.drawable.monopteryx);
                break;
            case 36:
                insideview.setImageResource(R.drawable.elastocark);
                break;
            case 37:
                insideview.setImageResource(R.drawable.toobapath);
                break;
            case 38:
                insideview.setImageResource(R.drawable.wheeliosbop);
                break;
            case 39:
                insideview.setImageResource(R.drawable.ihmpdrap);
                break;
            case 40:
                insideview.setImageResource(R.drawable.epibazang);
                break;
            case 41:
                insideview.setImageResource(R.drawable.hemtan);
                break;
            case 42:
                insideview.setImageResource(R.drawable.ogo);
                break;
            case 43:
                insideview.setImageResource(R.drawable.strachid);
                break;
            case 44:
                insideview.setImageResource(R.drawable.toximastica);
                break;
            case 45:
                insideview.setImageResource(R.drawable.urcuria);
                break;
            case 46:

                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    insideview.setImageResource(R.drawable.hyuntress);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.hyuntressa);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    insideview.setImageResource(R.drawable.hyuntressb);
                } else {
                    insideview.setImageResource(R.drawable.hyuntressc);
                }
                break;
            case 47:
                insideview.setImageResource(R.drawable.mondosplak);
                break;
            case 48:
                insideview.setImageResource(R.drawable.kaheksaguge);
                break;
            case 49:
                insideview.setImageResource(R.drawable.sapiosuant);
                break;
            case 50:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    insideview.setImageResource(R.drawable.munegullx);
                } else {
                    insideview.setImageResource(R.drawable.munegull);
                }

                break;
            case 51:
                insideview.setImageResource(R.drawable.sudakleez);
                break;
            case 52:
                insideview.setImageResource(R.drawable.halocordate);
                break;
            case 53:
                insideview.setImageResource(R.drawable.faedendron);
                break;
            case 54:
                insideview.setImageResource(R.drawable.osteoplang);
                break;
            case 55:
                insideview.setImageResource(R.drawable.zrachnid);
                break;
            case 56:
                insideview.setImageResource(R.drawable.xlitch);
                break;
            case 57:
                insideview.setImageResource(R.drawable.baa);
                break;
            case 58:
                insideview.setImageResource(R.drawable.mantidile);
                break;
            case 59:
                insideview.setImageResource(R.drawable.nokoyl);
                break;
            case 60:
                insideview.setImageResource(R.drawable.yallod);
                break;
            case 61:
                insideview.setImageResource(R.drawable.algaetizer);
                break;
            case 62:
                insideview.setImageResource(R.drawable.kachort);
                break;
            case 63:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    insideview.setImageResource(R.drawable.slamelion);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.slamelionb);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    insideview.setImageResource(R.drawable.slameliona);
                } else {
                    insideview.setImageResource(R.drawable.slamelion);
                }
                break;
            case 64:
                insideview.setImageResource(R.drawable.ayateda);
                break;
            case 65:
                insideview.setImageResource(R.drawable.wochem);
                break;
            case 66:
                insideview.setImageResource(R.drawable.humun);
                break;
            case 67:
                insideview.setImageResource(R.drawable.psychobath);
                break;
            case 68:
                insideview.setImageResource(R.drawable.gytanic);
                break;
            case 69:
                insideview.setImageResource(R.drawable.beis);
                break;
            case 70:
                insideview.setImageResource(R.drawable.gungholio);
                break;
            case 71:
                insideview.setImageResource(R.drawable.honigkonig);
                break;
            case 72:
                insideview.setImageResource(R.drawable.kungulp);
                break;
            case 73:
                insideview.setImageResource(R.drawable.satinella);
                break;
            case 74:
                insideview.setImageResource(R.drawable.elocurl);
                break;
            case 75:
                insideview.setImageResource(R.drawable.takobie);
                break;
            case 76:
                insideview.setImageResource(R.drawable.obchovy);
                break;
            case 77:
                insideview.setImageResource(R.drawable.nimnamnom);
                break;
            case 78:
                insideview.setImageResource(R.drawable.tutewtoo);
                break;
            case 79:
                insideview.setImageResource(R.drawable.blanqast);
                break;
            case 80:
                insideview.setImageResource(R.drawable.indeo);
                break;
            case 81:
                insideview.setImageResource(R.drawable.deblobbio);
                break;
            case 82:
                insideview.setImageResource(R.drawable.knightstacean);
                break;
            case 83:
                insideview.setImageResource(R.drawable.prostrax);
                break;
            case 84:
                insideview.setImageResource(R.drawable.haptozahen);
                break;
            case 85:
                insideview.setImageResource(R.drawable.minkohabod);
                break;
            case 86:
                insideview.setImageResource(R.drawable.zeen);
                break;
            case 87:
                insideview.setImageResource(R.drawable.tacroach);
                break;
            case 88:
                insideview.setImageResource(R.drawable.manterfly);
                break;
            case 89:
                if (PlayerMonsterHandle.UniqueID < 9000000) {
                    insideview.setImageResource(R.drawable.bearya);
                } else if (PlayerMonsterHandle.UniqueID < 18000000) {
                    insideview.setImageResource(R.drawable.bearyb);
                } else if (PlayerMonsterHandle.UniqueID < 27000000) {
                    insideview.setImageResource(R.drawable.bearyc);
                } else if (PlayerMonsterHandle.UniqueID < 36000000) {
                    insideview.setImageResource(R.drawable.bearyd);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.bearye);
                } else if (PlayerMonsterHandle.UniqueID < 54000000) {
                    insideview.setImageResource(R.drawable.bearyf);
                } else if (PlayerMonsterHandle.UniqueID < 63000000) {
                    insideview.setImageResource(R.drawable.bearyg);
                } else if (PlayerMonsterHandle.UniqueID < 72000000) {
                    insideview.setImageResource(R.drawable.bearyh);
                } else if (PlayerMonsterHandle.UniqueID < 81000000) {
                    insideview.setImageResource(R.drawable.bearyi);
                } else if (PlayerMonsterHandle.UniqueID < 90000000) {
                    insideview.setImageResource(R.drawable.bearyj);
                } else {
                    insideview.setImageResource(R.drawable.bearyk);
                }
                break;
            case 90:
                insideview.setImageResource(R.drawable.sluggernaut);
                break;
            case 91:
                if (PlayerMonsterHandle.UniqueID < 12000000) {
                    insideview.setImageResource(R.drawable.firstcustom);
                } else if (PlayerMonsterHandle.UniqueID < 44000000) {
                    insideview.setImageResource(R.drawable.missleaneous);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    insideview.setImageResource(R.drawable.firstcustoma);
                } else if (PlayerMonsterHandle.UniqueID < 88000000) {
                    insideview.setImageResource(R.drawable.zubgondrakter);
                } else if (PlayerMonsterHandle.UniqueID < 89000000) {
                    insideview.setImageResource(R.drawable.rattic);
                } else if (PlayerMonsterHandle.UniqueID < 89500000) {
                    insideview.setImageResource(R.drawable.doughgnat);
                } else if (PlayerMonsterHandle.UniqueID < 90000000) {
                    insideview.setImageResource(R.drawable.sluggernaut);
                } else {
                    insideview.setImageResource(R.drawable.firstcustomc);
                }
                break;


            case 92:

                int memeekcolorsetter = PlayerMonsterHandle.UniqueID % 7; //>>>
                int memeekcolorcontroller = PlayerMonsterHandle.UniqueID % 255;

                switch (memeekcolorsetter) {
                    case 0:
                        insideview.setColorFilter(Color.argb(110, 255, 255, memeekcolorcontroller));
                        break;
                    case 1:
                        insideview.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, 255));
                        break;
                    case 2:
                        insideview.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, 255));
                        break;
                    case 3:
                        insideview.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, memeekcolorcontroller));
                        break;
                    case 4:
                        insideview.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                    case 5:
                        insideview.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, 255));
                        break;
                    case 6:
                        insideview.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                }
                insideview.setImageResource(R.drawable.memeeka);
                break;
            case 93:
                insideview.setImageResource(R.drawable.doughgnat);
                break;
            case 94:
                insideview.setImageResource(R.drawable.rattic);
                break;
            case 95:
                insideview.setImageResource(R.drawable.missleaneous);
                break;
            case 96:
                if(PlayerMonsterHandle.UniqueID < 15000000) {
                    insideview.setImageResource(R.drawable.runnybabbita);
                }else if (PlayerMonsterHandle.UniqueID < 20000000) {
                    insideview.setImageResource(R.drawable.runnybabbitb);
                }else if (PlayerMonsterHandle.UniqueID < 30000000) {
                    insideview.setImageResource(R.drawable.runnybabbitc);
                }else if (PlayerMonsterHandle.UniqueID < 40000000) {
                    insideview.setImageResource(R.drawable.runnybabbitd);
                }else if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.runnybabbite);
                }else {

                    insideview.setImageResource(R.drawable.runnybabbitx);
                }
                break;
            case 97:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.zubgondrakter);
                } else {
                    insideview.setImageResource(R.drawable.zubgondrakterhat);
                }
                break;
            case 98:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.whumpuhmp);
                } else {
                    insideview.setImageResource(R.drawable.whumpuhmp);
                }
                break;
            case 99:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.mangoon);
                } else {
                    insideview.setImageResource(R.drawable.mangoon);
                }
                break;
            case 100:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.scarbeque);
                } else {
                    insideview.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.fwuffynumpkins);
                } else {
                    insideview.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;case 102:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.dothog);
                } else {
                    insideview.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.reefcake);
                } else {
                    insideview.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.cheetza);
                } else {
                    insideview.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.sortsand);
                } else {
                    insideview.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.chilldabeest);
                } else {
                    insideview.setImageResource(R.drawable.chilldabeest);
                }
                break;case 107:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.communigator);
                } else {
                    insideview.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.mossboss);
                } else {
                    insideview.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.vamprey);
                } else {
                    insideview.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.parafox);
                } else {
                    insideview.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.rhischlosserous);
                } else {
                    insideview.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.hykeyna);
                } else {
                    insideview.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.tafantula);
                } else {
                    insideview.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.farmot);
                } else {
                    insideview.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.beeurchin);
                } else {
                    insideview.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.flyinsoup);
                } else {
                    insideview.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.meloncolli);
                } else {
                    insideview.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.scorphibian);
                } else {
                    insideview.setImageResource(R.drawable.scorphibian);
                }
                break;
            case 119:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.geliphant);
                } else {
                    insideview.setImageResource(R.drawable.geliphantx);
                }
                break;
            case 120:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.chimpansy);
                } else {
                    insideview.setImageResource(R.drawable.chimpansy);
                }
                break;
            case 121:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.giveup);
                } else {
                    insideview.setImageResource(R.drawable.giveupx);
                }
                break;
            case 122:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    insideview.setImageResource(R.drawable.avokaboomx);
                } else {
                    insideview.setImageResource(R.drawable.avokaboom);
                }
                break;
            case 123:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    insideview.setImageResource(R.drawable.eggress);
                } else {
                    insideview.setImageResource(R.drawable.eggressx);
                }
                break;
            case 124:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    insideview.setImageResource(R.drawable.zentapede);
                } else {
                    insideview.setImageResource(R.drawable.zentapede);
                }
                break;
            case 125:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    insideview.setImageResource(R.drawable.probocetus);
                } else {
                    insideview.setImageResource(R.drawable.probocetus);
                }
                break;
        }


        insideview.setMaxHeight(50);
        insideview.setMaxWidth(50);

    }

}
