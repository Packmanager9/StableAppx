package ditzler.cole.stableapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;

public class CustomMonsterTopLayer extends AppCompatActivity {

    Button StatAdjust, MoveAdjust, SpriteAdjust, ColorAdjust, FinishActivity, Namer;
    EditText TypeName;
    double health, speed, attack, defense, moveslotheal, moveslotattack, moveslotdefense, moveslotspeed;
    TextView Health, Defense, Attack, Speed;
    String  Hs  = "Health %.0f";
    String  Ss  = "Speed %.0f";
    String  Ds  = "Defense %.0f";
    String  As  = "Attack %.0f";
    String empty = "";
    String NamePass = "";
    ImageView CustomWindowTop;


    public static class StringObject implements Cloneable, Parcelable, Serializable {


        public String NameString;


        public StringObject (String namestring){
            NameString = namestring;
        }

        protected StringObject(Parcel in) {
        }

        public static final Creator<StringObject> CREATOR = new Creator<StringObject>() {
            @Override
            public StringObject createFromParcel(Parcel in) {
                return new StringObject(in);
            }

            @Override
            public StringObject[] newArray(int size) {
                return new StringObject[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
        }
    }


    public static class monst implements Cloneable, Parcelable, Serializable {

        public double Idnum;
        public double Speed;
        public double Attack;
        public double Defense;
        public double Health;
        public int Moveslotattack;
        public int Moveslotspeed;
        public int Moveslotdefense;
        public int Moveslotheal;
        public int UniqueID;

        public monst (double idnum, double speed, double attack, double defense, double health, int moveslotattack, int moveslotspeed, int moveslotdefense, int moveslotheal, int uniqueID){

            Idnum = idnum;
            Speed = speed;
            Attack = attack;
            Defense = defense;
            Health = health;
            Moveslotattack = moveslotattack;
            Moveslotspeed = moveslotspeed;
            Moveslotdefense = moveslotdefense;
            Moveslotheal = moveslotheal;
            UniqueID = uniqueID;
        }

        public monst (protomon.monst monst){

            this.Idnum = monst.Idnum;
            this.Speed = monst.Speed;
            this.Attack = monst.Attack;
            this.Defense = monst.Defense;
            this.Health = monst.Health;
            this.Moveslotattack = monst.Moveslotattack;
            this.Moveslotspeed = monst.Moveslotspeed;
            this.Moveslotdefense = monst.Moveslotdefense;
            this.Moveslotheal = monst.Moveslotheal;
            this.UniqueID = monst.UniqueID;
        }

        protected monst(Parcel in) {
            Idnum = in.readDouble();
            Speed = in.readDouble();
            Attack = in.readDouble();
            Defense = in.readDouble();
            Health = in.readDouble();
            Moveslotattack = in.readInt();
            Moveslotspeed = in.readInt();
            Moveslotdefense = in.readInt();
            Moveslotheal = in.readInt();
            UniqueID = in.readInt();
        }

        public static final Creator<protomon.monst> CREATOR = new Creator<protomon.monst>() {
            @Override
            public protomon.monst createFromParcel(Parcel in) {
                return new protomon.monst(in);
            }

            @Override
            public protomon.monst[] newArray(int size) {
                return new protomon.monst[size];
            }
        };

        public protomon.monst clone() throws CloneNotSupportedException {
            protomon.monst clonedmonster = (protomon.monst) super.clone();
            return clonedmonster;
        }

        @Override
        public int describeContents() {
            return (int)Idnum;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeDouble(Idnum);
            dest.writeDouble(Speed);
            dest.writeDouble(Attack);
            dest.writeDouble(Defense);
            dest.writeDouble(Health);
            dest.writeInt(Moveslotattack);
            dest.writeInt(Moveslotspeed);
            dest.writeInt(Moveslotdefense);
            dest.writeInt(Moveslotheal);
            dest.writeInt(UniqueID);
        }
    }

    protomon.monst Customizer = new protomon.monst(91,speed,attack,defense,health,0,0,0,0,0);


    StringObject NameObject = new StringObject("");

    protected void onResume() {
        super.onResume();
        StatsReturn();
        DisplayChangesToStats();
    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monster_customizer_top_activity);

        StatAdjust = (Button) findViewById(R.id.StatsActivity);
        ColorAdjust = (Button) findViewById(R.id.ColorActivity);
        SpriteAdjust = (Button) findViewById(R.id.PictureActivity);
        Namer = (Button) findViewById(R.id.EnterNames);
        TypeName = (EditText) findViewById(R.id.TextNames);
        MoveAdjust = (Button) findViewById(R.id.MovesActivity);
        FinishActivity = (Button) findViewById(R.id.Finish);
        Health =(TextView) findViewById(R.id.Health);
        Speed =(TextView) findViewById(R.id.Speed);
        Attack =(TextView) findViewById(R.id.Attack);
        Defense =(TextView) findViewById(R.id.Defense);
        CustomWindowTop =(ImageView) findViewById(R.id.CustomWindowTop);


        StatsReturn();
        DisplayChangesToStats();




        Namer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bant = TypeName.getText().toString();
                if((!TextUtils.isEmpty(bant))) {
                    NamePass = bant;
                    NameObject.NameString = NamePass;
                }
                TypeName.setText("");
            }
        });




        StatAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatsDelve();

                StatsReturn();
                DisplayChangesToStats();

            }
        });

        ColorAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageReturn();
                StatsReturn();
            }
        });

        SpriteAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpriteDelve();
            }
        });

        MoveAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        FinishActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onSmackPressed(Customizer);

            }

            public void onSmackPressed(protomon.monst Monster){


                if ((Monster.Attack*Monster.Speed*Monster.Health*Monster.Defense) <= 0){



                }else {




                    String DustMe = "%s";
                    Context ProtomonContext = getApplicationContext();

                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();

                    Gson gson = new Gson();

                    String json = gson.toJson(Customizer);
                    editor.putString("WorkingMonster", json);
                    String jsonname = gson.toJson(NameObject);
                    editor.putString("Name", jsonname);
                    editor.commit();


                    Intent F = new Intent(CustomMonsterTopLayer.this, protomon.class);
                    String keyIdentifer  = "Name";


                    Bundle extras = new Bundle();
                    extras.putString("Name", keyIdentifer);
                    F.putExtras(extras);

                    //F.putExtras(NamePass, keyIdentifer );
                 //   Bundle b = new Bundle();
                  //  b.putParcelable("WorkingMonster", Customizer);
                  // b.putParcelable("WorkingMonster", new protomon.monst(83, attack, speed, defense, health, 0, 0, 0, 0, 0));

                    setResult(420, F);
                    finish();
                }
            }

        });


    }

    public void DisplayChangesToStats(){
        empty = String.format(Hs, Customizer.Health);
        Health.setText(empty);
        empty = String.format(Ss, Customizer.Speed);
        Speed.setText(empty);
        empty = String.format(Ds, Customizer.Defense);
        Defense.setText(empty);
        empty = String.format(As, Customizer.Attack);
        Attack.setText(empty);
    }



    public void StatsDelve() {
        Intent go = new Intent(this, StatAdjustments.class);
        startActivity(go);
    }
    public void SpriteDelve() {
        Intent go = new Intent(this, SpriteAdjustments.class);
        startActivity(go);
    }

    public void StatsReturn() {
        String DustMe = "%s";
        String BustMe = "%s";
        Context ProtomonContext = getApplicationContext();


        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();


        String TrustMe = String.format("CustomSlotX");
        Gson gson = new Gson();
        String jsonX = gson.toJson(Customizer);
        editor.putString(TrustMe, jsonX);
        editor.commit();



        //Gson gson = new Gson();
        String json = prefs.getString("CustomSlot", "");
        Intent i = new Intent();
        Bundle b = new Bundle();
        if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
            Customizer = gson.fromJson(json, (Type) protomon.monst.class);
        }




        i.putExtras(b);
        i.setClass(this, GarlitosLab.class);
    }
    public void ImageReturn() {

        MemoryRefreshment();


            switch((int) Customizer.Idnum){

                case 0:
                    CustomWindowTop.setImageResource(R.drawable.errantnope);
                    break;
                case 1:
                    CustomWindowTop.setImageResource(R.drawable.kunk);
                    break;
                case 2:
                    CustomWindowTop.setImageResource(R.drawable.kohboh);
                    break;
                case 3:
                    CustomWindowTop.setImageResource(R.drawable.djoper);
                    break;
                case 4:
                    CustomWindowTop.setImageResource(R.drawable.schorp);
                    break;
                case 5:
                    if (Customizer.UniqueID < 22000000) {
                        CustomWindowTop.setImageResource(R.drawable.zaume);
                    }else if(Customizer.UniqueID < 45000000) {
                        CustomWindowTop.setImageResource(R.drawable.zaumer);
                    }else if(Customizer.UniqueID < 70000000) {
                        CustomWindowTop.setImageResource(R.drawable.zaumeb);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.zaumeg);
                    }
                    break;
                case 6:
                    if (Customizer.UniqueID < 50000000) {
                        CustomWindowTop.setImageResource(R.drawable.nhainhai);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.nhainhaii);
                    }
                    break;
                case 7:
                    CustomWindowTop.setImageResource(R.drawable.degeissdt);
                    break;
                case 8:

                    if (Customizer.UniqueID < 22000000) {
                        CustomWindowTop.setImageResource(R.drawable.yuggle);
                    }else if(Customizer.UniqueID < 45000000) {
                        CustomWindowTop.setImageResource(R.drawable.yugglee);
                    }else if(Customizer.UniqueID < 70000000) {
                        CustomWindowTop.setImageResource(R.drawable.yugglet);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.yuggler);
                    }
                    break;
                case 9:
                    CustomWindowTop.setImageResource(R.drawable.bongu);
                    break;
                case 10:
                    //           //CustomWindowTop.setImageResource(R.drawable.giteriglia);
                    break;
                case 11:
                    //            //CustomWindowTop.setImageResource(R.drawable.cyosteroth);
                    break;
                case 12:
                    //CustomWindowTop.setImageResource(R.drawable.Nentopode);
                    break;
                case 13:
                    //CustomWindowTop.setImageResource(R.drawable.centiclak);
                    break;
                case 14:
                    //CustomWindowTop.setImageResource(R.drawable.Uggnawb);
                    break;
                case 15:
                    CustomWindowTop.setImageResource(R.drawable.grobhost);
                    break;
                case 16:
                    //CustomWindowTop.setImageResource(R.drawable.Illelonab);
                    break;
                case 17:
                    CustomWindowTop.setImageResource(R.drawable.rongzeed);
                    break;
                case 18:
                    //CustomWindowTop.setImageResource(R.drawable.blattle);
                    break;
                case 19:
                    //CustomWindowTop.setImageResource(R.drawable.Swogharnler);
                    break;
                case 20:
                    //CustomWindowTop.setImageResource(R.drawable.adenolish);
                    break;
                case 21:
                    //CustomWindowTop.setImageResource(R.drawable.Genaupresang);
                    break;
                case 22:

                    if (Customizer.UniqueID < 50000000) {
                        CustomWindowTop.setImageResource(R.drawable.daahnida);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.daahnidaa);
                    }
                    break;
                case 23:
                    //CustomWindowTop.setImageResource(R.drawable.Sorba);
                    break;
                case 24:
                    //CustomWindowTop.setImageResource(R.drawable.Jiyou);
                    break;
                case 25:
                    CustomWindowTop.setImageResource(R.drawable.sparvae);
                    break;
                case 26:
                    //CustomWindowTop.setImageResource(R.drawable.Vellup);
                    break;
                case 27:
                    //CustomWindowTop.setImageResource(R.drawable.bellaja);
                    break;
                case 28:
                    //CustomWindowTop.setImageResource(R.drawable.Levdzell);
                    break;
                case 29:
                    if (Customizer.UniqueID < 50000000) {
                        CustomWindowTop.setImageResource(R.drawable.ryteggg);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.rytegg);
                    }
                    break;
                case 30:
                    //CustomWindowTop.setImageResource(R.drawable.Flashmer);
                    break;
                case 31:
                    CustomWindowTop.setImageResource(R.drawable.schmodozer);
                    break;
                case 32:
                    //CustomWindowTop.setImageResource(R.drawable.Octgotot);
                    break;
                case 33:
                    CustomWindowTop.setImageResource(R.drawable.triaural);
                    break;
                case 34:
                    CustomWindowTop.setImageResource(R.drawable.dicyto);
                    break;
                case 35:
                    //CustomWindowTop.setImageResource(R.drawable.Monopteryx);
                    break;
                case 36:
                    //CustomWindowTop.setImageResource(R.drawable.Elastocark);
                    break;
                case 37:
                    //CustomWindowTop.setImageResource(R.drawable.Toobapath);
                    break;
                case 38:
                    //CustomWindowTop.setImageResource(R.drawable.Weeliosbop);
                    break;
                case 39:
                    CustomWindowTop.setImageResource(R.drawable.ihmpdrap);
                    break;
                case 40:
                    //CustomWindowTop.setImageResource(R.drawable.Epibazang);
                    break;
                case 41:
                    CustomWindowTop.setImageResource(R.drawable.hemtan);
                    break;
                case 42:
                    CustomWindowTop.setImageResource(R.drawable.ogo);
                    break;
                case 43:
                    CustomWindowTop.setImageResource(R.drawable.strachid);
                    break;
                case 44:
                    //CustomWindowTop.setImageResource(R.drawable.Toximastica);
                    break;
                case 45:
                    //CustomWindowTop.setImageResource(R.drawable.Urcuria);
                    break;
                case 46:
                    //CustomWindowTop.setImageResource(R.drawable.Hyuntress);
                    break;
                case 47:
                    //CustomWindowTop.setImageResource(R.drawable.Mondosplak);
                    break;
                case 48:
                    //CustomWindowTop.setImageResource(R.drawable.Kaheksaguge);
                    break;
                case 49:
                    CustomWindowTop.setImageResource(R.drawable.sapiosuant);
                    break;
                case 50:
                    CustomWindowTop.setImageResource(R.drawable.munegull);
                    break;
                case 51:
                    //CustomWindowTop.setImageResource(R.drawable.Sudakleez);
                    break;
                case 52:
                    CustomWindowTop.setImageResource(R.drawable.halocordate);
                    break;
                case 53:
                    CustomWindowTop.setImageResource(R.drawable.faedendron);
                    break;
                case 54:
                    CustomWindowTop.setImageResource(R.drawable.osteoplang);
                    break;
                case 55:
                    CustomWindowTop.setImageResource(R.drawable.zrachnid);
                    break;
                case 56:
                    //CustomWindowTop.setImageResource(R.drawable.Ϫlitch);
                    break;
                case 57:
                    CustomWindowTop.setImageResource(R.drawable.baa);
                    break;
                case 58:
                    //CustomWindowTop.setImageResource(R.drawable.Mantidile);
                    break;
                case 59:
                    //CustomWindowTop.setImageResource(R.drawable.Nokoyl);
                    break;
                case 60:
                    CustomWindowTop.setImageResource(R.drawable.yallod);
                    break;
                case 61:
                    CustomWindowTop.setImageResource(R.drawable.algaetizer);
                    break;
                case 62:
                    CustomWindowTop.setImageResource(R.drawable.kachort);
                    break;
                case 63:
                    if (Customizer.UniqueID < 22000000) {
                        CustomWindowTop.setImageResource(R.drawable.slamelion);
                    }else if(Customizer.UniqueID < 45000000) {
                        CustomWindowTop.setImageResource(R.drawable.slamelionb);
                    }else if(Customizer.UniqueID < 70000000) {
                        CustomWindowTop.setImageResource(R.drawable.slameliona);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.slamelion);
                    }
                    break;
                case 64:
                    //CustomWindowTop.setImageResource(R.drawable.ayateda);
                    break;
                case 65:
                    CustomWindowTop.setImageResource(R.drawable.wochem);
                    break;
                case 66:
                    //CustomWindowTop.setImageResource(R.drawable.Ƕmun);
                    break;
                case 67:
                    //CustomWindowTop.setImageResource(R.drawable.Ψkobath);
                    break;
                case 68:
                    //CustomWindowTop.setImageResource(R.drawable.Gytanic);
                    break;
                case 69:
                    CustomWindowTop.setImageResource(R.drawable.beis);
                    break;
                case 70:
                    //CustomWindowTop.setImageResource(R.drawable.gungholio);
                    break;
                case 71:
                    CustomWindowTop.setImageResource(R.drawable.honigkonig);
                    break;
                case 72:
                    //CustomWindowTop.setImageResource(R.drawable.Kungulp);
                    break;
                case 73:
                    CustomWindowTop.setImageResource(R.drawable.satinella);
                    break;
                case 74:
                    CustomWindowTop.setImageResource(R.drawable.elocurl);
                    break;
                case 75:
                    CustomWindowTop.setImageResource(R.drawable.takobie);
                    break;
                case 76:
                    CustomWindowTop.setImageResource(R.drawable.obchovy);
                    break;
                case 77:
                    //CustomWindowTop.setImageResource(R.drawable.Nimnamnom);
                    break;
                case 78:
                    CustomWindowTop.setImageResource(R.drawable.tutewtoo);
                    break;
                case 79:
                    CustomWindowTop.setImageResource(R.drawable.blanqast);
                    break;
                case 80:
                    //CustomWindowTop.setImageResource(R.drawable.Indeo);
                    break;
                case 81:
                    //CustomWindowTop.setImageResource(R.drawable.deblobbio);
                    break;
                case 82:
                    CustomWindowTop.setImageResource(R.drawable.knightstacean);
                    break;
                case 83:
                    CustomWindowTop.setImageResource(R.drawable.prostrax);
                    break;

                case 84:
                    CustomWindowTop.setImageResource(R.drawable.haptozahen);
                    break;


                case 85:
                    CustomWindowTop.setImageResource(R.drawable.minkohabod);
                    break;



                case 86:
                    CustomWindowTop.setImageResource(R.drawable.zeen);
                    break;


                case 91:
                    if (Customizer.UniqueID < 22000000) {
                        CustomWindowTop.setImageResource(R.drawable.firstcustom);
                    }else if(Customizer.UniqueID < 45000000) {
                        CustomWindowTop.setImageResource(R.drawable.firstcustoma);
                    }else if(Customizer.UniqueID < 70000000) {
                        CustomWindowTop.setImageResource(R.drawable.firstcustomb);
                    }else {
                        CustomWindowTop.setImageResource(R.drawable.firstcustomc);
                    }
                    break;

            }


        }

        public void MemoryRefreshment(){
            Context ProtomonContext = getApplicationContext();
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
            SharedPreferences.Editor editor = prefs.edit();
            Gson gson = new Gson();
            //Gson gson = new Gson();
            String json = prefs.getString("CustomSlotSprite", "");
            Intent i = new Intent();
            Bundle b = new Bundle();
            if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                protomon.monst dust = gson.fromJson(json, (Type) protomon.monst.class);
                Customizer.UniqueID = dust.UniqueID;
            }


           json = prefs.getString("CustomSlotX", "");
            if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                protomon.monst dust = gson.fromJson(json, (Type) protomon.monst.class);
                Customizer.Attack = dust.Attack;
                Customizer.Health = dust.Health;
                Customizer.Speed = dust.Speed;
                Customizer.Defense = dust.Defense;
            }
        }

}
