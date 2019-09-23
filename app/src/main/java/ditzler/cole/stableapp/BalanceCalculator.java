package ditzler.cole.stableapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class BalanceCalculator extends AppCompatActivity {

    MediaPlayer HappyTrackPlayer;
    int sound = 1;
    String notechar = "";
    String notechart = "%s,%s,%s,%s";
    TextView AView;
    Button AButton, Mute;
    int attack = 60;
    int speed = 60;
    int defense = 60;
    int health = 60;
    int countertimer;
    String Eggstring = "";
    String Eggstringss = "%s,";
    String Eggstrings = "%.0f,";
    double HappinessCounter = 0;
    double currentvalue = 0;
    double HappinessCounteress = 0;
    int Magicalpowercounter = 2;
    int seriousbuisness;
    int needstobeeight;
    int lazybuisness;
    double Base = 60;
    double BaseTwo = Base*Base;
    double BaseThree = Base*Base*Base;
    double BaseFour = Base*Base*Base*Base;
    double BaseFive = Base*Base*Base*Base*Base;
    double BaseSix = Base*Base*Base*Base*Base*Base;
    int[] sanddancerset = new int[999999];

    int[] stats = new int [5];

    private Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
    private Integer Emagos[] = {R.drawable.noerrorsmall, R.drawable.errorsmall,};





    protected void onPause(){
        super.onPause();
        HappyTrackPlayer.pause();
    }
    protected void onResume(){
        if ((sound%2) == 1) {
            // if (Victory > 0){
            //  super.onResume();
            //  VictoryMusic.setLooping(true);
            //  VictoryMusic.start();
            //  }else {
            super.onResume();
            HappyTrackPlayer.setLooping(true);
            HappyTrackPlayer.start();


        }else {
            super.onResume();
            // VictoryMusic.pause();
            HappyTrackPlayer.pause();
        }
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happylayout);
        HappyTrackPlayer = MediaPlayer.create(this, R.raw.happysequence);
        HappyTrackPlayer.setLooping(true);
        HappyTrackPlayer.start();

        AView = (TextView) findViewById(R.id.TextViewA);

        AButton = (Button) findViewById(R.id.ButtonA);

        Mute = (Button) findViewById(R.id.HappyMute);


        Mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((sound%2) == 1) {
                    sound = sound + 1;
                    if (HappyTrackPlayer.isPlaying()) {
                        HappyTrackPlayer.pause();
                    }
                }else {
                    if (!HappyTrackPlayer.isPlaying()/* && Victory < 1*/) {
                        sound = sound + 1;
                        HappyTrackPlayer.start();
                    }
                }
            }
        });


        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // AButton.setVisibility(View.INVISIBLE);


                attack = new Random().nextInt(100); // make these randoms?
                speed = new Random().nextInt(100);
                health = new Random().nextInt(100);
                defense = new Random().nextInt(100);

                for(countertimer = 0;!(((attack*defense*speed*health) > 90000000) && ((attack*defense*speed*health) < 111000000) || countertimer > 1000) ;countertimer++){

                    int Decider = new Random().nextInt(4);

                    switch (Decider){

                        case 0:
                            attack++;
                            break;
                        case 1:
                            speed++;
                            break;
                        case 2:
                            defense++;
                            break;
                        case 3:
                            health++;
                            break;
                    }



                }

                int T = new Random().nextInt(210000000) + 900000000;

                stats[0] = new Random().nextInt(411)+51;

              //  stats[1] = new Random().nextInt((int)(Math.ceil(T/stats[0])))



                Eggstring =  String.format(Eggstring + String.format(notechart, health, defense, attack, speed)) + "\n";       //   countertimer++;
                /*
                for(attack = 60; ((attack*defense*speed*health) < 100000000) && countertimer < 100; attack++){
                    for(defense = 60; ((attack*defense*speed*health) < 100000000) && countertimer < 100; defense++){
                        for(speed = 60;((attack*defense*speed*health) < 100000000) && countertimer < 100; speed++) {
                            for (health = 60; ((attack*defense*speed*health) < 100000000) && countertimer < 100; health++) {


                            }
                        }
                    }
                    Eggstring =  String.format(Eggstring + String.format(notechart, health, defense, attack, speed)) + "\n";       //   countertimer++;
                }
*/

AView.setText(Eggstring);
            }
        });

    }
}