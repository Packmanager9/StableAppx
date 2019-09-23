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
import android.widget.ImageView;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Random;

public class SpriteAdjustments extends AppCompatActivity {


    Button NextButton, LastButton, Select;
    ImageView CustomWindow;

    int spritestorage = 0;
    int spritemax = 3;
    protomon.monst Workable;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monster_customizer_sprite_activity);
        CustomWindow = (ImageView) findViewById(R.id.CustomizerWindow);
        NextButton = (Button) findViewById(R.id.nextmonster);
        LastButton = (Button) findViewById(R.id.lastmonster);
        Select = (Button) findViewById(R.id.SelectMonster);


        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Gson gson = new Gson();
        String jsonY = prefs.getString("CustomSlotX", "");
        if (gson.fromJson(jsonY, (Type) protomon.monst.class) != null) {
            Workable = (gson.fromJson(jsonY, (Type) protomon.monst.class));
        }





        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            spritestorage++;
            FirstCustomMethod();
                FirstCustomImageMethod ();
            }
        });


        LastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spritestorage--;
                FirstCustomMethod();
                FirstCustomImageMethod ();
            }
        });

        Select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String TrustMe = String.format("CustomSlotSprite");
                Gson gson = new Gson();
                String jsonX = gson.toJson(Workable);
                editor.putString(TrustMe, jsonX);
                editor.apply();

                finish();
            }
        });



    }

 public void   FirstCustomMethod() {

     if (spritestorage < 0) {
         spritestorage = 0;
     }

     if (spritestorage > spritemax) {
         spritestorage = spritemax;
     }

     if (spritestorage == 0) {
         Workable.UniqueID = new Random().nextInt(22000000) + spritestorage;
     }

     if (spritestorage == 1) {
         Workable.UniqueID = new Random().nextInt(21000000) + 22000000;
     }

     if (spritestorage == 2) {
         Workable.UniqueID = new Random().nextInt(25000000) + 45000000;
     }

     if (spritestorage == 3) {
         Workable.UniqueID = new Random().nextInt(30000000) + 70000000;
     }
 }


     public void FirstCustomImageMethod () {

         if (Workable.UniqueID < 22000000) {
             CustomWindow.setImageResource(R.drawable.firstcustom);
         } else if (Workable.UniqueID < 45000000) {
             CustomWindow.setImageResource(R.drawable.firstcustoma);
         } else if (Workable.UniqueID < 70000000) {
             CustomWindow.setImageResource(R.drawable.firstcustomb);
         } else {
             CustomWindow.setImageResource(R.drawable.firstcustomc);
         }
     }



 }


