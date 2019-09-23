package ditzler.cole.stableapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class protomons extends AppCompatActivity {


    final double SqrtTwo = Math.sqrt(2);
    final double CbrtTwo = Math.cbrt(2);
    final double FrrtTwo = Math.sqrt(SqrtTwo);

    int AttackerStatDelayTimer = -1;
    int PlayerStatDelayTimer = -1;


    String CombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";

    Button Turn, HealButton, Status;

    ImageView PlayerIcon, EnemyIcon;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov, PSmov, ESmov, LongView;


    int ActionNum;
    int playerid = 1;
    int attackerid = 1;

    int whosturnisitanyway;

    int elongatedhealpowerP;
    int elongatedhealpowerA;
    int elongatedhealtimerP;
    int elongatedhealtimerA;

    int delayedhealpowerA = 0;
    int delayedhealpowerP = 0;
    int delayedhealtimerP = 0;
    int delayedhealtimerA = 0;


    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;

    public double kohbohid = 2;
    public double kohbohat = 100;
    public double kohbohsp = 100;
    public double kohbohde = 100;
    public double kohbohhe = 100;

    public double djoperid = 3;
    public double djoperat = 274;
    public double djopersp = 65;
    public double djoperde = 70;
    public double djoperhe = 80;

    public double schorpid = 4;
    public double schorpat = 60;
    public double schorpsp = 105;
    public double schorpde = 100;
    public double schorphe = 158;

    public double zaumeid = 5;
    public double zaumeat = 94;
    public double zaumesp = 180;
    public double zaumede = 77;
    public double zaumehe = 77;

    public double nhainhaiid = 6;
    public double nhainhaiat = 60;
    public double nhainhaisp = 60;
    public double nhainhaide = 60;
    public double nhainhaihe = 462;

    public double degeissdtid = 7;
    public double degeissdtat = 361;
    public double degeissdtsp = 61;
    public double degeissdtde = 60;
    public double degeissdthe = 76;

    public double yuggleid = 8;
    public double yuggleat = 155;
    public double yugglesp = 179;
    public double yugglede = 60;
    public double yugglehe = 66;

    public double bonguid = 9;
    public double bonguat = 60;
    public double bongusp = 65;
    public double bongude = 422;
    public double bonguhe = 61;

    public double giterigliaid = 10;
    public double giterigliaat = 111;
    public double giterigliasp = 95;
    public double giterigliade = 101;
    public double giterigliahe = 94;
    
    public double cyosterothid = 11;
    public double cyosterothat = 70;
    public double cyosterothsp = 125;
    public double cyosterothde = 81;
    public double cyosterothhe = 141;
    
    public double nentopodeid = 12;
    public double nentopodeat = 76;
    public double nentopodesp = 63;
    public double nentopodede = 160;
    public double nentopodehe = 130;
    
    public double centiclakid = 13;
    public double centiclakat = 90;
    public double centiclaksp = 111;
    public double centiclakde = 74;
    public double centiclakhe = 135;
    
    public double uggnawbid = 14;
    public double uggnawbat = 65;
    public double uggnawbsp = 159;
    public double uggnawbde = 60;
    public double uggnawbhe = 160;
    
    public double grobhostid = 15;
    public double grobhostat = 142;
    public double grobhostsp = 66;
    public double grobhostde = 80;
    public double grobhosthe = 134;
    
    public double illelonabid = 16;
    public double illelonabat = 154;
    public double illelonabsp = 68;
    public double illelonabde = 73;
    public double illelonabhe = 131;
    
    public double rongzeedid = 17;
    public double rongzeedat = 95;
    public double rongzeedsp = 63;
    public double rongzeedde = 75;
    public double rongzeedhe = 220;
    
    public double blattleid = 18;
    public double blattleat = 149;
    public double blattlesp = 67;
    public double blattlede = 109;
    public double blattlehe = 92;
    
    

    int turncounter = 0;

    double Damage;

    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;


    public class monst implements Cloneable{

        public double Idnum;
        public double Speed;
        public double Attack;
        public double Defense;
        public double Health;
        public int Moveslotattack;
        public int Moveslotspeed;
        public int Moveslotdefense;
        public int Moveslotheal;

        public monst (double idnum, double speed, double attack, double defense, double health, int moveslotattack, int moveslotspeed, int moveslotdefense, int moveslotheal){

            Idnum = idnum;
            Speed = speed;
            Attack = attack;
            Defense = defense;
            Health = health;
            Moveslotattack = moveslotattack;
            Moveslotspeed = moveslotspeed;
            Moveslotdefense = moveslotdefense;
            Moveslotheal = moveslotheal;
        }

        public monst clone() throws CloneNotSupportedException {
            monst clonedmonster = (monst) super.clone();
            return clonedmonster;
        }
    }

    monst Kunk = new monst(kunkid, kunksp, kunkat, kunkde, kunkhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Djoper = new monst(djoperid, djopersp, djoperat, djoperde, djoperhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Schorp = new monst(schorpid, schorpsp, schorpat, schorpde, schorphe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Zaume = new monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Nhainhai = new monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Kohboh = new monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Degeissdt = new monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Yuggle = new monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Bongu = new monst(bonguid, bongusp, bonguat, bongude, bonguhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Giteriglia = new monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Cyosteroth = new monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Nentopode = new monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Centiclak = new monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Uggnawb = new monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Grobhost = new monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Illelonab = new monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Rongzeed = new monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Blattle = new monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, 0,SpeedMoves(0),0,HealMoves(0));

    monst attackermonster;
    monst playermonster;
    monst error = new monst(0, 51, 51, 51, 753, 0,0,0,0);

/*
    public class kohbohtemplate implements Cloneable{

        public monst Kohboh = new monst(0, stats(100), stats(100), stats(100), stats(100), 0, 0,0,0);

        public kohbohtemplate (monst kohboh){


        }

    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protomon);
        Patk = findViewById(R.id.playerattack);
        Pname = findViewById(R.id.playername);
        Pdef = findViewById(R.id.playerdefense);
        Pspe = findViewById(R.id.playerspeed);
        Pheal = findViewById(R.id.playerhealth);
        PHmov = findViewById(R.id.playerhemove);
        PSmov = findViewById(R.id.playerspmove);
        Eatk = findViewById(R.id.enemyattack);
        Ename = findViewById(R.id.enemyname);
        Edef = findViewById(R.id.enemydefense);
        Espe = findViewById(R.id.enemyspeed);
        Eheal = findViewById(R.id.enemyhealth);
        EHmov = findViewById(R.id.enemyhemove);
        ESmov = findViewById(R.id.enemyspmove);
        PlayerIcon = findViewById(R.id.playerturn);
        EnemyIcon = findViewById(R.id.enemyturn);
        LongView = findViewById(R.id.ScrollerLongText);



        playerid = new Random().nextInt(18)+1;
        attackerid = new Random().nextInt(18)+1;
        try {
            playermonster =  Cloner(monstlist(playerid));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            attackermonster =  Cloner(monstlist(attackerid));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



        Turn = (Button) findViewById(R.id.attack);
        HealButton = (Button) findViewById(R.id.heal);
        Status = (Button) findViewById(R.id.statsbutton);

        Turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(turncounter == 0) {


                    attackermonster.Moveslotspeed = new Random().nextInt(14);
                    attackermonster.Moveslotheal = new Random().nextInt(4);
                    playermonster.Moveslotspeed = new Random().nextInt(14);
                    playermonster.Moveslotheal = new Random().nextInt(4);

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            Damage = ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(21)+50));
                            attackermonster.Health = attackermonster.Health - Damage;
                        }else {
                            whosturnisitanyway = 0;
                            Damage =  ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(21)+50));
                            playermonster.Health = playermonster.Health - Damage;
                        }
                    }else {

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 0;
                            Damage =  ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(21)+50));
                            playermonster.Health = playermonster.Health - Damage;
                        } else {
                            whosturnisitanyway = 1;
                            Damage = ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(21)+50));
                            attackermonster.Health = attackermonster.Health - Damage;
                        }

                    }
                }




                if(AttackerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    AttackerStatDelayTimer--;
                }

                if(PlayerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    PlayerStatDelayTimer--;
                }

                if(AttackerStatDelayTimer == 0){
                    AttackerStatDelayTimer = -1;
                    switch (attackermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            attackermonster.Attack = attackermonster.Attack * CbrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * CbrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * CbrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 8:

                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 9:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 10:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 11:
                            attackermonster.Speed = attackermonster.Speed * 2 ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 12:
                            attackermonster.Defense = attackermonster.Defense * 2 ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 13:
                            attackermonster.Attack = attackermonster.Attack * 2 ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            break;
                    }
                }

                if(PlayerStatDelayTimer == 0) {
                    PlayerStatDelayTimer = -1;
                    switch (playermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            playermonster.Attack = playermonster.Attack * CbrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * CbrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * CbrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 8:

                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 9:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 10:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 11:
                            playermonster.Speed = playermonster.Speed * 2 ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 12:
                            playermonster.Defense = playermonster.Defense * 2 ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 13:
                            playermonster.Attack = playermonster.Attack * 2 ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            break;
                    }
                }

                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(1);


                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }
                }

                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }


                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);

                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }


        });


        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(turncounter == 0) {


                    attackermonster.Moveslotspeed = new Random().nextInt(14);
                    attackermonster.Moveslotheal = new Random().nextInt(4);
                    playermonster.Moveslotspeed = new Random().nextInt(14);
                    playermonster.Moveslotheal = new Random().nextInt(4);

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            if (playermonster.Moveslotspeed == 0) {
                                playermonster.Speed = playermonster.Speed * FrrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * FrrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * FrrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 1){
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 2){
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 3){
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 4){
                                playermonster.Speed = playermonster.Speed * SqrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 5){
                                playermonster.Defense = playermonster.Defense * SqrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 6){
                                playermonster.Attack = playermonster.Attack * SqrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed > 6 && PlayerStatDelayTimer == -1){
                                PlayerStatDelayTimer = 3;
                            }
                        }else {


                            whosturnisitanyway = 0;

                            if (attackermonster.Moveslotspeed == 0) {
                                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 1){
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 2){
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 3){
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 4){
                                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 5){
                                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 6){
                                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1){
                                AttackerStatDelayTimer = 3;
                            }
                        }
                    }else {
                        if((turncounter%2) == 0){

                            whosturnisitanyway = 0;
                            if (attackermonster.Moveslotspeed == 0) {
                                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 1){
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 2){
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 3){
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 4){
                                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 5){
                                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 6){
                                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1){
                                AttackerStatDelayTimer = 3;
                            }
                        }else {
                            whosturnisitanyway = 1;
                            if (playermonster.Moveslotspeed == 0) {
                                playermonster.Speed = playermonster.Speed * FrrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * FrrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * FrrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 1){
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 2){
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 3){
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 4){
                                playermonster.Speed = playermonster.Speed * SqrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 5){
                                playermonster.Defense = playermonster.Defense * SqrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 6){
                                playermonster.Attack = playermonster.Attack * SqrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed > 6 && PlayerStatDelayTimer == -1){
                                PlayerStatDelayTimer = 3;
                            }
                        }

                    }
                }


                if(AttackerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    AttackerStatDelayTimer--;
                }

                if(PlayerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    PlayerStatDelayTimer--;
                }

                if(AttackerStatDelayTimer == 0){
                    AttackerStatDelayTimer = -1;
                    switch (attackermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            attackermonster.Attack = attackermonster.Attack * CbrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * CbrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * CbrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 8:

                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 9:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 10:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 11:
                            attackermonster.Speed = attackermonster.Speed * 2 ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 12:
                            attackermonster.Defense = attackermonster.Defense * 2 ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 13:
                            attackermonster.Attack = attackermonster.Attack * 2 ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            break;
                    }
                }

                if(PlayerStatDelayTimer == 0) {
                    PlayerStatDelayTimer = -1;
                    switch (playermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            playermonster.Attack = playermonster.Attack * CbrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * CbrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * CbrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 8:

                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 9:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 10:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 11:
                            playermonster.Speed = playermonster.Speed * 2 ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 12:
                            playermonster.Defense = playermonster.Defense * 2 ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 13:
                            playermonster.Attack = playermonster.Attack * 2 ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            break;
                    }
                }

                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }



                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(3);

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                        // CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                        //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }

                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }

                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);

                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });


        HealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {


                    attackermonster.Moveslotspeed = new Random().nextInt(14);
                    attackermonster.Moveslotheal = new Random().nextInt(4);
                    playermonster.Moveslotspeed = new Random().nextInt(14);
                    playermonster.Moveslotheal = new Random().nextInt(4);

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                                attackermonster.Health = attackermonster.Health - Damage;
                            }
                            if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }
                        }else {
                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if(attackermonster.Moveslotheal == 2) {
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                                playermonster.Health = playermonster.Health - Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }

                        }
                    }else {
                        if((turncounter%2) == 0){

                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if (attackermonster.Moveslotheal == 2){
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                                playermonster.Health = playermonster.Health - Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }
                        } else {

                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                                attackermonster.Health = attackermonster.Health - Damage;
                            }
                            if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }
                        }

                    }
                }



                if(AttackerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    AttackerStatDelayTimer--;
                }

                if(PlayerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    PlayerStatDelayTimer--;
                }

                if(AttackerStatDelayTimer == 0){
                    AttackerStatDelayTimer = -1;
                    switch (attackermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            attackermonster.Attack = attackermonster.Attack * CbrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * CbrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * CbrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 8:

                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 9:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Defense = attackermonster.Defense * SqrtTwo ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 10:
                            attackermonster.Attack = attackermonster.Attack * SqrtTwo ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            attackermonster.Speed = attackermonster.Speed * SqrtTwo ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 11:
                            attackermonster.Speed = attackermonster.Speed * 2 ;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            break;
                        case 12:
                            attackermonster.Defense = attackermonster.Defense * 2 ;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            break;
                        case 13:
                            attackermonster.Attack = attackermonster.Attack * 2 ;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                            break;
                    }
                }

                if(PlayerStatDelayTimer == 0) {
                    PlayerStatDelayTimer = -1;
                    switch (playermonster.Moveslotspeed){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 7:
                            playermonster.Attack = playermonster.Attack * CbrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * CbrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * CbrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 8:

                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 9:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Defense = playermonster.Defense * SqrtTwo ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 10:
                            playermonster.Attack = playermonster.Attack * SqrtTwo ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            playermonster.Speed = playermonster.Speed * SqrtTwo ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 11:
                            playermonster.Speed = playermonster.Speed * 2 ;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            break;
                        case 12:
                            playermonster.Defense = playermonster.Defense * 2 ;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            break;
                        case 13:
                            playermonster.Attack = playermonster.Attack * 2 ;
                            playermonster.Attack = Math.round(playermonster.Attack);
                            break;
                    }
                }

                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {

                        if  (attackermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealpowerA > 0) {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (attackermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                        }else if (attackermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                        }
                    } else if (whosturnisitanyway == 1) {
                        if  (playermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        } else if (playermonster.Moveslotheal == 1) {
                            if (delayedhealpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerP)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (playermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerP) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerP)) + "\n");
                        }else if (playermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(attackermonster.Idnum) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                        }

                    }
                }


                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");

                    }

                }


                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);


                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });



    }

    public String HealingMoveNames(int move) {
        switch (move){
            case 0:
                return "Heal";
            case 1:
                return "Delayed Heal";
            case 2:
                return "Heal Over Time";
            case 3:
                return "Life Glug";
        }
        return "HealError";
    }

    public String StatsMoveNames(int move) {
        switch (move){
            case 0:
                return "All Stat Minor Boost ";
            case 1:
                return "Speed and Defense Boost ";
            case 2:
                return "Attack and Defense boost ";
            case 3:
                return "Attack and speed boost ";
            case 4:
                return "Major Speed Boost ";
            case 5:
                return "Major Defense boost ";
            case 6:
                return "Major Attack boost ";
            case 7:
                return "Delayed All Stat Boost ";
            case 8:
                return "Delayed Major Speed and Defense Boost ";
            case 9:
                return "Delayed Major Attack and Defense boost ";
            case 10:
                return "Delayed Major Attack and speed boost ";
            case 11:
                return "Delayed Huge Speed Boost ";
            case 12:
                return "Delayed Huge Defense boost ";
            case 13:
                return "Delayed Huge Attack boost ";
        }
        return "StatError";
    }

    public monst Cloner(monst monster) throws CloneNotSupportedException {

        monst newmonstclone = monster.clone();

        newmonstclone.Attack = stats(newmonstclone.Attack);
        newmonstclone.Speed = stats(newmonstclone.Speed);
        newmonstclone.Defense = stats(newmonstclone.Defense);
        newmonstclone.Health = stats(newmonstclone.Health);
        return  newmonstclone;
    }

    public double stats(double base){

        return base+50;

        //     return (base+(new Random().nextInt(101)-50));
    }

    public int damagecalculation(int targetdefence, int attackerstrength){

        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }
    public monst monstlist(int idnumber){

        switch (idnumber){

            case 0:
                break;
            case 1:
                return Kunk;
            case 2:
                return Kohboh;
            case 3:
                return Djoper;
            case 4:
                return Schorp;
            case 5:
                return Zaume;
            case 6:
                return Nhainhai;
            case 7:
                return Degeissdt;
            case 8:
                return Yuggle;
            case 9:
                return Bongu;
            case 10:    
                return Giteriglia;
            case 11:
                return Cyosteroth;
            case 12:
                return Nentopode;
            case 13:
                return Centiclak;
            case 14:
                return Uggnawb;
            case 15:
                return Grobhost;
            case 16:
                return Illelonab;
            case 17:
                return Rongzeed;
            case 18:
                return Blattle;
        }
        return error;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(4);

        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(7);

        return startingmove;
    }

    public String TypesOfMotions(int Action){


        if (Action > -1) {
            switch ((int) Action) {

                case 0:
                    return " errantnope ";
                case 1:
                    return " Attacks for ";
                case 2:
                    return " Heals ";
                case 3:
                    return " Boosts ";
                case 4:
                    return " Takes Damage ";
                case 5:
                    return " Wins ";
            }
        }
        return "Space filler";
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
            }
        }else{
            return "error";
        }
        return "realerror";
    }

    public void ImageChanger() {


        if (playermonster.Speed <= attackermonster.Speed) {
            if ((turncounter % 2) == 0) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }
        } else {
            if ((turncounter % 2) == 1) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }

        }
    }
}






/*


package ditzler.cole.myapplication2.feature2;


import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class protomons extends AppCompatActivity {


    final double SqrtTwo = Math.sqrt(2);
    final double CbrtTwo = Math.cbrt(2);
    final double FrrtTwo = Math.sqrt(SqrtTwo);


    String CombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";

    Button Turn, HealButton, Status;

    ImageView PlayerIcon, EnemyIcon;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov, PSmov, ESmov, LongView;


    int ActionNum;
    int playerid = 1;
    int attackerid = 1;

    int whosturnisitanyway;

    int elongatedhealpowerP;
    int elongatedhealpowerA;
    int elongatedhealtimerP;
    int elongatedhealtimerA;

    int delayedhealpowerA = 0;
    int delayedhealpowerP = 0;
    int delayedhealtimerP = 0;
    int delayedhealtimerA = 0;


    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;

    public double kohbohid = 2;
    public double kohbohat = 100;
    public double kohbohsp = 100;
    public double kohbohde = 100;
    public double kohbohhe = 100;

    public double djoperid = 3;
    public double djoperat = 274;
    public double djopersp = 65;
    public double djoperde = 70;
    public double djoperhe = 80;

    public double schorpid = 4;
    public double schorpat = 60;
    public double schorpsp = 105;
    public double schorpde = 100;
    public double schorphe = 158;

    public double zaumeid = 5;
    public double zaumeat = 94;
    public double zaumesp = 180;
    public double zaumede = 77;
    public double zaumehe = 77;

    public double nhainhaiid = 6;
    public double nhainhaiat = 60;
    public double nhainhaisp = 60;
    public double nhainhaide = 60;
    public double nhainhaihe = 462;

    public double degeissdtid = 7;
    public double degeissdtat = 361;
    public double degeissdtsp = 61;
    public double degeissdtde = 60;
    public double degeissdthe = 76;

    public double yuggleid = 8;
    public double yuggleat = 155;
    public double yugglesp = 179;
    public double yugglede = 60;
    public double yugglehe = 66;

    public double bonguid = 9;
    public double bonguat = 60;
    public double bongusp = 65;
    public double bongude = 442;
    public double bonguhe = 61;

    int turncounter = 0;

    double Damage;

    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;


    public class monst implements Cloneable{

        public double Idnum;
        public double Speed;
        public double Attack;
        public double Defense;
        public double Health;
        public int Moveslotattack;
        public int Moveslotspeed;
        public int Moveslotdefense;
        public int Moveslotheal;

        public monst (double idnum, double speed, double attack, double defense, double health, int moveslotattack, int moveslotspeed, int moveslotdefense, int moveslotheal){

            Idnum = idnum;
            Speed = speed;
            Attack = attack;
            Defense = defense;
            Health = health;
            Moveslotattack = moveslotattack;
            Moveslotspeed = moveslotspeed;
            Moveslotdefense = moveslotdefense;
            Moveslotheal = moveslotheal;
        }

        public monst clone() throws CloneNotSupportedException {
            monst clonedmonster = (monst) super.clone();
            return clonedmonster;
        }
    }

    monst Kunk = new monst(kunkid, kunksp, kunkat, kunkde, kunkhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Djoper = new monst(djoperid, djopersp, djoperat, djoperde, djoperhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Schorp = new monst(schorpid, schorpsp, schorpat, schorpde, schorphe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Zaume = new monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Nhainhai = new monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Kohboh = new monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Degeissdt = new monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Yuggle = new monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, 0,SpeedMoves(0),0,HealMoves(0));
    monst Bongu = new monst(bonguid, bongusp, bonguat, bongude, bonguhe, 0,SpeedMoves(0),0,HealMoves(0));
    monst attackermonster;
    monst playermonster;
    monst error = new monst(0, 51, 51, 51, 753, 0,0,0,0);

/*
    public class kohbohtemplate implements Cloneable{

        public monst Kohboh = new monst(0, stats(100), stats(100), stats(100), stats(100), 0, 0,0,0);

        public kohbohtemplate (monst kohboh){


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protomon);
        Patk = findViewById(R.id.playerattack);
        Pname = findViewById(R.id.playername);
        Pdef = findViewById(R.id.playerdefense);
        Pspe = findViewById(R.id.playerspeed);
        Pheal = findViewById(R.id.playerhealth);
        PHmov = findViewById(R.id.playerhemove);
        PSmov = findViewById(R.id.playerspmove);
        Eatk = findViewById(R.id.enemyattack);
        Ename = findViewById(R.id.enemyname);
        Edef = findViewById(R.id.enemydefense);
        Espe = findViewById(R.id.enemyspeed);
        Eheal = findViewById(R.id.enemyhealth);
        EHmov = findViewById(R.id.enemyhemove);
        ESmov = findViewById(R.id.enemyspmove);
        PlayerIcon = findViewById(R.id.playerturn);
        EnemyIcon = findViewById(R.id.enemyturn);
        LongView = findViewById(R.id.ScrollerLongText);



        playerid = new Random().nextInt(9)+1;
        attackerid = new Random().nextInt(9)+1;

        if (new Random().nextInt(2)  == 1) {
            try {
                playermonster = Cloner(monstlist(playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist(playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                playermonster = Cloner(monstlist(playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist(attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }


        Turn = (Button) findViewById(R.id.attack);
        HealButton = (Button) findViewById(R.id.heal);
        Status = (Button) findViewById(R.id.statsbutton);

        Turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {


                        attackermonster.Moveslotspeed = new Random().nextInt(7);
                        attackermonster.Moveslotheal = new Random().nextInt(4);
                        playermonster.Moveslotspeed = new Random().nextInt(7);
                        playermonster.Moveslotheal = new Random().nextInt(4);

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            Damage = ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(21)+50));
                            attackermonster.Health = attackermonster.Health - Damage;
                        }else {
                            whosturnisitanyway = 0;
                            Damage =  ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(21)+50));
                            playermonster.Health = playermonster.Health - Damage;
                        }
                    }else {

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 0;
                            Damage =  ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(21)+50));
                            playermonster.Health = playermonster.Health - Damage;
                        } else {
                            whosturnisitanyway = 1;
                            Damage = ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(21)+50));
                            attackermonster.Health = attackermonster.Health - Damage;
                        }

                    }
                }


                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(1);


                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }
                }

                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }


                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);

                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }


        });


        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {

                    int picker = new Random().nextInt(7);
                    int pickerH = new Random().nextInt(4);

                        attackermonster.Moveslotspeed = picker;
                        attackermonster.Moveslotheal = pickerH;
                        playermonster.Moveslotspeed = picker;
                        playermonster.Moveslotheal = pickerH;


                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            if (playermonster.Moveslotspeed == 0) {
                                playermonster.Speed = playermonster.Speed * FrrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * FrrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * FrrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 1){
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 2){
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 3){
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 4){
                                playermonster.Speed = playermonster.Speed * SqrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 5){
                                playermonster.Defense = playermonster.Defense * SqrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 6){
                                playermonster.Attack = playermonster.Attack * SqrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }
                        }else {


                            whosturnisitanyway = 0;

                            if (attackermonster.Moveslotspeed == 0) {
                                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 1){
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 2){
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 3){
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 4){
                                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 5){
                                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 6){
                                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }
                        }
                    }else {
                        if((turncounter%2) == 0){

                            whosturnisitanyway = 0;
                            if (attackermonster.Moveslotspeed == 0) {
                                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 1){
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 2){
                                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }else if (attackermonster.Moveslotspeed == 3){
                                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 4){
                                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                                attackermonster.Speed = Math.round(attackermonster.Speed);
                            }else if (attackermonster.Moveslotspeed == 5){
                                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                                attackermonster.Defense = Math.round(attackermonster.Defense);
                            }else if (attackermonster.Moveslotspeed == 6){
                                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                                attackermonster.Attack = Math.round(attackermonster.Attack);
                            }
                        }else {
                            whosturnisitanyway = 1;
                            if (playermonster.Moveslotspeed == 0) {
                                playermonster.Speed = playermonster.Speed * FrrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * FrrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * FrrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 1){
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 2){
                                playermonster.Defense = playermonster.Defense * CbrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }else if (playermonster.Moveslotspeed == 3){
                                playermonster.Attack = playermonster.Attack * CbrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                                playermonster.Speed = playermonster.Speed * CbrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 4){
                                playermonster.Speed = playermonster.Speed * SqrtTwo;
                                playermonster.Speed = Math.round(playermonster.Speed);
                            }else if (playermonster.Moveslotspeed == 5){
                                playermonster.Defense = playermonster.Defense * SqrtTwo;
                                playermonster.Defense = Math.round(playermonster.Defense);
                            }else if (playermonster.Moveslotspeed == 6){
                                playermonster.Attack = playermonster.Attack * SqrtTwo;
                                playermonster.Attack = Math.round(playermonster.Attack);
                            }
                        }

                    }
                }



                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(3);

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                        // CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                        //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }

                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }

                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);

                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });


        HealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {


                    attackermonster.Moveslotspeed = 2;
                    attackermonster.Moveslotheal = 3;
                    playermonster.Moveslotspeed = 2;
                    playermonster.Moveslotheal = 3;

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(21) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                                attackermonster.Health = attackermonster.Health - Damage;
                            }
                            if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }
                        }else {
                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if(attackermonster.Moveslotheal == 2) {
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                                playermonster.Health = playermonster.Health - Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }

                        }
                    }else {
                        if((turncounter%2) == 0){

                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if (attackermonster.Moveslotheal == 2){
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                                playermonster.Health = playermonster.Health - Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }
                        } else {

                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                                attackermonster.Health = attackermonster.Health - Damage;
                            }
                            if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }
                        }

                    }
                }


                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";

                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {

                        if  (attackermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealpowerA > 0) {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (attackermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                        }else if (attackermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                        }
                    } else if (whosturnisitanyway == 1) {
                        if  (playermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        } else if (playermonster.Moveslotheal == 1) {
                            if (delayedhealpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerP)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (playermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerP) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerP)) + "\n");
                        }else if (playermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(attackermonster.Idnum) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                        }

                    }
                }


                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");

                    }

                }


                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
                String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);
                PSmov.setText(Pmovespeedstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);
                ESmov.setText(Emovespeedstring);


                LongView.setText(CombatString);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });



    }

    public String HealingMoveNames(int move) {
        switch (move){
            case 0:
                return "Heal";
            case 1:
                return "Delayed Heal";
            case 2:
                return "Heal Over Time";
            case 3:
                return "Vampire Attack";
        }
        return "HealError";
    }

    public String StatsMoveNames(int move) {
        switch (move){
            case 0:
                return "All Stat Minor Boost ";
            case 1:
                return "Speed and Defense Boost ";
            case 2:
                return "Attack and Defense boost ";
            case 3:
                return "Attack and speed boost ";
            case 4:
                return "Major Speed Boost ";
            case 5:
                return "Major Defense boost ";
            case 6:
                return "Major Attack boost ";
        }
        return "StatError";
    }

    public monst Cloner(monst monster) throws CloneNotSupportedException {

        monst newmonstclone = monster.clone();

        newmonstclone.Attack = stats(newmonstclone.Attack);
        newmonstclone.Speed = stats(newmonstclone.Speed);
        newmonstclone.Defense = stats(newmonstclone.Defense);
        newmonstclone.Health = stats(newmonstclone.Health);
        return  newmonstclone;
    }

    public double stats(double base){

        return base+50;

        //     return (base+(new Random().nextInt(101)-50));
    }

    public int damagecalculation(int targetdefence, int attackerstrength){

        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }
    public monst monstlist(int idnumber){

        switch (idnumber){

            case 0:
                break;
            case 1:
                return Kunk;
            case 2:
                return Kohboh;
            case 3:
                return Djoper;
            case 4:
                return Schorp;
            case 5:
                return Zaume;
            case 6:
                return Nhainhai;
            case 7:
                return Degeissdt;
            case 8:
                return Yuggle;
            case 9:
                return Bongu;
        }
        return error;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(4);

        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(7);

        return startingmove;
    }

    public String TypesOfMotions(int Action){


        if (Action > -1) {
            switch ((int) Action) {

                case 0:
                    return " errantnope ";
                case 1:
                    return " Attacks for ";
                case 2:
                    return " Heals ";
                case 3:
                    return " Boosts ";
                case 4:
                    return " Takes Damage ";
                case 5:
                    return " Wins ";
            }
        }
        return "Space filler";
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
            }
        }else{
            return "error";
        }
        return "realerror";
    }

    public void ImageChanger() {


        if (playermonster.Speed <= attackermonster.Speed) {
            if ((turncounter % 2) == 0) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }
        } else {
            if ((turncounter % 2) == 1) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }

        }
    }
}








package ditzler.cole.myapplication2.feature2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class protomons extends AppCompatActivity {

    Button Turn, HealButton, Status;

    ImageView PlayerIcon, EnemyIcon;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov;

    int playerid = 1;
    int attackerid = 1;

    int elongatedhealpowerP;
    int elongatedhealpowerA;
    int elongatedhealtimerP;
    int elongatedhealtimerA;

    int delayedhealpowerA = 0;
    int delayedhealpowerP = 0;
    int delayedhealtimerP = 0;
    int delayedhealtimerA = 0;

    
    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;
    
    public double kohbohid = 2;
    public double kohbohat = 100;
    public double kohbohsp = 100;
    public double kohbohde = 100;
    public double kohbohhe = 100;
    
    public double djoperid = 3;
    public double djoperat = 274;
    public double djopersp = 65;
    public double djoperde = 70;
    public double djoperhe = 80;
    
    public double schorpid = 4;
    public double schorpat = 60;
    public double schorpsp = 105;
    public double schorpde = 100;
    public double schorphe = 158;
    
    public double zaumeid = 5;
    public double zaumeat = 94;
    public double zaumesp = 180;
    public double zaumede = 77;
    public double zaumehe = 77;
    
    public double nhainhaiid = 6;
    public double nhainhaiat = 60;
    public double nhainhaisp = 60;
    public double nhainhaide = 60;
    public double nhainhaihe = 462;
    
    public double degeissdtid = 7;
    public double degeissdtat = 361;
    public double degeissdtsp = 61;
    public double degeissdtde = 60;
    public double degeissdthe = 76;
    
    public double yuggleid = 8;
    public double yuggleat = 155;
    public double yugglesp = 179;
    public double yugglede = 60;
    public double yugglehe = 66;
    
    public double bonguid = 9;
    public double bonguat = 60;
    public double bongusp = 65;
    public double bongude = 442;
    public double bonguhe = 61;

    int turncounter = 0;


    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;
    

    public class monst implements Cloneable{

        public double Idnum;
        public double Speed;
        public double Attack;
        public double Defense;
        public double Health;
        public int Moveslotattack;
        public int Moveslotspeed;
        public int Moveslotdefense;
        public int Moveslotheal;

        public monst (double idnum, double speed, double attack, double defense, double health, int moveslotattack, int moveslotspeed, int moveslotdefense, int moveslotheal){

            Idnum = idnum;
            Speed = speed;
            Attack = attack;
            Defense = defense;
            Health = health;
            Moveslotattack = moveslotattack;
            Moveslotspeed = moveslotspeed;
            Moveslotdefense = moveslotdefense;
            Moveslotheal = moveslotheal;
        }

        public monst clone() throws CloneNotSupportedException {
            monst clonedmonster = (monst) super.clone();
            return clonedmonster;
        }
    }

    monst Kunk = new monst(kunkid, kunksp, kunkat, kunkde, kunkhe, 0,0,0,HealMoves(0));
    monst Djoper = new monst(djoperid, djopersp, djoperat, djoperde, djoperhe, 0,0,0,HealMoves(0));
    monst Schorp = new monst(schorpid, schorpsp, schorpat, schorpde, schorphe, 0,0,0,HealMoves(0));
    monst Zaume = new monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, 0,0,0,HealMoves(0));
    monst Nhainhai = new monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, 0,0,0,HealMoves(0));
    monst Kohboh = new monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, 0,0,0,HealMoves(0));
    monst Degeissdt = new monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, 0,0,0,HealMoves(0));
    monst Yuggle = new monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, 0,0,0,HealMoves(0));
    monst Bongu = new monst(bonguid, bongusp, bonguat, bongude, bonguhe, 0,0,0,HealMoves(0));
    monst attackermonster;
    monst playermonster;
    monst error = new monst(0, 51, 51, 51, 753, 0,0,0,0);
    
/*
    public class kohbohtemplate implements Cloneable{

        public monst Kohboh = new monst(0, stats(100), stats(100), stats(100), stats(100), 0, 0,0,0);

        public kohbohtemplate (monst kohboh){


        }

    }
*/
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protomon);
        Patk = findViewById(R.id.playerattack);
        Pname = findViewById(R.id.playername);
        Pdef = findViewById(R.id.playerdefense);
        Pspe = findViewById(R.id.playerspeed);
        Pheal = findViewById(R.id.playerhealth);
        PHmov = findViewById(R.id.playerhemove);
        Eatk = findViewById(R.id.enemyattack);
        Ename = findViewById(R.id.enemyname);
        Edef = findViewById(R.id.enemydefense);
        Espe = findViewById(R.id.enemyspeed);
        Eheal = findViewById(R.id.enemyhealth);
        EHmov = findViewById(R.id.enemyhemove);
        PlayerIcon = findViewById(R.id.playerturn);
        EnemyIcon = findViewById(R.id.enemyturn);
        
        

        playerid = new Random().nextInt(9)+1;
        attackerid = new Random().nextInt(9)+1;
        try {
        playermonster =  Cloner(monstlist(playerid));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
         attackermonster =  Cloner(monstlist(attackerid));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        

        Turn = (Button) findViewById(R.id.attack);
        HealButton = (Button) findViewById(R.id.heal);
        Status = (Button) findViewById(R.id.statsbutton);
        
        Turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            attackermonster.Health = attackermonster.Health - ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(11)+55));
                        }else {
                            playermonster.Health = playermonster.Health - ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(11)+55));
                        }
                    }else {
                        if((turncounter%2) == 0){
                            playermonster.Health = playermonster.Health - ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(11)+55));
                        } else {
                            attackermonster.Health = attackermonster.Health - ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(11)+55));

                        }

                    }
                }


                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                if(delayedhealtimerA > 0){
                    delayedhealtimerA++;
                }


                if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                    attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                    delayedhealpowerA = 0;
                    delayedhealtimerA = 0;
                }


                if(delayedhealtimerP > 0){
                    delayedhealtimerP++;
                }


                if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                    playermonster.Health = playermonster.Health + delayedhealpowerP;
                    delayedhealpowerP = 0;
                    delayedhealtimerP = 0;
                }

                if (elongatedhealtimerA > 0) {
                    elongatedhealtimerA--;
                    attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                }


                if (elongatedhealtimerA == 0) {
                    elongatedhealpowerA = 0;
                }

                if (elongatedhealtimerP == 0) {
                    elongatedhealpowerP = 0;
                }

                if (elongatedhealtimerP > 0) {
                    elongatedhealtimerP--;
                    playermonster.Health = elongatedhealpowerP + playermonster.Health;
                }
            }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                    String displaystring = "%s";
                    String displaystringH = "%s/%s";
                    String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                    String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                    String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                    String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                    String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                    String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                    String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                    String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                    String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                    String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                    String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                    String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }


        });
            

        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            playermonster.Speed = playermonster.Speed * 1.2;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * 1.2;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            playermonster.Attack = playermonster.Attack * 1.2;
                            playermonster.Attack = Math.round(playermonster.Attack);
                        }else {
                            attackermonster.Speed = attackermonster.Speed * 1.2;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * 1.2;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            attackermonster.Attack = attackermonster.Attack * 1.2;
                            attackermonster.Attack = Math.round(attackermonster.Attack);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            attackermonster.Speed = attackermonster.Speed * 1.2;
                            attackermonster.Speed = Math.round(attackermonster.Speed);
                            attackermonster.Defense = attackermonster.Defense * 1.2;
                            attackermonster.Defense = Math.round(attackermonster.Defense);
                            attackermonster.Attack = attackermonster.Attack * 1.2;
                            attackermonster.Attack = Math.round(attackermonster.Attack);

                        }else {
                            playermonster.Speed = playermonster.Speed * 1.2;
                            playermonster.Speed = Math.round(playermonster.Speed);
                            playermonster.Defense = playermonster.Defense * 1.2;
                            playermonster.Defense = Math.round(playermonster.Defense);
                            playermonster.Attack = playermonster.Attack * 1.2;
                            playermonster.Attack = Math.round(playermonster.Attack);

                        }

                    }
                }



                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });
            

        HealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {

                    MaxHealthAttacker = attackermonster.Health;
                    MaxHealthPlayer = playermonster.Health;
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                                if(playermonster.Moveslotheal == 0) {
                                    playermonster.Health = playermonster.Health + (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                }else if(playermonster.Moveslotheal == 1){
                                    delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                                    if(delayedhealtimerP == 0) {
                                        delayedhealtimerP = 1;
                                    }
                                }else if(playermonster.Moveslotheal == 2){
                                    elongatedhealtimerP = elongatedhealtimerP + 5;
                                    int healtester =  (3*((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                    healtester = Math.round(healtester);
                                    if (healtester > elongatedhealpowerP){
                                        elongatedhealpowerP = healtester;
                                    }

                                }else {
                                    playermonster.Health = playermonster.Health + (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health - ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(11)+25));
                                }
                                if (playermonster.Health > MaxHealthPlayer){
                                    playermonster.Health = MaxHealthPlayer;
                                }
                        }else {
                            if(attackermonster.Moveslotheal == 0) {
                                attackermonster.Health = attackermonster.Health + (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if(attackermonster.Moveslotheal == 2) {
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                attackermonster.Health = attackermonster.Health + (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                playermonster.Health = playermonster.Health - ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(11)+25));
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }

                        }
                    }else {
                        if((turncounter%2) == 0){
                            if(attackermonster.Moveslotheal == 0) {
                                attackermonster.Health = attackermonster.Health + (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                            }else if (attackermonster.Moveslotheal == 1) {
                                delayedhealpowerA = (int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                                if(delayedhealtimerA == 0) {
                                    delayedhealtimerA = 1;
                                }
                            }  else if (attackermonster.Moveslotheal == 2){
                                elongatedhealtimerA = elongatedhealtimerA + 5;
                                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerA) {
                                    elongatedhealpowerA = healtester;
                                }
                            }else {
                                attackermonster.Health = attackermonster.Health + (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                playermonster.Health = playermonster.Health - ((attackermonster.Attack/playermonster.Defense)*(new Random().nextInt(11)+25));
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }
                        } else {
                            if(playermonster.Moveslotheal == 0) {
                                playermonster.Health = playermonster.Health + (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                            }else if(playermonster.Moveslotheal == 1){
                                delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                                if(delayedhealtimerP == 0) {
                                    delayedhealtimerP = 1;
                                }
                            }else if(playermonster.Moveslotheal == 2){
                                elongatedhealtimerP = elongatedhealtimerP + 5;
                                int healtester =  (3*((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense))))/7;
                                healtester = Math.round(healtester);
                                if (healtester > elongatedhealpowerP){
                                    elongatedhealpowerP = healtester;
                                }

                            }else {
                                playermonster.Health = playermonster.Health + (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health - ((playermonster.Attack/attackermonster.Defense)*(new Random().nextInt(11)+25));
                            }
                            if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }
                        }

                    }
                }


                if (playermonster.Health > 0 && attackermonster.Health > 0) {
                    if(delayedhealtimerA > 0){
                        delayedhealtimerA++;
                    }


                    if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                        delayedhealpowerA = 0;
                        delayedhealtimerA = 0;
                    }


                    if(delayedhealtimerP > 0){
                        delayedhealtimerP++;
                    }


                    if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                        playermonster.Health = playermonster.Health + delayedhealpowerP;
                        delayedhealpowerP = 0;
                        delayedhealtimerP = 0;
                    }

                    if (elongatedhealtimerA > 0) {
                        elongatedhealtimerA--;
                        attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
                    }


                    if (elongatedhealtimerA == 0) {
                        elongatedhealpowerA = 0;
                    }

                    if (elongatedhealtimerP == 0) {
                        elongatedhealpowerP = 0;
                    }

                    if (elongatedhealtimerP > 0) {
                        elongatedhealtimerP--;
                        playermonster.Health = elongatedhealpowerP + playermonster.Health;
                    }
                }
                playermonster.Health = Math.round(playermonster.Health);
                attackermonster.Health = Math.round(attackermonster.Health);

                if (playermonster.Health > MaxHealthPlayer) {
                    playermonster.Health = MaxHealthPlayer;
                }

                if (attackermonster.Health > MaxHealthAttacker){
                    attackermonster.Health = MaxHealthAttacker;
                }

                if(playermonster.Health <= 0){
                    playermonster.Health = 0;
                }
                if(attackermonster.Health <= 0){
                    attackermonster.Health = 0;
                }


                String displaystring = "%s";
                String displaystringH = "%s/%s";
                String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
                String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
                String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
                String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
                String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
                String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
                String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
                String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
                String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
                String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
                String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
                String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));



                Patk.setText("Attack: "+Pattackstring);
                Pdef.setText("Defense: "+Pdefensestring);
                Pspe.setText("Speed: "+Pspeedstring);
                Pheal.setText("Health: "+Phealthstring);
                Pname.setText(Pnamestring);
                PHmov.setText(Pmovehealstring);

                Eatk.setText("Attack: "+Eattackstring);
                Edef.setText("Defense: "+Edefensestring);
                Espe.setText("Speed: "+Espeedstring);
                Eheal.setText("Health: "+Ehealthstring);
                Ename.setText(Enamestring);
                EHmov.setText(Emovehealstring);


                if(playermonster.Health > 0 && attackermonster.Health > 0) {
                    turncounter++;
                    ImageChanger();
                }
            }
        });
            


    }

    public String HealingMoveNames(int move) {
        switch (move){
            case 0:
                return "Heal";
            case 1:
                return "Delayed Heal";
            case 2:
                return "Heal Over Time";
            case 3:
                return "Vampire Attack";
        }
        return "HealError";
    }

    public monst Cloner(monst monster) throws CloneNotSupportedException {

        monst newmonstclone = monster.clone();

        newmonstclone.Attack = stats(newmonstclone.Attack);
        newmonstclone.Speed = stats(newmonstclone.Speed);
        newmonstclone.Defense = stats(newmonstclone.Defense);
        newmonstclone.Health = stats(newmonstclone.Health);
        return  newmonstclone;
    }

    public double stats(double base){

        return base+50;

         //   return (base+(new Random().nextInt(101)-50));
    }
    
    public int damagecalculation(int targetdefence, int attackerstrength){
        
        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }
    public monst monstlist(int idnumber){

        switch (idnumber){

            case 0:
            break;
            case 1:
                return Kunk;
            case 2:
                return Kohboh;
            case 3:
                return Djoper;
            case 4:
                return Schorp;
            case 5:
                return Zaume;
            case 6:
                return Nhainhai;
            case 7:
                return Degeissdt;
            case 8:
                return Yuggle;
            case 9:
                return Bongu;
        }
        return error;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(4);

        return startingmove;
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
            }
        }else{
            return "error";
        }
        return "realerror";
    }

    public void ImageChanger() {


        if (playermonster.Speed <= attackermonster.Speed) {
            if ((turncounter % 2) == 0) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }
        } else {
            if ((turncounter % 2) == 1) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.d53);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.d53);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }

        }
    }
}
*/
