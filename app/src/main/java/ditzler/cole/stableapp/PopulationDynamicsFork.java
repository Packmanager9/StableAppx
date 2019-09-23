package ditzler.cole.stableapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PopulationDynamicsFork extends AppCompatActivity {

    Button Status, SpecialAttack, Turn, HealButton, Teller, FasterButton, SlowerButton;

    int fastercatch,  slowercatch = 0;
    int speedz = 2500;
    int Edgemonster = 0;
    int Centermonster = 0;
    int MedianMonster = 0;
    int EdgemonsterC = 0;
    int CentermonsterC = 0;
    int MedianMonsterC = 0;

    CustomMonsterTopLayer.StringObject NameObjectHolder;

    int life = 35;
    int datenumber = 0;
    String datenum = "%s";
    String realseason = "";

    TextView Seasons, Edge, Center, Median;

    int lifeseason = 0;
    Timer timer;

    int startflip = 0;

    public PopulationDynamicsFork() throws CloneNotSupportedException {
    }

    public class AgentObject implements Cloneable {
        public ImageView Gridspot;
        public protomon.monst Agent;

        public AgentObject (ImageView gridspot, protomon.monst agent){

          Gridspot = gridspot;
          Agent = agent;
        }

        public AgentObject clone() throws CloneNotSupportedException {
            AgentObject clonedmonster = (AgentObject) super.clone();
            return clonedmonster;
        }
    }

    int catcher = 0;
    int switchroller = -1;
    
    ImageView a01, a02, a03, a04, a05, a06, a07, a08, a09, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, b01, b02, b03, b04, b05, b06, b07, b08, b09, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, c01, c02, c03, c04, c05, c06, c07, c08, c09, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, d01, d02, d03, d04, d05, d06, d07, d08, d09, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, e01, e02, e03, e04, e05, e06, e07, e08, e09, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, f01, f02, f03, f04, f05, f06, f07, f08, f09, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, g01, g02, g03, g04, g05, g06, g07, g08, g09, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19, h01, h02, h03, h04, h05, h06, h07, h08, h09, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, i01, i02, i03, i04, i05, i06, i07, i08, i09, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, j01, j02, j03, j04, j05, j06, j07, j08, j09, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, k01, k02, k03, k04, k05, k06, k07, k08, k09, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, l01, l02, l03, l04, l05, l06, l07, l08, l09, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, n01, n02, n03, n04, n05, n06, n07, n08, n09, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, o01, o02, o03, o04, o05, o06, o07, o08, o09, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, p01, p02, p03, p04, p05, p06, p07, p08, p09, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, q01, q02, q03, q04, q05, q06, q07, q08, q09, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, r01, r02, r03, r04, r05, r06, r07, r08, r09, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, s01, s02, s03, s04, s05, s06, s07, s08, s09, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, t01, t02, t03, t04, t05, t06, t07, t08, t09, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, a20, b20, c20, d20, e20, f20, g20, h20, i20, j20, k20, l20, m20, n20, o20, p20, q20, r20, s20, t20;
    Button RandomButton, ClearButton, TestButton, Run, Step, EdgeButton, CenterButton, AddButton, MedianButton;

    int monsterswapcounter = 0;

    int arrayfillercount = 0;
    int arrayfillercountx = 0;


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

    int slowflip = 0;


    String displaystring = "%s";
    String displaystringH = "%s/%s";

    String CombatString = "";
    String GombatString = "";
    String CombatStringer = "%s";
    String CombatStringed = "%s";


    int spawncap = 85;
    int rotationcap = 86;


    int turncounter = 0;

    double Damage;

    double MaxHealthAttacker = 1;
    double MaxHealthPlayer = 1;

    int rivalNewnessCounter = 0;

    int monsterLoop = new Random().nextInt(spawncap)+1;
    // int monsterLoop = 0;

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
    public double kunkat = stats(75);
    public double kunksp = stats(60);
    public double kunkde = stats(120);
    public double kunkhe = stats(185);
    // MediaPlayer KunkSong);

    public double kohbohid = 2;
    public double kohbohat = stats(101); //100
    public double kohbohsp = stats(101); //100
    public double kohbohde = stats(101); //100
    public double kohbohhe = stats(101); //100
    // MediaPlayer KohbohSong);

    public double djoperid = 3;
    public double djoperat = stats(274);
    public double djopersp = stats(65);
    public double djoperde = stats(70);
    public double djoperhe = stats(80);

    public double schorpid = 4;
    public double schorpat = stats(65); // 60
    public double schorpsp = stats(105);
    public double schorpde = stats(100);
    public double schorphe = stats(158);

    public double zaumeid = 5;
    public double zaumeat = stats(94); // 94
    public double zaumesp = stats(180);
    public double zaumede = stats(77);
    public double zaumehe = stats(77);

    public double nhainhaiid = 6;
    public double nhainhaiat = stats(51);
    public double nhainhaisp = stats(59);
    public double nhainhaide = stats(51);
    public double nhainhaihe = stats(462);

    public double degeissdtid = 7;
    public double degeissdtat = stats(361);
    public double degeissdtsp = stats(61);
    public double degeissdtde = stats(60);
    public double degeissdthe = stats(76);

    public double yuggleid = 8;
    public double yuggleat = stats(160); //155
    public double yugglesp = stats(179);
    public double yugglede = stats(60);
    public double yugglehe = stats(66);

    public double bonguid = 9;
    public double bonguat = stats(60);
    public double bongusp = stats(64);
    public double bongude = stats(319);
    public double bonguhe = stats(60);

    //   public double bonguid = 9);
//    public double bonguat = stats(60);
    //   public double bongusp = stats(65);
    //   public double bongude = stats(422);
//    public double bonguhe = stats(61);

    public double giterigliaid = 10;
    public double giterigliaat = stats(111);
    public double giterigliasp = stats(95);
    public double giterigliade = stats(106); //101
    public double giterigliahe = stats(94);

    public double cyosterothid = 11;
    public double cyosterothat = stats(73); // 70
    public double cyosterothsp = stats(125);
    public double cyosterothde = stats(88); // 81 // 87
    public double cyosterothhe = stats(141);

    public double nentopodeid = 12;
    public double nentopodeat = stats(70); // 76
    public double nentopodesp = stats(63);
    public double nentopodede = stats(160);
    public double nentopodehe = stats(130);

    public double centiclakid = 13;
    public double centiclakat = stats(104); // 90
    public double centiclaksp = stats(111);
    public double centiclakde = stats(74);
    public double centiclakhe = stats(135);

    public double uggnawbid = 14;
    public double uggnawbat = stats(65);
    public double uggnawbsp = stats(159); // Real Uggnawb
    public double uggnawbde = stats(60);
    public double uggnawbhe = stats(160);

    /*   public double uggnawbid = 14);
    public double uggnawbat = stats(51);
    public double uggnawbsp = stats(214); // boosted Uggnawb
    public double uggnawbde = stats(51);
    public double uggnawbhe = stats(200);*/

    public double grobhostid = 15;
    public double grobhostat = stats(142);
    public double grobhostsp = stats(66);
    public double grobhostde = stats(80);
    public double grobhosthe = stats(134);

    public double illelonabid = 16;
    public double illelonabat = stats(154);
    public double illelonabsp = stats(68);
    public double illelonabde = stats(73);
    public double illelonabhe = stats(131);

    public double rongzeedid = 17;
    public double rongzeedat = stats(95);
    public double rongzeedsp = stats(63);
    public double rongzeedde = stats(67); // 75
    public double rongzeedhe = stats(220);

    public double blattleid = 18;
    public double blattleat = stats(149);
    public double blattlesp = stats(67);
    public double blattlede = stats(109);
    public double blattlehe = stats(92);

    public double swogharnlerid = 19;
    public double swogharnlerat = stats(119); // 113
    public double swogharnlersp = stats(69);
    public double swogharnlerde = stats(119); // 113
    public double swogharnlerhe = stats(119); // 113

    public double adenolishid = 20;
    public double adenolishat = stats(123);
    public double adenolishsp = stats(69);
    public double adenolishde = stats(146);
    public double adenolishhe = stats(81);

    public double genaupresangid = 21;
    public double genaupresangat = stats(101);
    public double genaupresangsp = stats(71);
    public double genaupresangde = stats(100);
    public double genaupresanghe = stats(140);

    public double daahnidaid = 22;
    public double daahnidaat = stats(60);
    public double daahnidasp = stats(462);
    public double daahnidade = stats(52);
    public double daahnidahe = stats(61);

    public double sorbaid = 23;
    public double sorbaat = stats(150); // 150
    public double sorbasp = stats(67);
    public double sorbade = stats(151); // 151
    public double sorbahe = stats(66);

    public double jiyouid = 24;
    public double jiyouat = stats(67);
    public double jiyousp = stats(66);
    public double jiyoude = stats(140);  //150
    public double jiyouhe = stats(141);  //151

    public double sparvaeid = 25;
    public double sparvaeat = stats(162);
    public double sparvaesp = stats(62);
    public double sparvaede = stats(110);
    public double sparvaehe = stats(91);

    public double vellupid = 26;
    public double vellupat = stats(59); // 60
    public double vellupsp = stats(110);
    public double vellupde = stats(271);
    public double velluphe = stats(54);

    //   public double vellupid = 26);
    //   public double vellupat = stats(60);
    //   public double vellupsp = stats(62);
    //   public double vellupde = stats(371);
    //   public double velluphe = stats(72);

    public double bellajaid = 27;
    public double bellajaat = stats(52); // 60
    public double bellajasp = stats(89);
    public double bellajade = stats(52); //55
    public double bellajahe = stats(319);

    public double levdzellid = 28;
    public double levdzellat = stats(61);
    public double levdzellsp = stats(113);
    public double levdzellde = stats(214);
    public double levdzellhe = stats(68);

    public double ryteggid = 29;
    public double ryteggat = stats(61);
    public double ryteggsp = stats(112);
    public double ryteggde = stats(61);
    public double rytegghe = stats(240);

    public double flashmerid = 30;
    public double flashmerat = stats(101); // 100
    public double flashmersp = stats(114);
    public double flashmerde = stats(84);
    public double flashmerhe = stats(105);

    public double schmodozerid = 31;
    public double schmodozerat = stats(139);
    public double schmodozersp = stats(72);
    public double schmodozerde = stats(141);
    public double schmodozerhe = stats(71);

    public double octgototid = 32;
    public double octgototat = stats(170);
    public double octgototsp = stats(95);
    public double octgototde = stats(66);
    public double octgotothe = stats(94);

    public double triauralid = 33;
    public double triauralat = stats(97); // 95
    public double triauralsp = stats(117);
    public double triauralde = stats(97);// 95
    public double triauralhe = stats(97);// 95

    public double dicytoid = 34;
    public double dicytoat = stats(86);
    public double dicytosp = stats(116);
    public double dicytode = stats(95);
    public double dicytohe = stats(116); // 106

    public double monopteryxid = 35;
    public double monopteryxat = stats(155);
    public double monopteryxsp = stats(115);
    public double monopteryxde = stats(75);
    public double monopteryxhe = stats(75);

    public double elastocarkid = 36;
    public double elastocarkat = stats(77);
    public double elastocarksp = stats(90);
    public double elastocarkde = stats(92);
    public double elastocarkhe = stats(157);

    public double toobapathid = 37;
    public double toobapathat = stats(90);
    public double toobapathsp = stats(94);
    public double toobapathde = stats(126);
    public double toobapathhe = stats(94);

    public double weeliosbopid = 38;
    public double weeliosbopat = stats(83);
    public double weeliosbopsp = stats(96);
    public double weeliosbopde = stats(112);
    public double weeliosbophe = stats(112);

    public double ihmpdrapid = 39;
    public double ihmpdrapat = stats(104);
    public double ihmpdrapsp = stats(99);
    public double ihmpdrapde = stats(68);
    public double ihmpdraphe = stats(141);

    public double epibazangid = 40;
    public double epibazangat = stats(134);
    public double epibazangsp = stats(82);
    public double epibazangde = stats(123);
    public double epibazanghe = stats(74);

    public double hemtanid = 41;
    public double hemtanat = stats(100);
    public double hemtansp = stats(80);
    public double hemtande = stats(125);
    public double hemtanhe = stats(100);

    public double ogoid = 42;
    public double ogoat = stats(165);
    public double ogosp = stats(165);
    public double ogode = stats(61);
    public double ogohe = stats(61);

    public double strachidid = 43;
    public double strachidat = stats(58);
    public double strachidsp = stats(167);
    public double strachidde = stats(99);
    public double strachidhe = stats(167);

    /*
        public double strachidid = 43);
        public double strachidat = stats(62);
        public double strachidsp = stats(167);
        public double strachidde = stats(99);
        public double strachidhe = stats(107);

        public double strachidhe = stats(98);
    */
    public double toximasticaid = 44;
    public double toximasticaat = stats(71);
    public double toximasticasp = stats(172);
    public double toximasticade = stats(109);
    public double toximasticahe = stats(119);

    public double urcuriaid = 45;
    public double urcuriaat = stats(60);
    public double urcuriasp = stats(176);
    public double urcuriade = stats(104);
    public double urcuriahe = stats(150);

    public double hyuntressid = 46;
    public double hyuntressat = stats(77); //75
    public double hyuntresssp = stats(70);
    public double hyuntressde = stats(51); // 61
    public double hyuntresshe = stats(283); // 301

    public double mondosplakid = 47;
    public double mondosplakat = stats(115);
    public double mondosplaksp = stats(82);
    public double mondosplakde = stats(60);
    public double mondosplakhe = stats(176);

    public double kaheksagugeid = 48;
    public double kaheksagugeat = stats(80);
    public double kaheksagugesp = stats(83);
    public double kaheksagugede = stats(80);
    public double kaheksagugehe = stats(190);

    public double sapiosuantid = 49;
    public double sapiosuantat = stats(100);
    public double sapiosuantsp = stats(101);
    public double sapiosuantde = stats(70);
    public double sapiosuanthe = stats(142);

    public double munegullid = 50;
    public double munegullat = stats(130);
    public double munegullsp = stats(81);
    public double munegullde = stats(100);
    public double munegullhe = stats(94);

    public double sudakleezid = 51;
    public double sudakleezat = stats(72);
    public double sudakleezsp = stats(102);
    public double sudakleezde = stats(70);
    public double sudakleezhe = stats(194);

    public double halocordateid = 52;
    public double halocordateat = stats(170);
    public double halocordatesp = stats(120);
    public double halocordatede = stats(70);
    public double halocordatehe = stats(70);

    public double fædendronid = 53;
    public double fædendronat = stats(95);
    public double fædendronsp = stats(93);
    public double fædendronde = stats(60);
    public double fædendronhe = stats(187);

    public double osteoplangid = 54;
    public double osteoplangat = stats(84);
    public double osteoplangsp = stats(86);
    public double osteoplangde = stats(70);
    public double osteoplanghe = stats(198);

    public double жrachnidid = 55;
    public double жrachnidat = stats(211);
    public double жrachnidsp = stats(73);
    public double жrachnidde = stats(80);
    public double жrachnidhe = stats(81);

    public double Ϫlitchid = 56;
    public double Ϫlitchat = stats(135);
    public double Ϫlitchsp = stats(74);
    public double Ϫlitchde = stats(135);
    public double Ϫlitchhe = stats(74);

    public double በid = 57;
    public double በat = stats(88);
    public double በsp = stats(75);
    public double በde = stats(150);
    public double በhe = stats(101);

    public double mantidileid = 58;
    public double mantidileat = stats(79);
    public double mantidilesp = stats(76);
    public double mantidilede = stats(122);
    public double mantidilehe = stats(137);

    public double nokoylid = 59;
    public double nokoylat = stats(82);
    public double nokoylsp = stats(121);
    public double nokoylde = stats(70);
    public double nokoylhe = stats(154); //148

    public double яallodid = 60;
    public double яallodat = stats(100);
    public double яallodsp = stats(78);
    public double яallodde = stats(75);
    public double яallodhe = stats(166);

    public double algaetizerid = 61;
    public double algaetizerat = stats(98);
    public double algaetizersp = stats(79);
    public double algaetizerde = stats(104);
    public double algaetizerhe = stats(124);

    public double kachortid = 62;
    public double kachortat = stats(97); //102
    public double kachortsp = stats(77);
    public double kachortde = stats(67);
    public double kachorthe = stats(184);

    public double slamelionid = 63;
    public double slamelionat = stats(99);
    public double slamelionsp = stats(84);
    public double slamelionde = stats(86);
    public double slamelionhe = stats(145);

    public double ayatedaid = 64;
    public double ayatedaat = stats(77);
    public double ayatedasp = stats(85);
    public double ayatedade = stats(131);
    public double ayatedahe = stats(118);

    public double wochemid = 65;
    public double wochemat = stats(85);
    public double wochemsp = stats(87);
    public double wochemde = stats(100);
    public double wochemhe = stats(135);

    public double Ƕmunid = 66;
    public double Ƕmunat = stats(92);
    public double Ƕmunsp = stats(91);
    public double Ƕmunde = stats(107);
    public double Ƕmunhe = stats(115);

    public double ψkobathid = 67;
    public double ψkobathat = stats(94);
    public double ψkobathsp = stats(88);
    public double ψkobathde = stats(110);
    public double ψkobathhe = stats(112);

    public double gytanicid = 68;
    public double gytanicat = stats(174);
    public double gytanicsp = stats(97);
    public double gytanicde = stats(60);
    public double gytaniche = stats(100);

    public double βeißid = 69;
    public double βeißat = stats(85);
    public double βeißsp = stats(119);
    public double βeißde = stats(67);
    public double βeißhe = stats(159);

    public double gungholioid = 70;
    public double gungholioat = stats(253);
    public double gungholiosp = stats(92);
    public double gungholiode = stats(56);
    public double gungholiohe = stats(68);

    public double honigkönigid = 71;
    public double honigkönigat = stats(89); // 117 // 84
    public double honigkönigsp = stats(71);  // 57  // 97 // 80
    public double honigkönigde = stats(201); // 100 // 200
    public double honigkönighe = stats(74); // 151 // 71

    public double kungulpid = 72;
    public double kungulpat = stats(348); // 123 // 160
    public double kungulpsp = stats(77);
    public double kungulpde = stats(51);
    public double kungulphe = stats(51);

    /*

    public double σativnellaid = -73);
    public double σativnellaat = stats(289);
    public double σativnellasp = stats(62); // 58
    public double σativnellade = stats(60);
    public double σativnellahe = stats(53); // 150
    public double kungulpid = 72);
    public double kungulpat = stats(133); // 123 // 160
    public double kungulpsp = stats(118);
    public double kungulpde = stats(77);
    public double kungulphe = stats(114);
    */

    public double σatinellaid = 73;
    public double σatinellaat = stats(84);
    public double σatinellasp = stats(62); // 58
    public double σatinellade = stats(143);
    public double σatinellahe = stats(118); // 150

    public double elocurlid = 74;
    public double elocurlat = stats(86);
    public double elocurlsp = stats(112);
    public double elocurlde = stats(99);
    public double elocurlhe = stats(117);

    public double takobieid = 75;
    public double takobieat = stats(120); //91
    public double takobiesp = stats(108); //123
    public double takobiede = stats(99); //115
    public double takobiehe = stats(91);  //91

    public double ōbchovyid = 76;
    public double ōbchovyat = stats(132); //
    public double ōbchovysp = stats(122); //
    public double ōbchovyde = stats(60); //
    public double ōbchovyhe = stats(109);  //

    public double nimnamnomid = 77;
    public double nimnamnomat = stats(137); // 133
    public double nimnamnomsp = stats(64); //
    public double nimnamnomde = stats(99); //
    public double nimnamnomhe = stats(119);  // 121

    public double tutewtooid = 78;
    public double tutewtooat = stats(119); //
    public double tutewtoosp = stats(119); //
    public double tutewtoode = stats(60); //
    public double tutewtoohe = stats(119);  //

    public double blanqastid = 79;
    public double blanqastat = stats(111); //
    public double blanqastsp = stats(74); //
    public double blanqastde = stats(111); //
    public double blanqasthe = stats(111);  //

    public double indeoid = 80;
    public double indeoat = stats(126); //
    public double indeosp = stats(126); //
    public double indeode = stats(51); //
    public double indeohe = stats(126);  //

    public double deblobbioid = 81;
    public double deblobbioat = stats(119); //
    public double deblobbiosp = stats(109); //
    public double deblobbiode = stats(99); //
    public double deblobbiohe = stats(89);  //

    public double knightstaceanid = 82;
    public double knightstaceanat = stats(117); //
    public double knightstaceansp = stats(107); //
    public double knightstaceande = stats(117); //
    public double knightstaceanhe = stats(78);  //

    public double prostraxid = 83;
    public double prostraxat = stats(325); //
    public double prostraxsp = stats(52); //
    public double prostraxde = stats(71); //
    public double prostraxhe = stats(71);  //

    public double haptozahenid = 84;
    public double haptozahenat = stats(52); //
    public double haptozahensp = stats(325); //
    public double haptozahende = stats(109); //
    public double haptozahenhe = stats(109);  //

    public double minkohabodid = 85;
    public double minkohabodat = stats(52); //
    public double minkohabodsp = stats(52); //
    public double minkohabodde = stats(325); //
    public double minkohabodhe = stats(52);  //

    public double zeenid = 86;
    public double zeenat = stats(72); // 72
    public double zeensp = stats(121); // 71
    public double zeende = stats(112); // 112
    public double zeenhe = stats(112);  // 112

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
    protomon.monst Custom = new protomon.monst(87, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),0,HealMoves(0), UniqueIdentifier(0));
    protomon.monst error = new protomon.monst(0, stats(51), stats(51), stats(51), stats(753), 0,0,0,0,0);
    protomon.monst EmptyBox = new protomon.monst(88, 1, 1, 1, 1, 0,0,0,0,0);
    

    AgentObject emptybox = new AgentObject(a01, EmptyBox.clone());
    AgentObject emptyboxx = new AgentObject(a01, Takobie.clone());
   // protomon.monst attackermonster;
    //protomon.monst playermonster;

    AgentObject[] AgentPositions = {emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone()};

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.dynamics_activity);

        Seasons = findViewById(R.id.SeasonView);
        Center = findViewById(R.id.CenterView);
        Edge = findViewById(R.id.EdgeView);
        Median = findViewById(R.id.MedianView);

        RandomButton = findViewById(R.id.Randomizer);
        ClearButton = findViewById(R.id.Clear);
        TestButton = findViewById(R.id.Test);
        EdgeButton = findViewById(R.id.EdgeStep);
        CenterButton = findViewById(R.id.CenterStep);
        MedianButton = findViewById(R.id.MedianStep);
        AddButton = findViewById(R.id.AddRandom);
        FasterButton = findViewById(R.id.Faster);
        SlowerButton = findViewById(R.id.Slower);

        EditText inputbox1 = (EditText) findViewById(R.id.SelectBox);

        Run = findViewById(R.id.Run);
        Step = findViewById(R.id.Step);

        a20 = findViewById(R.id.A20);
        b20 = findViewById(R.id.B20);
        c20 = findViewById(R.id.C20);
        d20 = findViewById(R.id.D20);
        e20 = findViewById(R.id.E20);
        f20 = findViewById(R.id.F20);
        g20 = findViewById(R.id.G20);
        h20 = findViewById(R.id.H20);
        i20 = findViewById(R.id.I20);
        j20 = findViewById(R.id.J20);
        k20 = findViewById(R.id.K20);
        l20 = findViewById(R.id.L20);
        m20 = findViewById(R.id.M20);
        n20 = findViewById(R.id.N20);
        o20 = findViewById(R.id.O20);
        p20 = findViewById(R.id.P20);
        q20 = findViewById(R.id.Q20);
        r20 = findViewById(R.id.R20);
        s20 = findViewById(R.id.S20);
        t20 = findViewById(R.id.T20);

        a01 = findViewById(R.id.A01);
        a02 = findViewById(R.id.A02);
        a03 = findViewById(R.id.A03);
        a04 = findViewById(R.id.A04);
        a05 = findViewById(R.id.A05);
        a06 = findViewById(R.id.A06);
        a07 = findViewById(R.id.A07);
        a08 = findViewById(R.id.A08);
        a09 = findViewById(R.id.A09);
        a10 = findViewById(R.id.A10);
        a11 = findViewById(R.id.A11);
        a12 = findViewById(R.id.A12);
        a13 = findViewById(R.id.A13);
        a14 = findViewById(R.id.A14);
        a15 = findViewById(R.id.A15);
        a16 = findViewById(R.id.A16);
        a17 = findViewById(R.id.A17);
        a18 = findViewById(R.id.A18);
        a19 = findViewById(R.id.A19);
        
        b01 = findViewById(R.id.B01);
        b02 = findViewById(R.id.B02);
        b03 = findViewById(R.id.B03);
        b04 = findViewById(R.id.B04);
        b05 = findViewById(R.id.B05);
        b06 = findViewById(R.id.B06);
        b07 = findViewById(R.id.B07);
        b08 = findViewById(R.id.B08);
        b09 = findViewById(R.id.B09);
        b10 = findViewById(R.id.B10);
        b11 = findViewById(R.id.B11);
        b12 = findViewById(R.id.B12);
        b13 = findViewById(R.id.B13);
        b14 = findViewById(R.id.B14);
        b15 = findViewById(R.id.B15);
        b16 = findViewById(R.id.B16);
        b17 = findViewById(R.id.B17);
        b18 = findViewById(R.id.B18);
        b19 = findViewById(R.id.B19);

        
        c01 = findViewById(R.id.C01);
        c02 = findViewById(R.id.C02);
        c03 = findViewById(R.id.C03);
        c04 = findViewById(R.id.C04);
        c05 = findViewById(R.id.C05);
        c06 = findViewById(R.id.C06);
        c07 = findViewById(R.id.C07);
        c08 = findViewById(R.id.C08);
        c09 = findViewById(R.id.C09);
        c10 = findViewById(R.id.C10);
        c11 = findViewById(R.id.C11);
        c12 = findViewById(R.id.C12);
        c13 = findViewById(R.id.C13);
        c14 = findViewById(R.id.C14);
        c15 = findViewById(R.id.C15);
        c16 = findViewById(R.id.C16);
        c17 = findViewById(R.id.C17);
        c18 = findViewById(R.id.C18);
        c19 = findViewById(R.id.C19);

        
        d01 = findViewById(R.id.D01);
        d02 = findViewById(R.id.D02);
        d03 = findViewById(R.id.D03);
        d04 = findViewById(R.id.D04);
        d05 = findViewById(R.id.D05);
        d06 = findViewById(R.id.D06);
        d07 = findViewById(R.id.D07);
        d08 = findViewById(R.id.D08);
        d09 = findViewById(R.id.D09);
        d10 = findViewById(R.id.D10);
        d11 = findViewById(R.id.D11);
        d12 = findViewById(R.id.D12);
        d13 = findViewById(R.id.D13);
        d14 = findViewById(R.id.D14);
        d15 = findViewById(R.id.D15);
        d16 = findViewById(R.id.D16);
        d17 = findViewById(R.id.D17);
        d18 = findViewById(R.id.D18);
        d19 = findViewById(R.id.D19);

        
        e01 = findViewById(R.id.E01);
        e02 = findViewById(R.id.E02);
        e03 = findViewById(R.id.E03);
        e04 = findViewById(R.id.E04);
        e05 = findViewById(R.id.E05);
        e06 = findViewById(R.id.E06);
        e07 = findViewById(R.id.E07);
        e08 = findViewById(R.id.E08);
        e09 = findViewById(R.id.E09);
        e10 = findViewById(R.id.E10);
        e11 = findViewById(R.id.E11);
        e12 = findViewById(R.id.E12);
        e13 = findViewById(R.id.E13);
        e14 = findViewById(R.id.E14);
        e15 = findViewById(R.id.E15);
        e16 = findViewById(R.id.E16);
        e17 = findViewById(R.id.E17);
        e18 = findViewById(R.id.E18);
        e19 = findViewById(R.id.E19);

        
        f01 = findViewById(R.id.F01);
        f02 = findViewById(R.id.F02);
        f03 = findViewById(R.id.F03);
        f04 = findViewById(R.id.F04);
        f05 = findViewById(R.id.F05);
        f06 = findViewById(R.id.F06);
        f07 = findViewById(R.id.F07);
        f08 = findViewById(R.id.F08);
        f09 = findViewById(R.id.F09);
        f10 = findViewById(R.id.F10);
        f11 = findViewById(R.id.F11);
        f12 = findViewById(R.id.F12);
        f13 = findViewById(R.id.F13);
        f14 = findViewById(R.id.F14);
        f15 = findViewById(R.id.F15);
        f16 = findViewById(R.id.F16);
        f17 = findViewById(R.id.F17);
        f18 = findViewById(R.id.F18);
        f19 = findViewById(R.id.F19);

        
        g01 = findViewById(R.id.G01);
        g02 = findViewById(R.id.G02);
        g03 = findViewById(R.id.G03);
        g04 = findViewById(R.id.G04);
        g05 = findViewById(R.id.G05);
        g06 = findViewById(R.id.G06);
        g07 = findViewById(R.id.G07);
        g08 = findViewById(R.id.G08);
        g09 = findViewById(R.id.G09);
        g10 = findViewById(R.id.G10);
        g11 = findViewById(R.id.G11);
        g12 = findViewById(R.id.G12);
        g13 = findViewById(R.id.G13);
        g14 = findViewById(R.id.G14);
        g15 = findViewById(R.id.G15);
        g16 = findViewById(R.id.G16);
        g17 = findViewById(R.id.G17);
        g18 = findViewById(R.id.G18);
        g19 = findViewById(R.id.G19);

        
        h01 = findViewById(R.id.H01);
        h02 = findViewById(R.id.H02);
        h03 = findViewById(R.id.H03);
        h04 = findViewById(R.id.H04);
        h05 = findViewById(R.id.H05);
        h06 = findViewById(R.id.H06);
        h07 = findViewById(R.id.H07);
        h08 = findViewById(R.id.H08);
        h09 = findViewById(R.id.H09);
        h10 = findViewById(R.id.H10);
        h11 = findViewById(R.id.H11);
        h12 = findViewById(R.id.H12);
        h13 = findViewById(R.id.H13);
        h14 = findViewById(R.id.H14);
        h15 = findViewById(R.id.H15);
        h16 = findViewById(R.id.H16);
        h17 = findViewById(R.id.H17);
        h18 = findViewById(R.id.H18);
        h19 = findViewById(R.id.H19);

        
        i01 = findViewById(R.id.I01);
        i02 = findViewById(R.id.I02);
        i03 = findViewById(R.id.I03);
        i04 = findViewById(R.id.I04);
        i05 = findViewById(R.id.I05);
        i06 = findViewById(R.id.I06);
        i07 = findViewById(R.id.I07);
        i08 = findViewById(R.id.I08);
        i09 = findViewById(R.id.I09);
        i10 = findViewById(R.id.I10);
        i11 = findViewById(R.id.I11);
        i12 = findViewById(R.id.I12);
        i13 = findViewById(R.id.I13);
        i14 = findViewById(R.id.I14);
        i15 = findViewById(R.id.I15);
        i16 = findViewById(R.id.I16);
        i17 = findViewById(R.id.I17);
        i18 = findViewById(R.id.I18);
        i19 = findViewById(R.id.I19);

        
        j01 = findViewById(R.id.J01);
        j02 = findViewById(R.id.J02);
        j03 = findViewById(R.id.J03);
        j04 = findViewById(R.id.J04);
        j05 = findViewById(R.id.J05);
        j06 = findViewById(R.id.J06);
        j07 = findViewById(R.id.J07);
        j08 = findViewById(R.id.J08);
        j09 = findViewById(R.id.J09);
        j10 = findViewById(R.id.J10);
        j11 = findViewById(R.id.J11);
        j12 = findViewById(R.id.J12);
        j13 = findViewById(R.id.J13);
        j14 = findViewById(R.id.J14);
        j15 = findViewById(R.id.J15);
        j16 = findViewById(R.id.J16);
        j17 = findViewById(R.id.J17);
        j18 = findViewById(R.id.J18);
        j19 = findViewById(R.id.J19);

        
        k01 = findViewById(R.id.K01);
        k02 = findViewById(R.id.K02);
        k03 = findViewById(R.id.K03);
        k04 = findViewById(R.id.K04);
        k05 = findViewById(R.id.K05);
        k06 = findViewById(R.id.K06);
        k07 = findViewById(R.id.K07);
        k08 = findViewById(R.id.K08);
        k09 = findViewById(R.id.K09);
        k10 = findViewById(R.id.K10);
        k11 = findViewById(R.id.K11);
        k12 = findViewById(R.id.K12);
        k13 = findViewById(R.id.K13);
        k14 = findViewById(R.id.K14);
        k15 = findViewById(R.id.K15);
        k16 = findViewById(R.id.K16);
        k17 = findViewById(R.id.K17);
        k18 = findViewById(R.id.K18);
        k19 = findViewById(R.id.K19);

        
        l01 = findViewById(R.id.L01);
        l02 = findViewById(R.id.L02);
        l03 = findViewById(R.id.L03);
        l04 = findViewById(R.id.L04);
        l05 = findViewById(R.id.L05);
        l06 = findViewById(R.id.L06);
        l07 = findViewById(R.id.L07);
        l08 = findViewById(R.id.L08);
        l09 = findViewById(R.id.L09);
        l10 = findViewById(R.id.L10);
        l11 = findViewById(R.id.L11);
        l12 = findViewById(R.id.L12);
        l13 = findViewById(R.id.L13);
        l14 = findViewById(R.id.L14);
        l15 = findViewById(R.id.L15);
        l16 = findViewById(R.id.L16);
        l17 = findViewById(R.id.L17);
        l18 = findViewById(R.id.L18);
        l19 = findViewById(R.id.L19);

        
        m01 = findViewById(R.id.M01);
        m02 = findViewById(R.id.M02);
        m03 = findViewById(R.id.M03);
        m04 = findViewById(R.id.M04);
        m05 = findViewById(R.id.M05);
        m06 = findViewById(R.id.M06);
        m07 = findViewById(R.id.M07);
        m08 = findViewById(R.id.M08);
        m09 = findViewById(R.id.M09);
        m10 = findViewById(R.id.M10);
        m11 = findViewById(R.id.M11);
        m12 = findViewById(R.id.M12);
        m13 = findViewById(R.id.M13);
        m14 = findViewById(R.id.M14);
        m15 = findViewById(R.id.M15);
        m16 = findViewById(R.id.M16);
        m17 = findViewById(R.id.M17);
        m18 = findViewById(R.id.M18);
        m19 = findViewById(R.id.M19);

        
        n01 = findViewById(R.id.N01);
        n02 = findViewById(R.id.N02);
        n03 = findViewById(R.id.N03);
        n04 = findViewById(R.id.N04);
        n05 = findViewById(R.id.N05);
        n06 = findViewById(R.id.N06);
        n07 = findViewById(R.id.N07);
        n08 = findViewById(R.id.N08);
        n09 = findViewById(R.id.N09);
        n10 = findViewById(R.id.N10);
        n11 = findViewById(R.id.N11);
        n12 = findViewById(R.id.N12);
        n13 = findViewById(R.id.N13);
        n14 = findViewById(R.id.N14);
        n15 = findViewById(R.id.N15);
        n16 = findViewById(R.id.N16);
        n17 = findViewById(R.id.N17);
        n18 = findViewById(R.id.N18);
        n19 = findViewById(R.id.N19);

        
        o01 = findViewById(R.id.O01);
        o02 = findViewById(R.id.O02);
        o03 = findViewById(R.id.O03);
        o04 = findViewById(R.id.O04);
        o05 = findViewById(R.id.O05);
        o06 = findViewById(R.id.O06);
        o07 = findViewById(R.id.O07);
        o08 = findViewById(R.id.O08);
        o09 = findViewById(R.id.O09);
        o10 = findViewById(R.id.O10);
        o11 = findViewById(R.id.O11);
        o12 = findViewById(R.id.O12);
        o13 = findViewById(R.id.O13);
        o14 = findViewById(R.id.O14);
        o15 = findViewById(R.id.O15);
        o16 = findViewById(R.id.O16);
        o17 = findViewById(R.id.O17);
        o18 = findViewById(R.id.O18);
        o19 = findViewById(R.id.O19);

        
        p01 = findViewById(R.id.P01);
        p02 = findViewById(R.id.P02);
        p03 = findViewById(R.id.P03);
        p04 = findViewById(R.id.P04);
        p05 = findViewById(R.id.P05);
        p06 = findViewById(R.id.P06);
        p07 = findViewById(R.id.P07);
        p08 = findViewById(R.id.P08);
        p09 = findViewById(R.id.P09);
        p10 = findViewById(R.id.P10);
        p11 = findViewById(R.id.P11);
        p12 = findViewById(R.id.P12);
        p13 = findViewById(R.id.P13);
        p14 = findViewById(R.id.P14);
        p15 = findViewById(R.id.P15);
        p16 = findViewById(R.id.P16);
        p17 = findViewById(R.id.P17);
        p18 = findViewById(R.id.P18);
        p19 = findViewById(R.id.P19);

        
        q01 = findViewById(R.id.Q01);
        q02 = findViewById(R.id.Q02);
        q03 = findViewById(R.id.Q03);
        q04 = findViewById(R.id.Q04);
        q05 = findViewById(R.id.Q05);
        q06 = findViewById(R.id.Q06);
        q07 = findViewById(R.id.Q07);
        q08 = findViewById(R.id.Q08);
        q09 = findViewById(R.id.Q09);
        q10 = findViewById(R.id.Q10);
        q11 = findViewById(R.id.Q11);
        q12 = findViewById(R.id.Q12);
        q13 = findViewById(R.id.Q13);
        q14 = findViewById(R.id.Q14);
        q15 = findViewById(R.id.Q15);
        q16 = findViewById(R.id.Q16);
        q17 = findViewById(R.id.Q17);
        q18 = findViewById(R.id.Q18);
        q19 = findViewById(R.id.Q19);

        
        r01 = findViewById(R.id.R01);
        r02 = findViewById(R.id.R02);
        r03 = findViewById(R.id.R03);
        r04 = findViewById(R.id.R04);
        r05 = findViewById(R.id.R05);
        r06 = findViewById(R.id.R06);
        r07 = findViewById(R.id.R07);
        r08 = findViewById(R.id.R08);
        r09 = findViewById(R.id.R09);
        r10 = findViewById(R.id.R10);
        r11 = findViewById(R.id.R11);
        r12 = findViewById(R.id.R12);
        r13 = findViewById(R.id.R13);
        r14 = findViewById(R.id.R14);
        r15 = findViewById(R.id.R15);
        r16 = findViewById(R.id.R16);
        r17 = findViewById(R.id.R17);
        r18 = findViewById(R.id.R18);
        r19 = findViewById(R.id.R19);

        
        s01 = findViewById(R.id.S01);
        s02 = findViewById(R.id.S02);
        s03 = findViewById(R.id.S03);
        s04 = findViewById(R.id.S04);
        s05 = findViewById(R.id.S05);
        s06 = findViewById(R.id.S06);
        s07 = findViewById(R.id.S07);
        s08 = findViewById(R.id.S08);
        s09 = findViewById(R.id.S09);
        s10 = findViewById(R.id.S10);
        s11 = findViewById(R.id.S11);
        s12 = findViewById(R.id.S12);
        s13 = findViewById(R.id.S13);
        s14 = findViewById(R.id.S14);
        s15 = findViewById(R.id.S15);
        s16 = findViewById(R.id.S16);
        s17 = findViewById(R.id.S17);
        s18 = findViewById(R.id.S18);
        s19 = findViewById(R.id.S19);

        t01 = findViewById(R.id.T01);
        t02 = findViewById(R.id.T02);
        t03 = findViewById(R.id.T03);
        t04 = findViewById(R.id.T04);
        t05 = findViewById(R.id.T05);
        t06 = findViewById(R.id.T06);
        t07 = findViewById(R.id.T07);
        t08 = findViewById(R.id.T08);
        t09 = findViewById(R.id.T09);
        t10 = findViewById(R.id.T10);
        t11 = findViewById(R.id.T11);
        t12 = findViewById(R.id.T12);
        t13 = findViewById(R.id.T13);
        t14 = findViewById(R.id.T14);
        t15 = findViewById(R.id.T15);
        t16 = findViewById(R.id.T16);
        t17 = findViewById(R.id.T17);
        t18 = findViewById(R.id.T18);
        t19 = findViewById(R.id.T19);

      //  for(int y = 0; y <= AgentPositions.length; y++){
       //     AgentPositions[y].Gridspot = a01;
      //  }


/**/



        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startflip == 0) {
                    try {
                        randomdisp();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }else {
                    for(int x = 0; x < AgentPositions.length; x++) {
                        try {
                            imagegrant(AgentPositions[x].Gridspot, AgentPositions[x].Agent);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }
        });
        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ClearMethod();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                monsterswapcounter++;
            }
        });
        FasterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             fastercatch++;
            }
        });
        SlowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             slowercatch++;
                slowflip = 1;
            }
        });
        TestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startflip == 0) {
                    try {
                        ClearMethod();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
                startflip = 1;

            }
        });
        EdgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    Edgemonster++;
                }else {
                    Edgemonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(Edgemonster).Health);
                String D = " D" + SetIntToString((int) monstlist(Edgemonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(Edgemonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(Edgemonster).Speed);

                Edge.setText(names(Edgemonster)+H+D+A+S);

            }
        });
        CenterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    Centermonster++;
                }else {
                    Centermonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
           // Centermonster++;


            String H = " H" + SetIntToString((int) monstlist(Centermonster).Health);
            String D = " D" + SetIntToString((int) monstlist(Centermonster).Defense);
            String A = " A" + SetIntToString((int) monstlist(Centermonster).Attack);
            String S = " S" + SetIntToString((int) monstlist(Centermonster).Speed);

            Center.setText(names(Centermonster)+H+D+A+S);
            }
        });
        MedianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    MedianMonster++;
                }else {
                    MedianMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(MedianMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(MedianMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(MedianMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(MedianMonster).Speed);
            Median.setText(names(MedianMonster)+H+D+A+S);
            }
        });
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgentPositions[new Random().nextInt(400)].Agent = monstlist(new Random().nextInt(88));
            }
        });
        Run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    ClearMethod();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }


                if(startflip != 0){
                    for(int x = 0; x < AgentPositions.length; x++) {
                        try {
                            imagegrant(AgentPositions[x].Gridspot, AgentPositions[x].Agent);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                SomekindOfMethod();

            }
        });
        Step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try {
                    ClearMethod();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }


                if(startflip != 0){


                    if (lifeseason == 0) {
                        life++;
                    }

                    if (lifeseason == 1) {
                        life--;
                    }


                    try {
                        AgentDancer();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    for(int x = 0; x < AgentPositions.length; x++) {
                        try {
                            imagegrant(AgentPositions[x].Gridspot, AgentPositions[x].Agent);
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    }

                    if (life >= 47) {
                        lifeseason = 1;
                    }
                    if (life <= 25) {
                        lifeseason = 0;
                    }
                    
                    
                    if (lifeseason == 0){
                        if (life > 32){
                            realseason = "Summer, day ";


                        }else {

                            realseason = "Spring, day ";


                        }
                    }else {


                        if (life > 32){

                            realseason = "Fall, day ";



                        }else {
                            realseason = "Winter, day ";


                        }


                    }

                    datenumber++;

                    datenum = String.format(datenum, datenumber);
                    Seasons.setText(realseason + datenum);
                    datenum = "%s";



                    String H = " H" + SetIntToString((int) monstlist(Edgemonster).Health);
                    String D = " D" + SetIntToString((int) monstlist(Edgemonster).Defense);
                    String A = " A" + SetIntToString((int) monstlist(Edgemonster).Attack);
                    String S = " S" + SetIntToString((int) monstlist(Edgemonster).Speed);

                    Edge.setText(names(Edgemonster)+H+D+A+S +"\n" + SetIntToString(EdgemonsterC));
                    EdgemonsterC = 0;




                    H = " H" + SetIntToString((int) monstlist(Centermonster).Health);
                    D = " D" + SetIntToString((int) monstlist(Centermonster).Defense);
                    A = " A" + SetIntToString((int) monstlist(Centermonster).Attack);
                    S = " S" + SetIntToString((int) monstlist(Centermonster).Speed);

                    Center.setText(names(Centermonster)+H+D+A+S +"\n" + SetIntToString(CentermonsterC));
                    CentermonsterC = 0;


                    H = " H" + SetIntToString((int) monstlist(MedianMonster).Health);
                    D = " D" + SetIntToString((int) monstlist(MedianMonster).Defense);
                    A = " A" + SetIntToString((int) monstlist(MedianMonster).Attack);
                    S = " S" + SetIntToString((int) monstlist(MedianMonster).Speed);

                    Median.setText(names(MedianMonster)+H+D+A+S +"\n" + SetIntToString(MedianMonsterC));
                    MedianMonsterC = 0;


                }else {

                  //  try {
                    //    ClearMethod();
                 //   } catch (CloneNotSupportedException e) {
                 //       e.printStackTrace();
                  //  }

                    try {
                        testFillerMethod();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }


                }
                startflip = 1;


               
            }
        });



        
        




        
        
        

    }

    private String SetIntToString(int num) {
        String k = "%s ";
        return String.format(k, num);
    }

    public void testFillerMethod() throws CloneNotSupportedException {
        testFiller(a01);
        testFiller(a02);
        testFiller(a03);
        testFiller(a04);
        testFiller(a05);
        testFiller(a06);
        testFiller(a07);
        testFiller(a08);
        testFiller(a09);
        testFiller(a10);
        testFiller(a11);
        testFiller(a12);
        testFiller(a13);
        testFiller(a14);
        testFiller(a15);
        testFiller(a16);
        testFiller(a17);
        testFiller(a18);
        testFiller(a19);
        testFiller(a20);

        testFiller(b01);
        testFiller(b02);
        testFiller(b03);
        testFiller(b04);
        testFiller(b05);
        testFiller(b06);
        testFiller(b07);
        testFiller(b08);
        testFiller(b09);
        testFiller(b10);
        testFiller(b11);
        testFiller(b12);
        testFiller(b13);
        testFiller(b14);
        testFiller(b15);
        testFiller(b16);
        testFiller(b17);
        testFiller(b18);
        testFiller(b19);
        testFiller(b20);

        testFiller(c01);
        testFiller(c02);
        testFiller(c03);
        testFiller(c04);
        testFiller(c05);
        testFiller(c06);
        testFiller(c07);
        testFiller(c08);
        testFiller(c09);
        testFiller(c10);
        testFiller(c11);
        testFiller(c12);
        testFiller(c13);
        testFiller(c14);
        testFiller(c15);
        testFiller(c16);
        testFiller(c17);
        testFiller(c18);
        testFiller(c19);
        testFiller(c20);

        testFiller(d01);
        testFiller(d02);
        testFiller(d03);
        testFiller(d04);
        testFiller(d05);
        testFiller(d06);
        testFiller(d07);
        testFiller(d08);
        testFiller(d09);
        testFiller(d10);
        testFiller(d11);
        testFiller(d12);
        testFiller(d13);
        testFiller(d14);
        testFiller(d15);
        testFiller(d16);
        testFiller(d17);
        testFiller(d18);
        testFiller(d19);
        testFiller(d20);

        testFiller(e01);
        testFiller(e02);
        testFiller(e03);
        testFiller(e04);
        testFiller(e05);
        testFiller(e06);
        testFiller(e07);
        testFiller(e08);
        testFiller(e09);
        testFiller(e10);
        testFiller(e11);
        testFiller(e12);
        testFiller(e13);
        testFiller(e14);
        testFiller(e15);
        testFiller(e16);
        testFiller(e17);
        testFiller(e18);
        testFiller(e19);
        testFiller(e20);

        testFiller(f01);
        testFiller(f02);
        testFiller(f03);
        testFiller(f04);
        testFiller(f05);
        testFiller(f06);
        testFiller(f07);
        testFiller(f08);
        testFiller(f09);
        testFiller(f10);
        testFiller(f11);
        testFiller(f12);
        testFiller(f13);
        testFiller(f14);
        testFiller(f15);
        testFiller(f16);
        testFiller(f17);
        testFiller(f18);
        testFiller(f19);
        testFiller(f20);

        testFiller(g01);
        testFiller(g02);
        testFiller(g03);
        testFiller(g04);
        testFiller(g05);
        testFiller(g06);
        testFiller(g07);
        testFiller(g08);
        testFiller(g09);
        testFiller(g10);
        testFiller(g11);
        testFiller(g12);
        testFiller(g13);
        testFiller(g14);
        testFiller(g15);
        testFiller(g16);
        testFiller(g17);
        testFiller(g18);
        testFiller(g19);
        testFiller(g20);

        testFiller(h01);
        testFiller(h02);
        testFiller(h03);
        testFiller(h04);
        testFiller(h05);
        testFiller(h06);
        testFiller(h07);
        testFiller(h08);
        testFiller(h09);
        testFiller(h10);
        testFiller(h11);
        testFiller(h12);
        testFiller(h13);
        testFiller(h14);
        testFiller(h15);
        testFiller(h16);
        testFiller(h17);
        testFiller(h18);
        testFiller(h19);
        testFiller(h20);

        testFiller(i01);
        testFiller(i02);
        testFiller(i03);
        testFiller(i04);
        testFiller(i05);
        testFiller(i06);
        testFiller(i07);
        testFiller(i08);
        testFiller(i09);
        testFiller(i10);
        testFiller(i11);
        testFiller(i12);
        testFiller(i13);
        testFiller(i14);
        testFiller(i15);
        testFiller(i16);
        testFiller(i17);
        testFiller(i18);
        testFiller(i19);
        testFiller(i20);

        testFiller(j01);
        testFiller(j02);
        testFiller(j03);
        testFiller(j04);
        testFiller(j05);
        testFiller(j06);
        testFiller(j07);
        testFiller(j08);
        testFiller(j09);
        testFiller(j10);
        testFiller(j11);
        testFiller(j12);
        testFiller(j13);
        testFiller(j14);
        testFiller(j15);
        testFiller(j16);
        testFiller(j17);
        testFiller(j18);
        testFiller(j19);
        testFiller(j20);

        testFiller(k01);
        testFiller(k02);
        testFiller(k03);
        testFiller(k04);
        testFiller(k05);
        testFiller(k06);
        testFiller(k07);
        testFiller(k08);
        testFiller(k09);
        testFiller(k10);
        testFiller(k11);
        testFiller(k12);
        testFiller(k13);
        testFiller(k14);
        testFiller(k15);
        testFiller(k16);
        testFiller(k17);
        testFiller(k18);
        testFiller(k19);
        testFiller(k20);

        testFiller(l01);
        testFiller(l02);
        testFiller(l03);
        testFiller(l04);
        testFiller(l05);
        testFiller(l06);
        testFiller(l07);
        testFiller(l08);
        testFiller(l09);
        testFiller(l10);
        testFiller(l11);
        testFiller(l12);
        testFiller(l13);
        testFiller(l14);
        testFiller(l15);
        testFiller(l16);
        testFiller(l17);
        testFiller(l18);
        testFiller(l19);
        testFiller(l20);

        testFiller(m01);
        testFiller(m02);
        testFiller(m03);
        testFiller(m04);
        testFiller(m05);
        testFiller(m06);
        testFiller(m07);
        testFiller(m08);
        testFiller(m09);
        testFiller(m10);
        testFiller(m11);
        testFiller(m12);
        testFiller(m13);
        testFiller(m14);
        testFiller(m15);
        testFiller(m16);
        testFiller(m17);
        testFiller(m18);
        testFiller(m19);
        testFiller(m20);

        testFiller(n01);
        testFiller(n02);
        testFiller(n03);
        testFiller(n04);
        testFiller(n05);
        testFiller(n06);
        testFiller(n07);
        testFiller(n08);
        testFiller(n09);
        testFiller(n10);
        testFiller(n11);
        testFiller(n12);
        testFiller(n13);
        testFiller(n14);
        testFiller(n15);
        testFiller(n16);
        testFiller(n17);
        testFiller(n18);
        testFiller(n19);
        testFiller(n20);

        testFiller(o01);
        testFiller(o02);
        testFiller(o03);
        testFiller(o04);
        testFiller(o05);
        testFiller(o06);
        testFiller(o07);
        testFiller(o08);
        testFiller(o09);
        testFiller(o10);
        testFiller(o11);
        testFiller(o12);
        testFiller(o13);
        testFiller(o14);
        testFiller(o15);
        testFiller(o16);
        testFiller(o17);
        testFiller(o18);
        testFiller(o19);
        testFiller(o20);

        testFiller(p01);
        testFiller(p02);
        testFiller(p03);
        testFiller(p04);
        testFiller(p05);
        testFiller(p06);
        testFiller(p07);
        testFiller(p08);
        testFiller(p09);
        testFiller(p10);
        testFiller(p11);
        testFiller(p12);
        testFiller(p13);
        testFiller(p14);
        testFiller(p15);
        testFiller(p16);
        testFiller(p17);
        testFiller(p18);
        testFiller(p19);
        testFiller(p20);

        testFiller(q01);
        testFiller(q02);
        testFiller(q03);
        testFiller(q04);
        testFiller(q05);
        testFiller(q06);
        testFiller(q07);
        testFiller(q08);
        testFiller(q09);
        testFiller(q10);
        testFiller(q11);
        testFiller(q12);
        testFiller(q13);
        testFiller(q14);
        testFiller(q15);
        testFiller(q16);
        testFiller(q17);
        testFiller(q18);
        testFiller(q19);
        testFiller(q20);

        testFiller(r01);
        testFiller(r02);
        testFiller(r03);
        testFiller(r04);
        testFiller(r05);
        testFiller(r06);
        testFiller(r07);
        testFiller(r08);
        testFiller(r09);
        testFiller(r10);
        testFiller(r11);
        testFiller(r12);
        testFiller(r13);
        testFiller(r14);
        testFiller(r15);
        testFiller(r16);
        testFiller(r17);
        testFiller(r18);
        testFiller(r19);
        testFiller(r20);

        testFiller(s01);
        testFiller(s02);
        testFiller(s03);
        testFiller(s04);
        testFiller(s05);
        testFiller(s06);
        testFiller(s07);
        testFiller(s08);
        testFiller(s09);
        testFiller(s10);
        testFiller(s11);
        testFiller(s12);
        testFiller(s13);
        testFiller(s14);
        testFiller(s15);
        testFiller(s16);
        testFiller(s17);
        testFiller(s18);
        testFiller(s19);
        testFiller(s20);

        testFiller(t01);
        testFiller(t02);
        testFiller(t03);
        testFiller(t04);
        testFiller(t05);
        testFiller(t06);
        testFiller(t07);
        testFiller(t08);
        testFiller(t09);
        testFiller(t10);
        testFiller(t11);
        testFiller(t12);
        testFiller(t13);
        testFiller(t14);
        testFiller(t15);
        testFiller(t16);
        testFiller(t17);
        testFiller(t18);
        testFiller(t19);
        testFiller(t20);

        arrayfillercountx = 0;
    }

    public void randomdisp() throws CloneNotSupportedException {

        imagegrant(a01, Kohboh.clone());
        imagegrant(a02, Kohboh.clone());
        imagegrant(a03, Kohboh.clone());
        imagegrant(a04, Kohboh.clone());
        imagegrant(a05, Kohboh.clone());
        imagegrant(a06, Kohboh.clone());
        imagegrant(a07, Kohboh.clone());
        imagegrant(a08, Kohboh.clone());
        imagegrant(a09, Kohboh.clone());
        imagegrant(a10, Kohboh.clone());
        imagegrant(a11, Kohboh.clone());
        imagegrant(a12, Kohboh.clone());
        imagegrant(a13, Kohboh.clone());
        imagegrant(a14, Kohboh.clone());
        imagegrant(a15, Kohboh.clone());
        imagegrant(a16, Kohboh.clone());
        imagegrant(a17, Kohboh.clone());
        imagegrant(a18, Kohboh.clone());
        imagegrant(a19, Kohboh.clone());
        imagegrant(a20, Kohboh.clone());

        imagegrant(b01, Kohboh.clone());
        imagegrant(b02, Kohboh.clone());
        imagegrant(b03, Kohboh.clone());
        imagegrant(b04, Kohboh.clone());
        imagegrant(b05, Kohboh.clone());
        imagegrant(b06, Kohboh.clone());
        imagegrant(b07, Kohboh.clone());
        imagegrant(b08, Kohboh.clone());
        imagegrant(b09, Kohboh.clone());
        imagegrant(b10, Kohboh.clone());
        imagegrant(b11, Kohboh.clone());
        imagegrant(b12, Kohboh.clone());
        imagegrant(b13, Kohboh.clone());
        imagegrant(b14, Kohboh.clone());
        imagegrant(b15, Kohboh.clone());
        imagegrant(b16, Kohboh.clone());
        imagegrant(b17, Kohboh.clone());
        imagegrant(b18, Kohboh.clone());
        imagegrant(b19, Kohboh.clone());
        imagegrant(b20, Kohboh.clone());

        imagegrant(c01, Kohboh.clone());
        imagegrant(c02, Kohboh.clone());
        imagegrant(c03, Kohboh.clone());
        imagegrant(c04, Kohboh.clone());
        imagegrant(c05, Kohboh.clone());
        imagegrant(c06, Kohboh.clone());
        imagegrant(c07, Kohboh.clone());
        imagegrant(c08, Kohboh.clone());
        imagegrant(c09, Kohboh.clone());
        imagegrant(c10, Kohboh.clone());
        imagegrant(c11, Kohboh.clone());
        imagegrant(c12, Kohboh.clone());
        imagegrant(c13, Kohboh.clone());
        imagegrant(c14, Kohboh.clone());
        imagegrant(c15, Kohboh.clone());
        imagegrant(c16, Kohboh.clone());
        imagegrant(c17, Kohboh.clone());
        imagegrant(c18, Kohboh.clone());
        imagegrant(c19, Kohboh.clone());
        imagegrant(c20, Kohboh.clone());

        imagegrant(d01, Kohboh.clone());
        imagegrant(d02, Kohboh.clone());
        imagegrant(d03, Kohboh.clone());
        imagegrant(d04, Kohboh.clone());
        imagegrant(d05, Kohboh.clone());
        imagegrant(d06, Kohboh.clone());
        imagegrant(d07, Kohboh.clone());
        imagegrant(d08, Kohboh.clone());
        imagegrant(d09, Kohboh.clone());
        imagegrant(d10, Kohboh.clone());
        imagegrant(d11, Kohboh.clone());
        imagegrant(d12, Kohboh.clone());
        imagegrant(d13, Kohboh.clone());
        imagegrant(d14, Kohboh.clone());
        imagegrant(d15, Kohboh.clone());
        imagegrant(d16, Kohboh.clone());
        imagegrant(d17, Kohboh.clone());
        imagegrant(d18, Kohboh.clone());
        imagegrant(d19, Kohboh.clone());
        imagegrant(d20, Kohboh.clone());

        imagegrant(e01, Kohboh.clone());
        imagegrant(e02, Kohboh.clone());
        imagegrant(e03, Kohboh.clone());
        imagegrant(e04, Kohboh.clone());
        imagegrant(e05, Kohboh.clone());
        imagegrant(e06, Kohboh.clone());
        imagegrant(e07, Kohboh.clone());
        imagegrant(e08, Kohboh.clone());
        imagegrant(e09, Kohboh.clone());
        imagegrant(e10, Kohboh.clone());
        imagegrant(e11, Kohboh.clone());
        imagegrant(e12, Kohboh.clone());
        imagegrant(e13, Kohboh.clone());
        imagegrant(e14, Kohboh.clone());
        imagegrant(e15, Kohboh.clone());
        imagegrant(e16, Kohboh.clone());
        imagegrant(e17, Kohboh.clone());
        imagegrant(e18, Kohboh.clone());
        imagegrant(e19, Kohboh.clone());
        imagegrant(e20, Kohboh.clone());

        imagegrant(f01, Kohboh.clone());
        imagegrant(f02, Kohboh.clone());
        imagegrant(f03, Kohboh.clone());
        imagegrant(f04, Kohboh.clone());
        imagegrant(f05, Kohboh.clone());
        imagegrant(f06, Kohboh.clone());
        imagegrant(f07, Kohboh.clone());
        imagegrant(f08, Kohboh.clone());
        imagegrant(f09, Kohboh.clone());
        imagegrant(f10, Kohboh.clone());
        imagegrant(f11, Kohboh.clone());
        imagegrant(f12, Kohboh.clone());
        imagegrant(f13, Kohboh.clone());
        imagegrant(f14, Kohboh.clone());
        imagegrant(f15, Kohboh.clone());
        imagegrant(f16, Kohboh.clone());
        imagegrant(f17, Kohboh.clone());
        imagegrant(f18, Kohboh.clone());
        imagegrant(f19, Kohboh.clone());
        imagegrant(f20, Kohboh.clone());

        imagegrant(g01, Kohboh.clone());
        imagegrant(g02, Kohboh.clone());
        imagegrant(g03, Kohboh.clone());
        imagegrant(g04, Kohboh.clone());
        imagegrant(g05, Kohboh.clone());
        imagegrant(g06, Kohboh.clone());
        imagegrant(g07, Kohboh.clone());
        imagegrant(g08, Kohboh.clone());
        imagegrant(g09, Kohboh.clone());
        imagegrant(g10, Kohboh.clone());
        imagegrant(g11, Kohboh.clone());
        imagegrant(g12, Kohboh.clone());
        imagegrant(g13, Kohboh.clone());
        imagegrant(g14, Kohboh.clone());
        imagegrant(g15, Kohboh.clone());
        imagegrant(g16, Kohboh.clone());
        imagegrant(g17, Kohboh.clone());
        imagegrant(g18, Kohboh.clone());
        imagegrant(g19, Kohboh.clone());
        imagegrant(g20, Kohboh.clone());

        imagegrant(h01, Kohboh.clone());
        imagegrant(h02, Kohboh.clone());
        imagegrant(h03, Kohboh.clone());
        imagegrant(h04, Kohboh.clone());
        imagegrant(h05, Kohboh.clone());
        imagegrant(h06, Kohboh.clone());
        imagegrant(h07, Kohboh.clone());
        imagegrant(h08, Kohboh.clone());
        imagegrant(h09, Kohboh.clone());
        imagegrant(h10, Kohboh.clone());
        imagegrant(h11, Kohboh.clone());
        imagegrant(h12, Kohboh.clone());
        imagegrant(h13, Kohboh.clone());
        imagegrant(h14, Kohboh.clone());
        imagegrant(h15, Kohboh.clone());
        imagegrant(h16, Kohboh.clone());
        imagegrant(h17, Kohboh.clone());
        imagegrant(h18, Kohboh.clone());
        imagegrant(h19, Kohboh.clone());
        imagegrant(h20, Kohboh.clone());

        imagegrant(i01, Kohboh.clone());
        imagegrant(i02, Kohboh.clone());
        imagegrant(i03, Kohboh.clone());
        imagegrant(i04, Kohboh.clone());
        imagegrant(i05, Kohboh.clone());
        imagegrant(i06, Kohboh.clone());
        imagegrant(i07, Kohboh.clone());
        imagegrant(i08, Kohboh.clone());
        imagegrant(i09, Kohboh.clone());
        imagegrant(i10, Kohboh.clone());
        imagegrant(i11, Kohboh.clone());
        imagegrant(i12, Kohboh.clone());
        imagegrant(i13, Kohboh.clone());
        imagegrant(i14, Kohboh.clone());
        imagegrant(i15, Kohboh.clone());
        imagegrant(i16, Kohboh.clone());
        imagegrant(i17, Kohboh.clone());
        imagegrant(i18, Kohboh.clone());
        imagegrant(i19, Kohboh.clone());
        imagegrant(i20, Kohboh.clone());

        imagegrant(j01, Kohboh.clone());
        imagegrant(j02, Kohboh.clone());
        imagegrant(j03, Kohboh.clone());
        imagegrant(j04, Kohboh.clone());
        imagegrant(j05, Kohboh.clone());
        imagegrant(j06, Kohboh.clone());
        imagegrant(j07, Kohboh.clone());
        imagegrant(j08, Kohboh.clone());
        imagegrant(j09, Kohboh.clone());
        imagegrant(j10, Kohboh.clone());
        imagegrant(j11, Kohboh.clone());
        imagegrant(j12, Kohboh.clone());
        imagegrant(j13, Kohboh.clone());
        imagegrant(j14, Kohboh.clone());
        imagegrant(j15, Kohboh.clone());
        imagegrant(j16, Kohboh.clone());
        imagegrant(j17, Kohboh.clone());
        imagegrant(j18, Kohboh.clone());
        imagegrant(j19, Kohboh.clone());
        imagegrant(j20, Kohboh.clone());

        imagegrant(k01, Kohboh.clone());
        imagegrant(k02, Kohboh.clone());
        imagegrant(k03, Kohboh.clone());
        imagegrant(k04, Kohboh.clone());
        imagegrant(k05, Kohboh.clone());
        imagegrant(k06, Kohboh.clone());
        imagegrant(k07, Kohboh.clone());
        imagegrant(k08, Kohboh.clone());
        imagegrant(k09, Kohboh.clone());
        imagegrant(k10, Kohboh.clone());
        imagegrant(k11, Kohboh.clone());
        imagegrant(k12, Kohboh.clone());
        imagegrant(k13, Kohboh.clone());
        imagegrant(k14, Kohboh.clone());
        imagegrant(k15, Kohboh.clone());
        imagegrant(k16, Kohboh.clone());
        imagegrant(k17, Kohboh.clone());
        imagegrant(k18, Kohboh.clone());
        imagegrant(k19, Kohboh.clone());
        imagegrant(k20, Kohboh.clone());

        imagegrant(l01, Kohboh.clone());
        imagegrant(l02, Kohboh.clone());
        imagegrant(l03, Kohboh.clone());
        imagegrant(l04, Kohboh.clone());
        imagegrant(l05, Kohboh.clone());
        imagegrant(l06, Kohboh.clone());
        imagegrant(l07, Kohboh.clone());
        imagegrant(l08, Kohboh.clone());
        imagegrant(l09, Kohboh.clone());
        imagegrant(l10, Kohboh.clone());
        imagegrant(l11, Kohboh.clone());
        imagegrant(l12, Kohboh.clone());
        imagegrant(l13, Kohboh.clone());
        imagegrant(l14, Kohboh.clone());
        imagegrant(l15, Kohboh.clone());
        imagegrant(l16, Kohboh.clone());
        imagegrant(l17, Kohboh.clone());
        imagegrant(l18, Kohboh.clone());
        imagegrant(l19, Kohboh.clone());
        imagegrant(l20, Kohboh.clone());

        imagegrant(m01, Kohboh.clone());
        imagegrant(m02, Kohboh.clone());
        imagegrant(m03, Kohboh.clone());
        imagegrant(m04, Kohboh.clone());
        imagegrant(m05, Kohboh.clone());
        imagegrant(m06, Kohboh.clone());
        imagegrant(m07, Kohboh.clone());
        imagegrant(m08, Kohboh.clone());
        imagegrant(m09, Kohboh.clone());
        imagegrant(m10, Kohboh.clone());
        imagegrant(m11, Kohboh.clone());
        imagegrant(m12, Kohboh.clone());
        imagegrant(m13, Kohboh.clone());
        imagegrant(m14, Kohboh.clone());
        imagegrant(m15, Kohboh.clone());
        imagegrant(m16, Kohboh.clone());
        imagegrant(m17, Kohboh.clone());
        imagegrant(m18, Kohboh.clone());
        imagegrant(m19, Kohboh.clone());
        imagegrant(m20, Kohboh.clone());

        imagegrant(n01, Kohboh.clone());
        imagegrant(n02, Kohboh.clone());
        imagegrant(n03, Kohboh.clone());
        imagegrant(n04, Kohboh.clone());
        imagegrant(n05, Kohboh.clone());
        imagegrant(n06, Kohboh.clone());
        imagegrant(n07, Kohboh.clone());
        imagegrant(n08, Kohboh.clone());
        imagegrant(n09, Kohboh.clone());
        imagegrant(n10, Kohboh.clone());
        imagegrant(n11, Kohboh.clone());
        imagegrant(n12, Kohboh.clone());
        imagegrant(n13, Kohboh.clone());
        imagegrant(n14, Kohboh.clone());
        imagegrant(n15, Kohboh.clone());
        imagegrant(n16, Kohboh.clone());
        imagegrant(n17, Kohboh.clone());
        imagegrant(n18, Kohboh.clone());
        imagegrant(n19, Kohboh.clone());
        imagegrant(n20, Kohboh.clone());

        imagegrant(o01, Kohboh.clone());
        imagegrant(o02, Kohboh.clone());
        imagegrant(o03, Kohboh.clone());
        imagegrant(o04, Kohboh.clone());
        imagegrant(o05, Kohboh.clone());
        imagegrant(o06, Kohboh.clone());
        imagegrant(o07, Kohboh.clone());
        imagegrant(o08, Kohboh.clone());
        imagegrant(o09, Kohboh.clone());
        imagegrant(o10, Kohboh.clone());
        imagegrant(o11, Kohboh.clone());
        imagegrant(o12, Kohboh.clone());
        imagegrant(o13, Kohboh.clone());
        imagegrant(o14, Kohboh.clone());
        imagegrant(o15, Kohboh.clone());
        imagegrant(o16, Kohboh.clone());
        imagegrant(o17, Kohboh.clone());
        imagegrant(o18, Kohboh.clone());
        imagegrant(o19, Kohboh.clone());
        imagegrant(o20, Kohboh.clone());

        imagegrant(p01, Kohboh.clone());
        imagegrant(p02, Kohboh.clone());
        imagegrant(p03, Kohboh.clone());
        imagegrant(p04, Kohboh.clone());
        imagegrant(p05, Kohboh.clone());
        imagegrant(p06, Kohboh.clone());
        imagegrant(p07, Kohboh.clone());
        imagegrant(p08, Kohboh.clone());
        imagegrant(p09, Kohboh.clone());
        imagegrant(p10, Kohboh.clone());
        imagegrant(p11, Kohboh.clone());
        imagegrant(p12, Kohboh.clone());
        imagegrant(p13, Kohboh.clone());
        imagegrant(p14, Kohboh.clone());
        imagegrant(p15, Kohboh.clone());
        imagegrant(p16, Kohboh.clone());
        imagegrant(p17, Kohboh.clone());
        imagegrant(p18, Kohboh.clone());
        imagegrant(p19, Kohboh.clone());
        imagegrant(p20, Kohboh.clone());

        imagegrant(q01, Kohboh.clone());
        imagegrant(q02, Kohboh.clone());
        imagegrant(q03, Kohboh.clone());
        imagegrant(q04, Kohboh.clone());
        imagegrant(q05, Kohboh.clone());
        imagegrant(q06, Kohboh.clone());
        imagegrant(q07, Kohboh.clone());
        imagegrant(q08, Kohboh.clone());
        imagegrant(q09, Kohboh.clone());
        imagegrant(q10, Kohboh.clone());
        imagegrant(q11, Kohboh.clone());
        imagegrant(q12, Kohboh.clone());
        imagegrant(q13, Kohboh.clone());
        imagegrant(q14, Kohboh.clone());
        imagegrant(q15, Kohboh.clone());
        imagegrant(q16, Kohboh.clone());
        imagegrant(q17, Kohboh.clone());
        imagegrant(q18, Kohboh.clone());
        imagegrant(q19, Kohboh.clone());
        imagegrant(q20, Kohboh.clone());

        imagegrant(r01, Kohboh.clone());
        imagegrant(r02, Kohboh.clone());
        imagegrant(r03, Kohboh.clone());
        imagegrant(r04, Kohboh.clone());
        imagegrant(r05, Kohboh.clone());
        imagegrant(r06, Kohboh.clone());
        imagegrant(r07, Kohboh.clone());
        imagegrant(r08, Kohboh.clone());
        imagegrant(r09, Kohboh.clone());
        imagegrant(r10, Kohboh.clone());
        imagegrant(r11, Kohboh.clone());
        imagegrant(r12, Kohboh.clone());
        imagegrant(r13, Kohboh.clone());
        imagegrant(r14, Kohboh.clone());
        imagegrant(r15, Kohboh.clone());
        imagegrant(r16, Kohboh.clone());
        imagegrant(r17, Kohboh.clone());
        imagegrant(r18, Kohboh.clone());
        imagegrant(r19, Kohboh.clone());
        imagegrant(r20, Kohboh.clone());

        imagegrant(s01, Kohboh.clone());
        imagegrant(s02, Kohboh.clone());
        imagegrant(s03, Kohboh.clone());
        imagegrant(s04, Kohboh.clone());
        imagegrant(s05, Kohboh.clone());
        imagegrant(s06, Kohboh.clone());
        imagegrant(s07, Kohboh.clone());
        imagegrant(s08, Kohboh.clone());
        imagegrant(s09, Kohboh.clone());
        imagegrant(s10, Kohboh.clone());
        imagegrant(s11, Kohboh.clone());
        imagegrant(s12, Kohboh.clone());
        imagegrant(s13, Kohboh.clone());
        imagegrant(s14, Kohboh.clone());
        imagegrant(s15, Kohboh.clone());
        imagegrant(s16, Kohboh.clone());
        imagegrant(s17, Kohboh.clone());
        imagegrant(s18, Kohboh.clone());
        imagegrant(s19, Kohboh.clone());
        imagegrant(s20, Kohboh.clone());

        imagegrant(t01, Kohboh.clone());
        imagegrant(t02, Kohboh.clone());
        imagegrant(t03, Kohboh.clone());
        imagegrant(t04, Kohboh.clone());
        imagegrant(t05, Kohboh.clone());
        imagegrant(t06, Kohboh.clone());
        imagegrant(t07, Kohboh.clone());
        imagegrant(t08, Kohboh.clone());
        imagegrant(t09, Kohboh.clone());
        imagegrant(t10, Kohboh.clone());
        imagegrant(t11, Kohboh.clone());
        imagegrant(t12, Kohboh.clone());
        imagegrant(t13, Kohboh.clone());
        imagegrant(t14, Kohboh.clone());
        imagegrant(t15, Kohboh.clone());
        imagegrant(t16, Kohboh.clone());
        imagegrant(t17, Kohboh.clone());
        imagegrant(t18, Kohboh.clone());
        imagegrant(t19, Kohboh.clone());
        imagegrant(t20, Kohboh.clone());

        Filler(a01);
        Filler(a02);
        Filler(a03);
        Filler(a04);
        Filler(a05);
        Filler(a06);
        Filler(a07);
        Filler(a08);
        Filler(a09);
        Filler(a10);
        Filler(a11);
        Filler(a12);
        Filler(a13);
        Filler(a14);
        Filler(a15);
        Filler(a16);
        Filler(a17);
        Filler(a18);
        Filler(a19);
        Filler(a20);

        Filler(b01);
        Filler(b02);
        Filler(b03);
        Filler(b04);
        Filler(b05);
        Filler(b06);
        Filler(b07);
        Filler(b08);
        Filler(b09);
        Filler(b10);
        Filler(b11);
        Filler(b12);
        Filler(b13);
        Filler(b14);
        Filler(b15);
        Filler(b16);
        Filler(b17);
        Filler(b18);
        Filler(b19);
        Filler(b20);

        Filler(c01);
        Filler(c02);
        Filler(c03);
        Filler(c04);
        Filler(c05);
        Filler(c06);
        Filler(c07);
        Filler(c08);
        Filler(c09);
        Filler(c10);
        Filler(c11);
        Filler(c12);
        Filler(c13);
        Filler(c14);
        Filler(c15);
        Filler(c16);
        Filler(c17);
        Filler(c18);
        Filler(c19);
        Filler(c20);

        Filler(d01);
        Filler(d02);
        Filler(d03);
        Filler(d04);
        Filler(d05);
        Filler(d06);
        Filler(d07);
        Filler(d08);
        Filler(d09);
        Filler(d10);
        Filler(d11);
        Filler(d12);
        Filler(d13);
        Filler(d14);
        Filler(d15);
        Filler(d16);
        Filler(d17);
        Filler(d18);
        Filler(d19);
        Filler(d20);

        Filler(e01);
        Filler(e02);
        Filler(e03);
        Filler(e04);
        Filler(e05);
        Filler(e06);
        Filler(e07);
        Filler(e08);
        Filler(e09);
        Filler(e10);
        Filler(e11);
        Filler(e12);
        Filler(e13);
        Filler(e14);
        Filler(e15);
        Filler(e16);
        Filler(e17);
        Filler(e18);
        Filler(e19);
        Filler(e20);

        Filler(f01);
        Filler(f02);
        Filler(f03);
        Filler(f04);
        Filler(f05);
        Filler(f06);
        Filler(f07);
        Filler(f08);
        Filler(f09);
        Filler(f10);
        Filler(f11);
        Filler(f12);
        Filler(f13);
        Filler(f14);
        Filler(f15);
        Filler(f16);
        Filler(f17);
        Filler(f18);
        Filler(f19);
        Filler(f20);

        Filler(g01);
        Filler(g02);
        Filler(g03);
        Filler(g04);
        Filler(g05);
        Filler(g06);
        Filler(g07);
        Filler(g08);
        Filler(g09);
        Filler(g10);
        Filler(g11);
        Filler(g12);
        Filler(g13);
        Filler(g14);
        Filler(g15);
        Filler(g16);
        Filler(g17);
        Filler(g18);
        Filler(g19);
        Filler(g20);

        Filler(h01);
        Filler(h02);
        Filler(h03);
        Filler(h04);
        Filler(h05);
        Filler(h06);
        Filler(h07);
        Filler(h08);
        Filler(h09);
        Filler(h10);
        Filler(h11);
        Filler(h12);
        Filler(h13);
        Filler(h14);
        Filler(h15);
        Filler(h16);
        Filler(h17);
        Filler(h18);
        Filler(h19);
        Filler(h20);

        Filler(i01);
        Filler(i02);
        Filler(i03);
        Filler(i04);
        Filler(i05);
        Filler(i06);
        Filler(i07);
        Filler(i08);
        Filler(i09);
        Filler(i10);
        Filler(i11);
        Filler(i12);
        Filler(i13);
        Filler(i14);
        Filler(i15);
        Filler(i16);
        Filler(i17);
        Filler(i18);
        Filler(i19);
        Filler(i20);

        Filler(j01);
        Filler(j02);
        Filler(j03);
        Filler(j04);
        Filler(j05);
        Filler(j06);
        Filler(j07);
        Filler(j08);
        Filler(j09);
        Filler(j10);
        Filler(j11);
        Filler(j12);
        Filler(j13);
        Filler(j14);
        Filler(j15);
        Filler(j16);
        Filler(j17);
        Filler(j18);
        Filler(j19);
        Filler(j20);

        Filler(k01);
        Filler(k02);
        Filler(k03);
        Filler(k04);
        Filler(k05);
        Filler(k06);
        Filler(k07);
        Filler(k08);
        Filler(k09);
        Filler(k10);
        Filler(k11);
        Filler(k12);
        Filler(k13);
        Filler(k14);
        Filler(k15);
        Filler(k16);
        Filler(k17);
        Filler(k18);
        Filler(k19);
        Filler(k20);

        Filler(l01);
        Filler(l02);
        Filler(l03);
        Filler(l04);
        Filler(l05);
        Filler(l06);
        Filler(l07);
        Filler(l08);
        Filler(l09);
        Filler(l10);
        Filler(l11);
        Filler(l12);
        Filler(l13);
        Filler(l14);
        Filler(l15);
        Filler(l16);
        Filler(l17);
        Filler(l18);
        Filler(l19);
        Filler(l20);

        Filler(m01);
        Filler(m02);
        Filler(m03);
        Filler(m04);
        Filler(m05);
        Filler(m06);
        Filler(m07);
        Filler(m08);
        Filler(m09);
        Filler(m10);
        Filler(m11);
        Filler(m12);
        Filler(m13);
        Filler(m14);
        Filler(m15);
        Filler(m16);
        Filler(m17);
        Filler(m18);
        Filler(m19);
        Filler(m20);

        Filler(n01);
        Filler(n02);
        Filler(n03);
        Filler(n04);
        Filler(n05);
        Filler(n06);
        Filler(n07);
        Filler(n08);
        Filler(n09);
        Filler(n10);
        Filler(n11);
        Filler(n12);
        Filler(n13);
        Filler(n14);
        Filler(n15);
        Filler(n16);
        Filler(n17);
        Filler(n18);
        Filler(n19);
        Filler(n20);

        Filler(o01);
        Filler(o02);
        Filler(o03);
        Filler(o04);
        Filler(o05);
        Filler(o06);
        Filler(o07);
        Filler(o08);
        Filler(o09);
        Filler(o10);
        Filler(o11);
        Filler(o12);
        Filler(o13);
        Filler(o14);
        Filler(o15);
        Filler(o16);
        Filler(o17);
        Filler(o18);
        Filler(o19);
        Filler(o20);

        Filler(p01);
        Filler(p02);
        Filler(p03);
        Filler(p04);
        Filler(p05);
        Filler(p06);
        Filler(p07);
        Filler(p08);
        Filler(p09);
        Filler(p10);
        Filler(p11);
        Filler(p12);
        Filler(p13);
        Filler(p14);
        Filler(p15);
        Filler(p16);
        Filler(p17);
        Filler(p18);
        Filler(p19);
        Filler(p20);

        Filler(q01);
        Filler(q02);
        Filler(q03);
        Filler(q04);
        Filler(q05);
        Filler(q06);
        Filler(q07);
        Filler(q08);
        Filler(q09);
        Filler(q10);
        Filler(q11);
        Filler(q12);
        Filler(q13);
        Filler(q14);
        Filler(q15);
        Filler(q16);
        Filler(q17);
        Filler(q18);
        Filler(q19);
        Filler(q20);

        Filler(r01);
        Filler(r02);
        Filler(r03);
        Filler(r04);
        Filler(r05);
        Filler(r06);
        Filler(r07);
        Filler(r08);
        Filler(r09);
        Filler(r10);
        Filler(r11);
        Filler(r12);
        Filler(r13);
        Filler(r14);
        Filler(r15);
        Filler(r16);
        Filler(r17);
        Filler(r18);
        Filler(r19);
        Filler(r20);

        Filler(s01);
        Filler(s02);
        Filler(s03);
        Filler(s04);
        Filler(s05);
        Filler(s06);
        Filler(s07);
        Filler(s08);
        Filler(s09);
        Filler(s10);
        Filler(s11);
        Filler(s12);
        Filler(s13);
        Filler(s14);
        Filler(s15);
        Filler(s16);
        Filler(s17);
        Filler(s18);
        Filler(s19);
        Filler(s20);

        Filler(t01);
        Filler(t02);
        Filler(t03);
        Filler(t04);
        Filler(t05);
        Filler(t06);
        Filler(t07);
        Filler(t08);
        Filler(t09);
        Filler(t10);
        Filler(t11);
        Filler(t12);
        Filler(t13);
        Filler(t14);
        Filler(t15);
        Filler(t16);
        Filler(t17);
        Filler(t18);
        Filler(t19);
        Filler(t20);





    }
     public void ClearMethod() throws CloneNotSupportedException {

        Clearimage(a01);
        Clearimage(a02);
        Clearimage(a03);
        Clearimage(a04);
        Clearimage(a05);
        Clearimage(a06);
        Clearimage(a07);
        Clearimage(a08);
        Clearimage(a09);
        Clearimage(a10);
        Clearimage(a11);
        Clearimage(a12);
        Clearimage(a13);
        Clearimage(a14);
        Clearimage(a15);
        Clearimage(a16);
        Clearimage(a17);
        Clearimage(a18);
        Clearimage(a19);
        Clearimage(a20);

        Clearimage(b01);
        Clearimage(b02);
        Clearimage(b03);
        Clearimage(b04);
        Clearimage(b05);
        Clearimage(b06);
        Clearimage(b07);
        Clearimage(b08);
        Clearimage(b09);
        Clearimage(b10);
        Clearimage(b11);
        Clearimage(b12);
        Clearimage(b13);
        Clearimage(b14);
        Clearimage(b15);
        Clearimage(b16);
        Clearimage(b17);
        Clearimage(b18);
        Clearimage(b19);
        Clearimage(b20);

        Clearimage(c01);
        Clearimage(c02);
        Clearimage(c03);
        Clearimage(c04);
        Clearimage(c05);
        Clearimage(c06);
        Clearimage(c07);
        Clearimage(c08);
        Clearimage(c09);
        Clearimage(c10);
        Clearimage(c11);
        Clearimage(c12);
        Clearimage(c13);
        Clearimage(c14);
        Clearimage(c15);
        Clearimage(c16);
        Clearimage(c17);
        Clearimage(c18);
        Clearimage(c19);
        Clearimage(c20);

        Clearimage(d01);
        Clearimage(d02);
        Clearimage(d03);
        Clearimage(d04);
        Clearimage(d05);
        Clearimage(d06);
        Clearimage(d07);
        Clearimage(d08);
        Clearimage(d09);
        Clearimage(d10);
        Clearimage(d11);
        Clearimage(d12);
        Clearimage(d13);
        Clearimage(d14);
        Clearimage(d15);
        Clearimage(d16);
        Clearimage(d17);
        Clearimage(d18);
        Clearimage(d19);
        Clearimage(d20);

        Clearimage(e01);
        Clearimage(e02);
        Clearimage(e03);
        Clearimage(e04);
        Clearimage(e05);
        Clearimage(e06);
        Clearimage(e07);
        Clearimage(e08);
        Clearimage(e09);
        Clearimage(e10);
        Clearimage(e11);
        Clearimage(e12);
        Clearimage(e13);
        Clearimage(e14);
        Clearimage(e15);
        Clearimage(e16);
        Clearimage(e17);
        Clearimage(e18);
        Clearimage(e19);
        Clearimage(e20);

        Clearimage(f01);
        Clearimage(f02);
        Clearimage(f03);
        Clearimage(f04);
        Clearimage(f05);
        Clearimage(f06);
        Clearimage(f07);
        Clearimage(f08);
        Clearimage(f09);
        Clearimage(f10);
        Clearimage(f11);
        Clearimage(f12);
        Clearimage(f13);
        Clearimage(f14);
        Clearimage(f15);
        Clearimage(f16);
        Clearimage(f17);
        Clearimage(f18);
        Clearimage(f19);
        Clearimage(f20);

        Clearimage(g01);
        Clearimage(g02);
        Clearimage(g03);
        Clearimage(g04);
        Clearimage(g05);
        Clearimage(g06);
        Clearimage(g07);
        Clearimage(g08);
        Clearimage(g09);
        Clearimage(g10);
        Clearimage(g11);
        Clearimage(g12);
        Clearimage(g13);
        Clearimage(g14);
        Clearimage(g15);
        Clearimage(g16);
        Clearimage(g17);
        Clearimage(g18);
        Clearimage(g19);
        Clearimage(g20);

        Clearimage(h01);
        Clearimage(h02);
        Clearimage(h03);
        Clearimage(h04);
        Clearimage(h05);
        Clearimage(h06);
        Clearimage(h07);
        Clearimage(h08);
        Clearimage(h09);
        Clearimage(h10);
        Clearimage(h11);
        Clearimage(h12);
        Clearimage(h13);
        Clearimage(h14);
        Clearimage(h15);
        Clearimage(h16);
        Clearimage(h17);
        Clearimage(h18);
        Clearimage(h19);
        Clearimage(h20);

        Clearimage(i01);
        Clearimage(i02);
        Clearimage(i03);
        Clearimage(i04);
        Clearimage(i05);
        Clearimage(i06);
        Clearimage(i07);
        Clearimage(i08);
        Clearimage(i09);
        Clearimage(i10);
        Clearimage(i11);
        Clearimage(i12);
        Clearimage(i13);
        Clearimage(i14);
        Clearimage(i15);
        Clearimage(i16);
        Clearimage(i17);
        Clearimage(i18);
        Clearimage(i19);
        Clearimage(i20);

        Clearimage(j01);
        Clearimage(j02);
        Clearimage(j03);
        Clearimage(j04);
        Clearimage(j05);
        Clearimage(j06);
        Clearimage(j07);
        Clearimage(j08);
        Clearimage(j09);
        Clearimage(j10);
        Clearimage(j11);
        Clearimage(j12);
        Clearimage(j13);
        Clearimage(j14);
        Clearimage(j15);
        Clearimage(j16);
        Clearimage(j17);
        Clearimage(j18);
        Clearimage(j19);
        Clearimage(j20);

        Clearimage(k01);
        Clearimage(k02);
        Clearimage(k03);
        Clearimage(k04);
        Clearimage(k05);
        Clearimage(k06);
        Clearimage(k07);
        Clearimage(k08);
        Clearimage(k09);
        Clearimage(k10);
        Clearimage(k11);
        Clearimage(k12);
        Clearimage(k13);
        Clearimage(k14);
        Clearimage(k15);
        Clearimage(k16);
        Clearimage(k17);
        Clearimage(k18);
        Clearimage(k19);
        Clearimage(k20);

        Clearimage(l01);
        Clearimage(l02);
        Clearimage(l03);
        Clearimage(l04);
        Clearimage(l05);
        Clearimage(l06);
        Clearimage(l07);
        Clearimage(l08);
        Clearimage(l09);
        Clearimage(l10);
        Clearimage(l11);
        Clearimage(l12);
        Clearimage(l13);
        Clearimage(l14);
        Clearimage(l15);
        Clearimage(l16);
        Clearimage(l17);
        Clearimage(l18);
        Clearimage(l19);
        Clearimage(l20);

        Clearimage(m01);
        Clearimage(m02);
        Clearimage(m03);
        Clearimage(m04);
        Clearimage(m05);
        Clearimage(m06);
        Clearimage(m07);
        Clearimage(m08);
        Clearimage(m09);
        Clearimage(m10);
        Clearimage(m11);
        Clearimage(m12);
        Clearimage(m13);
        Clearimage(m14);
        Clearimage(m15);
        Clearimage(m16);
        Clearimage(m17);
        Clearimage(m18);
        Clearimage(m19);
        Clearimage(m20);

        Clearimage(n01);
        Clearimage(n02);
        Clearimage(n03);
        Clearimage(n04);
        Clearimage(n05);
        Clearimage(n06);
        Clearimage(n07);
        Clearimage(n08);
        Clearimage(n09);
        Clearimage(n10);
        Clearimage(n11);
        Clearimage(n12);
        Clearimage(n13);
        Clearimage(n14);
        Clearimage(n15);
        Clearimage(n16);
        Clearimage(n17);
        Clearimage(n18);
        Clearimage(n19);
        Clearimage(n20);

        Clearimage(o01);
        Clearimage(o02);
        Clearimage(o03);
        Clearimage(o04);
        Clearimage(o05);
        Clearimage(o06);
        Clearimage(o07);
        Clearimage(o08);
        Clearimage(o09);
        Clearimage(o10);
        Clearimage(o11);
        Clearimage(o12);
        Clearimage(o13);
        Clearimage(o14);
        Clearimage(o15);
        Clearimage(o16);
        Clearimage(o17);
        Clearimage(o18);
        Clearimage(o19);
        Clearimage(o20);

        Clearimage(p01);
        Clearimage(p02);
        Clearimage(p03);
        Clearimage(p04);
        Clearimage(p05);
        Clearimage(p06);
        Clearimage(p07);
        Clearimage(p08);
        Clearimage(p09);
        Clearimage(p10);
        Clearimage(p11);
        Clearimage(p12);
        Clearimage(p13);
        Clearimage(p14);
        Clearimage(p15);
        Clearimage(p16);
        Clearimage(p17);
        Clearimage(p18);
        Clearimage(p19);
        Clearimage(p20);

        Clearimage(q01);
        Clearimage(q02);
        Clearimage(q03);
        Clearimage(q04);
        Clearimage(q05);
        Clearimage(q06);
        Clearimage(q07);
        Clearimage(q08);
        Clearimage(q09);
        Clearimage(q10);
        Clearimage(q11);
        Clearimage(q12);
        Clearimage(q13);
        Clearimage(q14);
        Clearimage(q15);
        Clearimage(q16);
        Clearimage(q17);
        Clearimage(q18);
        Clearimage(q19);
        Clearimage(q20);

        Clearimage(r01);
        Clearimage(r02);
        Clearimage(r03);
        Clearimage(r04);
        Clearimage(r05);
        Clearimage(r06);
        Clearimage(r07);
        Clearimage(r08);
        Clearimage(r09);
        Clearimage(r10);
        Clearimage(r11);
        Clearimage(r12);
        Clearimage(r13);
        Clearimage(r14);
        Clearimage(r15);
        Clearimage(r16);
        Clearimage(r17);
        Clearimage(r18);
        Clearimage(r19);
        Clearimage(r20);

        Clearimage(s01);
        Clearimage(s02);
        Clearimage(s03);
        Clearimage(s04);
        Clearimage(s05);
        Clearimage(s06);
        Clearimage(s07);
        Clearimage(s08);
        Clearimage(s09);
        Clearimage(s10);
        Clearimage(s11);
        Clearimage(s12);
        Clearimage(s13);
        Clearimage(s14);
        Clearimage(s15);
        Clearimage(s16);
        Clearimage(s17);
        Clearimage(s18);
        Clearimage(s19);
        Clearimage(s20);

        Clearimage(t01);
        Clearimage(t02);
        Clearimage(t03);
        Clearimage(t04);
        Clearimage(t05);
        Clearimage(t06);
        Clearimage(t07);
        Clearimage(t08);
        Clearimage(t09);
        Clearimage(t10);
        Clearimage(t11);
        Clearimage(t12);
        Clearimage(t13);
        Clearimage(t14);
        Clearimage(t15);
        Clearimage(t16);
        Clearimage(t17);
        Clearimage(t18);
        Clearimage(t19);
        Clearimage(t20);





    }

    public  void Clearimage(ImageView A) throws CloneNotSupportedException {
        if (arrayfillercount < AgentPositions.length){
            AgentPositions[arrayfillercount].Gridspot = A;
            if(new Random().nextInt(70 ) >= 57) {
                AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(88)+1).clone();
            }else {
                AgentPositions[arrayfillercount].Agent = monstlist(88).clone();
            }
            arrayfillercount++;
        }
    /*  if(arrayfillercount == AgentPositions.length){
            Daahnida.Moveslotheal = 2;
            Daahnida.Moveslotattack = 6;
            Daahnida.Moveslotspeed = 6;
            AgentPositions[50].Agent = Daahnida.clone();
            AgentPositions[71].Agent = Daahnida.clone();
            AgentPositions[92].Agent = Daahnida.clone();
            AgentPositions[113].Agent = Daahnida.clone();
            AgentPositions[134].Agent = Daahnida.clone();
        }*/

        A.setImageResource(R.drawable.emptysquare);

    }
    public  void Filler(ImageView A) throws CloneNotSupportedException {
        if (arrayfillercount < AgentPositions.length){
            AgentPositions[arrayfillercount].Gridspot = A;
            if(arrayfillercount % 3 == 1) {
              //  AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87)).clone();
                AgentPositions[arrayfillercount].Agent = monstlist(23).clone();
            }else if (arrayfillercount % 3 == 0){
                AgentPositions[arrayfillercount].Agent = monstlist(25).clone();
            }else {
                AgentPositions[arrayfillercount].Agent = monstlist(19).clone();
            }
            arrayfillercount++;
            /*
            if(new Random().nextInt(70 ) >= 0) {
              //  AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87)).clone();
                AgentPositions[arrayfillercount].Agent = monstlist(22).clone();
            }else {
                AgentPositions[arrayfillercount].Agent = monstlist(87).clone();
            }
            arrayfillercount++;*/
        }

      /*  if(arrayfillercount == AgentPositions.length){
            Daahnida.Moveslotheal = 2;
            Daahnida.Moveslotattack = 6;
            Daahnida.Moveslotspeed = 6;
            AgentPositions[50].Agent = Daahnida.clone();
            AgentPositions[71].Agent = Daahnida.clone();
            AgentPositions[92].Agent = Daahnida.clone();
            AgentPositions[113].Agent = Daahnida.clone();
            AgentPositions[134].Agent = Daahnida.clone();
        }
        if(arrayfillercount == AgentPositions.length){
            AgentPositions[210].Agent = Haptozahen.clone();
            AgentPositions[211].Agent = Haptozahen.clone();
            AgentPositions[230].Agent = Haptozahen.clone();
            AgentPositions[231].Agent = Haptozahen.clone();
        }*/

    }
    public  void testFiller(ImageView A) throws CloneNotSupportedException {



        if(slowflip == 0){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 3) == 1) {
                    //  AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87)).clone();
                    AgentPositions[arrayfillercountx].Agent = monstlist(Edgemonster).clone();
                } else if ((arrayfillercountx % 3) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(Centermonster).clone();
                } else {
                    AgentPositions[arrayfillercountx].Agent = monstlist(MedianMonster).clone();
                }
                arrayfillercountx++;
            /*
            if(new Random().nextInt(70 ) >= 0) {
              //  AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87)).clone();
                AgentPositions[arrayfillercount].Agent = monstlist(22).clone();
            }else {
                AgentPositions[arrayfillercount].Agent = monstlist(87).clone();
            }
            arrayfillercount++;*/
            }
        }else {
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 20) <= 6) {
                    //  AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87)).clone();
                    AgentPositions[arrayfillercountx].Agent = monstlist(Edgemonster).clone();
                } else if ((arrayfillercountx % 20) <= 13) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(Centermonster).clone();
                } else {
                    AgentPositions[arrayfillercountx].Agent = monstlist(MedianMonster).clone();
                }
                arrayfillercountx++;
            }
        }

      /*  if(arrayfillercount == AgentPositions.length){
            Daahnida.Moveslotheal = 2;
            Daahnida.Moveslotattack = 6;
            Daahnida.Moveslotspeed = 6;
            AgentPositions[50].Agent = Daahnida.clone();
            AgentPositions[71].Agent = Daahnida.clone();
            AgentPositions[92].Agent = Daahnida.clone();
            AgentPositions[113].Agent = Daahnida.clone();
            AgentPositions[134].Agent = Daahnida.clone();
        }*/
       // if(arrayfillercount == AgentPositions.length){
            
       //     AgentPositions[209].Agent = monstlist(Centermonster).clone();
       //     AgentPositions[210].Agent = monstlist(Centermonster).clone();
       //     AgentPositions[229].Agent = monstlist(Centermonster).clone();
       //     AgentPositions[230].Agent = monstlist(Centermonster).clone();
       // }

    }


    public void imagegrant(ImageView PlayerDisplay, protomon.monst Dummy) throws CloneNotSupportedException {

     //   if (arrayfillercount < AgentPositions.length){
     //       AgentPositions[arrayfillercount].Gridspot = PlayerDisplay;
     //       AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(87));
     //       arrayfillercount++;
     //   }

        PlayerDisplay.setColorFilter(Color.argb(0, 0, 0, 0));

        
        if(monsterswapcounter > 2){
           // Dummy.Idnum = 22;
            Dummy = Daahnida.clone();
            Daahnida.UniqueID = UniqueIdentifier(0);
        }

        if(catcher == 0) {
            //(int) (new Random().nextInt(86))
            switchroller = switchroller++;
            switchroller = (switchroller % 86) + 1;
            // switchroller = 22;
        }else {
            switchroller = 22;
        }
        switch((int) (Dummy.Idnum)){  // Dummy.Idnum

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
                if (Dummy.UniqueID< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaume);
                }else if(Dummy.UniqueID< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumer);
                }else if(Dummy.UniqueID< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.zaumeb);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.zaumeg);
                }
                break;
            case 6:

                if (Dummy.UniqueID< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.nhainhai);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.nhainhaii);
                }
                break;
            case 7:
                PlayerDisplay.setImageResource(R.drawable.degeissdt);
                break;
            case 8:
                if (Dummy.UniqueID< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.yuggle);
                }else if(Dummy.UniqueID< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglee);
                }else if(Dummy.UniqueID< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.yugglet);
                }else {
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


                if (Dummy.UniqueID< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.swogharnlera);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.swogharnler);
                }
                break;
            case 20:
                PlayerDisplay.setImageResource(R.drawable.adenolish);
                break;
            case 21:
                //PlayerDisplay.setImageResource(R.drawable.Genaupresang);
                // EnemyDisplay.setImageResource(R.drawable.s9);
                break;
            case 22:
                if (Dummy.UniqueID< 20000000) {
                    PlayerDisplay.setImageResource(R.drawable.daahnida);
                }else if (Dummy.UniqueID< 40000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidaa);
                }else if (Dummy.UniqueID< 60000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidab);
                }else if (Dummy.UniqueID< 80000000){
                    PlayerDisplay.setImageResource(R.drawable.daahnidac);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.daahnidad);
                }


                int daahnidacolorsetter = (int)Dummy.UniqueID % 7; //>>>
                int daahnidacolorcontroller = (int) Dummy.UniqueID % 255;

                switch (daahnidacolorsetter){
                    case 0:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                        break;
                    case 1:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255 ));
                        break;
                    case 2:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255 ));
                        break;
                    case 3:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                        break;
                    case 4:
                        PlayerDisplay.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller ));
                        break;
                    case 5:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255 ));
                        break;
                    case 6:
                        PlayerDisplay.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller ));
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
              //  PlayerDisplay.setImageResource(R.drawable.vellup);
                // EnemyDisplay.setImageResource(R.drawable.s0);
                break;
            case 27:
                PlayerDisplay.setImageResource(R.drawable.bellaja);
                break;
            case 28:
                PlayerDisplay.setImageResource(R.drawable.levdzell);
                break;
            case 29:
                if (Dummy.UniqueID< 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.ryteggg);
                }else {
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
                //PlayerDisplay.setImageResource(R.drawable.Octgotot);
                // EnemyDisplay.setImageResource(R.drawable.s45);
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

                if (Dummy.UniqueID< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntress);
                }else if(Dummy.UniqueID< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressa);
                }else if(Dummy.UniqueID< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.hyuntressb);
                }else {
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
                PlayerDisplay.setImageResource(R.drawable.munegull);
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
                if (Dummy.UniqueID< 22000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelion);
                }else if(Dummy.UniqueID< 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.slamelionb);
                }else if(Dummy.UniqueID< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.slameliona);
                }else {
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
                // EnemyDisplay.setImageResource(R.drawable.s59);
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
                if (Dummy.UniqueID< 22000000) {
                   // PlayerDisplay.setImageResource(R.drawable.firstcustom);
                }else if(Dummy.UniqueID< 45000000) {
                  //  PlayerDisplay.setImageResource(R.drawable.firstcustoma);
                }else if(Dummy.UniqueID< 70000000) {
                   // PlayerDisplay.setImageResource(R.drawable.firstcustomb);
                }else {
                  //  PlayerDisplay.setImageResource(R.drawable.firstcustomc);
                }
                // EnemyDisplay.setImageResource(R.drawable.s53);

                catcher = 1;

                break;

            case 88:
                PlayerDisplay.setImageResource(R.drawable.emptysquare);
                break;

        }


    }


    public int SpecialMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(9);

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
        needless = new Random().nextInt(100000000);
        return new Random().nextInt(100000000);
}

    public void AgentDancer() throws CloneNotSupportedException {
        
        for (int i = 0; i < AgentPositions.length; i++ ) {

            int move = new Random().nextInt(9);

            if (AgentPositions[i].Agent.Idnum != 88) {

                if((int)AgentPositions[i].Agent.Idnum == Edgemonster){
                    EdgemonsterC++;
                }
                if((int)AgentPositions[i].Agent.Idnum == Centermonster){
                    CentermonsterC++;
                }
                if((int)AgentPositions[i].Agent.Idnum == MedianMonster){
                    MedianMonsterC++;
                }

               if (monsterswapcounter == 2){
               switch (move) {
                    case 0:

                        int death = new Random().nextInt(60); // 60
                        if (death > life) {
                           AgentPositions[i].Agent = EmptyBox;
                        } else {
                            // somthing to make them look like they turned left or right

                        }
                        break;
                    case 1: // left 1
                        AgentPositions[Math.abs(i - 1) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 2://up left
                        AgentPositions[Math.abs(i - 21) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 3: // top
                        AgentPositions[Math.abs(i - 20) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 4://up right
                        AgentPositions[Math.abs(i - 19) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 5: // right
                        AgentPositions[Math.abs(i + 1) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 6: // right down
                        AgentPositions[Math.abs(i + 21) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 7:// down
                        AgentPositions[Math.abs(i + 20) % 400].Agent = AgentPositions[i].Agent;
                        break;
                    case 8://left doen
                        AgentPositions[Math.abs(i + 19) % 400].Agent = AgentPositions[i].Agent;
                        break;


                }
                }else if (monsterswapcounter == 1){  // everything in lase case is -1 which is a glitch but I need to test it first before permenntly changing it
                switch (move) {
                    case 0:

                        int death = new Random().nextInt(46); // 60
                        if (death > life) {
                            // AgentPositions[i].Agent = EmptyBox;
                        } else {
                            // somthing to make them look like they turned left or right

                        }
                        break;
                    case 1: // left 1
                        for (int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 1) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 1) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 1) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 1) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 1) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 1) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 1) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 400].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 1) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        for (int z = 0; AgentPositions[Math.abs(i - 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 21) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 21) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 21) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 21) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 21) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 21) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 21) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 21) % 400].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 21) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 3: // top
                        for (int z = 0; AgentPositions[Math.abs(i - 20) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 20) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 20) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 20) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 20) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 20) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 20) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 20) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 20) % 400].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 20) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 4://up right
                        for (int z = 0; AgentPositions[Math.abs(i - 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 19) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 19) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 19) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 19) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 19) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 19) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 19) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 19) % 400].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i - 19) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 5: // right
                        for (int z = 0; AgentPositions[Math.abs(i + 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 1) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 1) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 1) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 1) % 400].Agent);
                            } else {
                                // // // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 1) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 1) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 1) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 400].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 1) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 6: // right down
                        for (int z = 0; AgentPositions[Math.abs(i + 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 21) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 21) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 21) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 21) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 21) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 21) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 21) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 21) % 400].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 21) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 7:// down
                        for (int z = 0; AgentPositions[Math.abs(i + 20) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 20) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 20) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 20) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 20) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 20) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 20) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 20) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 20) % 400].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 20) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;

                        }
                        break;
                    case 8://left doen
                        for (int z = 0; AgentPositions[Math.abs(i + 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 19) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 19) % 400].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 19) % 400].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 19) % 400].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 19) % 400].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 19) % 400].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 19) % 400].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 19) % 400].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 19) % 400].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 19) % 400].Agent.Idnum).Health;

                        }
                        break;


                }
                int death = new Random().nextInt(60); //70
                if (death > life) {
                    AgentPositions[i].Agent = EmptyBox;
                }
            }else if (monsterswapcounter == 4){
                switch (move) {
                    
                    case 0:

                        int death = new Random().nextInt(46); // 60
                        if (death > life) {
                            // AgentPositions[i].Agent = EmptyBox;
                        } else {
                            // somthing to make them look like they turned left or right

                      }
                        break;
                    case 1: // left 1
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 1) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 1) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 21) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 21) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 21) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 21) % 400].Agent.Health = AgentPositions[Math.abs(i - 21) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 21) % 400].Agent.Health = AgentPositions[Math.abs(i - 21) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 21) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 21) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {

                            AgentPositions[Math.abs(i - 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 21) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 3: // top
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 20) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 20) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 20) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 20) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 20) % 400].Agent.Health = AgentPositions[Math.abs(i - 20) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 20) % 400].Agent.Health = AgentPositions[Math.abs(i - 20) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 20) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 20) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 20) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 4://up right
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 19) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 19) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 19) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 19) % 400].Agent.Health = AgentPositions[Math.abs(i - 19) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 19) % 400].Agent.Health = AgentPositions[Math.abs(i - 19) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 19) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 19) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 19) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 5: // right
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i + 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i + 1) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 1) % 400].Agent.Health = AgentPositions[Math.abs(i + 1) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i + 1) % 400].Agent.Health = AgentPositions[Math.abs(i + 1) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 1) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 1) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 6: // right down
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i + 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 21) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 21) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i + 21) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 21) % 400].Agent.Health = AgentPositions[Math.abs(i + 21) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i + 21) % 400].Agent.Health = AgentPositions[Math.abs(i + 21) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 21) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 21) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(+ 21) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 7:// down
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 1) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 20) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 20) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 20) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 8://left doen
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.UniqueID != AgentPositions[i].Agent.UniqueID) {
                            for (int z = 0; AgentPositions[Math.abs(i + 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                                double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 19) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                                double DamageB = (int) ((AgentPositions[Math.abs(i + 19) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                                if (AgentPositions[Math.abs(i + 19) % 400].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                    AgentPositions[Math.abs(i + 19) % 400].Agent.Health = AgentPositions[Math.abs(i + 19) % 400].Agent.Health - DamageA;
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                } else {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                    AgentPositions[Math.abs(i + 19) % 400].Agent.Health = AgentPositions[Math.abs(i + 19) % 400].Agent.Health - DamageA;
                                }
                            }
                            if (AgentPositions[Math.abs(i + 19) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                                AgentPositions[Math.abs(i + 19) % 400].Agent = AgentPositions[i].Agent.clone();
                            } else {
                                AgentPositions[Math.abs(i + 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 19) % 400].Agent.Idnum).Health;

                            }
                        }
                        break;


                }
                int death = new Random().nextInt(60); //70
                if (death > life) {
                    AgentPositions[i].Agent = EmptyBox.clone();
                }
            }else {
                switch (move) {
                    
                    case 0:

                        int death = new Random().nextInt(46); // 60
                        if (death > life) {
                            // AgentPositions[i].Agent = EmptyBox;
                        } else {
                            // somthing to make them look like they turned left or right

                      }
                        break;
                    case 1: // left 1
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 1) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 1) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i - 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 21) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 21) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 21) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 21) % 400].Agent.Health = AgentPositions[Math.abs(i - 21) % 400].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 21) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if(AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 21) % 400].Agent.Health = AgentPositions[Math.abs(i - 21) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 21) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 21) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {

                            AgentPositions[Math.abs(i - 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 21) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 3: // top
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i - 20) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 20) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 20) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 20) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 20) % 400].Agent.Health = AgentPositions[Math.abs(i - 20) % 400].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 20) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                AgentPositions[Math.abs(i - 20) % 400].Agent.Health = AgentPositions[Math.abs(i - 20) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 20) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;

                                AgentPositions[Math.abs(i - 20) % 400].Agent = AgentPositions[i].Agent.clone();

                        } else {
                            AgentPositions[Math.abs(i - 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 20) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 4://up right
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i - 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 19) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 19) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 19) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 19) % 400].Agent.Health = AgentPositions[Math.abs(i - 19) % 400].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 19) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if(AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 19) % 400].Agent.Health = AgentPositions[Math.abs(i - 19) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 19) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 19) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 19) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 5: // right
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i + 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i + 1) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 1) % 400].Agent.Health = AgentPositions[Math.abs(i + 1) % 400].Agent.Health - DamageA;
                                if(AgentPositions[Math.abs(i + 1) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i + 1) % 400].Agent.Health = AgentPositions[Math.abs(i + 1) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 1) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 1) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 1) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 6: // right down
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i + 21) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 21) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 21) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i + 21) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 21) % 400].Agent.Health = AgentPositions[Math.abs(i + 21) % 400].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i + 21) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i + 21) % 400].Agent.Health = AgentPositions[Math.abs(i + 21) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 21) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 21) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 21) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(+ 21) % 400].Agent.Idnum).Health;
                      }
}
                        break;
                    case 7:// down
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i - 1) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                            if (AgentPositions[Math.abs(i - 1) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                if(AgentPositions[Math.abs(i - 1) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                if( AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 1) % 400].Agent.Health = AgentPositions[Math.abs(i - 1) % 400].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 20) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 20) % 400].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 20) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 20) % 400].Agent.Idnum).Health;

                      }
}
                        break;
                    case 8://left doen
                        if ( AgentPositions[Math.abs(i - 1) % 400].Agent.Idnum != AgentPositions[i].Agent.Idnum) {
                            for (int z = 0; AgentPositions[Math.abs(i + 19) % 400].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                                double DamageA = (int) ((AgentPositions[Math.abs(i) % 400].Agent.Attack / AgentPositions[Math.abs(i + 19) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                                double DamageB = (int) ((AgentPositions[Math.abs(i + 19) % 400].Agent.Attack / AgentPositions[Math.abs(i) % 400].Agent.Defense) * (new Random().nextInt(21) + 50));
                                if (AgentPositions[Math.abs(i + 19) % 400].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                    AgentPositions[Math.abs(i + 19) % 400].Agent.Health = AgentPositions[Math.abs(i + 19) % 400].Agent.Health - DamageA;
                                    if(AgentPositions[Math.abs(i + 19) % 400].Agent.Health > 0) {
                                        AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                    }
                                } else {
                                    AgentPositions[Math.abs(i) % 400].Agent.Health = AgentPositions[Math.abs(i) % 400].Agent.Health - DamageB;
                                    if( AgentPositions[Math.abs(i) % 400].Agent.Health > 0) {
                                        AgentPositions[Math.abs(i + 19) % 400].Agent.Health = AgentPositions[Math.abs(i + 19) % 400].Agent.Health - DamageA;
                                    }
                                }
                            }
                            if (AgentPositions[Math.abs(i + 19) % 400].Agent.Health < AgentPositions[i].Agent.Health) {
                                AgentPositions[Math.abs(i) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 400].Agent.Idnum).Health;
                                AgentPositions[Math.abs(i + 19) % 400].Agent = AgentPositions[i].Agent.clone();
                            } else {
                                AgentPositions[Math.abs(i + 19) % 400].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 19) % 400].Agent.Idnum).Health;

                            }
                        }
                        break;


                }
                int death = new Random().nextInt(60); //70
                if (death > life) {
                    AgentPositions[i].Agent = EmptyBox.clone();
                }
            }

            for (int k = 0; k < AgentPositions.length; k++) {
                AgentPositions[k].Agent.Health = monstlist((int) AgentPositions[k].Agent.Idnum).Health;

            }
            // AgentPositions
        }
            
        }
        
        
        
        
 }


    public protomon.monst monstlist(int idnumber){

        switch (idnumber){

            case 0:
                return error;
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
                Gson gson = new Gson();
                Context ProtomonContext = getApplicationContext();
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                SharedPreferences.Editor editor = prefs.edit();
                String json = prefs.getString("WorkingMonster", "");
                if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                    Custom = gson.fromJson(json, (Type) protomon.monst.class);
                    return Custom;
                }else {
                    return Custom;
                }
            case 88:
                return EmptyBox;
        }
        return error;
    }

    public void Populate(ImageView EnemyDisplay, protomon.monst AttackerMonsterHandle){

      //  EnemyDisplay.setColorFilter(Color.argb(0, 0, 0, 0));


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
                //EnemyDisplay.setImageResource(R.drawable.Genaupresang);
                // EnemyDisplay.setImageResource(R.drawable.s9);
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
              //  EnemyDisplay.setImageResource(R.drawable.vellup);
                // EnemyDisplay.setImageResource(R.drawable.s0);
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
                //EnemyDisplay.setImageResource(R.drawable.Octgotot);
                // EnemyDisplay.setImageResource(R.drawable.s45);
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
                EnemyDisplay.setImageResource(R.drawable.munegull);
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
                // EnemyDisplay.setImageResource(R.drawable.s59);
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
                if (AttackerMonsterHandle.UniqueID < 22000000) {
                  //  EnemyDisplay.setImageResource(R.drawable.firstcustom);
                }else if(AttackerMonsterHandle.UniqueID < 45000000) {
                  //  EnemyDisplay.setImageResource(R.drawable.firstcustoma);
                }else if(AttackerMonsterHandle.UniqueID < 70000000) {
                 //   EnemyDisplay.setImageResource(R.drawable.firstcustomb);
                }else {
                 //   EnemyDisplay.setImageResource(R.drawable.firstcustomc);
                }
                // EnemyDisplay.setImageResource(R.drawable.s53);
                break;
            case 88:
                EnemyDisplay.setImageResource(R.drawable.emptysquare);
                break;


        }


    }



    public void SomekindOfMethod(){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (fastercatch > 0){
                    if (speedz <= 500){
                        speedz = 500;
                    }else {
                        speedz = speedz - 100;
                    }
                    if (speedz <= 0){
                        speedz = 500;
                    }
                    fastercatch = 0;

                    timer.cancel(); // cancel time
                    SomekindOfMethod(); // start the time again with a new period time
                }

                if (slowercatch > 0){

                    if (speedz <= 500){
                        speedz = 500;
                    }else {
                        speedz = speedz + 100;
                    }
                    slowercatch = 0;

                    timer.cancel(); // cancel time
                    SomekindOfMethod(); // start the time again with a new period time
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {





                        if(startflip != 0){


                            if (lifeseason == 0) {
                                life++;
                            }

                            if (lifeseason == 1) {
                                life--;
                            }


                            try {
                                AgentDancer();
                            } catch (CloneNotSupportedException e) {
                                e.printStackTrace();
                            }
                            for(int x = 0; x < AgentPositions.length; x++) {
                                try {
                                    imagegrant(AgentPositions[x].Gridspot, AgentPositions[x].Agent);
                                } catch (CloneNotSupportedException e) {
                                    e.printStackTrace();
                                }
                            }

                            if (life >= 47) {
                                lifeseason = 1;
                            }
                            if (life <= 25) {
                                lifeseason = 0;
                            }


                            if (lifeseason == 0){
                                if (life > 32){
                                    realseason = "Summer, day ";


                                }else {

                                    realseason = "Spring, day ";


                                }

                            }else {
                                if (life > 32){

                                    realseason = "Fall, day ";



                                }else {
                                    realseason = "Winter, day ";


                                }


                            }

                            datenumber++;

                            datenum = String.format(datenum, datenumber);
                            Seasons.setText(realseason + datenum);
                            datenum = "%s";


                            String H = " H" + SetIntToString((int) monstlist(Edgemonster).Health);
                            String D = " D" + SetIntToString((int) monstlist(Edgemonster).Defense);
                            String A = " A" + SetIntToString((int) monstlist(Edgemonster).Attack);
                            String S = " S" + SetIntToString((int) monstlist(Edgemonster).Speed);

                            Edge.setText(names(Edgemonster)+H+D+A+S +"\n" + SetIntToString(EdgemonsterC));
                            EdgemonsterC = 0;




                             H = " H" + SetIntToString((int) monstlist(Centermonster).Health);
                             D = " D" + SetIntToString((int) monstlist(Centermonster).Defense);
                             A = " A" + SetIntToString((int) monstlist(Centermonster).Attack);
                             S = " S" + SetIntToString((int) monstlist(Centermonster).Speed);

                            Center.setText(names(Centermonster)+H+D+A+S +"\n" + SetIntToString(CentermonsterC));
                            CentermonsterC = 0;


                            H = " H" + SetIntToString((int) monstlist(MedianMonster).Health);
                            D = " D" + SetIntToString((int) monstlist(MedianMonster).Defense);
                            A = " A" + SetIntToString((int) monstlist(MedianMonster).Attack);
                            S = " S" + SetIntToString((int) monstlist(MedianMonster).Speed);

                            Median.setText(names(MedianMonster)+H+D+A+S +"\n" + SetIntToString(MedianMonsterC));
                            MedianMonsterC = 0;

                        }

                    }
                });

            }




        },0,speedz);

    }

    public void PlayBrainMethod(protomon.monst playermonster, protomon.monst attackermonster) {



        double Holdthisformeplayerattack =  playermonster.Attack;
        double Holdthisformemonsterattack =  attackermonster.Attack;
        double Holdthisformeplayerdefense =  playermonster.Defense;
        double Holdthisformemonsterdefense =  attackermonster.Defense;
        double Holdthisformeplayerspeed =  playermonster.Speed;
        double Holdthisformemonsterspeed =  attackermonster.Speed;



        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);

switch (new Random().nextInt(10)) {
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
        Teller = Turn;
        break;
    case 9:
        Teller = Turn;
        break;
}

        if (Teller == Turn) {
            whosturnisitanyway = 1;
            Damage = ((playermonster.Attack / attackermonster.Defense) * (new Random().nextInt(21) + 50));
            Damage = Math.round(Damage);
            attackermonster.Health = attackermonster.Health - Damage;


          //  String WhatHappenedString = TypesOfMotions(1);

          //  StringDisplayMethod();


        }
        if (Teller == Status) {
            whosturnisitanyway = 1;
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
            } else if (playermonster.Moveslotspeed > 6 && PlayerStatDelayTimer == -1) {
                PlayerStatDelayTimer = 3;
            }

            //String WhatHappenedString = TypesOfMotions(3);

            if(turncounter > 0 /*&& (playermonster.Health > 0 && attackermonster.Health > 0)*/) {
                if (whosturnisitanyway == 0) {
                  //  CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Performs " + StatsMoveNames(attackermonster.Moveslotspeed) + "\n");

                    // CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString + "\n");
                } else if (whosturnisitanyway == 1) {

                 //   CombatString = String.format(CombatString + names(playermonster.Idnum) + " Performs " + StatsMoveNames(playermonster.Moveslotspeed) + "\n");

                    //  CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString + "\n");
                }
            }
           // DeathTest();
        }
        if (Teller == HealButton) {
            whosturnisitanyway = 1;
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
                delayedhealpowerP = (int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense));
                if (delayedhealtimerP == 0) {
                    delayedhealtimerP = 1;
                }
            } else if (playermonster.Moveslotheal == 2) {
                elongatedhealtimerP = elongatedhealtimerP + 5;
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 65)) * (playermonster.Speed / playermonster.Defense)))) / 7;
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
            } else if (playermonster.Moveslotheal == 4) {
                healblocktgimerA = 0;
                elongatedhealwoundtimerP = 0;
                elongatedwoundtimerP = 0;
                elongatedglugpowerA = 0;
                statblocktimerP = 0;
                Damage = (((new Random().nextInt(11) + 25)) * (playermonster.Speed / playermonster.Defense));
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
            }
            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }

        }
        if (Teller == SpecialAttack) {
            whosturnisitanyway = 1;
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
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (playermonster.Speed / attackermonster.Defense)))) / 12;
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
            }else if (playermonster.Moveslotattack == 8) {
                statblocktimerA = statblocktimerA + 7;
            }
            if (playermonster.Health > MaxHealthPlayer) {
                playermonster.Health = MaxHealthPlayer;
            }

        }





        DelayedStatusMethod(playermonster, attackermonster);

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


        TurnDamageResolution(playermonster, attackermonster);

        HealthChecker(playermonster, attackermonster);

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /**/

        if(playermonster.Health > 0 && attackermonster.Health > 0) {
            turncounter++;
            if(turncounter == 0) {
                FirstTurnMethod(playermonster, attackermonster);
            }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                if(playermonster.Speed <= attackermonster.Speed){

                    if((turncounter%2) == 0){
                        //   PlayBrainMethod(Turn);
                    }else {
                        RoboBrainMethod(playermonster, attackermonster);
                    }
                }else {

                    if((turncounter%2) == 0){
                        RoboBrainMethod(playermonster, attackermonster);
                    } else {
                        //   PlayBrainMethod(Turn);
                    }

                }
            }
           // ImageChanger();


        }
    }

    private void DelayedStatusMethod(protomon.monst playermonster, protomon.monst attackermonster) {


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



    }
    public void StatAbuseCurb(protomon.monst raw){

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

     //   MonsterImageChangerAttacker(attackermonster);

       // AlwaysMakeSureHealthIsLessThanMax();

    }
    public void AlwaysMakeSureHealthIsLessThanMax(protomon.monst playermonster, protomon.monst attackermonster){



        if(playermonster.Health > stats(monstlist((int)playermonster.Idnum).Health)){
            playermonster.Health = stats(monstlist((int)playermonster.Idnum).Health);
        }

        if(attackermonster.Health > stats(monstlist((int)attackermonster.Idnum).Health)){
            attackermonster.Health = stats(monstlist((int)attackermonster.Idnum).Health);
        }


    }

    public double stats(double base){

        return base+50;

        //    return (base+(new Random().nextInt(101)-50));
    }


    public void  FirstTurnMethod(protomon.monst playermonster, protomon.monst attackermonster) {
//pampegg
        attackermonster.Moveslotattack = new Random().nextInt(9);
        attackermonster.Moveslotspeed = new Random().nextInt(14);
        attackermonster.Moveslotheal = new Random().nextInt(10);
        playermonster.Moveslotspeed = new Random().nextInt(14);
        playermonster.Moveslotheal = new Random().nextInt(10);
        playermonster.Moveslotattack = new Random().nextInt(9);


        MaxHealthAttacker = attackermonster.Health;
        MaxHealthPlayer = playermonster.Health;



        turncounter = 1;


        AlwaysMakeSureHealthIsLessThanMax(playermonster, attackermonster);

    }


    public void TurnDamageResolution(protomon.monst playermonster, protomon.monst attackermonster) {
        if (playermonster.Health > 0 && attackermonster.Health > 0) {

            double Holdthisformeplayer =  playermonster.Health;
            double Holdthisformemonster =  attackermonster.Health;
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
                Holdthisformemonsterwounds = Holdthisformemonsterwounds - elongatedglugpowerP;
                Holdthisformemonster = Holdthisformemonster - elongatedglugpowerP;

            }

            if (elongatedglugtimerA > 0) {
                elongatedglugtimerA--;
                attackermonster.Health = attackermonster.Health + elongatedglugpowerA;
                playermonster.Health = playermonster.Health - elongatedglugpowerA;
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
                delayedblastpowerA = 0;
                delayedblasttimerA = 0;
            }
            if(delayedblasttimerP > 0){
                delayedblasttimerP++;
            }
            if(delayedblasttimerP > 3 && (playermonster.Health > 0 && attackermonster.Health > 0)){
                attackermonster.Health = attackermonster.Health - delayedblastpowerP;
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
            }

            if (elongatedhealwoundtimerA > 0) {
                elongatedhealwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedhealwoundpowerA;
            }


            if (grouphealtimerP > 0){
                grouphealtimerP--;

            }

            if (grouphealtimerA > 0){
                grouphealtimerA--;

            }

            if (grouphealtimerP != 0){
               // for (int w = 0; w < MonsterStorageCounter; w++) {
               //     PlayerMonsterStorage[w].Health = PlayerMonsterStorage[w].Health + grouphealpowerP;

              //      if (PlayerMonsterStorage[w].Health >= stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health)) {
               //         PlayerMonsterStorage[w].Health = stats(monstlist((int) PlayerMonsterStorage[w].Idnum).Health);
                //    }
                playermonster.Health = playermonster.Health + grouphealpowerP;

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


            /**/



            if (elongatedwoundtimerP > 0) {
                elongatedwoundtimerP--;
                playermonster.Health = playermonster.Health - elongatedwoundpowerP;
            }

            if (elongatedwoundtimerA > 0) {
                elongatedwoundtimerA--;
                attackermonster.Health = attackermonster.Health - elongatedwoundpowerA;
            }


            StatAbuseCurb(playermonster);
            StatAbuseCurb(attackermonster);


            if (playermonster.Health <= 0){


            //    CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

            }

            if (attackermonster.Health <= 0){


             //   CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

            }
        }


        AlwaysMakeSureHealthIsLessThanMax(playermonster, attackermonster);


    }
    private void HealthChecker(protomon.monst playermonster, protomon.monst attackermonster) {

        playermonster.Health = Math.round(playermonster.Health);
        attackermonster.Health = Math.round(attackermonster.Health);

        if (playermonster.Health > stats(monstlist((int)playermonster.Idnum).Health)) {
            playermonster.Health = stats(monstlist((int)playermonster.Idnum).Health);
        }

        if (attackermonster.Health > stats(monstlist((int)attackermonster.Idnum).Health)){
            attackermonster.Health = stats(monstlist((int)attackermonster.Idnum).Health);;
        }



        if(playermonster.Health <= 0){
            playermonster.Health = 0;
        }
        if(attackermonster.Health <= 0){
            attackermonster.Health = 0;
        }
    }


    public void RoboBrainMethod(protomon.monst playermonster, protomon.monst attackermonster) {


        double Holdthisformeplayerattack = playermonster.Attack;
        double Holdthisformemonsterattack = attackermonster.Attack;
        double Holdthisformeplayerdefense = playermonster.Defense;
        double Holdthisformemonsterdefense = attackermonster.Defense;
        double Holdthisformeplayerspeed = playermonster.Speed;
        double Holdthisformemonsterspeed = attackermonster.Speed;


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


        if (attackermonster.Moveslotattack == 8) {



            if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                Teller = Turn;
            }

            double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


            double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

            double Go = ((attackermonster.Attack / playermonster.Defense) * 50);



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

            double effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));

            if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && attackermonster.Moveslotspeed >= 7)) {
                if (Teller != Status) {
                    if (attackermonster.Health >= MaxHealthAttacker && (attackermonster.Defense < 749 && attackermonster.Speed < 749 && attackermonster.Attack < 749)) {


                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = Turn;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = Turn;
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
                                Teller = Turn;
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
                                Teller = Turn;
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

            double testdamage = ((attackermonster.Attack / playermonster.Defense) * 50);
            double testdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);
            double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
            double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;

            double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

            double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

            double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

            double lowtesttakedamage = ((playermonster.Attack / attackermonster.Defense) * 50);
            double testtakedamage = ((playermonster.Attack / attackermonster.Defense) * 65);
            double maxtesttakedamage = ((playermonster.Attack / attackermonster.Defense) * 70);

            double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
            double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
            double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
            double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
            double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
            double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;


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
                                                Teller = Turn;
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
                                                Teller = Turn;
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
                                                Teller = Turn;
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
                                                    Teller = Turn;
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
                                                Teller = Turn;
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
                                                Teller = Turn;
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
                                        Teller = Turn;
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
                                        Teller = Turn;
                                    } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                        Teller = Turn;
                                    } else {
                                        Teller = Turn;
                                    }
                                    break;

                            }
                        }
                    }
                } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (cleansefinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testtakedamage + delayedblastpowerP)) && (attackermonster.Health < (testtakedamage + delayedblastpowerP)))) {
                    double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (glugfinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    if (testheal > testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    if (posturetest >= lowtesttakedamage) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testtakedamage * 2) + delayedblastpowerP)) && (attackermonster.Health < ((testtakedamage * 2) + delayedblastpowerP)))) {
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
                                Teller = Turn;
                            } else if (((playermonster.Health / ((attackermonster.Attack / playermonster.Defense) * 60)) <= (((attackermonster.Health / ((playermonster.Attack / attackermonster.Defense) * 60)))))) {
                                Teller = Turn;
                            }
                        }
                    }
                }
            } else {
                Teller = Turn;
                if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    Teller = HealButton;
                }
                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                }
                //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                //      Teller = HealButton;
                //  }
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
                                        if ((testheal * 1.5) > maxtesttakedamage) {
                                            Teller = HealButton;
                                        }
                                    }
                                }
                            } else {
                                if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                                    Teller = Turn;
                                } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                                    Teller = Turn;
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

            if (attackermonster.Moveslotheal == 1) {
                if (Teller == HealButton) {
                    if (delayedhealtimerA != 0) {
                        if (attackermonster.Speed > playermonster.Defense && (attackermonster.Moveslotattack == 0 || attackermonster.Moveslotattack == 2 || attackermonster.Moveslotattack == 3)) {
                            Teller = Turn;
                        } else if (attackermonster.Moveslotattack == 6 && ((attackermonster.Speed < playermonster.Speed) && (attackermonster.Speed > (Math.ceil(playermonster.Speed * .85))))) {
                            Teller = Turn;
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
                                                Teller = Turn;
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

            if (Teller != Turn) {
                Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                if (playermonster.Health <= Damage) {
                    Teller = Turn;
                }
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

            if (attackermonster.Moveslotattack == 1) {
                if (Teller == SpecialAttack) {
                    if (delayedblasttimerA != 0) {
                        Teller = Turn;
                    }
                }
            }

            //ASDF
            if (attackermonster.Moveslotattack == 6){
                if ((Math.ceil(playermonster.Speed*.85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                    if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)){
                        Teller = SpecialAttack;
                    }
                }
            }

            if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                Teller = HealButton;
            }


            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                Teller = Turn;
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
                Teller = Turn;
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

            if (Teller == Status && playermonster.Moveslotattack == 8 && attackermonster.Moveslotspeed >= 7) {
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
            if (AttackerStatDelayTimer != -1) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }


        }else {



            if (healblocktgimerA <= 1 && playermonster.Health < MaxHealthPlayer && attackermonster.Moveslotattack == 4 && ((playermonster.Speed > playermonster.Defense && playermonster.Moveslotheal != 3) || (playermonster.Moveslotheal == 3 && attackermonster.Defense < playermonster.Attack)) || (playermonster.Moveslotattack == 3 && attackermonster.Defense < playermonster.Speed)) {
                Teller = SpecialAttack;
            }

            double stataverage = (playermonster.Attack + playermonster.Defense + playermonster.Speed) / 3;


            double thisdoctork = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 14;

            double Go = ((attackermonster.Attack / playermonster.Defense) * 50);

       /**/

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

            double effectivehits = ((attackermonster.Health / 60) * (attackermonster.Defense / 60));

            if ((effectivehits > 4.0 && attackermonster.Moveslotspeed < 7) || (effectivehits > 7.0 && attackermonster.Moveslotspeed >= 7)) {
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
            double testdamageP = ((playermonster.Attack / attackermonster.Defense) * 50);
            double testheal = ((attackermonster.Speed / attackermonster.Defense) * 50);
            double testhealnz = ((((attackermonster.Speed + attackermonster.Defense + attackermonster.Attack) / MaxHealthAttacker)) * 50) * .3810;

            double momentumcheck = (((new Random().nextInt(11) + 55)) * (attackermonster.Speed / (attackermonster.Defense + attackermonster.Attack))) * 1.80;

            double posturetest = (((new Random().nextInt(11) + 55)) * (attackermonster.Attack / (attackermonster.Defense + attackermonster.Speed))) * 1.80;

            double growthtest = (((new Random().nextInt(11) + 55)) * (attackermonster.Defense / (attackermonster.Speed + attackermonster.Attack))) * 1.80;

            double lowtesttakedamage = ((playermonster.Attack / attackermonster.Defense) * 50);
            double testtakedamage = ((playermonster.Attack / attackermonster.Defense) * 65);
            double maxtesttakedamage = ((playermonster.Attack / attackermonster.Defense) * 70);

            double cleansevalue = 25 * (attackermonster.Speed / attackermonster.Defense);
            double glugpower = (35 * (attackermonster.Attack / playermonster.Defense)); // was 25 now 35
            double grouphealtester = (3 * ((int) (((new Random().nextInt(6) + 15)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double longhealtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
            double chipdamage = (((new Random().nextInt(11) + 25)) * (attackermonster.Defense / playermonster.Defense));
            double tripcheck = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / playermonster.Speed));
            double dispdam = (((new Random().nextInt(11) + 25)) * (attackermonster.Attack / playermonster.Attack));
            double woundtester = (3 * ((int) (((new Random().nextInt(21) + 70)) * (attackermonster.Speed / playermonster.Defense)))) / 17;


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
                } else if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    double cleansefinalcheck = (attackermonster.Speed / attackermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (cleansefinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 3 && (((attackermonster.Health + glugpower) > (testtakedamage + delayedblastpowerP)) && (attackermonster.Health < (testtakedamage + delayedblastpowerP)))) {
                    double glugfinalcheck = (attackermonster.Attack / playermonster.Defense) / (playermonster.Attack / attackermonster.Defense) * 100;
                    if (glugfinalcheck > 100) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 0 && (((attackermonster.Health + testheal) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    if (testheal > testdamageP) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 6 && (((attackermonster.Health + testhealnz) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 7 && (((attackermonster.Health + momentumcheck) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 8 && (((attackermonster.Health + posturetest) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    if (posturetest >= lowtesttakedamage) {
                        Teller = HealButton;
                    }
                } else if (attackermonster.Moveslotheal == 9 && (((attackermonster.Health + growthtest) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP + 10)))) {
                    Teller = HealButton;
                } else if (attackermonster.Moveslotheal == 1 && (delayedhealtimerA == 0) && (((attackermonster.Health + (testheal * 1.5)) > ((testtakedamage * 2) + delayedblastpowerP)) && (attackermonster.Health < ((testtakedamage * 2) + delayedblastpowerP)))) {
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
                if (attackermonster.Moveslotheal == 5 && grouphealtimerA == 0 && (((attackermonster.Health + grouphealtester) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                    Teller = HealButton;
                }
                if ((healblocktgimerA != 0 || elongatedhealwoundpowerA != 0 || elongatedwoundpowerA != 0 || elongatedglugtimerP != 0) && attackermonster.Moveslotheal == 4) {
                    Teller = HealButton;
                }
                //  if (attackermonster.Moveslotheal == 4 && (((attackermonster.Health + cleansevalue) > (maxtesttakedamage + delayedblastpowerP)) && (attackermonster.Health < (maxtesttakedamage + delayedblastpowerP)))) {
                //      Teller = HealButton;
                //  }
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
                                        if ((testheal * 1.5) > maxtesttakedamage) {
                                            Teller = HealButton;
                                        }
                                    } /**/
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

            if (Teller != Turn) {
                Damage = ((attackermonster.Attack / playermonster.Defense) * 50);
                if (playermonster.Health <= Damage) {
                    Teller = Turn;
                }
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

            if (attackermonster.Moveslotattack == 1) {
                if (Teller == SpecialAttack) {
                    if (delayedblasttimerA != 0) {
                        Teller = Turn;
                    }
                }
            }
//ASDF
            if (attackermonster.Moveslotattack == 6){
                if ((Math.ceil(playermonster.Speed*.85) <= attackermonster.Speed) && playermonster.Speed > attackermonster.Speed) {
                    if (attackermonster.Health > (elongatedwoundpowerA + delayedblastpowerP + elongatedwoundpowerA + elongatedglugpowerP)){
                        Teller = SpecialAttack;
                    }
                }
            }
            if (glugpower >= playermonster.Health && attackermonster.Moveslotheal == 3) {
                Teller = HealButton;
            }


            if (Teller == SpecialAttack && attackermonster.Moveslotattack == 4 && healblocktgimerA >= 1) {
                Teller = Turn;
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

            if (Teller == Status && playermonster.Moveslotattack == 8 && attackermonster.Moveslotspeed >= 7) {
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
            if (AttackerStatDelayTimer != -1) {
                if (Teller == Status) {
                    Teller = Turn;
                }
            }
        }


        if (Teller == Turn) {
            whosturnisitanyway = 0;
            Damage = ((attackermonster.Attack / playermonster.Defense) * (new Random().nextInt(21) + 50));
            Damage = Math.round(Damage);
            playermonster.Health = playermonster.Health - Damage;




         //   String WhatHappenedString = TypesOfMotions(1);

          //  StringDisplayMethod();


            if(turncounter > 0 && (playermonster.Health > 0 && attackermonster.Health > 0)) {
                if (whosturnisitanyway == 0) {
                //    CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + WhatHappenedString +  String.format(displaystring, (int) Math.round(Damage)) + "\n");
                } else if (whosturnisitanyway == 1) {
                 //   CombatString = String.format(CombatString + names(playermonster.Idnum) + WhatHappenedString  + String.format(displaystring, (int) Math.round(Damage)) + "\n");
                }
            }


            if (!(playermonster.Health > 0 && attackermonster.Health > 0) && ActionNum == 0) {
                //WhatHappenedString = TypesOfMotions(5); ActionNum = 1;
                if (whosturnisitanyway == 0) {
                 //   CombatString = String.format(CombatString + "Enemy " + names(attackermonster.Idnum) + " Attacks For " +  String.format(displaystring, (int) Math.round(Damage)) + "\n");

                } else if (whosturnisitanyway == 1) {
                //    CombatString = String.format(CombatString + names(playermonster.Idnum) + " Attacks For "  + String.format(displaystring, (int) Math.round(Damage)) + "\n");

                }
               // DeathTest();
            }
        }

        if (Teller == Status) {
            whosturnisitanyway = 0;
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
            } else if (attackermonster.Moveslotspeed > 6 && AttackerStatDelayTimer == -1) {
                AttackerStatDelayTimer = 3;
            }


        }

        if (Teller == HealButton) {
            whosturnisitanyway = 0;
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
                int healtester = (3 * ((int) (((new Random().nextInt(21) + 65)) * (attackermonster.Speed / attackermonster.Defense)))) / 7;
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
            } else if (attackermonster.Moveslotheal == 4) {
                healblocktgimerP = 0;
                elongatedhealwoundtimerA = 0;
                elongatedwoundtimerA = 0;
                elongatedglugtimerP = 0;
                statblocktimerA = 0;
                Damage = (((new Random().nextInt(11) + 25)) * (attackermonster.Speed / attackermonster.Defense));
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
            }
            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }




        }

        if (Teller == SpecialAttack) {
            whosturnisitanyway = 0;
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
                int healtester = (3 * ((int) (((new Random().nextInt(11) + 35)) * (attackermonster.Speed / playermonster.Defense)))) / 12;
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
            }else if (attackermonster.Moveslotattack == 8) {
                statblocktimerP = statblocktimerP + 7;
            }

            if (attackermonster.Health > MaxHealthAttacker) {
                attackermonster.Health = MaxHealthAttacker;
            }


/**/
        }



        if (playermonster.Health <= 0){


          //  CombatString = String.format(CombatString + names(playermonster.Idnum) + " is Unable To battle " + "\n");

        }

        if (attackermonster.Health <= 0){


         //   CombatString = String.format(CombatString + "Enemy "  + names(attackermonster.Idnum) + " is Unable To battle " + "\n");

        }


        DelayedStatusMethod(playermonster, attackermonster);


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


        TurnDamageResolution(playermonster, attackermonster);

        HealthChecker(playermonster, attackermonster);

        StatAbuseCurb(playermonster);
        StatAbuseCurb(attackermonster);
        /**/


        if(playermonster.Health > 0 && attackermonster.Health > 0) {
            turncounter++;
            if(playermonster.Health > 0 && attackermonster.Health > 0) {
                if(turncounter == 0) {
                    FirstTurnMethod(playermonster, attackermonster);
                }else if (playermonster.Health > 0 && attackermonster.Health > 0) {

                    if(playermonster.Speed <= attackermonster.Speed){

                        if((turncounter%2) == 0){
                            //   PlayBrainMethod(Turn);
                        }else {
                            RoboBrainMethod(playermonster, attackermonster);
                        }
                    }else {

                        if((turncounter%2) == 0){
                            RoboBrainMethod(playermonster, attackermonster);
                        } else {
                            //   PlayBrainMethod(Turn);
                        }

                    }
                }
            //    ImageChanger();


            }

           // ImageChanger();
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

                    String Name;

                    Gson gson = new Gson();
                    Context ProtomonContext = getApplicationContext();
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ProtomonContext);
                    SharedPreferences.Editor editor = prefs.edit();
                    String json = prefs.getString("Name", "");
                    if (gson.fromJson(json, (Type) protomon.monst.class) != null) {
                        NameObjectHolder = gson.fromJson(json, (Type) CustomMonsterTopLayer.StringObject.class);
                        if (!NameObjectHolder.NameString.isEmpty()) {
                            return NameObjectHolder.NameString;
                        }else {
                            return "Nahnom";
                        }
                    }else if (NameObjectHolder.NameString.isEmpty()){
                        return "Failstorm";
                    }else {
                        return "Failstorm";
                    }



            }
        }else{
            return "error";
        }
        return "realerror";
    }

}