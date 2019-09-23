package ditzler.cole.stableapp;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GarlitosMoveNotes extends AppCompatActivity {


    int checkme;

    protected void onPause(){
        super.onPause();
        if(PlayerSounds != null) {
            PlayerSounds.pause();
        }
        if (AttackerSounds != null) {
            AttackerSounds.pause();
        }
        //  VictoryMusic.pause();
    }

    MediaPlayer PlayerSounds;
    MediaPlayer AttackerSounds;

    int PlayerDelayedStatMove = -1;

    int AttackerDelayedStatMove = -1;


    int holdme;


    boolean[] dictionaryOfMonsters = new boolean[101];

    CustomMonsterTopLayer.StringObject NameObjectHolder;
    int CollarNumber = 10;

    int MonsterStorageCounter =0;
    int DeployMonsterStorageCounter =0;
    EditText IDbox;

    int absolutelyconfusingvariable = 27;

    final double SqrtTwo = Math.sqrt(2);
    final double CbrtTwo = Math.cbrt(2);
    final double FrrtTwo = Math.sqrt(SqrtTwo);

    int AttackerStatDelayTimer = -1;
    int PlayerStatDelayTimer = -1;

    int healblockmagnitudeA;
    int healblocktgimerA;

    int healblockmagnitudeP;
    int healblocktgimerP;

    int statblocktimerP;
    int statblocktimerA;

    int IDstorage;

    int statMinimum = 60;

    int playwins = 0;
    int attackwins = 0;

    int elongatedhealwoundtimerA;
    int elongatedhealwoundtimerP;

    int elongatedwoundtimerA;
    int elongatedwoundtimerP;

    int delayedblastpowerA;
    int delayedblastpowerP;

    int delayedblasttimerA;
    int delayedblasttimerP;

    int elongatedhealwoundpowerA;
    int elongatedhealwoundpowerP;
    int elongatedwoundpowerA;
    int elongatedwoundpowerP;

    int slowdrainA;
    int slowdrainP;


    String displaystring = "%s";
    String displaystringH = "%s/%s";

    String CombatString = "";
    String GombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";

    Button Turn, HealButton, Status, Reset, SwitchButton, NewMonsters, RivalButton, TestButton, TellButton, CountButton, SpecialAttack, CaptureButton, DeployButton, GoToLabButton;

    ImageView PlayerIcon, EnemyIcon, playerbuff1, playerbuff2, playerbuff3, playerbuff4, playerbuff5, Book;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov, PSmov, ESmov, PAmov, EAmov, LongView;

    int spawncap = 97;
    int rotationcap = 98;


    int rivalNewnessCounter = 0;

    //  int monsterLoop = new Random().nextInt(spawncap)+1;
    int monsterLoop = 0;

    int scorekeepera;
    int scorekeeperp;

    int ActionNum;
    int playerid = new Random().nextInt(spawncap)+1;
    int attackerid = 1;

    int elongatedglugpowerP;
    int elongatedglugtimerP;
    int elongatedglugpowerA;
    int elongatedglugtimerA;

    int whosturnisitanyway;

    int elongatedhealpowerP;
    int elongatedhealpowerA;
    int elongatedhealtimerP;
    int elongatedhealtimerA;

    int delayedhealpowerA = 0;
    int delayedhealpowerP = 0;
    int delayedhealtimerP = 0;
    int delayedhealtimerA = 0;

    int grouphealpowerA = 0;
    int grouphealpowerP = 0;
    int grouphealtimerP = 0;
    int grouphealtimerA = 0;



    Bundle outStated;

    int chi = 0;
    int x = 0;
    int storagesize = 0;

    ImageButton Desk;
    Button Return, Store, Print, PrintTwo, CustomButton, Dynamics;
    TextView PrintWindow;
    public View DarkView;
    int VisibilityHolder = 0;
    protomon.monst passedmonster;
    protomon.monst[] passedmonsters = new protomon.monst[9998];
    protomon.monst[] passedmonstersJ = new protomon.monst[9999];
    protomon.monst[] passedmonstersTwo = new protomon.monst[9999];
    String o = "%.0f";
    ImageButton Recorder;
    int DeckStorage[] = new int[9999];

    int UniqueID = new Random().nextInt(100000000);;
  //  ImageView Mon;
    TextView Info, Infox,Movename;
    Button Rotate, Rotateb;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.garlitos_move_notes_activity);


        Movename = (TextView) findViewById(R.id.MoveName);
        Info = (TextView) findViewById(R.id.PrintOut);
        Infox = (TextView) findViewById(R.id.PrintOutx);
        Book = (ImageView) findViewById(R.id.Book);
        Rotate = (Button) findViewById(R.id.Page);
        Rotateb = (Button) findViewById(R.id.Pageb);
        Recorder = (ImageButton) findViewById(R.id.song);
        Recorder.setImageResource(R.drawable.recorderx);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/wf.ttf");
      //  Info.setTypeface(typeface);
      //  Infox.setTypeface(typeface);

        int bee = 0;

        Book.setImageResource(R.drawable.bookclosedg);


        Recorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holdme = (holdme+1);
                String Information = MoveBreakdown(holdme);
                String stats = MoveEquation(holdme);
                String Infocont = MoveInfo(holdme);
                String Name = MoveName(holdme);

                Movename.setText(Name);
                Info.setText(Information);
                Infox.setText(stats + Infocont);

               // checkme = 1;



                if(holdme == 0){
                   Info.setVisibility(View.INVISIBLE);
                   Infox.setVisibility(View.INVISIBLE);
                   Book.setImageResource(R.drawable.bookclosedg);
                    Movename.setVisibility(View.INVISIBLE);
                }else {
                    Movename.setVisibility(View.VISIBLE);
                    Info.setVisibility(View.VISIBLE);
                    Infox.setVisibility(View.VISIBLE);
                    Book.setImageResource(R.drawable.bookg);
                }
            }
        });
        Rotateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           //     if(checkme == 1){
           //         holdme = (holdme-1);
           //         if(holdme < 0 ) {
            //            holdme = 0;
           //         }
           //         checkme = 0;
           //     }
                holdme = (holdme-1);
                if(holdme < 0 ) {
                    holdme = 0;
                }
                String Information = MoveBreakdown(holdme);
                String stats = MoveEquation(holdme);
                String Infocont = MoveInfo(holdme);
                String Name = MoveName(holdme);

                Movename.setText(Name);
                Info.setText(Information);
                Infox.setText(stats + Infocont);



                if(holdme == 0){
                    Info.setVisibility(View.INVISIBLE);
                    Infox.setVisibility(View.INVISIBLE);
                    Book.setImageResource(R.drawable.bookclosedg);
                    Movename.setVisibility(View.INVISIBLE);
                }else {
                    Movename.setVisibility(View.VISIBLE);
                    Info.setVisibility(View.VISIBLE);
                    Infox.setVisibility(View.VISIBLE);
                    Book.setImageResource(R.drawable.bookg);
                }
            }
        });


    }

    private String MoveBreakdown(int holdtome) {
        holdtome--;
        String giveback = "";
        switch (holdtome){
            case 0:
                giveback = "";
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
        }
        return giveback;
    }

    private String MoveEquation(int holdtome) {
        holdtome--;
        String giveback = "";
        switch (holdtome){
            case 0:
                giveback = "U.Sp/U.De * 50 <-> 70 \nInstant healing";
                break;
            case 1:
                giveback = "U.Sp/U.De * 65 <-> 85 \nHealing on completion of users next natural action";
                break;
            case 2:
                giveback = "U.Sp/U.De * 20 <-> 28 \nHealing per action for 5 actions (stackable) ";
                break;
            case 3:
                giveback = "U.At/O.De * 35 <-> 45 \nHealth stolen from opponent";
                break;
            case 4:
                giveback = "U.Sp/U.De * 35 <-> 45 \nHealing with total debuff removal on user";
                break;
            case 5:
                giveback = "U.Sp/U.De * 6 <-> 9 \nHealing per action for the whole team for 7 actions (stackable) ";
                break;
            case 6:
                giveback = "((U.At+U.Sp+U.De)/U.HeM)*21 <-> 25 \n Healing with all stat 1.67% boost";
                break;
            case 7:
                giveback = "U.Sp/(U.At + U.De) * 99 <-> 117 \n Healing with speed stat 5% boost";
                break;
            case 8:
                giveback = "U.At/(U.Sp + U.De) * 99 <-> 117 \n Healing with attack stat 5% boost";
                break;
            case 9:
                giveback = "U.De/(U.At + U.Sp) * 99 <-> 117 \n Healing with defense stat 5% boost";
                break;
            case 10:
                giveback = "U.Sp/O.De * 12 <-> 16 \nDamage on every completed action for 10 actions (stackable)";
                break;
            case 11:
                giveback = "U.At/O.Sp * 65 <-> 85 \nDamage on completion of users next natural action";
                break;
            case 12:
                giveback = "U.Sp/O.De * 8 <-> 10 \nDamage on every completed action for 10 actions and 50% reduction to all of opponent's healing (stackable)";
                break;
            case 13:
                giveback = "U.Sp/O.De * 8 <-> 10 \nHealth stolen from opponent on every completed action for 10 actions (stackable)";
                break;

            case 14:
                giveback = "Prevents opponent from healing for 7 actions (stackable)";
                break;





            case 15:
                giveback = "U.De/O.De * 25 <-> 35 \nDamage in addition to reducing opponent's defense by 15%";
                break;
            case 16:
                giveback = "U.Sp/O.Sp * 25 <-> 35 \nDamage in addition to reducing opponent's speed by 15%";
                break;
            case 17:
                giveback = "U.At/O.At * 25 <-> 35 \nDamage in addition to reducing opponent's attack by 15%";
                break;
            case 18:
                giveback = "Prevents opponent from boosting its stats for 7 actions (stackable)";
                break;

            case 19:
                giveback = "U.At/O.De * 25 <-> 35 \nDamage in addition to total debuff removal on user";
                break;



            case 20:
                giveback = "U.StT/O.StT * 100 <-> 150 \nDealing massive damage at a cost of 23% of each of the users stats ";
                break;
            case 21:
                giveback = "U.StT/O.StT * 25 <-> 35 \nDamage and a reduction of opponent's stats by 5% each";
                break;
            case 22:
                giveback = "Snatches beneficial things from the opponent, like shields and delayed moves";
                break;
            case 23:
                giveback = "U.At/O.De * 25 <-> 35 \nDamage and Dispels beneficial things from the opponent, like shields and delayed moves";
                break;
            case 24:
                giveback = "Prevents stat reduction on the using team for 11 actions (stackable)";
                break;
            case 25:
                giveback = "U.At/O.De * 50 <-> 70 \n Damage";
                break;
            case 26:
                giveback = "U.At/O.Sp * 50 <-> 70 \n Damage";
                break;
            case 27:
                giveback = "U.At/O.At * 50 <-> 70 \n Damage";
                break;
            case 28:
                giveback = "U.Sp/O.De * 50 <-> 70 \n Damage";
                break;
            case 29:
                giveback = "U.Sp/O.Sp * 50 <-> 70 \n Damage";
                break;
            case 30:
                giveback = "U.Sp/O.At * 50 <-> 70 \n Damage";
                break;
            case 31:
                giveback = "U.De/O.De * 50 <-> 70 \n Damage";
                break;
            case 32:
                giveback = "U.De/O.Sp * 50 <-> 70 \n Damage";
                break;
            case 33:
                giveback = "U.De/O.At * 50 <-> 70 \n Damage";
                break;
            case 34:
                giveback = "All stats increase by 19% on use";
                break;
            case 35:
                giveback = "Speed and Defense increase by 26% on use";
                break;
            case 36:
                giveback = "Attack and Defense increase by 26% on use";
                break;
            case 37:
                giveback = "Speed and Attack increase by 26% on use";
                break;
            case 38:
                giveback = "Speed increases by 41% on use";
                break;
            case 39:
                giveback = "Attack increases by 41% on use";
                break;
            case 40:
                giveback = "Defense increases by 41% on use";
                break;
            case 41:
                giveback = "All stats increase by 26% on use";
                break;
                case 42:
                giveback = "Speed and Defense increase by 41% on completion of users next natural action";
                break;
            case 43:
                giveback = "Attack and Defense increase by 41% on completion of users next natural action";
                break;
            case 44:
                giveback = "Speed and Attack increase by 41% on completion of users next natural action";
                break;
            case 45:
                giveback = "Speed increases by 100% on completion of users next natural action";
                break;
            case 46:
                giveback = "Defense increases by 100% on completion of users next natural action";
                break;
            case 47:
                giveback = "Attack increases by 100% on completion of users next natural action";
                break;
            case 48:
                giveback = "Decrease the opponent speed by 19%, and increase the users speed 19%";
                break;
            case 49:
                giveback = "Decrease the opponent defense by 19%, and increase the users defense 19%";
                break;
            case 50:
                giveback = "Decrease the opponent attack by 19%, and increase the users attack 19%";
                break;
        }
        return giveback;
    }

    private String MoveInfo(int holdtome) {
        holdtome--;
        String giveback = "";
        switch (holdtome){
            case 0:
                giveback = "";
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
        }
        return giveback;
    }

    private String MoveName(int holdtome) {

        holdtome--;
        String giveback = "";
        if (holdtome <= 9 ){
            giveback = HealingMoveNames(holdtome);
        }
        if(holdtome > 9 && holdtome <= 24){
            giveback = SpecialMoveNames((holdtome-10));
        }
        if(holdtome > 24 && holdtome <= 33){
            giveback = AttackMoveNames(holdtome-25);
        }
        if(holdtome > 33 && holdtome <= 51){
            giveback = StatsMoveNames(holdtome-34);
        }
        return giveback;
    }

    public String HealingMoveNames(int move) {
        //Cases after 6 hypothetical
        switch (move){
            case 0:
                return "Heal";
            case 1:
                return "Delayed Heal";
            case 2:
                return "Heal Over Time";
            case 3:
                return "Life Glug";
            case 4:
                return "Cleansing Heal";
            case 5:
                return "All Team Heal";
            case 6:
                return "Snowballing";  // 90% as strong as regular heal, increases stats by 1%
            case 7:
                return "Momentum"; // +5% speed increase and half powered heal
            case 8:
                return "Posturing"; // +5% attack and attack/maxhealth based heal
            case 9:
                return "Growth";  // +5% defense and half power heal based on defense stat 1
        }
        return "HealError";
    }

    public String SpecialMoveNames(int move) {
        // 9 hypothetical
        switch (move){
            case 0:
                return "Wound";
            case 1:
                return "Delayed Blast";
            case 2:
                return "Grevious Wounds";
            case 3:
                return "Life Glug Over Time";
            case 4:
                return "Heal Block";
            case 5:
                return "Defense Chip";
            case 6:
                return "Trip";
            case 7:
                return "Discipline";
            case 8:
                return "Boost Block";
            case 9:
                return "Refute"; // Cleanse + damage ~ lifeglug or discipline
            case 10:
                return "Energy Burn"; // all stat 5% drop with damage based on stats/stats
            case 11:
                return "Depress"; // all stat 5% drop with damage based on stats/stats
            case 12:
                return "Snatch";
            case 13:
                return "Dispel";
            case 14:
                return "Stats Shield";
        }
        return "SpecialError";
    }

    public String AttackMoveNames(int move) {
        // 9 hypothetical
        switch (move){
            case 0:
                return "Attack"; //at/def
            case 1:
                return "Advance"; // At/sp
            case 2:
                return "Overpower";  // Attack/at
            case 3:
                return "Puncture"; //   Sp/def
            case 4:
                return "Race";//  sp/sp
            case 5:
                return "Exhaust";//  sp/at
            case 6:
                return "Collide";// def/.def
            case 7:
                return "Obstruct";// def/sp
            case 8:
                return "Block Beam";//  def/at
        }
        return "AttackError";
    }

    public String StatsMoveNames(int move) {
        switch (move){
            case 0:
                return "All Stat Minor Boost ";
            case 1:
                return "Speed and Defense Boost ";
            case 2:
                return "Attack and Defense Boost ";
            case 3:
                return "Attack and Speed Boost ";
            case 4:
                return "Major Speed Boost ";
            case 5:
                return "Major Defense Boost ";
            case 6:
                return "Major Attack Boost ";
            case 7:
                return "Delayed All Stat Boost ";
            case 8:
                return "Delayed Major Speed and Defense Boost ";
            case 9:
                return "Delayed Major Attack and Defense Boost ";
            case 10:
                return "Delayed Major Attack and Speed Boost ";
            case 11:
                return "Delayed Huge Speed Boost ";
            case 12:
                return "Delayed Huge Defense boost ";
            case 13:
                return "Delayed Huge Attack boost ";
            case 14:
                return "Speed Sap ";
            case 15:
                return "Defense Drain ";
            case 16:
                return "Attack Absorb ";
        }
        return "StatError";
    }

    public int SpecialMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(11);

        return startingmove;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(10);

        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(14);

        return startingmove;
    }

    public int UniqueIdentifier(int needless){
        return new Random().nextInt(100000000);
    }


}

