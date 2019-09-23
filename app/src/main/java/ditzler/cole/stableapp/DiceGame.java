package ditzler.cole.stableapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DiceGame extends AppCompatActivity {


    protected void onPause(){
        super.onPause();
        DiceTrackPlayer.pause();
        //  VictoryMusic.pause();
    }


   protected void onResume(){
        if ((sound%2) == 1) {
            // if (Victory > 0){
            //  super.onResume();
            //  VictoryMusic.setLooping(true);
            //  VictoryMusic.start();
            //  }else {
            super.onResume();
            DiceTrackPlayer.setLooping(true);
            DiceTrackPlayer.start();


        }else {
            super.onResume();
            // VictoryMusic.pause();
            DiceTrackPlayer.pause();
        }
    }
    Button Mutes;
    int stupiditycounter = 1;
    int stupiditycountercounter = 0;
    int sound = 1;
    MediaPlayer DiceTrackPlayer;
    int prospectiveOne = 0;
    int wholeOne = 0;
    int prospectiveTwo = 0;
    int wholeTwo = 0;
    int playerOneScore = 0;
    int playerTwoScore = 0;
    int Turns;
    int Turn = 1;
    Button button;
    Button Go;
    Button Stay;
    Button NyxtGame;
    private ImageView ImagePlayerOne;
    private ImageView ImagePlayerTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        DiceTrackPlayer = MediaPlayer.create(this, R.raw.biggersecrettrack);
        DiceTrackPlayer.setLooping(true);
        DiceTrackPlayer.start();

        setContentView(R.layout.activity_dice);
        ImagePlayerOne = (ImageView) findViewById(R.id.imageView);
        ImagePlayerTwo = (ImageView) findViewById(R.id.imageView2);
        NyxtGame = (Button) findViewById(R.id.NyxtGame);
        ImagePlayerOne.setVisibility(View.INVISIBLE);
        NyxtGame.setVisibility(View.INVISIBLE);
        Mutes = (Button) findViewById((R.id.mute));
        Go = (Button) findViewById((R.id.button));
        Stay = (Button) findViewById(R.id.button2);


        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playerOneScore < 100 && playerTwoScore < 100){
                    //displayTurn();
                    ChangeTurns();
                    displayScoreMethod(wholeOne);
                    displayScoreTwoMethod(wholeTwo);
                    absolutechaos();
                    }else{
                    displayVictoryMethod();

                }







            }
            public int ChangeTurns(){
                int roll = RandomRoll();
                if((Turn%2) ==1){
                    if (roll == 0){
                        prospectiveOne = 0;
                        wholeOne = prospectiveOne + playerOneScore;
                        playerOneScore = (wholeOne - prospectiveOne);
                      //  ImagePlayerOne.setVisibility(View.VISIBLE);
                      //  ImagePlayerTwo.setVisibility(View.INVISIBLE);
                        Turn = Turn + 1;
                        AITurn();
                        displayPlayerRollOne(roll);
                        return Turn%2;
                    }else{

                        prospectiveOne = prospectiveOne + roll;
                        wholeOne = prospectiveOne + playerOneScore;
                        playerOneScore = (wholeOne - prospectiveOne);
                        Stay.setVisibility(View.VISIBLE);
                        displayPlayerRollOne(roll);
                        return Turn%2;
                    }
                }else{
                    Turn = Turn + 1;
                    return Turn%2;
                }
            }
            public void displayScoreMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView);
                A.setText("" + T);
            }
            public void displayScoreTwoMethod(int T) {
                TextView A = (TextView) findViewById(R.id.textView2);
                A.setText("" + T);
            }




            public void displayTurn() {
                if ((Turn%2) == 1){
                    ImagePlayerOne.setVisibility(View.INVISIBLE);
                    ImagePlayerTwo.setVisibility(View.VISIBLE);

                }else{
                    ImagePlayerOne.setVisibility(View.VISIBLE);
                    ImagePlayerTwo.setVisibility(View.INVISIBLE);
                }

            }
            public int RandomRoll() {

                return (int) new Random().nextInt(6);
            }

            public void absolutechaos() {
                stupiditycountercounter = stupiditycountercounter +1;
                if (stupiditycounter != 50 && stupiditycountercounter <= 10000){
                    absolutechaosrecursion();
                }else {
                    TextView A = (TextView) findViewById(R.id.textView3);
                    A.setText("ran " + stupiditycountercounter);
                }

            }
            public void absolutechaosrecursion() {
                int gogocounter = 1;
                int gocounter = 0;
                int iffer = 100 - stupiditycounter;

                if (iffer == 99 || iffer ==  1){
                    gogocounter = 2;
                    gocounter = 0;
                } else if (iffer == 98 || iffer == 2){
                    gogocounter = 3;
                    gocounter = 1;
                } else if (iffer == 97 || iffer == 3){
                    gogocounter = 3;
                    gocounter = 1;
                } else if (iffer == 96 || iffer == 4){
                    gogocounter = 5;
                    gocounter = 2;
                } else if (iffer == 95 || iffer == 5){
                    gogocounter = 5;
                    gocounter = 2;
                } else if (iffer == 94 || iffer == 6){
                    gogocounter = 7;
                    gocounter = 3;
                }else if (iffer == 93 || iffer == 7){
                    gogocounter = 7;
                    gocounter = 3;
                } else if (iffer == 92 || iffer == 8){
                    gogocounter = 9;
                    gocounter = 4;
                } else if (iffer == 91 || iffer == 9){
                    gogocounter = 9;
                    gocounter = 4;
                } else if (iffer == 90 || iffer == 10){
                    gogocounter = 11;
                    gocounter = 5;
                } else if (iffer == 89 || iffer == 11){
                    gogocounter = 11;
                    gocounter = 5;
                }else if (iffer == 88 || iffer == 12){
                    gogocounter = 13;
                    gocounter = 6;
                } else if (iffer == 87 || iffer == 13){
                    gogocounter = 13;
                    gocounter = 6;
                } else if (iffer == 86 || iffer == 14){
                    gogocounter = 15;
                    gocounter = 7;
                } else if (iffer == 85 || iffer == 15){
                    gogocounter = 15;
                    gocounter = 7;
                } else if (iffer == 84 || iffer == 16) {
                    gogocounter = 17;
                    gocounter = 8;
                } else if (iffer == 83 || iffer == 17){
                    gogocounter = 17;
                    gocounter = 8;
                } else if (iffer == 82 || iffer == 18){
                    gogocounter = 19;
                    gocounter = 9;
                } else if (iffer == 81 || iffer == 19){
                    gogocounter = 19;
                    gocounter = 9;
                } else if (iffer == 80 || iffer == 20){
                    gogocounter = 21;
                    gocounter = 10;
                } else if (iffer == 79 || iffer == 21){
                    gogocounter = 21;
                    gocounter = 10;
                }else if (iffer == 78 || iffer == 22){
                    gogocounter = 23;
                    gocounter = 11;
                } else if (iffer == 77 || iffer == 23){
                    gogocounter = 23;
                    gocounter = 11;
                } else if (iffer == 76 || iffer == 24){
                    gogocounter = 25;
                    gocounter = 12;
                } else if (iffer == 75 || iffer == 25){
                    gogocounter = 25;
                    gocounter = 12;
                } else if (iffer == 74 || iffer == 26){
                    gogocounter = 27;
                    gocounter = 13;
                } else if (iffer == 73 || iffer == 27){
                    gogocounter = 27;
                    gocounter = 13;
                } else if (iffer == 72 || iffer == 28){
                    gogocounter = 29;
                    gocounter = 14;
                } else if (iffer == 71 || iffer == 29){
                    gogocounter = 29;
                    gocounter = 14;
                } else if (iffer == 70 || iffer == 30){
                    gogocounter = 31;
                    gocounter = 15;
                } else if (iffer == 69 || iffer == 31){
                    gogocounter = 31;
                    gocounter = 15;
                } else if (iffer == 68 || iffer == 32){
                    gogocounter = 33;
                    gocounter = 16;
                } else if (iffer == 67 || iffer == 33){
                    gogocounter = 33;
                    gocounter = 16;
                } else if (iffer == 66 || iffer == 34){
                    gogocounter = 35;
                    gocounter = 17;
                } else if (iffer == 65 || iffer == 35){
                    gogocounter = 35;
                    gocounter = 17;
                } else if (iffer == 64 || iffer == 36){
                    gogocounter = 37;
                    gocounter = 18;
                } else if (iffer == 63 || iffer == 37){
                    gogocounter = 37;
                    gocounter = 18;
                } else if (iffer == 62 || iffer == 38){
                    gogocounter = 39;
                    gocounter = 19;
                } else if (iffer == 61 || iffer == 39){
                    gogocounter = 39;
                    gocounter = 19;
                } else if (iffer == 60 || iffer == 40){
                    gogocounter = 41;
                    gocounter = 20;
                } else if (iffer == 59 || iffer == 41){
                    gogocounter = 41;
                    gocounter = 20;
                } else if (iffer == 58 || iffer == 42){
                    gogocounter = 43;
                    gocounter = 21;
                } else if (iffer == 57 || iffer == 43){
                    gogocounter = 43;
                    gocounter = 21;
                } else if (iffer == 56 || iffer == 44){
                    gogocounter = 45;
                    gocounter = 22;
                } else if (iffer == 55 || iffer == 45){
                    gogocounter = 45;
                    gocounter = 22;
                } else if (iffer == 54 || iffer == 46){
                    gogocounter = 47;
                    gocounter = 23;
                } else if (iffer == 53 || iffer == 47){
                    gogocounter = 47;
                    gocounter = 23;
                } else if (iffer == 52 || iffer == 48){
                    gogocounter = 49;
                    gocounter = 24;
                } else if (iffer == 51 || iffer == 49) {
                    gogocounter = 49;
                    gocounter = 24;
                }

                if (stupiditycounter > 50) {
                    stupiditycounter = stupiditycounter - (new Random().nextInt(gogocounter) - gocounter);
                    absolutechaos();
                }else{
                    stupiditycounter = stupiditycounter + (new Random().nextInt(gogocounter) - gocounter);
                    absolutechaos();
                }
            }


            public void displayVictoryMethod() {
                TextView A = (TextView) findViewById(R.id.textView3);
                int Victor = (Turn%2)+1;

                if (playerTwoScore >= 100){
                    A.setText("Victory to Gagnar");
                }else if (playerOneScore >= 100){
                    A.setText("Victory to player");
                }
            }
        });
        Mutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playerOneScore != 99 || playerTwoScore == 99){
                    NyxtGame.setVisibility(View.VISIBLE);

                }

                if (playerOneScore < 9000 && playerTwoScore < 9000) {
                    if ((sound % 2) == 1) {
                        sound = sound + 1;
                        if (DiceTrackPlayer.isPlaying()) {
                            DiceTrackPlayer.pause();
                        }
                    } else {
                        if (!DiceTrackPlayer.isPlaying()) {
                            sound = sound + 1;
                            DiceTrackPlayer.setLooping(true);
                            DiceTrackPlayer.start();

                        }
                    }
                } else {
                    if ((sound % 2) == 1) {
                        sound = sound + 1;
                        if (DiceTrackPlayer.isPlaying()) {
                            DiceTrackPlayer.pause();
                        }
                    } else {
                        if (!DiceTrackPlayer.isPlaying()) {
                            sound = sound + 1;
                            DiceTrackPlayer.setLooping(true);
                            DiceTrackPlayer.start();

                        }
                    }
                }
            }
            });



        Stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AITurn();

            }

        });

        NyxtGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscapeDiceGame();

            }

        });

    }

    public void AITurn() {
        AImethod();
        displayAIMethod();
        Stay.setVisibility(View.INVISIBLE);
    }

    public void displayAIMethod() {
        if (playerOneScore < 100 && playerTwoScore < 100){
            //displayTurn();
            ChangeScores();
            displayScoreMethod(wholeOne);
            displayScoreTwoMethod(wholeTwo);
        }else{
            displayVictoryMethod();

        }

    }

    public void displayScoreMethod(int T) {
        TextView A = (TextView) findViewById(R.id.textView);
        A.setText("" + T);
    }
    public void displayScoreTwoMethod(int T) {
        TextView A = (TextView) findViewById(R.id.textView2);
        A.setText("" + T);
    }
    public void displayVictoryMethod() {
        TextView A = (TextView) findViewById(R.id.textView3);
        int Victor = (Turn%2)+1;
        if (playerTwoScore >= 100){
            A.setText("Victory to Gagnar");
        }else if (playerOneScore >= 100){
            A.setText("Victory to player");
        }
    }



    public void ChangeScores(){
        playerOneScore = wholeOne;
        playerTwoScore = wholeTwo;
       // Turn = Turn+1;
        prospectiveTwo = 0;
        prospectiveOne = 0;
    }
    public void displayTurn() {
        if ((Turn%2) == 1){
            ImagePlayerOne.setVisibility(View.VISIBLE);
            ImagePlayerTwo.setVisibility(View.INVISIBLE);

        }else{
            ImagePlayerOne.setVisibility(View.INVISIBLE);
            ImagePlayerTwo.setVisibility(View.VISIBLE);
        }

    }
    public void EscapeDiceGame() {
        Intent intentNoDice = new Intent(this, MusicSoup.class);
        startActivity(intentNoDice);
    }


    public void AImethod() {
        displayEnemyRollHide();
        int roll = RandomRoll();
        displayEnemyRollOne(roll);
        if (roll == 0) {
            prospectiveTwo = 0;
            wholeTwo = prospectiveTwo + playerTwoScore;
            playerTwoScore = (wholeTwo - prospectiveTwo);
            //  ImagePlayerTwo.setVisibility(View.VISIBLE);
            // ImagePlayerOne.setVisibility(View.INVISIBLE);
         //   ChangeTurns();
        } else {
            prospectiveTwo = prospectiveTwo + roll;
            wholeTwo = prospectiveTwo + playerTwoScore;
            if (((prospectiveTwo + wholeTwo) >= 100) || playerTwoScore >= 100) {
                displayAIMethod();
            } else {
                if (prospectiveTwo <= 11) {
                    roll = RandomRoll();
                    displayEnemyRollTwo(roll);
                    if (roll == 0) {
                        prospectiveTwo = 0;
                        wholeTwo = prospectiveTwo + playerTwoScore;
                        playerTwoScore = (wholeTwo - prospectiveTwo);
                        // ImagePlayerTwo.setVisibility(View.VISIBLE);
                        // ImagePlayerOne.setVisibility(View.INVISIBLE);
                        Turn = Turn + 1;
                    //    ChangeTurns();
                        displayAIMethod();
                    } else {
                        prospectiveTwo = prospectiveTwo + roll;
                        wholeTwo = prospectiveTwo + playerTwoScore;
                        if (((prospectiveTwo + wholeTwo) >= 100) || playerTwoScore >= 100) {
                            displayAIMethod();
                        } else {
                            if (prospectiveTwo <= 11) {
                                roll = RandomRoll();
                                displayEnemyRollThree(roll);
                                if (roll == 0) {
                                    prospectiveTwo = 0;
                                    wholeTwo = prospectiveTwo + playerTwoScore;
                                    playerTwoScore = (wholeTwo - prospectiveTwo);
                                    //  ImagePlayerTwo.setVisibility(View.VISIBLE);
                                    //  ImagePlayerOne.setVisibility(View.INVISIBLE);
                                    Turn = Turn + 1;
                                  //  ChangeTurns();
                                    displayAIMethod();
                                } else {
                                    prospectiveTwo = prospectiveTwo + roll;
                                    wholeTwo = prospectiveTwo + playerTwoScore;
                                    if (((prospectiveTwo + wholeTwo) >= 100) || playerTwoScore >= 100) {
                                        displayAIMethod();
                                    }else {
                                        if (prospectiveTwo <= 15) {
                                            roll = RandomRoll();
                                            displayEnemyRollFour(roll);
                                            if (roll == 0) {
                                                prospectiveTwo = 0;
                                                wholeTwo = prospectiveTwo + playerTwoScore;
                                                playerTwoScore = (wholeTwo - prospectiveTwo);
                                                //  ImagePlayerTwo.setVisibility(View.VISIBLE);
                                                //   ImagePlayerOne.setVisibility(View.INVISIBLE);
                                                Turn = Turn + 1;
                                             //   ChangeTurns();
                                                displayAIMethod();
                                            } else {
                                                prospectiveTwo = prospectiveTwo + roll;
                                                wholeTwo = prospectiveTwo + playerTwoScore;

                                            }
                                        }
                                    }
                                }

                            }


                        }
                    }
                }
            }
            Turn = Turn + 1;
            displayAIMethod();
        }

    }

    public int RandomRoll() {

        return (int) new Random().nextInt(6);
    }

    public int ChangeTurns(){
        int roll = new Random().nextInt(6);
        if((Turn%2) ==1){
            if (roll == 0){
                prospectiveOne = 0;
                wholeOne = prospectiveOne + playerOneScore;
                playerOneScore = (wholeOne - prospectiveOne);
                //  ImagePlayerOne.setVisibility(View.VISIBLE);
                //  ImagePlayerTwo.setVisibility(View.INVISIBLE);
                Turn = Turn + 1;
                return Turn%2;
            }else{
                prospectiveOne = prospectiveOne + roll;
                wholeOne = prospectiveOne + playerOneScore;

                return Turn%2;
            }
        }else{
            return Turn%2;
        }
    }

    public void displayEnemyRollOne(int T) {
        TextView A = (TextView) findViewById(R.id.EnemyRoll1);
        A.setText("+" + T);
    }
    public void displayEnemyRollTwo(int T) {
        TextView A = (TextView) findViewById(R.id.EnemyRoll2);
        A.setText("+" + T);
    }
    public void displayEnemyRollThree(int T) {
        TextView A = (TextView) findViewById(R.id.EnemyRoll3);
        A.setText("+" + T);
    }
    public void displayEnemyRollFour(int T) {
        TextView A = (TextView) findViewById(R.id.EnemyRoll4);
        A.setText("+" + T);
    }


    public void displayEnemyRollHide() {
        TextView B = (TextView) findViewById(R.id.EnemyRoll1);
        B.setText("");
        TextView A = (TextView) findViewById(R.id.EnemyRoll2);
        A.setText("");
        TextView C = (TextView) findViewById(R.id.EnemyRoll3);
        C.setText("");
        TextView D = (TextView) findViewById(R.id.EnemyRoll4);
        D.setText("");
    }

    public void displayPlayerRollOne(int T) {
        TextView A = (TextView) findViewById(R.id.PlayerRoll1);
        A.setText("+" + T);
    }
    public void displayPlayerRollTwo(int T) {
        TextView A = (TextView) findViewById(R.id.PlayerRoll2);
        A.setText("+" + T);
    }
    public void displayPlayerRollThree(int T) {
        TextView A = (TextView) findViewById(R.id.PlayerRoll3);
        A.setText("+" + T);
    }
    public void displayPlayerRollFour(int T) {
        TextView A = (TextView) findViewById(R.id.PlayerRoll4);
        A.setText("+" + T);
    }
}


