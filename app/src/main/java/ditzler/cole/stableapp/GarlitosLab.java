package ditzler.cole.stableapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class GarlitosLab extends AppCompatActivity {



    int countthroughmonstersx = 0;
    int countthroughmonstersz = 0;
    int countthroughmonsters = 0;
    int countthroughmonstersy = 0;

    int retstorage;
    int activityopemer = 0;
    Bundle outStated;

    CustomMonsterTopLayer.StringObject NameObjectHolder;
    boolean[] dictionaryOfMonsters;
    int x = 0;
    int storagesize = 0;

    int retstoragesize = 0;

    ImageButton Desk, Capsules;
        Button Return, Store, Print, PrintTwo, CustomButton, MoveDexButton, Dynamics;
        TextView PrintWindow;
        public View DarkView;
        int VisibilityHolder = 0;
        protomon.monst passedmonster;
        protomon.monst[] passedmonsters = new protomon.monst[9999];
        protomon.monst[] passedmonstersJ = new protomon.monst[9999];
        protomon.monst[] passedmonstersTwo = new protomon.monst[9999];
        protomon.monst[] passedmonstersXJ = new protomon.monst[9999];
        String o = "%.0f";

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
            setContentView(R.layout.garlitos_lab_activity);


            Desk = (ImageButton) findViewById(R.id.Desktop);
            Capsules = (ImageButton) findViewById(R.id.Capsule);
            PrintWindow = (TextView) findViewById(R.id.PrintOut);
            Print = (Button) findViewById(R.id.PrintOutButton);
            PrintTwo = (Button) findViewById(R.id.PrintOutButtonDos);
            CustomButton = (Button) findViewById(R.id.Custom);
            MoveDexButton = (Button) findViewById(R.id.MoveDex);
            Return = (Button) findViewById(R.id.ReturnButton);
            Dynamics = (Button) findViewById(R.id.DynamicsButton);

            Store = (Button) findViewById(R.id.StoreButton);


            Desk.setImageResource(R.drawable.garsdesk);

            Print.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {








                    if (passedmonsters[x] != null) {
                        String Name = names(passedmonsters[x].Idnum) + "\n";
                        String Health = ("Health " + String.format(o, passedmonsters[x].Health) + "\n");
                        String Defense = ("Defense " + String.format(o, passedmonsters[x].Defense) + "\n");
                        String Attack = ("Attack " + String.format(o, passedmonsters[x].Attack) + "\n");
                        String Speed = ("Speed " + String.format(o, passedmonsters[x].Speed) + "\n");
                        PrintWindow.setText(Name + Health + Defense + Attack + Speed);
                        x = (x+1)%storagesize;
                    }else {
                        PrintWindow.setText("");
                    }



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


                        }
                    }else{
                        return "error";
                    }
                    return "realerror";
                }
            });

            PrintTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (passedmonstersTwo[x] != null) {
                        String Name = names(passedmonstersTwo[x].Idnum) + "\n";
                        String Health = ("Health " + String.format(o, passedmonstersTwo[x].Health) + "\n");
                        String Defense = ("Defense " + String.format(o, passedmonstersTwo[x].Defense) + "\n");
                        String Attack = ("Attack " + String.format(o, passedmonstersTwo[x].Attack) + "\n");
                        String Speed = ("Speed " + String.format(o, passedmonstersTwo[x].Speed) + "\n");
                        PrintWindow.setText(Name + Health + Defense + Attack + Speed);
                        x = (x+1)%storagesize;
                    }else {
                        PrintWindow.setText("");
                    }






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
                        }
                    }else{
                        return "error";
                    }
                    return "realerror";
                }
            });
            Return.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Bundle b = getIntent().getExtras();
                    Gson gson = new Gson();
                    Context ProtomonContext = getApplicationContext();
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();


                    if (b != null) {

                        storagesize = b.getInt("Storage");
                        retstoragesize = b.getInt("RetStorage");
                        dictionaryOfMonsters = b.getBooleanArray("Dictionary");

                        int i = 0;
                        while (i < storagesize) {

                            String DustMe = "RetMonster%s";
                            String BustMe = String.format(DustMe, i);

                            passedmonstersJ[i] = b.getParcelable(BustMe);



                     //       Gson gson = new Gson();
                            String json = prefs.getString(BustMe, "");
                            passedmonstersJ[i] = gson.fromJson(json, protomon.monst.class);


                            i++;

                        }
                    }

                    if(b != null) {
                        while (countthroughmonstersx < countthroughmonsters) {


                            String DustMe = "%s";
                           // String BustMe = String.format(DustMe, i);


                            String BustMe = String.format("RetMonster" + String.format(DustMe, countthroughmonstersx));
                            b.putParcelable(BustMe, passedmonstersJ[countthroughmonstersx]);


                            String json = gson.toJson(passedmonstersJ[countthroughmonstersx]);
                            editor.putString(BustMe, json);
                            editor.apply();

                            countthroughmonstersx++;
                        }
                        while (countthroughmonstersz < countthroughmonstersy) {


                            String DustMe = "%s";
                           // String BustMe = String.format(DustMe, i);


                            String BustMe = String.format("MonsterStored" + String.format(DustMe, countthroughmonstersz));
                            b.putParcelable(BustMe, passedmonstersXJ[countthroughmonstersz]);


                            String json = gson.toJson(passedmonstersXJ[countthroughmonstersz]);
                            editor.putString(BustMe, json);
                            editor.apply();

                            countthroughmonstersz++;
                        }

                        b.putInt("RetStorage", retstoragesize);
                    }


                    finish();


                }
            });



            Desk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (activityopemer == 0) {
                        Notes();
                        activityopemer = 1;
                    }
                }
            });


            Capsules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if (activityopemer == 0) {
                       Storage();
                        activityopemer = 1;
                    }
                }
            });


            CustomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (activityopemer == 0) {
                        CustomMonsterTop();
                        activityopemer = 1;
                    }
                }
            });


            MoveDexButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (activityopemer == 0) {
                        MoveNotes();;
                        activityopemer = 1;
                    }
                }
            });


            Dynamics.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if (activityopemer == 0) {
                       DynamicsStart();
                        activityopemer = 1;
                    }
                }
            });



            Store.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Context ProtomonContext = getApplicationContext();

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();




                    VisibilityMethod();
                    storagesize = 2;
                    int bee;
                    Bundle b = getIntent().getExtras();
                    if (b != null) {

                        storagesize = b.getInt("Storage");
                        dictionaryOfMonsters = b.getBooleanArray("Dictionary");

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
                             passedmonstersTwo[i] = gson.fromJson(json, protomon.monst.class);


                            i++;

                        }
                    }

                    //       assert passedmonster != null;
                    // int c = (int) passedmonster.Idnum;
                    //  c = c;


                    int i = 0;
                    if (b != null && outStated != null) {

                        storagesize = b.getInt("Storage");

                        for ( i = 0; i < storagesize; i++) {
                            String DustMe = "MonsterRecovery%s";
                            String BustMe = String.format(DustMe, i);
                            passedmonstersTwo[i] = outStated.getParcelable(BustMe);
                        }

                    }

                }
            });

        }

        public void VisibilityMethod () {


            if (VisibilityHolder % 2 == 0) {
                Return.setVisibility(View.INVISIBLE);


            } else {
                Return.setVisibility(View.VISIBLE);

            }

            VisibilityHolder++;
        }
/*
    private File getTempFile(Context context, String url) {
        File file;
        try {
            String fileName = Uri.parse(url).getLastPathSegment();
            file = File.createTempFile(fileName, null, context.getCacheDir());
            return file;
        } catch (IOException e) {
            // Error while creating file
        }
        return file;
    }
*/
        @Override
        protected void onSaveInstanceState (Bundle outState){
            super.onSaveInstanceState(outState);

            String a = "MonsterRecovery%s";
            int storagesize = 2;
            int bee;
            Bundle b = getIntent().getExtras();
            if (b != null) {

                    storagesize = b.getInt("Storage");

                    int q = 0;
                    while (q < storagesize) {

                        String DustMe = "Monster%s";
                        String BustMe = String.format(DustMe, q );

                        passedmonsters[q] = b.getParcelable(BustMe);

                        bee = (int) passedmonsters[q].Idnum;
                        bee = bee;
                        bee = bee;
                       q++;

                    }


                storagesize = b.getInt("Storage");

                for (int i = 0; i < storagesize; i++) {
                    String A = String.format(a, i);
                    outState.putParcelable(A, (passedmonsters[i]));
                }


            }


            outStated = outState;

        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent objEvent) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            String a = "MonsterRecovery%s";
            int storagesize = 2;
            int bee;
            Bundle b = getIntent().getExtras();
            if (b != null) {

                storagesize = b.getInt("Storage");

                int q = 0;
                while (q < storagesize) {

                    String DustMe = "Monster%s";
                    String BustMe = String.format(DustMe, q );

                    passedmonsters[q] = b.getParcelable(BustMe);

                    bee = (int) passedmonsters[q].Idnum;
                    bee = bee;
                    bee = bee;
                    q++;

                }


             //   storagesize = b.getInt("Storage");

                for (int i = 0; i < storagesize; i++) {
                    String A = String.format(a, i);
                    b.putParcelable(A, (passedmonsters[i]));
                }


            }


            outStated = b;

            return true;
        }
        return super.onKeyUp(keyCode, objEvent);
    }

        public void onBackPressed (Bundle outState){
            super.onBackPressed();

            String a = "MonsterRecovery%s";
            int storagesize = 2;
            int bee;
            Bundle b = getIntent().getExtras();
            if (b != null) {

                    storagesize = b.getInt("Storage");

                    int q = 0;
                    while (q < storagesize) {

                        String DustMe = "Monster%s";
                        String BustMe = String.format(DustMe, q );

                        passedmonsters[q] = b.getParcelable(BustMe);

                        bee = (int) passedmonsters[q].Idnum;
                        bee = bee;
                        bee = bee;
                       q++;

                    }


                storagesize = b.getInt("Storage");

                for (int i = 0; i < storagesize; i++) {
                    String A = String.format(a, i);
                    outState.putParcelable(A, (passedmonsters[i]));
                }


            }


            outStated = outState;

        }



    protected void onPause(Bundle outState) {
        super.onPause();
        String a = "MonsterRecovery%s";
        int storagesize = 2;
        int bee;
        Bundle b = getIntent().getExtras();
        if (b != null) {

            storagesize = b.getInt("Storage");

            for (int i = 0; i < storagesize; i++) {
                String A = String.format(a, i);
                outState.putParcelable(A, (passedmonsters[i]));
            }


        }

    }

    protected void onResume(Bundle outState) {
        super.onResume();
        String a = "MonsterRecovery%s";
        int storagesize = 2;
        int bee;
        Bundle b = getIntent().getExtras();
        if (outState != null && b != null) {

            storagesize = b.getInt("Storage");

            for (int i = 0; i < storagesize; i++) {
                String DustMe = "MonsterRecovery%s";
                String BustMe = String.format(DustMe, i);
                passedmonstersTwo[i] = outState.getParcelable(BustMe);
            }

        }
    }

    public void Notes() {
        Intent go = new Intent(this, GarlitosNotes.class);
        startActivity(go);
    }
    public void MoveNotes() {
        Intent go = new Intent(this, GarlitosMoveNotes.class);
        startActivity(go);
    }
    public void Storage() {




        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();




        VisibilityMethod();
        storagesize = 2;
        int bee;
        Bundle b = getIntent().getExtras();
        if (b != null) {

            storagesize = b.getInt("Storage");
            retstorage = b.getInt("RetStorage");

            dictionaryOfMonsters = b.getBooleanArray("Dictionary");

            int i = 0;
            while (i < storagesize) {

                String DustMe = "Monster%s";
                String BustMe = String.format(DustMe, i);

                passedmonsters[i] = b.getParcelable(BustMe);

                //bee = (int) passedmonsters[i].Idnum;
            //    bee = bee;
            //    bee = bee;


                Gson gson = new Gson();
                String json = prefs.getString(BustMe, "");
                passedmonstersTwo[i] = gson.fromJson(json, protomon.monst.class);


                i++;

            }
        }


        int countthroughmonsters = 0;
        String DustMe = "%s";
        // String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));




      //  protomon.monst Passablemonster = new protomon.monst(monstlist(playerid)).clone();
        Intent i = new Intent();
        b.putInt("Storage", storagesize);
        b.putInt("RetStorage", retstorage);
        while (countthroughmonsters < storagesize){



            String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));
            b.putParcelable(BustMe, passedmonsters[countthroughmonsters]);




            Gson gson = new Gson();
            String json = gson.toJson(passedmonsters[countthroughmonsters]);
            editor.putString(BustMe, json);
            editor.apply();

            countthroughmonsters++;
        }


        i.putExtra("Dictionary", dictionaryOfMonsters);


        //   b.putParcelable("Monster", Passablemonster);




        i.putExtras(b);
        i.setClass(this, StorageSwap.class);



        //  Intent go = new Intent(this, GarlitosLab.class);
        //   startActivity(go);

        startActivity(i);
    }

    public void CustomMonsterTop() {
        Intent go = new Intent(this, CustomMonsterTopLayer.class);
        startActivity(go);
    }
    public void DynamicsStart() {
        Intent go = new Intent(this, PopulationDynamics.class);
        startActivity(go);
    }
    public void onResume() {
        super.onResume();
        activityopemer = 0;
    }
}

