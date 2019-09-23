package ditzler.cole.stableapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Random;

public class GarlitosNotes extends AppCompatActivity {



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


    boolean[] dictionaryOfMonsters = new boolean[200];

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
    public double nhainhaisp = 52;
    public double nhainhaide = 51;
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
    public double jiyoude = 140;  //150
    public double jiyouhe = 141;  //151

    public double sparvaeid = 25;
    public double sparvaeat = 162;
    public double sparvaesp = 62;
    public double sparvaede = 110;
    public double sparvaehe = 91;

    public double vellupid = 26;
    public double vellupat = 59; // 60
    public double vellupsp = 110;
    public double vellupde = 271;
    public double velluphe = 59; // 54

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
    public double Ϫlitchat = 135;
    public double Ϫlitchsp = 74;
    public double Ϫlitchde = 135;
    public double Ϫlitchhe = 74;

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


    protomon.monst error = new protomon.monst(0, 51, 51, 51, 753, 0,0,0,0,0);

    protomon.monst Kunk = new protomon.monst(kunkid, kunksp, kunkat, kunkde, kunkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Djoper = new protomon.monst(djoperid, djopersp, djoperat, djoperde, djoperhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schorp = new protomon.monst(schorpid, schorpsp, schorpat, schorpde, schorphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zaume = new protomon.monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nhainhai = new protomon.monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kohboh = new protomon.monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Degeissdt = new protomon.monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Yuggle = new protomon.monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bongu = new protomon.monst(bonguid, bongusp, bonguat, bongude, bonguhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Giteriglia = new protomon.monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Cyosteroth = new protomon.monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nentopode = new protomon.monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Centiclak = new protomon.monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Uggnawb = new protomon.monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Grobhost = new protomon.monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Illelonab = new protomon.monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rongzeed = new protomon.monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blattle = new protomon.monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Swogharnler = new protomon.monst(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Adenolish = new protomon.monst(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Genaupresang = new protomon.monst(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    // monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
    protomon.monst Daahnida = new protomon.monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sorba = new protomon.monst(sorbaid, sorbasp, sorbaat, sorbade, sorbahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Jiyou = new protomon.monst(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sparvae = new protomon.monst(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Vellup = new protomon.monst(vellupid, vellupsp, vellupat, vellupde, velluphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bellaja = new protomon.monst(bellajaid, bellajasp, bellajaat, bellajade, bellajahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Levdzell = new protomon.monst(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rytegg = new protomon.monst(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Flashmer = new protomon.monst(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schmodozer = new protomon.monst(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Octgotot = new protomon.monst(octgototid, octgototsp, octgototat, octgototde, octgotothe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Triaural = new protomon.monst(triauralid, triauralsp, triauralat, triauralde, triauralhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Dicyto = new protomon.monst(dicytoid, dicytosp, dicytoat, dicytode, dicytohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Monopteryx = new protomon.monst(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elastocark = new protomon.monst(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toobapath = new protomon.monst(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Weeliosbop = new protomon.monst(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ihmpdrap = new protomon.monst(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Epibazang = new protomon.monst(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hemtan = new protomon.monst(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ogo = new protomon.monst(ogoid, ogosp, ogoat, ogode, ogohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Strachid = new protomon.monst(strachidid, strachidsp, strachidat, strachidde, strachidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toximastica = new protomon.monst(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Urcuria = new protomon.monst(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hyuntress = new protomon.monst(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mondosplak = new protomon.monst(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kaheksaguge = new protomon.monst(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sapiosuant = new protomon.monst(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Munegull = new protomon.monst(munegullid, munegullsp, munegullat, munegullde, munegullhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sudakleez = new protomon.monst(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Halocordate = new protomon.monst(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Fædendron = new protomon.monst(fædendronid, fædendronsp, fædendronat, fædendronde, fædendronhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Osteoplang = new protomon.monst(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Жrachnid = new protomon.monst(жrachnidid, жrachnidsp, жrachnidat, жrachnidde, жrachnidhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ϫlitch = new protomon.monst(Ϫlitchid, Ϫlitchsp, Ϫlitchat, Ϫlitchde, Ϫlitchhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst በ = new protomon.monst(በid, በsp, በat, በde, በhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mantidile = new protomon.monst(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nokoyl = new protomon.monst(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Яallod = new protomon.monst(яallodid, яallodsp, яallodat, яallodde, яallodhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Algaetizer = new protomon.monst(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kachort = new protomon.monst(kachortid, kachortsp, kachortat, kachortde, kachorthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Slamelion = new protomon.monst(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ayateda = new protomon.monst(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Wochem = new protomon.monst(wochemid, wochemsp, wochemat, wochemde, wochemhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ƕmun = new protomon.monst(Ƕmunid, Ƕmunsp, Ƕmunat, Ƕmunde, Ƕmunhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ψkobath = new protomon.monst(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gytanic = new protomon.monst(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst βeiß = new protomon.monst(βeißid, βeißsp, βeißat, βeißde, βeißhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gungholio = new protomon.monst(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Honigkönig = new protomon.monst(honigkönigid, honigkönigsp, honigkönigat, honigkönigde, honigkönighe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kungulp = new protomon.monst(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Σatinella = new protomon.monst(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elocurl = new protomon.monst(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Takobie = new protomon.monst(takobieid, takobiesp, takobieat, takobiede, takobiehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ōbchovy = new protomon.monst(ōbchovyid, ōbchovysp, ōbchovyat, ōbchovyde, ōbchovyhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nimnamnom = new protomon.monst(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Tutewtoo = new protomon.monst(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blanqast = new protomon.monst(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Indeo = new protomon.monst(indeoid, indeosp, indeoat, indeode, indeohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Deblobbio = new protomon.monst(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Knightstacean = new protomon.monst(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Prostrax = new protomon.monst(prostraxid, prostraxsp, prostraxat, prostraxde, prostraxhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Haptozahen = new protomon.monst(haptozahenid, haptozahensp, haptozahenat, haptozahende, haptozahenhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Minkohabod = new protomon.monst(minkohabodid, minkohabodsp, minkohabodat, minkohabodde, minkohabodhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zeen = new protomon.monst(zeenid, zeensp, zeenat, zeende, zeenhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Tacroach = new protomon.monst(tacroachid, tacroachsp, tacroachat, tacroachde, tacroachhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Manterfly = new protomon.monst(manterflyid, manterflysp, manterflyat, manterflyde, manterflyhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Beary = new protomon.monst(bearyid, bearysp, bearyat, bearyde, bearyhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sluggernaut = new protomon.monst(sluggernautid, sluggernautsp, sluggernautat, sluggernautde, sluggernauthe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Custom = new protomon.monst(91, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Memeek = new protomon.monst(memeekid, memeeksp, memeekat, memeekde, memeekhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Doughgnat = new protomon.monst(doughgnatid, doughgnatsp, doughgnatat, doughgnatde, doughgnathe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rattic = new protomon.monst(ratticid, ratticsp, ratticat, ratticde, rattiche, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Missileaneous = new protomon.monst(missileaneousid, missileaneoussp, missileaneousat, missileaneousde, missileaneoushe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Runnybabbit = new protomon.monst(runnybabbitid, runnybabbitsp, runnybabbitat, runnybabbitde, runnybabbithe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zubgondrakter = new protomon.monst(zubgondrakterid, zubgondraktersp, zubgondrakterat, zubgondrakterde, zubgondrakterhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Whumpuhmp = new protomon.monst(whumpuhmpid, whumpuhmpsp, whumpuhmpat, whumpuhmpde, whumpuhmphe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mangoon = new protomon.monst(mangoonid, mangoonsp, mangoonat, mangoonde, mangoonhe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
protomon.monst Scarbeque = new protomon.monst(scarbequeid, scarbequesp, scarbequeat, scarbequede, scarbequehe, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
protomon.monst Fwuffynumpkins = new protomon.monst(fwuffynumpkinsid, fwuffynumpkinssp, fwuffynumpkinsat, fwuffynumpkinsde, fwuffynumpkinshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Dothog = new protomon.monst(dothogid, dothogsp, dothogat, dothogde, dothoghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Reefcake = new protomon.monst(reefcakeid, reefcakesp, reefcakeat, reefcakede, reefcakehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Cheetza = new protomon.monst(cheetzaid, cheetzasp, cheetzaat, cheetzade, cheetzahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sortsand = new protomon.monst(sortsandid, sortsandsp, sortsandat, sortsandde, sortsandhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Chilldebeest = new protomon.monst(chilldebeestid, chilldebeestsp, chilldebeestat, chilldebeestde, chilldebeesthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Communigator = new protomon.monst(communigatorid, communigatorsp, communigatorat, communigatorde, communigatorhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bossmoss = new protomon.monst(mossbossid, mossbosssp, mossbossat, mossbossde, mossbosshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Vamprey = new protomon.monst(vampreyid, vampreysp, vampreyat, vampreyde, vampreyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Parafoxical = new protomon.monst(parafoxid, parafoxsp, parafoxat, parafoxde, parafoxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rhischlosserous = new protomon.monst(rhischlosserousid, rhischlosseroussp, rhischlosserousat, rhischlosserousde, rhischlosseroushe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hykeyna = new protomon.monst(hykeynaid, hykeynasp, hykeynaat, hykeynade, hykeynahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Tafantula = new protomon.monst(tafantulaid, tafantulasp, tafantulaat, tafantulade, tafantulahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Farmot = new protomon.monst(farmotid, farmotsp, farmotat, farmotde, farmothe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Beeurchin = new protomon.monst(beeurchinid, beeurchinsp, beeurchinat, beeurchinde, beeurchinhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Flysoup = new protomon.monst(flyinsoupid, flyinsoupsp, flyinsoupat, flyinsoupde, flyinsouphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Meloncollie = new protomon.monst(meloncollieid, meloncolliesp, meloncollieat, meloncolliede, meloncolliehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Scorphibian = new protomon.monst(scorphibianid, scorphibiansp, scorphibianat, scorphibiande, scorphibianhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Geliphant = new protomon.monst(geliphantid, geliphantsp, geliphantat, geliphantde, geliphanthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Chimpansy = new protomon.monst(chimpansyid, chimpansysp, chimpansyat, chimpansyde, chimpansyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Xaltoxis = new protomon.monst(xaltoxisid, xaltoxissp, xaltoxisat, xaltoxisde, xaltoxishe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));
    protomon.monst Avokaboom = new protomon.monst(avokaboomid, avokaboomsp, avokaboomat, avokaboomde, avokaboomhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0),HealMoves(0), UniqueIdentifier(0));





    int UniqueID = new Random().nextInt(100000000);;
    ImageView Mon;
    TextView Info, Infox;
    Button Rotate, Rotateb;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.garlitos_notes_activity);


        Info = (TextView) findViewById(R.id.PrintOut);
        Infox = (TextView) findViewById(R.id.PrintOutx);
        Mon = (ImageView) findViewById(R.id.MonsterDisplay);
        Book = (ImageView) findViewById(R.id.Book);
        Rotate = (Button) findViewById(R.id.Page);
        Rotateb = (Button) findViewById(R.id.Pageb);
        Recorder = (ImageButton) findViewById(R.id.song);
        Recorder.setImageResource(R.drawable.recorderx);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/wf.ttf");
        Info.setTypeface(typeface);
        Infox.setTypeface(typeface);

        int bee = 0;

        Book.setImageResource(R.drawable.bookclosed);



        Context ProtomonContext = getApplicationContext();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
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

        countofmonsters();

        Recorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  holdme = (holdme+1); //%DeckStorage.length;




                    songlist((int) monstlist(DeckStorage[holdme]).Idnum);

                    String Information = String.format(names(DeckStorage[holdme]) + ": " + dexlist(DeckStorage[holdme]));


                    String stats = String.format("Health: "+ inttostring((int)monstlist(DeckStorage[holdme]).Health)) + "\n\n\n" +"Defense: "+ inttostring((int)monstlist(DeckStorage[holdme]).Defense)+ "\n\n\n" + "Attack: "+ inttostring((int)monstlist(DeckStorage[holdme]).Attack) + "\n\n\n" +"Speed: "+ inttostring((int)monstlist(DeckStorage[holdme]).Speed);
                    String Infocont = String.format("\n\n\n\n" + dexlistcont(DeckStorage[holdme]));



                if(UniqueID < 50000000) {
                    Info.setText(Information);
                    Infox.setText(stats + Infocont);
                }else {
                    Info.setText("");
                    Infox.setText("");
                }


            }
        });

        Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UniqueID = new Random().nextInt(100000000);;
                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                holdme = (holdme+1); //%DeckStorage.length;
                MonsterImageChangerPlayer((int)monstlist(DeckStorage[holdme]).Idnum);

                String Information = String.format(names(DeckStorage[holdme]) + ": " + dexlist(DeckStorage[holdme]));

                String stats = String.format("Health: "+ inttostring((int)monstlist(DeckStorage[holdme]).Health)) + "\n\n\n" +"Defense: "+ inttostring((int)monstlist(DeckStorage[holdme]).Defense)+ "\n\n\n" + "Attack: "+ inttostring((int)monstlist(DeckStorage[holdme]).Attack) + "\n\n\n" +"Speed: "+ inttostring((int)monstlist(DeckStorage[holdme]).Speed);
                String Infocont = String.format("\n\n\n\n" + dexlistcont(DeckStorage[holdme]));




                if(UniqueID < 50000000) {
                    Info.setText(Information);
                    Infox.setText(stats + Infocont);
                }else {
                    Info.setText("");
                    Infox.setText("");
                }

                if(holdme == 0){
                   Mon.setVisibility(View.INVISIBLE);
                   Info.setVisibility(View.INVISIBLE);
                   Infox.setVisibility(View.INVISIBLE);
                   Book.setImageResource(R.drawable.bookclosed);
                }else {

                    Mon.setVisibility(View.VISIBLE);
                    Info.setVisibility(View.VISIBLE);
                    Infox.setVisibility(View.VISIBLE);
                    Book.setImageResource(R.drawable.book);
                }
            }
        });
        Rotateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UniqueID = new Random().nextInt(100000000);;


                if (PlayerSounds != null) {
                    PlayerSounds.stop();
                    PlayerSounds = null;
                }
                holdme = (holdme-1); //%DeckStorage.length;
if(holdme < 0 ) {
    holdme = 0;
}
                MonsterImageChangerPlayer((int)monstlist(DeckStorage[holdme]).Idnum);

                String Information = String.format(names(DeckStorage[holdme]) + ": " + dexlist(DeckStorage[holdme]));

                String stats = String.format("Health: "+ inttostring((int)monstlist(DeckStorage[holdme]).Health)) + "\n\n\n" +"Defense: "+ inttostring((int)monstlist(DeckStorage[holdme]).Defense)+ "\n\n\n" + "Attack: "+ inttostring((int)monstlist(DeckStorage[holdme]).Attack) + "\n\n\n" +"Speed: "+ inttostring((int)monstlist(DeckStorage[holdme]).Speed);
                String Infocont = String.format("\n\n\n\n" + dexlistcont(DeckStorage[holdme]));


                if(UniqueID < 50000000) {
                    Info.setText(Information);
                    Infox.setText(stats + Infocont);
                }else {
                    Info.setText("");
                    Infox.setText("");
                }
                if(holdme == 0){
                    Mon.setVisibility(View.INVISIBLE);
                    Info.setVisibility(View.INVISIBLE);
                    Infox.setVisibility(View.INVISIBLE);
                    Book.setImageResource(R.drawable.bookclosed);
                }else {

                    Mon.setVisibility(View.VISIBLE);
                    Info.setVisibility(View.VISIBLE);
                    Infox.setVisibility(View.VISIBLE);
                    Book.setImageResource(R.drawable.book);
                }
            }
        });


    }
    public void countofmonsters () {

        for (int l = 0; l<123; l++) {
            dictionaryOfMonsters[l] = true;
        }

        for (int i = 0; i < 123; i++) {
            if (dictionaryOfMonsters[i]) {
                DeckStorage[chi] = i; // (int)monstlist(i).Idnum;
                chi++;
            }

        }


    }
    public String inttostring (int inter) {
        String of = "%s";
        of = String.format(of, (inter+50));
        return of;
    }
    public String dexlist (int tester) {


        String returnx ="";
        switch (tester) {
            case 0:
                returnx = "DATA UNAVALIABLE";
                break;
            case 1:
                returnx = "Hunting with its long tongues it is able to support its slow metabolism. When threatened it springs high into the air and far away.";
                break;
            case 2:
                returnx = "It has a green eye that sees the future and a red eye that sees the past. It is unknown how it reacts in real time to stimulus.";
                break;
            case 3:
                returnx= "Prying open shells and spearing the creatures inside for nourishment is Djoper's specialty.";
                break;
            case 4:
                returnx= "A highly aerodynamic creature, however it has weak stumpy legs and is unable to run very quickly.";
                break;
            case 5:
                returnx ="An arboreal creature that hangs from its long curved claws for days at a time. It is able to swing between trees and rarely comes down.";
                break;
            case 6:
                returnx ="A parasitic symbiosis, the purple growths of Nhainhai are a distinct species from the ambulatory yellow creature that carries them.";
                break;
            case 7:
                returnx ="A truly passive creature that seeks to bring no harm, but it can easily dismember any adversary if threatened.";
                break;
        }

        return returnx;
    }
 public String dexlistcont (int tester) {


        String returnx ="";
        switch (tester) {
            case 0:
                returnx = "DATA UNAVALIABLE";
                break;
            case 1:
                returnx = "It has rough thick skin, but it has poor regeneration, when injured it will take a long time to heal.";
                break;
            case 2:
                returnx = "The body of Kohboh has no inertia, but does not gain momentum either. Where it is moved it stays until moved again.";
                break;
            case 3:
                returnx= "Djoper is able retract everything but its eyes and its spring-foot into its shell.";
                break;
            case 4:
                returnx= "The blade on its head is used as a means of attack.";
                break;
            case 5:
                returnx = "Zaume is known for its territorial coloration.";
                break;
            case 6:
                returnx = "A punching-bag of sorts. It is able to sustain significant damage before yielding defeat.";
                break;
            case 7:
                returnx = "Most of the time, Degeissdt is found sapping nutrients from trees or the soil, but is also able to use animals and animaloids.";
                break;
        }

        return returnx;
    }



    public protomon.monst monstlist(int idnumber){



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
        }
        return error;
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
                return "Suppress"; // all stat 5% drop with damage based on stats/stats
        }
        return "SpecialError";
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

    public void MonsterImageChangerPlayer(int PlayerMonsterHandle){

        Mon.setColorFilter(Color.argb(0, 0, 0, 0));



      //  int UniqueID =
        if(UniqueID > 50000000) {
            Mon.setColorFilter(Color.argb(255, 0, 0, 0));
        }


        switch((int) PlayerMonsterHandle) {

            case 0:
                Mon.setImageResource(R.drawable.errantnope);
                break;
            case 1:
                Mon.setImageResource(R.drawable.kunk);
                break;
            case 2:
                Mon.setImageResource(R.drawable.kohboh);
                break;
            case 3:
                Mon.setImageResource(R.drawable.djoper);
                break;
            case 4:
                Mon.setImageResource(R.drawable.schorp);
                break;
            case 5:
                if (UniqueID < 22000000) {
                    Mon.setImageResource(R.drawable.zaume);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.zaumer);
                } else if (UniqueID < 70000000) {
                    Mon.setImageResource(R.drawable.zaumeb);
                } else {
                    Mon.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.nhainhai);
                } else {
                    Mon.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                Mon.setImageResource(R.drawable.degeissdt);
                break;
            case 8:
                if (UniqueID < 22000000) {
                    Mon.setImageResource(R.drawable.yuggle);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.yugglee);
                } else if (UniqueID < 70000000) {
                    Mon.setImageResource(R.drawable.yugglet);
                } else {
                    Mon.setImageResource(R.drawable.yuggler);
                }
                break;
            case 9:
                Mon.setImageResource(R.drawable.bongu);
                break;
            case 10:
                Mon.setImageResource(R.drawable.giteriglia);
                break;
            case 11:
                Mon.setImageResource(R.drawable.cyosteroth);
                break;
            case 12:
                Mon.setImageResource(R.drawable.nentopode);
                break;
            case 13:
                Mon.setImageResource(R.drawable.centiclak);
                break;
            case 14:
                Mon.setImageResource(R.drawable.uggnawb);
                break;
            case 15:
                Mon.setImageResource(R.drawable.grobhost);
                break;
            case 16:
                Mon.setImageResource(R.drawable.illelonab);
                break;
            case 17:
                Mon.setImageResource(R.drawable.rongzeed);
                break;
            case 18:
                Mon.setImageResource(R.drawable.blattle);
                break;
            case 19:


                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.swogharnlera);
                } else {
                    Mon.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                Mon.setImageResource(R.drawable.adenolish);
                break;
            case 21:

                if (UniqueID < 70000000) {
                    Mon.setImageResource(R.drawable.genaupresangb);
                } else {
                    Mon.setImageResource(R.drawable.genaupresangc);
                }

                break;
            case 22:
                if (UniqueID < 20000000) {
                    Mon.setImageResource(R.drawable.daahnida);
                } else if (UniqueID < 40000000) {
                    Mon.setImageResource(R.drawable.daahnidaa);
                } else if (UniqueID < 60000000) {
                    Mon.setImageResource(R.drawable.daahnidab);
                } else if (UniqueID < 80000000) {
                    Mon.setImageResource(R.drawable.daahnidac);
                } else {
                    Mon.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = UniqueID % 7; //>>>
                int daahnidacolorcontroller = UniqueID % 255;

                switch (daahnidacolorsetter) {
                    case 0:
                        Mon.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        Mon.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255));
                        break;
                    case 2:
                        Mon.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255));
                        break;
                    case 3:
                        Mon.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        Mon.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                    case 5:
                        Mon.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255));
                        break;
                    case 6:
                        Mon.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller));
                        break;
                }


                break;
            case 23:
                Mon.setImageResource(R.drawable.sorba);
                break;
            case 24:
                Mon.setImageResource(R.drawable.jiyou);
                break;
            case 25:
                Mon.setImageResource(R.drawable.sparvae);
                break;
            case 26:
                Mon.setImageResource(R.drawable.vellup);
                break;
            case 27:
                Mon.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                Mon.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.ryteggg);
                } else {
                    Mon.setImageResource(R.drawable.rytegg);
                }
                break;
            case 30:
                Mon.setImageResource(R.drawable.flashmer);
                break;
            case 31:
                Mon.setImageResource(R.drawable.schmodozer);
                break;
            case 32:
                Mon.setImageResource(R.drawable.octgotot);
                break;
            case 33:
                Mon.setImageResource(R.drawable.triaural);
                break;
            case 34:
                Mon.setImageResource(R.drawable.dicyto);
                break;
            case 35:
                Mon.setImageResource(R.drawable.monopteryx);
                break;
            case 36:
                Mon.setImageResource(R.drawable.elastocark);
                break;
            case 37:
                Mon.setImageResource(R.drawable.toobapath);
                break;
            case 38:
                Mon.setImageResource(R.drawable.wheeliosbop);
                break;
            case 39:
                Mon.setImageResource(R.drawable.ihmpdrap);
                break;
            case 40:
                Mon.setImageResource(R.drawable.epibazang);
                break;
            case 41:
                Mon.setImageResource(R.drawable.hemtan);
                break;
            case 42:
                Mon.setImageResource(R.drawable.ogo);
                break;
            case 43:
                Mon.setImageResource(R.drawable.strachid);
                break;
            case 44:
                Mon.setImageResource(R.drawable.toximastica);
                break;
            case 45:
                Mon.setImageResource(R.drawable.urcuria);
                break;
            case 46:

                if (UniqueID < 22000000) {
                    Mon.setImageResource(R.drawable.hyuntress);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.hyuntressa);
                } else if (UniqueID < 70000000) {
                    Mon.setImageResource(R.drawable.hyuntressb);
                } else {
                    Mon.setImageResource(R.drawable.hyuntressc);
                }
                break;
            case 47:
                Mon.setImageResource(R.drawable.mondosplak);
                break;
            case 48:
                Mon.setImageResource(R.drawable.kaheksaguge);
                break;
            case 49:
                Mon.setImageResource(R.drawable.sapiosuant);
                break;
            case 50:
                if (UniqueID < 22000000) {
                    Mon.setImageResource(R.drawable.munegullx);
                } else {
                    Mon.setImageResource(R.drawable.munegull);
                }

                break;
            case 51:
                Mon.setImageResource(R.drawable.sudakleez);
                break;
            case 52:
                Mon.setImageResource(R.drawable.halocordate);
                break;
            case 53:
                Mon.setImageResource(R.drawable.faedendron);
                break;
            case 54:
                Mon.setImageResource(R.drawable.osteoplang);
                break;
            case 55:
                Mon.setImageResource(R.drawable.zrachnid);
                break;
            case 56:
                Mon.setImageResource(R.drawable.xlitch);
                break;
            case 57:
                Mon.setImageResource(R.drawable.baa);
                break;
            case 58:
                Mon.setImageResource(R.drawable.mantidile);
                break;
            case 59:
                Mon.setImageResource(R.drawable.nokoyl);
                break;
            case 60:
                Mon.setImageResource(R.drawable.yallod);
                break;
            case 61:
                Mon.setImageResource(R.drawable.algaetizer);
                break;
            case 62:
                Mon.setImageResource(R.drawable.kachort);
                break;
            case 63:
                if (UniqueID < 22000000) {
                    Mon.setImageResource(R.drawable.slamelion);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.slamelionb);
                } else if (UniqueID < 70000000) {
                    Mon.setImageResource(R.drawable.slameliona);
                } else {
                    Mon.setImageResource(R.drawable.slamelion);
                }
                break;
            case 64:
                Mon.setImageResource(R.drawable.ayateda);
                break;
            case 65:
                Mon.setImageResource(R.drawable.wochem);
                break;
            case 66:
                Mon.setImageResource(R.drawable.humun);
                break;
            case 67:
                Mon.setImageResource(R.drawable.psychobath);
                break;
            case 68:
                Mon.setImageResource(R.drawable.gytanic);
                break;
            case 69:
                Mon.setImageResource(R.drawable.beis);
                break;
            case 70:
                Mon.setImageResource(R.drawable.gungholio);
                break;
            case 71:
                Mon.setImageResource(R.drawable.honigkonig);
                break;
            case 72:
                Mon.setImageResource(R.drawable.kungulp);
                break;
            case 73:
                Mon.setImageResource(R.drawable.satinella);
                break;
            case 74:
                Mon.setImageResource(R.drawable.elocurl);
                break;
            case 75:
                Mon.setImageResource(R.drawable.takobie);
                break;
            case 76:
                Mon.setImageResource(R.drawable.obchovy);
                break;
            case 77:
                Mon.setImageResource(R.drawable.nimnamnom);
                break;
            case 78:
                Mon.setImageResource(R.drawable.tutewtoo);
                break;
            case 79:
                Mon.setImageResource(R.drawable.blanqast);
                break;
            case 80:
                Mon.setImageResource(R.drawable.indeo);
                break;
            case 81:
                Mon.setImageResource(R.drawable.deblobbio);
                break;
            case 82:
                Mon.setImageResource(R.drawable.knightstacean);
                break;
            case 83:
                Mon.setImageResource(R.drawable.prostrax);
                break;
            case 84:
                Mon.setImageResource(R.drawable.haptozahen);
                break;
            case 85:
                Mon.setImageResource(R.drawable.minkohabod);
                break;
            case 86:
                Mon.setImageResource(R.drawable.zeen);
                break;
            case 87:
                Mon.setImageResource(R.drawable.tacroach);
                break;
            case 88:
                Mon.setImageResource(R.drawable.manterfly);
                break;
            case 89:
                if (UniqueID < 9000000) {
                    Mon.setImageResource(R.drawable.bearya);
                } else if (UniqueID < 18000000) {
                    Mon.setImageResource(R.drawable.bearyb);
                } else if (UniqueID < 27000000) {
                    Mon.setImageResource(R.drawable.bearyc);
                } else if (UniqueID < 36000000) {
                    Mon.setImageResource(R.drawable.bearyd);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.bearye);
                } else if (UniqueID < 54000000) {
                    Mon.setImageResource(R.drawable.bearyf);
                } else if (UniqueID < 63000000) {
                    Mon.setImageResource(R.drawable.bearyg);
                } else if (UniqueID < 72000000) {
                    Mon.setImageResource(R.drawable.bearyh);
                } else if (UniqueID < 81000000) {
                    Mon.setImageResource(R.drawable.bearyi);
                } else if (UniqueID < 90000000) {
                    Mon.setImageResource(R.drawable.bearyj);
                } else {
                    Mon.setImageResource(R.drawable.bearyk);
                }
                break;
            case 90:
                Mon.setImageResource(R.drawable.sluggernaut);
                break;
            case 91:
                if (UniqueID < 12000000) {
                    Mon.setImageResource(R.drawable.firstcustom);
                } else if (UniqueID < 44000000) {
                    Mon.setImageResource(R.drawable.missleaneous);
                } else if (UniqueID < 45000000) {
                    Mon.setImageResource(R.drawable.firstcustoma);
                } else if (UniqueID < 88000000) {
                    Mon.setImageResource(R.drawable.zubgondrakter);
                } else if (UniqueID < 89000000) {
                    Mon.setImageResource(R.drawable.rattic);
                } else if (UniqueID < 89500000) {
                    Mon.setImageResource(R.drawable.doughgnat);
                } else if (UniqueID < 90000000) {
                    Mon.setImageResource(R.drawable.sluggernaut);
                } else {
                    Mon.setImageResource(R.drawable.firstcustomc);
                }
                break;


            case 92:

                int memeekcolorsetter = UniqueID % 7; //>>>
                int memeekcolorcontroller = UniqueID % 255;

                switch (memeekcolorsetter) {
                    case 0:
                        Mon.setColorFilter(Color.argb(110, 255, 255, memeekcolorcontroller));
                        break;
                    case 1:
                        Mon.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, 255));
                        break;
                    case 2:
                        Mon.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, 255));
                        break;
                    case 3:
                        Mon.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, memeekcolorcontroller));
                        break;
                    case 4:
                        Mon.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                    case 5:
                        Mon.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, 255));
                        break;
                    case 6:
                        Mon.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, memeekcolorcontroller));
                        break;
                }
                Mon.setImageResource(R.drawable.memeeka);
                break;
            case 93:
                Mon.setImageResource(R.drawable.doughgnat);
                break;
            case 94:
                Mon.setImageResource(R.drawable.rattic);
                break;
            case 95:
                Mon.setImageResource(R.drawable.missleaneous);
                break;
            case 96:
                if(UniqueID < 15000000) {
                    Mon.setImageResource(R.drawable.runnybabbita);
                }else if (UniqueID < 20000000) {
                    Mon.setImageResource(R.drawable.runnybabbitb);
                }else if (UniqueID < 30000000) {
                    Mon.setImageResource(R.drawable.runnybabbitc);
                }else if (UniqueID < 40000000) {
                    Mon.setImageResource(R.drawable.runnybabbitd);
                }else if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.runnybabbite);
                }else {

                    Mon.setImageResource(R.drawable.runnybabbitx);
                }
                break;
            case 97:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.zubgondrakter);
                } else {
                    Mon.setImageResource(R.drawable.zubgondrakterhat);
                }
                break;
            case 98:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.whumpuhmp);
                } else {
                    Mon.setImageResource(R.drawable.whumpuhmp);
                }
                break;
            case 99:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.mangoon);
                } else {
                    Mon.setImageResource(R.drawable.mangoon);
                }
                break;
            case 100:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.scarbeque);
                } else {
                    Mon.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.fwuffynumpkins);
                } else {
                    Mon.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;
            case 102:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.dothog);
                } else {
                    Mon.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.reefcake);
                } else {
                    Mon.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.cheetza);
                } else {
                    Mon.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.sortsand);
                } else {
                    Mon.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.chilldabeest);
                } else {
                    Mon.setImageResource(R.drawable.chilldabeest);
                }
                break;
            case 107:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.communigator);
                } else {
                    Mon.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.mossboss);
                } else {
                    Mon.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.vamprey);
                } else {
                    Mon.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.parafox);
                } else {
                    Mon.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.rhischlosserous);
                } else {
                    Mon.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.hykeyna);
                } else {
                    Mon.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.tafantula);
                } else {
                    Mon.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.farmot);
                } else {
                    Mon.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.beeurchin);
                } else {
                    Mon.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.flyinsoup);
                } else {
                    Mon.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.meloncolli);
                } else {
                    Mon.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.scorphibianx);
                } else {
                    Mon.setImageResource(R.drawable.scorphibianx);
                }
            break;
            case 119:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.geliphant);
                } else {
                    Mon.setImageResource(R.drawable.geliphantx);
                }
            break;
            case 120:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.chimpansy);
                } else {
                    Mon.setImageResource(R.drawable.chimpansy);
                }
            break;
            case 121:

                if (UniqueID < 50000000) {
                    Mon.setImageResource(R.drawable.giveup);
                } else {
                    Mon.setImageResource(R.drawable.giveupx);
                }
            break;
            case 122:

                if (UniqueID < 5000000) {
                    Mon.setImageResource(R.drawable.avokaboomx);
                } else {
                    Mon.setImageResource(R.drawable.avokaboom);
                }
            break;
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

            }
        }else{
            return "error";
        }
        return "realerror";

    }
    public void songlist(int Idnum){
        switch ((int)Idnum){

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
        }
        if (Idnum > 121 || Idnum < 0){


        }
        if (PlayerSounds != null) {
            PlayerSounds.setLooping(true); // boogaloo
            PlayerSounds.start();
        }else {
            // PlayerSounds.setLooping(false); // boogaloo
            // PlayerSounds.stop();
        }


       // float f = (float)((float)((float)(monster.UniqueID%102) + 50)/100);
        //  f = (float) 1.51;


      //  if (PlayerSounds != null) {
      //      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
      //          PlayerSounds.setPlaybackParams(new PlaybackParams().setSpeed(f));
      //      }
      //  }
    }



    public int AttackMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(9);
// boosts
        return startingmove;
    }
}

