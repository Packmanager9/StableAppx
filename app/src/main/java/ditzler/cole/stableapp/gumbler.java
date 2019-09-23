package ditzler.cole.stableapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class gumbler extends AppCompatActivity {




    protected void onPause() {
        super.onPause();
        GumbleTrackPlayer.pause();
    }


    protected void onResume() {
        if ((sound % 2) == 1) {
            super.onResume();
            GumbleTrackPlayer.setLooping(true);
            GumbleTrackPlayer.start();


        } else {
            super.onResume();
            GumbleTrackPlayer.pause();
        }
    }
    private EditText editTextBox;
    Button Mutes;
    int sound = 1;
    double omgfuckit;
    MediaPlayer GumbleTrackPlayer;
    int switchercounter = 0;

    TextView ColorCircle;
    TextView SmallCircle;
    TextView BigCircle;
    int counter;
    public String moneyshower = "Money $%s";
    int betcounter;
    int Turns;
    int Turn = 1;
    Button button;
    Button betA;
    Button play;
    Button betB;
    Button betC;
    Button betD;
    private ImageView betredindicator;
    private ImageView betblueindicator;
    private ImageView betgreenindicator;
    private ImageView betblackindicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GumbleTrackPlayer = MediaPlayer.create(this, R.raw.gumbler);
        GumbleTrackPlayer.setLooping(true);
        GumbleTrackPlayer.start();
        setContentView(R.layout.activity_gumbler);
        Intent intent = getIntent();
        double Monet = intent.getDoubleExtra("Money", 99);
        final String MONAE = String.format(moneyshower, Monet);

     //   Bundle extras = getIntent().getExtras();
     //   double Monet = extras.getDouble("Money", 0);
        Mutes = (Button) findViewById((R.id.mute));
        betA = (Button) findViewById((R.id.BetA));
        betB = (Button) findViewById((R.id.BetB));
        betC = (Button) findViewById((R.id.BetC));
        betD = (Button) findViewById((R.id.BetD));
        play = (Button) findViewById((R.id.Play));
        final TextView A = (TextView) findViewById(R.id.gameoutput);
        final TextView B = (TextView) findViewById(R.id.moneyview);
        betblackindicator = (ImageView) findViewById(R.id.BetBlackIndicator);
        betblueindicator = (ImageView) findViewById(R.id.BetBlueIndicator);
        betredindicator = (ImageView) findViewById(R.id.BetRedIndicator);
        betgreenindicator = (ImageView) findViewById(R.id.BetGreenIndicator);


        Mutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((sound % 2) == 1) {
                    sound = sound + 1;
                    if (GumbleTrackPlayer.isPlaying()) {
                        GumbleTrackPlayer.pause();
                    }
                } else {
                    if (!GumbleTrackPlayer.isPlaying()) {
                        sound = sound + 1;
                        GumbleTrackPlayer.setLooping(true);
                        GumbleTrackPlayer.start();

                    }
                }

            }

        });

        betA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betcounter = 1;

                betblackindicator.setVisibility(View.INVISIBLE);
                betblueindicator.setVisibility(View.INVISIBLE);
                betredindicator.setVisibility(View.INVISIBLE);
                betgreenindicator.setVisibility(View.VISIBLE);


            }
        });

        betB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betcounter = 2;

                betblackindicator.setVisibility(View.INVISIBLE);
                betblueindicator.setVisibility(View.INVISIBLE);
                betredindicator.setVisibility(View.VISIBLE);
                betgreenindicator.setVisibility(View.INVISIBLE);
            }
        });

        betC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betcounter = 3;

                betblackindicator.setVisibility(View.INVISIBLE);
                betblueindicator.setVisibility(View.VISIBLE);
                betredindicator.setVisibility(View.INVISIBLE);
                betgreenindicator.setVisibility(View.INVISIBLE);

            }
        });

        betD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betcounter = 4;

                betblackindicator.setVisibility(View.VISIBLE);
                betblueindicator.setVisibility(View.INVISIBLE);
                betredindicator.setVisibility(View.INVISIBLE);
                betgreenindicator.setVisibility(View.INVISIBLE);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                EditText editTextBox = (EditText) findViewById(R.id.editTextBox);
                String bant = editTextBox.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    editTextBox.setError("input required");
                    return;
                }
                double BuyAmount = Double.parseDouble(String.valueOf(editTextBox.getText()));
                final String BuyAmountS = String.format(moneyshower, BuyAmount);
                if (TextUtils.isEmpty(BuyAmountS)) {
                    editTextBox.setError("input required");
                    return;
                }

                int cowheads = new Random().nextInt(4) + 1;


                String colorsmall = "#FF0000";
                String color = "#AAFF00";
                String colorbig = "#00FF00";



                    colorcontroller(cowheads);
                    counter = 0;




if (switchercounter == 0) {
    switchercounter = switchercounter + 1;
    Intent intent = getIntent();
    double Monet = intent.getDoubleExtra("Money", 99);



if (betcounter != 0) {
    if (betcounter == cowheads) {
        if (BuyAmount <= Monet) {
            Monet = Monet + (BuyAmount*3);
            A.setText("You Won!");
        } else {
            Monet = Monet * 4;
            A.setText("You Won!");
        }
    } else {
        if (BuyAmount <= Monet) {
            Monet = Monet - BuyAmount;
        } else {
            Monet = Monet * 0;
        }
        A.setText("You Lost");

    }
}

    /*
        switch (betcounter) {
            case 1:
                if (cowheads == 1) {
                    if (BuyAmount <= Monet) {
                        Monet = Monet + BuyAmount;
                        A.setText("You Won");
                    } else {
                        Monet = Monet * 2;
                        A.setText("You Won");
                    }
                } else {
                    if (BuyAmount <= Monet) {
                        Monet = Monet - BuyAmount;
                    } else {
                        Monet = Monet * 0;
                    }
                    A.setText("You Lost");
                }
                break;
            case 2:
                if (cowheads == 2) {
                    if (BuyAmount <= Monet) {
                        Monet = Monet + BuyAmount;
                        A.setText("You Won");
                    } else {
                        Monet = Monet * 2;
                        A.setText("You Won");
                    }
                } else {

                    if (BuyAmount <= Monet) {
                        Monet = Monet - BuyAmount;
                    } else {
                        Monet = Monet * 0;
                    }
                    A.setText("You Lost");
                }
            case 3:
                if (cowheads == 3) {
                    if (BuyAmount <= Monet) {
                        Monet = Monet + BuyAmount;
                        A.setText("You Won");
                    } else {
                        Monet = Monet * 2;
                        A.setText("You Won");
                    }
                } else {

                    if (BuyAmount <= Monet) {
                        Monet = Monet - BuyAmount;
                    } else {
                        Monet = Monet * 0;
                    }
                    A.setText("You Lost");
                }
                break;
            case 4:
                if (cowheads == 4) {
                    if (BuyAmount <= Monet) {
                        Monet = Monet + BuyAmount;
                        A.setText("You Won");
                    } else {
                        Monet = Monet * 2;
                        A.setText("You Won");
                    }
                } else {

                    if (BuyAmount <= Monet) {
                        Monet = Monet - BuyAmount;
                    } else {
                        Monet = Monet * 0;
                    }
                    A.setText("You Lost");
                }
                break;
        }
    */


    Monet = Monet*100;
    Monet = Math.round(Monet);
    Monet = Monet/100;
                String MoneeDisplay = String.format(moneyshower, Monet);
                B.setText(MoneeDisplay);
                omgfuckit = Monet;
                onswackPressed(Monet);
          
          
            }else {
    if (betcounter != 0) {
    if (betcounter == cowheads) {
        if (BuyAmount <= omgfuckit) {
            omgfuckit = omgfuckit + (BuyAmount*3);
            A.setText("You Won!");
        } else {
            omgfuckit = omgfuckit * 4;
            A.setText("You Won!");
        }
    } else {
        if (BuyAmount <= omgfuckit) {
            omgfuckit = omgfuckit - BuyAmount;
        } else {
            omgfuckit = omgfuckit * 0;
        }
        A.setText("You Lost");
    }
    }
/*
    switch(betcounter) {
        case 1:
            if (cowheads == 1){
                if (BuyAmount <= omgfuckit) {
                    omgfuckit = omgfuckit + BuyAmount;
                    A.setText("You Won");
                }else{
                    omgfuckit = omgfuckit * 2;
                    A.setText("You Won");
                }
            }else {
                if (BuyAmount <= omgfuckit) {
                    omgfuckit = omgfuckit - BuyAmount;
                }else{
                    omgfuckit = omgfuckit * 0;
                }
                A.setText("You Lost");
            }
            break;
        case 2:
            if (cowheads == 2) {
                if (BuyAmount <= omgfuckit) {
                    omgfuckit = omgfuckit + BuyAmount;
                    A.setText("You Won");
                }else{
                    omgfuckit = omgfuckit * 2;
                    A.setText("You Won");
                }
            } else {

                if (BuyAmount <= omgfuckit) {
                    omgfuckit = omgfuckit - BuyAmount;
                }else{
                    omgfuckit = omgfuckit * 0;
                }
                A.setText("You Lost");
            }
            break;
    } */
    omgfuckit = omgfuckit*100;
    omgfuckit = Math.round(omgfuckit);
    omgfuckit = omgfuckit/100;
    String MoneeDisplay = String.format(moneyshower, omgfuckit);
    B.setText(MoneeDisplay);
    onswackPressed(omgfuckit);
            }
        }
        });
    }

    public void colorcontroller(int cowheads){
        String colorsmall = "#FF0000";
        String color = "#AAFF00";
        String colorbig = "#00FF00";
        if (counter < (1004+cowheads)){
            colorcontrollerrecurse(cowheads);
            counter = counter + 1;
        }else { /*
            if (cowheads == 1) {
                BigCircle = (TextView) findViewById(R.id.circleBig);
                BigCircle.setTextColor(android.graphics.Color.parseColor(colorbig));
                BigCircle.setText("○");
                counter = 1;
            } else if (cowheads == 2) {
                BigCircle = (TextView) findViewById(R.id.circleBig);
                BigCircle.setTextColor(android.graphics.Color.parseColor(colorsmall));
                BigCircle.setText("○");
                counter = 0;
            } */
            counter = new Random().nextInt(47);
        }


    }
    public void colorcontrollerrecurse(int cowheads){
        String colorsmall = "#FF0000";
        String color = "#0000FF";
        String colorbig = "#00FF00";
        String colorblack = "#000000";
        if ((counter %4) == 0){
            BigCircle = (TextView) findViewById(R.id.circleBig);
            BigCircle.setTextColor(android.graphics.Color.parseColor(colorbig));
            BigCircle.setText("○");
            counter = counter + 1;
        }else if ((counter %4) == 1){
            BigCircle = (TextView) findViewById(R.id.circleBig);
            BigCircle.setTextColor(android.graphics.Color.parseColor(colorsmall));
            BigCircle.setText("○");
            counter = counter + 1;
        }else if ((counter %4) == 2){
            BigCircle = (TextView) findViewById(R.id.circleBig);
            BigCircle.setTextColor(android.graphics.Color.parseColor(color));
            BigCircle.setText("○");
            counter = counter + 1;
        }else if ((counter %4) == 3){
            BigCircle = (TextView) findViewById(R.id.circleBig);
            BigCircle.setTextColor(android.graphics.Color.parseColor(colorblack));
            BigCircle.setText("○");
            counter = counter + 1;
        }
        colorcontroller(cowheads);
    }

    public void onswackPressed(double Monee){

        Intent q = new Intent();
        q.putExtra("Monet", Monee);
        setResult(RESULT_OK, q);
    }

    public void onBackPressed(double Monee){

        Intent q = new Intent();
        q.putExtra("Monet", Monee);
        setResult(RESULT_OK, q);
        finish();
    }


}
