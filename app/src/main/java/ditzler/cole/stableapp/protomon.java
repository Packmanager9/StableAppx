package ditzler.cole.stableapp;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Random;

public class protomon extends AppCompatActivity {


    String CombatStringHolder ="";
   // String CombatStringHolder = "";
    int disgustingworkaround = 0;
    int disgustingworkarounda = 0;
    int disgustingworkaroundst = 0;
    int tangiblecheck = 1;
    int somebodystopme = 0;

    int checkA1 = 1;
    int checkB1 = 0;
    int checkC1 = 0;
    int checkA2 = 1;
    int checkB2 = 0;
    int checkC2 = 0;

    int copyAttackermoveforplayer = 0;
    int copyPlayermoveforattacker = 0;
    
    double holdhpBarAnimplayerstart = 0;
    double holdhpBarAnimAttackerstart= 0;
    double holdhpBarAnimAttackerEnd= 0;
    double holdhpBarAnimplayerEnd= 0;
    int atcount;
    int hecount;
    int stcount;
    int spcount;
    int atcountx;
    int hecountx;
    int stcountx;
    int spcountx;

    int reflectTimerOnPlayer;
    int reflectTimerOnAttacker;

    double reflectRatioPlayer;

    double reflectRatioAttacker;

    int hasbeentolab;

    int wherewebin = 0;
    int swapcode = 0;
    protected void onPause(){
        super.onPause();
        if(PlayerSounds != null) {
            PlayerSounds.pause();
        }
        if (AttackerSounds != null) {
            AttackerSounds.pause();
        }
        //  VictoryMusic.pause();


        if(AttackerSounds != null) {
            AttackerSounds.pause();

            songpos = AttackerSounds.getCurrentPosition();
        }

        if(PlayerSounds != null) {
            PlayerSounds.pause();

            songposp = PlayerSounds.getCurrentPosition();
        }
    }

    int flipperx = 0;

    MediaPlayer PlayerSounds;
    MediaPlayer AttackerSounds;

    int PlayerDelayedStatMove = -1;

    int AttackerDelayedStatMove = -1;

    ImageView Book, PlayerHPBAR, EnemyHPBAR,PlayerHPBARx, EnemyHPBARx, PlayerHPBARE, EnemyHPBARE;


    boolean[] dictionaryOfMonsters = new boolean[201];

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

    double k;

    String displaystring = "%s";
    String displaystringH = "%s/%s";

    String CombatString = "";
    String GombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";

    int copying = 0;
    Button Turn, HealButton, copybuttond ,copybuttona,copybuttonh,copybuttons,copybuttonp, Status, Reset, SwitchButton, NewMonsters, RivalButton, TestButton, TellButton, StatButton, CountButton, SpecialAttack, CaptureButton, DeployButton, GoToLabButton;

    ImageView PlayerIcon, EnemyIcon, playerbuff1, playerbuff2, playerbuff3, playerbuff4, playerbuff5;

    TextView Pname, Patk, Pheal, Pdef, Pspe, Ename, Eatk, Eheal, Edef, Espe, EHmov, PHmov, PSmov, ESmov, PAmov, EAmov, LongView, PDmov, EDmov;

    int spawncap = 128;
    int rotationcap = 129;


    int rivalNewnessCounter = 0;

    //  int monsterLoop = new Random().nextInt(spawncap)+1;
  int monsterLoop = 0;

  int songpos;

  int songposp;

    int scorekeepera;
    int scorekeeperp;

    int ActionNum;
    int playerid = new Random().nextInt(spawncap)+1;
    int attackerid = 1;

    int AttackerProtectStatsTimer;
    int PlayerProtectStatsTimer;

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
    int delayedhealpowerAsnow = 0;
    int delayedhealpowerPsnow = 0;
    int delayedhealtimerPsnow = 0;
    int delayedhealtimerAsnow = 0;

    int grouphealpowerA = 0;
    int grouphealpowerP = 0;
    int grouphealtimerP = 0;
    int grouphealtimerA = 0;


    public double kunkid = 1;
    public double kunkat = 75;
    public double kunksp = 60;
    public double kunkde = 120;
    public double kunkhe = 185;
   // MediaPlayer KunkSong;

    public double kohbohid = 2;
    public double kohbohat = 101; //100
    public double kohbohsp = 101; //100
    public double kohbohde = 101; //100
    public double kohbohhe = 101; //100
   // MediaPlayer KohbohSong;

    public double djoperid = 3;
    public double djoperat = 274;
    public double djopersp = 65;
    public double djoperde = 70;
    public double djoperhe = 80;

    public double schorpid = 4;
    public double schorpat = 65; // 60
    public double schorpsp = 105;
    public double schorpde = 100;
    public double schorphe = 158;

    public double zaumeid = 5;
    public double zaumeat = 94; // 94
    public double zaumesp = 180;
    public double zaumede = 77;
    public double zaumehe = 77;

    public double nhainhaiid = 6;
    public double nhainhaiat = 51;
    public double nhainhaisp = 52; // 52
    public double nhainhaide = 51; // 51
    public double nhainhaihe = 462;

    public double degeissdtid = 7;
    public double degeissdtat = 361;
    public double degeissdtsp = 61;
    public double degeissdtde = 60;
    public double degeissdthe = 76;

    public double yuggleid = 8;
    public double yuggleat = 160; //155
    public double yugglesp = 179;
    public double yugglede = 60;
    public double yugglehe = 66;

    public double bonguid = 9;
    public double bonguat = 60;
    public double bongusp = 64;
    public double bongude = 319;
    public double bonguhe = 83; /// 60

 //   public double bonguid = 9;
//    public double bonguat = 60;
 //   public double bongusp = 65;
 //   public double bongude = 422;
//    public double bonguhe = 61;

    public double giterigliaid = 10;
    public double giterigliaat = 111;
    public double giterigliasp = 95;
    public double giterigliade = 106; //101
    public double giterigliahe = 94;

    public double cyosterothid = 11;
    public double cyosterothat = 73; // 70
    public double cyosterothsp = 125;
    public double cyosterothde = 88; // 81 // 87
    public double cyosterothhe = 141;

    public double nentopodeid = 12;
    public double nentopodeat = 70; // 76
    public double nentopodesp = 63;
    public double nentopodede = 160;
    public double nentopodehe = 130;

    public double centiclakid = 13;
    public double centiclakat = 104; // 90
    public double centiclaksp = 111;
    public double centiclakde = 74;
    public double centiclakhe = 135;

    public double uggnawbid = 14;
    public double uggnawbat = 65;
    public double uggnawbsp = 159; // Real Uggnawb
    public double uggnawbde = 60;
    public double uggnawbhe = 160;

    /*   public double uggnawbid = 14;
    public double uggnawbat = 51;
    public double uggnawbsp = 214; // boosted Uggnawb
    public double uggnawbde = 51;
    public double uggnawbhe = 200;*/

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
    public double rongzeedde = 67; // 75
    public double rongzeedhe = 220;

    public double blattleid = 18;
    public double blattleat = 149;
    public double blattlesp = 67;
    public double blattlede = 109;
    public double blattlehe = 92;

    public double swogharnlerid = 19;
    public double swogharnlerat = 119; // 113
    public double swogharnlersp = 69;
    public double swogharnlerde = 119; // 113
    public double swogharnlerhe = 119; // 113

    public double adenolishid = 20;
    public double adenolishat = 123;
    public double adenolishsp = 69;
    public double adenolishde = 146;
    public double adenolishhe = 81;

    public double genaupresangid = 21;
    public double genaupresangat = 101;
    public double genaupresangsp = 71;
    public double genaupresangde = 100;
    public double genaupresanghe = 140;

    public double daahnidaid = 22;
    public double daahnidaat = 60;
    public double daahnidasp = 462;
    public double daahnidade = 52;
    public double daahnidahe = 61;

    public double sorbaid = 23;
    public double sorbaat = 150; // 150
    public double sorbasp = 67;
    public double sorbade = 151; // 151
    public double sorbahe = 66;

    public double jiyouid = 24;
    public double jiyouat = 67;
    public double jiyousp = 66;
    public double jiyoude = 150;  //150 // 140
    public double jiyouhe = 151;  //151 // 141

    public double sparvaeid = 25;
    public double sparvaeat = 162;
    public double sparvaesp = 62;
    public double sparvaede = 110;
    public double sparvaehe = 91;

    public double vellupid = 26;
    public double vellupat = 69; // 60
    public double vellupsp = 110;
    public double vellupde = 271;
    public double velluphe = 69; // 54

 //   public double vellupid = 26;
 //   public double vellupat = 60;
 //   public double vellupsp = 62;
 //   public double vellupde = 371;
 //   public double velluphe = 72;

    public double bellajaid = 27;
    public double bellajaat = 52; // 60
    public double bellajasp = 89;
    public double bellajade = 52; //55
    public double bellajahe = 319;

    public double levdzellid = 28;
    public double levdzellat = 61;
    public double levdzellsp = 113;
    public double levdzellde = 214;
    public double levdzellhe = 68;

    public double ryteggid = 29;
    public double ryteggat = 61;
    public double ryteggsp = 112;
    public double ryteggde = 61;
    public double rytegghe = 240;

    public double flashmerid = 30;
    public double flashmerat = 101; // 100
    public double flashmersp = 114;
    public double flashmerde = 84;
    public double flashmerhe = 105;

    public double schmodozerid = 31;
    public double schmodozerat = 139;
    public double schmodozersp = 72;
    public double schmodozerde = 141;
    public double schmodozerhe = 71;

    public double octgototid = 32;
    public double octgototat = 170;
    public double octgototsp = 95;
    public double octgototde = 66;
    public double octgotothe = 94;

    public double triauralid = 33;
    public double triauralat = 97; // 95
    public double triauralsp = 117;
    public double triauralde = 97;// 95
    public double triauralhe = 97;// 95

    public double dicytoid = 34;
    public double dicytoat = 86;
    public double dicytosp = 116;
    public double dicytode = 95;
    public double dicytohe = 116; // 106

    public double monopteryxid = 35;
    public double monopteryxat = 155;
    public double monopteryxsp = 115;
    public double monopteryxde = 75;
    public double monopteryxhe = 75;

    public double elastocarkid = 36;
    public double elastocarkat = 77;
    public double elastocarksp = 90;
    public double elastocarkde = 92;
    public double elastocarkhe = 157;

    public double toobapathid = 37;
    public double toobapathat = 94; // was 90 6/13/19
    public double toobapathsp = 94;
    public double toobapathde = 126;
    public double toobapathhe = 94;

    public double weeliosbopid = 38;
    public double weeliosbopat = 83;
    public double weeliosbopsp = 96;
    public double weeliosbopde = 112;
    public double weeliosbophe = 112;

    public double ihmpdrapid = 39;
    public double ihmpdrapat = 104;
    public double ihmpdrapsp = 99;
    public double ihmpdrapde = 68;
    public double ihmpdraphe = 141;

    public double epibazangid = 40;
    public double epibazangat = 134;
    public double epibazangsp = 82;
    public double epibazangde = 123;
    public double epibazanghe = 74;

    public double hemtanid = 41;
    public double hemtanat = 100;
    public double hemtansp = 80;
    public double hemtande = 125;
    public double hemtanhe = 100;

    public double ogoid = 42;
    public double ogoat = 165;
    public double ogosp = 165;
    public double ogode = 61;
    public double ogohe = 61;

    public double strachidid = 43;
    public double strachidat = 58;
    public double strachidsp = 167;
    public double strachidde = 99;
    public double strachidhe = 167;

/*
    public double strachidid = 43;
    public double strachidat = 62;
    public double strachidsp = 167;
    public double strachidde = 99;
    public double strachidhe = 107;

    public double strachidhe = 98;
*/
    public double toximasticaid = 44;
    public double toximasticaat = 71;
    public double toximasticasp = 172;
    public double toximasticade = 109;
    public double toximasticahe = 119;

    public double urcuriaid = 45;
    public double urcuriaat = 60;
    public double urcuriasp = 176;
    public double urcuriade = 104;
    public double urcuriahe = 150;

    public double hyuntressid = 46;
    public double hyuntressat = 77; //75
    public double hyuntresssp = 70;
    public double hyuntressde = 51; // 61
    public double hyuntresshe = 283; // 301

    public double mondosplakid = 47;
    public double mondosplakat = 115;
    public double mondosplaksp = 82;
    public double mondosplakde = 60;
    public double mondosplakhe = 176;

    public double kaheksagugeid = 48;
    public double kaheksagugeat = 80;
    public double kaheksagugesp = 83;
    public double kaheksagugede = 80;
    public double kaheksagugehe = 190;

    public double sapiosuantid = 49;
    public double sapiosuantat = 100;
    public double sapiosuantsp = 101;
    public double sapiosuantde = 70;
    public double sapiosuanthe = 142;

    public double munegullid = 50;
    public double munegullat = 130;
    public double munegullsp = 81;
    public double munegullde = 100;
    public double munegullhe = 94;

    public double sudakleezid = 51;
    public double sudakleezat = 72;
    public double sudakleezsp = 102;
    public double sudakleezde = 70;
    public double sudakleezhe = 194;

    public double halocordateid = 52;
    public double halocordateat = 170;
    public double halocordatesp = 120;
    public double halocordatede = 70;
    public double halocordatehe = 70;

    public double fædendronid = 53;
    public double fædendronat = 95;
    public double fædendronsp = 93;
    public double fædendronde = 60;
    public double fædendronhe = 187;

    public double osteoplangid = 54;
    public double osteoplangat = 84;
    public double osteoplangsp = 86;
    public double osteoplangde = 70;
    public double osteoplanghe = 198;

    public double жrachnidid = 55;
    public double жrachnidat = 211;
    public double жrachnidsp = 73;
    public double жrachnidde = 80;
    public double жrachnidhe = 81;

    public double Ϫlitchid = 56;
    public double Ϫlitchat = 135; //135
    public double Ϫlitchsp = 80; //74
    public double Ϫlitchde = 135; //135
    public double Ϫlitchhe = 80; //74

    public double በid = 57;
    public double በat = 88;
    public double በsp = 75;
    public double በde = 150;
    public double በhe = 101;

    public double mantidileid = 58;
    public double mantidileat = 79;
    public double mantidilesp = 76;
    public double mantidilede = 122;
    public double mantidilehe = 137;

    public double nokoylid = 59;
    public double nokoylat = 82;
    public double nokoylsp = 121;
    public double nokoylde = 70;
    public double nokoylhe = 154; //148

    public double яallodid = 60;
    public double яallodat = 100;
    public double яallodsp = 78;
    public double яallodde = 75;
    public double яallodhe = 166;

    public double algaetizerid = 61;
    public double algaetizerat = 98;
    public double algaetizersp = 79;
    public double algaetizerde = 104;
    public double algaetizerhe = 124;

    public double kachortid = 62;
    public double kachortat = 97; //102
    public double kachortsp = 77;
    public double kachortde = 67;
    public double kachorthe = 184;

    public double slamelionid = 63;
    public double slamelionat = 99;
    public double slamelionsp = 84;
    public double slamelionde = 86;
    public double slamelionhe = 145;

    public double ayatedaid = 64;
    public double ayatedaat = 77;
    public double ayatedasp = 85;
    public double ayatedade = 131;
    public double ayatedahe = 118;

    public double wochemid = 65;
    public double wochemat = 85;
    public double wochemsp = 87;
    public double wochemde = 100;
    public double wochemhe = 135;

    public double Ƕmunid = 66;
    public double Ƕmunat = 92;
    public double Ƕmunsp = 91;
    public double Ƕmunde = 107;
    public double Ƕmunhe = 115;

    public double ψkobathid = 67;
    public double ψkobathat = 94;
    public double ψkobathsp = 88;
    public double ψkobathde = 110;
    public double ψkobathhe = 112;

    public double gytanicid = 68;
    public double gytanicat = 174;
    public double gytanicsp = 97;
    public double gytanicde = 60;
    public double gytaniche = 100;

    public double βeißid = 69;
    public double βeißat = 85;
    public double βeißsp = 119;
    public double βeißde = 67;
    public double βeißhe = 159;

    public double gungholioid = 70;
    public double gungholioat = 253;
    public double gungholiosp = 92;
    public double gungholiode = 56;
    public double gungholiohe = 68;

    public double honigkönigid = 71;
    public double honigkönigat = 89; // 117 // 84
    public double honigkönigsp = 71;  // 57  // 97 // 80
    public double honigkönigde = 201; // 100 // 200
    public double honigkönighe = 74; // 151 // 71

    public double kungulpid = 72;
    public double kungulpat = 348; // 123 // 160
    public double kungulpsp = 77;
    public double kungulpde = 61; // 51
    public double kungulphe = 61;

    /*

    public double σativnellaid = -73;
    public double σativnellaat = 289;
    public double σativnellasp = 62; // 58
    public double σativnellade = 60;
    public double σativnellahe = 53; // 150
    public double kungulpid = 72;
    public double kungulpat = 133; // 123 // 160
    public double kungulpsp = 118;
    public double kungulpde = 77;
    public double kungulphe = 114;
    */

    public double σatinellaid = 73;
    public double σatinellaat = 84;
    public double σatinellasp = 62; // 58
    public double σatinellade = 143;
    public double σatinellahe = 118; // 150

    public double elocurlid = 74;
    public double elocurlat = 86;
    public double elocurlsp = 112;
    public double elocurlde = 99;
    public double elocurlhe = 117;

    public double takobieid = 75;
    public double takobieat = 120; //91
    public double takobiesp = 108; //123
    public double takobiede = 99; //115
    public double takobiehe = 91;  //91

    public double ōbchovyid = 76;
    public double ōbchovyat = 132; //
    public double ōbchovysp = 122; //
    public double ōbchovyde = 60; //
    public double ōbchovyhe = 109;  //

    public double nimnamnomid = 77;
    public double nimnamnomat = 137; // 133
    public double nimnamnomsp = 64; //
    public double nimnamnomde = 99; //
    public double nimnamnomhe = 119;  // 121

    public double tutewtooid = 78;
    public double tutewtooat = 119; //
    public double tutewtoosp = 119; //
    public double tutewtoode = 60; //
    public double tutewtoohe = 119;  //

    public double blanqastid = 79;
    public double blanqastat = 111; //
    public double blanqastsp = 74; //
    public double blanqastde = 111; //
    public double blanqasthe = 111;  //

    public double indeoid = 80;
    public double indeoat = 126; //
    public double indeosp = 126; //
    public double indeode = 51; //
    public double indeohe = 126;  //

    public double deblobbioid = 81;
    public double deblobbioat = 119; //
    public double deblobbiosp = 109; //
    public double deblobbiode = 99; //
    public double deblobbiohe = 89;  //

    public double knightstaceanid = 82;
    public double knightstaceanat = 117; //
    public double knightstaceansp = 107; //
    public double knightstaceande = 117; //
    public double knightstaceanhe = 78;  //

    public double prostraxid = 83;
    public double prostraxat = 325; //
    public double prostraxsp = 52; //
    public double prostraxde = 71; //
    public double prostraxhe = 71;  //

    public double haptozahenid = 84;
    public double haptozahenat = 52; //
    public double haptozahensp = 325; //
    public double haptozahende = 109; //
    public double haptozahenhe = 109;  //

    public double minkohabodid = 85;
    public double minkohabodat = 68; //
    public double minkohabodsp = 68; //
    public double minkohabodde = 325; //
    public double minkohabodhe = 68;  //

    public double zeenid = 86;
    public double zeenat = 72; // 72
    public double zeensp = 121; // 71
    public double zeende = 112; // 112
    public double zeenhe = 112;  // 112

    public double tacroachid = 87;
    public double tacroachat = 126; // 72
    public double tacroachsp = 124; // 71
    public double tacroachde = 126; // 112
    public double tacroachhe = 55;  // 112

    public double manterflyid = 88;
    public double manterflyat = 172; // 72
    public double manterflysp = 110; // 71
    public double manterflyde = 62; // 112
    public double manterflyhe = 90;  // 112


    public double bearyid = 89;
    public double bearyat = 189; // 72 // 166
    public double bearysp = 65; // 71  // 60 // 72
    public double bearyde = 60; // 112
    public double bearyhe = 143;  // 112 // 171

    public double sluggernautid = 90;
    public double sluggernautat = 150; 
    public double sluggernautsp = 53; 
    public double sluggernautde = 57; 
    public double sluggernauthe = 180;

    public double memeekid = 92;
    public double memeekat = 100;
    public double memeeksp = 102;
    public double memeekde = 100;
    public double memeekhe = 131;


    public double doughgnatid = 93;
    public double doughgnatat = 168;
    public double doughgnatsp = 153;
    public double doughgnatde = 51;
    public double doughgnathe = 85;


    public double ratticid = 94;
    public double ratticat = 154;
    public double ratticsp = 55;
    public double ratticde = 114;
    public double rattiche = 85;


    public double missileaneousid = 95;
    public double missileaneousat = 189;
    public double missileaneoussp = 57;
    public double missileaneousde = 65;
    public double missileaneoushe = 133;


    public double runnybabbitid = 96;
    public double runnybabbitat = 60;
    public double runnybabbitsp = 120;
    public double runnybabbitde = 55;
    public double runnybabbithe = 253;


    public double zubgondrakterid = 97;
    public double zubgondrakterat = 71;
    public double zubgondraktersp = 98;
    public double zubgondrakterde = 103;
    public double zubgondrakterhe = 151;

    public double whumpuhmpid = 98;
    public double whumpuhmpat = 104;
    public double whumpuhmpsp = 104;
    public double whumpuhmpde = 104;
    public double whumpuhmphe = 90;

    public double mangoonid = 99;
    public double mangoonat = 194;
    public double mangoonsp = 54;
    public double mangoonde = 59;
    public double mangoonhe = 161;

    public double scarbequeid = 100;
    public double scarbequeat = 131;
    public double scarbequesp = 106;
    public double scarbequede = 85;
    public double scarbequehe = 85;

    public double fwuffynumpkinsid = 101;
    public double fwuffynumpkinsat = 60;
    public double fwuffynumpkinssp = 58;
    public double fwuffynumpkinsde = 82;
    public double fwuffynumpkinshe = 350;


    public double dothogid = 102;
    public double dothogat = 85;
    public double dothogsp = 106;
    public double dothogde = 131;
    public double dothoghe = 85;

    public double reefcakeid = 103;
    public double reefcakeat = 65;
    public double reefcakesp = 70;
    public double reefcakede = 65;
    public double reefcakehe = 301;


    public double cheetzaid = 104;
    public double cheetzaat = 90;
    public double cheetzasp = 240;
    public double cheetzade = 58;
    public double cheetzahe = 80;


    public double sortsandid = 105;
    public double sortsandat = 56;
    public double sortsandsp = 79;
    public double sortsandde = 240;
    public double sortsandhe = 109;



    public double chilldebeestid = 106;
    public double chilldebeestat = 97;
    public double chilldebeestsp = 133;
    public double chilldebeestde = 78;
    public double chilldebeesthe = 100;


    public double communigatorid = 107;
    public double communigatorat = 122;
    public double communigatorsp = 137;
    public double communigatorde = 76;
    public double communigatorhe = 79;
    

    public double mossbossid = 108;
    public double mossbossat = 200;
    public double mossbosssp = 68;
    public double mossbossde = 82;
    public double mossbosshe = 91;

    public double vampreyid = 109;
    public double vampreyat = 246;
    public double vampreysp = 70;
    public double vampreyde = 54;
    public double vampreyhe = 110;

    public double parafoxid = 110;
    public double parafoxat = 88;
    public double parafoxsp = 140;
    public double parafoxde = 64;
    public double parafoxhe = 130;
    
    public double rhischlosserousid = 111;
    public double rhischlosserousat = 88;
    public double rhischlosseroussp = 64;
    public double rhischlosserousde = 140;
    public double rhischlosseroushe = 130;
    
    
    public double hykeynaid = 112;
    public double hykeynaat = 140;
    public double hykeynasp = 88;
    public double hykeynade = 64;
    public double hykeynahe = 130;

    public double tafantulaid = 113;
    public double tafantulaat = 130;
    public double tafantulasp = 90;
    public double tafantulade = 89;
    public double tafantulahe = 140;

    public double farmotid = 114;
    public double farmotat = 94;
    public double farmotsp = 71;
    public double farmotde = 87;
    public double farmothe = 176;

    public double beeurchinid = 115;
    public double beeurchinat = 176;
    public double beeurchinsp = 87;
    public double beeurchinde = 71;
    public double beeurchinhe = 94;

    public double flyinsoupid = 116;
    public double flyinsoupat = 117;
    public double flyinsoupsp = 103;
    public double flyinsoupde = 98;
    public double flyinsouphe = 89;

    public double meloncollieid = 117;
    public double meloncollieat = 89;
    public double meloncolliesp = 100;
    public double meloncolliede = 100;
    public double meloncolliehe = 117;

    public double scorphibianid = 118;
    public double scorphibianat = 180;
    public double scorphibiansp = 79;
    public double scorphibiande = 80;
    public double scorphibianhe = 81;

    public double geliphantid = 119;
    public double geliphantat = 78;
    public double geliphantsp = 78;
    public double geliphantde = 78;
    public double geliphanthe = 219;

    public double chimpansyid = 120;
    public double chimpansyat = 123;
    public double chimpansysp = 123;
    public double chimpansyde = 75;
    public double chimpansyhe = 91;
    
    public double xaltoxisid = 121;
    public double xaltoxisat = 120;
    public double xaltoxissp = 154;
    public double xaltoxisde = 60;
    public double xaltoxishe = 93;
    
    public double avokaboomid = 122;
    public double avokaboomat = 170;
    public double avokaboomsp = 69;
    public double avokaboomde = 51;
    public double avokaboomhe = 165;
    
    public double eggressid = 123;
    public double eggressat = 340;
    public double eggresssp = 73;
    public double eggressde = 51;
    public double eggresshe = 80;
    
    public double zentapedeid = 124;
    public double zentapedeat = 65;
    public double zentapedesp = 201;
    public double zentapedede = 65;
    public double zentapedehe = 118;
    
    public double probocetusid = 125;
    public double probocetusat = 66;
    public double probocetussp = 97; //90
    public double probocetusde = 160; //150
    public double probocetushe = 111;

    public double tankgolinid = 126;
    public double tankgolinat = 130;
    public double tankgolinsp = 104; //90
    public double tankgolinde = 130; //150
    public double tankgolinhe = 63;

    public double spiekgulid = 127;
    public double spiekgulat = 69;
    public double spiekgulsp = 59; //90
    public double spiekgulde = 321; //150
    public double spiekgulhe = 87;
    

    public double mnemontid = 128;
    public double mnemontat = 59;
    public double mnemontsp = 69;
    public double mnemontde = 87;
    public double mnemonthe = 321;
    

    public double qqqid = 0;
    public double qqqat = 100; //
    public double qqqsp = 100; //
    public double qqqde = 100; //
    public double qqqhe = 100;  //






    LinearLayout enemylayoutpage;

    int turncounter = 0;

    double Damage;

    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;
    ImageView EnemyDisplay, PlayerDisplay, Pheart, Eheart, Psword, Esword, Pboot, Eboot, Pshield, Eshield;


    public static class encounter implements Cloneable, Parcelable, Serializable {

        public monst[] EncounterList = new monst[8];

        public encounter (monst EncounteredMonsters0, monst EncounteredMonsters1, monst EncounteredMonsters2,monst EncounteredMonsters3, monst EncounteredMonsters4, monst EncounteredMonsters5, monst EncounteredMonsters6){
            EncounterList[0] = EncounteredMonsters0;
            EncounterList[1] = EncounteredMonsters1;
            EncounterList[2] = EncounteredMonsters2;
            EncounterList[3] = EncounteredMonsters3;
            EncounterList[4] = EncounteredMonsters4;
            EncounterList[5] = EncounteredMonsters5;
            EncounterList[6] = EncounteredMonsters6;
        }

        protected encounter(Parcel in) {
        }

        public static final Creator<encounter> CREATOR = new Creator<encounter>() {
            @Override
            public encounter createFromParcel(Parcel in) {
                return new encounter(in);
            }

            @Override
            public encounter[] newArray(int size) {
                return new encounter[size];
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

        public monst (monst monst){

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

        public static final Creator<monst> CREATOR = new Creator<monst>() {
            @Override
            public monst createFromParcel(Parcel in) {
                return new monst(in);
            }

            @Override
            public monst[] newArray(int size) {
                return new monst[size];
            }
        };

        public monst clone() throws CloneNotSupportedException {
            monst clonedmonster = (monst) super.clone();
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

    monst Kunk = new monst(kunkid, kunksp, kunkat, kunkde, kunkhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Djoper = new monst(djoperid, djopersp, djoperat, djoperde, djoperhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Schorp = new monst(schorpid, schorpsp, schorpat, schorpde, schorphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Zaume = new monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Nhainhai = new monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Kohboh = new monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Degeissdt = new monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Yuggle = new monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Bongu = new monst(bonguid, bongusp, bonguat, bongude, bonguhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Giteriglia = new monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Cyosteroth = new monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Nentopode = new monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Centiclak = new monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Uggnawb = new monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Grobhost = new monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Illelonab = new monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Rongzeed = new monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Blattle = new monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Swogharnler = new monst(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Adenolish = new monst(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Genaupresang = new monst(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
   // monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
   monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Sorba = new monst(sorbaid, sorbasp, sorbaat, sorbade, sorbahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Jiyou = new monst(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Sparvae = new monst(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Vellup = new monst(vellupid, vellupsp, vellupat, vellupde, velluphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Bellaja = new monst(bellajaid, bellajasp, bellajaat, bellajade, bellajahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Levdzell = new monst(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Rytegg = new monst(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Flashmer = new monst(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Schmodozer = new monst(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Octgotot = new monst(octgototid, octgototsp, octgototat, octgototde, octgotothe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Triaural = new monst(triauralid, triauralsp, triauralat, triauralde, triauralhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Dicyto = new monst(dicytoid, dicytosp, dicytoat, dicytode, dicytohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Monopteryx = new monst(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Elastocark = new monst(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Toobapath = new monst(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Weeliosbop = new monst(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ihmpdrap = new monst(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Epibazang = new monst(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Hemtan = new monst(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ogo = new monst(ogoid, ogosp, ogoat, ogode, ogohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Strachid = new monst(strachidid, strachidsp, strachidat, strachidde, strachidhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Toximastica = new monst(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Urcuria = new monst(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Hyuntress = new monst(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Mondosplak = new monst(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Kaheksaguge = new monst(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Sapiosuant = new monst(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Munegull = new monst(munegullid, munegullsp, munegullat, munegullde, munegullhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Sudakleez = new monst(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Halocordate = new monst(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Fædendron = new monst(fædendronid, fædendronsp, fædendronat, fædendronde, fædendronhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Osteoplang = new monst(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Жrachnid = new monst(жrachnidid, жrachnidsp, жrachnidat, жrachnidde, жrachnidhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ϫlitch = new monst(Ϫlitchid, Ϫlitchsp, Ϫlitchat, Ϫlitchde, Ϫlitchhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst በ = new monst(በid, በsp, በat, በde, በhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Mantidile = new monst(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Nokoyl = new monst(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Яallod = new monst(яallodid, яallodsp, яallodat, яallodde, яallodhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Algaetizer = new monst(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Kachort = new monst(kachortid, kachortsp, kachortat, kachortde, kachorthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Slamelion = new monst(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ayateda = new monst(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Wochem = new monst(wochemid, wochemsp, wochemat, wochemde, wochemhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ƕmun = new monst(Ƕmunid, Ƕmunsp, Ƕmunat, Ƕmunde, Ƕmunhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ψkobath = new monst(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Gytanic = new monst(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst βeiß = new monst(βeißid, βeißsp, βeißat, βeißde, βeißhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Gungholio = new monst(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Honigkönig = new monst(honigkönigid, honigkönigsp, honigkönigat, honigkönigde, honigkönighe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Kungulp = new monst(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Σatinella = new monst(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Elocurl = new monst(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Takobie = new monst(takobieid, takobiesp, takobieat, takobiede, takobiehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Ōbchovy = new monst(ōbchovyid, ōbchovysp, ōbchovyat, ōbchovyde, ōbchovyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Nimnamnom = new monst(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Tutewtoo = new monst(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Blanqast = new monst(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Indeo = new monst(indeoid, indeosp, indeoat, indeode, indeohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Deblobbio = new monst(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Knightstacean = new monst(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Prostrax = new monst(prostraxid, prostraxsp, prostraxat, prostraxde, prostraxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Haptozahen = new monst(haptozahenid, haptozahensp, haptozahenat, haptozahende, haptozahenhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Minkohabod = new monst(minkohabodid, minkohabodsp, minkohabodat, minkohabodde, minkohabodhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Zeen = new monst(zeenid, zeensp, zeenat, zeende, zeenhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Tacroach = new protomon.monst(tacroachid, tacroachsp, tacroachat, tacroachde, tacroachhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Manterfly = new protomon.monst(manterflyid, manterflysp, manterflyat, manterflyde, manterflyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Beary = new protomon.monst(bearyid, bearysp, bearyat, bearyde, bearyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Sluggernaut = new protomon.monst(sluggernautid, sluggernautsp, sluggernautat, sluggernautde, sluggernauthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Custom = new monst(91, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Memeek = new monst(memeekid, memeeksp, memeekat, memeekde, memeekhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Doughgnat = new monst(doughgnatid, doughgnatsp, doughgnatat, doughgnatde, doughgnathe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Rattic = new monst(ratticid, ratticsp, ratticat, ratticde, rattiche, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Missileaneous = new monst(missileaneousid, missileaneoussp, missileaneousat, missileaneousde, missileaneoushe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Runnybabbit = new monst(runnybabbitid, runnybabbitsp, runnybabbitat, runnybabbitde, runnybabbithe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Zubgondrakter = new monst(zubgondrakterid, zubgondraktersp, zubgondrakterat, zubgondrakterde, zubgondrakterhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Whumpuhmp = new monst(whumpuhmpid, whumpuhmpsp, whumpuhmpat, whumpuhmpde, whumpuhmphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Mangoon = new monst(mangoonid, mangoonsp, mangoonat, mangoonde, mangoonhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Scarbeque = new monst(scarbequeid, scarbequesp, scarbequeat, scarbequede, scarbequehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Fwuffynumpkins = new monst(fwuffynumpkinsid, fwuffynumpkinssp, fwuffynumpkinsat, fwuffynumpkinsde, fwuffynumpkinshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Dothog = new monst(dothogid, dothogsp, dothogat, dothogde, dothoghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Reefcake = new monst(reefcakeid, reefcakesp, reefcakeat, reefcakede, reefcakehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Cheetza = new monst(cheetzaid, cheetzasp, cheetzaat, cheetzade, cheetzahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Sortsand = new monst(sortsandid, sortsandsp, sortsandat, sortsandde, sortsandhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Chilldebeest = new monst(chilldebeestid, chilldebeestsp, chilldebeestat, chilldebeestde, chilldebeesthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Communigator = new monst(communigatorid, communigatorsp, communigatorat, communigatorde, communigatorhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Bossmoss = new monst(mossbossid, mossbosssp, mossbossat, mossbossde, mossbosshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Vamprey = new monst(vampreyid, vampreysp, vampreyat, vampreyde, vampreyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Parafoxical = new monst(parafoxid, parafoxsp, parafoxat, parafoxde, parafoxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
monst Rhischlosserous = new monst(rhischlosserousid, rhischlosseroussp, rhischlosserousat, rhischlosserousde, rhischlosseroushe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Hykeyna = new monst(hykeynaid, hykeynasp, hykeynaat, hykeynade, hykeynahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Tafantula = new monst(tafantulaid, tafantulasp, tafantulaat, tafantulade, tafantulahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Farmot = new monst(farmotid, farmotsp, farmotat, farmotde, farmothe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Beeurchin = new monst(beeurchinid, beeurchinsp, beeurchinat, beeurchinde, beeurchinhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Flysoup = new monst(flyinsoupid, flyinsoupsp, flyinsoupat, flyinsoupde, flyinsouphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Meloncollie = new monst(meloncollieid, meloncolliesp, meloncollieat, meloncolliede, meloncolliehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Scorphibian = new monst(scorphibianid, scorphibiansp, scorphibianat, scorphibiande, scorphibianhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Geliphant = new monst(geliphantid, geliphantsp, geliphantat, geliphantde, geliphanthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Chimpansy = new monst(chimpansyid, chimpansysp, chimpansyat, chimpansyde, chimpansyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Xaltoxis = new monst(xaltoxisid, xaltoxissp, xaltoxisat, xaltoxisde, xaltoxishe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Avokaboom = new monst(avokaboomid, avokaboomsp, avokaboomat, avokaboomde, avokaboomhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Eggress = new monst(eggressid, eggresssp, eggressat, eggressde, eggresshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
 monst Zentapede = new monst(zentapedeid, zentapedesp, zentapedeat, zentapedede, zentapedehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    monst Probocetus = new monst(probocetusid, probocetussp, probocetusat, probocetusde, probocetushe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
   monst Tankgolin = new monst(tankgolinid, tankgolinsp, tankgolinat, tankgolinde, tankgolinhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
  monst Spiekgul = new monst(spiekgulid, spiekgulsp, spiekgulat, spiekgulde, spiekgulhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
  monst Mnemont = new monst(mnemontid, mnemontsp, mnemontat, mnemontde, mnemonthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));

 //   encounter commonfight = new encounter(monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)));
    monst attackermonster;
    monst holdermonster;
    monst holdermonstery;
    monst holdermonsterx;
    monst playermonster;
    monst secondstartingmonster;
    monst thirdstartingmonster;
    monst error = new monst(0, 51, 51, 51, 753, 0,0,0,0,0);
    public monst[] PlayerMonsterStorage = new monst[9999];
    monst holdsong;

    int somecrapx;





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
        setContentView(R.layout.protomon_new);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        PlayerHPBARE = findViewById(R.id.PlayerMonsterHPBARE);
        PlayerHPBAR = findViewById(R.id.PlayerMonsterHPBAR);
        PlayerHPBARx = findViewById(R.id.PlayerMonsterHPBARx);
        EnemyHPBARx = findViewById(R.id.EnemyMonsterHPBARx);
        PlayerHPBAR.setImageResource(R.drawable.hpbaar);
        PlayerHPBAR.setColorFilter(Color.argb(255, 0, 255, 100));

        PlayerHPBARx.setImageResource(R.drawable.hpbaar);
        PlayerHPBARx.setColorFilter(Color.argb(0, 255, 0, 0));
        EnemyHPBARx.setImageResource(R.drawable.hpbaar);
        EnemyHPBARx.setColorFilter(Color.argb(255, 255, 0, 0));


        PlayerHPBAR.getLayoutParams().height = convertToDp(20);
        PlayerHPBAR.getLayoutParams().width = convertToDp(110);
        PlayerHPBAR.setScaleType(ImageView.ScaleType.FIT_XY);

        PlayerHPBARx.getLayoutParams().height = convertToDp(20);
        PlayerHPBARx.getLayoutParams().width = convertToDp(110);
        PlayerHPBARx.setScaleType(ImageView.ScaleType.FIT_XY);
        EnemyHPBARx.getLayoutParams().height = convertToDp(20);
        EnemyHPBARx.getLayoutParams().width = convertToDp(110);
        EnemyHPBARx.setScaleType(ImageView.ScaleType.FIT_XY);

        EnemyHPBARE = findViewById(R.id.EnemyMonsterHPBARE);
        EnemyHPBAR = findViewById(R.id.EnemyMonsterHPBAR);
        EnemyHPBAR.setImageResource(R.drawable.hpbaar);
        EnemyHPBAR.setColorFilter(Color.argb(255, 0, 255, 100));


        EnemyHPBAR.getLayoutParams().height = convertToDp(20);
        EnemyHPBAR.getLayoutParams().width = convertToDp(110);
        EnemyHPBAR.setScaleType(ImageView.ScaleType.FIT_XY);

        EnemyHPBARE.setImageResource(R.drawable.hpbaar);
        PlayerHPBARE.setImageResource(R.drawable.hpbaar);


        PlayerHPBARE.getLayoutParams().height = convertToDp(20);
        PlayerHPBARE.getLayoutParams().width = convertToDp(110);
        EnemyHPBARE.getLayoutParams().height = convertToDp(20);
        EnemyHPBARE.getLayoutParams().width = convertToDp(110);
        EnemyHPBARE.setScaleType(ImageView.ScaleType.FIT_XY);
        PlayerHPBARE.setScaleType(ImageView.ScaleType.FIT_XY);

        PlayerHPBARE.setColorFilter(Color.argb(255, 0, 0, 0));

        EnemyHPBARE.setColorFilter(Color.argb(255, 0, 0, 0));

        Pheart = findViewById(R.id.playerhealthicon);
        Pboot = findViewById(R.id.playerspeedicon);
        Pshield = findViewById(R.id.playerdefenseicon);
        Psword = findViewById(R.id.playerattackicon);
        Psword.setImageResource(R.drawable.swordx);
        Pheart.setImageResource(R.drawable.heart);
        Pboot.setImageResource(R.drawable.boot);
        Pshield.setImageResource(R.drawable.shieldsmall);

        Eheart = findViewById(R.id.enemyhealthicon);
        Eboot = findViewById(R.id.enemyspeedicon);
        Eshield = findViewById(R.id.enemydefenseicon);
        Esword = findViewById(R.id.enemyattackicon);
        Esword.setImageResource(R.drawable.swordx);
        Eheart.setImageResource(R.drawable.heart);
        Eboot.setImageResource(R.drawable.boot);
        Eshield.setImageResource(R.drawable.shieldsmall);
        Patk = findViewById(R.id.playerattack);
        Pname = findViewById(R.id.playername);
        Pdef = findViewById(R.id.playerdefense);
        Pspe = findViewById(R.id.playerspeed);
        Pheal = findViewById(R.id.playerhealth);
        PDmov = findViewById(R.id.playerdemove);
        PHmov = findViewById(R.id.playerhemove);
        PSmov = findViewById(R.id.playerspmove);
        PAmov = findViewById(R.id.playeratmove);
        Eatk = findViewById(R.id.enemyattack);
        Ename = findViewById(R.id.enemyname);
        Edef = findViewById(R.id.enemydefense);
        Espe = findViewById(R.id.enemyspeed);
        Eheal = findViewById(R.id.enemyhealth);
        EDmov = findViewById(R.id.enemydemove);
        EHmov = findViewById(R.id.enemyhemove);
        ESmov = findViewById(R.id.enemyspmove);
        EAmov = findViewById(R.id.enemyatmove);
        PlayerIcon = findViewById(R.id.playerturn);
        playerbuff1 = findViewById(R.id.playerbuffbox1);
        playerbuff2 = findViewById(R.id.playerbuffbox2);
        playerbuff3 = findViewById(R.id.playerbuffbox3);
        playerbuff4 = findViewById(R.id.playerbuffbox4);
        playerbuff5 = findViewById(R.id.playerbuffbox5);
        PlayerDisplay = findViewById(R.id.PlayerMonsterDisplay);
        EnemyDisplay = findViewById(R.id.EnemyMonsterDisplay);
        EnemyIcon = findViewById(R.id.enemyturn);
        LongView = findViewById(R.id.ScrollerLongText);
        //LongView.
        enemylayoutpage = findViewById(R.id.enemylayout);

     //   EnemyDisplay.setColorFilter(Color.argb(33, 40, 255, 170)); //SDFG
     //   PlayerDisplay.setColorFilter(Color.argb(33, 40, 255, 170)); //SDFG

/*
        playerbuff1.setImageResource(R.drawable.heartplus);
        playerbuff2.setImageResource(R.drawable.heartplus);
        playerbuff3.setImageResource(R.drawable.heartplus);
        playerbuff4.setImageResource(R.drawable.heartplus);
        playerbuff5.setImageResource(R.drawable.heartplus);
*/

      //  commonfight = new encounter(monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)),monstlist(new Random().nextInt(spawncap)));

        CapChanger();


        while (playerid == 22 || playerid == 5 || playerid == 14) {
            playerid = new Random().nextInt(spawncap) + 1;
            if (playerid == 22 || playerid == 5 || playerid == 14) {
                playerid = new Random().nextInt(spawncap) + 1;
                if (playerid == 22 || playerid == 5 || playerid == 14) {
                    playerid = new Random().nextInt(spawncap) + 1;
                    if (playerid == 22 || playerid == 5 || playerid == 14) {
                        playerid = new Random().nextInt(spawncap) + 1;
                        if (playerid == 22 || playerid == 5 || playerid == 14) {
                            playerid = new Random().nextInt(spawncap) + 1;
                        }
                    }
                }
            }
        }
  playerid = 128;
       int somecrap = new Random().nextInt(spawncap) + 1;
        while (somecrap == playerid) {
            somecrap = new Random().nextInt(spawncap) + 1;

        }
        somecrapx = new Random().nextInt(spawncap) + 1;
        while (somecrapx == playerid || somecrapx == somecrap) {
            somecrapx = new Random().nextInt(spawncap) + 1;

        }
       // somecrap = 126;
      //  playerid = 96;
       //attackerid = 86;
         attackerid = new Random().nextInt(spawncap)+1;
 attackerid = 128;


            try {
                playermonster = Cloner(monstlist(playerid)); // playerid
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }playermonster.UniqueID = UniqueIdentifier(0);
            try {
                attackermonster = Cloner(monstlist(attackerid)); // attackerid // 62 kachort, 22 daahnida, 20 adenolish
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }attackermonster.UniqueID = UniqueIdentifier(0);



            try {
                secondstartingmonster = Cloner(monstlist((int)somecrap)); // somecrap
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }secondstartingmonster.UniqueID = UniqueIdentifier(0);



            try {
                thirdstartingmonster = Cloner(monstlist((int)somecrapx)); // somecrapx
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }thirdstartingmonster.UniqueID = UniqueIdentifier(0);



        songlist(playermonster);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            attackersonglist(attackermonster);
        }



        MonsterImageChangerPlayer(playermonster);

        MonsterImageChangerAttacker(attackermonster);


  /*
        if (new Random().nextInt(2) == 0) {
            try {
                playermonster = Cloner(monstlist((int)playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist((int)Genaupresang.Idnum));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }else  {
            try {
                playermonster = Cloner(monstlist((int)Genaupresang.Idnum));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                attackermonster = Cloner(monstlist((int)attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
*/
        FirstTurnMethod();

        IDbox = (EditText) findViewById(R.id.typehereID);
        Turn = (Button) findViewById(R.id.attack);
        HealButton = (Button) findViewById(R.id.heal);
        SwitchButton = (Button) findViewById(R.id.Switcher);
        NewMonsters = (Button) findViewById(R.id.NewMonstersButton);
        TestButton = (Button) findViewById(R.id.RunIt);
        TellButton = (Button) findViewById(R.id.TellIt);
        StatButton = (Button) findViewById(R.id.Statusread);
        CountButton = (Button) findViewById(R.id.Count);
        RivalButton = (Button) findViewById(R.id.RivalSwap);
        Status = (Button) findViewById(R.id.statsbutton);
        Reset = (Button) findViewById(R.id.Resetti);
        SpecialAttack = (Button) findViewById(R.id.Special);
        CaptureButton = (Button) findViewById(R.id.Capture);
        DeployButton = (Button) findViewById(R.id.Deploy);
        GoToLabButton = (Button) findViewById(R.id.LabButton);

        Reset.setVisibility(View.INVISIBLE);
        TestButton.setVisibility(View.INVISIBLE);
     //  TellButton.setVisibility(View.INVISIBLE);
      //  StatButton.setVisibility(View.INVISIBLE);
        NewMonsters.setVisibility(View.INVISIBLE);
        CountButton.setVisibility(View.INVISIBLE);
        SwitchButton.setVisibility(View.INVISIBLE);
        IDbox.setVisibility(View.INVISIBLE);


        RivalRevealer();
        StringDisplayMethod();


        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        Turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            PlayBrainMethod(Turn);
                        }else {
                            RoboBrainMethod(Turn);
                        }
                    }else {

                        if((turncounter%2) == 0){
                            RoboBrainMethod(Turn);
                        } else {
                            PlayBrainMethod(Turn);
                        }

                    }
                }


                /*  DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker(); */




                String WhatHappenedString = TypesOfMotions(1);

                StringDisplayMethod();

/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }
                }


                if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                    WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                    } else if (whosturnisitanyway == 1) {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                    }
                    if (playermonster.Health <= 0){
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    }  if (attackermonster.Health <= 0){
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }if (attackermonster.Health <= 0 && playermonster.Health <= 0){
                        CombatString = String.format(CombatString + "A Tie!"+"\n");
                    }
                }
*/


                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);




                RivalRevealer();
                HealthBarUpdate();
            }


        });
        StatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangePlaces();

                double averagehealth = 0;
                double averagespeed = 0;
                double averagedefense = 0;
                double averageattack = 0;

                CombatString = "";
                int multspeed = 0;
                int multdef = 0;
                int multatk = 0;

                int multspeedx = 0;
                int multdefx = 0;
                int multatkx = 0;


                for (int i = 1; i < rotationcap; i++) {

                    multspeed = (int) stats(monstlist(i).Health) * (int) stats(monstlist(i).Speed);
                    multdef = (int) stats(monstlist(i).Health) * (int) stats(monstlist(i).Defense);
                    multatk = (int) stats(monstlist(i).Health) * (int) stats(monstlist(i).Attack);

                    int x = 1;
                    multspeedx = 70 * (int) stats(monstlist(i).Speed);
                    multdefx = 70 * (int) stats(monstlist(i).Defense);
                    multatkx = 70 * (int) stats(monstlist(i).Attack);
                    x = x * (int) stats(monstlist(i).Speed);
                    x = x * (int) stats(monstlist(i).Defense);
                    x = x * (int) stats(monstlist(i).Attack);

                    int lowest = Math.min(multatk, Math.min(multdef, multspeed));
                    int lowestx = Math.max(multatkx, Math.max(multdefx, multspeedx));

                    x = lowestx * lowest;

                    String yes = "%s";
                    String no = String.format(yes, lowest);
                    String nox = String.format(yes, lowestx);
                    String noxx = String.format(yes, x);

                    CombatString = String.format(CombatString + names(i) + " " + no + ", " + nox + ", " + x + "\n");


                }


                LongView.setText(CombatString);

                CombatString = "";


                if (flipperx == 1){

                    for (int i = 1; i < rotationcap; i++) {

                        averagespeed = averagespeed + stats(monstlist(i).Speed);
                        averagehealth = averagehealth + stats(monstlist(i).Health);
                        averageattack = averageattack + stats(monstlist(i).Attack);
                        averagedefense = averagedefense + stats(monstlist(i).Defense);


                    }


                averagespeed = averagespeed / spawncap;
                averagehealth = averagehealth / spawncap;
                averageattack = averageattack / spawncap;
                averagedefense = averagedefense / spawncap;


                String av = "%.0f";
                CombatString = String.format(av, averagehealth) + ", " + String.format(av, averagedefense) + ", " + String.format(av, averageattack) + ", " + String.format(av, averagespeed);

                LongView.setText(CombatString);

                CombatString = "";
            }
                if (flipperx == 0){
                    flipperx = 1;
                }else {
                    flipperx = 0;
                }
               // dispall();
                StringDisplayMethod();
                ImageChanger();
                HealthBarUpdate();
            }

        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double averagehealth = 0;
                double averagespeed = 0;
                double averagedefense = 0;
                double averageattack = 0;

                CombatString = "";
                GombatString = "";

                if ( turncounter == 0){
                    FirstTurnMethod();
                }

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                playermonster.Attack = stats(monstlist((int) playermonster.Idnum).Attack);
                playermonster.Defense = stats(monstlist((int) playermonster.Idnum).Defense);
                playermonster.Speed = stats(monstlist((int) playermonster.Idnum).Speed);

                attackermonster.Attack = stats(monstlist((int) attackermonster.Idnum).Attack);
                attackermonster.Defense = stats(monstlist((int) attackermonster.Idnum).Defense);
                attackermonster.Speed = stats(monstlist((int) attackermonster.Idnum).Speed);


                attackermonster.Moveslotattack = new Random().nextInt(17);

                attackermonster.Moveslotdefense = new Random().nextInt(9);

                attackermonster.Moveslotspeed = new Random().nextInt(17);
                attackermonster.Moveslotheal = new Random().nextInt(11);

                attackermonster.UniqueID = UniqueIdentifier(0);
                playermonster.UniqueID = UniqueIdentifier(0);

                StringDisplayMethod();

                for (int i = 1; i < rotationcap; i++){

                    averagespeed = averagespeed + stats(monstlist(i).Speed);
                    averagehealth = averagehealth + stats(monstlist(i).Health);
                    averageattack = averageattack + stats(monstlist(i).Attack);
                    averagedefense = averagedefense + stats(monstlist(i).Defense);



                }


                averagespeed = averagespeed / spawncap;
                averagehealth = averagehealth / spawncap;
                averageattack = averageattack / spawncap;
                averagedefense = averagedefense / spawncap;


                String av = "%.0f";
               // CombatString = String.format(av, averagehealth) + ", " + String.format(av, averagedefense) + ", " + String.format(av, averageattack) + ", " + String.format(av, averagespeed);


                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                TimerCancelMethod();
                    ImageChanger();
                RivalRevealer();
                HealthBarUpdate();
            }


        });

        CaptureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (attackermonster.Health <= 0){
                    elongatedhealwoundpowerA = 0;
                    elongatedwoundpowerA = 0;
                    elongatedhealwoundtimerA = 0;
                    elongatedwoundtimerA = 0;
                    elongatedglugtimerP = 0;
                    elongatedglugpowerP = 0;
                    healblocktgimerP = 0;
                    statblocktimerA = 0;
                    ClearStatChanges(attackermonster);
                }

             //   ClearStatChanges(playermonster);

                if(turncounter == 0) {
                    FirstTurnMethod();
                    turncounter = 1;
                    ImageChanger();
                }

                if (attackermonster.Health <= 0 && CollarNumber > 0){
                    RivalButton.setVisibility(View.VISIBLE);
                }else {
                  //  RivalButton.setVisibility(View.INVISIBLE);
                }


                if (attackermonster.Health <= 0 && CollarNumber > 0 && MonsterStorageCounter < 17) {
                    int token = 1;

                    for (int i = 0; i <= MonsterStorageCounter && PlayerMonsterStorage[i] != null; i++) {
                        if (PlayerMonsterStorage[i].UniqueID == attackermonster.UniqueID) {
                            token = 0;
                        }

                   //     if (PlayerMonsterStorage[i].Speed == attackermonster.Speed && PlayerMonsterStorage[i].Defense == attackermonster.Defense && PlayerMonsterStorage[i].Attack == attackermonster.Attack  && PlayerMonsterStorage[i].Moveslotspeed == attackermonster.Moveslotspeed  && PlayerMonsterStorage[i].Moveslotheal == attackermonster.Moveslotheal  && PlayerMonsterStorage[i].Moveslotattack == attackermonster.Moveslotattack){
                    //        token = 0;
                     //   }


                    }

                    if (token == 1) {
                       // attackermonster.Health = MaxHealthAttacker;
                        try {
                            PlayerMonsterStorage[MonsterStorageCounter] = attackermonster.clone();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        PlayerMonsterStorage[MonsterStorageCounter].Health = MaxHealthAttacker;
                        MonsterStorageCounter++;
                      //  enemylayoutpage.setVisibility(View.INVISIBLE);
                      //  CombatString = ""; // CAPTURE VIEW
                        CollarNumber--;

                        if(CollarNumber == 1){ CombatString = CombatString + String.format(names(PlayerMonsterStorage[MonsterStorageCounter-1].Idnum) + " Has Been Captured!\n" + "You Have " + String.format(displaystring, CollarNumber) + " Collar Left");}else{
                        CombatString = CombatString + String.format(names(PlayerMonsterStorage[MonsterStorageCounter-1].Idnum) + " Has Been Captured!\n" + "You Have " + String.format(displaystring, CollarNumber) + " Collars Left");}

                        CombatString = String.format(CombatString+"\n");

                        if(attackermonster.Idnum < rotationcap) {
                            dictionaryOfMonsters[(int)attackermonster.Idnum] = true;
                        }
                    }


                }else {

                    if (CollarNumber <= 0 ) {
                        CombatString = CombatString + String.format(names(attackermonster.Idnum) + " Can't Be Captured Without a Collar! \n");
                    }else if (attackermonster.Health > 0){
                        CombatString = CombatString + String.format(names(attackermonster.Idnum) + " Is Too Strong To Capture!\n");
                    }else if(MonsterStorageCounter > 16){
                        CombatString = CombatString + String.format("You Are Carrying Too Many Monsters!\n");
                    }

                 //   finish();
                }
                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);
                StringDisplayMethod();
                RivalRevealer();
            //    CombatString = "";


                if (attackermonster.Health <= 0 && CollarNumber >= 0 && MonsterStorageCounter <= 17){
                    RivalButton.setVisibility(View.VISIBLE);
                RIVALMAKER();

                }else{

                }

                HealthBarUpdate();
            }

        });

        GoToLabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CombatString = "";
                hasbeentolab++;
                if(swapcode == 0) {
                    wherewebin = 1;
                    swapcode = 1;
                    if (AttackerSounds != null) {
                        AttackerSounds.pause();

                        songpos = AttackerSounds.getCurrentPosition();
                    }

                    if (PlayerSounds != null) {
                        PlayerSounds.pause();

                        songposp = PlayerSounds.getCurrentPosition();
                    }

                /*
                if(CollarNumber <= 0){
                    CollarNumber = CollarNumber + 10;

                }*/

                    CollarNumber = 10;


                    try {
                        Labratory();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }

                HealthBarUpdate();
            }
        });
/*
        DeployButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Swap();



                ClearStatChanges(playermonster);
                int somekindofmonsterhealthtracker = 0;
                monst dummy = playermonster;

                if(turncounter == 0) {
                    FirstTurnMethod();
                    turncounter = 1;
                    ImageChanger();
                }

                String bant = IDbox.getText().toString();
                if((!TextUtils.isEmpty(bant)) && PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))] != null) {
                    if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                        playermonster = PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))];
                        DeployMonsterStorageCounter = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
                        try {
                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[(int) Double.parseDouble(String.valueOf(IDbox.getText()))].Idnum).clone().Health);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }

                    }else  {
                   //     CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                    }
                }else {// for

                    if (PlayerMonsterStorage[DeployMonsterStorageCounter] != null) {
                    int DeployHolder = DeployMonsterStorageCounter;

                   // for (DeployMonsterStorageCounter = DeployHolder; PlayerMonsterStorage[DeployMonsterStorageCounter%MonsterStorageCounter].Health == 0 && DeployMonsterStorageCounter != (DeployHolder-1);DeployMonsterStorageCounter = (DeployMonsterStorageCounter)%MonsterStorageCounter) {
                  //
                  //  }
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        int loopinhibitor = 0;
                        while(PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0 && loopinhibitor <= MonsterStorageCounter){
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }
                            loopinhibitor++;
                        }


                            //   DeployMonsterStorageCounter++;
                        } else {

                            //        CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                        }
                        //DeployMonsterStorageCounter++;
                    } else {
                        if (MonsterStorageCounter > 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                                playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                                try {
                                    MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                                } catch (CloneNotSupportedException e) {
                                    e.printStackTrace();
                                }
                                //    DeployMonsterStorageCounter++;
                            }
                        } else {

                            for (int I = 0; playermonster.Health == 0 && I < MonsterStorageCounter; I++) {
                                if (playermonster.Health <= 0) {
                                    DeployMonsterStorageCounter = (DeployMonsterStorageCounter+1) % (MonsterStorageCounter);
                                }

                                if (MonsterStorageCounter > 0 && playermonster.Health <= 0) {
                                    DeployMonsterStorageCounter = DeployMonsterStorageCounter % (MonsterStorageCounter);
                                    if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                                        playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                                        try {
                                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                                        } catch (CloneNotSupportedException e) {
                                            e.printStackTrace();
                                        }
                                        //    DeployMonsterStorageCounter++;
                                    }
                                }
                            }
                        }
                    }

/*

                    if (playermonster.Health > 0) {
                        for (int q = 0; playermonster.Health > 0 && q < MonsterStorageCounter; q++) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        }
                    }else {
                        for (int q = 0; playermonster.Health <= 0 && q < MonsterStorageCounter; q++) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                            playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                            try {
                                MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }

                        }
                    }


                    int DeployHolder = DeployMonsterStorageCounter;
                    for (int i = 0; i < MonsterStorageCounter; i++ ) {
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0) {
                            DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                        }
                      //  DeployMonsterStorageCounter++;
                    }
                   // DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);



                    int stopper = 0;

                    while(PlayerMonsterStorage[DeployMonsterStorageCounter].Health <= 0 && stopper < MonsterStorageCounter){
                        DeployMonsterStorageCounter = (DeployMonsterStorageCounter + 1) % (MonsterStorageCounter);
                        playermonster = PlayerMonsterStorage[DeployMonsterStorageCounter];
                        try {
                            MaxHealthPlayer = stats(monstlist((int) PlayerMonsterStorage[DeployMonsterStorageCounter].Idnum).clone().Health);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        stopper++;
                    }


                    // this should really be a loop but it wont behave

                }
           // }


                if (dummy != playermonster) {
                    songlist(playermonster);
                    CombatString = CombatString + names(playermonster.Idnum) + " is now Deployed! \n";
                    if (playermonster != dummy){
                        ResetWounds();
                    }
                }

                int DeploymentStorage = DeployMonsterStorageCounter;

                for (DeployMonsterStorageCounter = 0; DeployMonsterStorageCounter <= MonsterStorageCounter; DeployMonsterStorageCounter++){

                    if (PlayerMonsterStorage[DeployMonsterStorageCounter] != null) {
                        if (PlayerMonsterStorage[DeployMonsterStorageCounter].Health > 0) {
                            somekindofmonsterhealthtracker++;
                        }
                    }
                }

                DeployMonsterStorageCounter = DeploymentStorage;
                if (somekindofmonsterhealthtracker == 0 && MonsterStorageCounter > 0){
                    CombatString = CombatString + " All of your monsters are too injured to fight \n";

                }else if(somekindofmonsterhealthtracker == 1 && dummy != playermonster){
                    CombatString = CombatString + names(playermonster.Idnum) + " is your last hope! \n";
                }

                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);
                StringDisplayMethod();


              if (playermonster.Speed <= attackermonster.Speed) {
                  turncounter = 1;
              }else {
                  turncounter = 2;
              }

                ImageChanger();

                playerid = (int)playermonster.Idnum;
                RivalRevealer();


                MonsterImageChangerPlayer(playermonster);


                AlwaysMakeSureHealthIsLessThanMax();

            }


        });*/


DeployButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        if(AttackerSounds != null) {
            AttackerSounds.pause();

            songpos = AttackerSounds.getCurrentPosition();
        }

        if(PlayerSounds != null) {
            PlayerSounds.pause();

            songposp = PlayerSounds.getCurrentPosition();
        }
        try {
            Swap();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        HealthBarUpdate();
    }


});

        NewMonsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";


                playerid = new Random().nextInt(spawncap)+1;
                attackerid = new Random().nextInt(spawncap)+1;

                if (new Random().nextInt(2) == 0) {
                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }attackermonster.UniqueID = UniqueIdentifier(0);
                }else  {
                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }attackermonster.UniqueID = UniqueIdentifier(0);
                }
                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    ImageChanger();
                RivalRevealer();

                HealthBarUpdate();
            }


        });
        SwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";

                String bant = IDbox.getText().toString();
                if(!TextUtils.isEmpty(bant)) {
                    playerid = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
                }else {
                    //playerid = 0;
                    playerid =  (playerid%spawncap)+1;

                }


             //
             //   attackerid = new Random().nextInt(spawncap)+1;

                    try {
                        playermonster = Cloner(monstlist((int)playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }


                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                  //  turncounter = 1;
                    ImageChanger();
                RivalRevealer();

                HealthBarUpdate();
            }


        });
        RivalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rivalNewnessCounter++;

                if (rivalNewnessCounter < 4){

                enemylayoutpage.setVisibility(View.VISIBLE);
                // CombatString = "";
                String bant = IDbox.getText().toString();
             //   if(!TextUtils.isEmpty(bant)) {
             //  attackerid = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
              //  }else {
                     //attackerid = 0;
                     attackerid = new Random().nextInt(spawncap)+1;
                    //  }

               // attackerid =  (attackerid%spawncap)+1;


                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    attackermonster.UniqueID = UniqueIdentifier(0);

                MaxHealthAttacker = attackermonster.Health;

                attackermonster.Health = MaxHealthAttacker;


                }else {
                    monsterLoop = (monsterLoop%rotationcap)+1;
                    attackerid = monsterLoop;
                    try {
                        attackermonster = Cloner(monstlist((int)attackerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    attackermonster.UniqueID = UniqueIdentifier(0);
                    MaxHealthAttacker = attackermonster.Health;

                    attackermonster.Health = MaxHealthAttacker;
                    rivalNewnessCounter = 0;
                    enemylayoutpage.setVisibility(View.VISIBLE);
                }
               // playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();
               // CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    ImageChanger();
                RivalRevealer();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    attackersonglist(attackermonster);
                }

                HealthBarUpdate();
            }


        });
        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // CombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;

                IDstorage = playerid;


                for (playerid = 1; playerid < rotationcap; playerid++) {
                    for (runtoonehundred = 0; runtoonehundred < 1000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        try {
                            refresh();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        turncounter = 1;




                    }

                    try {
                        playermonster = Cloner(monstlist((int) playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        refresh();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }

                    if (playwins > attackwins){
                        scorekeeperp++;
                    }
                    if (playwins < attackwins){
                        scorekeepera++;
                    }

                    attackwins = 0;
                    playwins = 0;
                }


                 //   CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                    CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                playerid = IDstorage;
                try {
                    playermonster = Cloner(monstlist((int) playerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                ImageChanger();

                MaxHealthAttacker = attackermonster.Health;
                MaxHealthPlayer = playermonster.Health;

                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;

                StringDisplayMethod();

                RivalRevealer();



                HealthBarUpdate();
            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh() throws CloneNotSupportedException {
                attackermonster.Health = Cloner(monstlist((int) attackerid)).Health;
                playermonster.Health = Cloner(monstlist((int) playerid)).Health;
            }

        });
        CountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // CombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;



                    for (runtoonehundred = 0; runtoonehundred < 100000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        refresh();
                        turncounter = 1;




                    }



                    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins) + "\n");

                 //   CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                    ImageChanger();
                RivalRevealer();

                HealthBarUpdate();
            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh(){
                attackermonster.Health = MaxHealthAttacker;
                playermonster.Health = MaxHealthPlayer;
            }

        });
        TellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    TellFightsSolo();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }








        });

/*
        TellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CombatString = "";
                GombatString = "";
                String displaystring = "%s";
                String displaystringH = "%s/%s";
                int runtoonehundred =0;



                for (playerid = 1; playerid < 50; playerid++) {
                    try {
                        playermonster = Cloner(monstlist((int) playerid));
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    try {
                        refresh();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    for (runtoonehundred = 0; runtoonehundred < 1000; runtoonehundred++) {

                        for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0); turncounter++) {


                            if (playermonster.Speed <= attackermonster.Speed) {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    attackermonster.Health = attackermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    playermonster.Health = playermonster.Health - Damage;
                                }
                            } else {

                                if ((turncounter % 2) == 0) {
                                    whosturnisitanyway = 0;
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    playermonster.Health = playermonster.Health - Damage;
                                } else {
                                    whosturnisitanyway = 1;
                                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                    attackermonster.Health = attackermonster.Health - Damage;
                                }

                            }

                            if (playermonster.Health <= 0) {
                                attackwins++;
                            }


                            if (attackermonster.Health <= 0) {
                                playwins++;
                            }


                        }
                        try {
                            refresh();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                        turncounter = 1;




                    }


                    if (playwins > attackwins){
                        scorekeeperp++;
                    }
                    if (playwins < attackwins){
                        scorekeepera++;
                        GombatString = (GombatString + names(playerid) + "\n");
                    }

                    attackwins = 0;
                    playwins = 0;
                }


                //    CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

                    CombatString = CombatString + String.format( "Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, scorekeepera) + "\n") ;



                LongView.setText(CombatString + GombatString);

                    ActionNum = 0;
                    turncounter = 1;
                    attackwins = 0;
                    playwins = 0;
                    scorekeeperp = 0;
                    scorekeepera = 0;
                    ImageChanger();
            }

            public int damagecalculationloop(int targetdefence, int attackerstrength){

                double ratio = (targetdefence/attackerstrength);
                double damage = (ratio*(new Random().nextInt(11)+55));
                return (int) damage;
            }

            public void refresh() throws CloneNotSupportedException {
                attackermonster = Cloner(monstlist((int) attackerid));
                playermonster = Cloner(monstlist((int) playerid));
            }

        });
*/

        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            PlayBrainMethod(Status);
                        }else {
                            RoboBrainMethod(Status);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(Status);
                        }else {
                            PlayBrainMethod(Status);
                        }

                    }
                }

                /*
                DelayedStatusMethod();


                TurnDamageResolution();

               HealthChecker();
*/

                String WhatHappenedString = TypesOfMotions(3);
/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                        // CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                    } else if (whosturnisitanyway == 1) {

                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                        //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }
                }
*/
                DeathTest();
                StringDisplayMethod();
                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);



                RivalRevealer();
                HealthBarUpdate();
            }
        });


        HealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {
                    FirstTurnMethod();

                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            PlayBrainMethod(HealButton);
                        }else {
                            RoboBrainMethod(HealButton);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(HealButton);
                        } else {
                            PlayBrainMethod(HealButton);
                        }

                    }
                }


                /*  DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker(); */


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";
/*
                if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                    if (whosturnisitanyway == 0) {

                        if  (attackermonster.Moveslotheal == 0)  {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealpowerA > 0) {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                            }else {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                            }
                        }else if (attackermonster.Moveslotheal == 2) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                        }else if (attackermonster.Moveslotheal == 3) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                        }else if  (attackermonster.Moveslotheal == 4) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if  (attackermonster.Moveslotheal == 5)  {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
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
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                        }else if  (playermonster.Moveslotheal == 4)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                        }else if  (playermonster.Moveslotheal == 5)  {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                        }

                    }
                }
*/
                DeathTest();

                StringDisplayMethod();

                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);



                RivalRevealer();
                HealthBarUpdate();
           //     dispall();
            }

        });




        SpecialAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){
                        if((turncounter%2) == 0){
                            PlayBrainMethod(SpecialAttack);
                        }else {
                            RoboBrainMethod(SpecialAttack);
                        }
                    }else {
                        if((turncounter%2) == 0){
                            RoboBrainMethod(SpecialAttack);
                        } else {
                            PlayBrainMethod(SpecialAttack);
                        }

                    }
                }



                /*  DelayedStatusMethod();


                TurnDamageResolution();

                HealthChecker(); */


                String WhatHappenedString = TypesOfMotions(2);
                String displaystring = "%s";
                String displaystringH = "%s/%s";
/*
                if(turncounter > 0 && ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1)) {
                    if (whosturnisitanyway == 0) {


                        switch(attackermonster.Moveslotattack) {

                            case 0:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP)+ " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                                break;
                            case 1:
                                if (delayedblastpowerA > 0) {
                                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                                } else {
                                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                                }
                                break;
                            case 2:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                                break;
                            case 3:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) +  " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                                break;
                            case 4:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) +  " Turn Heal Block " + "\n");
                                break;
                            case 5:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Chips Defense for "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 6:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 7:
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                        }
                    } else if (whosturnisitanyway == 1) {

                        switch(playermonster.Moveslotattack) {

                            case 0:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA)+ " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                                break;
                            case 1:
                                if (delayedblastpowerP > 0) {
                                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                                } else {
                                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                                }
                                break;
                            case 2:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                                break;
                            case 3:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) +  " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                                break;
                            case 4:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) +  " Turn Heal Block " + "\n");
                                break;
                            case 5:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 6:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                            case 7:
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                                break;
                        }
                    }
                }*/

                DeathTest();
                StringDisplayMethod();


                CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);



                RivalRevealer();
                HealthBarUpdate();
            }
        });
 // ABDO
     //  try {
     //       TellFights();
      //  } catch (CloneNotSupportedException e) {
      //      e.printStackTrace();
      // }
        //  PlayBrainMethod(HealButton);
      //  RoboBrainMethod(HealButton);


        HealthBarUpdate();
       // dispall();
    }


    @TargetApi(Build.VERSION_CODES.M)
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 12345 && resultCode == RESULT_OK) {
             k = data.getIntExtra("MonsterChoice", (int)playermonster.Idnum);



            if (PlayerMonsterStorage[(int)k] != playermonster) {
           //     songlist(playermonster);
           //    CombatString = CombatString + names(playermonster.Idnum) + " is now Deployed! \n";
                if (playermonster != PlayerMonsterStorage[(int)k]){
                    ResetWounds();
                }
            }


            try {
                holdsong = playermonster.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            int alivecheck = 1;

            if (playermonster.Health <= 0){
                alivecheck = 0;

            }

        playermonster = PlayerMonsterStorage[(int)k];




        songlist(playermonster);



        if (AttackerSounds != null) {
            AttackerSounds.setLooping(true); // boogaloo
            AttackerSounds.seekTo(songpos);
            AttackerSounds.start();
        }else {
            //  AttackerSounds.setLooping(false); // boogaloo
            //  AttackerSounds.stop();
        }

        float f = (float)((float)((float)(attackermonster.UniqueID%102) + 50)/100);
        //  f = (float) .3;


        if (AttackerSounds != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                AttackerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
            }
        }

            MaxHealthPlayer = stats(monstlist((int)playermonster.Idnum).Health);

        if ( turncounter == 0){
            FirstTurnMethod();
        }

     //   attackermonster.Health = MaxHealthAttacker;
     //   playermonster.Health = MaxHealthPlayer;

        playermonster.Attack = stats(monstlist((int) playermonster.Idnum).Attack);
        playermonster.Defense = stats(monstlist((int) playermonster.Idnum).Defense);
        playermonster.Speed = stats(monstlist((int) playermonster.Idnum).Speed);

   //     attackermonster.Attack = stats(monstlist((int) attackermonster.Idnum).Attack);
   //     attackermonster.Defense = stats(monstlist((int) attackermonster.Idnum).Defense);
   //     attackermonster.Speed = stats(monstlist((int) attackermonster.Idnum).Speed);




            healblocktgimerA = 0;
            elongatedhealwoundtimerP = 0;
            elongatedwoundtimerP = 0;
            elongatedglugtimerA = 0;
            statblocktimerP = 0;

      //  TimerCancelMethod();

   //
            CombatString = CombatString + names(playermonster.Idnum) + " is now Deployed! \n";
        CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

        ActionNum = 0;

        if (playermonster.Speed <= attackermonster.Speed) {
            if(alivecheck == 0){
                turncounter = 1;
            }else {
                turncounter = 1;
            }
        }else {

            if(alivecheck == 0){
                turncounter = 1;
            }else {
                turncounter = 2;
            }

        }

       // RoboBrainMethod(DeployButton);
            StringDisplayMethod();


            ImageChanger();
        RivalRevealer();
    }
        if (resultCode == RESULT_CANCELED){

          //  songlist(playermonster);
            //   if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //        attackersonglist(attackermonster);
            //    }



            if (AttackerSounds != null) {
                AttackerSounds.setLooping(true); // boogaloo
                AttackerSounds.seekTo(songpos);
                AttackerSounds.start();
            }else {
                //  AttackerSounds.setLooping(false); // boogaloo
                //  AttackerSounds.stop();
            }

            float f = (float)((float)((float)(attackermonster.UniqueID%102) + 50)/100);
            //  f = (float) .3;


            if (AttackerSounds != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    AttackerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
                }
            }


            if(holdsong.UniqueID == playermonster.UniqueID) {
                if (PlayerSounds != null) {
                    PlayerSounds.setLooping(true); // boogaloo
                    PlayerSounds.seekTo(songposp);
                    PlayerSounds.start();
                } else {
                    //  AttackerSounds.setLooping(false); // boogaloo
                    //  AttackerSounds.stop();
                }
            }else {
                if (PlayerSounds != null) {
                    PlayerSounds.setLooping(true); // boogaloo
                    PlayerSounds.seekTo(0);
                    PlayerSounds.start();

                } songposp = 0;
            }
            float fp = (float)((float)((float)(playermonster.UniqueID%102) + 50)/100);
            //  f = (float) .3;


            if (PlayerSounds != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    PlayerSounds.setPlaybackParams(new PlaybackParams().setSpeed(fp));
                }
            }
        }
        if(attackermonster.Idnum == Custom.Idnum){
            try {
                MaxHealthAttacker = stats(monstlist((int)Custom.Idnum).clone().Health);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        if(playermonster.Idnum == Custom.Idnum){
            try {
                MaxHealthPlayer = stats(monstlist((int)Custom.Idnum).clone().Health);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);


        HealthBarUpdate();
    }



    private void Labratory() throws CloneNotSupportedException {


        TimerCancelMethod();



        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();

        int countthroughmonsters = 0;
        String DustMe = "%s";
       // String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));




        monst Passablemonster = new monst(monstlist(playerid)).clone();
        Intent i = new Intent();
        Bundle b = new Bundle();
        b.putInt("Storage", MonsterStorageCounter);
        while (countthroughmonsters < MonsterStorageCounter){



            String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));
            b.putParcelable(BustMe, PlayerMonsterStorage[countthroughmonsters]);




            Gson gson = new Gson();
            String json = gson.toJson(PlayerMonsterStorage[countthroughmonsters]);
            editor.putString(BustMe, json);
            editor.apply();

            countthroughmonsters++;
        }


        i.putExtra("Dictionary", dictionaryOfMonsters);


     //   b.putParcelable("Monster", Passablemonster);




        i.putExtras(b);
        i.setClass(this, GarlitosLab.class);


        startActivity(i);

      //  Intent go = new Intent(this, GarlitosLab.class);
     //   startActivity(go);

        HealthBarUpdate();
    }
    private void HealthChecker() {

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
    }

    private void DelayedStatusMethod() {



        double Holdthisformeplayerattack =  playermonster.Attack;
        double Holdthisformemonsterattack =  attackermonster.Attack;
        double Holdthisformeplayerdefense =  playermonster.Defense;
        double Holdthisformemonsterdefense =  attackermonster.Defense;
        double Holdthisformeplayerspeed =  playermonster.Speed;
        double Holdthisformemonsterspeed =  attackermonster.Speed;




        if(AttackerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
            AttackerStatDelayTimer--;
        }

        if(PlayerStatDelayTimer > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
            PlayerStatDelayTimer--;
        }
/*
        if (PlayerStatDelayTimer == 0){
            PlayerDelayedStatMove = -1;

        }

        if (AttackerStatDelayTimer == 0){
            AttackerDelayedStatMove = -1;

        }*/

        if(AttackerStatDelayTimer == 0){
            AttackerStatDelayTimer = -1;
            switch (AttackerDelayedStatMove){
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
            switch (PlayerDelayedStatMove){
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


        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);


        if (statblocktimerP != 0) {
            if (Holdthisformeplayerattack < playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense < playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed < playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (statblocktimerA != 0) {
            if (Holdthisformemonsterattack < attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense < attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed < attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }


        if (PlayerProtectStatsTimer != 0) {
            if (Holdthisformeplayerattack > playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense > playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed > playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (AttackerProtectStatsTimer != 0) {
            if (Holdthisformemonsterattack > attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense > attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed > attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }


    }

    public void TurnDamageResolution() {
        if (playermonster.Health > 0 && attackermonster.Health > 0) {

            double Holdthisformeplayer =  playermonster.Health;
            double HoldthisformeplayerReflect =  playermonster.Health;
            double HoldthisformeplayerReflectx =  playermonster.Health;
            double Holdthisformemonster =  attackermonster.Health;
            double HoldthisformemonsterReflect =  attackermonster.Health;
            double HoldthisformemonsterReflectx =  attackermonster.Health;
            double Holdthisformemonsterwounds =  attackermonster.Health;
            double Holdthisformeplayerwounds =  playermonster.Health;

            if (statblocktimerP > 0){
                statblocktimerP--;
            }
            if (statblocktimerA > 0){
                statblocktimerA--;
            }

            if(delayedhealtimerA > 0){
                delayedhealtimerA++;
            }

            if(PlayerProtectStatsTimer > 0) {
                PlayerProtectStatsTimer--;

            }
            if(AttackerProtectStatsTimer > 0) {
                AttackerProtectStatsTimer--;

            }
            if(delayedhealtimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health + delayedhealpowerA;
                delayedhealpowerA = 0;
                delayedhealtimerA = 0;
            }

            
            
            if(delayedhealtimerAsnow > 0){
                delayedhealtimerAsnow++;
            }
            if(delayedhealtimerAsnow > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health + delayedhealpowerAsnow;
                delayedhealpowerAsnow = 0;
                delayedhealtimerAsnow = 0;

                attackermonster.Attack = Math.round((attackermonster.Attack*1.0167));
                attackermonster.Defense = Math.round((attackermonster.Defense*1.0167));
                attackermonster.Speed = Math.round((attackermonster.Speed*1.0167));
                attackermonster.Attack = Math.round((attackermonster.Attack*1.0167));
                attackermonster.Defense = Math.round((attackermonster.Defense*1.0167));
                attackermonster.Speed = Math.round((attackermonster.Speed*1.0167));
            }




            if(delayedhealtimerP > 0){
                delayedhealtimerP++;
            }


            if(delayedhealtimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                playermonster.Health = playermonster.Health + delayedhealpowerP;
                delayedhealpowerP = 0;
                delayedhealtimerP = 0;
            }

            if(delayedhealtimerPsnow > 0){
                delayedhealtimerPsnow++;
            }


            if(delayedhealtimerPsnow > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                playermonster.Health = playermonster.Health + delayedhealpowerPsnow;
                delayedhealpowerPsnow = 0;
                delayedhealtimerPsnow = 0;

                playermonster.Attack = Math.round((playermonster.Attack*1.0167));
                playermonster.Defense = Math.round((playermonster.Defense*1.0167));
                playermonster.Speed = Math.round((playermonster.Speed*1.0167));
                playermonster.Attack = Math.round((playermonster.Attack*1.0167));
                playermonster.Defense = Math.round((playermonster.Defense*1.0167));
                playermonster.Speed = Math.round((playermonster.Speed*1.0167));
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


            if (elongatedhealtimerA > 0) {
                elongatedhealtimerA--;
                attackermonster.Health = elongatedhealpowerA + attackermonster.Health;
            }


            if (elongatedglugtimerP == 0) {
                elongatedglugpowerP = 0;
            }
            if (elongatedglugtimerA == 0) {
                elongatedglugpowerA = 0;
            }

            if (elongatedglugtimerP > 0) {
                elongatedglugtimerP--;
                playermonster.Health = playermonster.Health + elongatedglugpowerP;
                attackermonster.Health = attackermonster.Health - elongatedglugpowerP;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - elongatedglugpowerP;
                Holdthisformemonsterwounds = Holdthisformemonsterwounds - elongatedglugpowerP;
                Holdthisformemonster = Holdthisformemonster - elongatedglugpowerP;

            }

            if (elongatedglugtimerA > 0) {
                elongatedglugtimerA--;
                attackermonster.Health = attackermonster.Health + elongatedglugpowerA;
                playermonster.Health = playermonster.Health - elongatedglugpowerA;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - elongatedglugpowerA;
                Holdthisformeplayerwounds = Holdthisformeplayerwounds - elongatedglugpowerA;
                Holdthisformeplayer = Holdthisformeplayer - elongatedglugpowerA;
            }

            if (healblocktgimerA > 0 && playermonster.Health >= Holdthisformeplayer){
                playermonster.Health = Holdthisformeplayer;
            }if (healblocktgimerP > 0 && attackermonster.Health >= Holdthisformemonster){
                attackermonster.Health = Holdthisformemonster;
            }

            if (healblocktgimerP > 0){
                healblocktgimerP--;
            }
            if (healblocktgimerA > 0){
                healblocktgimerA--;
            }


            if (elongatedhealwoundpowerP > 0 && healblocktgimerA == 0 && playermonster.Health >= Holdthisformeplayerwounds){
                playermonster.Health = Math.round((Holdthisformeplayerwounds + playermonster.Health)/2);
            }if (elongatedhealwoundpowerA > 0 && healblocktgimerP == 0  && attackermonster.Health >= Holdthisformemonsterwounds){
                attackermonster.Health = Math.round((Holdthisformemonsterwounds + attackermonster.Health)/2);
            }


            if(delayedblasttimerA > 0){
                delayedblasttimerA++;
            }
            if(delayedblasttimerA > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                playermonster.Health = playermonster.Health - delayedblastpowerA;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - delayedblastpowerA;
                delayedblastpowerA = 0;
                delayedblasttimerA = 0;
            }
            if(delayedblasttimerP > 0){
                delayedblasttimerP++;
            }
            if(delayedblasttimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health - delayedblastpowerP;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - delayedblastpowerP;
                delayedblastpowerP = 0;
                delayedblasttimerP = 0;
            }

            if (elongatedwoundtimerA == 0) {
                elongatedwoundpowerA = 0;
            }

            if (elongatedwoundtimerP == 0) {
                elongatedwoundpowerP = 0;
            }

            if (elongatedhealwoundtimerA == 0) {
                elongatedhealwoundpowerA = 0;
            }

            if (elongatedhealwoundtimerP == 0) {
                elongatedhealwoundpowerP = 0;
            }



            if (elongatedhealwoundtimerP > 0) {
                elongatedhealwoundtimerP--;
                playermonster.Health = playermonster.Health - elongatedhealwoundpowerP;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - elongatedhealwoundpowerP;
            }

            if (elongatedhealwoundtimerA > 0) {
                elongatedhealwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedhealwoundpowerA;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - elongatedhealwoundpowerA;
            }


            if (grouphealtimerP > 0){
                grouphealtimerP--;

            }

            if (grouphealtimerA > 0){
                grouphealtimerA--;

            }

            if (grouphealtimerP != 0){
            for (int w = 0; w < MonsterStorageCounter; w++) {
                PlayerMonsterStorage[w].Health = PlayerMonsterStorage[w].Health + grouphealpowerP;

                if (PlayerMonsterStorage[w].Health >= stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health)) {
                    PlayerMonsterStorage[w].Health = stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health);
                  }
                }
            }

            if (grouphealtimerA != 0){
                    attackermonster.Health = attackermonster.Health + grouphealpowerA;

                    if (attackermonster.Health >= stats(monstlist((int) attackermonster.Idnum).Health)) {
                        attackermonster.Health = stats(monstlist((int) attackermonster.Idnum).Health);
                    }
                }


            if (grouphealtimerP == 0){
                grouphealpowerP = 0;
            }

            if (grouphealtimerA == 0){
                grouphealpowerA = 0;
            }


            /*
            for (int w = 0; w < MonsterStorageCounter; w++){
                PlayerMonsterStorage[w].Health = PlayerMonsterStorage[w].Health + grouphealpowerP;

                if (PlayerMonsterStorage[w].Health >= stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health)){
                    PlayerMonsterStorage[w].Health = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).Health);
                }
                build attacker storage first.
            }*/



            if (elongatedwoundtimerP > 0) {
                elongatedwoundtimerP--;
                playermonster.Health = playermonster.Health - elongatedwoundpowerP;
                HoldthisformeplayerReflect = HoldthisformeplayerReflect - elongatedwoundpowerP;
            }

            if (elongatedwoundtimerA > 0) {
                elongatedwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedwoundpowerA;
                HoldthisformemonsterReflect = HoldthisformemonsterReflect - elongatedwoundpowerA;
            }
            int passreflectplayer = (int)(HoldthisformeplayerReflectx - HoldthisformeplayerReflect);
            PlayerReflect(passreflectplayer);


            int passreflectattacker = (int)(HoldthisformemonsterReflectx - HoldthisformemonsterReflect);
            AttackerReflect(passreflectattacker);

            if(reflectTimerOnPlayer > 0) {
                reflectTimerOnPlayer--;
            }
            if(reflectTimerOnAttacker > 0) {
                reflectTimerOnAttacker--;
            }

            if (reflectTimerOnAttacker == 0){
                reflectRatioAttacker = 0;

            }
            if (reflectTimerOnPlayer == 0){
                reflectRatioPlayer = 0;

            }


            StatAbuseCurb(playermonster);
            StatAbuseCurb(attackermonster);


            if (playermonster.Health <= 0){


                CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

            }

            if (attackermonster.Health <= 0){


                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

            }
       }


        AlwaysMakeSureHealthIsLessThanMax();


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
            case 10:
                return "Delayed Big Snowball";  // double snowball after delay
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
            case 15:
                return "Reflective Shield";
            case 16:
                return "Copy";
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

    public monst Cloner(monst monster) throws CloneNotSupportedException {

        monst newmonstclone = monster.clone();
        newmonstclone.Attack = stats(newmonstclone.Attack);
        newmonstclone.Speed = stats(newmonstclone.Speed);
        newmonstclone.Defense = stats(newmonstclone.Defense);
        newmonstclone.Health = stats(newmonstclone.Health);
        newmonstclone.Moveslotattack = SpecialMoves(0);
        newmonstclone.Moveslotheal = HealMoves(0);
        newmonstclone.Moveslotspeed = SpeedMoves(0);
        newmonstclone.Moveslotdefense = AttackMoves(0);
        return  newmonstclone;
    }

    public double stats(double base){

             return base+50;
       //     return base;
       //    return (base+(new Random().nextInt(101)-50));
    }

    public int damagecalculation(int targetdefence, int attackerstrength){

        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }
    public monst monstlist(int idnumber){

        switch (idnumber) {

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
            case 19:
                return Swogharnler;
            case 20:
                return Adenolish;
            case 21:
                return Genaupresang;
            case 22:
                return Daahnida;
            case 23:
                return Sorba;
            case 24:
                return Jiyou;
            case 25:
                return Sparvae;
            case 26:
                return Vellup;
            case 27:
                return Bellaja;
            case 28:
                return Levdzell;
            case 29:
                return Rytegg;
            case 30:
                return Flashmer;
            case 31:
                return Schmodozer;
            case 32:
                return Octgotot;
            case 33:
                return Triaural;
            case 34:
                return Dicyto;
            case 35:
                return Monopteryx;
            case 36:
                return Elastocark;
            case 37:
                return Toobapath;
            case 38:
                return Weeliosbop;
            case 39:
                return Ihmpdrap;
            case 40:
                return Epibazang;
            case 41:
                return Hemtan;
            case 42:
                return Ogo;
            case 43:
                return Strachid;
            case 44:
                return Toximastica;
            case 45:
                return Urcuria;
            case 46:
                return Hyuntress;
            case 47:
                return Mondosplak;
            case 48:
                return Kaheksaguge;
            case 49:
                return Sapiosuant;
            case 50:
                return Munegull;
            case 51:
                return Sudakleez;
            case 52:
                return Halocordate;
            case 53:
                return Fædendron;
            case 54:
                return Osteoplang;
            case 55:
                return Жrachnid;
            case 56:
                return Ϫlitch;
            case 57:
                return በ;
            case 58:
                return Mantidile;
            case 59:
                return Nokoyl;
            case 60:
                return Яallod;
            case 61:
                return Algaetizer;
            case 62:
                return Kachort;
            case 63:
                return Slamelion;
            case 64:
                return Ayateda;
            case 65:
                return Wochem;
            case 66:
                return Ƕmun;
            case 67:
                return Ψkobath;
            case 68:
                return Gytanic;
            case 69:
                return βeiß;
            case 70:
                return Gungholio;
            case 71:
                return Honigkönig;
            case 72:
                return Kungulp;
            case 73:
                return Σatinella;
            case 74:
                return Elocurl;
            case 75:
                return Takobie;
            case 76:
                return Ōbchovy;
            case 77:
                return Nimnamnom;
            case 78:
                return Tutewtoo;
            case 79:
                return Blanqast;
            case 80:
                return Indeo;
            case 81:
                return Deblobbio;
            case 82:
                return Knightstacean;
            case 83:
                return Prostrax;
            case 84:
                return Haptozahen;
            case 85:
                return Minkohabod;
            case 86:
                return Zeen;
            case 87:
                return Tacroach;
            case 88:
                return Manterfly;
            case 89:
                return Beary;
            case 90:
                return Sluggernaut;
            case 91:
                Gson gson = new Gson();
                Context ProtomonContext = getApplicationContext();
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                SharedPreferences.Editor editor = prefs.edit();
                String json = prefs.getString("WorkingMonster", "");
                if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                    Custom = gson.fromJson(json, (Type) protomon.monst.class);
                    return Custom;
                } else {
                    return Custom;
                }
            case 92:


                int attack = new Random().nextInt(100); // make these randoms?
                int speed = new Random().nextInt(100);
                int health = (int)Memeek.Health;

                //int health = new Random().nextInt(100);
                int defense = new Random().nextInt(100);

                for (int countertimer = 0; !(((attack * defense * speed * health) > 102000000) && ((attack * defense * speed * health) < 111000000) || countertimer > 1000); countertimer++) {

                    int Decider = new Random().nextInt(3);

                    switch (Decider) {

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
                         //   health++;
                            break;
                    }


                }

                if(defense <= 51){
                    defense = 51;
                }
                if(health <= 51){
                    health = 51;
                }
                if(attack <= 51){
                    attack = 51;
                }
                if(speed <= 51){
                    speed = 51;
                }

                Memeek.Defense = defense;
              //  Memeek.Health = health;
                Memeek.Speed = speed;
                Memeek.Attack = attack;

/*

                if(attackermonster != null && playermonster != null) {
                    if (playermonster.Idnum == Memeek.Idnum) {
                        MaxHealthPlayer = Memeek.Health;
                    }

                    if (attackermonster.Idnum == Memeek.Idnum) {
                        MaxHealthAttacker = Memeek.Health;
                    }
                }
*/
            return Memeek;
            case 93:
                return Doughgnat;
            case 94:
                return Rattic;
            case 95:
                return Missileaneous;
            case 96:
                return Runnybabbit;
            case 97:
                return Zubgondrakter;
            case 98:
                return Whumpuhmp;
            case 99:
                return Mangoon;
            case 100:
                return Scarbeque;
            case 101:
                return Fwuffynumpkins;
            case 102:
                return Dothog;
            case 103:
                return Reefcake;
            case 104:
                return Cheetza;
            case 105:
                return Sortsand;
            case 106:
                return Chilldebeest;
            case 107:
                return Communigator;
            case 108:
                return Bossmoss;
            case 109:
                return Vamprey;
            case 110:
                return Parafoxical;
            case 111:
                return Rhischlosserous;
            case 112:
                return Hykeyna;
            case 113:
                return Tafantula;
            case 114:
                return Farmot;
            case 115:
                return Beeurchin;
            case 116:
                return Flysoup;
            case 117:
                return Meloncollie;
            case 118:
                return Scorphibian;
            case 119:
                return Geliphant;
            case 120:
                return Chimpansy;
            case 121:
                return Xaltoxis;
            case 122:
                return Avokaboom;
            case 123:
                return Eggress;
            case 124:
                return Zentapede;
            case 125:
                return Probocetus;
            case 126:
                return Tankgolin;
            case 127:
                return Spiekgul;
            case 128:
                return Mnemont;
        }
        return error;
    }

    public int SpecialMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(17);

//Attack
        //Attacl slot like trip
        return startingmove;
    }

    public int HealMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(11);
// heals strictly
        return startingmove;
    }

    public int SpeedMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(17);
// boosts
        return startingmove;
    }
    

    public int AttackMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(9);
// boosts
        return startingmove;
    }

    public String TypesOfMotions(int Action){


        if (Action > -1) {
            switch ((int) Action) {

                case 0:
                    return " errantnope ";
                case 1:
                    return " Attacks For ";
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
    public void TimerCancelMethod(){


        reflectRatioPlayer = 0;
        reflectTimerOnAttacker = 0;
        reflectRatioAttacker = 0;
        reflectTimerOnPlayer = 0;

        AttackerProtectStatsTimer = 0;
        PlayerProtectStatsTimer = 0;

        statblocktimerP = 0;
        statblocktimerA = 0;

         AttackerStatDelayTimer = -1;
         PlayerStatDelayTimer = -1;

         healblockmagnitudeA = 0;
         healblocktgimerA = 0;

         healblockmagnitudeP = 0;
         healblocktgimerP = 0;

         IDstorage = 0;

         playwins = 0;
         attackwins = 0;

         elongatedhealwoundtimerA = 0;
         elongatedhealwoundtimerP = 0;

         elongatedwoundtimerA = 0;
         elongatedwoundtimerP = 0;

         delayedblastpowerA = 0;
         delayedblastpowerP = 0;

         delayedblasttimerA = 0;
         delayedblasttimerP = 0;

         elongatedhealwoundpowerA = 0;
         elongatedhealwoundpowerP = 0;
         elongatedwoundpowerA = 0;
         elongatedwoundpowerP = 0;

         slowdrainA = 0;
         slowdrainP = 0;

         scorekeepera = 0;
         scorekeeperp = 0;

         ActionNum = 0;

         elongatedglugpowerP = 0;
         elongatedglugtimerP = 0;
         elongatedglugpowerA = 0;
         elongatedglugtimerA = 0;

         whosturnisitanyway = 0;

         elongatedhealpowerP = 0;
         elongatedhealpowerA = 0;
         elongatedhealtimerP = 0;
         elongatedhealtimerA = 0;

         delayedhealpowerA = 0;
         delayedhealpowerP = 0;
         delayedhealtimerP = 0;
         delayedhealtimerA = 0;

         grouphealpowerA = 0;
         grouphealtimerA = 0;
         grouphealpowerP = 0;
         grouphealtimerP = 0;


        AttackerDelayedStatMove = -1;
        PlayerDelayedStatMove = -1;

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }

 public void TimerCancelMethodTell(){

     reflectRatioPlayer = 0;
     reflectTimerOnAttacker = 0;
     reflectRatioAttacker = 0;
     reflectTimerOnPlayer = 0;


        AttackerProtectStatsTimer = 0;
        PlayerProtectStatsTimer = 0;

     statblocktimerP = 0;
     statblocktimerA = 0;


         AttackerStatDelayTimer = -1;
         PlayerStatDelayTimer = -1;

         healblockmagnitudeA = 0;
         healblocktgimerA = 0;

         healblockmagnitudeP = 0;
         healblocktgimerP = 0;

         elongatedhealwoundtimerA = 0;
         elongatedhealwoundtimerP = 0;

         elongatedwoundtimerA = 0;
         elongatedwoundtimerP = 0;

         delayedblastpowerA = 0;
         delayedblastpowerP = 0;

         delayedblasttimerA = 0;
         delayedblasttimerP = 0;

         elongatedhealwoundpowerA = 0;
         elongatedhealwoundpowerP = 0;
         elongatedwoundpowerA = 0;
         elongatedwoundpowerP = 0;

         slowdrainA = 0;
         slowdrainP = 0;


         elongatedglugpowerP = 0;
         elongatedglugtimerP = 0;
         elongatedglugpowerA = 0;
         elongatedglugtimerA = 0;

         elongatedhealpowerP = 0;
         elongatedhealpowerA = 0;
         elongatedhealtimerP = 0;
         elongatedhealtimerA = 0;

         delayedhealpowerA = 0;
         delayedhealpowerP = 0;
         delayedhealtimerP = 0;
         delayedhealtimerA = 0;

     grouphealpowerA = 0;
     grouphealtimerA = 0;
     grouphealpowerP = 0;
     grouphealtimerP = 0;


         AttackerDelayedStatMove = -1;
         PlayerDelayedStatMove = -1;

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
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
                    return "R@tic";
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
                case 128:
                    return "Mnemont";

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
                PlayerIcon.setImageResource(R.drawable.excalim);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.excalim);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }
        } else {
            if ((turncounter % 2) == 1) {
                PlayerIcon.setVisibility(View.VISIBLE);
                PlayerIcon.setImageResource(R.drawable.excalim);
                EnemyIcon.setVisibility(View.INVISIBLE);
            } else {
                EnemyIcon.setVisibility(View.VISIBLE);
                EnemyIcon.setImageResource(R.drawable.excalim);
                PlayerIcon.setVisibility(View.INVISIBLE);
            }

        }

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);

    }
    public void PlayBrainMethod(Button Teller) {


      //  disgustingworkaroundst--;
       // String CombatStringHolder = String.format(String.valueOf(disgustingworkaroundst));
//if (disgustingworkaroundst != 1) {
//}
        tangiblecheck = 1;
        double Holdthisformeplayerattack =  playermonster.Attack;
        double Holdthisformemonsterattack =  attackermonster.Attack;
        double Holdthisformeplayerdefense =  playermonster.Defense;
        double Holdthisformemonsterdefense =  attackermonster.Defense;
        double Holdthisformeplayerspeed =  playermonster.Speed;
        double Holdthisformemonsterspeed =  attackermonster.Speed;



        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);

        if (Teller == Turn) {

            copyPlayermoveforattacker = 1;

            double holdah;
            double holdahx;
            double holdph;
            double holdphx;
            whosturnisitanyway = 1;
            Damage = 0;


            String Catchsopmekindofattack = " Attacks ";





            switch (playermonster.Moveslotdefense){

                case 0:
                    Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));

                    Catchsopmekindofattack = " Attacks For ";
                    break;

                case 1:
                    Damage = ((playermonster.Attack / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Advances For ";
                    break;

                case 2:
                    Damage = ((playermonster.Attack / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Overpowers For ";

                    break;


                case 3:
                    Damage = ((playermonster.Speed / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Punctures For ";
                    break;

                case 4:
                    Damage = ((playermonster.Speed / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Races For ";
                    break;

                case 5:
                    Damage = ((playermonster.Speed / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Exhausts For ";
                    break;

                case 6:
                    Damage = ((playermonster.Defense / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Collides For ";
                    break;

                case 7:
                    Damage = ((playermonster.Defense / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Obstructs For ";
                    break;

                case 8:
                    Damage = ((playermonster.Defense / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Beams Block For ";
                    break;


            }




            Damage = Math.round(Damage);














            attackermonster.Health = attackermonster.Health - Damage;
            AttackerReflect((int)Damage);


            String WhatHappenedString = TypesOfMotions(1);

            StringDisplayMethod();


            if(turncounter > 0 /* && ( playermonster.Health > 0 && attackermonster.Health > 0 )*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + Catchsopmekindofattack  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                } else if (whosturnisitanyway == 1) {
                    //    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n"); // double (Double) presentation of string glitch

                }
                DeathTest();
            }

        }
        if (Teller == Status) {
            copyPlayermoveforattacker = 3;
            whosturnisitanyway = 1;
            Damage = 0;
            if (playermonster.Moveslotspeed == 0) {
                playermonster.Speed = playermonster.Speed * FrrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
                playermonster.Defense = playermonster.Defense * FrrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
                playermonster.Attack = playermonster.Attack * FrrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed == 1) {
                playermonster.Speed = playermonster.Speed * CbrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
                playermonster.Defense = playermonster.Defense * CbrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
            } else if (playermonster.Moveslotspeed == 2) {
                playermonster.Defense = playermonster.Defense * CbrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
                playermonster.Attack = playermonster.Attack * CbrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed == 3) {
                playermonster.Attack = playermonster.Attack * CbrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
                playermonster.Speed = playermonster.Speed * CbrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
            } else if (playermonster.Moveslotspeed == 4) {
                playermonster.Speed = playermonster.Speed * SqrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
            } else if (playermonster.Moveslotspeed == 5) {
                playermonster.Defense = playermonster.Defense * SqrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
            } else if (playermonster.Moveslotspeed == 6) {
                playermonster.Attack = playermonster.Attack * SqrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
            } else if (playermonster.Moveslotspeed > 6 && PlayerStatDelayTimer == -1 && playermonster.Moveslotspeed < 14) {
                PlayerStatDelayTimer = 3;
                PlayerDelayedStatMove = (int) playermonster.Moveslotspeed;
            }else if (playermonster.Moveslotspeed == 14) {
                playermonster.Speed = playermonster.Speed * FrrtTwo;
                playermonster.Speed = Math.round(playermonster.Speed);
                attackermonster.Speed = (attackermonster.Speed / FrrtTwo);
                attackermonster.Speed = Math.round(attackermonster.Speed);
            }else if (playermonster.Moveslotspeed == 15) {
                playermonster.Defense = playermonster.Defense * FrrtTwo;
                playermonster.Defense = Math.round(playermonster.Defense);
                attackermonster.Defense = (attackermonster.Defense / FrrtTwo);
                attackermonster.Defense = Math.round(attackermonster.Defense);
            }else if (playermonster.Moveslotspeed == 16) {
                playermonster.Attack = playermonster.Attack * FrrtTwo;
                playermonster.Attack = Math.round(playermonster.Attack);
                attackermonster.Attack = (attackermonster.Attack / FrrtTwo);
                attackermonster.Attack = Math.round(attackermonster.Attack);
            }

            String WhatHappenedString = TypesOfMotions(3);

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
            DeathTest();

            
        }
        if (Teller == HealButton) {


            copyPlayermoveforattacker = 2;
            whosturnisitanyway = 1;
            Damage = 0;
            if (playermonster.Moveslotheal == 0) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0 && healblocktgimerA == 0 ) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }

                /*
                if (elongatedhealwoundtimerA != 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                    Damage = Math.round(Damage);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                */ // what the hell is this doing here cant be confident to delete it though?
            } else if (playermonster.Moveslotheal == 1) {
                Damage = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                if(Damage >= delayedhealpowerP) {
                    delayedhealpowerP = (int) Damage;
                }
                if (delayedhealtimerP == 0) {
                    delayedhealtimerP = 1;
                }
            } else if (playermonster.Moveslotheal == 2) {
                elongatedhealtimerP = elongatedhealtimerP + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (playermonster.Speed / playermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                healtester = Math.round(healtester);
                if (healtester > elongatedhealpowerP) {
                    elongatedhealpowerP = healtester;
                }

            } else if (playermonster.Moveslotheal == 3) {
                Damage = (((new Random().nextInt(11) + 35)) * (playermonster.Attack / attackermonster.Defense));// was 25 now 35  11) + 35
                Damage = Math.round(Damage);
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    playermonster.Health = playermonster.Health + Damage;
                } else if (elongatedhealwoundtimerP > 0 && healblocktgimerA == 0) {
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
            } else if (playermonster.Moveslotheal == 4) {
                healblocktgimerA = 0;
                elongatedhealwoundtimerP = 0;
                elongatedwoundtimerP = 0;
                elongatedglugpowerA = 0;
                statblocktimerP = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (playermonster.Speed / playermonster.Defense));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health + Damage;
            }else if (playermonster.Moveslotheal == 5) {
                grouphealtimerP = grouphealtimerP + 7;
                int healtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (playermonster.Speed / playermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > grouphealpowerP) {
                    grouphealpowerP = healtester;
                }
            }else if (playermonster.Moveslotheal == 6) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( playermonster.Speed + playermonster.Defense + playermonster.Attack ) / MaxHealthPlayer));
                    Damage = Math.round(Damage*.381);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0 && healblocktgimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( playermonster.Speed + playermonster.Defense + playermonster.Attack ) / MaxHealthPlayer));
                    Damage = Math.round(Damage*.381);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Attack = Math.round((playermonster.Attack*1.0167));
                playermonster.Defense = Math.round((playermonster.Defense*1.0167));
                playermonster.Speed = Math.round((playermonster.Speed*1.0167));
            }else if (playermonster.Moveslotheal == 7) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / (playermonster.Defense + playermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0 && healblocktgimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed /(playermonster.Defense + playermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Speed = Math.round((playermonster.Speed*1.05));
            }else if (playermonster.Moveslotheal == 8) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Attack / (playermonster.Defense + playermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0 && healblocktgimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Attack / (playermonster.Defense + playermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Attack = Math.round((playermonster.Attack*1.05));
            }else if (playermonster.Moveslotheal == 9) {
                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Defense / (playermonster.Speed + playermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerP != 0 && healblocktgimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Defense /(playermonster.Speed + playermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    playermonster.Health = playermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Defense = Math.round((playermonster.Defense*1.05));
            }else if (playermonster.Moveslotheal == 10) {
              // double snowball
                Damage = ((((new Random().nextInt(11) + 55)) * (( playermonster.Speed + playermonster.Defense + playermonster.Attack ) / MaxHealthPlayer)) * 2);
                Damage = Math.round(Damage*.381);
                if(Damage >= delayedhealpowerPsnow) {
                    delayedhealpowerPsnow = (int) Damage;
                }
                if (delayedhealtimerPsnow == 0) {
                    delayedhealtimerPsnow = 1;
                }
            }
            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }


            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            
            if (disgustingworkaroundst == 1) {
               // CombatStringHolder = CombatString;
}

            if (disgustingworkaroundst > 1) {

                disgustingworkaroundst--;
            }
            
            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {

                    if  (attackermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealpowerA > 0) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (attackermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                    }else if (attackermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                    }else if  (attackermonster.Moveslotheal == 4) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerAsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
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
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                    }else if  (playermonster.Moveslotheal == 4)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                    }else if  (playermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerPsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }

                }
            }

        }
        if (Teller == SpecialAttack) {

            copyPlayermoveforattacker = 4;
            whosturnisitanyway = 1;
            Damage = 0;
            if (playermonster.Moveslotattack == 0) {

                elongatedwoundtimerA = elongatedwoundtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (playermonster.Speed / attackermonster.Defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > elongatedwoundpowerA) {
                    elongatedwoundpowerA = healtester;
                }
            } else if (playermonster.Moveslotattack == 1) {
                delayedblastpowerP = (int) (((new Random().nextInt(21) + 65)) * (playermonster.Attack / attackermonster.Speed));
                if (delayedblasttimerP == 0) {
                    delayedblasttimerP = 1;
                }
            } else if (playermonster.Moveslotattack == 2) {
                elongatedhealwoundtimerA = elongatedhealwoundtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (playermonster.Speed / attackermonster.Defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealwoundpowerA) {
                    elongatedhealwoundpowerA = healtester;
                }

            } else if (playermonster.Moveslotattack == 3) {
                elongatedglugtimerP = elongatedglugtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (playermonster.Speed / attackermonster.Defense)))) / 14; // was 12 7/7/19
                healtester = Math.round(healtester);
                if (healtester > elongatedglugpowerP) {
                    elongatedglugpowerP = healtester;
                } // Work in progress, attack 3 is life glug over time
            } else if (playermonster.Moveslotattack == 4) {
                healblocktgimerP = healblocktgimerP + 7;
            }else if (playermonster.Moveslotattack == 5) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Defense / attackermonster.Defense)); // changed to D/D from A/D
                Damage = Math.round(Damage);
                if (attackermonster.Defense >= statMinimum){
                    attackermonster.Defense = Math.round(attackermonster.Defense * .85);
                }
                if (attackermonster.Defense <= statMinimum){
                    attackermonster.Defense = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
            }else if (playermonster.Moveslotattack == 6) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Speed / attackermonster.Speed));
                Damage = Math.round(Damage);
                if (attackermonster.Speed >= statMinimum){
                    attackermonster.Speed = Math.round(attackermonster.Speed * .85);
                }
                if (attackermonster.Speed <= statMinimum){
                    attackermonster.Speed = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
            }else if (playermonster.Moveslotattack == 7) {
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Attack));
                Damage = Math.round(Damage);
                if (attackermonster.Attack >= statMinimum){
                    attackermonster.Attack = Math.round(attackermonster.Attack * .85);
                }
                if (attackermonster.Attack <= statMinimum){
                    attackermonster.Attack = statMinimum;
                }
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
            }else if (playermonster.Moveslotattack == 8) {
                statblocktimerA = statblocktimerA + 7;
            } else if (playermonster.Moveslotattack == 9) {
                healblocktgimerA = 0;
                elongatedhealwoundtimerP = 0;
                elongatedwoundtimerP = 0;
                elongatedglugtimerA = 0;
                statblocktimerP = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (playermonster.Attack / attackermonster.Defense));
                Damage = Math.round(Damage);
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
            } else if (playermonster.Moveslotattack == 10) {
                int holdA = (int) playermonster.Attack;
                int holdD = (int) playermonster.Defense;
                int holdS = (int) playermonster.Speed;
                int holdAx = (int) attackermonster.Attack;
                int holdDx = (int) attackermonster.Defense;
                int holdSx = (int) attackermonster.Speed;
                double sumall = 0;
                double sumallx = 0;
                playermonster.Attack = Math.round(playermonster.Attack*.77);
                playermonster.Defense = Math.round(playermonster.Defense*.77);
                playermonster.Speed = Math.round(playermonster.Speed*.77);
                sumall = ((holdA) + (holdD) + (holdS));
                sumallx = ((holdAx) + (holdDx) + (holdSx));
                Damage = (double) (sumall/sumallx) * (double)(((new Random().nextInt(51)+100)));
                Damage = Math.round(Damage);
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
                if (holdS > holdSx && playermonster.Speed <= attackermonster.Speed){
                    turncounter++;
                }
                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (playermonster.Moveslotattack == 11) {
                Damage = (((new Random().nextInt(11) + 25)) * ((playermonster.Speed+playermonster.Attack+ playermonster.Defense) / (attackermonster.Speed+attackermonster.Attack+ attackermonster.Defense)));
                Damage = Math.round(Damage);

                attackermonster.Speed = Math.round(attackermonster.Speed * .95);
                attackermonster.Defense = Math.round(attackermonster.Defense * .95);
                attackermonster.Attack = Math.round(attackermonster.Attack * .95);
                attackermonster.Health = attackermonster.Health - Damage;
                AttackerReflect((int)Damage);
                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (playermonster.Moveslotattack == 12) {
                //Snatch

                if (delayedblastpowerP < delayedblastpowerA){
                    delayedblastpowerP = delayedblastpowerA;
                }
                if (delayedhealtimerP < delayedhealtimerA){
                    delayedhealtimerP = delayedhealtimerA;
                }
                if (delayedhealpowerP < delayedhealpowerA){
                    delayedhealpowerP = delayedhealpowerA;
                }
                if (delayedhealtimerPsnow < delayedhealtimerAsnow){
                    delayedhealtimerPsnow = delayedhealtimerAsnow;
                }
                if (delayedhealpowerPsnow < delayedhealpowerAsnow){
                    delayedhealpowerPsnow = delayedhealpowerAsnow;
                }
                if (AttackerProtectStatsTimer > PlayerProtectStatsTimer){
                    PlayerProtectStatsTimer = AttackerProtectStatsTimer;
                }
                if (delayedblasttimerP < delayedblasttimerA){
                    delayedblasttimerP = delayedblasttimerA;
                }

                if (AttackerStatDelayTimer != -1){
                    PlayerStatDelayTimer = AttackerStatDelayTimer;
                }
                if (AttackerDelayedStatMove != -1){
                    PlayerDelayedStatMove = AttackerDelayedStatMove;
                }
                if (grouphealtimerP < grouphealtimerA){
                    grouphealtimerP = grouphealtimerA;
                }
                if (grouphealpowerP < grouphealpowerA){
                    grouphealpowerP = grouphealpowerA;
                }
                if (elongatedhealtimerP < elongatedhealtimerA){
                    elongatedhealtimerP = elongatedhealtimerA;
                }
                if (elongatedhealpowerP < elongatedhealpowerA){
                    elongatedhealpowerP = elongatedhealpowerA;
                }

                if (reflectTimerOnAttacker > reflectTimerOnPlayer){
                    reflectTimerOnPlayer  = reflectTimerOnAttacker;
                }
                if (reflectRatioAttacker > reflectRatioPlayer){
                    reflectRatioPlayer = reflectRatioAttacker;
                }



                reflectRatioAttacker = 0;
                reflectTimerOnAttacker = 0;



                AttackerProtectStatsTimer = 0;
                delayedblastpowerA = 0;
                delayedhealtimerA = 0;
                delayedhealpowerA = 0;
                delayedhealtimerAsnow = 0;
                delayedhealpowerAsnow = 0;
                delayedblasttimerA = 0;
                AttackerStatDelayTimer = -1;
                AttackerDelayedStatMove = -1;
                grouphealtimerA = 0;
                grouphealpowerA = 0;
                elongatedhealtimerA = 0;
                elongatedhealpowerA = 0;
            }else if (playermonster.Moveslotattack == 13) {
                //Dispel

                // ResetWounds();

                delayedhealtimerAsnow = 0;
                delayedhealpowerAsnow = 0;
                reflectRatioAttacker = 0;
                reflectTimerOnAttacker = 0;
                AttackerProtectStatsTimer = 0;
                delayedblastpowerA = 0;
                delayedhealtimerA = 0;
                delayedblasttimerA = 0;
                delayedhealpowerA = 0;
                AttackerStatDelayTimer = -1;
                AttackerDelayedStatMove = -1;
                grouphealtimerA = 0;
                grouphealpowerA = 0;
                elongatedhealtimerA = 0;
                elongatedhealpowerA = 0;

                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                Damage = Math.round(Damage);
                attackermonster.Health = (attackermonster.Health - Damage);
                AttackerReflect((int)Damage);
            }else if (playermonster.Moveslotattack == 14) {

                PlayerProtectStatsTimer = PlayerProtectStatsTimer + 11;
            }else if (playermonster.Moveslotattack == 15) {
                reflectTimerOnPlayer = reflectTimerOnPlayer + 7;
                double fx =(double)(playermonster.Defense/playermonster.Speed);


                // fx = (double)(((-1.488*(fx*fx)) + (26.61*fx)) - 0.119);

                fx = (0.449*((25*fx) -(fx*fx))) + 17;


                if (reflectRatioPlayer <= fx ){
                    reflectRatioPlayer = fx;
                }
            }else if (playermonster.Moveslotattack == 16) {

                disgustingworkaround = 1;
                disgustingworkaroundst = 3;
                switch (copyAttackermoveforplayer){
                    case 0:
                        PlayBrainMethod(Turn);
                        break;
                    case 1:
                        int holdmove = playermonster.Moveslotdefense;
                        playermonster.Moveslotdefense = attackermonster.Moveslotdefense;
                        PlayBrainMethod(Turn);
                        playermonster.Moveslotdefense = holdmove;
                        break;
                    case 2:
                        int holdmoveh = playermonster.Moveslotheal;
                        playermonster.Moveslotheal = attackermonster.Moveslotheal;
                        PlayBrainMethod(HealButton);
                        playermonster.Moveslotheal = holdmoveh;
                        break;
                    case 3:
                        int holdmoves = playermonster.Moveslotspeed;
                        playermonster.Moveslotspeed = attackermonster.Moveslotspeed;
                        PlayBrainMethod(Status);
                        playermonster.Moveslotspeed = holdmoves;
                        break;
                    case 4:
                        int holdmovep = playermonster.Moveslotattack;
                        playermonster.Moveslotattack = attackermonster.Moveslotattack;
                        if(playermonster.Moveslotattack == 16) {
                            PlayBrainMethod(Turn);
                        }else{
                            PlayBrainMethod(SpecialAttack);
                        }
                        playermonster.Moveslotattack = holdmovep;
                        break;
                }copyAttackermoveforplayer = 0;

                CombatStringHolder = CombatString;
               // disgustingworkaround = 0;
            }else if (playermonster.Moveslotattack == 17) {

                Damage = (((new Random().nextInt(21) + 50)) * (playermonster.Attack / attackermonster.Attack));
                Damage = Math.round(Damage);

                attackermonster.Health = (attackermonster.Health - Damage);
                AttackerReflect((int)Damage);
            }



            StatAbuseCurb(playermonster);
            StatAbuseCurb(attackermonster);

            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }


            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringf = "%.0f";

            int ratcatcher = (int)(reflectRatioPlayer );
            int ratcatchera = (int)(reflectRatioAttacker );
            String displaystringH = "%s/%s";
            
            if (disgustingworkaroundst == 1) {
                //CombatStringHolder = CombatString;
}

            if (disgustingworkaroundst > 1) {

                disgustingworkaroundst--;
            }
            

            if(turncounter > 0 /* && ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1) */ || ActionNum != 1) {
                if (whosturnisitanyway == 0) {


                    switch (attackermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerA > 0) {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerP)) + " Turn Boost Block" + "\n");
                            break;
                        case 9:
                            CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Refutes " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 10:
                            CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Burns Its Energy Against " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Depresses " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snatches " + String.format(names(playermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Dispels " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(AttackerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Reflects " +  String.format(displaystring, reflectTimerOnAttacker) + " Turns " +  String.format(displaystring, ratcatchera) + " percent" + "\n");
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;
                    }
                } else if (whosturnisitanyway == 1) {

                    switch (playermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerA)) + " Turn Boost Block" + "\n");
                            break;
                        case 9:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Refutes " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 10:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Burns Its Energy Against " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Depresses " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snatches " + String.format(names(attackermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Dispels " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(PlayerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Reflects " +  String.format(displaystring, (int)reflectTimerOnPlayer) + " Turns " +  String.format(displaystring, (int)ratcatcher) + " percent" + "\n");
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;
                    }
                }
            }

            
        }

/*
        if (playermonster.Health <= 0){


            CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

        }

        if (attackermonster.Health <= 0){


            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

        }

*/

if (disgustingworkaroundst == 1) {
   // CombatString = CombatStringHolder;
   // disgustingworkaroundst = 0;
}


            if (disgustingworkaround == 0) {
                DelayedStatusMethod();
            }

        if (statblocktimerP != 0) {
            if (Holdthisformeplayerattack < playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense < playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed < playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (statblocktimerA != 0) {
            if (Holdthisformemonsterattack < attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense < attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed < attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }

        if (PlayerProtectStatsTimer != 0) {
            if (Holdthisformeplayerattack > playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense > playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed > playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (AttackerProtectStatsTimer != 0) {
            if (Holdthisformemonsterattack > attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense > attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed > attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }

        if (disgustingworkaround == 0){

            TurnDamageResolution();

        }

        HealthChecker();

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /*
                            whosturnisitanyway = 1;
                            if(playermonster.Moveslotheal == 0) {
                                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                                Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }
                                if (elongatedhealwoundtimerP != 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (playermonster.Speed / playermonster.Defense));
                                    playermonster.Health = playermonster.Health + Math.round(Damage/2);
                                }
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

                            }else if(playermonster.Moveslotheal == 3) {
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                                if (healblocktgimerA == 0 && elongatedhealwoundtimerP == 0) {
                                    playermonster.Health = playermonster.Health + Damage;
                                }else if (elongatedhealwoundtimerP > 0 && healblocktgimerA == 0){
                                    playermonster.Health = playermonster.Health + Math.round(Damage/2);
                                }
                                attackermonster.Health = attackermonster.Health - Damage;
                            }else if(playermonster.Moveslotheal == 4){
                                healblocktgimerA = 0;
                                elongatedhealwoundtimerP = 0;
                                elongatedwoundtimerP = 0;
                                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Speed / playermonster.Defense));
                                playermonster.Health = playermonster.Health + Damage;
                            }
                                if (playermonster.Health > MaxHealthPlayer){
                                playermonster.Health = MaxHealthPlayer;
                            }*/


        //    if (playermonster.Health <= 0){


        //        CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

        //   }

        //   if (attackermonster.Health <= 0){


        //       CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

        //    } //Graduation and fathers day
        if(playermonster.Health > 0 && attackermonster.Health > 0) {

            if (disgustingworkaround == 0){
                turncounter++;
            }
            if(turncounter == 0) {
                FirstTurnMethod();
            }else if (playermonster.Health > 0 && attackermonster.Health > 0) {
                if(playermonster.Speed <= attackermonster.Speed){

                    if((turncounter%2) == 0){
                        //   PlayBrainMethod(Turn);
                    }else {

                        if(disgustingworkaround == 0) {
                            RoboBrainMethod(Turn);
                        }

                    }
                }else {

                    if((turncounter%2) == 0){
                        if(disgustingworkaround == 0) {
                            RoboBrainMethod(Turn);
                        }


                    } else {
                        //   PlayBrainMethod(Turn);
                    }

                }
            }
            ImageChanger();


        }
        somebodystopme = 0;
        disgustingworkaround = 0;
    }
    public void RoboBrainMethod(Button Teller) {

if ( somebodystopme == 1){

    return;
}


        if (disgustingworkarounda == 1) {
           // tangiblecheck = 1;
        }
        Damage = 0;
        double Holdthisformeplayerattack = playermonster.Attack;
        double Holdthisformemonsterattack = attackermonster.Attack;
        double Holdthisformeplayerdefense = playermonster.Defense;
        double Holdthisformemonsterdefense = attackermonster.Defense;
        double Holdthisformeplayerspeed = playermonster.Speed;
        double Holdthisformemonsterspeed = attackermonster.Speed;

        if (copying == 0) {
        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);


        int BrainNumb = new Random().nextInt(10);
        switch (BrainNumb) {

            case 0:
                Teller = SpecialAttack;
                break;
            case 1:
                Teller = Turn;
                break;
            case 2:
                Teller = Turn;
                break;
            case 3:
                Teller = Turn;
                break;
            case 4:
                Teller = HealButton;
                break;
            case 5:
                Teller = HealButton;
                break;
            case 6:
                Teller = Status;
                break;
            case 7:
                Teller = Status;
                break;
            case 8:
                Teller = SpecialAttack;
                break;
            case 9:
                Teller = Turn;
                break;


        }


            if (playermonster.Moveslotattack == 8) { // was attackermonster


                if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                    Teller = Turn;
                }

                double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


                double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

                double Go = 0;

                switch (attackermonster.Moveslotdefense) {


                    case 0:
                        Go = ((attackermonster.Attack / playermonster.Defense) * 50);

                        break;

                    case 1:
                        Go = ((attackermonster.Attack / playermonster.Speed) * 50);

                        break;

                    case 2:
                        Go = ((attackermonster.Attack / playermonster.Attack) * 50);


                        break;


                    case 3:
                        Go = ((attackermonster.Speed / playermonster.Defense) * 50);

                        break;

                    case 4:
                        Go = ((attackermonster.Speed / playermonster.Speed) * 50);

                        break;

                    case 5:
                        Go = ((attackermonster.Speed / playermonster.Attack) * 50);

                        break;

                    case 6:
                        Go = ((attackermonster.Defense / playermonster.Defense) * 50);

                        break;

                    case 7:
                        Go = ((attackermonster.Defense / playermonster.Speed) * 50);

                        break;

                    case 8:
                        Go = ((attackermonster.Defense / playermonster.Attack) * 50);

                        break;


                }
                int suicidecheckbasic = (int) (1.4 * AttackerReflectReturn((int) Go));
       /* if (( elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2) || ( elongatedhealwoundtimerP <= 1 && (thisdoctork*2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2) || (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed*1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3  && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage*3) > (MaxHealthPlayer*2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage)))){
            if ((thisdoctork*5) >= Go) {
                Teller = Turn;
            }
        } */

                if ((elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2)) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = Turn;
                    }
                } else if ((elongatedhealwoundtimerP <= 1 && (thisdoctork * 2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2)) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = Turn;
                    }
                } else if (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed * 1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage * 3) > (MaxHealthPlayer * 2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage))) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = Turn;
                    }
                }

                double effectivehits = 0;
                double effectivehitsreflect = 0;


                switch (playermonster.Moveslotdefense) {
                    case 0:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 1:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 2:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                    case 3:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 4:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 5:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                    case 6:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 7:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 8:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                }


                double newHoldthisformemonsterdefense = attackermonster.Defense;
                double newHoldthisformemonsterattack = attackermonster.Attack;
                double newHoldthisformemonsterspeed = attackermonster.Speed;
                double newHoldthisformeplayerdefense = playermonster.Defense;
                double newHoldthisformeplayerattack = playermonster.Attack;
                double newHoldthisformeplayerspeed = playermonster.Speed;


                double reflectRatioAttackerTest = (double) (attackermonster.Defense / attackermonster.Speed);


                reflectRatioAttackerTest = (double) (0.449 * ((25 * reflectRatioAttackerTest) - (reflectRatioAttackerTest * reflectRatioAttackerTest))) + 17;
                if (reflectRatioAttacker != 0) {
                    effectivehits = effectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), effectivehits);
                }
                double neweffectivehits = 0;
                double neweffectivehitsreflect = 0;
                neweffectivehitsreflect = (double) (effectivehits * (1 + (reflectRatioAttackerTest / 100)));
                double reflectbonushits = neweffectivehitsreflect - effectivehits;


                switch (attackermonster.Moveslotspeed) {
                    case 0:
                        newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                        break;
                    case 1:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 2:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        break;
                    case 3:
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 4:
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 5:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        break;
                    case 6:
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        break;
                    case 7:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 8:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 9:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        break;
                    case 10:
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 11:
                        newHoldthisformemonsterspeed = attackermonster.Speed * 2;
                        break;
                    case 12:
                        newHoldthisformemonsterdefense = attackermonster.Defense * 2;
                        break;
                    case 13:
                        newHoldthisformemonsterattack = attackermonster.Attack * 2;
                        break;
                    case 14:
                        newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                        newHoldthisformeplayerspeed = playermonster.Speed / FrrtTwo;
                        break;
                    case 15:
                        newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                        newHoldthisformeplayerdefense = playermonster.Defense / FrrtTwo;
                        break;
                    case 16:
                        newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                        newHoldthisformeplayerattack = playermonster.Attack / FrrtTwo;
                        break;
                }


                double playereffectivehits = 0;
                double newplayereffectivehits = 0;

                switch (attackermonster.Moveslotdefense) {
                    case 0:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 1:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 2:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                    case 3:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 4:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 5:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                    case 6:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 7:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 8:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                }
                switch (attackermonster.Moveslotdefense) {
                    case 0:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 1:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 2:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                    case 3:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 4:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 5:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                    case 6:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 7:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 8:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                }

                if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && ((playereffectivehits - newplayereffectivehits) >= 1)) {
                    Teller = Status;
                }
                if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((playereffectivehits - newplayereffectivehits) >= 1) && effectivehits > 7.0) {
                    Teller = Status;
                }


                switch (playermonster.Moveslotdefense) {
                    case 0:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 1:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 2:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                    case 3:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 4:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 5:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                    case 6:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 7:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 8:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                }
                if (reflectRatioAttacker != 0) {
                    neweffectivehits = neweffectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), neweffectivehits);
                }


                if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && (neweffectivehits - effectivehits) >= 1) {
                    Teller = Status;
                }

                if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((neweffectivehits - effectivehits) >= 1) && effectivehits > 7.0) {
                    Teller = Status;
                }


                double totalhitdiff = ((playereffectivehits - newplayereffectivehits)) + (neweffectivehits - effectivehits);

                if (totalhitdiff >= 1 && attackermonster.Moveslotspeed > 13) {
                    Teller = Status;
                }


                if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13))) {
                    if (Teller != Status) {
                        if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = Turn;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {
                                switch (new Random().nextInt(17)) {

                                    case 0:
                                        Teller = Status;
                                        break;
                                    case 1:
                                        Teller = Status;
                                        break;
                                    case 2:
                                        Teller = Status;
                                        break;
                                    case 3:
                                        Teller = Status;
                                        break;
                                    case 4:
                                        Teller = Turn;
                                        break;
                                    case 5:
                                        Teller = Status;
                                        break;
                                    case 6:
                                        Teller = Turn;
                                        break;
                                    case 7:
                                        Teller = Status;
                                        break;
                                    case 8:
                                        Teller = Status;
                                        break;
                                    case 9:
                                        Teller = Status;
                                        break;
                                    case 10:
                                        Teller = Status;
                                        break;
                                    case 11:
                                        Teller = Status;
                                        break;
                                    case 12:
                                        Teller = Status;
                                        break;
                                    case 13:
                                        Teller = Status;
                                        break;
                                    case 14:
                                        Teller = Status;
                                        break;
                                    case 15:
                                        Teller = Status;
                                        break;
                                    case 16:
                                        Teller = Turn;
                                        break;
                                }

                            }
                        }
                    }
                    if (Teller == Status && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                        switch (new Random().nextInt(17)) {

                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = SpecialAttack;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                            case 3:
                                Teller = Status;
                                break;
                            case 4:
                                Teller = Turn;
                                break;
                            case 5:
                                Teller = Turn;
                                break;
                            case 6:
                                Teller = Turn;
                                break;
                            case 7:
                                Teller = Turn;
                                break;
                            case 8:
                                Teller = Status;
                                break;
                            case 9:
                                Teller = SpecialAttack;
                                break;
                            case 10:
                                Teller = Turn;
                                break;
                            case 11:
                                Teller = Turn;
                                break;
                            case 12:
                                Teller = Turn;
                                break;
                            case 13:
                                Teller = Turn;
                                break;
                            case 14:
                                Teller = Turn;
                                break;
                            case 15:
                                Teller = SpecialAttack;
                                break;
                            case 16:
                                Teller = Turn;
                                break;
                        }

                    }


                }

                if (Teller == Status) {
                    if (!(attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {
                        switch (new Random().nextInt(3)) {

                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = Turn;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {

                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = Turn;
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            Teller = Turn;
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                if (attackermonster.Health < MaxHealthAttacker) {
                                    Teller = Turn;
                                } else {
                                    Teller = Turn;
                                }
                                break;

                        }
                    }
                    if (AttackerStatDelayTimer != -1) {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = Turn;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {

                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = Turn;
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            Teller = Turn;
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                if (attackermonster.Health < MaxHealthAttacker) {
                                    Teller = Turn;
                                } else {
                                    Teller = Turn;
                                }
                                break;

                        }
                    }

                }

                double ratiohealth = (100 * attackermonster.Health / MaxHealthAttacker);

                double testdamage = 0;


                String Catchsopmekindofattack = " Attacks ";

                switch (attackermonster.Moveslotdefense) {

                    case 0:
                        testdamage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                        Catchsopmekindofattack = " Attacks ";
                        break;

                    case 1:
                        testdamage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Advances ";
                        break;

                    case 2:
                        testdamage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Overpowers ";

                        break;


                    case 3:
                        testdamage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Punctures ";
                        break;

                    case 4:
                        testdamage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Races ";
                        break;

                    case 5:
                        testdamage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Exhausts ";
                        break;

                    case 6:
                        testdamage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Collides ";
                        break;

                    case 7:
                        testdamage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Obstructs ";
                        break;

                    case 8:
                        testdamage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Beams Block ";
                        break;


                }
                double testdamageP = 0;

                switch (playermonster.Moveslotdefense) {


                    case 0:
                        testdamageP = ((playermonster.Attack / attackermonster.Defense) * 61);

                        break;

                    case 1:
                        testdamageP = ((playermonster.Attack / attackermonster.Speed) * 61);

                        break;

                    case 2:
                        testdamageP = ((playermonster.Attack / attackermonster.Attack) * 61);


                        break;


                    case 3:
                        testdamageP = ((playermonster.Speed / attackermonster.Defense) * 61);

                        break;

                    case 4:
                        testdamageP = ((playermonster.Speed / attackermonster.Speed) * 61);

                        break;

                    case 5:
                        testdamageP = ((playermonster.Speed / attackermonster.Attack) * 61);

                        break;

                    case 6:
                        testdamageP = ((playermonster.Defense / attackermonster.Defense) * 61);

                        break;

                    case 7:
                        testdamageP = ((playermonster.Defense / attackermonster.Speed) * 61);

                        break;

                    case 8:
                        testdamageP = ((playermonster.Defense / attackermonster.Attack) * 61);

                        break;


                }
                double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
                double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;
                double testhealnzx = (testhealnz*2);

                int checktosapspeed = 0;

                if (attackermonster.Speed < playermonster.Speed && ((attackermonster.Speed * FrrtTwo) > (playermonster.Speed / FrrtTwo))) {

                    checktosapspeed = 1;
                }


                double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

                double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

                double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

                double lowtestdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);


                double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
                double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
                double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
                double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
                double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
                double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
                double dispelcheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                double refutecheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                double depresscheck = (((new Random().nextInt(3) + 25)) * ((attackermonster.Speed + attackermonster.Attack + attackermonster.Defense) / (playermonster.Speed + playermonster.Attack + playermonster.Defense)));

                int suicidechecktrip = (int) (1.4 * AttackerReflectReturn((int) tripcheck));
                int suicidecheckchip = (int) (1.4 * AttackerReflectReturn((int) dispdam));
                int suicidecheckdip = (int) (1.4 * AttackerReflectReturn((int) chipdamage));
                int suicidecheckdisp = (int) (1.4 * AttackerReflectReturn((int) dispelcheck));

                double delayedblastcheck = (int) (((new Random().nextInt(5) + 65)) * (attackermonster.Attack / playermonster.Speed));

                double testdamageOverpower = ((attackermonster.Attack / playermonster.Attack) * 51);

                double testdamageBeam = ((attackermonster.Defense / playermonster.Attack) * 51);


                if (reflectbonushits > 0.85) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    }
                }
                if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                    if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                        if (elongatedhealtimerA <= 2) {
                            Teller = HealButton;
                        } else if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    } else {
                        if (reflectTimerOnAttacker <= 2) {
                            Teller = SpecialAttack;
                        } else if (elongatedhealtimerA == 0) {
                            Teller = HealButton;
                        }
                    }
                }
                //Reflect
                if (Teller != Status) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker <= 2) {
                            if (attackermonster.Defense >= attackermonster.Speed) {
                                Teller = SpecialAttack;
                            }
                        } else if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }
                    if (attackermonster.Moveslotattack == 15 && reflectTimerOnAttacker > 2) {
                        if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }
                }

                if (attackermonster.Moveslotattack == 15 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }

                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedhealwoundtimerA != 0 || elongatedwoundtimerA != 0 || elongatedglugtimerP != 0 || elongatedglugpowerP != 0 || healblocktgimerP != 0 || statblocktimerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotattack == 9) {
                    Teller = SpecialAttack;
                }


                //DOESN"T COVER EVERY CASE FOR REFUTE

                if (attackermonster.Moveslotheal != 5 && attackermonster.Moveslotheal != 4) {
                    if (absolutelyconfusingvariable == 2 && ratiohealth < 37 || ((attackermonster.Health < testdamage && (attackermonster.Health + testheal) > testdamage) && (attackermonster.Moveslotheal != 1 && attackermonster.Moveslotheal != 3 && attackermonster.Moveslotheal != 5))) {
                        if (healblocktgimerA == 0 && elongatedhealwoundpowerA == 0 && delayedhealtimerA == 0) {
                            if ((attackermonster.Speed > playermonster.Attack && attackermonster.Speed > attackermonster.Defense) && attackermonster.Moveslotheal != 3) {
                                if (attackermonster.Moveslotheal == 4) {
                                    if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                        Teller = HealButton;
                                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                                        if (attackermonster.Moveslotheal == 1) {
                                            if (delayedhealtimerA == 0) {
                                                Teller = HealButton;
                                            } else {
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    switch (new Random().nextInt(6)) {
                                                        case 0:
                                                            Teller = Turn;
                                                            break;
                                                        case 1:
                                                            Teller = Status;
                                                            break;
                                                        case 2:
                                                            Teller = Status;
                                                            break;
                                                        case 3:
                                                            Teller = Status;
                                                            break;
                                                        case 4:
                                                            Teller = Turn;
                                                            break;
                                                        case 5:
                                                            Teller = Turn;
                                                            break;

                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        switch (new Random().nextInt(3)) {

                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 1:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = HealButton;
                                                } else {
                                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                        Teller = Turn;
                                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                        Teller = SpecialAttack;
                                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                        Teller = Turn;
                                                    } else {
                                                        Teller = Turn;
                                                    }
                                                }
                                                break;

                                        }
                                    }
                                } else {
                                    Teller = HealButton;
                                }
                            }
                            if (attackermonster.Moveslotheal == 3) {
                                double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                                if (what > 1.0) {
                                    Teller = HealButton;
                                }
                            }

                            // should probably make something that keeps the monster from using heal over time over and over

                            if (elongatedhealtimerA != 0 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                                switch (new Random().nextInt(3)) {

                                    case 0:
                                        Teller = Turn;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        if (attackermonster.Health < MaxHealthAttacker) {
                                            Teller = HealButton;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;

                                }
                            }


                            if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                Teller = HealButton;
                            }


                        }

                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                        if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealtimerA == 0) {
                                Teller = HealButton;
                            } else {
                                switch (new Random().nextInt(3)) {

                                    case 0:
                                        switch (new Random().nextInt(3)) {

                                            case 0:
                                                Teller = Turn;
                                                break;
                                            case 1:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 2:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                            Teller = Turn;
                                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                            Teller = SpecialAttack;
                                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                            Teller = Turn;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;
                                    case 2:
                                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                            Teller = Turn;
                                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                            Teller = SpecialAttack;
                                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                            Teller = Turn;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;

                                }
                            }
                        }
                    } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                        if (cleansefinalcheck > 100) {
                            Teller = HealButton;
                        }
                    } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testdamageP + delayedblastpowerP)) && (attackermonster.Health < (testdamageP + delayedblastpowerP)))) {
                        double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                        if (glugfinalcheck > 100) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        if (testheal > testdamageP) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        if (posturetest >= testdamageP) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    }  else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }else if (attackermonster.Moveslotheal == 10 && (delayedhealtimerAsnow == 0) && (((attackermonster.Health + (testhealnzx)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 3) {
                        double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                        if (what > 1.8) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    } else if (elongatedhealtimerA < 2 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                        Teller = HealButton;
                    } else if (elongatedhealtimerA < 3 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                        if (longhealtester > MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                        if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealtimerA == 0) {
                                Teller = HealButton;
                            } else {
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = Turn;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                }
                            }
                        }
                    }
                } else {
                    Teller = Turn;
                    if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        Teller = HealButton;
                    }
                    if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                        Teller = HealButton;
                    }
                    //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    //      Teller = HealButton;
                    //  }
                }

                if (attackermonster.Moveslotheal == 7 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.05) > ((playermonster.Speed))))) {
                    if (momentumcheck > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((momentumcheck / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                } // This block makes the monster cast momentum if they can get a free move

                if (attackermonster.Moveslotheal == 6 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.0167) > ((playermonster.Speed))))) {
                    if (testhealnz > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((testhealnz / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                }// This block makes the monster cast snowball if they can get a free move
                if (attackermonster.Moveslotheal == 10 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * (1.0167*1.0167)) > ((playermonster.Speed))))) {
                    if (testhealnzx > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((testhealnzx / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                } // This block makes the monster cast big snowball if they can get a free move  // testing reactions
                if (attackermonster.Moveslotheal == 10 && ((playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 4  ) || healblocktgimerP > 1) ){
                    if (Teller == HealButton){
                        int snowchecker = new Random().nextInt(10);
                        switch (snowchecker){
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                            case 3:
                                Teller = Turn;
                                break;
                            case 4:
                                Teller = SpecialAttack;
                                break;
                            case 5:
                                Teller = SpecialAttack;
                                break;
                            case 6:
                                Teller = Status;
                                break;
                            case 7:
                                Teller = Status;
                                break;
                            case 8:
                                Teller = HealButton;
                                break;
                            case 9:
                                Teller = HealButton;
                                break;
                        }
                    }
                }
                if (Teller == Status) {
                    if (ratiohealth < 50) {
                        switch (new Random().nextInt(3)) {

                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                if (ratiohealth >= 45 && ratiohealth <= 80) {
                                    if (attackermonster.Moveslotheal == 1) {
                                        if (delayedhealtimerA == 0) {
                                            if ((testheal * 1.5) > (testdamageP * 1.1475)) {
                                                Teller = HealButton;
                                            }
                                        } /* else {
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = Turn;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = Turn;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = Turn;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                    }
                                } */
                                    }
                                } else {
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = Turn;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                }
                                break;

                        }
                    }
                }

                if (delayedblasttimerA != 0) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }

                }

                if ((elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP + delayedblastpowerP) >= attackermonster.Health) {
                    checktosapspeed = 0;
                }

                if (checktosapspeed == 1 && attackermonster.Moveslotspeed == 14) {
                    Teller = Status;
                }

                if (attackermonster.Moveslotheal == 1) {
                    if (Teller == HealButton) {
                        if (delayedhealtimerA != 0) {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = Turn;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        switch (new Random().nextInt(3)) {
                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {

                                                    switch (new Random().nextInt(3)) {
                                                        case 0:
                                                            Teller = Turn;
                                                            break;
                                                        case 1:
                                                            Teller = Turn;
                                                            break;
                                                        case 2:
                                                            Teller = Turn;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1:
                                                Teller = Turn;
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                        }

                    }
                }
                if (attackermonster.Moveslotheal == 10) {
                    if (Teller == HealButton) {
                        if (delayedhealtimerAsnow != 0) {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        switch (new Random().nextInt(3)) {
                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {

                                                    switch (new Random().nextInt(3)) {
                                                        case 0:
                                                            Teller = SpecialAttack;
                                                            break;
                                                        case 1:
                                                            Teller = Turn;
                                                            break;
                                                        case 2:
                                                            Teller = Turn;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1:
                                                Teller = Turn;
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = SpecialAttack;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                        }

                    }
                }
                if (attackermonster.Moveslotheal == 2 && elongatedhealtimerA == 0 && (ratiohealth > 49 && ratiohealth < 99)) {
                    Teller = HealButton;
                }

                if ((elongatedhealwoundpowerA == 0 && elongatedwoundpowerA == 0 && elongatedglugtimerP == 0) && attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                    Teller = Turn;
                }

                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 3 && elongatedglugtimerA == 0 && attackermonster.Speed >= playermonster.Defense) {
                    Teller = Turn;
                }

                if (PlayerStatDelayTimer != -1) {
                    if (attackermonster.Moveslotattack == 8 && statblocktimerP <= 2) {
                        Teller = SpecialAttack;
                    }
                }


                if (reflectbonushits > 0.85) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    }
                }
                if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                    if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                        if (elongatedhealtimerA <= 2) {
                            Teller = HealButton;
                        } else if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    } else {
                        if (reflectTimerOnAttacker <= 2) {
                            Teller = SpecialAttack;
                        } else if (elongatedhealtimerA == 0) {
                            Teller = HealButton;
                        }
                    }
                }
                if (Teller != Turn) {
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn;
                    }
                }
                if (Teller == HealButton && (attackermonster.Moveslotheal == 2 || attackermonster.Moveslotheal == 1) && (playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 12)) {

                    switch (new Random().nextInt(7)) {
                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = HealButton;
                            break;
                        case 4:
                            Teller = SpecialAttack;
                            break;
                        case 5:
                            Teller = SpecialAttack;
                            break;
                        case 6:
                            Teller = Turn;
                            break;
                    }


                }
                if (playermonster.Moveslotattack == 9 && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 3 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 4 || attackermonster.Moveslotattack == 8)) {
                    if (Teller == SpecialAttack) {
                        int busted = new Random().nextInt(101);
                        if (busted < 75) {
                            Teller = Turn;
                        }
                    }
                    // BUSTED
                }

                if (attackermonster.Speed < playermonster.Speed && (attackermonster.Moveslotspeed == 0 || attackermonster.Moveslotspeed == 1 || attackermonster.Moveslotspeed == 3 || attackermonster.Moveslotspeed == 4 || attackermonster.Moveslotspeed == 7 || attackermonster.Moveslotspeed == 8 || attackermonster.Moveslotspeed == 9 || attackermonster.Moveslotspeed == 11)) {
                    switch (attackermonster.Moveslotspeed) {

                        case 0:
                            if ((attackermonster.Speed * FrrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                        case 1:
                            if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 2:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 3:
                            if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 4:
                            if ((attackermonster.Speed * SqrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 5:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 6:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 7:
                            if (((attackermonster.Speed * CbrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 8:
                            if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 9:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 10:
                            if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 11:
                            if (((attackermonster.Speed * 2) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 153)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 12:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 13:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                    }
                }

                if (attackermonster.Moveslotattack == 3 && elongatedglugtimerA > 2 && Teller == SpecialAttack) {
                    Teller = Turn;
                    if (ratiohealth > 89 && turncounter > 3) {
                        Teller = Status;
                    }
                }


                if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                    if (
                            delayedhealtimerPsnow != 0 ||
                            delayedhealtimerP != 0 ||
                                    delayedblasttimerP != 0 ||
                                    delayedblastpowerP != 0 ||
                                    delayedhealpowerP != 0 ||
                                    PlayerStatDelayTimer != -1 ||
                                    // PlayerDelayedStatMove != -1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                    grouphealtimerP != 0 ||
                                    grouphealpowerP != 0 ||
                                    elongatedhealtimerP != 0 ||
                                    elongatedhealpowerP != 0 ||
                                    PlayerProtectStatsTimer != 0 || reflectTimerOnPlayer != 0) {
                        Teller = SpecialAttack;
                    }

                    if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                        //  Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                        if (playermonster.Health <= testdamage) {
                            Teller = Turn;   //need to adjust the damage for the moves ABCDEFG
                        }
                    }
                }
                if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                    if (
                            delayedhealtimerPsnow == 0 &&
                            delayedhealtimerP == 0 &&
                                    delayedblasttimerP == 0 &&
                                    delayedblastpowerP == 0 &&
                                    delayedhealpowerP == 0 &&
                                    delayedhealpowerPsnow == 0 &&
                                    PlayerStatDelayTimer == -1 &&
                                    // PlayerDelayedStatMove == -1&&-1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                    grouphealtimerP == 0 &&
                                    grouphealpowerP == 0 &&
                                    elongatedhealtimerP == 0 &&
                                    elongatedhealpowerP == 0 &&
                                    PlayerProtectStatsTimer == 0 && reflectTimerOnPlayer == 0) {
                        if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }

                    if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                        // Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                        if (playermonster.Health <= testdamage) {
                            Teller = Turn; // need to adjust the damage for the moves ABCDEFG
                        }
                    }
                }


                // Dispel and Snatch

                if (effectivehits > 3) {
                    if (attackermonster.Moveslotattack == 1) {
                        if (Teller == Turn) {
                            if (delayedblasttimerA == 0) {
                                if (testdamage < (delayedblastcheck))
                                    Teller = SpecialAttack;
                            }
                        }
                    }
                }


                if (attackermonster.Moveslotattack == 1) {
                    if (Teller == SpecialAttack) {
                        if (delayedblasttimerA != 0) {
                            Teller = Turn;
                        }
                    }
                }

                if (attackermonster.Moveslotattack == 1 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                    if (Teller == SpecialAttack) {
                        if (new Random().nextInt(14) != 0) {
                            Teller = Turn;
                        }
                    }
                }

                //ASDF
                if (attackermonster.Moveslotattack == 6) {
                    if ((Math.ceil(playermonster.Speed * .85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                        if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)) {
                            Teller = SpecialAttack;
                        }
                    }
                }

                if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                    Teller = HealButton;
                }
                if (attackermonster.Moveslotattack == 9 && healblocktgimerP == 0 &&
                        elongatedhealwoundtimerA == 0 &&
                        elongatedwoundtimerA == 0 &&
                        elongatedglugtimerP == 0 &&
                        statblocktimerA == 0) {
                    if (Teller == SpecialAttack) {
                        if ((new Random().nextInt(101)) <= 90) {
                            Teller = Turn;
                        }
                    }
                }
                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && delayedhealtimerPsnow >= 1) {
                    Teller = SpecialAttack;
                }


                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                    Teller = Turn;
                }


                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerPsnow) {
                    Teller = SpecialAttack;
                }
                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerP) {
                    Teller = SpecialAttack;
                }

                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 2 && elongatedhealwoundtimerP >= 1) {
                    Teller = Turn;
                }

                if (Teller == HealButton && (attackermonster.Moveslotheal == 0 || attackermonster.Moveslotheal > 5) && attackermonster.Health == MaxHealthAttacker) {
                    Teller = Turn;
                }

                if (Teller == Turn && chipdamage > testdamage && attackermonster.Moveslotattack == 5) {
                    Teller = SpecialAttack;
                }

                if (Teller == Turn && tripcheck > testdamage && attackermonster.Moveslotattack == 6) {
                    Teller = SpecialAttack;
                }

                if (Teller == Turn && dispdam > testdamage && attackermonster.Moveslotattack == 7) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && depresscheck > testdamage && attackermonster.Moveslotattack == 11) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && depresscheck > testdamage && attackermonster.Moveslotattack == 11) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && dispelcheck >= testdamage && attackermonster.Moveslotattack == 13) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && refutecheck >= testdamage && attackermonster.Moveslotattack == 9) {
                    Teller = SpecialAttack;
                }

                if (Teller == SpecialAttack && dispelcheck < testdamage && attackermonster.Moveslotattack == 13) {
                    Teller = Turn;
                }
                if (Teller == SpecialAttack && refutecheck < testdamage && attackermonster.Moveslotattack == 9) {
                    Teller = Turn;
                }

                if (playermonster.Defense >= attackermonster.Defense && attackermonster.Moveslotspeed == 15) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 6 || attackermonster.Moveslotdefense == 7 || attackermonster.Moveslotdefense == 8) {
                            Teller = Status;
                        }
                    }
                }


                if (playermonster.Speed >= attackermonster.Speed && attackermonster.Moveslotspeed == 14) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 3 || attackermonster.Moveslotdefense == 4 || attackermonster.Moveslotdefense == 5) {
                            Teller = Status;
                        }
                    }
                }


                if (playermonster.Attack >= attackermonster.Attack && attackermonster.Moveslotspeed == 16) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 0 || attackermonster.Moveslotdefense == 1 || attackermonster.Moveslotdefense == 2) {
                            Teller = Status;
                        }
                    }
                }


                if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed * .85) < playermonster.Speed) && playermonster.Moveslotattack == 6)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                    Teller = SpecialAttack;
                }

                if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed / FrrtTwo) < (playermonster.Speed * FrrtTwo)) && playermonster.Moveslotattack == 14)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                    Teller = SpecialAttack;
                }

                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer >= 15) {
                    Teller = Turn;
                }


                if (PlayerProtectStatsTimer > 0 && (attackermonster.Moveslotattack == 5 || attackermonster.Moveslotattack == 6 || attackermonster.Moveslotattack == 7 || attackermonster.Moveslotattack == 11 || attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13 || attackermonster.Moveslotattack == 14)) {
                    if (Teller == SpecialAttack) {
                        if (tripcheck < testdamage && dispdam < testdamage && chipdamage < testdamage) {
                            Teller = Turn;
                        } //This block is fucking nonsense, checks if all abilities are on, which they can't be, also checks snatch and dispel for no reason at all
                    }
                }


                if (Teller == HealButton && healblocktgimerP > 0 && attackermonster.Moveslotheal != 4) {
                    Teller = Turn;
                }
                if (attackermonster.Moveslotattack == 0 && (woundtester * 3) > Go) {
                    if (elongatedwoundtimerP <= 2) {
                        Teller = Turn;
                    }
                }


                if (attackermonster.Moveslotattack == 0 && Teller == SpecialAttack) {
                    if (elongatedwoundtimerP > 2) {
                        Teller = Turn;
                    }
                }
                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 8 && statblocktimerP >= 2) {
                    Teller = Turn;
                }

                if (Teller == Status) {
                    if (statblocktimerA != 0) {
                        Teller = Turn;
                    }
                }

                if (Teller == Status && playermonster.Moveslotattack == 8 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                }

                if (attackermonster.Moveslotattack > 98) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotheal > 98) {
                    if (Teller == HealButton) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotspeed > 98) {
                    if (Teller == Status) {
                        Teller = Turn;
                    }
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = Turn;
                }


                if ((attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = Status;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = HealButton;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98)) {
                    Teller = SpecialAttack;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = TellButton;
                }

                if (AttackerStatDelayTimer != -1) {
                    if (Teller == Status) {
                        Teller = Turn;
                    }
                }

                if (attackermonster.Moveslotattack == 15) {
                    if (Teller == SpecialAttack) {
                        if (reflectTimerOnAttacker >= 8) {
                            Teller = HealButton;
                            if (MaxHealthAttacker == attackermonster.Health || (healblocktgimerP > 0)) {
                                Teller = Status;
                                if (statblocktimerA > 0) {
                                    Teller = Turn;
                                    if (suicidecheckbasic > attackermonster.Health) {
                                        Teller = SpecialAttack;
                                    }
                                }
                            }
                        }
                    }
                }
                if (suicidecheckbasic > attackermonster.Health) {
                    if (Teller == Turn) {
                        Teller = HealButton;
                        if (attackermonster.Health == MaxHealthAttacker) {
                            Teller = Status;
                        }
                    }
                }

                if (Teller == SpecialAttack && suicidecheckchip > attackermonster.Health && attackermonster.Moveslotattack == 5) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }

                if (Teller == SpecialAttack && suicidechecktrip > attackermonster.Health && attackermonster.Moveslotattack == 6) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }

                if (Teller == SpecialAttack && suicidecheckdip > attackermonster.Health && attackermonster.Moveslotattack == 7) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
                if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 9) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
                if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 13) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }

            } else {


                if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                    Teller = SpecialAttack;
                }

                double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


                double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

                double Go = 0;


                switch (attackermonster.Moveslotdefense) {

                    case 0:
                        Go = ((attackermonster.Attack / playermonster.Defense) * 50);

                        break;

                    case 1:
                        Go = ((attackermonster.Attack / playermonster.Speed) * 50);

                        break;

                    case 2:
                        Go = ((attackermonster.Attack / playermonster.Attack) * 50);


                        break;


                    case 3:
                        Go = ((attackermonster.Speed / playermonster.Defense) * 50);

                        break;

                    case 4:
                        Go = ((attackermonster.Speed / playermonster.Speed) * 50);

                        break;

                    case 5:
                        Go = ((attackermonster.Speed / playermonster.Attack) * 50);

                        break;

                    case 6:
                        Go = ((attackermonster.Defense / playermonster.Defense) * 50);

                        break;

                    case 7:
                        Go = ((attackermonster.Defense / playermonster.Speed) * 50);

                        break;

                    case 8:
                        Go = ((attackermonster.Defense / playermonster.Attack) * 50);

                        break;


                }

                int suicidecheckbasic = (int) (1.4 * AttackerReflectReturn((int) Go));

       /* if (( elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2) || ( elongatedhealwoundtimerP <= 1 && (thisdoctork*2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2) || (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed*1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3  && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage*3) > (MaxHealthPlayer*2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage)))){
            if ((thisdoctork*5) >= Go) {
                Teller = SpecialAttack;
            }
        } */

                if ((elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2)) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = SpecialAttack;
                    }
                } else if ((elongatedhealwoundtimerP <= 1 && (thisdoctork * 2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2)) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = SpecialAttack;
                    }
                } else if (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed * 1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage * 3) > (MaxHealthPlayer * 2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage))) {
                    if ((thisdoctork * 5) >= Go) {
                        Teller = SpecialAttack;
                    }
                }

                double effectivehits = 0;
                double effectivehitsreflect = 0;

                switch (playermonster.Moveslotdefense) {
                    case 0:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 1:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 2:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                    case 3:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 4:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 5:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                    case 6:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                        break;
                    case 7:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                        break;
                    case 8:
                        effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                        break;
                }


                double newHoldthisformemonsterdefense = attackermonster.Defense;
                double newHoldthisformemonsterattack = attackermonster.Attack;
                double newHoldthisformemonsterspeed = attackermonster.Speed;
                double newHoldthisformeplayerdefense = playermonster.Defense;
                double newHoldthisformeplayerattack = playermonster.Attack;
                double newHoldthisformeplayerspeed = playermonster.Speed;


                double reflectRatioAttackerTest = (double) (attackermonster.Defense / attackermonster.Speed);


                reflectRatioAttackerTest = (double) (0.449 * ((25 * reflectRatioAttackerTest) - (reflectRatioAttackerTest * reflectRatioAttackerTest))) + 17;
                if (reflectRatioAttacker != 0) {
                    effectivehits = effectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), effectivehits);
                }
                double neweffectivehits = 0;
                double neweffectivehitsreflect = 0;
                neweffectivehitsreflect = (double) (effectivehits * (1 + (reflectRatioAttackerTest / 100)));
                double reflectbonushits = neweffectivehitsreflect - effectivehits;


                switch (attackermonster.Moveslotspeed) {
                    case 0:
                        newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                        break;
                    case 1:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 2:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        break;
                    case 3:
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 4:
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 5:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        break;
                    case 6:
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        break;
                    case 7:
                        newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                        break;
                    case 8:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 9:
                        newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        break;
                    case 10:
                        newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                        newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                        break;
                    case 11:
                        newHoldthisformemonsterspeed = attackermonster.Speed * 2;
                        break;
                    case 12:
                        newHoldthisformemonsterdefense = attackermonster.Defense * 2;
                        break;
                    case 13:
                        newHoldthisformemonsterattack = attackermonster.Attack * 2;
                        break;
                    case 14:
                        newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                        newHoldthisformeplayerspeed = playermonster.Speed / FrrtTwo;
                        break;
                    case 15:
                        newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                        newHoldthisformeplayerdefense = playermonster.Defense / FrrtTwo;
                        break;
                    case 16:
                        newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                        newHoldthisformeplayerattack = playermonster.Attack / FrrtTwo;
                        break;
                }


                double playereffectivehits = 0;
                double newplayereffectivehits = 0;

                switch (attackermonster.Moveslotdefense) {
                    case 0:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 1:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 2:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                    case 3:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 4:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 5:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                    case 6:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                        break;
                    case 7:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                        break;
                    case 8:
                        playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                        break;
                }
                switch (attackermonster.Moveslotdefense) {
                    case 0:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 1:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 2:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                    case 3:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 4:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 5:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                    case 6:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                        break;
                    case 7:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                        break;
                    case 8:
                        newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                        break;
                }

                if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && ((playereffectivehits - newplayereffectivehits) >= 1)) {
                    Teller = Status;
                }
                if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((playereffectivehits - newplayereffectivehits) >= 1) && effectivehits > 7.0) {
                    Teller = Status;
                }

                switch (playermonster.Moveslotdefense) {
                    case 0:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 1:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 2:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                    case 3:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 4:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 5:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                    case 6:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                        break;
                    case 7:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                        break;
                    case 8:
                        neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                        break;
                }

                if (reflectRatioAttacker != 0) {
                    neweffectivehits = neweffectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), neweffectivehits);
                }


                if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && (neweffectivehits - effectivehits) >= 1) {
                    Teller = Status;
                }

                if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((neweffectivehits - effectivehits) >= 1) && effectivehits > 7.0) {
                    Teller = Status;
                }
                double totalhitdiff = ((playereffectivehits - newplayereffectivehits)) + (neweffectivehits - effectivehits);

                if (totalhitdiff >= 1 && attackermonster.Moveslotspeed > 13) {
                    Teller = Status;
                }

                if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13))) {
                    if (Teller != Status) {
                        if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {
                                switch (new Random().nextInt(17)) {

                                    case 0:
                                        Teller = Status;
                                        break;
                                    case 1:
                                        Teller = Status;
                                        break;
                                    case 2:
                                        Teller = Status;
                                        break;
                                    case 3:
                                        Teller = Status;
                                        break;
                                    case 4:
                                        Teller = Turn;
                                        break;
                                    case 5:
                                        Teller = Status;
                                        break;
                                    case 6:
                                        Teller = SpecialAttack;
                                        break;
                                    case 7:
                                        Teller = Status;
                                        break;
                                    case 8:
                                        Teller = Status;
                                        break;
                                    case 9:
                                        Teller = Status;
                                        break;
                                    case 10:
                                        Teller = Status;
                                        break;
                                    case 11:
                                        Teller = Status;
                                        break;
                                    case 12:
                                        Teller = Status;
                                        break;
                                    case 13:
                                        Teller = Status;
                                        break;
                                    case 14:
                                        Teller = Status;
                                        break;
                                    case 15:
                                        Teller = Status;
                                        break;
                                    case 16:
                                        Teller = Turn;
                                        break;
                                }

                            }
                        }
                    }
                    if (Teller == Status && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                        switch (new Random().nextInt(17)) {

                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = SpecialAttack;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                            case 3:
                                Teller = Status;
                                break;
                            case 4:
                                Teller = Turn;
                                break;
                            case 5:
                                Teller = Turn;
                                break;
                            case 6:
                                Teller = Turn;
                                break;
                            case 7:
                                Teller = Turn;
                                break;
                            case 8:
                                Teller = Status;
                                break;
                            case 9:
                                Teller = SpecialAttack;
                                break;
                            case 10:
                                Teller = Turn;
                                break;
                            case 11:
                                Teller = Turn;
                                break;
                            case 12:
                                Teller = Turn;
                                break;
                            case 13:
                                Teller = Turn;
                                break;
                            case 14:
                                Teller = Turn;
                                break;
                            case 15:
                                Teller = SpecialAttack;
                                break;
                            case 16:
                                Teller = Turn;
                                break;
                        }

                    }
                }

                if (Teller == Status) {
                    if (!(attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {
                        switch (new Random().nextInt(3)) {

                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = SpecialAttack;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {

                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = SpecialAttack;
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            Teller = Turn;
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                if (attackermonster.Health < MaxHealthAttacker) {
                                    Teller = Turn;
                                } else {
                                    Teller = SpecialAttack;
                                }
                                break;

                        }
                    }
                    if (AttackerStatDelayTimer != -1) {
                        switch (new Random().nextInt(3)) {
                            case 0:
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = SpecialAttack;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {

                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = SpecialAttack;
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            Teller = Turn;
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                if (attackermonster.Health < MaxHealthAttacker) {
                                    Teller = Turn;
                                } else {
                                    Teller = SpecialAttack;
                                }
                                break;

                        }
                    }

                }

                double ratiohealth = (100 * attackermonster.Health / MaxHealthAttacker);

                double testdamage = 0;


                String Catchsopmekindofattack = " Attacks ";

                switch (attackermonster.Moveslotdefense) {

                    case 0:
                        testdamage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                        Catchsopmekindofattack = " Attacks ";
                        break;

                    case 1:
                        testdamage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Advances ";
                        break;

                    case 2:
                        testdamage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Overpowers ";

                        break;


                    case 3:
                        testdamage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Punctures ";
                        break;

                    case 4:
                        testdamage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Races ";
                        break;

                    case 5:
                        testdamage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Exhausts ";
                        break;

                    case 6:
                        testdamage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Collides ";
                        break;

                    case 7:
                        testdamage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Obstructs ";
                        break;

                    case 8:
                        testdamage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                        Catchsopmekindofattack = " Beams Block ";
                        break;


                }
                double testdamageP = 0;

                switch (playermonster.Moveslotdefense) {


                    case 0:
                        testdamageP = ((playermonster.Attack / attackermonster.Defense) * 61);

                        break;

                    case 1:
                        testdamageP = ((playermonster.Attack / attackermonster.Speed) * 61);

                        break;

                    case 2:
                        testdamageP = ((playermonster.Attack / attackermonster.Attack) * 61);


                        break;


                    case 3:
                        testdamageP = ((playermonster.Speed / attackermonster.Defense) * 61);

                        break;

                    case 4:
                        testdamageP = ((playermonster.Speed / attackermonster.Speed) * 61);

                        break;

                    case 5:
                        testdamageP = ((playermonster.Speed / attackermonster.Attack) * 61);

                        break;

                    case 6:
                        testdamageP = ((playermonster.Defense / attackermonster.Defense) * 61);

                        break;

                    case 7:
                        testdamageP = ((playermonster.Defense / attackermonster.Speed) * 61);

                        break;

                    case 8:
                        testdamageP = ((playermonster.Defense / attackermonster.Attack) * 61);

                        break;


                }
                double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
                double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;
                double testhealnzx = (testhealnz*2);
                int checktosapspeed = 0;

                if (attackermonster.Speed < playermonster.Speed && ((attackermonster.Speed * FrrtTwo) > (playermonster.Speed / FrrtTwo))) {

                    checktosapspeed = 1;
                }

                double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

                double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

                double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

                double lowtestdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);


                double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
                double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
                double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
                double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
                double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
                int suicidechecktrip = (int) (1.4 * AttackerReflectReturn((int) tripcheck));
                int suicidecheckchip = (int) (1.4 * AttackerReflectReturn((int) dispdam));
                int suicidecheckdip = (int) (1.4 * AttackerReflectReturn((int) chipdamage));
                double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
                double dispelcheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                double refutecheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
                int suicidecheckdisp = (int) (1.4 * AttackerReflectReturn((int) dispelcheck));

                double depresscheck = (((new Random().nextInt(3) + 25)) * ((attackermonster.Speed + attackermonster.Attack + attackermonster.Defense) / (playermonster.Speed + playermonster.Attack + playermonster.Defense)));

                double delayedblastcheck = (int) (((new Random().nextInt(5) + 65)) * (attackermonster.Attack / playermonster.Speed));

                double testdamageOverpower = ((attackermonster.Attack / playermonster.Attack) * 51);

                double testdamageBeam = ((attackermonster.Defense / playermonster.Attack) * 51);
                if (reflectbonushits > 0.85) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    }
                }
                if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                    if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                        if (elongatedhealtimerA <= 2) {
                            Teller = HealButton;
                        } else if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    } else {
                        if (reflectTimerOnAttacker <= 2) {
                            Teller = SpecialAttack;
                        } else if (elongatedhealtimerA == 0) {
                            Teller = HealButton;
                        }
                    }
                }
                //Reflect
                if (Teller != Status) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker <= 2) {
                            if (attackermonster.Defense >= attackermonster.Speed) {
                                Teller = SpecialAttack;
                            }
                        } else if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }
                    if (attackermonster.Moveslotattack == 15 && reflectTimerOnAttacker > 2) {
                        if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }
                }
                if (attackermonster.Moveslotattack == 15 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedhealwoundtimerA != 0 || elongatedwoundtimerA != 0 || elongatedglugtimerP != 0 || elongatedglugpowerP != 0 || healblocktgimerP != 0 || statblocktimerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotattack == 9) {
                    Teller = SpecialAttack;
                }


                if (attackermonster.Moveslotheal != 5 && attackermonster.Moveslotheal != 4) {
                    if (absolutelyconfusingvariable == 2 && ratiohealth < 37 || ((attackermonster.Health < testdamage && (attackermonster.Health + testheal) > testdamage) && (attackermonster.Moveslotheal != 1 && attackermonster.Moveslotheal != 3 && attackermonster.Moveslotheal != 5))) {
                        if (healblocktgimerA == 0 && elongatedhealwoundpowerA == 0 && delayedhealtimerA == 0) {
                            if ((attackermonster.Speed > playermonster.Attack && attackermonster.Speed > attackermonster.Defense) && attackermonster.Moveslotheal != 3) {
                                if (attackermonster.Moveslotheal == 4) {
                                    if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                        Teller = HealButton;
                                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                                        if (attackermonster.Moveslotheal == 1) {
                                            if (delayedhealtimerA == 0) {
                                                Teller = HealButton;
                                            } else {
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    switch (new Random().nextInt(6)) {
                                                        case 0:
                                                            Teller = SpecialAttack;
                                                            break;
                                                        case 1:
                                                            Teller = Status;
                                                            break;
                                                        case 2:
                                                            Teller = Status;
                                                            break;
                                                        case 3:
                                                            Teller = Status;
                                                            break;
                                                        case 4:
                                                            Teller = Turn;
                                                            break;
                                                        case 5:
                                                            Teller = Turn;
                                                            break;

                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        switch (new Random().nextInt(3)) {

                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 1:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = HealButton;
                                                } else {
                                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                        Teller = SpecialAttack;
                                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                        Teller = SpecialAttack;
                                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                        Teller = Turn;
                                                    } else {
                                                        Teller = Turn;
                                                    }
                                                }
                                                break;

                                        }
                                    }
                                } else {
                                    Teller = HealButton;
                                }
                            }
                            if (attackermonster.Moveslotheal == 3) {
                                double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                                if (what > 1.0) {
                                    Teller = HealButton;
                                }
                            }

                            // should probably make something that keeps the monster from using heal over time over and over

                            if (elongatedhealtimerA != 0 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                                switch (new Random().nextInt(3)) {

                                    case 0:
                                        Teller = SpecialAttack;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        if (attackermonster.Health < MaxHealthAttacker) {
                                            Teller = HealButton;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;

                                }
                            }


                            if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                Teller = HealButton;
                            }


                        }

                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                        if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealtimerA == 0) {
                                Teller = HealButton;
                            } else {
                                switch (new Random().nextInt(3)) {

                                    case 0:
                                        switch (new Random().nextInt(3)) {

                                            case 0:
                                                Teller = SpecialAttack;
                                                break;
                                            case 1:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;
                                            case 2:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                            Teller = SpecialAttack;
                                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                            Teller = SpecialAttack;
                                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                            Teller = Turn;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;
                                    case 2:
                                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                            Teller = SpecialAttack;
                                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                            Teller = SpecialAttack;
                                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                            Teller = Turn;
                                        } else {
                                            Teller = Turn;
                                        }
                                        break;

                                }
                            }
                        }
                    } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                        if (cleansefinalcheck > 100) {
                            Teller = HealButton;
                        }
                    } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testdamageP + delayedblastpowerP)) && (attackermonster.Health < (testdamageP + delayedblastpowerP)))) {
                        double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                        if (glugfinalcheck > 100) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        if (testheal > testdamageP) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        if (posturetest >= testdamageP) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                        Teller = HealButton;
                    }  else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }else if (attackermonster.Moveslotheal == 10 && (delayedhealtimerAsnow == 0) && (((attackermonster.Health + (testhealnzx)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    } else if (attackermonster.Moveslotheal == 3) {
                        double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                        if (what > 1.8) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    } else if (elongatedhealtimerA < 2 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                        Teller = HealButton;
                    } else if (elongatedhealtimerA < 3 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                        if (longhealtester > MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                        if (attackermonster.Moveslotheal == 1) {
                            if (delayedhealtimerA == 0) {
                                Teller = HealButton;
                            } else {
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = SpecialAttack;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                }
                            }
                        }
                    }
                } else {
                    Teller = Turn;
                    if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                        Teller = HealButton;
                    }
                    if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                        Teller = HealButton;
                    }
                    //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    //      Teller = HealButton;
                    //  }
                }

                if (attackermonster.Moveslotheal == 7 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.05) > ((playermonster.Speed))))) {
                    if (momentumcheck > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((momentumcheck / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                } // This block makes the monster cast momentum if they can get a free move

                if (attackermonster.Moveslotheal == 6 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.0167) > ((playermonster.Speed))))) {
                    if (testhealnz > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((testhealnz / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                }// This block makes the monster cast snowball if they can get a free move
                if (attackermonster.Moveslotheal == 10 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * (1.0167*1.0167)) > ((playermonster.Speed))))) {
                    if (testhealnzx > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                    if ((testhealnzx / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                        if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = HealButton;
                            }
                        }
                    }
                } // This block makes the monster cast big snowball if they can get a free move
                if (attackermonster.Moveslotheal == 10 && ((playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 4  ) || healblocktgimerP > 1) ){
                    if (Teller == HealButton){
                        int snowchecker = new Random().nextInt(10);
                        switch (snowchecker){
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                            case 3:
                                Teller = Turn;
                                break;
                            case 4:
                                Teller = SpecialAttack;
                                break;
                            case 5:
                                Teller = SpecialAttack;
                                break;
                            case 6:
                                Teller = Status;
                                break;
                            case 7:
                                Teller = Status;
                                break;
                            case 8:
                                Teller = HealButton;
                                break;
                            case 9:
                                Teller = HealButton;
                                break;
                        }
                    }
                }
                

                if (Teller == Status) {
                    if (ratiohealth < 50) {
                        switch (new Random().nextInt(3)) {

                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                if (ratiohealth >= 45 && ratiohealth <= 80) {
                                    if (attackermonster.Moveslotheal == 1) {
                                        if (delayedhealtimerA == 0) {
                                            if ((testheal * 1.5) > (testdamageP * 1.1475)) {
                                                Teller = HealButton;
                                            }
                                        } /* else {
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = SpecialAttack;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = SpecialAttack;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = SpecialAttack;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                    }
                                } */
                                    }
                                } else {
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                }
                                break;

                        }
                    }
                }

                if (delayedblasttimerA != 0) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }

                }
                if ((elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP + delayedblastpowerP) >= attackermonster.Health) {
                    checktosapspeed = 0;
                }

                if (checktosapspeed == 1 && attackermonster.Moveslotspeed == 14) {
                    Teller = Status;
                }
                if (attackermonster.Moveslotheal == 1) {
                    if (Teller == HealButton) {
                        if (delayedhealtimerA != 0) {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        switch (new Random().nextInt(3)) {
                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {

                                                    switch (new Random().nextInt(3)) {
                                                        case 0:
                                                            Teller = SpecialAttack;
                                                            break;
                                                        case 1:
                                                            Teller = Turn;
                                                            break;
                                                        case 2:
                                                            Teller = Turn;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1:
                                                Teller = Turn;
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = SpecialAttack;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                        }

                    }
                }
                if (attackermonster.Moveslotheal == 10) {
                    if (Teller == HealButton) {
                        if (delayedhealtimerAsnow != 0) {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        switch (new Random().nextInt(3)) {
                                            case 0:
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {

                                                    switch (new Random().nextInt(3)) {
                                                        case 0:
                                                            Teller = SpecialAttack;
                                                            break;
                                                        case 1:
                                                            Teller = Turn;
                                                            break;
                                                        case 2:
                                                            Teller = Turn;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1:
                                                Teller = Turn;
                                                break;
                                            case 2:
                                                if (attackermonster.Health < MaxHealthAttacker) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = SpecialAttack;
                                                }
                                                break;

                                        }
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                        }

                    }
                }
                if (attackermonster.Moveslotheal == 2 && elongatedhealtimerA == 0 && (ratiohealth > 49 && ratiohealth < 99)) {
                    Teller = HealButton;
                }

                if ((elongatedhealwoundpowerA == 0 && elongatedwoundpowerA == 0 && elongatedglugtimerP == 0) && attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                    Teller = SpecialAttack;
                }

                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 3 && elongatedglugtimerA == 0 && attackermonster.Speed >= playermonster.Defense) {
                    Teller = SpecialAttack;
                }

                if (PlayerStatDelayTimer != -1) {
                    if (attackermonster.Moveslotattack == 8 && statblocktimerP <= 2) {
                        Teller = SpecialAttack;
                    }
                }
                if (reflectbonushits > 0.85) {
                    if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                        if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    }
                }
                if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                    if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                        if (elongatedhealtimerA <= 2) {
                            Teller = HealButton;
                        } else if (reflectTimerOnAttacker == 0) {
                            Teller = SpecialAttack;
                        }
                    } else {
                        if (reflectTimerOnAttacker <= 2) {
                            Teller = SpecialAttack;
                        } else if (elongatedhealtimerA == 0) {
                            Teller = HealButton;
                        }
                    }
                }
                if (Teller != Turn) {
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn;
                    }
                }
                if (Teller == HealButton && (attackermonster.Moveslotheal == 2 || attackermonster.Moveslotheal == 1) && (playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 12)) {

                    switch (new Random().nextInt(7)) {
                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = HealButton;
                            break;
                        case 4:
                            Teller = SpecialAttack;
                            break;
                        case 5:
                            Teller = SpecialAttack;
                            break;
                        case 6:
                            Teller = Turn;
                            break;
                    }


                }

                if (playermonster.Moveslotattack == 9 && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 3 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 4 || attackermonster.Moveslotattack == 8)) {
                    if (Teller == SpecialAttack) {
                        int busted = new Random().nextInt(101);
                        if (busted < 75) {
                            Teller = Turn;
                        }
                    }
                    // BUSTED
                }


                if (attackermonster.Speed < playermonster.Speed && (attackermonster.Moveslotspeed == 0 || attackermonster.Moveslotspeed == 1 || attackermonster.Moveslotspeed == 3 || attackermonster.Moveslotspeed == 4 || attackermonster.Moveslotspeed == 7 || attackermonster.Moveslotspeed == 8 || attackermonster.Moveslotspeed == 9 || attackermonster.Moveslotspeed == 11)) {
                    switch (attackermonster.Moveslotspeed) {

                        case 0:
                            if ((attackermonster.Speed * FrrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                        case 1:
                            if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 2:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 3:
                            if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 4:
                            if ((attackermonster.Speed * SqrtTwo) > playermonster.Speed) {
                                Teller = Status;
                            }
                            break;
                        case 5:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 6:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 7:
                            if (((attackermonster.Speed * CbrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 8:
                            if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 9:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 10:
                            if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 11:
                            if (((attackermonster.Speed * 2) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 153)))) {
                                Teller = Status;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 12:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                        case 13:
                            switch (new Random().nextInt(3)) {
                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                            if (Teller != Turn) {
                                Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                                if (playermonster.Health <= Damage) {
                                    Teller = Turn;
                                }
                            }
                            break;
                    }
                }

                if (attackermonster.Moveslotattack == 3 && elongatedglugtimerA > 2 && Teller == SpecialAttack) {
                    Teller = Turn;
                    if (ratiohealth > 89 && turncounter > 3) {
                        Teller = Status;
                    }
                }

                if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                    if (
                            delayedhealtimerPsnow != 0 ||
                            delayedhealtimerP != 0 ||
                                    delayedblasttimerP != 0 ||
                                    delayedblastpowerP != 0 ||
                                    delayedhealpowerP != 0 ||
                                    PlayerStatDelayTimer != -1 ||
                                    // PlayerDelayedStatMove != -1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                    grouphealtimerP != 0 ||
                                    grouphealpowerP != 0 ||
                                    elongatedhealtimerP != 0 ||
                                    elongatedhealpowerP != 0 ||
                                    PlayerProtectStatsTimer != 0 || reflectTimerOnPlayer != 0) {
                        Teller = SpecialAttack;
                    }

                    if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                        //   Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                        if (playermonster.Health <= testdamage) {
                            Teller = Turn; // need to adjust the damage for the moves ABCDEFG
                        }
                    }
                }
                if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                    if (
                            delayedhealtimerPsnow == 0 && delayedhealtimerP == 0 &&
                                    delayedblasttimerP == 0 &&
                                    delayedblastpowerP == 0 &&
                                    delayedhealpowerP == 0 &&
                                    delayedhealpowerPsnow == 0 &&
                                    PlayerStatDelayTimer == -1 &&
                                    // PlayerDelayedStatMove == -1&&-1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                    grouphealtimerP == 0 &&
                                    grouphealpowerP == 0 &&
                                    elongatedhealtimerP == 0 &&
                                    elongatedhealpowerP == 0 &&
                                    PlayerProtectStatsTimer == 0 && reflectTimerOnPlayer == 0) {
                        if (Teller == SpecialAttack) {
                            Teller = Turn;
                        }
                    }

                    if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                        //  Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                        if (playermonster.Health <= testdamage) {
                            Teller = Turn;  //  need to adjust the damage for the moves ABCDEFG
                        }
                    }
                }

                // Dispel and Snatch
                if (effectivehits > 3) {
                    if (attackermonster.Moveslotattack == 1) {
                        if (Teller == Turn) {
                            if (delayedblasttimerA == 0) {
                                if (testdamage < (delayedblastcheck))
                                    Teller = SpecialAttack;
                            }
                        }
                    }
                }
                if (attackermonster.Moveslotattack == 1) {
                    if (Teller == SpecialAttack) {
                        if (delayedblasttimerA != 0) {
                            Teller = Turn;
                        }
                    }
                }
                if (attackermonster.Moveslotattack == 1 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                    if (Teller == SpecialAttack) {
                        if (new Random().nextInt(14) != 0) {
                            Teller = Turn;
                        }
                    }
                }
//ASDF
                if (attackermonster.Moveslotattack == 6) {
                    if ((Math.ceil(playermonster.Speed * .85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                        if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)) {
                            Teller = SpecialAttack;
                        }
                    }
                }
                if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                    Teller = HealButton;
                }

                if (attackermonster.Moveslotattack == 9 && healblocktgimerP == 0 &&
                        elongatedhealwoundtimerA == 0 &&
                        elongatedwoundtimerA == 0 &&
                        elongatedglugtimerP == 0 &&
                        statblocktimerA == 0) {
                    if (Teller == SpecialAttack) {
                        if ((new Random().nextInt(101)) <= 90) {
                            Teller = Turn;
                        }
                    }
                }


                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && delayedhealtimerPsnow >= 1) {
                    Teller = SpecialAttack;
                }


                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                    Teller = Turn;
                }


                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerPsnow) {
                    Teller = SpecialAttack;
                }
                if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerP) {
                    Teller = SpecialAttack;
                }

                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 2 && elongatedhealwoundtimerP >= 1) {
                    Teller = Turn;
                }

                if (Teller == HealButton && (attackermonster.Moveslotheal == 0 || attackermonster.Moveslotheal > 5) && attackermonster.Health == MaxHealthAttacker) {
                    Teller = Turn;
                }

                if (Teller == Turn && chipdamage > testdamage && attackermonster.Moveslotattack == 5) {
                    Teller = SpecialAttack;
                }

                if (Teller == Turn && tripcheck > testdamage && attackermonster.Moveslotattack == 6) {
                    Teller = SpecialAttack;
                }

                if (Teller == Turn && dispdam > testdamage && attackermonster.Moveslotattack == 7) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && depresscheck > testdamage && attackermonster.Moveslotattack == 11) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && dispelcheck >= testdamage && attackermonster.Moveslotattack == 13) {
                    Teller = SpecialAttack;
                }
                if (Teller == Turn && refutecheck >= testdamage && attackermonster.Moveslotattack == 9) {
                    Teller = SpecialAttack;
                }

                if (Teller == SpecialAttack && dispelcheck < testdamage && attackermonster.Moveslotattack == 13) {
                    Teller = Turn;
                }
                if (Teller == SpecialAttack && refutecheck < testdamage && attackermonster.Moveslotattack == 9) {
                    Teller = Turn;
                }
                if (playermonster.Defense >= attackermonster.Defense && attackermonster.Moveslotspeed == 15) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 6 || attackermonster.Moveslotdefense == 7 || attackermonster.Moveslotdefense == 8) {
                            Teller = Status;
                        }
                    }
                }


                if (playermonster.Speed >= attackermonster.Speed && attackermonster.Moveslotspeed == 14) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 3 || attackermonster.Moveslotdefense == 4 || attackermonster.Moveslotdefense == 5) {
                            Teller = Status;
                        }
                    }
                }


                if (playermonster.Attack >= attackermonster.Attack && attackermonster.Moveslotspeed == 16) {
                    if (attackermonster.Health >= MaxHealthAttacker) {
                        if (attackermonster.Moveslotdefense == 0 || attackermonster.Moveslotdefense == 1 || attackermonster.Moveslotdefense == 2) {
                            Teller = Status;
                        }
                    }
                }

                if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed * .85) < playermonster.Speed) && playermonster.Moveslotattack == 6)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                    Teller = SpecialAttack;
                }

                if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed / FrrtTwo) < (playermonster.Speed * FrrtTwo)) && playermonster.Moveslotattack == 14)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                    Teller = SpecialAttack;
                }
                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer >= 15) {
                    Teller = Turn;
                }
                if (PlayerProtectStatsTimer > 0 && (attackermonster.Moveslotattack == 5 || attackermonster.Moveslotattack == 6 || attackermonster.Moveslotattack == 7 || attackermonster.Moveslotattack == 11 || attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13 || attackermonster.Moveslotattack == 14)) {
                    if (Teller == SpecialAttack) {
                        if (tripcheck < testdamage && dispdam < testdamage && chipdamage < testdamage) {
                            Teller = Turn;
                        }
                    }
                }
                if (Teller == HealButton && healblocktgimerP > 0 && attackermonster.Moveslotheal != 4) {
                    Teller = Turn;
                }
                if (attackermonster.Moveslotattack == 0 && (woundtester * 3) > Go) {
                    if (elongatedwoundtimerP <= 2) {
                        Teller = SpecialAttack;
                    }
                }

                if (attackermonster.Moveslotattack == 0 && Teller == SpecialAttack) {
                    if (elongatedwoundtimerP > 2) {
                        Teller = Turn;
                    }
                }
                if (Teller == SpecialAttack && attackermonster.Moveslotattack == 8 && statblocktimerP >= 2) {
                    Teller = Turn;
                }

                if (Teller == Status) {
                    if (statblocktimerA != 0) {
                        Teller = Turn;
                    }
                }

                if (Teller == Status && playermonster.Moveslotattack == 8 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                    }
                }

                if (attackermonster.Moveslotattack > 98) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotheal > 98) {
                    if (Teller == HealButton) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotspeed > 98) {
                    if (Teller == Status) {
                        Teller = Turn;
                    }
                }
                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = Turn;
                }


                if ((attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = Status;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = HealButton;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98)) {
                    Teller = SpecialAttack;
                }


                if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                    Teller = TellButton;
                }
                if (AttackerStatDelayTimer != -1) {
                    if (Teller == Status) {
                        Teller = Turn;
                    }
                }

                if (attackermonster.Moveslotattack == 15) {
                    if (Teller == SpecialAttack) {
                        if (reflectTimerOnAttacker >= 8) {
                            Teller = HealButton;
                            if (MaxHealthAttacker == attackermonster.Health || (healblocktgimerP > 0)) {
                                Teller = Status;
                                if (statblocktimerA > 0) {
                                    Teller = Turn;
                                    if (suicidecheckbasic > attackermonster.Health) {
                                        Teller = SpecialAttack;
                                    }
                                }
                            }
                        }
                    }
                }
                if (suicidecheckbasic > attackermonster.Health) {
                    if (Teller == Turn) {
                        Teller = HealButton;
                        if (attackermonster.Health == MaxHealthAttacker) {
                            Teller = Status;
                        }
                    }
                }
                if (Teller == SpecialAttack && suicidecheckchip > attackermonster.Health && attackermonster.Moveslotattack == 5) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }

                if (Teller == SpecialAttack && suicidechecktrip > attackermonster.Health && attackermonster.Moveslotattack == 6) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }

                if (Teller == SpecialAttack && suicidecheckdip > attackermonster.Health && attackermonster.Moveslotattack == 7) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
                if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 9) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
                if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 13) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
            }
        }




        switch (copying){
            case 0:
                copying = 0;
            break;
            case 1:
            Teller = Turn;
               copying = 0;
            break;
            case 2:
            Teller = Turn;
                copying = 0;
            break;
            case 3:
            Teller = HealButton;
                copying = 0;
            break;
            case 4:
            Teller = Status;
                copying = 0;
            break;
            case 5:
            Teller = SpecialAttack;
                copying = 0;
            break;
        }
        //copying = 0;
        if (Teller == Turn || Teller == copybuttona || Teller == copybuttond) {

            copyAttackermoveforplayer = 1;
            whosturnisitanyway = 0;
            Damage = 0;

            String Catchsopmekindofattack = " Attacks ";

            switch (attackermonster.Moveslotdefense){

                case 0:
                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                    Catchsopmekindofattack = " Attacks For ";
                    break;

                case 1:
                    Damage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Advances For ";
                    break;

                case 2:
                    Damage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Overpowers For ";

                    break;


                case 3:
                    Damage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Punctures For ";
                    break;

                case 4:
                    Damage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Races For ";
                    break;

                case 5:
                    Damage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Exhausts For ";
                    break;

                case 6:
                    Damage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Collides For ";
                    break;

                case 7:
                    Damage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Obstructs For ";
                    break;

                case 8:
                    Damage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Beams Block For ";
                    break;


            }
            Damage = Math.round(Damage);
            playermonster.Health = playermonster.Health - Damage;
            PlayerReflect((int)Damage);



            String WhatHappenedString = TypesOfMotions(1);

            StringDisplayMethod();

            
            if (disgustingworkaroundst == 1) {
                //CombatStringHolder = CombatString;
}

            if (disgustingworkaroundst > 1) {

                disgustingworkaroundst--;
            }
            

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + Catchsopmekindofattack +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
               //     CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");  // THIS ONE IS EDITED CHECK 6/12/19 // Was the problem afterll

                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                }
                DeathTest();
            }
        }

        if (Teller == Status || Teller == copybuttons) {

            copyAttackermoveforplayer = 3;
            whosturnisitanyway = 0;
            Damage = 0;
            if (attackermonster.Moveslotspeed == 0) {
                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 1) {
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 2) {
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 3) {
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 4) {
                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 5) {
                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 6) {
                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1 && attackermonster.Moveslotspeed < 14) {
                AttackerStatDelayTimer = 3;
                AttackerDelayedStatMove = (int)attackermonster.Moveslotspeed;
            }else if (attackermonster.Moveslotspeed == 14) {
                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                playermonster.Speed = (playermonster.Speed / FrrtTwo);
                playermonster.Speed = Math.round(playermonster.Speed);
            }else if (attackermonster.Moveslotspeed == 15) {
                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                playermonster.Defense = (playermonster.Defense / FrrtTwo);
                playermonster.Defense = Math.round(playermonster.Defense);
            }else if (attackermonster.Moveslotspeed == 16) {
                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
                playermonster.Attack = (playermonster.Attack / FrrtTwo);
                playermonster.Attack = Math.round(playermonster.Attack);
            }


            String WhatHappenedString = TypesOfMotions(3);

            
            if (disgustingworkaroundst == 1) {
                //CombatStringHolder = CombatString;
}

            if (disgustingworkaroundst > 1) {

                disgustingworkaroundst--;
            }
            
            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
            DeathTest();
        }

        if (Teller == HealButton || Teller == copybuttonh) {

            copyAttackermoveforplayer = 2;
            whosturnisitanyway = 0;
            Damage = 0;
            if (attackermonster.Moveslotheal == 0) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
            } else if (attackermonster.Moveslotheal == 1) {
                delayedhealpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                if (delayedhealtimerA == 0) {
                    delayedhealtimerA = 1;
                }
            } else if (attackermonster.Moveslotheal == 2) {
                elongatedhealtimerA = elongatedhealtimerA + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                healtester = Math.round(healtester);
                if (healtester > elongatedhealpowerA) {
                    elongatedhealpowerA = healtester;
                }
            } else if (attackermonster.Moveslotheal == 3) {
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
                Damage = Math.round(Damage);
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    attackermonster.Health = attackermonster.Health + Damage;
                } else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0) {
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            } else if (attackermonster.Moveslotheal == 4) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                statblocktimerA = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / attackermonster.Defense));
                Damage = Math.round(Damage);
                attackermonster.Health = attackermonster.Health + Damage;
            }else if (attackermonster.Moveslotheal == 5) {
                grouphealtimerA = grouphealtimerA + 7;
                int healtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > grouphealpowerA) {
                    grouphealpowerA = healtester;
                }
            }else if (attackermonster.Moveslotheal == 6) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker));  // ;(attackermonster.Speed / attackermonster.Defense)
                    Damage = Math.round(Damage*.381);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker));
                    Damage = Math.round(Damage*.381);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Attack = Math.round((attackermonster.Attack*1.0167));
                attackermonster.Defense = Math.round((attackermonster.Defense*1.0167));
                attackermonster.Speed = Math.round((attackermonster.Speed*1.0167));
            }else if (attackermonster.Moveslotheal == 7) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed /(attackermonster.Defense + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Speed = Math.round((attackermonster.Speed*1.05));
            }else if (attackermonster.Moveslotheal == 8) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Attack = Math.round((attackermonster.Attack*1.05));
            }else if (attackermonster.Moveslotheal == 9) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense /(attackermonster.Speed + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Defense = Math.round((attackermonster.Defense*1.05));
            }else if (attackermonster.Moveslotheal == 10) {
                // double snowball
                Damage = ((((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker)) * 2);
                Damage = Math.round(Damage*.381);
                if(Damage >= delayedhealpowerAsnow) {
                    delayedhealpowerAsnow = (int) Damage;
                }
                if (delayedhealtimerAsnow == 0) {
                    delayedhealtimerAsnow = 1;
                }
            }
            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }




            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {

                    if  (attackermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealpowerA > 0) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (attackermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                    }else if (attackermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                    }else if  (attackermonster.Moveslotheal == 4) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerAsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
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
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                    }else if  (playermonster.Moveslotheal == 4)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                    }else if  (playermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerPsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n"); // ADF
                    }

                }
            }

        }

        if (Teller == SpecialAttack || Teller == copybuttonp) {
            copyAttackermoveforplayer = 4;
            whosturnisitanyway = 0;
            Damage = 0;
            if (attackermonster.Moveslotattack == 0) {

                elongatedwoundtimerP = elongatedwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > elongatedwoundpowerP) {
                    elongatedwoundpowerP = healtester;
                }
            } else if (attackermonster.Moveslotattack == 1) {
                delayedblastpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Attack / playermonster.Speed));
                if (delayedblasttimerA == 0) {
                    delayedblasttimerA = 1;
                }
            } else if (attackermonster.Moveslotattack == 2) {
                elongatedhealwoundtimerP = elongatedhealwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealwoundpowerP) {
                    elongatedhealwoundpowerP = healtester;
                }

            } else if (attackermonster.Moveslotattack == 3) {
                elongatedglugtimerA = elongatedglugtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14; // was 12 7/7/19
                healtester = Math.round(healtester);
                if (healtester > elongatedglugpowerA) {
                    elongatedglugpowerA = healtester;
                }
            } else if (attackermonster.Moveslotattack == 4) {
                healblocktgimerA = healblocktgimerA + 7;
            }else if (attackermonster.Moveslotattack == 5) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense)); // also changed from A/D to D/D
                Damage = Math.round(Damage);
                if (playermonster.Defense >= statMinimum){
                    playermonster.Defense = Math.round(playermonster.Defense * .85);
                 }
                if (playermonster.Defense <= statMinimum){
                    playermonster.Defense = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 6) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
                Damage = Math.round(Damage);
                if (playermonster.Speed >= statMinimum){
                    playermonster.Speed = Math.round(playermonster.Speed * .85);
                 }
                if (playermonster.Speed <= statMinimum){
                    playermonster.Speed = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 7) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
                Damage = Math.round(Damage);
                if (playermonster.Attack >= statMinimum){
                    playermonster.Attack = Math.round(playermonster.Attack * .85);
                 }
                if (playermonster.Attack <= statMinimum){
                    playermonster.Attack = statMinimum;
                 }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 8) {
                statblocktimerP = statblocktimerP + 7;
            } else if (attackermonster.Moveslotattack == 9) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                statblocktimerA = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 10) {
                int holdA = (int) attackermonster.Attack;
                int holdD = (int) attackermonster.Defense;
                int holdS = (int) attackermonster.Speed;
                int holdAx = (int) playermonster.Attack;
                int holdDx = (int) playermonster.Defense;
                int holdSx = (int) playermonster.Speed;
                double sumall = 0;
                double sumallx = 0;
                attackermonster.Attack = Math.round(attackermonster.Attack*.77);
                attackermonster.Defense = Math.round(attackermonster.Defense*.77);
                attackermonster.Speed = Math.round(attackermonster.Speed*.77);
                sumall = ((holdA) + (holdD) + (holdS));
                sumallx = ((holdAx) + (holdDx) + (holdSx));
                Damage = (double) (sumall/sumallx) * (double)(((new Random().nextInt(51)+100)));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
                if (holdS >= holdSx && attackermonster.Speed < playermonster.Speed){
                    turncounter++;
                }

                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (attackermonster.Moveslotattack == 11) {
                Damage = (((new Random().nextInt(11) + 25)) * ((attackermonster.Speed+attackermonster.Attack+ attackermonster.Defense) / (playermonster.Speed+playermonster.Attack+ playermonster.Defense)));
                Damage = Math.round(Damage);

                playermonster.Speed = Math.round(playermonster.Speed * .95);
                playermonster.Defense = Math.round(playermonster.Defense * .95);
                playermonster.Attack = Math.round(playermonster.Attack * .95);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (attackermonster.Moveslotattack == 12) {
                //Snatch

                if (delayedblastpowerA < delayedblastpowerP){
                    delayedblastpowerA = delayedblastpowerP;
                }
                if (PlayerProtectStatsTimer > AttackerProtectStatsTimer){
                    AttackerProtectStatsTimer = PlayerProtectStatsTimer;
                }
                if (delayedhealtimerA < delayedhealtimerP){
                    delayedhealtimerA = delayedhealtimerP;
                }
                if (delayedhealpowerA < delayedhealpowerP){
                    delayedhealpowerA = delayedhealpowerP;
                }
                if (delayedhealtimerAsnow < delayedhealtimerPsnow){
                    delayedhealtimerAsnow = delayedhealtimerPsnow;
                }
                if (delayedhealpowerAsnow < delayedhealpowerPsnow){
                    delayedhealpowerAsnow = delayedhealpowerPsnow;
                }
                if (delayedblasttimerA < delayedblasttimerP){
                    delayedblasttimerA = delayedblasttimerP;
                }
                if (PlayerStatDelayTimer != -1){
                    AttackerStatDelayTimer = PlayerStatDelayTimer;
                }
                if (PlayerDelayedStatMove != -1){
                    AttackerDelayedStatMove = PlayerDelayedStatMove;
                }
                if (grouphealtimerA < grouphealtimerP){
                    grouphealtimerA = grouphealtimerP;
                }
                if (grouphealpowerA < grouphealpowerP){
                    grouphealpowerA = grouphealpowerP;
                }
                if (elongatedhealtimerA < elongatedhealtimerP){
                    elongatedhealtimerA = elongatedhealtimerP;
                }
                if (elongatedhealpowerA < elongatedhealpowerP){
                    elongatedhealpowerA = elongatedhealpowerP;
                }

                if (reflectTimerOnAttacker < reflectTimerOnPlayer){
                    reflectTimerOnAttacker = reflectTimerOnPlayer;
                }
                if (reflectRatioAttacker < reflectRatioPlayer){
                    reflectRatioAttacker = reflectRatioPlayer;
                }



                reflectRatioPlayer = 0;
                reflectTimerOnPlayer = 0;


                PlayerProtectStatsTimer = 0;
                delayedblastpowerP = 0;
                delayedhealtimerP = 0;
                delayedhealpowerP = 0;
                delayedhealtimerPsnow = 0;
                delayedhealpowerPsnow = 0;
                delayedblasttimerP = 0;
                PlayerStatDelayTimer = -1;
                PlayerDelayedStatMove = -1;
                grouphealtimerP = 0;
                grouphealpowerP = 0;
                elongatedhealtimerP = 0;
                elongatedhealpowerP = 0;
            }else if (attackermonster.Moveslotattack == 13) {
                //Dispel

                // ResetWounds();

                delayedhealtimerPsnow = 0;
                delayedhealpowerPsnow = 0;
                reflectRatioPlayer = 0;
                reflectTimerOnPlayer = 0;
                PlayerProtectStatsTimer = 0;
                delayedblastpowerP = 0;
                delayedhealtimerP = 0;
                delayedblasttimerP = 0;
                delayedhealpowerP = 0;
                PlayerStatDelayTimer = -1;
                PlayerDelayedStatMove = -1;
                grouphealtimerP = 0;
                grouphealpowerP = 0;
                elongatedhealtimerP = 0;
                elongatedhealpowerP = 0;

                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);

                playermonster.Health = (playermonster.Health - Damage);
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 14) {


                AttackerProtectStatsTimer = AttackerProtectStatsTimer + 11;


            }else if (attackermonster.Moveslotattack == 15) {
                reflectTimerOnAttacker = reflectTimerOnAttacker + 7;

              double fx =(double)(attackermonster.Defense/attackermonster.Speed);

          //    fx = (double)(((-1.488*(fx*fx)) + (26.61*fx)) - 0.119);

                fx = (0.449*((25*fx) -(fx*fx))) + 17;

                if (reflectRatioAttacker <= fx ){
                    reflectRatioAttacker = fx;
                }
            }else if (attackermonster.Moveslotattack == 16) {


                disgustingworkarounda = 1;
                if (tangiblecheck == 1) {
                    tangiblecheck = 0;

                switch (copyPlayermoveforattacker){
                    case 0:

                        copying = 1;
                        //if(tangiblecheck == 1) {
                            RoboBrainMethod(Turn);
                       // }
                        copying = 0;
                        break;
                    case 1:

                        copying = 2;
                        int holdmove = attackermonster.Moveslotdefense;
                        attackermonster.Moveslotdefense = playermonster.Moveslotdefense;
                       // if(tangiblecheck == 1) {
                            RoboBrainMethod(Turn);
                       // }
                        copying = 0;
                        attackermonster.Moveslotdefense = holdmove;
                        break;
                    case 2:

                        copying = 3;
                        int holdmoveh = attackermonster.Moveslotheal;
                        attackermonster.Moveslotheal = playermonster.Moveslotheal;
                        //if(tangiblecheck == 1) {
                            RoboBrainMethod(HealButton);
                       // }
                        copying = 0;
                        attackermonster.Moveslotheal = holdmoveh;
                        break;
                    case 3:

                        copying = 4;
                        int holdmoves = attackermonster.Moveslotspeed;
                        attackermonster.Moveslotspeed = playermonster.Moveslotspeed;
                        //if(tangiblecheck == 1) {
                            RoboBrainMethod(Status);
                       // }
                        attackermonster.Moveslotspeed = holdmoves;
                        copying = 0;
                        break;
                    case 4:

                        copying = 5;
                        int holdmovep = attackermonster.Moveslotattack;
                        attackermonster.Moveslotattack = playermonster.Moveslotattack;
                       // if(tangiblecheck == 1) {
                            if (attackermonster.Moveslotattack == 16) {
                                RoboBrainMethod(Turn);
                            } else{
                                RoboBrainMethod(SpecialAttack);
                            }
                      //  }
                        copying = 0;
                        attackermonster.Moveslotattack = holdmovep;
                        break;
                }
                    somebodystopme = 1;
                }tangiblecheck = 0;
                CombatStringHolder = CombatString;
            }else if (attackermonster.Moveslotattack == 17) {

                Damage = (((new Random().nextInt(21) + 50)) * (attackermonster.Attack / playermonster.Attack));
                Damage = Math.round(Damage);

                playermonster.Health = (playermonster.Health - Damage);
                PlayerReflect((int)Damage);
            }

            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }



            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";

            String displaystringf = "%.0f";
            String displaystringH = "%s/%s";
            int ratcatcher = (int)(reflectRatioPlayer );
            int ratcatchera = (int)(reflectRatioAttacker );

            if(turncounter > 0 /*&&  ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1) */ || ActionNum != 1) {
                if (whosturnisitanyway == 0) {


                    switch (attackermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerA > 0) {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerP)) + " Turn Boost Block" + "\n");
                            break;
                            case 9:
                                CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Refutes " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                            case 10:
                                CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Burns Its Energy Against " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Depresses " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snatches " + String.format(names(playermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Dispels " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(AttackerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Reflects " +  String.format(displaystring, reflectTimerOnAttacker) + " Turns " +  String.format(displaystring, ratcatchera) + " percent" + "\n");
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;

                    }
                } else if (whosturnisitanyway == 1) {

                    switch (playermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerA)) + " Turn Boost Block" + "\n");
                            break;
                        case 9:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Refutes " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 10:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Burns Its Energy Against " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Depresses " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snatches " + String.format(names(attackermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Dispels " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(PlayerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Reflects " +  String.format(displaystring, reflectTimerOnPlayer) + " Turns " +  String.format(displaystring, ratcatcher) + " percent" + "\n");
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;

                    }
                }
            }
        }



     //   if (playermonster.Health <= 0){


   //         CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");
//
  //      }

   //     if (attackermonster.Health <= 0){


    //        CombatString = String.format(CombatString + "Enemy "  + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

   //     }/Graduation


        if (disgustingworkarounda == 0) {
            DelayedStatusMethod();
        }

        if (statblocktimerP != 0) {
            if (Holdthisformeplayerattack < playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense < playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed < playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (statblocktimerA != 0) {
            if (Holdthisformemonsterattack < attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense < attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed < attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }


        if (PlayerProtectStatsTimer != 0) {
            if (Holdthisformeplayerattack > playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense > playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed > playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (AttackerProtectStatsTimer != 0) {
            if (Holdthisformemonsterattack > attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense > attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed > attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }
        if (disgustingworkarounda == 0){

            TurnDamageResolution();

        }
        HealthChecker();

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /*
                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }
                                if (elongatedhealwoundtimerA != 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
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
                            }else if(attackermonster.Moveslotheal == 3){
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0){
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
                                playermonster.Health = playermonster.Health - Damage;
                            }else if(attackermonster.Moveslotheal == 4){
                                healblocktgimerP = 0;
                                elongatedhealwoundtimerA = 0;
                                elongatedwoundtimerA = 0;
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }*/


        if(playermonster.Health > 0 && attackermonster.Health > 0) {
            if (disgustingworkarounda == 0) { //fane
                turncounter++;

            }
            if(playermonster.Health > 0 && attackermonster.Health > 0) {
                if(turncounter == 0) {
                    FirstTurnMethod();
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            //   PlayBrainMethod(Turn);
                        }else {
                            somebodystopme = 0;
                           // tangiblecheck = 1; this would possbily fix the bug where if thy use copy as the first move the battle stagntes
                            if(disgustingworkarounda == 0) {
                                RoboBrainMethod(Turn);
                            }
                        }
                    }else {

                        if((turncounter%2) == 0){
                            somebodystopme = 0;
                            //tangiblecheck = 1;
                            if(disgustingworkarounda == 0) {
                                RoboBrainMethod(Turn);
                            }
                        } else {
                            //   PlayBrainMethod(Turn);
                        }

                    }
                }
                ImageChanger();


            }

            ImageChanger();
        }


        disgustingworkarounda = 0;
        copyPlayermoveforattacker = 0;
        tangiblecheck = 0;
    }

    public void  FirstTurnMethod(){
//pampegg
        attackermonster.Moveslotattack = new Random().nextInt(17);
        attackermonster.Moveslotdefense = new Random().nextInt(9);

        attackermonster.Moveslotspeed = new Random().nextInt(17);
        attackermonster.Moveslotheal = new Random().nextInt(11);
        playermonster.Moveslotspeed = new Random().nextInt(17);
        playermonster.Moveslotheal = new Random().nextInt(11);
        playermonster.Moveslotattack = new Random().nextInt(17);
        playermonster.Moveslotdefense = new Random().nextInt(9);

        secondstartingmonster.Moveslotspeed = new Random().nextInt(17);
        secondstartingmonster.Moveslotheal = new Random().nextInt(11);
        secondstartingmonster.Moveslotattack = new Random().nextInt(17);
        secondstartingmonster.Moveslotdefense = new Random().nextInt(9);

        thirdstartingmonster.Moveslotspeed = new Random().nextInt(17);
        thirdstartingmonster.Moveslotheal = new Random().nextInt(11);
        thirdstartingmonster.Moveslotattack = new Random().nextInt(17);
        thirdstartingmonster.Moveslotdefense = new Random().nextInt(9);

      //  secondstartingmonster.Health = 999;

        // Test movesets here Here here HERE!!!

     //     attackermonster.Moveslotheal = 99;
     //   attackermonster.Moveslotattack = 0; //  8 boost block // 6 trip
   //      attackermonster.Moveslotattack = 99;//atk abs
     //  attackermonster.Moveslotdefense = 99;//overp
     //  attackermonster.Moveslotheal = 99;
     //   attackermonster.Moveslotattack = 0; //  8 boost block // 6 trip
    //    attackermonster.Moveslotspeed = 99;//atk abs
    //   attackermonster.Moveslotdefense = 99;//overp
    // playermonster.Moveslotattack = 16;
   //  attackermonster.Moveslotattack = 16;
     //   attackermonster.Moveslotattack = 0; //  8 boost block // 6 trip
    //     playermonster.Moveslotspeed = 99;//atk abs
     //  attackermonster.Moveslotdefense = 99;//overp
     //  playermonster.Moveslotheal = 99;//overp
      //     attackermonster.Moveslotheal = 5;//team
      //  attackermonster.Moveslotheal = 2; // 8pos,0norm
         // attackermonster.Moveslotattack = 99;
     //    attackermonster.Moveslotspeed = 9; // 11 Huge speed
      //  attackermonster.Moveslotheal = 2;
      //   playermonster.Moveslotattack = 6;
    ////     playermonster.Moveslotspeed = 7;
    ////     playermonster.Moveslotheal = 2;
     //    playermonster.Moveslotattack = 14;
     //    playermonster.Moveslotspeed = 7;
     //    playermonster.Moveslotheal = 3;
     //   attackermonster.Moveslotheal = 2; HOT
     //   attackermonster.Moveslotheal = 7;
     //   attackermonster.Moveslotattack = 6; TRIP
      //  playermonster.Moveslotattack = 12; //Snatch
     //   attackermonster.Moveslotspeed = 3; AT+SP
        //  attackermonster.Moveslotdefense = 0;

    //    attackermonster.Moveslotdefense = 2;
   //     attackermonster.Moveslotspeed = 5;
        attackermonster.Moveslotheal = 10;
        playermonster.Moveslotheal = 10;
   //     attackermonster.Moveslotattack = 11;
   //     attackermonster.Moveslotattack = 1;




       // playermonster.Moveslotheal = 6;

       // playermonster.Moveslotheal = 6;

      //  playermonster.Moveslotattack = 15;
       // attackermonster.Moveslotattack = 15;


      //  attackermonster.Moveslotheal = 6;


        //


        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;

      //  playermonster.Health = 1;

        PlayerMonsterStorage[MonsterStorageCounter] = playermonster;
        MonsterStorageCounter++;
        PlayerMonsterStorage[MonsterStorageCounter] = secondstartingmonster;
        MonsterStorageCounter++;
        PlayerMonsterStorage[MonsterStorageCounter] = thirdstartingmonster;
        MonsterStorageCounter++;

        dictionaryOfMonsters[(int)secondstartingmonster.Idnum] = true;
        dictionaryOfMonsters[(int)playermonster.Idnum] = true;
        dictionaryOfMonsters[(int)thirdstartingmonster.Idnum] = true;



        try {
            holdsong = playermonster.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //    try {
   //         PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(95));
   //     } catch (CloneNotSupportedException e) {
    //        e.printStackTrace();
   //     }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
     //  MonsterStorageCounter++;
   //     try {
   //         PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(97));
   //     } catch (CloneNotSupportedException e) {
   //         e.printStackTrace();
   //     }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
   //     MonsterStorageCounter++;


      //  for (int dex = 0; dex <= spawncap; dex++){

    //        try {
    //            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(dex));
    //        } catch (CloneNotSupportedException e) {
     //           e.printStackTrace();
    //        }
    //        PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
     //       MonsterStorageCounter++;


     //   }



        ///* image debugging
/*




        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(98));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(93));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(94));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(95));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(96));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(91));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(92));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(93));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(94));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(95));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(96));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(91));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(92));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;




        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(10));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(72));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(48));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(29));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(37));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(monstlist(83));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Levdzell);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Kohboh);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Kunk);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Weeliosbop);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Bongu);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Ϫlitch);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Zaume);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Swogharnler);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Vellup);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Dicyto);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Sudakleez);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Munegull);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Epibazang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Illelonab);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Wochem);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Degeissdt);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Mondosplak);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Centiclak);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Monopteryx);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Yuggle);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Knightstacean);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Honigkönig);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Tutewtoo);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Blanqast);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Strachid);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;
        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Osteoplang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Жrachnid);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Ōbchovy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Halocordate);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Ogo);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Grobhost);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Elocurl);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Kachort);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Rongzeed);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Sparvae);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Triaural);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Sapiosuant);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Rytegg);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;


        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Algaetizer);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Schorp);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }  PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Nhainhai);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(error);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Djoper);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Hemtan);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Fædendron);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Slamelion);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(βeiß);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(በ);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Яallod);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Σatinella);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Takobie);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Daahnida);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Schmodozer);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Ihmpdrap);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Sorba);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Jiyou);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Adenolish);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Toximastica);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Gytanic);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Nokoyl);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Mantidile);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Nentopode);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Elastocark);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Nimnamnom);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Ψkobath);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Blattle);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Deblobbio);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Flashmer);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Urcuria);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Uggnawb);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;

        try {
            PlayerMonsterStorage[MonsterStorageCounter] = Cloner(Hyuntress);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }PlayerMonsterStorage[MonsterStorageCounter].UniqueID = UniqueIdentifier(0);
        MonsterStorageCounter++;



        // */


        turncounter = 1;
        ImageChanger();

        AlwaysMakeSureHealthIsLessThanMax();

    }

    public void  StringDisplayMethod(){

        String Pattackstring = String.format(displaystring, (int) playermonster.Attack);
        String Pnamestring = String.format(displaystring, names(playermonster.Idnum));
        String Phealthstring = String.format(displaystringH, (int) playermonster.Health, (int) MaxHealthPlayer);
        String Pdefensestring = String.format(displaystring, (int) playermonster.Defense);
        String Pspeedstring = String.format(displaystring, (int) playermonster.Speed);
        String Pmovehealstring = String.format(displaystring, HealingMoveNames(playermonster.Moveslotheal));
        String Pmovedefstring = String.format(displaystring, AttackMoveNames(playermonster.Moveslotdefense));
        String Pmovespeedstring = String.format(displaystring, StatsMoveNames(playermonster.Moveslotspeed));
        String Eattackstring = String.format(displaystring, (int) attackermonster.Attack);
        String Enamestring = String.format(displaystring, names(attackermonster.Idnum));
        String Ehealthstring = String.format(displaystringH, (int) attackermonster.Health, (int) MaxHealthAttacker);
        String Edefensestring = String.format(displaystring, (int) attackermonster.Defense);
        String Espeedstring = String.format(displaystring, (int) attackermonster.Speed);
        String Emovehealstring = String.format(displaystring, HealingMoveNames(attackermonster.Moveslotheal));
        String Emovedefstring = String.format(displaystring, AttackMoveNames(attackermonster.Moveslotdefense));
        String Emovespeedstring = String.format(displaystring, StatsMoveNames(attackermonster.Moveslotspeed));
        String Pmovespecialstring = String.format(displaystring, SpecialMoveNames(playermonster.Moveslotattack));
        String Emovespecialstring = String.format(displaystring, SpecialMoveNames(attackermonster.Moveslotattack));

        Patk.setText(" "+Pattackstring);
        Pdef.setText(" "+Pdefensestring);
        Pspe.setText(" "+Pspeedstring);
        Pheal.setText(" "+Phealthstring);
        Pname.setText(Pnamestring);
        PHmov.setText(Pmovehealstring);
        PDmov.setText(Pmovedefstring);
        PSmov.setText(Pmovespeedstring);
        PAmov.setText(Pmovespecialstring);

        Eatk.setText(" "+Eattackstring);
        Edef.setText(" "+Edefensestring);
        Espe.setText(" "+Espeedstring);
        Eheal.setText(" "+Ehealthstring);
        Ename.setText(Enamestring);
        EHmov.setText(Emovehealstring);
        EDmov.setText(Emovedefstring);
        ESmov.setText(Emovespeedstring);
        EAmov.setText(Emovespecialstring);

/*
        Patk.setText("Attack: "+Pattackstring);
        Pdef.setText("Defense: "+Pdefensestring);
        Pspe.setText("Speed: "+Pspeedstring);
        Pheal.setText("Health: "+Phealthstring);
        Pname.setText(Pnamestring);
        PHmov.setText(Pmovehealstring);
        PSmov.setText(Pmovespeedstring);
        PAmov.setText(Pmovespecialstring);

        Eatk.setText("Attack: "+Eattackstring);
        Edef.setText("Defense: "+Edefensestring);
        Espe.setText("Speed: "+Espeedstring);
        Eheal.setText("Health: "+Ehealthstring);
        Ename.setText(Enamestring);
        EHmov.setText(Emovehealstring);
        ESmov.setText(Emovespeedstring);
        EAmov.setText(Emovespecialstring);
*/
    }

    public int UniqueIdentifier(int needless){
        return new Random().nextInt(100000000);
    }


    public void RivalRevealer(){
        if (attackermonster.Health <= 0){
            RivalButton.setVisibility(View.VISIBLE);
        }else {
        //    RivalButton.setVisibility(View.INVISIBLE);
        }
        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
    }

    public void ClearStatChanges(monst raw){
        raw.Attack = stats(monstlist((int)raw.Idnum).Attack);
        raw.Speed = stats(monstlist((int)raw.Idnum).Speed);
        raw.Defense = stats(monstlist((int)raw.Idnum).Defense);
    }

    public void ClearStatChangesTell(monst raw){
        raw.Health = stats(monstlist((int)raw.Idnum).Health);
        raw.Attack = stats(monstlist((int)raw.Idnum).Attack);
        raw.Speed = stats(monstlist((int)raw.Idnum).Speed);
        raw.Defense = stats(monstlist((int)raw.Idnum).Defense);
    }


    public void StatAbuseCurb(monst raw){

        if (raw.Attack >= 750){
            raw.Attack = 750;
        }
        if (raw.Speed >= 750){
            raw.Speed = 750;
        }
        if (raw.Defense >= 750){
            raw.Defense = 750;
        }

        if (raw.Attack <= statMinimum){
            raw.Attack = statMinimum;
        }
        if (raw.Speed <= statMinimum){
            raw.Speed = statMinimum;
        }
        if (raw.Defense <= statMinimum){
            raw.Defense = statMinimum;
        }


       // HealthBarUpdate();

        MonsterImageChangerPlayer(playermonster);

        MonsterImageChangerAttacker(attackermonster);

        AlwaysMakeSureHealthIsLessThanMax();

    }

    private void HealthBarUpdate() {

        holdhpBarAnimAttackerEnd = holdhpBarAnimAttackerstart;
        holdhpBarAnimplayerEnd = holdhpBarAnimplayerstart;


        PlayerHPBAR.getLayoutParams().height = convertToDp(20);

        float whateverthisisinsideamethod = (float)Math.min((int)(((playermonster.Health/MaxHealthPlayer)*110)), 110);

        if(whateverthisisinsideamethod < 1){

            whateverthisisinsideamethod = 0;

        }
        if(playermonster.Health >= 1){

            whateverthisisinsideamethod = Math.max(whateverthisisinsideamethod, 1);

        }

        if(whateverthisisinsideamethod < 75 && whateverthisisinsideamethod >= 30){

            PlayerHPBAR.setColorFilter(Color.argb(255, 255, 200, 0));

        }else if(whateverthisisinsideamethod <30){

            PlayerHPBAR.setColorFilter(Color.argb(255, 215, 10, 0));

        }else if(whateverthisisinsideamethod < 1){

            PlayerHPBAR.setColorFilter(Color.argb(255, 0, 0, 0));

        }else {

            PlayerHPBAR.setColorFilter(Color.argb(255, 0, 255, 200));

        }

        PlayerHPBARx.setColorFilter(Color.argb(255, 255, 0, 0));



       // if(holdhpBarAnimplayerstart > holdhpBarAnimplayerEnd) {
        float translate = convertToDp((int) (110 - whateverthisisinsideamethod) / 2);
        holdhpBarAnimplayerstart = translate;

            if((holdhpBarAnimplayerstart-holdhpBarAnimplayerEnd) >= 0) {
                ObjectAnimator scaledonwx = ObjectAnimator.ofFloat(PlayerHPBAR, "scaleX", (float) (whateverthisisinsideamethod / 110));

                ObjectAnimator centerX = ObjectAnimator.ofFloat(PlayerHPBAR, "translationX", (-translate));
                centerX.setDuration(50);
                scaledonwx.setDuration(50);
                scaledonwx.start();
                centerX.start();
            }else {
                ObjectAnimator scaledonwx = ObjectAnimator.ofFloat(PlayerHPBAR, "scaleX", (float) (whateverthisisinsideamethod / 110));

                ObjectAnimator centerX = ObjectAnimator.ofFloat(PlayerHPBAR, "translationX", (-translate));
                centerX.setDuration(600);
                scaledonwx.setDuration(600);
                scaledonwx.start();
                centerX.start();

            }

            //scaledonwx.start();
            //centerX.start();
            ObjectAnimator scaledonwxx = ObjectAnimator.ofFloat(PlayerHPBARx, "scaleX", (float) (whateverthisisinsideamethod / 110));
            float translatexx = convertToDp((int) (110 - whateverthisisinsideamethod) / 2);
            ObjectAnimator centerXx = ObjectAnimator.ofFloat(PlayerHPBARx, "translationX", (-translatexx));
            centerXx.setDuration((int)(600));
            scaledonwxx.setDuration((int)(600));
         //   centerXx.setDuration((int)(300*SqrtTwo));
           // scaledonwxx.setDuration((int)(300*SqrtTwo));

            scaledonwxx.start();
            centerXx.start();
            //PlayerHPBAR.getLayoutParams().width = convertToDp((int)whateverthisisinsideamethod);
            // PlayerHPBAR.setScaleType(ImageView.ScaleType.FIT_CENTER);

       // }else if(holdhpBarAnimplayerstart < holdhpBarAnimplayerEnd) {



      //  }
        EnemyHPBAR.getLayoutParams().height = convertToDp(20);

        float whateverthisisinsideamethodx = (float)Math.min(((int)((attackermonster.Health/MaxHealthAttacker)*110)), 110);


        if(whateverthisisinsideamethodx < 1){

            whateverthisisinsideamethodx = 0;

        }
        if(attackermonster.Health >= 1){

            whateverthisisinsideamethodx = Math.max(whateverthisisinsideamethodx, 1);

        }

        if(whateverthisisinsideamethodx < 75 && whateverthisisinsideamethodx >= 30){

            EnemyHPBAR.setColorFilter(Color.argb(255, 255, 200, 0));

        }else if(whateverthisisinsideamethodx <30){

            EnemyHPBAR.setColorFilter(Color.argb(255, 215, 10, 0));

        }else if(whateverthisisinsideamethodx < 1){

            EnemyHPBAR.setColorFilter(Color.argb(255, 0, 0, 0));

        }else {

            EnemyHPBAR.setColorFilter(Color.argb(255, 0, 255, 200));

        }



        ObjectAnimator Escaledonwx = ObjectAnimator.ofFloat(EnemyHPBAR, "scaleX", (float)(whateverthisisinsideamethodx/110));
        float translatex = convertToDp((int)(110-whateverthisisinsideamethodx)/2);
        ObjectAnimator EcenterX = ObjectAnimator.ofFloat(EnemyHPBAR, "translationX", -((translatex)));
        holdhpBarAnimAttackerstart = translatex;
        if((holdhpBarAnimAttackerstart-holdhpBarAnimAttackerEnd) >= 0) {
            EcenterX.setDuration(50);
            Escaledonwx.setDuration(50);

            Escaledonwx.start();
            EcenterX.start();
        }else {
            EcenterX.setDuration(600);
            Escaledonwx.setDuration(600);

            Escaledonwx.start();
            EcenterX.start();

        }
        ObjectAnimator Escaledonwxy = ObjectAnimator.ofFloat(EnemyHPBARx, "scaleX", (float)(whateverthisisinsideamethodx/110));
        float translatexy = convertToDp((int)(110-whateverthisisinsideamethodx)/2);
        ObjectAnimator EcenterXy = ObjectAnimator.ofFloat(EnemyHPBARx, "translationX", -((translatexy)));
        EcenterXy.setDuration(600);
        Escaledonwxy.setDuration(600);

        Escaledonwxy.start(); EcenterXy.start();
       // EnemyHPBAR.getLayoutParams().width = convertToDp((int)whateverthisisinsideamethodx);
       // EnemyHPBAR.setScaleType(ImageView.ScaleType.FIT_END);

    }

    public void StatAbuseCurbTell(monst raw){

        if (raw.Attack >= 750){
            raw.Attack = 750;
        }
        if (raw.Speed >= 750){
            raw.Speed = 750;
        }
        if (raw.Defense >= 750){
            raw.Defense = 750;
        }


     //   MonsterImageChangerPlayer(playermonster);

      //  MonsterImageChangerAttacker(attackermonster);

        AlwaysMakeSureHealthIsLessThanMax();

    }

    public void ResetWounds(){

        elongatedhealwoundpowerP = 0;
        elongatedwoundpowerP = 0;
        elongatedhealwoundtimerP = 0;
        elongatedwoundtimerP = 0;
        elongatedglugtimerA = 0;
        elongatedglugpowerA = 0;
        healblocktgimerA = 0;
        statblocktimerP = 0;
    }
    public void ResetWoundsA(){

        elongatedhealwoundpowerA = 0;
        elongatedwoundpowerA = 0;
        elongatedhealwoundtimerA = 0;
        elongatedwoundtimerA = 0;
        elongatedglugtimerP = 0;
        elongatedglugpowerP = 0;
        healblocktgimerP = 0;
        statblocktimerA = 0;
    }


    public void DeathTest(){

        String WhatHappenedString = TypesOfMotions(2);
        String displaystring = "%s";
        String displaystringH = "%s/%s";
        if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
            WhatHappenedString = TypesOfMotions(5); ActionNum = 1;

            if (playermonster.Health <= 0 && attackermonster.Health > 0){
                CombatString = String.format(CombatString + "Enemy "  + names(attackermonster.Idnum) + WhatHappenedString + "\n");
            }  if (attackermonster.Health <= 0 && playermonster.Health > 0){
                CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
            }if (attackermonster.Health <= 0 && playermonster.Health <= 0){
                CombatString = String.format(CombatString + "A Tie!"+"\n");
            }

        }
    }
    public void CapChanger(){

        Gson gson = new Gson();
        Context ProtomonContext = getApplicationContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();
        String json = prefs.getString("WorkingMonster", "");
        if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
            spawncap = 128;
            rotationcap = 129;
        }


    }

    public void onResume() {
        super.onResume();



        Context ProtomonContext = getApplicationContext();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();


        Gson gson = new Gson();
      //  Context ProtomonContext = getApplicationContext();
       // SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
       // SharedPreferences.Editor editor = prefs.edit();

        try {
            holdsong = playermonster.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        int bee;
        Bundle b = getIntent().getExtras();
           if (b != null) {

               k = b.getInt("MonsterChoice", (int)playermonster.Idnum);

               if (PlayerMonsterStorage[(int)k] != playermonster) {
                   //     songlist(playermonster);
                   //    CombatString = CombatString + names(playermonster.Idnum) + " is now Deployed! \n";
                   if (playermonster != PlayerMonsterStorage[(int)k]){
                       ResetWounds();
                   }
               }
      //  MonsterStorageCounter = b.getInt("Storage");
        //MonsterStorageCounter = 1;

            for (int dd = 0; dd < PlayerMonsterStorage.length; dd++) {
            PlayerMonsterStorage[dd] = null;
            }
            MonsterStorageCounter = b.getInt("RetStorage");

            //   dictionaryOfMonsters = b.getBooleanArray("Dictionary");

            PlayerMonsterStorage = new monst[17];
            int i = 0;
            while (i < MonsterStorageCounter) {

                String DustMe = "RetMonster";
                String DustMex = "%s";
                String BustMe = DustMe + String.format(DustMex, i);

                PlayerMonsterStorage[i] = b.getParcelable(BustMe);

                //  bee = (int) passedmonsters[i].Idnum;
                //   bee = bee;
                //  bee = bee;


                String json = prefs.getString(BustMe, "");
                PlayerMonsterStorage[i] = gson.fromJson(json, monst.class);


                i++;
        }
         playermonster = PlayerMonsterStorage[0];
        //       assert passedmonster != null;
        // int c = (int) passedmonster.Idnum;
        //  c = c;
    }else {

    }

        CapChanger();

        swapcode = 0;

        if (AttackerSounds != null) {
            AttackerSounds.setLooping(true); // boogaloo
            AttackerSounds.seekTo(songpos);
            AttackerSounds.start();
        }else {
            //  AttackerSounds.setLooping(false); // boogaloo
            //  AttackerSounds.stop();
        }

        float f = (float)((float)((float)(attackermonster.UniqueID%102) + 50)/100);
        //  f = (float) .3;


        if (AttackerSounds != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                AttackerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
            }
        }



        if(holdsong.UniqueID == playermonster.UniqueID) {
            if (PlayerSounds != null) {
                PlayerSounds.setLooping(true); // boogaloo
                PlayerSounds.seekTo(songposp);
                PlayerSounds.start();
            } else {
                //  AttackerSounds.setLooping(false); // boogaloo
                //  AttackerSounds.stop();
            }
        }else {
            if (PlayerSounds != null) {
                PlayerSounds.setLooping(true); // boogaloo
                PlayerSounds.seekTo(0);
                PlayerSounds.start();

            }
            songposp = 0;
        }

        float fp = (float)((float)((float)(playermonster.UniqueID%102) + 50)/100);
        //  f = (float) .3;


        if (PlayerSounds != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                PlayerSounds.setPlaybackParams(new PlaybackParams().setSpeed(fp));
            }
        }

if (wherewebin != 0) {
    for (int w = 0; w < MonsterStorageCounter; w++) {
        try {
            PlayerMonsterStorage[w].Health = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).clone().Health);
            PlayerMonsterStorage[w].Speed = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).clone().Speed);
            PlayerMonsterStorage[w].Defense = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).clone().Defense);
            PlayerMonsterStorage[w].Attack = stats(monstlist((int)PlayerMonsterStorage[w].Idnum).clone().Attack);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    RIVALMAKER();
    wherewebin = 0;

 //   Gson gson = new Gson();
 //   Context ProtomonContext = getApplicationContext();
//    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
//    SharedPreferences.Editor editor = prefs.edit();
    String json = prefs.getString("WorkingMonster", "");
    if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
        Custom = gson.fromJson(json, (Type) protomon.monst.class);
    }
    if(attackermonster.Idnum == Custom.Idnum){
        try {
            MaxHealthAttacker = stats(monstlist((int)Custom.Idnum).clone().Health);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    if(playermonster.Idnum == Custom.Idnum){
        try {
            MaxHealthPlayer = stats(monstlist((int)Custom.Idnum).clone().Health);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}


        MonsterImageChangerPlayer(playermonster);

        MonsterImageChangerAttacker(attackermonster);

        HealthBarUpdate();
    }

    public void MonsterImageChangerPlayer(monst PlayerMonsterHandle){

        PlayerDisplay.setColorFilter(Color.argb(0, 0, 0, 0));


        switch((int) PlayerMonsterHandle.Idnum) {

            case 0:
                PlayerDisplay.setImageResource(R.drawable.errantnope);
                break;
            case 1:
                PlayerDisplay.setImageResource(R.drawable.kunk);
                break;
            case 2:
                PlayerDisplay.setImageResource(R.drawable.kohboh);
                break;
            case 3:
                PlayerDisplay.setImageResource(R.drawable.djoper);
                break;
            case 4:
                PlayerDisplay.setImageResource(R.drawable.schorp);
                break;
            case 5:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaume);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumer);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumeb);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.nhainhai);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                PlayerDisplay.setImageResource(R.drawable.degeissdt);
                break;
            case 8:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.yuggle);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglee);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglet);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.yuggler);
                }
                break;
            case 9:
                PlayerDisplay.setImageResource(R.drawable.bongu);
                break;
            case 10:
                PlayerDisplay.setImageResource(R.drawable.giteriglia);
                break;
            case 11:
                PlayerDisplay.setImageResource(R.drawable.cyosteroth);
                break;
            case 12:
                PlayerDisplay.setImageResource(R.drawable.nentopode);
                break;
            case 13:
                PlayerDisplay.setImageResource(R.drawable.centiclak);
                break;
            case 14:
                PlayerDisplay.setImageResource(R.drawable.uggnawb);
                break;
            case 15:
                PlayerDisplay.setImageResource(R.drawable.grobhost);
                break;
            case 16:
                PlayerDisplay.setImageResource(R.drawable.illelonab);
                break;
            case 17:
                PlayerDisplay.setImageResource(R.drawable.rongzeed);
                break;
            case 18:
                PlayerDisplay.setImageResource(R.drawable.blattle);
                break;
            case 19:


                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.swogharnlera);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                PlayerDisplay.setImageResource(R.drawable.adenolish);
                break;
            case 21:

                if (PlayerMonsterHandle.UniqueID < 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.genaupresangb);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.genaupresangc);
                }

                break;
            case 22:
                if (PlayerMonsterHandle.UniqueID < 20000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnida);
                } else if (PlayerMonsterHandle.UniqueID < 40000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnidaa);
                } else if (PlayerMonsterHandle.UniqueID < 60000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnidab);
                } else if (PlayerMonsterHandle.UniqueID < 80000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnidac);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = PlayerMonsterHandle.UniqueID % 7; //>>>
                int daahnidacolorcontroller = PlayerMonsterHandle.UniqueID % 255;

                switch (daahnidacolorsetter) {
                    case 0:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255));
                        break;
                    case 2:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255));
                        break;
                    case 3:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                    case 5:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255));
                        break;
                    case 6:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                }


                break;
            case 23:
                PlayerDisplay.setImageResource(R.drawable.sorba);
                break;
            case 24:
                PlayerDisplay.setImageResource(R.drawable.jiyou);
                break;
            case 25:
                PlayerDisplay.setImageResource(R.drawable.sparvae);
                break;
            case 26:
                PlayerDisplay.setImageResource(R.drawable.vellup);
                break;
            case 27:
                PlayerDisplay.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                PlayerDisplay.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.ryteggg);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.rytegg);
                }
                break;
            case 30:
                PlayerDisplay.setImageResource(R.drawable.flashmer);
                break;
            case 31:
                PlayerDisplay.setImageResource(R.drawable.schmodozer);
                break;
            case 32:
                PlayerDisplay.setImageResource(R.drawable.octgotot);
                break;
            case 33:
                PlayerDisplay.setImageResource(R.drawable.triaural);
                break;
            case 34:
                PlayerDisplay.setImageResource(R.drawable.dicyto);
                break;
            case 35:
                PlayerDisplay.setImageResource(R.drawable.monopteryx);
                break;
            case 36:
                PlayerDisplay.setImageResource(R.drawable.elastocark);
                break;
            case 37:
                PlayerDisplay.setImageResource(R.drawable.toobapath);
                break;
            case 38:
                PlayerDisplay.setImageResource(R.drawable.wheeliosbop);
                break;
            case 39:
                PlayerDisplay.setImageResource(R.drawable.ihmpdrap);
                break;
            case 40:
                PlayerDisplay.setImageResource(R.drawable.epibazang);
                break;
            case 41:
                PlayerDisplay.setImageResource(R.drawable.hemtan);
                break;
            case 42:
                PlayerDisplay.setImageResource(R.drawable.ogo);
                break;
            case 43:
                PlayerDisplay.setImageResource(R.drawable.strachid);
                break;
            case 44:
                PlayerDisplay.setImageResource(R.drawable.toximastica);
                break;
            case 45:
                PlayerDisplay.setImageResource(R.drawable.urcuria);
                break;
            case 46:

                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntress);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressa);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressb);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressc);
                }
                break;
            case 47:
                PlayerDisplay.setImageResource(R.drawable.mondosplak);
                break;
            case 48:
                PlayerDisplay.setImageResource(R.drawable.kaheksaguge);
                break;
            case 49:
                PlayerDisplay.setImageResource(R.drawable.sapiosuant);
                break;
            case 50:


                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.munegullx);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.munegull);
                }

                break;
            case 51:
                PlayerDisplay.setImageResource(R.drawable.sudakleez);
                break;
            case 52:
                PlayerDisplay.setImageResource(R.drawable.halocordate);
                break;
            case 53:
                PlayerDisplay.setImageResource(R.drawable.faedendron);
                break;
            case 54:
                PlayerDisplay.setImageResource(R.drawable.osteoplang);
                break;
            case 55:
                PlayerDisplay.setImageResource(R.drawable.zrachnid);
                break;
            case 56:
                PlayerDisplay.setImageResource(R.drawable.xlitch);
                break;
            case 57:
                PlayerDisplay.setImageResource(R.drawable.baa);
                break;
            case 58:
                PlayerDisplay.setImageResource(R.drawable.mantidile);
                break;
            case 59:
                PlayerDisplay.setImageResource(R.drawable.nokoyl);
                break;
            case 60:
                PlayerDisplay.setImageResource(R.drawable.yallod);
                break;
            case 61:
                PlayerDisplay.setImageResource(R.drawable.algaetizer);
                break;
            case 62:
                PlayerDisplay.setImageResource(R.drawable.kachort);
                break;
            case 63:
                if (PlayerMonsterHandle.UniqueID < 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelion);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelionb);
                } else if (PlayerMonsterHandle.UniqueID < 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.slameliona);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.slamelion);
                }
                break;
            case 64:
                PlayerDisplay.setImageResource(R.drawable.ayateda);
                break;
            case 65:
                PlayerDisplay.setImageResource(R.drawable.wochem);
                break;
            case 66:
                PlayerDisplay.setImageResource(R.drawable.humun);
                break;
            case 67:
                PlayerDisplay.setImageResource(R.drawable.psychobath);
                break;
            case 68:
                PlayerDisplay.setImageResource(R.drawable.gytanic);
                break;
            case 69:
                PlayerDisplay.setImageResource(R.drawable.beis);
                break;
            case 70:
                PlayerDisplay.setImageResource(R.drawable.gungholio);
                break;
            case 71:
                PlayerDisplay.setImageResource(R.drawable.honigkonig);
                break;
            case 72:
                PlayerDisplay.setImageResource(R.drawable.kungulp);
                break;
            case 73:
                PlayerDisplay.setImageResource(R.drawable.satinella);
                break;
            case 74:
                PlayerDisplay.setImageResource(R.drawable.elocurl);
                break;
            case 75:
                PlayerDisplay.setImageResource(R.drawable.takobie);
                break;
            case 76:
                PlayerDisplay.setImageResource(R.drawable.obchovy);
                break;
            case 77:
                PlayerDisplay.setImageResource(R.drawable.nimnamnom);
                break;
            case 78:
                PlayerDisplay.setImageResource(R.drawable.tutewtoo);
                break;
            case 79:
                PlayerDisplay.setImageResource(R.drawable.blanqast);
                break;
            case 80:
                PlayerDisplay.setImageResource(R.drawable.indeo);
                break;
            case 81:
                PlayerDisplay.setImageResource(R.drawable.deblobbio);
                break;
            case 82:
                PlayerDisplay.setImageResource(R.drawable.knightstacean);
                break;
            case 83:
                PlayerDisplay.setImageResource(R.drawable.prostrax);
                break;
            case 84:
                PlayerDisplay.setImageResource(R.drawable.haptozahen);
                break;
            case 85:
                PlayerDisplay.setImageResource(R.drawable.minkohabod);
                break;
            case 86:
                PlayerDisplay.setImageResource(R.drawable.zeen);
                break;
            case 87:
                PlayerDisplay.setImageResource(R.drawable.tacroach);
                break;
            case 88:
                PlayerDisplay.setImageResource(R.drawable.manterfly);
                break;
            case 89:
                if (PlayerMonsterHandle.UniqueID < 9000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearya);
                } else if (PlayerMonsterHandle.UniqueID < 18000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyb);
                } else if (PlayerMonsterHandle.UniqueID < 27000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyc);
                } else if (PlayerMonsterHandle.UniqueID < 36000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyd);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearye);
                } else if (PlayerMonsterHandle.UniqueID < 54000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyf);
                } else if (PlayerMonsterHandle.UniqueID < 63000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyg);
                } else if (PlayerMonsterHandle.UniqueID < 72000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyh);
                } else if (PlayerMonsterHandle.UniqueID < 81000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyi);
                } else if (PlayerMonsterHandle.UniqueID < 90000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyj);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.bearyk);
                }
                break;
            case 90:
                PlayerDisplay.setImageResource(R.drawable.sluggernaut);
                break;
            case 91:
                if (PlayerMonsterHandle.UniqueID < 12000000) {
                    PlayerDisplay.setImageResource(R.drawable.firstcustom);
                } else if (PlayerMonsterHandle.UniqueID < 44000000) {
                    PlayerDisplay.setImageResource(R.drawable.missleaneous);
                } else if (PlayerMonsterHandle.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.firstcustoma);
                } else if (PlayerMonsterHandle.UniqueID < 87000000) {
                    PlayerDisplay.setImageResource(R.drawable.whumpuhmp);
                } else if (PlayerMonsterHandle.UniqueID < 88000000) {
                    PlayerDisplay.setImageResource(R.drawable.zubgondrakter);
                } else if (PlayerMonsterHandle.UniqueID < 89000000) {
                    PlayerDisplay.setImageResource(R.drawable.rattic);
                } else if (PlayerMonsterHandle.UniqueID < 89500000) {
                    PlayerDisplay.setImageResource(R.drawable.doughgnat);
                } else if (PlayerMonsterHandle.UniqueID < 90000000) {
                    PlayerDisplay.setImageResource(R.drawable.sluggernaut);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.firstcustomc);
                }
                break;


            case 92:

                int memeekcolorsetter = PlayerMonsterHandle.UniqueID % 7; //>>>
                int memeekcolorcontroller = PlayerMonsterHandle.UniqueID % 255;

                switch (memeekcolorsetter) {
                    case 0:
                        PlayerDisplay.setColorFilter(Color.argb(2, 255, 255, memeekcolorcontroller));
                        break;
                    case 1:
                        PlayerDisplay.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, 255));
                        break;
                    case 2:
                        PlayerDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, 255));
                        break;
                    case 3:
                        PlayerDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, memeekcolorcontroller));
                        break;
                    case 4:
                        PlayerDisplay.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                    case 5:
                        PlayerDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, 255));
                        break;
                    case 6:
                        PlayerDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                }
                PlayerDisplay.setImageResource(R.drawable.memeeka);
                break;
            case 93:
                PlayerDisplay.setImageResource(R.drawable.doughgnat);
                break;
            case 94:
                PlayerDisplay.setImageResource(R.drawable.rattic);
                break;
            case 95:
                PlayerDisplay.setImageResource(R.drawable.missleaneous);
                break;
            case 96:
                if(PlayerMonsterHandle.UniqueID < 15000000) {
                PlayerDisplay.setImageResource(R.drawable.runnybabbita);
            }else if (PlayerMonsterHandle.UniqueID < 20000000) {
                PlayerDisplay.setImageResource(R.drawable.runnybabbitb);
            }else if (PlayerMonsterHandle.UniqueID < 30000000) {
                PlayerDisplay.setImageResource(R.drawable.runnybabbitc);
            }else if (PlayerMonsterHandle.UniqueID < 40000000) {
                PlayerDisplay.setImageResource(R.drawable.runnybabbitd);
            }else if (PlayerMonsterHandle.UniqueID < 50000000) {
                PlayerDisplay.setImageResource(R.drawable.runnybabbite);
            }else {

                    PlayerDisplay.setImageResource(R.drawable.runnybabbitx);
                }
                break;
            case 97:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.zubgondrakter);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.zubgondrakterhat);
                }
                break;
            case 98:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.whumpuhmp);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.whumpuhmp);
                }
                break;
            case 99:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.mangoon);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.mangoon);
                }
                break;
            case 100:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.scarbeque);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.fwuffynumpkins);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;
            case 102:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.dothog);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.reefcake);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.cheetza);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.sortsand);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.chilldabeest);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.chilldabeest);
                }
                break;
            case 107:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.communigator);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.mossboss);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.vamprey);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.parafox);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.rhischlosserous);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.hykeyna);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.tafantula);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.farmot);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.beeurchin);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.flyinsoup);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.meloncolli);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.scorphibian);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.scorphibian);
                }
                break;
            case 119:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.geliphant);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.geliphantx);
                }
                break;
            case 120:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.chimpansy);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.chimpansy);
                }
                break;
            case 121:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.giveup);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.giveupx);
                }
                break;
            case 122:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    PlayerDisplay.setImageResource(R.drawable.avokaboomx);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.avokaboom);
                }
                break;
            case 123:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.eggress);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.eggressx);
                }
                break;
            case 124:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.zentapede);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.zentapede);
                }
                break;
            case 125:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.probocetus);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.probocetus);
                }
                break;
            case 126:

                if (PlayerMonsterHandle.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.tankgolin);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.tankgolin);
                }
                break;
            case 127:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    PlayerDisplay.setImageResource(R.drawable.spiekgulx);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.spiekgul);
                }
                break;
            case 128:

                if (PlayerMonsterHandle.UniqueID < 5000000) {
                    PlayerDisplay.setImageResource(R.drawable.mnemont);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.mnemont);
                }
                break;
        }

        }
public void MonsterImageChangerAttacker(monst AttackerMonsterHandle){

    EnemyDisplay.setColorFilter(Color.argb(0, 0, 0, 0));


        switch((int) AttackerMonsterHandle.Idnum){

case 0:
          EnemyDisplay.setImageResource(R.drawable.errantnope);
                    break;
case 1:
                 EnemyDisplay.setImageResource(R.drawable.kunk);
                    break;
case 2:
       EnemyDisplay.setImageResource(R.drawable.kohboh);
                    break;
case 3:
           EnemyDisplay.setImageResource(R.drawable.djoper);
                    break;
case 4:
            EnemyDisplay.setImageResource(R.drawable.schorp);
                    break;
case 5:
    if (AttackerMonsterHandle.UniqueID < 22000000) {
        EnemyDisplay.setImageResource(R.drawable.zaume);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.zaumer);
    }else if(AttackerMonsterHandle.UniqueID < 70000000) {
        EnemyDisplay.setImageResource(R.drawable.zaumeb);
    }else {
        EnemyDisplay.setImageResource(R.drawable.zaumeg);
    }
                    break;
case 6:
    if (AttackerMonsterHandle.UniqueID < 50000000) {
        EnemyDisplay.setImageResource(R.drawable.nhainhai);
    }else {
        EnemyDisplay.setImageResource(R.drawable.nhainhaii);
    }
                    break;
case 7:
              EnemyDisplay.setImageResource(R.drawable.degeissdt);
                    break;
case 8:

    if (AttackerMonsterHandle.UniqueID < 22000000) {
        EnemyDisplay.setImageResource(R.drawable.yuggle);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.yugglee);
    }else if(AttackerMonsterHandle.UniqueID < 70000000) {
        EnemyDisplay.setImageResource(R.drawable.yugglet);
    }else {
        EnemyDisplay.setImageResource(R.drawable.yuggler);
    }
                    break;
case 9:
            EnemyDisplay.setImageResource(R.drawable.bongu);
                    break;
case 10:
               EnemyDisplay.setImageResource(R.drawable.giteriglia);
                    break;
case 11:
                       EnemyDisplay.setImageResource(R.drawable.cyosteroth);
                    break;
case 12:
                       EnemyDisplay.setImageResource(R.drawable.nentopode);
                    break;
case 13:
                       EnemyDisplay.setImageResource(R.drawable.centiclak);
                    break;
case 14:
                       EnemyDisplay.setImageResource(R.drawable.uggnawb);
                    break;
case 15:
                       EnemyDisplay.setImageResource(R.drawable.grobhost);
                    break;
case 16:
                     EnemyDisplay.setImageResource(R.drawable.illelonab);
                    break;
case 17:
                      EnemyDisplay.setImageResource(R.drawable.rongzeed);
                    break;
case 18:
                     EnemyDisplay.setImageResource(R.drawable.blattle);
                    break;
case 19:

    if (AttackerMonsterHandle.UniqueID < 50000000) {
        EnemyDisplay.setImageResource(R.drawable.swogharnlera);
    }else {
        EnemyDisplay.setImageResource(R.drawable.swogharnler);
    }
                    break;
case 20:
                      EnemyDisplay.setImageResource(R.drawable.adenolish);
                    break;
case 21:
    if (AttackerMonsterHandle.UniqueID < 70000000) {
        EnemyDisplay.setImageResource(R.drawable.genaupresangb);
    }else {
        EnemyDisplay.setImageResource(R.drawable.genaupresangc);
    }


                    break;
case 22:

    if (AttackerMonsterHandle.UniqueID < 20000000) {
        EnemyDisplay.setImageResource(R.drawable.daahnida);
    }else if (AttackerMonsterHandle.UniqueID < 40000000){
        EnemyDisplay.setImageResource(R.drawable.daahnidaa);
    }else if (AttackerMonsterHandle.UniqueID < 60000000){
        EnemyDisplay.setImageResource(R.drawable.daahnidab);
    }else if (AttackerMonsterHandle.UniqueID < 80000000){
        EnemyDisplay.setImageResource(R.drawable.daahnidac);
    }else {
        EnemyDisplay.setImageResource(R.drawable.daahnidad);
    }


    int daahnidacolorsetter = AttackerMonsterHandle.UniqueID % 7; //>>>
    int daahnidacolorcontroller = AttackerMonsterHandle.UniqueID % 255;

    switch (daahnidacolorsetter){
        case 0:
            EnemyDisplay.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
            break;
        case 1:
            EnemyDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255 ));
            break;
        case 2:
            EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255 ));
            break;
        case 3:
            EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
            break;
        case 4:
            EnemyDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller ));
            break;
        case 5:
            EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255 ));
            break;
        case 6:
            EnemyDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller ));
            break;
    }

    break;
case 23:
                      EnemyDisplay.setImageResource(R.drawable.sorba);
                    break;
case 24:
                       EnemyDisplay.setImageResource(R.drawable.jiyou);
                    break;
case 25:
                       EnemyDisplay.setImageResource(R.drawable.sparvae);
                    break;
case 26:
                       EnemyDisplay.setImageResource(R.drawable.vellup);
                    break;
case 27:
                       EnemyDisplay.setImageResource(R.drawable.bellaja);
                    break;
case 28:
                     EnemyDisplay.setImageResource(R.drawable.levdzell);
                    break;
case 29:
    if (AttackerMonsterHandle.UniqueID < 50000000) {
        EnemyDisplay.setImageResource(R.drawable.ryteggg);
    }else {
        EnemyDisplay.setImageResource(R.drawable.rytegg);
    }
                    break;
case 30:
                       EnemyDisplay.setImageResource(R.drawable.flashmer);
                    break;
case 31:
                       EnemyDisplay.setImageResource(R.drawable.schmodozer);
                    break;
case 32:
                       EnemyDisplay.setImageResource(R.drawable.octgotot);
                    break;
case 33:
                       EnemyDisplay.setImageResource(R.drawable.triaural);
                    break;
case 34:
                     EnemyDisplay.setImageResource(R.drawable.dicyto);
                    break;
case 35:
                       EnemyDisplay.setImageResource(R.drawable.monopteryx);
                    break;
case 36:
                       EnemyDisplay.setImageResource(R.drawable.elastocark);
                    break;
case 37:
                      EnemyDisplay.setImageResource(R.drawable.toobapath);
                    break;
case 38:
                       EnemyDisplay.setImageResource(R.drawable.wheeliosbop);
                    break;
case 39:
                      EnemyDisplay.setImageResource(R.drawable.ihmpdrap);
                    break;
case 40:
                       EnemyDisplay.setImageResource(R.drawable.epibazang);
                    break;
case 41:
                     EnemyDisplay.setImageResource(R.drawable.hemtan);
                    break;
case 42:
                      EnemyDisplay.setImageResource(R.drawable.ogo);
                    break;
case 43:
                       EnemyDisplay.setImageResource(R.drawable.strachid);
                    break;
case 44:
                       EnemyDisplay.setImageResource(R.drawable.toximastica);
                    break;
case 45:
                      EnemyDisplay.setImageResource(R.drawable.urcuria);
                    break;
case 46:
    if (AttackerMonsterHandle.UniqueID < 22000000) {
        EnemyDisplay.setImageResource(R.drawable.hyuntress);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.hyuntressa);
    }else if(AttackerMonsterHandle.UniqueID < 70000000) {
        EnemyDisplay.setImageResource(R.drawable.hyuntressb);
    }else {
        EnemyDisplay.setImageResource(R.drawable.hyuntressc);
    }
                    break;
case 47:
                      EnemyDisplay.setImageResource(R.drawable.mondosplak);
                    break;
case 48:
                       EnemyDisplay.setImageResource(R.drawable.kaheksaguge);
                    break;
case 49:
                        EnemyDisplay.setImageResource(R.drawable.sapiosuant);
                    break;
case 50:
    if (AttackerMonsterHandle.UniqueID < 22000000) {
        EnemyDisplay.setImageResource(R.drawable.munegullx);
    } else {
        EnemyDisplay.setImageResource(R.drawable.munegull);
    }

    break;
case 51:
                       EnemyDisplay.setImageResource(R.drawable.sudakleez);
                    break;
case 52:
                      EnemyDisplay.setImageResource(R.drawable.halocordate);
                    break;
case 53:
                       EnemyDisplay.setImageResource(R.drawable.faedendron);
                    break;
case 54:
                       EnemyDisplay.setImageResource(R.drawable.osteoplang);
                    break;
case 55:
                       EnemyDisplay.setImageResource(R.drawable.zrachnid);
                    break;
case 56:
                      EnemyDisplay.setImageResource(R.drawable.xlitch);
                    break;
case 57:
                       EnemyDisplay.setImageResource(R.drawable.baa);
                    break;
case 58:
                       EnemyDisplay.setImageResource(R.drawable.mantidile);
                    break;
case 59:
                       EnemyDisplay.setImageResource(R.drawable.nokoyl);
                    break;
case 60:
                       EnemyDisplay.setImageResource(R.drawable.yallod);
                    break;
case 61:
                      EnemyDisplay.setImageResource(R.drawable.algaetizer);
                    break;
case 62:
                       EnemyDisplay.setImageResource(R.drawable.kachort);
                    break;
case 63:
    if (AttackerMonsterHandle.UniqueID < 22000000) {
        EnemyDisplay.setImageResource(R.drawable.slamelion);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.slamelionb);
    }else if(AttackerMonsterHandle.UniqueID < 70000000) {
        EnemyDisplay.setImageResource(R.drawable.slameliona);
    }else {
        EnemyDisplay.setImageResource(R.drawable.slamelion);
    }
                    break;
case 64:
                     EnemyDisplay.setImageResource(R.drawable.ayateda);
                    break;
case 65:
                    EnemyDisplay.setImageResource(R.drawable.wochem);
                    break;
case 66:
                       EnemyDisplay.setImageResource(R.drawable.humun);
                    break;
case 67:
                       EnemyDisplay.setImageResource(R.drawable.psychobath);
                    break;
case 68:
                       EnemyDisplay.setImageResource(R.drawable.gytanic);
                    break;
case 69:
                      EnemyDisplay.setImageResource(R.drawable.beis);
                    break;
case 70:
                       EnemyDisplay.setImageResource(R.drawable.gungholio);
                    break;
case 71:
                      EnemyDisplay.setImageResource(R.drawable.honigkonig);
                    break;
case 72:
                      EnemyDisplay.setImageResource(R.drawable.kungulp);
                    break;
case 73:
                     EnemyDisplay.setImageResource(R.drawable.satinella);
                    break;
case 74:
                       EnemyDisplay.setImageResource(R.drawable.elocurl);
                    break;
case 75:
                        EnemyDisplay.setImageResource(R.drawable.takobie);
                    break;
case 76:
                     EnemyDisplay.setImageResource(R.drawable.obchovy);
                    break;
case 77:
                       EnemyDisplay.setImageResource(R.drawable.nimnamnom);
                    break;
case 78:
                       EnemyDisplay.setImageResource(R.drawable.tutewtoo);
                    break;
case 79:
                       EnemyDisplay.setImageResource(R.drawable.blanqast);
                    break;
case 80:
                EnemyDisplay.setImageResource(R.drawable.indeo);
                    break;
case 81:
                     EnemyDisplay.setImageResource(R.drawable.deblobbio);
                    break;
case 82:
     EnemyDisplay.setImageResource(R.drawable.knightstacean);
    break;
case 83:
    EnemyDisplay.setImageResource(R.drawable.prostrax);
    break;
case 84:
    EnemyDisplay.setImageResource(R.drawable.haptozahen);
    break;
case 85:
    EnemyDisplay.setImageResource(R.drawable.minkohabod);
    break;
case 86:
    EnemyDisplay.setImageResource(R.drawable.zeen);
    break;
case 87:
    EnemyDisplay.setImageResource(R.drawable.tacroach);
    break;
case 88:
    EnemyDisplay.setImageResource(R.drawable.manterfly);
    break;
case 89:
    if (AttackerMonsterHandle.UniqueID < 9000000) {
        EnemyDisplay.setImageResource(R.drawable.bearya);
    }else if(AttackerMonsterHandle.UniqueID < 18000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyb);
    }else if(AttackerMonsterHandle.UniqueID < 27000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyc);
    }else if(AttackerMonsterHandle.UniqueID < 36000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyd);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.bearye);
    }else if(AttackerMonsterHandle.UniqueID < 54000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyf);
    }else if(AttackerMonsterHandle.UniqueID < 63000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyg);
    }else if(AttackerMonsterHandle.UniqueID < 72000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyh);
    }else if(AttackerMonsterHandle.UniqueID < 81000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyi);
    }else if(AttackerMonsterHandle.UniqueID < 90000000) {
        EnemyDisplay.setImageResource(R.drawable.bearyj);
    }else  {
        EnemyDisplay.setImageResource(R.drawable.bearyk);
    }
    break;
    case 90:
        EnemyDisplay.setImageResource(R.drawable.sluggernaut);
        break;
case 91:
    if (AttackerMonsterHandle.UniqueID < 12000000) {
        EnemyDisplay.setImageResource(R.drawable.firstcustom);
    }else if(AttackerMonsterHandle.UniqueID < 44000000) {
        EnemyDisplay.setImageResource(R.drawable.missleaneous);
    }else if(AttackerMonsterHandle.UniqueID < 45000000) {
        EnemyDisplay.setImageResource(R.drawable.firstcustoma);
    }else if(AttackerMonsterHandle.UniqueID < 87000000) {
        EnemyDisplay.setImageResource(R.drawable.whumpuhmp);
    }else if(AttackerMonsterHandle.UniqueID < 88000000) {
        EnemyDisplay.setImageResource(R.drawable.zubgondrakter);
    }else if(AttackerMonsterHandle.UniqueID < 89000000) {
        EnemyDisplay.setImageResource(R.drawable.rattic);
    }else if(AttackerMonsterHandle.UniqueID < 89500000) {
        EnemyDisplay.setImageResource(R.drawable.doughgnat);
    }else if(AttackerMonsterHandle.UniqueID < 90000000) {
        EnemyDisplay.setImageResource(R.drawable.sluggernaut);
    }else {
        EnemyDisplay.setImageResource(R.drawable.firstcustomc);
    }


    break;

    case 92:


        int memeekcolorsetter = AttackerMonsterHandle.UniqueID % 7; //>>>
        int memeekcolorcontroller = AttackerMonsterHandle.UniqueID % 255;

        switch (memeekcolorsetter){
            case 0:
                EnemyDisplay.setColorFilter(Color.argb(110, 255, 255, memeekcolorcontroller));
                break;
            case 1:
                EnemyDisplay.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, 255 ));
                break;
            case 2:
                EnemyDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, 255 ));
                break;
            case 3:
                EnemyDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, memeekcolorcontroller));
                break;
            case 4:
                EnemyDisplay.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, memeekcolorcontroller ));
                break;
            case 5:
                EnemyDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, 255 ));
                break;
            case 6:
                EnemyDisplay.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, memeekcolorcontroller ));
                break;
        }
        EnemyDisplay.setImageResource(R.drawable.memeeka);
        break;
            case 93:
                EnemyDisplay.setImageResource(R.drawable.doughgnat);
                break;
            case 94:
                EnemyDisplay.setImageResource(R.drawable.rattic);
                break;
            case 95:
                EnemyDisplay.setImageResource(R.drawable.missleaneous);
                break;
            case 96:
                if(AttackerMonsterHandle.UniqueID < 15000000) {
                    EnemyDisplay.setImageResource(R.drawable.runnybabbita);
                }else if (AttackerMonsterHandle.UniqueID < 20000000) {
                    EnemyDisplay.setImageResource(R.drawable.runnybabbitb);
                }else if (AttackerMonsterHandle.UniqueID < 30000000) {
                    EnemyDisplay.setImageResource(R.drawable.runnybabbitc);
                }else if (AttackerMonsterHandle.UniqueID < 40000000) {
                    EnemyDisplay.setImageResource(R.drawable.runnybabbitd);
                }else if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.runnybabbite);
                }else {

                    EnemyDisplay.setImageResource(R.drawable.runnybabbitx);
                }
                break;
            case 97:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.zubgondrakter);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.zubgondrakterhat);
                }
                break;
            case 98:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.whumpuhmp);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.whumpuhmp);
                }
                break;
            case 99:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.mangoon);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.mangoon);
                }
                break;
            case 100:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.scarbeque);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.fwuffynumpkins);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;
            case 102:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.dothog);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.reefcake);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.cheetza);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.sortsand);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.chilldabeest);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.chilldabeest);
                }
                break;
            case 107:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.communigator);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.mossboss);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.vamprey);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.parafox);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.rhischlosserous);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.hykeyna);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.tafantula);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.farmot);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.beeurchin);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.flyinsoup);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.meloncolli);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.scorphibian);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.scorphibian);
                }
                break;
            case 119:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.geliphant);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.geliphantx);
                }
                break;
            case 120:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.chimpansy);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.chimpansy);
                }
                break;
            case 121:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.giveup);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.giveupx);
                }
                break;
            case 122:
                if (AttackerMonsterHandle.UniqueID < 5000000) {
                    EnemyDisplay.setImageResource(R.drawable.avokaboomx);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.avokaboom);
                }
                break;
            case 123:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.eggress);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.eggressx);
                }
                break;
            case 124:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.zentapede);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.zentapede);
                }
                break;
            case 125:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.probocetus);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.probocetus);
                }
                break;
            case 126:
                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.tankgolin);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.tankgolin);
                }
                break;
            case 127:
                if (AttackerMonsterHandle.UniqueID < 5000000) {
                    EnemyDisplay.setImageResource(R.drawable.spiekgulx);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.spiekgul);
                }
                break;
            case 128:
                if (AttackerMonsterHandle.UniqueID < 5000000) {
                    EnemyDisplay.setImageResource(R.drawable.mnemont);
                }else {
                    EnemyDisplay.setImageResource(R.drawable.mnemont);
                }
                break;
        }


    }


    public void RoboBrainMethodTell(Button Teller) {


        if ( somebodystopme == 1){

            return;
        }
        if (disgustingworkarounda == 1) {
           // tangiblecheck = 1;
        }
        Damage = 0;
        double Holdthisformeplayerattack = playermonster.Attack;
        double Holdthisformemonsterattack = attackermonster.Attack;
        double Holdthisformeplayerdefense = playermonster.Defense;
        double Holdthisformemonsterdefense = attackermonster.Defense;
        double Holdthisformeplayerspeed = playermonster.Speed;
        double Holdthisformemonsterspeed = attackermonster.Speed;


        if (copying == 0){
        int BrainNumb = new Random().nextInt(10);
        switch (BrainNumb) {

            case 0:
                Teller = SpecialAttack;
                break;
            case 1:
                Teller = Turn;
                break;
            case 2:
                Teller = Turn;
                break;
            case 3:
                Teller = Turn;
                break;
            case 4:
                Teller = HealButton;
                break;
            case 5:
                Teller = HealButton;
                break;
            case 6:
                Teller = Status;
                break;
            case 7:
                Teller = Status;
                break;
            case 8:
                Teller = SpecialAttack;
                break;
            case 9:
                Teller = Turn;
                break;


        }
        if (playermonster.Moveslotattack == 8) { // was attackermonster


            if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                Teller = Turn;
            }

            double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


            double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

            double Go = ((attackermonster.Attack / playermonster.Defense) * 50);


            switch (attackermonster.Moveslotdefense) {

                case 0:
                    Go = ((attackermonster.Attack / playermonster.Defense) * 50);

                    break;

                case 1:
                    Go = ((attackermonster.Attack / playermonster.Speed) * 50);

                    break;

                case 2:
                    Go = ((attackermonster.Attack / playermonster.Attack) * 50);


                    break;


                case 3:
                    Go = ((attackermonster.Speed / playermonster.Defense) * 50);

                    break;

                case 4:
                    Go = ((attackermonster.Speed / playermonster.Speed) * 50);

                    break;

                case 5:
                    Go = ((attackermonster.Speed / playermonster.Attack) * 50);

                    break;

                case 6:
                    Go = ((attackermonster.Defense / playermonster.Defense) * 50);

                    break;

                case 7:
                    Go = ((attackermonster.Defense / playermonster.Speed) * 50);

                    break;

                case 8:
                    Go = ((attackermonster.Defense / playermonster.Attack) * 50);

                    break;


            }

            int suicidecheckbasic = (int) (1.4 * AttackerReflectReturn((int) Go));

       /* if (( elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2) || ( elongatedhealwoundtimerP <= 1 && (thisdoctork*2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2) || (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed*1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3  && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage*3) > (MaxHealthPlayer*2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage)))){
            if ((thisdoctork*5) >= Go) {
                Teller = Turn;
            }
        } */

            if ((elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2)) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = Turn;
                }
            } else if ((elongatedhealwoundtimerP <= 1 && (thisdoctork * 2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2)) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = Turn;
                }
            } else if (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed * 1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage * 3) > (MaxHealthPlayer * 2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage))) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = Turn;
                }
            }

            double effectivehits = 0;
            double effectivehitsreflect = 0;

            switch (playermonster.Moveslotdefense) {
                case 0:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 1:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 2:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
                case 3:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 4:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 5:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
                case 6:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 7:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 8:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
            }


            double newHoldthisformemonsterdefense = attackermonster.Defense;
            double newHoldthisformemonsterattack = attackermonster.Attack;
            double newHoldthisformemonsterspeed = attackermonster.Speed;
            double newHoldthisformeplayerdefense = playermonster.Defense;
            double newHoldthisformeplayerattack = playermonster.Attack;
            double newHoldthisformeplayerspeed = playermonster.Speed;


            double reflectRatioAttackerTest = (double) (attackermonster.Defense / attackermonster.Speed);


            reflectRatioAttackerTest = (double) (0.449 * ((25 * reflectRatioAttackerTest) - (reflectRatioAttackerTest * reflectRatioAttackerTest))) + 17;
            if (reflectRatioAttacker != 0) {
                effectivehits = effectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), effectivehits);
            }
            double neweffectivehits = 0;
            double neweffectivehitsreflect = 0;
            neweffectivehitsreflect = (double) (effectivehits * (1 + (reflectRatioAttackerTest / 100)));
            double reflectbonushits = neweffectivehitsreflect - effectivehits;


            switch (attackermonster.Moveslotspeed) {
                case 0:
                    newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                    break;
                case 1:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 2:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    break;
                case 3:
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 4:
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 5:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    break;
                case 6:
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    break;
                case 7:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 8:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 9:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    break;
                case 10:
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 11:
                    newHoldthisformemonsterspeed = attackermonster.Speed * 2;
                    break;
                case 12:
                    newHoldthisformemonsterdefense = attackermonster.Defense * 2;
                    break;
                case 13:
                    newHoldthisformemonsterattack = attackermonster.Attack * 2;
                    break;
                case 14:
                    newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                    newHoldthisformeplayerspeed = playermonster.Speed / FrrtTwo;
                    break;
                case 15:
                    newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                    newHoldthisformeplayerdefense = playermonster.Defense / FrrtTwo;
                    break;
                case 16:
                    newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                    newHoldthisformeplayerattack = playermonster.Attack / FrrtTwo;
                    break;
            }


            double playereffectivehits = 0;
            double newplayereffectivehits = 0;

            switch (attackermonster.Moveslotdefense) {
                case 0:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 1:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 2:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
                case 3:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 4:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 5:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
                case 6:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 7:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 8:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
            }
            switch (attackermonster.Moveslotdefense) {
                case 0:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 1:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 2:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
                case 3:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 4:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 5:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
                case 6:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 7:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 8:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
            }

            if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && ((playereffectivehits - newplayereffectivehits) >= 1)) {
                Teller = Status;
            }
            if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((playereffectivehits - newplayereffectivehits) >= 1) && effectivehits > 7.0) {
                Teller = Status;
            }


            switch (playermonster.Moveslotdefense) {
                case 0:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 1:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 2:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
                case 3:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 4:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 5:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
                case 6:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 7:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 8:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
            }

            if (reflectRatioAttacker != 0) {
                neweffectivehits = neweffectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), neweffectivehits);
            }


            if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && (neweffectivehits - effectivehits) >= 1) {
                Teller = Status;
            }

            if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((neweffectivehits - effectivehits) >= 1) && effectivehits > 7.0) {
                Teller = Status;
            }

            double totalhitdiff = ((playereffectivehits - newplayereffectivehits)) + (neweffectivehits - effectivehits);

            if (totalhitdiff >= 1 && attackermonster.Moveslotspeed > 13) {
                Teller = Status;
            }


            if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13))) {
                if (Teller != Status) {
                    if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = Turn;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {
                            switch (new Random().nextInt(17)) {

                                case 0:
                                    Teller = Status;
                                    break;
                                case 1:
                                    Teller = Status;
                                    break;
                                case 2:
                                    Teller = Status;
                                    break;
                                case 3:
                                    Teller = Status;
                                    break;
                                case 4:
                                    Teller = Turn;
                                    break;
                                case 5:
                                    Teller = Status;
                                    break;
                                case 6:
                                    Teller = Turn;
                                    break;
                                case 7:
                                    Teller = Status;
                                    break;
                                case 8:
                                    Teller = Status;
                                    break;
                                case 9:
                                    Teller = Status;
                                    break;
                                case 10:
                                    Teller = Status;
                                    break;
                                case 11:
                                    Teller = Status;
                                    break;
                                case 12:
                                    Teller = Status;
                                    break;
                                case 13:
                                    Teller = Status;
                                    break;
                                case 14:
                                    Teller = Status;
                                    break;
                                case 15:
                                    Teller = Status;
                                    break;
                                case 16:
                                    Teller = Turn;
                                    break;
                            }

                        }
                    }
                }
                if (Teller == Status && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                    switch (new Random().nextInt(17)) {

                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = SpecialAttack;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = Status;
                            break;
                        case 4:
                            Teller = Turn;
                            break;
                        case 5:
                            Teller = Turn;
                            break;
                        case 6:
                            Teller = Turn;
                            break;
                        case 7:
                            Teller = Turn;
                            break;
                        case 8:
                            Teller = Status;
                            break;
                        case 9:
                            Teller = SpecialAttack;
                            break;
                        case 10:
                            Teller = Turn;
                            break;
                        case 11:
                            Teller = Turn;
                            break;
                        case 12:
                            Teller = Turn;
                            break;
                        case 13:
                            Teller = Turn;
                            break;
                        case 14:
                            Teller = Turn;
                            break;
                        case 15:
                            Teller = SpecialAttack;
                            break;
                        case 16:
                            Teller = Turn;
                            break;
                    }

                }
            }

            if (Teller == Status) {
                if (!(attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = Turn;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        Teller = Turn;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = Turn;
                            } else {
                                Teller = Turn;
                            }
                            break;

                    }
                }
                if (AttackerStatDelayTimer != -1) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = Turn;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        Teller = Turn;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = Turn;
                            } else {
                                Teller = Turn;
                            }
                            break;

                    }
                }

            }

            double ratiohealth = (100 * attackermonster.Health / MaxHealthAttacker);

            double delayedblastcheck = (int) (((new Random().nextInt(5) + 65)) * (attackermonster.Attack / playermonster.Speed));

            double testdamageOverpower = ((attackermonster.Attack / playermonster.Attack) * 51);

            double testdamageBeam = ((attackermonster.Defense / playermonster.Attack) * 51);
            if (reflectbonushits > 0.85) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                }
            }
            double longhealtesterx = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
            if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                if (((longhealtesterx * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                    if (elongatedhealtimerA <= 2) {
                        Teller = HealButton;
                    } else if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                } else {
                    if (reflectTimerOnAttacker <= 2) {
                        Teller = SpecialAttack;
                    } else if (elongatedhealtimerA == 0) {
                        Teller = HealButton;
                    }
                }
            }
            //Reflect
            if (Teller != Status) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker <= 2) {
                        if (attackermonster.Defense >= attackermonster.Speed) {
                            Teller = SpecialAttack;
                        }
                    } else if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotattack == 15 && reflectTimerOnAttacker > 2) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
            }
            if (attackermonster.Moveslotattack == 15 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }
            }


            double testdamage = ((attackermonster.Attack / playermonster.Defense) * 50);


            String Catchsopmekindofattack = " Attacks ";

            switch (attackermonster.Moveslotdefense) {

                case 0:
                    testdamage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                    Catchsopmekindofattack = " Attacks ";
                    break;

                case 1:
                    testdamage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Advances ";
                    break;

                case 2:
                    testdamage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Overpowers ";

                    break;


                case 3:
                    testdamage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Punctures ";
                    break;

                case 4:
                    testdamage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Races ";
                    break;

                case 5:
                    testdamage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Exhausts ";
                    break;

                case 6:
                    testdamage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Collides ";
                    break;

                case 7:
                    testdamage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Obstructs ";
                    break;

                case 8:
                    testdamage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Beams Block ";
                    break;


            }


            double testdamageP = 0;

            switch (playermonster.Moveslotdefense) {


                case 0:
                    testdamageP = ((playermonster.Attack / attackermonster.Defense) * 61);

                    break;

                case 1:
                    testdamageP = ((playermonster.Attack / attackermonster.Speed) * 61);

                    break;

                case 2:
                    testdamageP = ((playermonster.Attack / attackermonster.Attack) * 61);


                    break;


                case 3:
                    testdamageP = ((playermonster.Speed / attackermonster.Defense) * 61);

                    break;

                case 4:
                    testdamageP = ((playermonster.Speed / attackermonster.Speed) * 61);

                    break;

                case 5:
                    testdamageP = ((playermonster.Speed / attackermonster.Attack) * 61);

                    break;

                case 6:
                    testdamageP = ((playermonster.Defense / attackermonster.Defense) * 61);

                    break;

                case 7:
                    testdamageP = ((playermonster.Defense / attackermonster.Speed) * 61);

                    break;

                case 8:
                    testdamageP = ((playermonster.Defense / attackermonster.Attack) * 61);

                    break;


            }
            double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
            double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;
            double testhealnzx = (testhealnz*2);
            int checktosapspeed = 0;

            if (attackermonster.Speed < playermonster.Speed && ((attackermonster.Speed * FrrtTwo) > (playermonster.Speed / FrrtTwo))) {

                checktosapspeed = 1;
            }

            double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

            double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

            double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

            double lowtestdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);


            double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
            double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
            double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
            double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
            double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
            double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
            double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
            double dispelcheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
            double refutecheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
            double depresscheck = (((new Random().nextInt(3) + 25)) * ((attackermonster.Speed + attackermonster.Attack + attackermonster.Defense) / (playermonster.Speed + playermonster.Attack + playermonster.Defense)));

            int suicidechecktrip = (int) (1.4 * AttackerReflectReturn((int) tripcheck));
            int suicidecheckchip = (int) (1.4 * AttackerReflectReturn((int) dispdam));
            int suicidecheckdip = (int) (1.4 * AttackerReflectReturn((int) chipdamage));
            int suicidecheckdisp = (int) (1.4 * AttackerReflectReturn((int) dispelcheck));

            if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedhealwoundtimerA != 0 || elongatedwoundtimerA != 0 || elongatedglugtimerP != 0 || elongatedglugpowerP != 0 || healblocktgimerP != 0 || statblocktimerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotattack == 9) {
                Teller = SpecialAttack;
            }


            if (attackermonster.Moveslotheal != 5 && attackermonster.Moveslotheal != 4) {
                if (absolutelyconfusingvariable == 2 && ratiohealth < 37 || ((attackermonster.Health < testdamage && (attackermonster.Health + testheal) > testdamage) && (attackermonster.Moveslotheal != 1 && attackermonster.Moveslotheal != 3 && attackermonster.Moveslotheal != 5))) {
                    if (healblocktgimerA == 0 && elongatedhealwoundpowerA == 0 && delayedhealtimerA == 0) {
                        if ((attackermonster.Speed > playermonster.Attack && attackermonster.Speed > attackermonster.Defense) && attackermonster.Moveslotheal != 3) {
                            if (attackermonster.Moveslotheal == 4) {
                                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                    Teller = HealButton;
                                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                                    if (attackermonster.Moveslotheal == 1) {
                                        if (delayedhealtimerA == 0) {
                                            Teller = HealButton;
                                        } else {
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                switch (new Random().nextInt(6)) {
                                                    case 0:
                                                        Teller = Turn;
                                                        break;
                                                    case 1:
                                                        Teller = Status;
                                                        break;
                                                    case 2:
                                                        Teller = Status;
                                                        break;
                                                    case 3:
                                                        Teller = Status;
                                                        break;
                                                    case 4:
                                                        Teller = Turn;
                                                        break;
                                                    case 5:
                                                        Teller = Turn;
                                                        break;

                                                }
                                            }
                                        }
                                    }
                                } else {
                                    switch (new Random().nextInt(3)) {

                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = HealButton;
                                            } else {
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = Turn;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                            }
                                            break;

                                    }
                                }
                            } else {
                                Teller = HealButton;
                            }
                        }
                        if (attackermonster.Moveslotheal == 3) {
                            double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                            if (what > 1.0) {
                                Teller = HealButton;
                            }
                        }

                        // should probably make something that keeps the monster from using heal over time over and over

                        if (elongatedhealtimerA != 0 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                            switch (new Random().nextInt(3)) {

                                case 0:
                                    Teller = Turn;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    if (attackermonster.Health < MaxHealthAttacker) {
                                        Teller = HealButton;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;

                            }
                        }


                        if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                            Teller = HealButton;
                        }


                    }

                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                    if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealtimerA == 0) {
                            Teller = HealButton;
                        } else {
                            switch (new Random().nextInt(3)) {

                                case 0:
                                    switch (new Random().nextInt(3)) {

                                        case 0:
                                            Teller = Turn;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = Turn;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;
                                case 2:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = Turn;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;

                            }
                        }
                    }
                } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (cleansefinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testdamageP + delayedblastpowerP)) && (attackermonster.Health < (testdamageP + delayedblastpowerP)))) {
                    double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (glugfinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    if (testheal > testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    if (posturetest >= testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                    if (attackermonster.Health < MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                }else if (attackermonster.Moveslotheal == 10 && (delayedhealtimerAsnow == 0) && (((attackermonster.Health + (testhealnzx)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                    if (attackermonster.Health < MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 3) {
                    double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                    if (what > 1.8) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                } else if (elongatedhealtimerA < 2 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                    Teller = HealButton;
                } else if (elongatedhealtimerA < 3 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                    if (longhealtester > MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                    if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealtimerA == 0) {
                            Teller = HealButton;
                        } else {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = Turn;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            }
                        }
                    }
                }
            } else {
                Teller = Turn;
                if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    Teller = HealButton;
                }
                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                }
                //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                //      Teller = HealButton;
                //  }
            }

            if (attackermonster.Moveslotheal == 7 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.05) > ((playermonster.Speed))))) {
                if (momentumcheck > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((momentumcheck / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            } // This block makes the monster cast momentum if they can get a free move

            if (attackermonster.Moveslotheal == 6 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.0167) > ((playermonster.Speed))))) {
                if (testhealnz > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((testhealnz / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            }// This block makes the monster cast snowball if they can get a free move
            if (attackermonster.Moveslotheal == 10 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * (1.0167*1.0167)) > ((playermonster.Speed))))) {
                if (testhealnzx > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((testhealnzx / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            } // This block makes the monster cast big snowball if they can get a free move
            if (attackermonster.Moveslotheal == 10 && ((playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 4 ) || healblocktgimerP > 1) ){
                if (Teller == HealButton){
                    int snowchecker = new Random().nextInt(10);
                    switch (snowchecker){
                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = Turn;
                            break;
                        case 4:
                            Teller = SpecialAttack;
                            break;
                        case 5:
                            Teller = SpecialAttack;
                            break;
                        case 6:
                            Teller = Status;
                            break;
                        case 7:
                            Teller = Status;
                            break;
                        case 8:
                            Teller = HealButton;
                            break;
                        case 9:
                            Teller = HealButton;
                            break;
                    }
                }
            }
            if (Teller == Status) {
                if (ratiohealth < 50) {
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            if (ratiohealth >= 45 && ratiohealth <= 80) {
                                if (attackermonster.Moveslotheal == 1) {
                                    if (delayedhealtimerA == 0) {
                                        if ((testheal * 1.5) > (testdamageP * 1.1475)) {
                                            Teller = HealButton;
                                        }
                                    } /* else {
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = Turn;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = Turn;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = Turn;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                    }
                                } */
                                }
                            } else {
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = Turn;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {
                                    Teller = Turn;
                                }
                            }
                            break;

                    }
                }
            }

            if (delayedblasttimerA != 0) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }

            }
            if ((elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP + delayedblastpowerP) >= attackermonster.Health) {
                checktosapspeed = 0;
            }

            if (checktosapspeed == 1 && attackermonster.Moveslotspeed == 14) {
                Teller = Status;
            }
            if (attackermonster.Moveslotheal == 1) {
                if (Teller == HealButton) {
                    if (delayedhealtimerA != 0) {
                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = Turn;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {

                            switch (new Random().nextInt(3)) {
                                case 0:
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = Turn;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {

                                                switch (new Random().nextInt(3)) {
                                                    case 0:
                                                        Teller = Turn;
                                                        break;
                                                    case 1:
                                                        Teller = Turn;
                                                        break;
                                                    case 2:
                                                        Teller = Turn;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                        }
                    }

                }
            }
            if (attackermonster.Moveslotheal == 10) {
                if (Teller == HealButton) {
                    if (delayedhealtimerAsnow != 0) {
                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = SpecialAttack;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {

                            switch (new Random().nextInt(3)) {
                                case 0:
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {

                                                switch (new Random().nextInt(3)) {
                                                    case 0:
                                                        Teller = SpecialAttack;
                                                        break;
                                                    case 1:
                                                        Teller = Turn;
                                                        break;
                                                    case 2:
                                                        Teller = Turn;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = Turn;
                                            } else {
                                                Teller = SpecialAttack;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                        }
                    }

                }
            }
            if (attackermonster.Moveslotheal == 2 && elongatedhealtimerA == 0 && (ratiohealth > 49 && ratiohealth < 99)) {
                Teller = HealButton;
            }

            if ((elongatedhealwoundpowerA == 0 && elongatedwoundpowerA == 0 && elongatedglugtimerP == 0) && attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                Teller = Turn;
            }

            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 3 && elongatedglugtimerA == 0 && attackermonster.Speed >= playermonster.Defense) {
                Teller = Turn;
            }

            if (PlayerStatDelayTimer != -1) {
                if (attackermonster.Moveslotattack == 8 && statblocktimerP <= 2) {
                    Teller = SpecialAttack;
                }
            }
            if (reflectbonushits > 0.85) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                }
            }
            if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                    if (elongatedhealtimerA <= 2) {
                        Teller = HealButton;
                    } else if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                } else {
                    if (reflectTimerOnAttacker <= 2) {
                        Teller = SpecialAttack;
                    } else if (elongatedhealtimerA == 0) {
                        Teller = HealButton;
                    }
                }
            }
            if (Teller != Turn) {
                if (playermonster.Health <= testdamage) {
                    Teller = Turn;
                }
            }
            if (Teller == HealButton && (attackermonster.Moveslotheal == 2 || attackermonster.Moveslotheal == 1) && (playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 12)) {

                switch (new Random().nextInt(7)) {
                    case 0:
                        Teller = Turn;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        Teller = Turn;
                        break;
                    case 3:
                        Teller = HealButton;
                        break;
                    case 4:
                        Teller = SpecialAttack;
                        break;
                    case 5:
                        Teller = SpecialAttack;
                        break;
                    case 6:
                        Teller = Turn;
                        break;
                }


            }
            if (playermonster.Moveslotattack == 9 && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 3 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 4 || attackermonster.Moveslotattack == 8)) {
                if (Teller == SpecialAttack) {
                    int busted = new Random().nextInt(101);
                    if (busted < 75) {
                        Teller = Turn;
                    }
                }
                // BUSTED
            }


            if (attackermonster.Speed < playermonster.Speed && (attackermonster.Moveslotspeed == 0 || attackermonster.Moveslotspeed == 1 || attackermonster.Moveslotspeed == 3 || attackermonster.Moveslotspeed == 4 || attackermonster.Moveslotspeed == 7 || attackermonster.Moveslotspeed == 8 || attackermonster.Moveslotspeed == 9 || attackermonster.Moveslotspeed == 11)) {
                switch (attackermonster.Moveslotspeed) {

                    case 0:
                        if ((attackermonster.Speed * FrrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                    case 1:
                        if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 2:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 3:
                        if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 4:
                        if ((attackermonster.Speed * SqrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 5:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 6:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 7:
                        if (((attackermonster.Speed * CbrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 8:
                        if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 9:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 10:
                        if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 11:
                        if (((attackermonster.Speed * 2) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 153)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 12:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 13:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = Turn;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                }
            }

            if (attackermonster.Moveslotattack == 3 && elongatedglugtimerA > 2 && Teller == SpecialAttack) {
                Teller = Turn;
                if (ratiohealth > 89 && turncounter > 3) {
                    Teller = Status;
                }
            }
            if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                if (
                        delayedhealtimerP != 0 ||
                        delayedhealtimerPsnow != 0 ||
                                delayedblasttimerP != 0 ||
                                delayedblastpowerP != 0 ||
                                delayedhealpowerP != 0 ||
                                PlayerStatDelayTimer != -1 ||
                                // PlayerDelayedStatMove != -1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                grouphealtimerP != 0 ||
                                grouphealpowerP != 0 ||
                                elongatedhealtimerP != 0 ||
                                elongatedhealpowerP != 0 ||
                                PlayerProtectStatsTimer != 0 || reflectTimerOnPlayer != 0) {
                    Teller = SpecialAttack;
                }

                if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                    //  Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn;  //  need to adjust the damage for the moves ABCDEFG
                    }
                }
            }
            if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                if (
                        delayedhealtimerPsnow == 0 &&
                        delayedhealtimerP == 0 &&
                                delayedblasttimerP == 0 &&
                                delayedblastpowerP == 0 &&
                                delayedhealpowerP == 0 &&
                                delayedhealpowerPsnow == 0 &&
                                PlayerStatDelayTimer == -1 &&
                                // PlayerDelayedStatMove == -1&&-1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                grouphealtimerP == 0 &&
                                grouphealpowerP == 0 &&
                                elongatedhealtimerP == 0 &&
                                elongatedhealpowerP == 0 &&
                                PlayerProtectStatsTimer == 0 && reflectTimerOnPlayer == 0) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }

                if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                    //  Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn;  //  need to adjust the damage for the moves ABCDEFG
                    }
                }
            }

            if (effectivehits > 3) {
                if (attackermonster.Moveslotattack == 1) {
                    if (Teller == Turn) {
                        if (delayedblasttimerA == 0) {
                            if (testdamage < (delayedblastcheck))
                                Teller = SpecialAttack;
                        }
                    }
                }
            }
            if (attackermonster.Moveslotattack == 1) {
                if (Teller == SpecialAttack) {
                    if (delayedblasttimerA != 0) {
                        Teller = Turn;
                    }
                }
            }
            if (attackermonster.Moveslotattack == 1 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                if (Teller == SpecialAttack) {
                    if (new Random().nextInt(14) != 0) {
                        Teller = Turn;
                    }
                }
            }
//ASDF
            if (attackermonster.Moveslotattack == 6) {
                if ((Math.ceil(playermonster.Speed * .85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                    if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)) {
                        Teller = SpecialAttack;
                    }
                }
            }
            if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                Teller = HealButton;
            }
            if (attackermonster.Moveslotattack == 9 && healblocktgimerP == 0 &&
                    elongatedhealwoundtimerA == 0 &&
                    elongatedwoundtimerA == 0 &&
                    elongatedglugtimerP == 0 &&
                    statblocktimerA == 0) {
                if (Teller == SpecialAttack) {
                    if ((new Random().nextInt(101)) <= 90) {
                        Teller = Turn;
                    }
                }
            }

            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && delayedhealtimerPsnow >= 1) {
                Teller = SpecialAttack;
            }


            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                Teller = Turn;
            }


            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerPsnow) {
                Teller = SpecialAttack;
            }
            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerP) {
                Teller = SpecialAttack;
            }

            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 2 && elongatedhealwoundtimerP >= 1) {
                Teller = Turn;
            }

            if (Teller == HealButton && (attackermonster.Moveslotheal == 0 || attackermonster.Moveslotheal > 5) && attackermonster.Health == MaxHealthAttacker) {
                Teller = Turn;
            }

            if (Teller == Turn && chipdamage > testdamage && attackermonster.Moveslotattack == 5) {
                Teller = Turn;
            }

            if (Teller == Turn && tripcheck > testdamage && attackermonster.Moveslotattack == 6) {
                Teller = Turn;
            }

            if (Teller == Turn && dispdam > testdamage && attackermonster.Moveslotattack == 7) {
                Teller = SpecialAttack;
            }

            if (Teller == Turn && depresscheck > testdamage && attackermonster.Moveslotattack == 11) {
                Teller = SpecialAttack;
            }

            if (Teller == Turn && dispelcheck >= testdamage && attackermonster.Moveslotattack == 13) {
                Teller = SpecialAttack;
            }
            if (Teller == Turn && refutecheck >= testdamage && attackermonster.Moveslotattack == 9) {
                Teller = SpecialAttack;
            }

            if (Teller == SpecialAttack && dispelcheck < testdamage && attackermonster.Moveslotattack == 13) {
                Teller = Turn;
            }
            if (Teller == SpecialAttack && refutecheck < testdamage && attackermonster.Moveslotattack == 9) {
                Teller = Turn;
            }
            if (playermonster.Defense >= attackermonster.Defense && attackermonster.Moveslotspeed == 15) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 6 || attackermonster.Moveslotdefense == 7 || attackermonster.Moveslotdefense == 8) {
                        Teller = Status;
                    }
                }
            }


            if (playermonster.Speed >= attackermonster.Speed && attackermonster.Moveslotspeed == 14) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 3 || attackermonster.Moveslotdefense == 4 || attackermonster.Moveslotdefense == 5) {
                        Teller = Status;
                    }
                }
            }


            if (playermonster.Attack >= attackermonster.Attack && attackermonster.Moveslotspeed == 16) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 0 || attackermonster.Moveslotdefense == 1 || attackermonster.Moveslotdefense == 2) {
                        Teller = Status;
                    }
                }
            }

            if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed * .85) < playermonster.Speed) && playermonster.Moveslotattack == 6)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                Teller = SpecialAttack;
            }

            if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed / FrrtTwo) < (playermonster.Speed * FrrtTwo)) && playermonster.Moveslotattack == 14)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                Teller = SpecialAttack;
            }
            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer >= 15) {
                Teller = Turn;
            }
            if (PlayerProtectStatsTimer > 0 && (attackermonster.Moveslotattack == 5 || attackermonster.Moveslotattack == 6 || attackermonster.Moveslotattack == 7 || attackermonster.Moveslotattack == 11 || attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13 || attackermonster.Moveslotattack == 14)) {
                if (Teller == SpecialAttack) {
                    if (tripcheck < testdamage && dispdam < testdamage && chipdamage < testdamage) {
                        Teller = Turn;
                    }
                }
            }
            if (Teller == HealButton && healblocktgimerP > 0 && attackermonster.Moveslotheal != 4) {
                Teller = Turn;
            }
            if (attackermonster.Moveslotattack == 0 && (woundtester * 3) > Go) {
                if (elongatedwoundtimerP <= 2) {
                    Teller = Turn;
                }
            }

            if (attackermonster.Moveslotattack == 0 && Teller == SpecialAttack) {
                if (elongatedwoundtimerP > 2) {
                    Teller = Turn;
                }
            }
            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 8 && statblocktimerP >= 2) {
                Teller = Turn;
            }

            if (Teller == Status) {
                if (statblocktimerA != 0) {
                    Teller = Turn;
                }
            }

            if (Teller == Status && playermonster.Moveslotattack == 8 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                switch (new Random().nextInt(3)) {
                    case 0:
                        Teller = Turn;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        Teller = Turn;
                        break;
                }
            }

            if (attackermonster.Moveslotattack > 98) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotheal > 98) {
                if (Teller == HealButton) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotspeed > 98) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }
            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = Turn;
            }


            if ((attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = Status;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = HealButton;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98)) {
                Teller = SpecialAttack;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = TellButton;
            }
            if (AttackerStatDelayTimer != -1) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }

            if (attackermonster.Moveslotattack == 15) {
                if (Teller == SpecialAttack) {
                    if (reflectTimerOnAttacker >= 8) {
                        Teller = HealButton;
                        if (MaxHealthAttacker == attackermonster.Health || (healblocktgimerP > 0)) {
                            Teller = Status;
                            if (statblocktimerA > 0) {
                                Teller = Turn;
                                if (suicidecheckbasic > attackermonster.Health) {
                                    Teller = SpecialAttack;
                                }
                            }
                        }
                    }
                }
            }
            if (suicidecheckbasic > attackermonster.Health) {
                if (Teller == Turn) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
            }

            if (Teller == SpecialAttack && suicidecheckchip > attackermonster.Health && attackermonster.Moveslotattack == 5) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }

            if (Teller == SpecialAttack && suicidechecktrip > attackermonster.Health && attackermonster.Moveslotattack == 6) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }

            if (Teller == SpecialAttack && suicidecheckdip > attackermonster.Health && attackermonster.Moveslotattack == 7) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
            if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 9) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
            if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 13) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
        } else {


            if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                Teller = SpecialAttack;
            }

            double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


            double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

            double Go = ((attackermonster.Attack / playermonster.Defense) * 50);


            switch (attackermonster.Moveslotdefense) {

                case 0:
                    Go = ((attackermonster.Attack / playermonster.Defense) * 50);

                    break;

                case 1:
                    Go = ((attackermonster.Attack / playermonster.Speed) * 50);

                    break;

                case 2:
                    Go = ((attackermonster.Attack / playermonster.Attack) * 50);


                    break;


                case 3:
                    Go = ((attackermonster.Speed / playermonster.Defense) * 50);

                    break;

                case 4:
                    Go = ((attackermonster.Speed / playermonster.Speed) * 50);

                    break;

                case 5:
                    Go = ((attackermonster.Speed / playermonster.Attack) * 50);

                    break;

                case 6:
                    Go = ((attackermonster.Defense / playermonster.Defense) * 50);

                    break;

                case 7:
                    Go = ((attackermonster.Defense / playermonster.Speed) * 50);

                    break;

                case 8:
                    Go = ((attackermonster.Defense / playermonster.Attack) * 50);

                    break;


            }

            int suicidecheckbasic = (int) (1.4 * AttackerReflectReturn((int) Go));
       /* if (( elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2) || ( elongatedhealwoundtimerP <= 1 && (thisdoctork*2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2) || (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed*1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3  && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage*3) > (MaxHealthPlayer*2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage)))){
            if ((thisdoctork*5) >= Go) {
                Teller = SpecialAttack;
            }
        } */

            if ((elongatedhealwoundtimerP <= 1 && thisdoctork >= Go && attackermonster.Moveslotattack == 2)) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = SpecialAttack;
                }
            } else if ((elongatedhealwoundtimerP <= 1 && (thisdoctork * 2) >= Go && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2)) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = SpecialAttack;
                }
            } else if (elongatedhealwoundtimerP <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 2 && (((playermonster.Speed * 1.25) > playermonster.Defense && playermonster.Moveslotheal != 3 && playermonster.Moveslotheal < 6) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed) || (playermonster.Moveslotheal == 6 && (stataverage * 3) > (MaxHealthPlayer * 2.625) || (playermonster.Moveslotheal == 7 && playermonster.Speed > (stataverage)) || (playermonster.Moveslotheal == 8 && playermonster.Attack > stataverage) || (playermonster.Moveslotheal == 9 && playermonster.Defense > stataverage))) {
                if ((thisdoctork * 5) >= Go) {
                    Teller = SpecialAttack;
                }
            }

            double effectivehits = 0;
            double effectivehitsreflect = 0;

            switch (playermonster.Moveslotdefense) {
                case 0:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 1:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 2:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
                case 3:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 4:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 5:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
                case 6:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));
                    break;
                case 7:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Speed / 60));
                    break;
                case 8:
                    effectivehits = ((attackermonster.Health / 60) * (attackermonster.Attack / 60));
                    break;
            }


            double newHoldthisformemonsterdefense = attackermonster.Defense;
            double newHoldthisformemonsterattack = attackermonster.Attack;
            double newHoldthisformemonsterspeed = attackermonster.Speed;
            double newHoldthisformeplayerdefense = playermonster.Defense;
            double newHoldthisformeplayerattack = playermonster.Attack;
            double newHoldthisformeplayerspeed = playermonster.Speed;


            double reflectRatioAttackerTest = (double) (attackermonster.Defense / attackermonster.Speed);


            reflectRatioAttackerTest = (double) (0.449 * ((25 * reflectRatioAttackerTest) - (reflectRatioAttackerTest * reflectRatioAttackerTest))) + 17;
            if (reflectRatioAttacker != 0) {
                effectivehits = effectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), effectivehits);
            }
            double neweffectivehits = 0;
            double neweffectivehitsreflect = 0;
            neweffectivehitsreflect = (double) (effectivehits * (1 + (reflectRatioAttackerTest / 100)));
            double reflectbonushits = neweffectivehitsreflect - effectivehits;


            switch (attackermonster.Moveslotspeed) {
                case 0:
                    newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                    break;
                case 1:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 2:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    break;
                case 3:
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 4:
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 5:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    break;
                case 6:
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    break;
                case 7:
                    newHoldthisformemonsterdefense = attackermonster.Defense * CbrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * CbrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * CbrtTwo;
                    break;
                case 8:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 9:
                    newHoldthisformemonsterdefense = attackermonster.Defense * SqrtTwo;
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    break;
                case 10:
                    newHoldthisformemonsterattack = attackermonster.Attack * SqrtTwo;
                    newHoldthisformemonsterspeed = attackermonster.Speed * SqrtTwo;
                    break;
                case 11:
                    newHoldthisformemonsterspeed = attackermonster.Speed * 2;
                    break;
                case 12:
                    newHoldthisformemonsterdefense = attackermonster.Defense * 2;
                    break;
                case 13:
                    newHoldthisformemonsterattack = attackermonster.Attack * 2;
                    break;
                case 14:
                    newHoldthisformemonsterspeed = attackermonster.Speed * FrrtTwo;
                    newHoldthisformeplayerspeed = playermonster.Speed / FrrtTwo;
                    break;
                case 15:
                    newHoldthisformemonsterdefense = attackermonster.Defense * FrrtTwo;
                    newHoldthisformeplayerdefense = playermonster.Defense / FrrtTwo;
                    break;
                case 16:
                    newHoldthisformemonsterattack = attackermonster.Attack * FrrtTwo;
                    newHoldthisformeplayerattack = playermonster.Attack / FrrtTwo;
                    break;
            }


            double playereffectivehits = 0;
            double newplayereffectivehits = 0;

            switch (attackermonster.Moveslotdefense) {
                case 0:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 1:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 2:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
                case 3:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 4:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 5:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
                case 6:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Defense / 60));
                    break;
                case 7:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Speed / 60));
                    break;
                case 8:
                    playereffectivehits = ((playermonster.Health / 60) * (playermonster.Attack / 60));
                    break;
            }
            switch (attackermonster.Moveslotdefense) {
                case 0:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 1:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 2:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
                case 3:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 4:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 5:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
                case 6:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerdefense / 60));
                    break;
                case 7:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerspeed / 60));
                    break;
                case 8:
                    newplayereffectivehits = ((playermonster.Health / 60) * (newHoldthisformeplayerattack / 60));
                    break;
            }

            if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && ((playereffectivehits - newplayereffectivehits) >= 1)) {
                Teller = Status;
            }
            if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((playereffectivehits - newplayereffectivehits) >= 1) && effectivehits > 7.0) {
                Teller = Status;
            }


            switch (playermonster.Moveslotdefense) {
                case 0:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 1:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 2:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
                case 3:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 4:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 5:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
                case 6:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterdefense / 60));
                    break;
                case 7:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterspeed / 60));
                    break;
                case 8:
                    neweffectivehits = ((attackermonster.Health / 60) * (newHoldthisformemonsterattack / 60));
                    break;
            }

            if (reflectRatioAttacker != 0) {
                neweffectivehits = neweffectivehits * Math.pow((1 + ((reflectRatioAttacker / 100))), neweffectivehits);
            }


            if ((attackermonster.Moveslotspeed < 7 || attackermonster.Moveslotspeed > 13) && (neweffectivehits - effectivehits) >= 1) {
                Teller = Status;
            }

            if ((attackermonster.Moveslotspeed > 7 && attackermonster.Moveslotspeed <= 13) && ((neweffectivehits - effectivehits) >= 1) && effectivehits > 7.0) {
                Teller = Status;
            }

            double totalhitdiff = ((playereffectivehits - newplayereffectivehits)) + (neweffectivehits - effectivehits);

            if (totalhitdiff >= 1 && attackermonster.Moveslotspeed > 13) {
                Teller = Status;
            }
            if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13))) {
                if (Teller != Status) {
                    if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = SpecialAttack;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {
                            switch (new Random().nextInt(17)) {

                                case 0:
                                    Teller = Status;
                                    break;
                                case 1:
                                    Teller = Status;
                                    break;
                                case 2:
                                    Teller = Status;
                                    break;
                                case 3:
                                    Teller = Status;
                                    break;
                                case 4:
                                    Teller = Turn;
                                    break;
                                case 5:
                                    Teller = Status;
                                    break;
                                case 6:
                                    Teller = SpecialAttack;
                                    break;
                                case 7:
                                    Teller = Status;
                                    break;
                                case 8:
                                    Teller = Status;
                                    break;
                                case 9:
                                    Teller = Status;
                                    break;
                                case 10:
                                    Teller = Status;
                                    break;
                                case 11:
                                    Teller = Status;
                                    break;
                                case 12:
                                    Teller = Status;
                                    break;
                                case 13:
                                    Teller = Status;
                                    break;
                                case 14:
                                    Teller = Status;
                                    break;
                                case 15:
                                    Teller = Status;
                                    break;
                                case 16:
                                    Teller = Turn;
                                    break;
                            }

                        }
                    }
                }
                if (Teller == Status && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                    switch (new Random().nextInt(17)) {

                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = SpecialAttack;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = Status;
                            break;
                        case 4:
                            Teller = Turn;
                            break;
                        case 5:
                            Teller = Turn;
                            break;
                        case 6:
                            Teller = Turn;
                            break;
                        case 7:
                            Teller = Turn;
                            break;
                        case 8:
                            Teller = Status;
                            break;
                        case 9:
                            Teller = SpecialAttack;
                            break;
                        case 10:
                            Teller = Turn;
                            break;
                        case 11:
                            Teller = Turn;
                            break;
                        case 12:
                            Teller = Turn;
                            break;
                        case 13:
                            Teller = Turn;
                            break;
                        case 14:
                            Teller = Turn;
                            break;
                        case 15:
                            Teller = SpecialAttack;
                            break;
                        case 16:
                            Teller = Turn;
                            break;
                    }

                }
            }

            if (Teller == Status) {
                if (!(attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        Teller = SpecialAttack;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = Turn;
                            } else {
                                Teller = SpecialAttack;
                            }
                            break;

                    }
                }
                if (AttackerStatDelayTimer != -1) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            } else {

                                switch (new Random().nextInt(3)) {
                                    case 0:
                                        Teller = SpecialAttack;
                                        break;
                                    case 1:
                                        Teller = Turn;
                                        break;
                                    case 2:
                                        Teller = Turn;
                                        break;
                                }
                            }
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            if (attackermonster.Health < MaxHealthAttacker) {
                                Teller = Turn;
                            } else {
                                Teller = SpecialAttack;
                            }
                            break;

                    }
                }

            }

            double ratiohealth = (100 * attackermonster.Health / MaxHealthAttacker);

            double testdamage = ((attackermonster.Attack / playermonster.Defense) * 50);


            String Catchsopmekindofattack = " Attacks ";

            switch (attackermonster.Moveslotdefense) {

                case 0:
                    testdamage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                    Catchsopmekindofattack = " Attacks ";
                    break;

                case 1:
                    testdamage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Advances ";
                    break;

                case 2:
                    testdamage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Overpowers ";

                    break;


                case 3:
                    testdamage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Punctures ";
                    break;

                case 4:
                    testdamage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Races ";
                    break;

                case 5:
                    testdamage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Exhausts ";
                    break;

                case 6:
                    testdamage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Collides ";
                    break;

                case 7:
                    testdamage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Obstructs ";
                    break;

                case 8:
                    testdamage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Beams Block ";
                    break;
            }

            double testdamageP = 0;

            switch (playermonster.Moveslotdefense) {


                case 0:
                    testdamageP = ((playermonster.Attack / attackermonster.Defense) * 61);

                    break;

                case 1:
                    testdamageP = ((playermonster.Attack / attackermonster.Speed) * 61);

                    break;

                case 2:
                    testdamageP = ((playermonster.Attack / attackermonster.Attack) * 61);


                    break;


                case 3:
                    testdamageP = ((playermonster.Speed / attackermonster.Defense) * 61);

                    break;

                case 4:
                    testdamageP = ((playermonster.Speed / attackermonster.Speed) * 61);

                    break;

                case 5:
                    testdamageP = ((playermonster.Speed / attackermonster.Attack) * 61);

                    break;

                case 6:
                    testdamageP = ((playermonster.Defense / attackermonster.Defense) * 61);

                    break;

                case 7:
                    testdamageP = ((playermonster.Defense / attackermonster.Speed) * 61);

                    break;

                case 8:
                    testdamageP = ((playermonster.Defense / attackermonster.Attack) * 61);

                    break;


            }
            double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
            double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;
            double testhealnzx = (testhealnz*2);
            int checktosapspeed = 0;

            if (attackermonster.Speed < playermonster.Speed && ((attackermonster.Speed * FrrtTwo) > (playermonster.Speed / FrrtTwo))) {

                checktosapspeed = 1;
            }

            double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

            double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

            double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

            double lowtestdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);


            double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
            double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
            double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
            double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
            double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
            double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
            double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
            double dispelcheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
            double refutecheck = (((new Random().nextInt(11) + 25)) * (playermonster.Attack / attackermonster.Defense));
            double depresscheck = (((new Random().nextInt(3) + 25)) * ((attackermonster.Speed + attackermonster.Attack + attackermonster.Defense) / (playermonster.Speed + playermonster.Attack + playermonster.Defense)));
            double delayedblastcheck = (int) (((new Random().nextInt(5) + 65)) * (attackermonster.Attack / playermonster.Speed));

            int suicidechecktrip = (int) (1.4 * AttackerReflectReturn((int) tripcheck));
            int suicidecheckchip = (int) (1.4 * AttackerReflectReturn((int) dispdam));
            int suicidecheckdip = (int) (1.4 * AttackerReflectReturn((int) chipdamage));
            int suicidecheckdisp = (int) (1.4 * AttackerReflectReturn((int) dispelcheck));

            double testdamageOverpower = ((attackermonster.Attack / playermonster.Attack) * 51);

            double testdamageBeam = ((attackermonster.Defense / playermonster.Attack) * 51);
            if (reflectbonushits > 0.85) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                }
            }
            if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                    if (elongatedhealtimerA <= 2) {
                        Teller = HealButton;
                    } else if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                } else {
                    if (reflectTimerOnAttacker <= 2) {
                        Teller = SpecialAttack;
                    } else if (elongatedhealtimerA == 0) {
                        Teller = HealButton;
                    }
                }
            }
            //Reflect
            if (Teller != Status) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker <= 2) {
                        if (attackermonster.Defense >= attackermonster.Speed) {
                            Teller = SpecialAttack;
                        }
                    } else if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
                if (attackermonster.Moveslotattack == 15 && reflectTimerOnAttacker > 2) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }
            }
            if (attackermonster.Moveslotattack == 15 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotattack == 15 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }
            }
            if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedhealwoundtimerA != 0 || elongatedwoundtimerA != 0 || elongatedglugtimerP != 0 || elongatedglugpowerP != 0 || healblocktgimerP != 0 || statblocktimerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotattack == 9) {
                Teller = SpecialAttack;
            }

            if (attackermonster.Moveslotheal != 5 && attackermonster.Moveslotheal != 4) {
                if (absolutelyconfusingvariable == 2 && ratiohealth < 37 || ((attackermonster.Health < testdamage && (attackermonster.Health + testheal) > testdamage) && (attackermonster.Moveslotheal != 1 && attackermonster.Moveslotheal != 3 && attackermonster.Moveslotheal != 5))) {
                    if (healblocktgimerA == 0 && elongatedhealwoundpowerA == 0 && delayedhealtimerA == 0) {
                        if ((attackermonster.Speed > playermonster.Attack && attackermonster.Speed > attackermonster.Defense) && attackermonster.Moveslotheal != 3) {
                            if (attackermonster.Moveslotheal == 4) {
                                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                                    Teller = HealButton;
                                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                                    if (attackermonster.Moveslotheal == 1) {
                                        if (delayedhealtimerA == 0) {
                                            Teller = HealButton;
                                        } else {
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                switch (new Random().nextInt(6)) {
                                                    case 0:
                                                        Teller = SpecialAttack;
                                                        break;
                                                    case 1:
                                                        Teller = Status;
                                                        break;
                                                    case 2:
                                                        Teller = Status;
                                                        break;
                                                    case 3:
                                                        Teller = Status;
                                                        break;
                                                    case 4:
                                                        Teller = Turn;
                                                        break;
                                                    case 5:
                                                        Teller = Turn;
                                                        break;

                                                }
                                            }
                                        }
                                    }
                                } else {
                                    switch (new Random().nextInt(3)) {

                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = HealButton;
                                            } else {
                                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                    Teller = SpecialAttack;
                                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                    Teller = SpecialAttack;
                                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                    Teller = Turn;
                                                } else {
                                                    Teller = Turn;
                                                }
                                            }
                                            break;

                                    }
                                }
                            } else {
                                Teller = HealButton;
                            }
                        }
                        if (attackermonster.Moveslotheal == 3) {
                            double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                            if (what > 1.0) {
                                Teller = HealButton;
                            }
                        }

                        // should probably make something that keeps the monster from using heal over time over and over

                        if (elongatedhealtimerA != 0 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                            switch (new Random().nextInt(3)) {

                                case 0:
                                    Teller = SpecialAttack;
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    if (attackermonster.Health < MaxHealthAttacker) {
                                        Teller = HealButton;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;

                            }
                        }


                        if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                            Teller = HealButton;
                        }


                    }

                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                    if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealtimerA == 0) {
                            Teller = HealButton;
                        } else {
                            switch (new Random().nextInt(3)) {

                                case 0:
                                    switch (new Random().nextInt(3)) {

                                        case 0:
                                            Teller = SpecialAttack;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {
                                                Teller = Turn;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;
                                case 2:
                                    if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                        Teller = SpecialAttack;
                                    } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                        Teller = SpecialAttack;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;

                            }
                        }
                    }
                } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (cleansefinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testdamageP + delayedblastpowerP)) && (attackermonster.Health < (testdamageP + delayedblastpowerP)))) {
                    double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (glugfinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    if (testheal > testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    if (posturetest >= testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                    if (attackermonster.Health < MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                }else if (attackermonster.Moveslotheal == 10 && (delayedhealtimerAsnow == 0) && (((attackermonster.Health + (testhealnzx)) > ((testdamageP * 1.8) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.8) + delayedblastpowerP)))) {
                    if (attackermonster.Health < MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 3) {
                    double what = (attackermonster.Attack / playermonster.Defense) / (attackermonster.Defense / attackermonster.Speed);
                    if (what > 1.8) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                } else if (elongatedhealtimerA < 2 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                    Teller = HealButton;
                } else if (elongatedhealtimerA < 3 && attackermonster.Moveslotheal == 2) { // was != 2, should surely be == 2? because 2 = elongated heal A, And the timer should prevent repetition only in that scenario.
                    if (longhealtester > MaxHealthAttacker) {
                        Teller = HealButton;
                    }
                } else if (ratiohealth >= 45 && ratiohealth <= 80) {
                    if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealtimerA == 0) {
                            Teller = HealButton;
                        } else {
                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                Teller = SpecialAttack;
                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                Teller = SpecialAttack;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            }
                        }
                    }
                }
            } else {
                Teller = Turn;
                if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                    Teller = HealButton;
                }
                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                }
                //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > ((testdamageP * 1.1475) + delayedblastpowerP)) && (attackermonster.Health < ((testdamageP * 1.1475) + delayedblastpowerP)))) {
                //      Teller = HealButton;
                //  }
            }

            if (attackermonster.Moveslotheal == 7 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.05) > ((playermonster.Speed))))) {
                if (momentumcheck > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((momentumcheck / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            } // This block makes the monster cast momentum if they can get a free move

            if (attackermonster.Moveslotheal == 6 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * 1.0167) > ((playermonster.Speed))))) {
                if (testhealnz > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((testhealnz / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            }// This block makes the monster cast snowball if they can get a free move
            if (attackermonster.Moveslotheal == 10 && ((attackermonster.Speed < playermonster.Speed) && (Math.round(attackermonster.Speed * (1.0167*1.0167)) > ((playermonster.Speed))))) {
                if (testhealnzx > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA == 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
                if ((testhealnzx / 2) > (elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP) && elongatedhealwoundtimerA > 0) {
                    if ((healblocktgimerA * elongatedhealwoundpowerA) == 0) {
                        if (attackermonster.Health < MaxHealthAttacker) {
                            Teller = HealButton;
                        }
                    }
                }
            } // This block makes the monster cast big snowball if they can get a free move
            if (attackermonster.Moveslotheal == 10 && ((playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 4  ) || healblocktgimerP > 1) ){
                if (Teller == HealButton){
                    int snowchecker = new Random().nextInt(10);
                    switch (snowchecker){
                        case 0:
                            Teller = Turn;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            Teller = Turn;
                            break;
                        case 3:
                            Teller = Turn;
                            break;
                        case 4:
                            Teller = SpecialAttack;
                            break;
                        case 5:
                            Teller = SpecialAttack;
                            break;
                        case 6:
                            Teller = Status;
                            break;
                        case 7:
                            Teller = Status;
                            break;
                        case 8:
                            Teller = HealButton;
                            break;
                        case 9:
                            Teller = HealButton;
                            break;
                    }
                }
            }
            if (Teller == Status) {
                if (ratiohealth < 50) {
                    switch (new Random().nextInt(3)) {

                        case 0:
                            Teller = SpecialAttack;
                            break;
                        case 1:
                            Teller = Turn;
                            break;
                        case 2:
                            if (ratiohealth >= 45 && ratiohealth <= 80) {
                                if (attackermonster.Moveslotheal == 1) {
                                    if (delayedhealtimerA == 0) {
                                        if ((testheal * 1.5) > (testdamageP * 1.1475)) {
                                            Teller = HealButton;
                                        }
                                    } /* else {
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            Teller = SpecialAttack;
                                            break;
                                        case 1:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = SpecialAttack;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                        case 2:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6  && ((attackermonster.Speed < playermonster.Speed)  &&  (attackermonster.Speed > (Math.ceil(playermonster.Speed*.85))))){
                                                Teller = SpecialAttack;
                                            }else if (((playermonster.Health/((attackermonster.Attack/playermonster.Defense)*60)) <= (((attackermonster.Health/((playermonster.Attack/attackermonster.Defense)*60)))))){
                                                Teller = Turn;
                                            }else {
                                                Teller = Turn;
                                            }
                                            break;
                                    }
                                } */
                                }
                            } else {
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = SpecialAttack;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = SpecialAttack;
                                } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                    Teller = Turn;
                                } else {
                                    Teller = Turn;
                                }
                            }
                            break;

                    }
                }
            }

            if (delayedblasttimerA != 0) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }

            }
            if ((elongatedhealwoundpowerA + elongatedwoundpowerA + elongatedglugtimerP + delayedblastpowerP) >= attackermonster.Health) {
                checktosapspeed = 0;
            }

            if (checktosapspeed == 1 && attackermonster.Moveslotspeed == 14) {
                Teller = Status;
            }
            if (attackermonster.Moveslotheal == 1) {
                if (Teller == HealButton) {
                    if (delayedhealtimerA != 0) {
                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = SpecialAttack;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {

                            switch (new Random().nextInt(3)) {
                                case 0:
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {

                                                switch (new Random().nextInt(3)) {
                                                    case 0:
                                                        Teller = SpecialAttack;
                                                        break;
                                                    case 1:
                                                        Teller = Turn;
                                                        break;
                                                    case 2:
                                                        Teller = Turn;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = Turn;
                                            } else {
                                                Teller = SpecialAttack;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                        }
                    }

                }
            }
 if (attackermonster.Moveslotheal == 10) {
                if (Teller == HealButton) {
                    if (delayedhealtimerAsnow != 0) {
                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = SpecialAttack;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = SpecialAttack;
                        } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                            Teller = Turn;
                        } else {

                            switch (new Random().nextInt(3)) {
                                case 0:
                                    switch (new Random().nextInt(3)) {
                                        case 0:
                                            if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                                Teller = SpecialAttack;
                                            } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                                Teller = SpecialAttack;
                                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                                Teller = Turn;
                                            } else {

                                                switch (new Random().nextInt(3)) {
                                                    case 0:
                                                        Teller = SpecialAttack;
                                                        break;
                                                    case 1:
                                                        Teller = Turn;
                                                        break;
                                                    case 2:
                                                        Teller = Turn;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1:
                                            Teller = Turn;
                                            break;
                                        case 2:
                                            if (attackermonster.Health < MaxHealthAttacker) {
                                                Teller = Turn;
                                            } else {
                                                Teller = SpecialAttack;
                                            }
                                            break;

                                    }
                                    break;
                                case 1:
                                    Teller = Turn;
                                    break;
                                case 2:
                                    Teller = Turn;
                                    break;
                            }
                        }
                    }

                }
            }

            if (attackermonster.Moveslotheal == 2 && elongatedhealtimerA == 0 && (ratiohealth > 49 && ratiohealth < 99)) {
                Teller = HealButton;
            }

            if ((elongatedhealwoundpowerA == 0 && elongatedwoundpowerA == 0 && elongatedglugtimerP == 0) && attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                Teller = SpecialAttack;
            }

            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 3 && elongatedglugtimerA == 0 && attackermonster.Speed >= playermonster.Defense) {
                Teller = SpecialAttack;
            }

            if (PlayerStatDelayTimer != -1) {
                if (attackermonster.Moveslotattack == 8 && statblocktimerP <= 2) {
                    Teller = SpecialAttack;
                }
            }
            if (reflectbonushits > 0.85) {
                if (attackermonster.Moveslotattack == 15 && playermonster.Moveslotattack != 12 && playermonster.Moveslotattack != 13) {
                    if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                }
            }
            if (attackermonster.Moveslotheal == 2 && attackermonster.Moveslotattack == 15) {
                if (((longhealtester * 1.5) - (attackermonster.Health * (reflectRatioAttackerTest / 100))) > 0) {
                    if (elongatedhealtimerA <= 2) {
                        Teller = HealButton;
                    } else if (reflectTimerOnAttacker == 0) {
                        Teller = SpecialAttack;
                    }
                } else {
                    if (reflectTimerOnAttacker <= 2) {
                        Teller = SpecialAttack;
                    } else if (elongatedhealtimerA == 0) {
                        Teller = HealButton;
                    }
                }
            }
            if (Teller != Turn) {
                if (playermonster.Health <= testdamage) {
                    Teller = Turn;
                }
            }
            if (Teller == HealButton && (attackermonster.Moveslotheal == 2 || attackermonster.Moveslotheal == 1) && (playermonster.Moveslotattack == 13 || playermonster.Moveslotattack == 12)) {

                switch (new Random().nextInt(7)) {
                    case 0:
                        Teller = Turn;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        Teller = Turn;
                        break;
                    case 3:
                        Teller = HealButton;
                        break;
                    case 4:
                        Teller = SpecialAttack;
                        break;
                    case 5:
                        Teller = SpecialAttack;
                        break;
                    case 6:
                        Teller = Turn;
                        break;
                }


            }
            if (playermonster.Moveslotattack == 9 && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 3 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 4 || attackermonster.Moveslotattack == 8)) {
                if (Teller == SpecialAttack) {
                    int busted = new Random().nextInt(101);
                    if (busted < 75) {
                        Teller = Turn;
                    }
                }
                // BUSTED
            }

            if (attackermonster.Speed < playermonster.Speed && (attackermonster.Moveslotspeed == 0 || attackermonster.Moveslotspeed == 1 || attackermonster.Moveslotspeed == 3 || attackermonster.Moveslotspeed == 4 || attackermonster.Moveslotspeed == 7 || attackermonster.Moveslotspeed == 8 || attackermonster.Moveslotspeed == 9 || attackermonster.Moveslotspeed == 11)) {
                switch (attackermonster.Moveslotspeed) {

                    case 0:
                        if ((attackermonster.Speed * FrrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                    case 1:
                        if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 2:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 3:
                        if ((attackermonster.Speed * CbrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 4:
                        if ((attackermonster.Speed * SqrtTwo) > playermonster.Speed) {
                            Teller = Status;
                        }
                        break;
                    case 5:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 6:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 7:
                        if (((attackermonster.Speed * CbrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 8:
                        if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 9:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 10:
                        if (((attackermonster.Speed * SqrtTwo) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 71)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 11:
                        if (((attackermonster.Speed * 2) > playermonster.Speed) && (AttackerStatDelayTimer == -1) && (attackermonster.Health > (((playermonster.Attack / attackermonster.Defense) * 153)))) {
                            Teller = Status;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 12:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                    case 13:
                        switch (new Random().nextInt(3)) {
                            case 0:
                                Teller = SpecialAttack;
                                break;
                            case 1:
                                Teller = Turn;
                                break;
                            case 2:
                                Teller = Turn;
                                break;
                        }
                        if (Teller != Turn) {
                            Damage = ((attackermonster.Attack / playermonster.Defense) * 58);
                            if (playermonster.Health <= Damage) {
                                Teller = Turn;
                            }
                        }
                        break;
                }
            }

            if (attackermonster.Moveslotattack == 3 && elongatedglugtimerA > 2 && Teller == SpecialAttack) {
                Teller = Turn;
                if (ratiohealth > 89 && turncounter > 3) {
                    Teller = Status;
                }
            }
            if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                if (
                        delayedhealtimerPsnow != 0 ||
                        delayedhealtimerP != 0 ||
                                delayedblasttimerP != 0 ||
                                delayedblastpowerP != 0 ||
                                delayedhealpowerP != 0 ||
                                PlayerStatDelayTimer != -1 ||
                                // PlayerDelayedStatMove != -1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                grouphealtimerP != 0 ||
                                grouphealpowerP != 0 ||
                                elongatedhealtimerP != 0 ||
                                elongatedhealpowerP != 0 ||
                                PlayerProtectStatsTimer != 0 || reflectTimerOnPlayer != 0) {
                    Teller = SpecialAttack;
                }

                if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                    //  Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn;  //  need to adjust the damage for the moves ABCDEFG
                    }
                }
            }
            if (attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13) {
                if (
                        delayedhealtimerPsnow == 0 &&
                        delayedhealtimerP == 0 &&
                                delayedblasttimerP == 0 &&
                                delayedblastpowerP == 0 &&
                                delayedhealpowerPsnow == 0 &&
                                delayedhealpowerP == 0 &&
                                PlayerStatDelayTimer == -1 &&
                                // PlayerDelayedStatMove == -1&&-1|| // Dizarelyt this seems to be causing monsters to snatch moves that have already gone off
                                grouphealtimerP == 0 &&
                                grouphealpowerP == 0 &&
                                elongatedhealtimerP == 0 &&
                                elongatedhealpowerP == 0 &&
                                PlayerProtectStatsTimer == 0 && reflectTimerOnPlayer == 0) {
                    if (Teller == SpecialAttack) {
                        Teller = Turn;
                    }
                }

                if (Teller != Turn && delayedblastpowerP < attackermonster.Health) {
                    // Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                    if (playermonster.Health <= testdamage) {
                        Teller = Turn; //ABCDEFG
                    }
                }
            }

            if (effectivehits > 3) {
                if (attackermonster.Moveslotattack == 1) {
                    if (Teller == Turn) {
                        if (delayedblasttimerA == 0) {
                            if (testdamage < (delayedblastcheck))
                                Teller = SpecialAttack;
                        }
                    }
                }
            }
            if (attackermonster.Moveslotattack == 1) {
                if (Teller == SpecialAttack) {
                    if (delayedblasttimerA != 0) {
                        Teller = Turn;
                    }
                }
            }
            if (attackermonster.Moveslotattack == 1 && (playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13)) {
                if (Teller == SpecialAttack) {
                    if (new Random().nextInt(14) != 0) {
                        Teller = Turn;
                    }
                }
            }
//ASDF
            if (attackermonster.Moveslotattack == 6) {
                if ((Math.ceil(playermonster.Speed * .85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                    if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)) {
                        Teller = SpecialAttack;
                    }
                }
            }
            if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                Teller = HealButton;
            }
            if (attackermonster.Moveslotattack == 9 && healblocktgimerP == 0 &&
                    elongatedhealwoundtimerA == 0 &&
                    elongatedwoundtimerA == 0 &&
                    elongatedglugtimerP == 0 &&
                    statblocktimerA == 0) {
                if (Teller == SpecialAttack) {
                    if ((new Random().nextInt(101)) <= 90) {
                        Teller = Turn;
                    }
                }
            }



            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && delayedhealtimerPsnow >= 1) {
                Teller = SpecialAttack;
            }


            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                Teller = Turn;
            }



            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerPsnow) {
                Teller = SpecialAttack;
            }
            if (Teller != SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA < delayedhealtimerP) {
                Teller = SpecialAttack;
            }



            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 2 && elongatedhealwoundtimerP >= 1) {
                Teller = Turn;
            }

            if (Teller == HealButton && (attackermonster.Moveslotheal == 0 || attackermonster.Moveslotheal > 5) && attackermonster.Health == MaxHealthAttacker) {
                Teller = Turn;
            }

            if (Teller == Turn && chipdamage > testdamage && attackermonster.Moveslotattack == 5) {
                Teller = SpecialAttack;
            }

            if (Teller == Turn && tripcheck > testdamage && attackermonster.Moveslotattack == 6) {
                Teller = SpecialAttack;
            }

            if (Teller == Turn && dispdam > testdamage && attackermonster.Moveslotattack == 7) {
                Teller = SpecialAttack;
            }
            if (Teller == Turn && depresscheck > testdamage && attackermonster.Moveslotattack == 11) {
                Teller = SpecialAttack;
            }
            if (Teller == Turn && dispelcheck >= testdamage && attackermonster.Moveslotattack == 13) {
                Teller = SpecialAttack;
            }
            if (Teller == Turn && refutecheck >= testdamage && attackermonster.Moveslotattack == 9) {
                Teller = SpecialAttack;
            }

            if (Teller == SpecialAttack && dispelcheck < testdamage && attackermonster.Moveslotattack == 13) {
                Teller = Turn;
            }
            if (Teller == SpecialAttack && refutecheck < testdamage && attackermonster.Moveslotattack == 9) {
                Teller = Turn;
            }
            if (playermonster.Defense >= attackermonster.Defense && attackermonster.Moveslotspeed == 15) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 6 || attackermonster.Moveslotdefense == 7 || attackermonster.Moveslotdefense == 8) {
                        Teller = Status;
                    }
                }
            }


            if (playermonster.Speed >= attackermonster.Speed && attackermonster.Moveslotspeed == 14) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 3 || attackermonster.Moveslotdefense == 4 || attackermonster.Moveslotdefense == 5) {
                        Teller = Status;
                    }
                }
            }


            if (playermonster.Attack >= attackermonster.Attack && attackermonster.Moveslotspeed == 16) {
                if (attackermonster.Health >= MaxHealthAttacker) {
                    if (attackermonster.Moveslotdefense == 0 || attackermonster.Moveslotdefense == 1 || attackermonster.Moveslotdefense == 2) {
                        Teller = Status;
                    }
                }
            }


            if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed * .85) < playermonster.Speed) && playermonster.Moveslotattack == 6)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                Teller = SpecialAttack;
            }

            if ((attackermonster.Speed >= playermonster.Speed && (((attackermonster.Speed / FrrtTwo) < (playermonster.Speed * FrrtTwo)) && playermonster.Moveslotattack == 14)) && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer <= 1 && (!(playermonster.Moveslotattack == 12 || playermonster.Moveslotattack == 13) || (((new Random().nextInt(10)) <= 2)))) {
                Teller = SpecialAttack;
            }
            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 14 && AttackerProtectStatsTimer >= 15) {
                Teller = Turn;
            }
            if (PlayerProtectStatsTimer > 0 && (attackermonster.Moveslotattack == 5 || attackermonster.Moveslotattack == 6 || attackermonster.Moveslotattack == 7 || attackermonster.Moveslotattack == 11 || attackermonster.Moveslotattack == 12 || attackermonster.Moveslotattack == 13 || attackermonster.Moveslotattack == 14)) {
                if (Teller == SpecialAttack) {
                    if (tripcheck < testdamage && dispdam < testdamage && chipdamage < testdamage) {
                        Teller = Turn;
                    }
                }
            }


            if (Teller == HealButton && healblocktgimerP > 0 && attackermonster.Moveslotheal != 4) {
                Teller = Turn;
            }
            if (attackermonster.Moveslotattack == 0 && (woundtester * 3) > Go) {
                if (elongatedwoundtimerP <= 2) {
                    Teller = SpecialAttack;
                }
            }

            if (attackermonster.Moveslotattack == 0 && Teller == SpecialAttack) {
                if (elongatedwoundtimerP > 2) {
                    Teller = Turn;
                }
            }
            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 8 && statblocktimerP >= 2) {
                Teller = Turn;
            }

            if (Teller == Status) {
                if (statblocktimerA != 0) {
                    Teller = Turn;
                }
            }

            if (Teller == Status && playermonster.Moveslotattack == 8 && (attackermonster.Moveslotspeed >= 7 && attackermonster.Moveslotspeed <= 13)) {
                switch (new Random().nextInt(3)) {
                    case 0:
                        Teller = SpecialAttack;
                        break;
                    case 1:
                        Teller = Turn;
                        break;
                    case 2:
                        Teller = Turn;
                        break;
                }
            }

            if (attackermonster.Moveslotattack > 98) {
                if (Teller == SpecialAttack) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotheal > 98) {
                if (Teller == HealButton) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotspeed > 98) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }
            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = Turn;
            }


            if ((attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = Status;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = HealButton;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98)) {
                Teller = SpecialAttack;
            }


            if ((attackermonster.Moveslotspeed > 98) && (attackermonster.Moveslotheal > 98) && (attackermonster.Moveslotdefense > 98) && (attackermonster.Moveslotattack > 98)) {
                Teller = TellButton;
            }
            if (AttackerStatDelayTimer != -1) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }
            if (attackermonster.Moveslotattack == 15) {
                if (Teller == SpecialAttack) {
                    if (reflectTimerOnAttacker >= 8) {
                        Teller = HealButton;
                        if (MaxHealthAttacker == attackermonster.Health || (healblocktgimerP > 0)) {
                            Teller = Status;
                            if (statblocktimerA > 0) {
                                Teller = Turn;
                                if (suicidecheckbasic > attackermonster.Health) {
                                    Teller = SpecialAttack;
                                }
                            }
                        }
                    }
                }
            }
            if (suicidecheckbasic > attackermonster.Health) {
                if (Teller == Turn) {
                    Teller = HealButton;
                    if (attackermonster.Health == MaxHealthAttacker) {
                        Teller = Status;
                    }
                }
            }

            if (Teller == SpecialAttack && suicidecheckchip > attackermonster.Health && attackermonster.Moveslotattack == 5) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }

            if (Teller == SpecialAttack && suicidechecktrip > attackermonster.Health && attackermonster.Moveslotattack == 6) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }

            if (Teller == SpecialAttack && suicidecheckdip > attackermonster.Health && attackermonster.Moveslotattack == 7) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
            if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 9) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
            if (Teller == SpecialAttack && suicidecheckdisp > attackermonster.Health && attackermonster.Moveslotattack == 13) {
                Teller = HealButton;
                if (attackermonster.Health == MaxHealthAttacker) {
                    Teller = Status;
                }
            }
        }
    }



        switch (copying){
            case 0:
                copying = 0;
                break;
            case 1:
                Teller = Turn;
                copying = 0;
                break;
            case 2:
                Teller = Turn;
                copying = 0;
                break;
            case 3:
                Teller = HealButton;
                copying = 0;
                break;
            case 4:
                Teller = Status;
                copying = 0;
                break;
            case 5:
                Teller = SpecialAttack;
                copying = 0;
                break;
        }

        copying = 0;
        if (Teller == Turn || Teller == copybuttona || Teller == copybuttond) {
            copyAttackermoveforplayer = 1;
            whosturnisitanyway = 0;
            Damage = 0;
            atcount++;
            atcountx++;



            String Catchsopmekindofattack = " Attacks ";

            switch (attackermonster.Moveslotdefense){

                case 0:
                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));

                    Catchsopmekindofattack = " Attacks For ";
                    break;

                case 1:
                    Damage = ((attackermonster.Attack / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Advances For ";
                    break;

                case 2:
                    Damage = ((attackermonster.Attack / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Overpowers For ";

                    break;


                case 3:
                    Damage = ((attackermonster.Speed / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Punctures For ";
                    break;

                case 4:
                    Damage = ((attackermonster.Speed / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Races For ";
                    break;

                case 5:
                    Damage = ((attackermonster.Speed / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Exhausts For ";
                    break;

                case 6:
                    Damage = ((attackermonster.Defense / playermonster.Defense) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Collides For ";
                    break;

                case 7:
                    Damage = ((attackermonster.Defense / playermonster.Speed) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Obstructs For ";
                    break;

                case 8:
                    Damage = ((attackermonster.Defense / playermonster.Attack) * (new Random().nextInt(21) + 50));
                    Catchsopmekindofattack = " Beams Block For ";
                    break;


            }
        //    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
            Damage = Math.round(Damage);


            playermonster.Health = playermonster.Health - Damage;

            PlayerReflect((int)Damage);



            String WhatHappenedString = TypesOfMotions(1);

            StringDisplayMethod();


            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy "+ names(attackermonster.Idnum) + Catchsopmekindofattack +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                } else if (whosturnisitanyway == 1) {
                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                }
                DeathTest();
            }
        }

        if (Teller == Status || Teller == copybuttons) {

            copyAttackermoveforplayer = 3;
            whosturnisitanyway = 0;
            Damage = 0;
            stcount++;
            stcountx++;
            if (attackermonster.Moveslotspeed == 0) {
                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 1) {
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 2) {
                attackermonster.Defense = attackermonster.Defense * CbrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed == 3) {
                attackermonster.Attack = attackermonster.Attack * CbrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
                attackermonster.Speed = attackermonster.Speed * CbrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 4) {
                attackermonster.Speed = attackermonster.Speed * SqrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
            } else if (attackermonster.Moveslotspeed == 5) {
                attackermonster.Defense = attackermonster.Defense * SqrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
            } else if (attackermonster.Moveslotspeed == 6) {
                attackermonster.Attack = attackermonster.Attack * SqrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
            } else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1 && attackermonster.Moveslotspeed < 14) {
                AttackerStatDelayTimer = 3;
                AttackerDelayedStatMove = (int) attackermonster.Moveslotspeed;
            }else if (attackermonster.Moveslotspeed == 14) {
                attackermonster.Speed = attackermonster.Speed * FrrtTwo;
                attackermonster.Speed = Math.round(attackermonster.Speed);
                playermonster.Speed = (playermonster.Speed / FrrtTwo);
                playermonster.Speed = Math.round(playermonster.Speed);
            }else if (attackermonster.Moveslotspeed == 15) {
                attackermonster.Defense = attackermonster.Defense * FrrtTwo;
                attackermonster.Defense = Math.round(attackermonster.Defense);
                playermonster.Defense = (playermonster.Defense / FrrtTwo);
                playermonster.Defense = Math.round(playermonster.Defense);
            }else if (attackermonster.Moveslotspeed == 16) {
                attackermonster.Attack = attackermonster.Attack * FrrtTwo;
                attackermonster.Attack = Math.round(attackermonster.Attack);
                playermonster.Attack = (playermonster.Attack / FrrtTwo);
                playermonster.Attack = Math.round(playermonster.Attack);
            }


            String WhatHappenedString = TypesOfMotions(3);

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
            DeathTest();
        }

        if (Teller == HealButton || Teller == copybuttonh) {

            copyAttackermoveforplayer = 2;
            whosturnisitanyway = 0;
            Damage = 0;
            hecount++;
            hecountx++;
            if (attackermonster.Moveslotheal == 0) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                    Damage = Math.round(Damage);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
            } else if (attackermonster.Moveslotheal == 1) {
                delayedhealpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense));
                if (delayedhealtimerA == 0) {
                    delayedhealtimerA = 1;
                }
            } else if (attackermonster.Moveslotheal == 2) {
                elongatedhealtimerA = elongatedhealtimerA + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 45)) * (attackermonster.Speed / attackermonster.Defense)))) / 7; // 45 was 65 ALLMARK 6/22/19
                healtester = Math.round(healtester);
                if (healtester > elongatedhealpowerA) {
                    elongatedhealpowerA = healtester;
                }
            } else if (attackermonster.Moveslotheal == 3) {
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Attack / playermonster.Defense));// was 25 now 35
                Damage = Math.round(Damage);
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    attackermonster.Health = attackermonster.Health + Damage;
                } else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0) {
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            } else if (attackermonster.Moveslotheal == 4) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                statblocktimerA = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / attackermonster.Defense));
                Damage = Math.round(Damage);
                attackermonster.Health = attackermonster.Health + Damage;
            }else if (attackermonster.Moveslotheal == 5) {
                grouphealtimerA = grouphealtimerA + 7;
                int healtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
                healtester = Math.round(healtester);
                if (healtester > grouphealpowerA) {
                    grouphealpowerA = healtester;
                }
            }else if (attackermonster.Moveslotheal == 6) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker));
                    Damage = Math.round(Damage*.381);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker));
                    Damage = Math.round(Damage*.381);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Attack = Math.round((attackermonster.Attack*1.0167));
                attackermonster.Defense = Math.round((attackermonster.Defense*1.0167));
                attackermonster.Speed = Math.round((attackermonster.Speed*1.0167));
            }else if (attackermonster.Moveslotheal == 7) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed /(attackermonster.Defense + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Speed = Math.round((attackermonster.Speed*1.05));
            }else if (attackermonster.Moveslotheal == 8) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Attack = Math.round((attackermonster.Attack*1.05));
            }else if (attackermonster.Moveslotheal == 9) {
                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Damage;
                }
                if (elongatedhealwoundtimerA != 0 && healblocktgimerP == 0) {
                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense /(attackermonster.Speed + attackermonster.Attack)));
                    Damage = Math.round(Damage*1.80);
                    attackermonster.Health = attackermonster.Health + Math.round(Damage / 2);
                }
                attackermonster.Defense = Math.round((attackermonster.Defense*1.05));
            }else if (attackermonster.Moveslotheal == 10) {
                // double snowball
                Damage = ((((new Random().nextInt(11) + 55)) * (( attackermonster.Speed + attackermonster.Defense + attackermonster.Attack ) / MaxHealthAttacker)) * 2);
                Damage = Math.round(Damage*.381);
                if(Damage >= delayedhealpowerAsnow) {
                    delayedhealpowerAsnow = (int) Damage;
                }
                if (delayedhealtimerAsnow == 0) {
                    delayedhealtimerAsnow = 1;
                }
            }
            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }




            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {

                    if  (attackermonster.Moveslotheal == 0)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Heals " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if (attackermonster.Moveslotheal == 1) {
                        if (delayedhealpowerA > 0) {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Two Turn Delayed Healing of " + String.format(displaystring, (int) Math.round(delayedhealpowerA)) + "\n");
                        }else {
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Two Turn Delayed Healing " + "\n");
                        }
                    }else if (attackermonster.Moveslotheal == 2) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, elongatedhealtimerA) + " Turn Regeneration of " + String.format(displaystring, (int) Math.round(elongatedhealpowerA)) + "\n");
                    }else if (attackermonster.Moveslotheal == 3) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + names(playermonster.Idnum) + "\n");
                    }else if  (attackermonster.Moveslotheal == 4) {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerA) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerA)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (attackermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerAsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
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
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Drains " + String.format(displaystring, (int) Math.round(Damage)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                    }else if  (playermonster.Moveslotheal == 4)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs Cleansing Heal " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 5)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " +  String.format(displaystring, grouphealtimerP) + " Turn Group Regeneration of " + String.format(displaystring, (int) Math.round(grouphealpowerP)) + "\n");
                    }else if  (playermonster.Moveslotheal == 6)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snowballs " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 7)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Gains Momentum " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 8)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Postures itself " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 9)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Grows " + "For " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                    }else if  (playermonster.Moveslotheal == 10)  {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs a Delayed Snowball Heal " + "For " + String.format(displaystring, (int) Math.round(delayedhealpowerPsnow)) + "\n");
                    }else {
                        CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                    }

                }
            }

        }

        if (Teller == SpecialAttack || Teller == copybuttons) {

            copyAttackermoveforplayer = 4;
            whosturnisitanyway = 0;
            Damage = 0;
            spcount++;
            spcountx++;
            if (attackermonster.Moveslotattack == 0) {

                elongatedwoundtimerP = elongatedwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;
                healtester = Math.round(healtester);
                if (healtester > elongatedwoundpowerP) {
                    elongatedwoundpowerP = healtester;
                }
            } else if (attackermonster.Moveslotattack == 1) {
                delayedblastpowerA = (int) (((new Random().nextInt(21) + 65)) * (attackermonster.Attack / playermonster.Speed));
                if (delayedblasttimerA == 0) {
                    delayedblasttimerA = 1;
                }
            } else if (attackermonster.Moveslotattack == 2) {
                elongatedhealwoundtimerP = elongatedhealwoundtimerP + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;
                healtester = Math.round(healtester);
                if (healtester > elongatedhealwoundpowerP) {
                    elongatedhealwoundpowerP = healtester;
                }

            } else if (attackermonster.Moveslotattack == 3) {
                elongatedglugtimerA = elongatedglugtimerA + 10;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14; // was 12 7/7/19
                healtester = Math.round(healtester);
                if (healtester > elongatedglugpowerA) {
                    elongatedglugpowerA = healtester;
                }
            } else if (attackermonster.Moveslotattack == 4) {
                healblocktgimerA = healblocktgimerA + 7;
            }else if (attackermonster.Moveslotattack == 5) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
                Damage = Math.round(Damage);
                if (playermonster.Defense >= statMinimum){
                    playermonster.Defense = Math.round(playermonster.Defense * .85);
                }
                if (playermonster.Defense <= statMinimum){
                    playermonster.Defense = statMinimum;
                }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 6) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
                Damage = Math.round(Damage);
                if (playermonster.Speed >= statMinimum){
                    playermonster.Speed = Math.round(playermonster.Speed * .85);
                }
                if (playermonster.Speed <= statMinimum){
                    playermonster.Speed = statMinimum;
                }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 7) {
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
                Damage = Math.round(Damage);
                if (playermonster.Attack >= statMinimum){
                    playermonster.Attack = Math.round(playermonster.Attack * .85);
                }
                if (playermonster.Attack <= statMinimum){
                    playermonster.Attack = statMinimum;
                }
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 8) {
                statblocktimerP = statblocktimerP + 7;
            } else if (attackermonster.Moveslotattack == 9) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                statblocktimerA = 0;
                Damage = (((new Random().nextInt(11) + 35)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 10) {
                int holdA = (int) attackermonster.Attack;
                int holdD = (int) attackermonster.Defense;
                int holdS = (int) attackermonster.Speed;
                int holdAx = (int) playermonster.Attack;
                int holdDx = (int) playermonster.Defense;
                int holdSx = (int) playermonster.Speed;
                double sumall = 0;
                double sumallx = 0;
                attackermonster.Attack = Math.round(attackermonster.Attack*.77);
                attackermonster.Defense = Math.round(attackermonster.Defense*.77);
                attackermonster.Speed = Math.round(attackermonster.Speed*.77);
                sumall = ((holdA) + (holdD) + (holdS));
                sumallx = ((holdAx) + (holdDx) + (holdSx));
                Damage = (double) (sumall/sumallx) * (double)(((new Random().nextInt(51)+100)));
                Damage = Math.round(Damage);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
                if (holdS >= holdSx && attackermonster.Speed < playermonster.Speed){
                    turncounter++;
                }

                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (attackermonster.Moveslotattack == 11) {
                Damage = (((new Random().nextInt(11) + 25)) * ((attackermonster.Speed+attackermonster.Attack+ attackermonster.Defense) / (playermonster.Speed+playermonster.Attack+ playermonster.Defense)));
                Damage = Math.round(Damage);

                playermonster.Speed = Math.round(playermonster.Speed * .95);
                playermonster.Defense = Math.round(playermonster.Defense * .95);
                playermonster.Attack = Math.round(playermonster.Attack * .95);
                playermonster.Health = playermonster.Health - Damage;
                PlayerReflect((int)Damage);
                StatAbuseCurb(playermonster);
                StatAbuseCurb(attackermonster);
            }else if (attackermonster.Moveslotattack == 12) {
                //Snatch

                if (delayedblastpowerA < delayedblastpowerP){
                delayedblastpowerA = delayedblastpowerP;
            }
                if (delayedhealtimerA < delayedhealtimerP){
                delayedhealtimerA = delayedhealtimerP;
            }
                if (delayedhealpowerA < delayedhealpowerP){
                    delayedhealpowerA = delayedhealpowerP;
                }
                if (delayedhealtimerAsnow < delayedhealtimerPsnow){
                delayedhealtimerAsnow = delayedhealtimerPsnow;
            }
                if (delayedhealpowerAsnow < delayedhealpowerPsnow){
                    delayedhealpowerAsnow = delayedhealpowerPsnow;
                }

                if (PlayerProtectStatsTimer > AttackerProtectStatsTimer){
                    AttackerProtectStatsTimer = PlayerProtectStatsTimer;
                }
                if (delayedblasttimerA < delayedblasttimerP){
                delayedblasttimerA = delayedblasttimerP;
            }
                if (PlayerStatDelayTimer != -1){
                AttackerStatDelayTimer = PlayerStatDelayTimer;
            }
                if (PlayerDelayedStatMove != -1){
                AttackerDelayedStatMove = PlayerDelayedStatMove;
            }
                if (grouphealtimerA < grouphealtimerP){
                grouphealtimerA = grouphealtimerP;
            }
                if (grouphealpowerA < grouphealpowerP){
                grouphealpowerA = grouphealpowerP;
            }
                if (elongatedhealtimerA < elongatedhealtimerP){
                elongatedhealtimerA = elongatedhealtimerP;
            }
                if (elongatedhealpowerA < elongatedhealpowerP){
                elongatedhealpowerA = elongatedhealpowerP;
            }


                if (reflectTimerOnAttacker < reflectTimerOnPlayer){
                    reflectTimerOnAttacker = reflectTimerOnPlayer;
                }
                if (reflectRatioAttacker < reflectRatioPlayer){
                    reflectRatioAttacker = reflectRatioPlayer;
                }



                reflectRatioPlayer = 0;
                reflectTimerOnPlayer = 0;

                delayedhealtimerPsnow = 0;
                delayedhealpowerPsnow = 0;
                PlayerProtectStatsTimer = 0;
                delayedblastpowerP = 0;
                delayedhealtimerP = 0;
                delayedblasttimerP = 0;
                delayedhealpowerP = 0;
                PlayerStatDelayTimer = -1;
                PlayerDelayedStatMove = -1;
                grouphealtimerP = 0;
                grouphealpowerP = 0;
                elongatedhealtimerP = 0;
                elongatedhealpowerP = 0;
            }else if (attackermonster.Moveslotattack == 13) {
                //Dispel

               // ResetWounds();

                delayedhealtimerPsnow = 0;
                delayedhealpowerPsnow = 0;
                reflectRatioPlayer = 0;
                reflectTimerOnPlayer = 0;
                PlayerProtectStatsTimer = 0;
                delayedblastpowerP = 0;
                delayedhealtimerP = 0;
                delayedblasttimerP = 0;
                delayedhealpowerP = 0;
                PlayerStatDelayTimer = -1;
                PlayerDelayedStatMove = -1;
                grouphealtimerP = 0;
                grouphealpowerP = 0;
                elongatedhealtimerP = 0;
                elongatedhealpowerP = 0;

                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                Damage = Math.round(Damage);

                playermonster.Health = (playermonster.Health - Damage);
                PlayerReflect((int)Damage);
            }else if (attackermonster.Moveslotattack == 14) {

                AttackerProtectStatsTimer = AttackerProtectStatsTimer + 11;
            }else if (attackermonster.Moveslotattack == 15) {
                reflectTimerOnAttacker = reflectTimerOnAttacker + 7;

                double fx =(double)(attackermonster.Defense/attackermonster.Speed);


             //   fx = (double)(((-1.488*(fx*fx)) + (26.61*fx)) - 0.119);
                fx = (0.449*((25*fx) -(fx*fx))) + 17;

                if (reflectRatioAttacker <= fx ){
                    reflectRatioAttacker = fx;
                }
            }else if (attackermonster.Moveslotattack == 16) {


                disgustingworkarounda = 1;
                if (tangiblecheck == 1) {
                    tangiblecheck = 0;

                    switch (copyPlayermoveforattacker){
                        case 0:

                            copying = 1;
                            //if(tangiblecheck == 1) {
                            RoboBrainMethodTell(Turn);
                            // }
                            copying = 0;
                            break;
                        case 1:

                            copying = 2;
                            int holdmove = attackermonster.Moveslotdefense;
                            attackermonster.Moveslotdefense = playermonster.Moveslotdefense;
                            // if(tangiblecheck == 1) {
                            RoboBrainMethodTell(Turn);
                            // }
                            copying = 0;
                            attackermonster.Moveslotdefense = holdmove;
                            break;
                        case 2:

                            copying = 3;
                            int holdmoveh = attackermonster.Moveslotheal;
                            attackermonster.Moveslotheal = playermonster.Moveslotheal;
                            //if(tangiblecheck == 1) {
                            RoboBrainMethodTell(HealButton);
                            // }
                            copying = 0;
                            attackermonster.Moveslotheal = holdmoveh;
                            break;
                        case 3:

                            copying = 4;
                            int holdmoves = attackermonster.Moveslotspeed;
                            attackermonster.Moveslotspeed = playermonster.Moveslotspeed;
                            //if(tangiblecheck == 1) {
                            RoboBrainMethodTell(Status);
                            // }
                            attackermonster.Moveslotspeed = holdmoves;
                            copying = 0;
                            break;
                        case 4:

                            copying = 5;
                            int holdmovep = attackermonster.Moveslotattack;
                            attackermonster.Moveslotattack = playermonster.Moveslotattack;
                            // if(tangiblecheck == 1) {
                            if (attackermonster.Moveslotattack == 16) {
                                RoboBrainMethodTell(Turn);
                            } else{
                                RoboBrainMethodTell(SpecialAttack);
                            }
                            //  }
                            copying = 0;
                            attackermonster.Moveslotattack = holdmovep;
                            break;
                    }
                    somebodystopme = 1;
                }tangiblecheck = 0;
                CombatStringHolder = CombatString;
            }else if (attackermonster.Moveslotattack == 17) {

                Damage = (((new Random().nextInt(21) + 50)) * (attackermonster.Attack / playermonster.Attack));
                Damage = Math.round(Damage);

                playermonster.Health = (playermonster.Health - Damage);
                PlayerReflect((int)Damage);
            }

            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }



            String WhatHappenedString = TypesOfMotions(2);
            String displaystring = "%s";
            String displaystringH = "%s/%s";

            if(turncounter > 0 /*&&  ((playermonster.Health > 0 && attackermonster.Health > 0)|| ActionNum != 1) */ || ActionNum != 1) {
                if (whosturnisitanyway == 0) {


                    switch (attackermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerP) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerP)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerA > 0) {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerA)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerP) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerP)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerA) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerA)) + " From " + names(playermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerA) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerP)) + " Turn Boost Block" + "\n");
                            break;
                        case 9:
                            CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Refutes " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 10:
                            CombatString = String.format(CombatString +"Enemy " + names(attackermonster.Idnum) + " Burns Its Energy Against " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Depresses " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Snatches " + String.format(names(playermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Dispels " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(AttackerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Beams Block At " + String.format(names(playermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;

                    }
                } else if (whosturnisitanyway == 1) {

                    switch (playermonster.Moveslotattack) {

                        case 0:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Wounds For a " + String.format(displaystring, elongatedwoundtimerA) + " Turn Bleed of " + String.format(displaystring, (int) Math.round(elongatedwoundpowerA)) + "\n");
                            break;
                        case 1:
                            if (delayedblastpowerP > 0) {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Prepares Delayed Blast of " + String.format(displaystring, (int) Math.round(delayedblastpowerP)) + "\n");
                            } else {
                                CombatString = String.format(CombatString + names(playermonster.Idnum) + " Fails To Prepare Delayed Blast " + "\n");
                            }
                            break;
                        case 2:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedhealwoundtimerA) + " Turn Grevious Wounds of " + String.format(displaystring, (int) Math.round(elongatedhealwoundpowerA)) + "\n");
                            break;
                        case 3:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, elongatedglugtimerP) + " Turn Slow Drain of " + String.format(displaystring, (int) Math.round(elongatedglugpowerP)) + " From " + "Enemy " + names(attackermonster.Idnum) + "\n");
                            break;
                        case 4:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, healblocktgimerP) + " Turn Heal Block " + "\n");
                            break;
                        case 5:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Chips Defense for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 6:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Trips for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 7:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Disciplines for " + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                            break;
                        case 8:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Begins " + String.format(displaystring, (int) Math.round(statblocktimerA)) + " Turn Boost Block" + "\n");
                            break;
                        case 9:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Refutes " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 10:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Burns Its Energy Against " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 11:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Depresses " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 12:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Snatches " + String.format(names(attackermonster.Idnum) + "'s Benefits " + "\n"));
                            break;
                        case 13:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Dispels " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 14:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Puts Up Stat Shield " + " for " + String.format(displaystring, (int) Math.round(PlayerProtectStatsTimer)) + " Turns " + "\n");
                            break;
                        case 15:
                            CombatString = String.format(CombatString + names(playermonster.Idnum) + " Beams Block At " + String.format(names(attackermonster.Idnum) + " for " + String.format(displaystring, (int) Math.round(Damage)) + "\n"));
                            break;
                        case 16:
                            CombatString = CombatStringHolder;
                            break;
                    }
                }
            }
        }
        if (disgustingworkarounda == 0) {
            DelayedStatusMethod();
        }

        if (statblocktimerP != 0) {
            if (Holdthisformeplayerattack < playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense < playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed < playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (statblocktimerA != 0) {
            if (Holdthisformemonsterattack < attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense < attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed < attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }


        if (PlayerProtectStatsTimer != 0) {
            if (Holdthisformeplayerattack > playermonster.Attack){
                playermonster.Attack = Holdthisformeplayerattack;
            }
            if (Holdthisformeplayerdefense > playermonster.Defense){
                playermonster.Defense = Holdthisformeplayerdefense;
            }
            if (Holdthisformeplayerspeed > playermonster.Speed){
                playermonster.Speed = Holdthisformeplayerspeed;
            }
        }
        if (AttackerProtectStatsTimer != 0) {
            if (Holdthisformemonsterattack > attackermonster.Attack){
                attackermonster.Attack = Holdthisformemonsterattack;
            }
            if (Holdthisformemonsterdefense > attackermonster.Defense){
                attackermonster.Defense = Holdthisformemonsterdefense;
            }
            if (Holdthisformemonsterspeed > attackermonster.Speed){
                attackermonster.Speed = Holdthisformemonsterspeed;
            }
        }
        if (disgustingworkarounda == 0){

            TurnDamageResolution();

        }
        HealthChecker();

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);

    //    if (playermonster.Health <= 0){


    //        CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

    //    }

   //     if (attackermonster.Health <= 0){


 //           CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

 //       }

        StatAbuseCurbTell(playermonster);
        StatAbuseCurbTell(attackermonster);
        /*
                            whosturnisitanyway = 0;
                            if(attackermonster.Moveslotheal == 0) {
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }
                                if (elongatedhealwoundtimerA != 0) {
                                    Damage = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / attackermonster.Defense));
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
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
                            }else if(attackermonster.Moveslotheal == 3){
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Defense));
                                if (healblocktgimerP == 0 && elongatedhealwoundtimerA == 0) {
                                    attackermonster.Health = attackermonster.Health + Damage;
                                }else if (elongatedhealwoundtimerA > 0 && healblocktgimerP == 0){
                                    attackermonster.Health = attackermonster.Health + Math.round(Damage/2);
                                }
                                playermonster.Health = playermonster.Health - Damage;
                            }else if(attackermonster.Moveslotheal == 4){
                                healblocktgimerP = 0;
                                elongatedhealwoundtimerA = 0;
                                elongatedwoundtimerA = 0;
                                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / attackermonster.Defense));
                                attackermonster.Health = attackermonster.Health + Damage;
                            }
                            if (attackermonster.Health > MaxHealthAttacker){
                                attackermonster.Health = MaxHealthAttacker;
                            }*/


       // if(playermonster.Health > 0 && attackermonster.Health > 0) {
           // turncounter++;
          //  ImageChanger();
      //  }

        disgustingworkarounda = 0;
        copyPlayermoveforattacker = 0;

        tangiblecheck = 0;
    }

    
    public void AlwaysMakeSureHealthIsLessThanMax(){


        for (int w = 0; w < MonsterStorageCounter; w++) {
            if (PlayerMonsterStorage[w].Health >= stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health)) {
                PlayerMonsterStorage[w].Health = stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health);
            }
        }
        
        if(playermonster.Health > stats(monstlist((int)playermonster.Idnum).Health)){
            playermonster.Health = stats(monstlist((int)playermonster.Idnum).Health);
        }
        
        if(attackermonster.Health > stats(monstlist((int)attackermonster.Idnum).Health)){
            attackermonster.Health = stats(monstlist((int)attackermonster.Idnum).Health);
        }
        
        
    }


    public void songlist(monst monster){
        switch ((int)monster.Idnum){

            case 0:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
PlayerSounds = null;
                }
                break;
            case 1:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.kunksong);
                break;
            case 2:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.kohbohsong);
                break;
            case 3:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 4:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 5:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.zaumesong);
                break;
            case 6:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 7:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.degeissdtsong);
                break;
            case 8:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 9:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.bongusong);
                break;
            case 10:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.giterigliasong);
                break;
            case 11:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.cyosterothsong);
                break;
            case 12:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.nentopodesong);
                break;
            case 13:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 14:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 15:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.grobhostsong);
                break;
            case 16:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.illelonabsong);
                break;
            case 17:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 18:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.blattlesong);
                break;
            case 19:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.swogharnlersong);
                break;
            case 20:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 21:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 22:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.daahnidasong);
                break;
            case 23:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.sorbasong);
                break;
            case 24:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.jiyousong);
                break;
            case 25:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.sparvaesong);
                break;
            case 26:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.vellupsong);
                break;
            case 27:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.bellajasong);
                break;
            case 28:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.levdzellsong);
                break;
            case 29:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.ryteeggsong);
                break;
            case 30:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 31:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.schmodozersong);
                break;
            case 32:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 33:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 34:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.dicytosong);
                break;
            case 35:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 36:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 37:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 38:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.wheeliosbopsongxt);
          break;
            case 39:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 40:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.epibazangsong);
                break;
            case 41:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 42:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 43:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 44:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 45:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.urcuriasong);
                break;
            case 46:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 47:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.mondosplaksong);
                break;
            case 48:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.kaheksagugesong);
                break;
            case 49:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 50:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.munegullsong);
                break;
            case 51:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.sudakleezsong);
                break;
            case 52:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 53:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.faedendronsong);
                break;
            case 54:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 55:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 56:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.xlitchsong);
                break;
            case 57:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.baasong);
                break;
            case 58:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 59:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 60:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                PlayerSounds = MediaPlayer.create(this, R.raw.rallodsong);
                break;
            case 61:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 62:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 63:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 64:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 65:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.wochemsong);
                break;
            case 66:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 67:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.psychobathsong);
                break;
            case 68:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 69:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 70:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.gungholiosong);
                break;
            case 71:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 72:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.kungulpsong);
                break;
            case 73:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.satinellasong);
                break;
            case 74:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 75:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 76:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 77:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 78:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 79:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.blanqastsong);
                break;
            case 80:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 81:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 82:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 83:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.prostraxsong);
                break;
            case 84:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.haptozahensong);
                break;
            case 85:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.minkohabodsong);
                break;
            case 86:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 87:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 88:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 89:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 90:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.sluggernautsong);
                break;
            case 91:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 92:
                if (PlayerSounds != null) {
        PlayerSounds.stop();
PlayerSounds = null;
    }break;
            case 93:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.doughgnatsong);
                break;
            case 94:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.ratticsong);
                break;
            case 95:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.missileaneoussong);
                break;
            case 96:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.runnybabbitsong);
                break;
            case 97:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.zubgondraktersong);
                break;
            case 98:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 99:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 100:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 101:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 102:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 103:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 104:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 105:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 106:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 107:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 108:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 109:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 110:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 111:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 112:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 113:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 114:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 115:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.beeurchinsong);
                break;
            case 116:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 117:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 118:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.scorphibiansong);
                break;
            case 119:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 120:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 121:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 122:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 123:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 124:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }

                PlayerSounds = MediaPlayer.create(this, R.raw.zentapedesong);
                break;
            case 125:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 126:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 127:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
            case 128:
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }break;
        }
        if (monster.Idnum > 129 || monster.Idnum < 0){


        }
        if (PlayerSounds != null) {
            PlayerSounds.setLooping(true); // boogaloo
            PlayerSounds.start();
        }else {
           // PlayerSounds.setLooping(false); // boogaloo
           // PlayerSounds.stop();
        }


        float f = (float)((float)((float)(monster.UniqueID%102) + 50)/100);
      //  f = (float) 1.51;


        if (PlayerSounds != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                PlayerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
            }
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public void attackersonglist(monst monster){
        switch ((int) monster.Idnum){

            case 0:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
AttackerSounds = null;
                }
                break;
            case 1:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.kunksong);
                break;
            case 2:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.kohbohsong);
                break;
            case 3:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 4:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 5:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.zaumesong);
                break;
            case 6:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 7:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.degeissdtsong);
                break;
            case 8:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 9:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.bongusong);
                break;
            case 10:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.giterigliasong);
                break;
            case 11:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.cyosterothsong);
                break;
            case 12:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.nentopodesong);
                break;
            case 13:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 14:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 15:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.grobhostsong);
                break;
            case 16:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.illelonabsong);
                break;
            case 17:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 18:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.blattlesong);
                break;
            case 19:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.swogharnlersong);
                break;
            case 20:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 21:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 22:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.daahnidasong);
                break;
            case 23:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.sorbasong);
                break;
            case 24:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.jiyousong);
                break;
            case 25:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.sparvaesong);
                break;
            case 26:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.vellupsong);
                break;
            case 27:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.bellajasong);
                break;
            case 28:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.levdzellsong);
                break;
            case 29:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.ryteeggsong);
                break;
            case 30:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 31:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.schmodozersong);
                break;
            case 32:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 33:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 34:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.dicytosong);
                break;
            case 35:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 36:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 37:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 38:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.wheeliosbopsongxt);
          break;
            case 39:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 40:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.epibazangsong);
                break;
            case 41:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 42:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 43:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 44:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 45:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.urcuriasong);
                break;
            case 46:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 47:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.mondosplaksong);
                break;
            case 48:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.kaheksagugesong);
                break;
            case 49:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 50:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.munegullsong);
                break;
            case 51:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.sudakleezsong);
                break;
            case 52:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 53:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.faedendronsong);
                break;
            case 54:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 55:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 56:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.xlitchsong);
                break;
            case 57:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.baasong);
                break;
            case 58:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 59:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 60:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.rallodsong);
                break;
            case 61:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 62:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 63:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 64:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 65:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.wochemsong);
                break;
            case 66:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 67:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }
                AttackerSounds = MediaPlayer.create(this, R.raw.psychobathsong);
                break;
            case 68:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 69:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 70:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.gungholiosong);
                break;
            case 71:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 72:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.kungulpsong);
                break;
            case 73:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.satinellasong);
                break;
            case 74:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 75:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 76:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 77:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 78:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 79:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.blanqastsong);
                break;
            case 80:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 81:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 82:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 83:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.prostraxsong);
                break;
            case 84:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.haptozahensong);
                break;
            case 85:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.minkohabodsong);
                break;
            case 86:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 87:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
            case 88:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
                case 89:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;case 90:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.sluggernautsong);
                break;
                case 91:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;case 92:
                if (AttackerSounds != null) {
        AttackerSounds.stop();
AttackerSounds = null;
    }break;
                case 93:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.doughgnatsong);
                break;

                case 94:
                    if (AttackerSounds != null) {
                        AttackerSounds.stop();
                        AttackerSounds = null;
                    }

                    AttackerSounds = MediaPlayer.create(this, R.raw.ratticsong);
                    break;
            case 95:
                if (AttackerSounds != null) {
                    AttackerSounds.stop();
                    AttackerSounds = null;
                }

                AttackerSounds = MediaPlayer.create(this, R.raw.missileaneoussong);
                break;
                case 96:
        if (AttackerSounds != null) {
            AttackerSounds.stop();
            AttackerSounds = null;
        }

        AttackerSounds = MediaPlayer.create(this, R.raw.runnybabbitsong);
        break;
        case 97:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }

            AttackerSounds = MediaPlayer.create(this, R.raw.zubgondraktersong);
            break;

        case 98:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 99:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 100:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 101:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 102:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 103:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 104:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 105:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 106:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 107:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 108:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 109:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 110:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 111:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 112:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 113:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 114:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 115:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }

            AttackerSounds = MediaPlayer.create(this, R.raw.beeurchinsong);
            break;
        case 116:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 117:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 118:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }

            AttackerSounds = MediaPlayer.create(this, R.raw.scorphibiansong);
            break;
        case 119:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 120:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 121:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 122:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 123:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 124:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }

            AttackerSounds = MediaPlayer.create(this, R.raw.zentapedesong);
            break;
        case 125:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 126:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;
        case 127:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;

        case 128:
            if (AttackerSounds != null) {
                AttackerSounds.stop();
                AttackerSounds = null;
            }break;

        }
        if (monster.Idnum > 129 || monster.Idnum < 0){


        }
        if (AttackerSounds != null) {
            AttackerSounds.setLooping(true); // boogaloo
            AttackerSounds.start();
        }else {
          //  AttackerSounds.setLooping(false); // boogaloo
          //  AttackerSounds.stop();
        }

        float f = (float)((float)((float)(monster.UniqueID%102) + 50)/100);
      //  f = (float) .3;


        if (AttackerSounds != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                AttackerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
            }
        }
    }

    public void Swap() throws CloneNotSupportedException {
       // Intent intentGumble = new Intent(this, TeamSwap.class);

        if(swapcode == 0) {
            int RequestCode = 12345;
            swapcode = 1;

            Context ProtomonContext = getApplicationContext();

            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
            SharedPreferences.Editor editor = prefs.edit();

            int countthroughmonsters = 0;
            String DustMe = "%s";
            // String BustMe = String.format("Monster"+String.format(DustMe, countthroughmonsters));


            monst Passablemonster = new monst(monstlist(playerid)).clone();
            Intent intentGumble = new Intent();
            Bundle b = new Bundle();
            b.putInt("Storage", MonsterStorageCounter);

            for (int yy = 0; yy < PlayerMonsterStorage.length; yy++) {
                if (PlayerMonsterStorage[yy] == playermonster) {
                    b.putInt("Cast", yy);
                }
            }
            while (countthroughmonsters < MonsterStorageCounter) {


                String BustMe = String.format("Monster" + String.format(DustMe, countthroughmonsters));
                b.putParcelable(BustMe, PlayerMonsterStorage[countthroughmonsters]);


                Gson gson = new Gson();
                String json = gson.toJson(PlayerMonsterStorage[countthroughmonsters]);
                editor.putString(BustMe, json);
                editor.apply();

                countthroughmonsters++;
            }


            intentGumble.putExtra("Dictionary", dictionaryOfMonsters);

            //    intentGumble.putExtra("Cast", dictionaryOfMonsters);


            //   b.putParcelable("Monster", Passablemonster);


            intentGumble.putExtras(b);
            intentGumble.setClass(this, TeamSwap.class);


            startActivityForResult(intentGumble, RequestCode);

            //  Intent go = new Intent(this, GarlitosLab.class);
            //   startActivity(go);

        }
    }
    public void RIVALMAKER(){


        Gson gson = new Gson();
        Context ProtomonContext = getApplicationContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
        SharedPreferences.Editor editor = prefs.edit();
        String json = prefs.getString("WorkingMonster", "");
        if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
            Custom = gson.fromJson(json, (Type) protomon.monst.class);
        }


        if(attackermonster.Idnum == Custom.Idnum){
            try {
                MaxHealthAttacker = stats(monstlist((int)Custom.Idnum).clone().Health);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        if(playermonster.Idnum == Custom.Idnum){
            try {
                MaxHealthPlayer = stats(monstlist((int)Custom.Idnum).clone().Health);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        rivalNewnessCounter++;

        if (rivalNewnessCounter < 4){

            enemylayoutpage.setVisibility(View.VISIBLE);
            // CombatString = "";
            String bant = IDbox.getText().toString();
            //   if(!TextUtils.isEmpty(bant)) {
            //  attackerid = (int) Double.parseDouble(String.valueOf(IDbox.getText()));
            //  }else {
           // attackerid = 2;
             attackerid = new Random().nextInt(spawncap)+1;
            //  }

            // attackerid =  (attackerid%spawncap)+1;


            try {
                attackermonster = Cloner(monstlist((int)attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            attackermonster.UniqueID = UniqueIdentifier(0);

            MaxHealthAttacker = attackermonster.Health;

            attackermonster.Health = MaxHealthAttacker;


        }else {
            monsterLoop = (monsterLoop%rotationcap)+1;
            attackerid = monsterLoop;
            try {
                attackermonster = Cloner(monstlist((int)attackerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            attackermonster.UniqueID = UniqueIdentifier(0);
            MaxHealthAttacker = attackermonster.Health;

            attackermonster.Health = MaxHealthAttacker;
            rivalNewnessCounter = 0;
            enemylayoutpage.setVisibility(View.VISIBLE);
        }
        // playermonster.Health = MaxHealthPlayer;

        StringDisplayMethod();
     //   CombatString = String.format(CombatString+"\n");
LongView.setText(CombatString);

        ActionNum = 0;
        turncounter = 1;
        ImageChanger();
        RivalRevealer();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            attackersonglist(attackermonster);
        }

    }



    private void PlayerReflect(int passreflectplayer) {

        if(reflectTimerOnPlayer > 0){
            int reflecteddamahe = (int)(passreflectplayer * (reflectRatioPlayer/100));
            attackermonster.Health = attackermonster.Health - reflecteddamahe;
            playermonster.Health = playermonster.Health + reflecteddamahe;
        }
        if (reflectTimerOnPlayer == 0){
            reflectRatioPlayer = 0;

        }



    }

    private void AttackerReflect(int passreflectplayer) {

        if(reflectTimerOnAttacker > 0){
            int reflecteddamahe = (int)(passreflectplayer * (reflectRatioAttacker/100));
            playermonster.Health = playermonster.Health - reflecteddamahe;
            attackermonster.Health = attackermonster.Health + reflecteddamahe;
        }
        if (reflectTimerOnAttacker == 0){
            reflectRatioAttacker = 0;

        }


    }

    private int AttackerReflectReturn(int passreflectplayer) {
        int reflecteddamahe = 0;
        if (reflectRatioPlayer != 0) {
             reflecteddamahe = (int) (passreflectplayer * (reflectRatioPlayer/100));
            int howmuchisleft = passreflectplayer - reflecteddamahe;
        }
            return reflecteddamahe;
    }

    public void Storage() {
        Intent go = new Intent(this, StorageSwap.class);
        startActivity(go);
    }

    public void ChangePlaces() {
        double holdstat;
        holdermonstery = playermonster;
        playermonster = attackermonster;
        attackermonster = holdermonstery;


        ////valueswapperd(reflectRatioPlayer, reflectRatioAttacker);
        holdstat = reflectRatioPlayer;
        reflectRatioPlayer = reflectRatioAttacker;
        reflectRatioAttacker = holdstat;
        ////valueswapperd(reflectTimerOnAttacker, reflectTimerOnPlayer);
        holdstat = reflectTimerOnAttacker;
        reflectTimerOnAttacker = reflectTimerOnPlayer;
        reflectTimerOnPlayer = (int) holdstat;
        ////valueswapperd(AttackerProtectStatsTimer, PlayerProtectStatsTimer);
        holdstat = AttackerProtectStatsTimer;
        AttackerProtectStatsTimer = PlayerProtectStatsTimer;
        PlayerProtectStatsTimer = (int) holdstat;
        ////valueswapperd(statblocktimerP, statblocktimerA);
        holdstat = statblocktimerP;
        statblocktimerP = statblocktimerA;
        statblocktimerA = (int) holdstat;
        ////valueswapperd(AttackerStatDelayTimer, PlayerStatDelayTimer);
        holdstat = AttackerStatDelayTimer;
        AttackerStatDelayTimer = PlayerStatDelayTimer;
        PlayerStatDelayTimer = (int) holdstat;
        ////valueswapperd(healblockmagnitudeA, healblockmagnitudeP);
        holdstat = healblockmagnitudeA;
        healblockmagnitudeA = healblockmagnitudeP;
        healblockmagnitudeP = (int) holdstat;
        ////valueswapperd(healblocktgimerA, healblocktgimerP);
        holdstat = healblocktgimerA;
        healblocktgimerA = healblocktgimerP;
        healblocktgimerP = (int) holdstat;
        ////valueswapperd(elongatedhealwoundtimerA, elongatedhealwoundtimerP);
        holdstat = elongatedhealwoundtimerA;
        elongatedhealwoundtimerA = elongatedhealwoundtimerP;
        elongatedhealwoundtimerP = (int) holdstat;
        ////valueswapperd(elongatedwoundtimerA, elongatedwoundtimerP);
        holdstat = elongatedwoundtimerA;
        elongatedwoundtimerA = elongatedwoundtimerP;
        elongatedwoundtimerP = (int) holdstat;
        ////valueswapperd(delayedblastpowerA, delayedblastpowerP);
        holdstat = delayedblastpowerA;
        delayedblastpowerA = delayedblastpowerP;
        delayedblastpowerP = (int) holdstat;
        ////valueswapperd(delayedblasttimerP, delayedblasttimerA);
        holdstat = delayedblasttimerP;
        delayedblasttimerP = delayedblasttimerA;
        delayedblasttimerA = (int) holdstat;
        ////valueswapperd(elongatedhealwoundpowerA, elongatedhealwoundpowerP);
        holdstat = elongatedhealwoundpowerA;
        elongatedhealwoundpowerA = elongatedhealwoundpowerP;
        elongatedhealwoundpowerP = (int) holdstat;
        ////valueswapperd(elongatedwoundpowerA, elongatedwoundpowerP);
        holdstat = elongatedwoundpowerA;
        elongatedwoundpowerA = elongatedwoundpowerP;
        elongatedwoundpowerP = (int) holdstat;
        ////valueswapperd(slowdrainA, slowdrainP);
        holdstat = slowdrainA;
        slowdrainA = slowdrainP;
        slowdrainP = (int) holdstat;
        ////valueswapperd(elongatedglugpowerP, elongatedglugpowerA);
        holdstat = elongatedglugpowerP;
        elongatedglugpowerP = elongatedglugpowerA;
        elongatedglugpowerA = (int) holdstat;
        ////valueswapperd(elongatedglugtimerP, elongatedglugtimerA);
        holdstat = elongatedglugtimerP;
        elongatedglugtimerP = elongatedglugtimerA;
        elongatedglugtimerA = (int) holdstat;
        ////valueswapperd(elongatedhealpowerP, elongatedhealpowerA);
        holdstat = elongatedhealpowerP;
        elongatedhealpowerP = elongatedhealpowerA;
        elongatedhealpowerA = (int) holdstat;
        ////valueswapperd(elongatedhealtimerP, elongatedhealtimerA);
        holdstat = elongatedhealtimerP;
        elongatedhealtimerP = elongatedhealtimerA;
        elongatedhealtimerA = (int) holdstat;
        ////valueswapperd(delayedhealpowerA, delayedhealpowerP);
        holdstat = delayedhealpowerA;
        delayedhealpowerA = delayedhealpowerP;
        delayedhealpowerP = (int) holdstat;
        ////valueswapperd(delayedhealtimerP, delayedhealtimerA);
        holdstat = delayedhealtimerPsnow;
        delayedhealtimerPsnow = delayedhealtimerAsnow;
        delayedhealtimerAsnow = (int) holdstat;
        ////valueswapperd(delayedhealtimerP, delayedhealtimerA);
        holdstat = delayedhealpowerAsnow;
        delayedhealpowerAsnow = delayedhealpowerPsnow;
        delayedhealpowerPsnow = (int) holdstat;
        ////valueswapperd(delayedhealtimerP, delayedhealtimerA);
        holdstat = delayedhealtimerP;
        delayedhealtimerP = delayedhealtimerA;
        delayedhealtimerA = (int) holdstat;
        ////valueswapperd(grouphealpowerA, grouphealpowerP);
        holdstat = grouphealpowerA;
        grouphealpowerA = grouphealpowerP;
        grouphealpowerP = (int) holdstat;
        ////valueswapperd(grouphealtimerA, grouphealtimerP);
        holdstat = grouphealtimerP;
        grouphealtimerP = grouphealtimerA;
        grouphealtimerA = (int) holdstat;
        ////valueswapperd(AttackerDelayedStatMove, PlayerDelayedStatMove);
        holdstat = AttackerDelayedStatMove;
        AttackerDelayedStatMove = PlayerDelayedStatMove;
        PlayerDelayedStatMove = (int) holdstat;
        holdstat = MaxHealthPlayer;
        MaxHealthPlayer = MaxHealthAttacker;
        MaxHealthAttacker = (int) holdstat;
        holdstat = scorekeepera;
        scorekeepera = scorekeeperp;
        scorekeeperp = (int) holdstat;
        holdstat = attackwins;
        attackwins = playwins;
        playwins = (int) holdstat;
    }


    public void valueswapper(int statone, int stattwo) {
        int holdstat;
        holdstat = statone;
        statone = stattwo;
        stattwo = holdstat;
    }
    public void valueswapperd(double statone, double stattwo) {
        double holdstat;
        holdstat = statone;
        statone = stattwo;
        stattwo = holdstat;
    }
    public void dispall() {
        Intent go = new Intent(this, Displayall.class);
        startActivity(go);
    }

    public int convertToDp(int input) { // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density; // Convert the dps to pixels, based on density scale
        return (int) (input * scale + 0.5f);
    }
    public void TellFights() throws CloneNotSupportedException {
        holdermonster = playermonster.clone();
        holdermonsterx = attackermonster.clone();
        atcount = 0;
        hecount = 0;
        stcount = 0;
        spcount = 0;

        int at = atcount;
        int he = hecount;
        int st = stcount;
        int sp = spcount;
        CombatString = "";
        GombatString = "";
        String displaystring = "%s";
        String displaystringH = "%s/%s";
        int runtoonehundred = 0;
        IDstorage = playerid;
        int AIDstorage = attackerid;

        int a = attackermonster.Moveslotattack;
        int b = attackermonster.Moveslotheal;
        int c = attackermonster.Moveslotspeed;
        int d = attackermonster.Moveslotdefense;
     //   playermonster = holdermonster;
 /*
            for (attackerid = 1; attackerid < rotationcap; attackerid++){

                try {
                    attackermonster = Cloner(monstlist((int) attackerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }attackermonster.UniqueID = UniqueIdentifier(0);
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
               */
        for (playerid = 1; playerid < rotationcap; playerid++) {

            try {
                 Cloner(monstlist((int) playerid));
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            try {
                refresh();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }


            for (runtoonehundred = 0; runtoonehundred < 33; runtoonehundred++) {
                try {
                    Cloner(monstlist((int) playerid));
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            if(attackermonster.UniqueID != holdermonsterx.UniqueID){
                ChangePlaces();
            }
            if(attackermonster.Idnum == 92){
                attackermonster = Cloner(monstlist((int)Memeek.Idnum));
                attackermonster.Moveslotattack = a;
                attackermonster.Moveslotheal = b;
                attackermonster.Moveslotspeed = c;
                attackermonster.Moveslotdefense = d;
                attackermonster.UniqueID = holdermonsterx.UniqueID;
            }
                for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0) && turncounter < 50 ; turncounter++) {
                    if (playermonster.Speed <= attackermonster.Speed){


                    }else {
                        checkC1 = 1;
                    }
                    if (checkC1 == 1 && playermonster.Speed <= attackermonster.Speed){
                        checkC2 = 1;
                        checkC1 = 0;
                    }
                    if (playermonster.Speed <= attackermonster.Speed) {

                        if ((turncounter % 2) == 1) {
                            RoboBrainMethodTell(Turn);
                        } else{
                            ChangePlaces();
                             at = atcount;
                             he = hecount;
                             st = stcount;
                             sp = spcount;
                            RoboBrainMethodTell(Turn);
                            atcount = at;
                            hecount = he;
                            stcount = st;
                            spcount = sp;
                            ChangePlaces();
                    }
                    }else {
                        if ((turncounter % 2) == 0) {
                            RoboBrainMethodTell(Turn);
                        } else{
                            ChangePlaces();
                            at = atcount;
                            he = hecount;
                            st = stcount;
                            sp = spcount;
                            RoboBrainMethodTell(Turn);
                            atcount = at;
                            hecount = he;
                            stcount = st;
                            spcount = sp;;
                            ChangePlaces();
                        }
                    }




                    /*

if (playermonster.Speed <= attackermonster.Speed){
    checkC1 = 1;

}
if (checkC1 == 1 && playermonster.Speed > attackermonster.Speed){
    checkC2 = 1;
    checkC1 = 0;
}


                    if (playermonster.Speed <= attackermonster.Speed) {

                        if (checkA2 == 1){
                            checkB2 = 0;
                        }else {
                            checkB2 = 1;
                        }
                        checkA2 = 0;
                        checkA1 = 1;
                        if ((turncounter % 2) == 0) {

                            whosturnisitanyway = 1;
                            Damage = 0;
                            String Catchsopmekindofattack = " Attacks ";
                                    /*
                                    switch (playermonster.Moveslotdefense){

                                        case 0:
                                            Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Attacks ";
                                            break;
                                        case 1:
                                            Damage = ((playermonster.Attack / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Advances ";
                                            break;
                                        case 2:
                                            Damage = ((playermonster.Attack / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Overpowers ";
                                            break;
                                        case 3:
                                            Damage = ((playermonster.Speed / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Punctures ";
                                            break;
                                        case 4:
                                            Damage = ((playermonster.Speed / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Races ";
                                            break;
                                        case 5:
                                            Damage = ((playermonster.Speed / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Exhausts ";
                                            break;
                                        case 6:
                                            Damage = ((playermonster.Defense / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Collides ";
                                            break;
                                        case 7:
                                            Damage = ((playermonster.Defense / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Obstructs ";
                                            break;
                                        case 8:
                                            Damage = ((playermonster.Defense / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Beams Block ";
                                            break;
                                    }

                                    copyPlayermoveforattacker = 1;
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                    AttackerReflect((int)Damage);
*//*


                                    if (checkC2 != 1) {
                                        ChangePlaces();
                                    }
                            RoboBrainMethodTell(Turn);
                                    /*
                                    DelayedStatusMethod();

                                    TurnDamageResolution();

                                    HealthChecker();

                                    StatAbuseCurb(playermonster);
                                    StatAbuseCurb(attackermonster);*/

                 /*       } else {
                            tangiblecheck = 1;
                            somebodystopme = 0;
                            whosturnisitanyway = 0;
                            RoboBrainMethodTell(Turn);  // switch for the next 3 lines
/*
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                    DelayedStatusMethod();

                                    TurnDamageResolution();

                                    HealthChecker();

                                    StatAbuseCurb(playermonster);
                                    StatAbuseCurb(attackermonster);
                                    *//*
                        }
                    } else {

                        if (checkA1 == 1){
                            checkB1 = 0;
                        }else {
                            checkB1 = 1;
                        }
                        checkA2 = 1;
                        checkA1 = 0;
                        if ((turncounter % 2) == 0) {
                            tangiblecheck = 1;
                            somebodystopme = 0;
                            whosturnisitanyway = 0;
                            RoboBrainMethodTell(Turn); // switch for the next 3 lines
/*
                                    Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
                                    Damage = Math.round(Damage);
                                    playermonster.Health = playermonster.Health - Damage;
                                    DelayedStatusMethod();

                                    TurnDamageResolution();

                                    HealthChecker();

                                    StatAbuseCurb(playermonster);
                                    StatAbuseCurb(attackermonster);
                                    *//*
                        } else {/*
                            whosturnisitanyway = 1;
                            Damage = 0;
                            String Catchsopmekindofattack = " Attacks "; */
                                    /*
                                    switch (playermonster.Moveslotdefense){

                                        case 0:
                                            Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Attacks ";
                                            break;
                                        case 1:
                                            Damage = ((playermonster.Attack / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Advances ";
                                            break;
                                        case 2:
                                            Damage = ((playermonster.Attack / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Overpowers ";
                                            break;
                                        case 3:
                                            Damage = ((playermonster.Speed / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Punctures ";
                                            break;
                                        case 4:
                                            Damage = ((playermonster.Speed / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Races ";
                                            break;
                                        case 5:
                                            Damage = ((playermonster.Speed / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Exhausts ";
                                            break;
                                        case 6:
                                            Damage = ((playermonster.Defense / attackermonster.Defense) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Collides ";
                                            break;
                                        case 7:
                                            Damage = ((playermonster.Defense / attackermonster.Speed) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Obstructs ";
                                            break;
                                        case 8:
                                            Damage = ((playermonster.Defense / attackermonster.Attack) * (new Random().nextInt(21) + 50));
                                            Catchsopmekindofattack = " Beams Block ";
                                            break;
                                    }

                                    copyPlayermoveforattacker = 1;
                                    Damage = Math.round(Damage);
                                    attackermonster.Health = attackermonster.Health - Damage;
                                    AttackerReflect((int)Damage);

                                    */
/*
                            if (checkC2 != 1) {
                                ChangePlaces();
                            }
                            RoboBrainMethodTell(Turn);
*/

                                    /*
                                    DelayedStatusMethod();

                                    TurnDamageResolution();

                                    HealthChecker();

                                    StatAbuseCurb(playermonster);
                                    StatAbuseCurb(attackermonster);*/


                    if (playermonster.Health <= 0) {
                        attackwins++;
                    }
                    if (attackermonster.Health <= 0) {
                        playwins++;
                    }

                }
                ClearStatChangesTell(attackermonster);
                ClearStatChangesTell(playermonster);
                if(attackermonster.UniqueID != holdermonsterx.UniqueID){
                    ChangePlaces();
                }
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                turncounter = 1;
                TimerCancelMethodTell();
            }
            if (playwins > attackwins) {
                scorekeeperp++;
            }
            if (playwins < attackwins) {
                scorekeepera++;
            }
            GombatString = (GombatString + names(playerid) + " " + String.format(displaystring, attackwins)+ "W/" + String.format(displaystring, playwins)+"L" + "\n");

            attackwins = 0;
            playwins = 0;
        }


        //   CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

        CombatString = CombatString + String.format("Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " + String.format(displaystring, scorekeepera) + "\n");

        String NewString = String.format("Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " + String.format(displaystring, scorekeepera) + "\n");

        ActionNum = 0;
        turncounter = 1;
        attackwins = 0;
        playwins = 0;
        scorekeeperp = 0;
        scorekeepera = 0;
        //}

        playerid = IDstorage;
        attackerid = AIDstorage;
        // LongView.setText(CombatString + GombatString);

        GombatString = GombatString + ("At " + String.format(displaystring, atcount) + ", He " + String.format(displaystring, hecount) + ", St " + String.format(displaystring, stcount) + ", Sp " + String.format(displaystring, spcount));
        LongView.setText(NewString + GombatString);

        CombatString = "";

      //  try {
            playermonster = holdermonster.clone(); //Cloner(monstlist((int) playerid));
       // } catch (CloneNotSupportedException e) {
       //     e.printStackTrace();
      ///  }
        //    try {
        //         attackermonster = Cloner(monstlist((int) attackerid));
        //      } catch (CloneNotSupportedException e) {
        //          e.printStackTrace();
        //      }attackermonster.UniqueID = UniqueIdentifier(0);
        try {
            refresh();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ImageChanger();

        attackermonster.Moveslotattack = a;
        attackermonster.Moveslotheal = b;
        attackermonster.Moveslotspeed = c;
        attackermonster.Moveslotdefense = d;

        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;

        attackermonster.Health = MaxHealthAttacker;
        playermonster.Health = MaxHealthPlayer;

        StringDisplayMethod();
        RivalRevealer();

        HealthBarUpdate();

    }
public void TellFightsSolo() throws CloneNotSupportedException {
        holdermonster = playermonster.clone();
        holdermonsterx = attackermonster.clone();
        atcount = 0;
        hecount = 0;
        stcount = 0;
        spcount = 0;
        atcountx = 0;
        hecountx = 0;
        stcountx = 0;
        spcountx = 0;

        int at = atcount;
        int he = hecount;
        int st = stcount;
        int sp = spcount;
        int atx = atcountx;
        int hex = hecountx;
        int stx = stcountx;
        int spx = spcountx;
        CombatString = "";
        GombatString = "";
        String displaystring = "%s";
        String displaystringH = "%s/%s";
        int runtoonehundred = 0;
        IDstorage = playerid;
        int AIDstorage = attackerid;

        int a = attackermonster.Moveslotattack;
        int b = attackermonster.Moveslotheal;
        int c = attackermonster.Moveslotspeed;
        int d = attackermonster.Moveslotdefense;

            try {
                refresh();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }


            for (runtoonehundred = 0; runtoonehundred < 501; runtoonehundred++) {
            if(attackermonster.UniqueID != holdermonsterx.UniqueID){
                ChangePlaces();
            }
            if(attackermonster.Idnum == 92){
                attackermonster = Cloner(monstlist((int)Memeek.Idnum));
                attackermonster.Moveslotattack = a;
                attackermonster.Moveslotheal = b;
                attackermonster.Moveslotspeed = c;
                attackermonster.Moveslotdefense = d;
                attackermonster.UniqueID = holdermonsterx.UniqueID;
            }
                for (int dummy = -1; (playermonster.Health > 0 && attackermonster.Health > 0) && turncounter < 50 ; turncounter++) {
                    if (playermonster.Speed <= attackermonster.Speed){


                    }else {
                        checkC1 = 1;
                    }
                    if (checkC1 == 1 && playermonster.Speed <= attackermonster.Speed){
                        checkC2 = 1;
                        checkC1 = 0;
                    }
                    if (playermonster.Speed <= attackermonster.Speed) {

                        if ((turncounter % 2) == 1) {
                            atx = atcountx;
                            hex = hecountx;
                            stx = stcountx;
                            spx = spcountx;
                            RoboBrainMethodTell(Turn);
                            atcountx = atx;
                            hecountx = hex;
                            stcountx = stx;
                            spcountx = spx;
                        } else{
                            ChangePlaces();
                             at = atcount;
                             he = hecount;
                             st = stcount;
                             sp = spcount;
                            RoboBrainMethodTell(Turn);
                            atcount = at;
                            hecount = he;
                            stcount = st;
                            spcount = sp;
                            ChangePlaces();
                    }
                    }else {
                        if ((turncounter % 2) == 0) {
                            atx = atcountx;
                            hex = hecountx;
                            stx = stcountx;
                            spx = spcountx;
                            RoboBrainMethodTell(Turn);
                            atcountx = atx;
                            hecountx = hex;
                            stcountx = stx;
                            spcountx = spx;
                        } else{
                            ChangePlaces();
                            at = atcount;
                            he = hecount;
                            st = stcount;
                            sp = spcount;
                            RoboBrainMethodTell(Turn);
                            atcount = at;
                            hecount = he;
                            stcount = st;
                            spcount = sp;;
                            ChangePlaces();
                        }
                    }



                    if (playermonster.Health <= 0) {
                        attackwins++;
                    }
                    if (attackermonster.Health <= 0) {
                        playwins++;
                    }

                }
                ClearStatChangesTell(attackermonster);
                ClearStatChangesTell(playermonster);
                if(attackermonster.UniqueID != holdermonsterx.UniqueID){
                    ChangePlaces();
                }
                try {
                    refresh();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                turncounter = 1;
                TimerCancelMethodTell();
            }
            if (playwins > attackwins) {
                scorekeeperp++;
            }
            if (playwins < attackwins) {
                scorekeepera++;
            }
            GombatString = (GombatString + names(playermonster.Idnum) + " " + String.format(displaystring, attackwins)+ "W/" + String.format(displaystring, playwins)+"L" + "\n");

            attackwins = 0;
            playwins = 0;



        //   CombatString = String.format( names(playermonster.Idnum) + " " + String.format(displaystring, playwins) + " " + "Enemy " + names(attackermonster.Idnum) + " " +String.format(displaystring, attackwins));

        CombatString = CombatString + String.format("Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " + String.format(displaystring, scorekeepera) + "\n");

        String NewString = String.format("Everyone else" + " " + String.format(displaystring, scorekeeperp) + " " + "Enemy " + names(attackermonster.Idnum) + " " + String.format(displaystring, scorekeepera) + "\n");

        ActionNum = 0;
        turncounter = 1;
        attackwins = 0;
        playwins = 0;
        scorekeeperp = 0;
        scorekeepera = 0;
        //}

        playerid = IDstorage;
        attackerid = AIDstorage;
        // LongView.setText(CombatString + GombatString);

        GombatString = GombatString + ("Attacker At: " + String.format(displaystring, atcount) + ", He " + String.format(displaystring, hecount) + ", St " + String.format(displaystring, stcount) + ", Sp " + String.format(displaystring, spcount));
        GombatString = GombatString + "\n";
        GombatString = GombatString + ("Player: At " + String.format(displaystring, atcountx) + ", He " + String.format(displaystring, hecountx) + ", St " + String.format(displaystring, stcountx) + ", Sp " + String.format(displaystring, spcountx));
        LongView.setText(NewString + GombatString);

        CombatString = "";

      //  try {
            playermonster = holdermonster.clone(); //Cloner(monstlist((int) playerid));
       // } catch (CloneNotSupportedException e) {
       //     e.printStackTrace();
      ///  }
        //    try {
        //         attackermonster = Cloner(monstlist((int) attackerid));
        //      } catch (CloneNotSupportedException e) {
        //          e.printStackTrace();
        //      }attackermonster.UniqueID = UniqueIdentifier(0);
        try {
            refresh();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ImageChanger();

        attackermonster.Moveslotattack = a;
        attackermonster.Moveslotheal = b;
        attackermonster.Moveslotspeed = c;
        attackermonster.Moveslotdefense = d;

        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;

        attackermonster.Health = MaxHealthAttacker;
        playermonster.Health = MaxHealthPlayer;

        StringDisplayMethod();
        RivalRevealer();

        HealthBarUpdate();

    }

    public int damagecalculationloop(int targetdefence, int attackerstrength){

        double ratio = (targetdefence/attackerstrength);
        double damage = (ratio*(new Random().nextInt(11)+55));
        return (int) damage;
    }

    public void refresh() throws CloneNotSupportedException {
        attackermonster.Health = Cloner(monstlist((int) attackerid)).Health;
        playermonster.Health = Cloner(monstlist((int) playerid)).Health;
        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;

        attackermonster.Health = MaxHealthAttacker;
        playermonster.Health = MaxHealthPlayer;
    }
 //  public void onBackPressed(){
//// makes thge game ignore backpresses, important for final version
 //   }
}