package ditzler.cole.stableapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class TeamSwap extends AppCompatActivity {



    int[] listorder = new int[100];
int kayeeezy ;
    int Passback;
    Bundle outStated;

    CustomMonsterTopLayer.StringObject NameObjectHolder;
    boolean[] dictionaryOfMonsters;
    int x = 0;
    int storagesize = 0;
    int retstoragesize = 0;
    int cast = 0;

    ImageButton Desk;
    Button Return, Store, Print, PrintTwo, CustomButton, Dynamics;
    TextView PrintWindow;
    public View DarkView;
    int VisibilityHolder = 0;
    protomon.monst passedmonster;
    protomon.monst[] passedmonsters;
    protomon.monst[] retpassedmonsters;
    protomon.monst[] passedmonstersJ = new protomon.monst[9999];
    protomon.monst[] passedmonstersTwo = new protomon.monst[9999];
    protomon.monst[] retpassedmonstersTwo = new protomon.monst[9999];
    String o = "%.0f";

    TextView LongView;
    EditText edit;
    Button Select;
    
    ImageButton[] views = new ImageButton[17];
    TextView[] tviews = new TextView[17];

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.team_swap);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        views[0] = findViewById(R.id.Current);
        
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



      //  LongView = findViewById(R.id.ScrollerLongText);
        edit = findViewById(R.id.editTextBox);
        Select = findViewById(R.id.SelectButton);



        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();



        storagesize = 2;
        int bee;
        Bundle b = getIntent().getExtras();
        if (b != null) {

            storagesize = b.getInt("Storage");
            retstoragesize = b.getInt("RetStorage", 17);
            cast = b.getInt("Cast");
            dictionaryOfMonsters = b.getBooleanArray("Dictionary");

            passedmonsters = new protomon.monst[storagesize];
            retpassedmonsters = new protomon.monst[17];
            int i = 0;
            while (i < storagesize) {

                String DustMe = "Monster%s";
                String BustMe = String.format(DustMe, i);

                passedmonsters[i] = b.getParcelable(BustMe);

                bee = (int) passedmonsters[i].Idnum;
                bee = bee;
                bee = bee;


                Gson gson = new Gson();
                String json = prefs.getString(BustMe, "");
                passedmonsters[i] = gson.fromJson(json, protomon.monst.class);


                i++;

            }
             i = 0;
            while (i < storagesize) {

                String DustMe = "RetMonster%s";
                String BustMe = String.format(DustMe, i);

                retpassedmonsters[i] = b.getParcelable(BustMe);

            //    bee = (int) retpassedmonsters[i].Idnum;
            //    bee = bee;
            //    bee = bee;


                Gson gson = new Gson();
                String json = prefs.getString(BustMe, "");
                retpassedmonsters[i] = gson.fromJson(json, protomon.monst.class);


                i++;

            }
        }

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




        if (false){
            
           // kayeeezy=1;
            for (int f = 0; f < 17; f++) {
                    listorder[f] = f;
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

            for (int g = 0; g < views.length && g < retstoragesize; g++) {

                ImageZXG(views[g], retpassedmonsters[g]);

            }

            ImageZXG(views[0], retpassedmonsters[0]);


            for (int g = 0; g < storagesize - 1; g++) {
                tviews[g].setText(String.valueOf((g + 1)));
            }
        }else {
            for (int f = 0; f < passedmonsters.length; f++) {

                if (f < cast) {
                    listorder[f] = f;
                } else if (f == cast) {
                    listorder[17] = f;
                } else if (f > cast) {
                    listorder[f] = f;
                }


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

            for (int g = 0; g < views.length && g < passedmonsters.length; g++) {

                ImageZXG(views[g], passedmonsters[listorder[g]]);

            }

            ImageZXG(views[0], passedmonsters[listorder[17]]);


            for (int g = 0; g < storagesize - 1; g++) {
                tviews[g].setText(String.valueOf((g + 1)));
            }
        }

        Select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String bant = edit.getText().toString();
                   if(!TextUtils.isEmpty(bant)) {

                Passback = Math.abs((int) (Double.parseDouble(String.valueOf(edit.getText())) % 100)-1);
                }




                   if(passedmonsters[Passback].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });

        views[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  if (kayeeezy != 0) {
                      Passback = 0;

                  } else {
                      Passback = cast;
                  }
                   if(passedmonsters[cast].Health <= 0){

                   }else {
                  //     onswackPressed();

                       Intent q = new Intent();
                       q.putExtra("MonsterChoice", Passback);
                       setResult(RESULT_CANCELED, q);
                       finish();
                   }

            }
        });

        views[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                     if (kayeeezy != 0) {
                         Passback = 1;

                     } else{
Passback = listorder[1];
            }
                   if(passedmonsters[listorder[1]].Health <= 0) {

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });

        views[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback = 2;

                 } else {
                     Passback = listorder[2];
                 }

                   if(passedmonsters[listorder[2]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });


        views[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =3;

                 } else {
                     Passback = listorder[3];
                 }
                   if(passedmonsters[listorder[3]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });

        views[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =4;

                 } else {
                     Passback = listorder[4];
                 }
                   if(passedmonsters[listorder[4]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =5;

                 } else {
                     Passback = listorder[5];
                 }
                   if(passedmonsters[listorder[5]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =6;

                 } else {
                     Passback = listorder[6];
                 }
                   if(passedmonsters[listorder[6]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =7;

                 } else {
                     Passback = listorder[7];
                 }
                   if(passedmonsters[listorder[7]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =8;

                 } else {
                     Passback = listorder[8];
                 }
                   if(passedmonsters[listorder[8]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =9;

                 } else {
                     Passback = listorder[9];
                 }
                   if(passedmonsters[listorder[9]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =10;

                 } else {
                     Passback = listorder[10];
                 }
                   if(passedmonsters[listorder[10]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =11;

                 } else {
                     Passback = listorder[11];
                 }
                   if(passedmonsters[listorder[11]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =12;

                 } else {
                     Passback = listorder[12];
                 }
                   if(passedmonsters[listorder[12]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =13;

                 } else {
                     Passback = listorder[13];
                 }
                   if(passedmonsters[listorder[13]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =14;

                 } else {
                     Passback = listorder[14];
                 }
                   if(passedmonsters[listorder[14]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =15;

                 } else {
                     Passback = listorder[15];
                 }
                   if(passedmonsters[listorder[15]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

            }
        });
        views[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 if (kayeeezy != 0) {
                     Passback =16;

                 } else {
                     Passback = listorder[16];
                 }
                   if(passedmonsters[listorder[16]].Health <= 0){

                   }else {
                       onswackPressed();
                       finish();
                   }

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
                case 126:
                    return "Tankgolin";
                case 127:
                    return "Spiekgul";


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

        Intent q = new Intent();
        q.putExtra("MonsterChoice", Passback);
        setResult(RESULT_CANCELED, q);
        finish();
    }

    public void ImageZXG(ImageButton insideview, protomon.monst PlayerMonsterHandle){

        insideview.setColorFilter(Color.argb(0, 0, 0, 0));


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

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.zentapede);
                } else {
                    insideview.setImageResource(R.drawable.zentapede);
                }
                break;
            case 125:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.probocetus);
                } else {
                    insideview.setImageResource(R.drawable.probocetus);
                }
                break;
            case 126:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    insideview.setImageResource(R.drawable.tankgolin);
                } else {
                    insideview.setImageResource(R.drawable.tankgolin);
                }
                break;
            case 127:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    insideview.setImageResource(R.drawable.spiekgulx);
                } else {
                    insideview.setImageResource(R.drawable.spiekgul);
                }
                break;
        }


        insideview.setMaxHeight(50);
        insideview.setMaxWidth(50);

    }

}
