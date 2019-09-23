package ditzler.cole.stableapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.TypedValue;
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

public class PopulationDynamics extends AppCompatActivity {

    Button Status, SpecialAttack, Turn, HealButton, Teller, FasterButton, SlowerButton, FlipButton, FirstButton, SecondButton, ThirdButton, FourthButton, FifthButton, SixthButton, SeventhButton;

    public protomon.monst[] Memeeks = new protomon.monst[9999];
    int uniquifier = 0;
    int flipper = 1;
    int fastercatch,  slowercatch = 0;
    int speedz = 2000;
    int Edgemonster = 0;
    int Centermonster = 0;
    int MedianMonster = 0;
    int EdgemonsterC = 0;
    int CentermonsterC = 0;
    int MedianMonsterC = 0;
    int FirstMonster, SecondMonster, ThirdMonster, FourthMonster, FifthMonster, SixthMonster, SeventhMonster;
    int FirstMonsterc, SecondMonsterc, ThirdMonsterc, FourthMonsterc, FifthMonsterc, SixthMonsterc, SeventhMonsterc;

    CustomMonsterTopLayer.StringObject NameObjectHolder;

    int life = 35;
    int datenumber = 0;
    String datenum = "%s";
    String realseason = "";

    TextView Seasons, Edge, Center, Median, first, second, third, fourth, fifth, sixth, seventh;

    int lifeseason = 0;
    Timer timer;

    int startflip = 0;

    public PopulationDynamics() throws CloneNotSupportedException {
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
    ImageView a21, a22, a23, a24, a25;
    ImageView b21, b22, b23, b24, b25;
    ImageView c21, c22, c23, c24, c25;
    ImageView d21, d22, d23, d24, d25;
    ImageView e21, e22, e23, e24, e25;
    ImageView f21, f22, f23, f24, f25;
    ImageView g21, g22, g23, g24, g25;
    ImageView h21, h22, h23, h24, h25;
    ImageView i21, i22, i23, i24, i25;
    ImageView j21, j22, j23, j24, j25;
    ImageView k21, k22, k23, k24, k25;
    ImageView l21, l22, l23, l24, l25;
    ImageView m21, m22, m23, m24, m25;
    ImageView n21, n22, n23, n24, n25;
    ImageView o21, o22, o23, o24, o25;
    ImageView p21, p22, p23, p24, p25;
    ImageView q21, q22, q23, q24, q25;
    ImageView r21, r22, r23, r24, r25;
    ImageView s21, s22, s23, s24, s25;
    ImageView t21, t22, t23, t24, t25;
    ImageView u21, u22, u23, u24, u25;
    ImageView v21, v22, v23, v24, v25;
    ImageView w21, w22, w23, w24, w25;
    ImageView x21, x22, x23, x24, x25;
    ImageView y21, y22, y23, y24, y25;
    ImageView w01, w02, w03, w04, w05, w06, w07, w08, w09, w10, w11, w12, w13, w14, w15, w16, w17, w18, w19, w20;
    ImageView u01, u02, u03, u04, u05, u06, u07, u08, u09, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20;
    ImageView v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20;
    ImageView x01, x02, x03, x04, x05, x06, x07, x08, x09, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20;
    ImageView y01, y02, y03, y04, y05, y06, y07, y08, y09, y10, y11, y12, y13, y14, y15, y16, y17, y18, y19, y20;
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


    int spawncap = 89;
    int rotationcap = 90;


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
    public double nhainhaisp = stats(52);
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
    public double bonguhe = stats(83);

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
    public double velluphe = stats(59);

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
    public double kungulpde = stats(61);
    public double kungulphe = stats(61);

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
    public double minkohabodat = stats(68); // 52
    public double minkohabodsp = stats(68); //
    public double minkohabodde = stats(325); //
    public double minkohabodhe = stats(68);  //

    public double zeenid = 86;
    public double zeenat = stats(72); // 72
    public double zeensp = stats(121); // 71
    public double zeende = stats(112); // 112
    public double zeenhe = stats(112);  // 112
    
    
    public double tacroachid = 87;
    public double tacroachat = stats(126); // 72
    public double tacroachsp = stats(124); // 71
    public double tacroachde = stats(126); // 112
    public double tacroachhe = stats(55);  // 112

    
    public double manterflyid = 88;
    public double manterflyat = stats(172); // 72
    public double manterflysp = stats(110); // 71
    public double manterflyde = stats(62); // 112
    public double manterflyhe = stats(90);  // 112


    public double bearyid = 89;
    public double bearyat = stats(189); // 72
    public double bearysp = stats(65); // 71
    public double bearyde = stats(60); // 112
    public double bearyhe = stats(143);  // 112


    public double sluggernautid = 90;
    public double sluggernautat = stats(150);
    public double sluggernautsp = stats(53);
    public double sluggernautde = stats(57);
    public double sluggernauthe = stats(180);



    public double memeekid = 92;
    public double memeekat = stats(100);
    public double memeeksp = stats(102);
    public double memeekde = stats(100);
    public double memeekhe = stats(131);


    public double doughgnatid = 93;
    public double doughgnatat = stats(168);
    public double doughgnatsp = stats(153);
    public double doughgnatde = stats(51);
    public double doughgnathe = stats(85);


    public double ratticid = 94;
    public double ratticat = stats(154);
    public double ratticsp = stats(55);
    public double ratticde = stats(114);
    public double rattiche = stats(85);


    public double missileaneousid = 95;
    public double missileaneousat = stats(189);
    public double missileaneoussp = stats(57);
    public double missileaneousde = stats(65);
    public double missileaneoushe = stats(133);


    public double runnybabbitid = 96;
    public double runnybabbitat = stats(60);
    public double runnybabbitsp = stats(120);
    public double runnybabbitde = stats(55);
    public double runnybabbithe = stats(253);


    public double zubgondrakterid = 97;
    public double zubgondrakterat = stats(71);
    public double zubgondraktersp = stats(98);
    public double zubgondrakterde = stats(103);
    public double zubgondrakterhe = stats(151);

    public double whumpuhmpid = 98;
    public double whumpuhmpat = stats(104);
    public double whumpuhmpsp = stats(104);
    public double whumpuhmpde = stats(104);
    public double whumpuhmphe = stats(90);


    public double mangoonid = 99;
    public double mangoonat = stats(194);
    public double mangoonsp = stats(54);
    public double mangoonde = stats(59);
    public double mangoonhe = stats(161);


    public double scarbequeid = 100;
    public double scarbequeat = stats(131);
    public double scarbequesp = stats(106);
    public double scarbequede = stats(85);
    public double scarbequehe = stats(85);




    public double fwuffynumpkinsid = 101;
    public double fwuffynumpkinsat = stats( 60);
    public double fwuffynumpkinssp = stats( 58);
    public double fwuffynumpkinsde = stats( 82);
    public double fwuffynumpkinshe = stats( 350);


    public double dothogid = 102;
    public double dothogat = stats( 85);
    public double dothogsp = stats( 106);
    public double dothogde = stats( 131);
    public double dothoghe = stats( 85);

    public double reefcakeid = 103;
    public double reefcakeat = stats( 65);
    public double reefcakesp = stats( 70);
    public double reefcakede = stats( 65);
    public double reefcakehe = stats( 301);


    public double cheetzaid = 104;
    public double cheetzaat = stats( 90);
    public double cheetzasp = stats( 240);
    public double cheetzade = stats( 58);
    public double cheetzahe = stats( 80);


    public double sortsandid = 105;
    public double sortsandat = stats( 56);
    public double sortsandsp = stats( 79);
    public double sortsandde = stats( 240);
    public double sortsandhe = stats( 109);



    public double chilldebeestid = 106;
    public double chilldebeestat = stats( 97);
    public double chilldebeestsp = stats( 133);
    public double chilldebeestde = stats( 78);
    public double chilldebeesthe = stats( 100);


    public double communigatorid = 107;
    public double communigatorat = stats( 122);
    public double communigatorsp = stats( 137);
    public double communigatorde = stats( 76);
    public double communigatorhe = stats( 79);


    public double mossbossid = 108;
    public double mossbossat = stats( 200);
    public double mossbosssp = stats( 68);
    public double mossbossde = stats( 82);
    public double mossbosshe = stats( 91);

    public double vampreyid = 109;
    public double vampreyat = stats( 246);
    public double vampreysp = stats( 70);
    public double vampreyde = stats( 54);
    public double vampreyhe = stats( 110);

    public double parafoxid = 110;
    public double parafoxat = stats( 88);
    public double parafoxsp = stats( 140);
    public double parafoxde = stats( 64);
    public double parafoxhe = stats( 130);

    public double rhischlosserousid = 111;
    public double rhischlosserousat = stats( 88);
    public double rhischlosseroussp = stats( 64);
    public double rhischlosserousde = stats( 140);
    public double rhischlosseroushe = stats( 130);


    public double hykeynaid = 112;
    public double hykeynaat = stats( 140);
    public double hykeynasp = stats( 88);
    public double hykeynade = stats( 64);
    public double hykeynahe = stats( 130);

    public double tafantulaid = 113;
    public double tafantulaat = stats( 130);
    public double tafantulasp = stats( 90);
    public double tafantulade = stats( 89);
    public double tafantulahe = stats( 140);

    public double farmotid = 114;
    public double farmotat = stats( 94);
    public double farmotsp = stats( 71);
    public double farmotde = stats( 87);
    public double farmothe = stats( 176);

    public double beeurchinid = 115;
    public double beeurchinat = stats( 176);
    public double beeurchinsp = stats( 87);
    public double beeurchinde = stats( 71);
    public double beeurchinhe = stats( 94);

    public double flyinsoupid = 116;
    public double flyinsoupat = stats( 117);
    public double flyinsoupsp = stats( 103);
    public double flyinsoupde = stats( 98);
    public double flyinsouphe = stats( 89);

    public double meloncollieid = 117;
    public double meloncollieat = stats( 89);
    public double meloncolliesp = stats( 100);
    public double meloncolliede = stats( 100);
    public double meloncolliehe = stats( 117);

    public double scorphibianid = 118;
    public double scorphibianat = stats( 180);
    public double scorphibiansp = stats( 79);
    public double scorphibiande = stats( 80);
    public double scorphibianhe = stats( 81);



    public double geliphantid =  119;
    public double geliphantat = stats( 78);
    public double geliphantsp = stats( 78);
    public double geliphantde = stats( 78);
    public double geliphanthe = stats( 219);

    public double chimpansyid =120;
    public double chimpansyat = stats( 123);
    public double chimpansysp = stats( 123);
    public double chimpansyde = stats( 75);
    public double chimpansyhe = stats( 91);

    public double xaltoxisid =  121;
    public double xaltoxisat = stats( 120);
    public double xaltoxissp = stats( 154);
    public double xaltoxisde = stats( 60);
    public double xaltoxishe = stats( 93);

    public double avokaboomid =  122;
    public double avokaboomat = stats( 170);
    public double avokaboomsp = stats( 69);
    public double avokaboomde = stats( 51);
    public double avokaboomhe = stats( 165);



    protomon.monst Kunk = new protomon.monst(kunkid, kunksp, kunkat, kunkde, kunkhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Djoper = new protomon.monst(djoperid, djopersp, djoperat, djoperde, djoperhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schorp = new protomon.monst(schorpid, schorpsp, schorpat, schorpde, schorphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zaume = new protomon.monst(zaumeid, zaumesp, zaumeat, zaumede, zaumehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nhainhai = new protomon.monst(nhainhaiid, nhainhaisp, nhainhaiat, nhainhaide, nhainhaihe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kohboh = new protomon.monst(kohbohid, kohbohsp, kohbohat, kohbohde, kohbohhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Degeissdt = new protomon.monst(degeissdtid, degeissdtsp, degeissdtat, degeissdtde, degeissdthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Yuggle = new protomon.monst(yuggleid, yugglesp, yuggleat, yugglede, yugglehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bongu = new protomon.monst(bonguid, bongusp, bonguat, bongude, bonguhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Giteriglia = new protomon.monst(giterigliaid, giterigliasp, giterigliaat, giterigliade, giterigliahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Cyosteroth = new protomon.monst(cyosterothid, cyosterothsp, cyosterothat, cyosterothde, cyosterothhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nentopode = new protomon.monst(nentopodeid, nentopodesp, nentopodeat, nentopodede, nentopodehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Centiclak = new protomon.monst(centiclakid, centiclaksp, centiclakat, centiclakde, centiclakhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Uggnawb = new protomon.monst(uggnawbid, uggnawbsp, uggnawbat, uggnawbde, uggnawbhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Grobhost = new protomon.monst(grobhostid, grobhostsp, grobhostat, grobhostde, grobhosthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Illelonab = new protomon.monst(illelonabid, illelonabsp, illelonabat, illelonabde, illelonabhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rongzeed = new protomon.monst(rongzeedid, rongzeedsp, rongzeedat, rongzeedde, rongzeedhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blattle = new protomon.monst(blattleid, blattlesp, blattleat, blattlede, blattlehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Swogharnler = new protomon.monst(swogharnlerid, swogharnlersp, swogharnlerat, swogharnlerde, swogharnlerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Adenolish = new protomon.monst(adenolishid, adenolishsp, adenolishat, adenolishde, adenolishhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Genaupresang = new protomon.monst(genaupresangid, genaupresangsp, genaupresangat, genaupresangde, genaupresanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    // monst Daahnida = new monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, 0,4,0,2);
    protomon.monst Daahnida = new protomon.monst(daahnidaid, daahnidasp, daahnidaat, daahnidade, daahnidahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sorba = new protomon.monst(sorbaid, sorbasp, sorbaat, sorbade, sorbahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Jiyou = new protomon.monst(jiyouid, jiyousp, jiyouat, jiyoude, jiyouhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sparvae = new protomon.monst(sparvaeid, sparvaesp, sparvaeat, sparvaede, sparvaehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Vellup = new protomon.monst(vellupid, vellupsp, vellupat, vellupde, velluphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Bellaja = new protomon.monst(bellajaid, bellajasp, bellajaat, bellajade, bellajahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Levdzell = new protomon.monst(levdzellid, levdzellsp, levdzellat, levdzellde, levdzellhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rytegg = new protomon.monst(ryteggid, ryteggsp, ryteggat, ryteggde, rytegghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Flashmer = new protomon.monst(flashmerid, flashmersp, flashmerat, flashmerde, flashmerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Schmodozer = new protomon.monst(schmodozerid, schmodozersp, schmodozerat, schmodozerde, schmodozerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Octgotot = new protomon.monst(octgototid, octgototsp, octgototat, octgototde, octgotothe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Triaural = new protomon.monst(triauralid, triauralsp, triauralat, triauralde, triauralhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Dicyto = new protomon.monst(dicytoid, dicytosp, dicytoat, dicytode, dicytohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Monopteryx = new protomon.monst(monopteryxid, monopteryxsp, monopteryxat, monopteryxde, monopteryxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elastocark = new protomon.monst(elastocarkid, elastocarksp, elastocarkat, elastocarkde, elastocarkhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toobapath = new protomon.monst(toobapathid, toobapathsp, toobapathat, toobapathde, toobapathhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Weeliosbop = new protomon.monst(weeliosbopid, weeliosbopsp, weeliosbopat, weeliosbopde, weeliosbophe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ihmpdrap = new protomon.monst(ihmpdrapid, ihmpdrapsp, ihmpdrapat, ihmpdrapde, ihmpdraphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Epibazang = new protomon.monst(epibazangid, epibazangsp, epibazangat, epibazangde, epibazanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hemtan = new protomon.monst(hemtanid, hemtansp, hemtanat, hemtande, hemtanhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ogo = new protomon.monst(ogoid, ogosp, ogoat, ogode, ogohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Strachid = new protomon.monst(strachidid, strachidsp, strachidat, strachidde, strachidhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Toximastica = new protomon.monst(toximasticaid, toximasticasp, toximasticaat, toximasticade, toximasticahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Urcuria = new protomon.monst(urcuriaid, urcuriasp, urcuriaat, urcuriade, urcuriahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Hyuntress = new protomon.monst(hyuntressid, hyuntresssp, hyuntressat, hyuntressde, hyuntresshe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mondosplak = new protomon.monst(mondosplakid, mondosplaksp, mondosplakat, mondosplakde, mondosplakhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kaheksaguge = new protomon.monst(kaheksagugeid, kaheksagugesp, kaheksagugeat, kaheksagugede, kaheksagugehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sapiosuant = new protomon.monst(sapiosuantid, sapiosuantsp, sapiosuantat, sapiosuantde, sapiosuanthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Munegull = new protomon.monst(munegullid, munegullsp, munegullat, munegullde, munegullhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sudakleez = new protomon.monst(sudakleezid, sudakleezsp, sudakleezat, sudakleezde, sudakleezhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Halocordate = new protomon.monst(halocordateid, halocordatesp, halocordateat, halocordatede, halocordatehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Fædendron = new protomon.monst(fædendronid, fædendronsp, fædendronat, fædendronde, fædendronhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Osteoplang = new protomon.monst(osteoplangid, osteoplangsp, osteoplangat, osteoplangde, osteoplanghe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Жrachnid = new protomon.monst(жrachnidid, жrachnidsp, жrachnidat, жrachnidde, жrachnidhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ϫlitch = new protomon.monst(Ϫlitchid, Ϫlitchsp, Ϫlitchat, Ϫlitchde, Ϫlitchhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst በ = new protomon.monst(በid, በsp, በat, በde, በhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mantidile = new protomon.monst(mantidileid, mantidilesp, mantidileat, mantidilede, mantidilehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nokoyl = new protomon.monst(nokoylid, nokoylsp, nokoylat, nokoylde, nokoylhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Яallod = new protomon.monst(яallodid, яallodsp, яallodat, яallodde, яallodhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Algaetizer = new protomon.monst(algaetizerid, algaetizersp, algaetizerat, algaetizerde, algaetizerhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kachort = new protomon.monst(kachortid, kachortsp, kachortat, kachortde, kachorthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Slamelion = new protomon.monst(slamelionid, slamelionsp, slamelionat, slamelionde, slamelionhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ayateda = new protomon.monst(ayatedaid, ayatedasp, ayatedaat, ayatedade, ayatedahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Wochem = new protomon.monst(wochemid, wochemsp, wochemat, wochemde, wochemhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ƕmun = new protomon.monst(Ƕmunid, Ƕmunsp, Ƕmunat, Ƕmunde, Ƕmunhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ψkobath = new protomon.monst(ψkobathid, ψkobathsp, ψkobathat, ψkobathde, ψkobathhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gytanic = new protomon.monst(gytanicid, gytanicsp, gytanicat, gytanicde, gytaniche, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst βeiß = new protomon.monst(βeißid, βeißsp, βeißat, βeißde, βeißhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Gungholio = new protomon.monst(gungholioid, gungholiosp, gungholioat, gungholiode, gungholiohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Honigkönig = new protomon.monst(honigkönigid, honigkönigsp, honigkönigat, honigkönigde, honigkönighe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Kungulp = new protomon.monst(kungulpid, kungulpsp, kungulpat, kungulpde, kungulphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Σatinella = new protomon.monst(σatinellaid, σatinellasp, σatinellaat, σatinellade, σatinellahe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Elocurl = new protomon.monst(elocurlid, elocurlsp, elocurlat, elocurlde, elocurlhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Takobie = new protomon.monst(takobieid, takobiesp, takobieat, takobiede, takobiehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Ōbchovy = new protomon.monst(ōbchovyid, ōbchovysp, ōbchovyat, ōbchovyde, ōbchovyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Nimnamnom = new protomon.monst(nimnamnomid, nimnamnomsp, nimnamnomat, nimnamnomde, nimnamnomhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Tutewtoo = new protomon.monst(tutewtooid, tutewtoosp, tutewtooat, tutewtoode, tutewtoohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Blanqast = new protomon.monst(blanqastid, blanqastsp, blanqastat, blanqastde, blanqasthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Indeo = new protomon.monst(indeoid, indeosp, indeoat, indeode, indeohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Deblobbio = new protomon.monst(deblobbioid, deblobbiosp, deblobbioat, deblobbiode, deblobbiohe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Knightstacean = new protomon.monst(knightstaceanid, knightstaceansp, knightstaceanat, knightstaceande, knightstaceanhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Prostrax = new protomon.monst(prostraxid, prostraxsp, prostraxat, prostraxde, prostraxhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Haptozahen = new protomon.monst(haptozahenid, haptozahensp, haptozahenat, haptozahende, haptozahenhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Minkohabod = new protomon.monst(minkohabodid, minkohabodsp, minkohabodat, minkohabodde, minkohabodhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zeen = new protomon.monst(zeenid, zeensp, zeenat, zeende, zeenhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
   protomon.monst Tacroach = new protomon.monst(tacroachid, tacroachsp, tacroachat, tacroachde, tacroachhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Manterfly = new protomon.monst(manterflyid, manterflysp, manterflyat, manterflyde, manterflyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Beary = new protomon.monst(bearyid, bearysp, bearyat, bearyde, bearyhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Sluggernaut = new protomon.monst(sluggernautid, sluggernautsp, sluggernautat, sluggernautde, sluggernauthe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Memeek = new protomon.monst(memeekid, memeeksp, memeekat, memeekde, memeekhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Doughgnat = new protomon.monst(doughgnatid, doughgnatsp, doughgnatat, doughgnatde, doughgnathe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Rattic = new protomon.monst(ratticid, ratticsp, ratticat, ratticde, rattiche, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Missileaneous = new protomon.monst(missileaneousid, missileaneoussp, missileaneousat, missileaneousde, missileaneoushe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Runnybabbit = new protomon.monst(runnybabbitid, runnybabbitsp, runnybabbitat, runnybabbitde, runnybabbithe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Zubgondrakter = new protomon.monst(zubgondrakterid, zubgondraktersp, zubgondrakterat, zubgondrakterde, zubgondrakterhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Custom = new protomon.monst(91, 51, 51, 51, 51, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst error = new protomon.monst(0, stats(51), stats(51), stats(51), stats(753), 0,0,0,0,0);
    protomon.monst EmptyBox = new protomon.monst(201, 1, 1, 1, 0, 0,0,0,0,0);
    protomon.monst Whumpuhmp = new protomon.monst(whumpuhmpid, whumpuhmpsp, whumpuhmpat, whumpuhmpde, whumpuhmphe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
    protomon.monst Mangoon = new protomon.monst(mangoonid, mangoonsp, mangoonat, mangoonde, mangoonhe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
protomon.monst Scarbeque = new protomon.monst(scarbequeid, scarbequesp, scarbequeat, scarbequede, scarbequehe, SpecialMoves(0),SpeedMoves(0),AttackMoves(0), HealMoves(0), UniqueIdentifier(0));
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



    AgentObject emptybox = new AgentObject(a01, EmptyBox.clone());
    AgentObject emptyboxx = new AgentObject(a01, Takobie.clone());
   // protomon.monst attackermonster;
    //protomon.monst playermonster;

    AgentObject[] AgentPositions = {emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone()};

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.dynamics_activity_fork);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Seasons = findViewById(R.id.SeasonView);
        Center = findViewById(R.id.CenterView);
        Edge = findViewById(R.id.EdgeView);
        Median = findViewById(R.id.MedianView);
        first = findViewById(R.id.FirstView);
        second = findViewById(R.id.SecondView);
        third = findViewById(R.id.ThirdView);
        fourth = findViewById(R.id.FourthView);
        fifth = findViewById(R.id.FifthView);
        sixth = findViewById(R.id.SixthView);
        seventh = findViewById(R.id.SeventhView);

        RandomButton = findViewById(R.id.Randomizer);
        ClearButton = findViewById(R.id.Clear);
        TestButton = findViewById(R.id.Test);
        AddButton = findViewById(R.id.AddRandom);
        FasterButton = findViewById(R.id.Faster);
        SlowerButton = findViewById(R.id.Slower);
        FlipButton = findViewById(R.id.Flipper);
        FirstButton = findViewById(R.id.FirstStep);
        SecondButton = findViewById(R.id.SecondStep);
        ThirdButton = findViewById(R.id.ThirdStep);
        FourthButton = findViewById(R.id.FourthStep);
        FifthButton = findViewById(R.id.FifthStep);
        SixthButton = findViewById(R.id.SixthStep);
        SeventhButton = findViewById(R.id.SeventhStep);
        FirstButton.setVisibility(View.VISIBLE);
        SecondButton.setVisibility(View.INVISIBLE);
        ThirdButton.setVisibility(View.INVISIBLE);
        FourthButton.setVisibility(View.INVISIBLE);
        FifthButton.setVisibility(View.INVISIBLE);
        SixthButton.setVisibility(View.INVISIBLE);
        SeventhButton.setVisibility(View.INVISIBLE);
        FasterButton.setVisibility(View.INVISIBLE);
        SlowerButton.setVisibility(View.INVISIBLE);

        Median.setVisibility(View.INVISIBLE);
        Edge.setVisibility(View.INVISIBLE);
        Center.setVisibility(View.INVISIBLE);

        RandomButton.setVisibility(View.INVISIBLE);
        ClearButton.setVisibility(View.INVISIBLE);


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
        
        a21 = findViewById(R.id.A21);
        a22 = findViewById(R.id.A22);
        a23 = findViewById(R.id.A23);
        a24 = findViewById(R.id.A24);
        a25 = findViewById(R.id.A25);
        
        b21 = findViewById(R.id.B21);
        b22 = findViewById(R.id.B22);
        b23 = findViewById(R.id.B23);
        b24 = findViewById(R.id.B24);
        b25 = findViewById(R.id.B25);
        
        c21 = findViewById(R.id.C21);
        c22 = findViewById(R.id.C22);
        c23 = findViewById(R.id.C23);
        c24 = findViewById(R.id.C24);
        c25 = findViewById(R.id.C25);
        
        d21 = findViewById(R.id.D21);
        d22 = findViewById(R.id.D22);
        d23 = findViewById(R.id.D23);
        d24 = findViewById(R.id.D24);
        d25 = findViewById(R.id.D25);
        
        e21 = findViewById(R.id.E21);
        e22 = findViewById(R.id.E22);
        e23 = findViewById(R.id.E23);
        e24 = findViewById(R.id.E24);
        e25 = findViewById(R.id.E25);
        
        f21 = findViewById(R.id.F21);
        f22 = findViewById(R.id.F22);
        f23 = findViewById(R.id.F23);
        f24 = findViewById(R.id.F24);
        f25 = findViewById(R.id.F25);
        
        g21 = findViewById(R.id.G21);
        g22 = findViewById(R.id.G22);
        g23 = findViewById(R.id.G23);
        g24 = findViewById(R.id.G24);
        g25 = findViewById(R.id.G25);
        
        h21 = findViewById(R.id.H21);
        h22 = findViewById(R.id.H22);
        h23 = findViewById(R.id.H23);
        h24 = findViewById(R.id.H24);
        h25 = findViewById(R.id.H25);
        
        i21 = findViewById(R.id.I21);
        i22 = findViewById(R.id.I22);
        i23 = findViewById(R.id.I23);
        i24 = findViewById(R.id.I24);
        i25 = findViewById(R.id.I25);
        
        j21 = findViewById(R.id.J21);
        j22 = findViewById(R.id.J22);
        j23 = findViewById(R.id.J23);
        j24 = findViewById(R.id.J24);
        j25 = findViewById(R.id.J25);
        
        k21 = findViewById(R.id.K21);
        k22 = findViewById(R.id.K22);
        k23 = findViewById(R.id.K23);
        k24 = findViewById(R.id.K24);
        k25 = findViewById(R.id.K25);
        
        l21 = findViewById(R.id.L21);
        l22 = findViewById(R.id.L22);
        l23 = findViewById(R.id.L23);
        l24 = findViewById(R.id.L24);
        l25 = findViewById(R.id.L25);
        
        m21 = findViewById(R.id.M21);
        m22 = findViewById(R.id.M22);
        m23 = findViewById(R.id.M23);
        m24 = findViewById(R.id.M24);
        m25 = findViewById(R.id.M25);
        
        n21 = findViewById(R.id.N21);
        n22 = findViewById(R.id.N22);
        n23 = findViewById(R.id.N23);
        n24 = findViewById(R.id.N24);
        n25 = findViewById(R.id.N25);
        
        o21 = findViewById(R.id.O21);
        o22 = findViewById(R.id.O22);
        o23 = findViewById(R.id.O23);
        o24 = findViewById(R.id.O24);
        o25 = findViewById(R.id.O25);
        
        p21 = findViewById(R.id.P21);
        p22 = findViewById(R.id.P22);
        p23 = findViewById(R.id.P23);
        p24 = findViewById(R.id.P24);
        p25 = findViewById(R.id.P25);
        
        q21 = findViewById(R.id.Q21);
        q22 = findViewById(R.id.Q22);
        q23 = findViewById(R.id.Q23);
        q24 = findViewById(R.id.Q24);
        q25 = findViewById(R.id.Q25);
        
        r21 = findViewById(R.id.R21);
        r22 = findViewById(R.id.R22);
        r23 = findViewById(R.id.R23);
        r24 = findViewById(R.id.R24);
        r25 = findViewById(R.id.R25);
        
        s21 = findViewById(R.id.S21);
        s22 = findViewById(R.id.S22);
        s23 = findViewById(R.id.S23);
        s24 = findViewById(R.id.S24);
        s25 = findViewById(R.id.S25);
        
        t21 = findViewById(R.id.T21);
        t22 = findViewById(R.id.T22);
        t23 = findViewById(R.id.T23);
        t24 = findViewById(R.id.T24);
        t25 = findViewById(R.id.T25);






        u01 = findViewById(R.id.U01);
        u02 = findViewById(R.id.U02);
        u03 = findViewById(R.id.U03);
        u04 = findViewById(R.id.U04);
        u05 = findViewById(R.id.U05);
        u06 = findViewById(R.id.U06);
        u07 = findViewById(R.id.U07);
        u08 = findViewById(R.id.U08);
        u09 = findViewById(R.id.U09);
        u10 = findViewById(R.id.U10);
        u11 = findViewById(R.id.U11);
        u12 = findViewById(R.id.U12);
        u13 = findViewById(R.id.U13);
        u14 = findViewById(R.id.U14);
        u15 = findViewById(R.id.U15);
        u16 = findViewById(R.id.U16);
        u17 = findViewById(R.id.U17);
        u18 = findViewById(R.id.U18);
        u19 = findViewById(R.id.U19);
        u20 = findViewById(R.id.U20);
        u21 = findViewById(R.id.U21);
        u22 = findViewById(R.id.U22);
        u23 = findViewById(R.id.U23);
        u24 = findViewById(R.id.U24);
        u25 = findViewById(R.id.U25);



        v01 = findViewById(R.id.V01);
        v02 = findViewById(R.id.V02);
        v03 = findViewById(R.id.V03);
        v04 = findViewById(R.id.V04);
        v05 = findViewById(R.id.V05);
        v06 = findViewById(R.id.V06);
        v07 = findViewById(R.id.V07);
        v08 = findViewById(R.id.V08);
        v09 = findViewById(R.id.V09);
        v10 = findViewById(R.id.V10);
        v11 = findViewById(R.id.V11);
        v12 = findViewById(R.id.V12);
        v13 = findViewById(R.id.V13);
        v14 = findViewById(R.id.V14);
        v15 = findViewById(R.id.V15);
        v16 = findViewById(R.id.V16);
        v17 = findViewById(R.id.V17);
        v18 = findViewById(R.id.V18);
        v19 = findViewById(R.id.V19);
        v20 = findViewById(R.id.V20);
        v21 = findViewById(R.id.V21);
        v22 = findViewById(R.id.V22);
        v23 = findViewById(R.id.V23);
        v24 = findViewById(R.id.V24);
        v25 = findViewById(R.id.V25);



        w01 = findViewById(R.id.W01);
        w02 = findViewById(R.id.W02);
        w03 = findViewById(R.id.W03);
        w04 = findViewById(R.id.W04);
        w05 = findViewById(R.id.W05);
        w06 = findViewById(R.id.W06);
        w07 = findViewById(R.id.W07);
        w08 = findViewById(R.id.W08);
        w09 = findViewById(R.id.W09);
        w10 = findViewById(R.id.W10);
        w11 = findViewById(R.id.W11);
        w12 = findViewById(R.id.W12);
        w13 = findViewById(R.id.W13);
        w14 = findViewById(R.id.W14);
        w15 = findViewById(R.id.W15);
        w16 = findViewById(R.id.W16);
        w17 = findViewById(R.id.W17);
        w18 = findViewById(R.id.W18);
        w19 = findViewById(R.id.W19);
        w20 = findViewById(R.id.W20);
        w21 = findViewById(R.id.W21);
        w22 = findViewById(R.id.W22);
        w23 = findViewById(R.id.W23);
        w24 = findViewById(R.id.W24);
        w25 = findViewById(R.id.W25);



        x01 = findViewById(R.id.X01);
        x02 = findViewById(R.id.X02);
        x03 = findViewById(R.id.X03);
        x04 = findViewById(R.id.X04);
        x05 = findViewById(R.id.X05);
        x06 = findViewById(R.id.X06);
        x07 = findViewById(R.id.X07);
        x08 = findViewById(R.id.X08);
        x09 = findViewById(R.id.X09);
        x10 = findViewById(R.id.X10);
        x11 = findViewById(R.id.X11);
        x12 = findViewById(R.id.X12);
        x13 = findViewById(R.id.X13);
        x14 = findViewById(R.id.X14);
        x15 = findViewById(R.id.X15);
        x16 = findViewById(R.id.X16);
        x17 = findViewById(R.id.X17);
        x18 = findViewById(R.id.X18);
        x19 = findViewById(R.id.X19);
        x20 = findViewById(R.id.X20);
        x21 = findViewById(R.id.X21);
        x22 = findViewById(R.id.X22);
        x23 = findViewById(R.id.X23);
        x24 = findViewById(R.id.X24);
        x25 = findViewById(R.id.X25);



        y01 = findViewById(R.id.Y01);
        y02 = findViewById(R.id.Y02);
        y03 = findViewById(R.id.Y03);
        y04 = findViewById(R.id.Y04);
        y05 = findViewById(R.id.Y05);
        y06 = findViewById(R.id.Y06);
        y07 = findViewById(R.id.Y07);
        y08 = findViewById(R.id.Y08);
        y09 = findViewById(R.id.Y09);
        y10 = findViewById(R.id.Y10);
        y11 = findViewById(R.id.Y11);
        y12 = findViewById(R.id.Y12);
        y13 = findViewById(R.id.Y13);
        y14 = findViewById(R.id.Y14);
        y15 = findViewById(R.id.Y15);
        y16 = findViewById(R.id.Y16);
        y17 = findViewById(R.id.Y17);
        y18 = findViewById(R.id.Y18);
        y19 = findViewById(R.id.Y19);
        y20 = findViewById(R.id.Y20);
        y21 = findViewById(R.id.Y21);
        y22 = findViewById(R.id.Y22);
        y23 = findViewById(R.id.Y23);
        y24 = findViewById(R.id.Y24);
        y25 = findViewById(R.id.Y25);

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

        FlipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flipper == 0) {
                    flipper = 1;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.INVISIBLE);
                    third.setVisibility(View.INVISIBLE);
                    fourth.setVisibility(View.INVISIBLE);
                    fifth.setVisibility(View.INVISIBLE);
                    sixth.setVisibility(View.INVISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.INVISIBLE);
                    ThirdButton.setVisibility(View.INVISIBLE);
                    FourthButton.setVisibility(View.INVISIBLE);
                    FifthButton.setVisibility(View.INVISIBLE);
                    SixthButton.setVisibility(View.INVISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);

                }else if (flipper == 1) {
                    flipper = 2;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.INVISIBLE);
                    fourth.setVisibility(View.INVISIBLE);
                    fifth.setVisibility(View.INVISIBLE);
                    sixth.setVisibility(View.INVISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.INVISIBLE);
                    FourthButton.setVisibility(View.INVISIBLE);
                    FifthButton.setVisibility(View.INVISIBLE);
                    SixthButton.setVisibility(View.INVISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);
                }else if (flipper == 2) {
                    flipper = 3;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.VISIBLE);
                    fourth.setVisibility(View.INVISIBLE);
                    fifth.setVisibility(View.INVISIBLE);
                    sixth.setVisibility(View.INVISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.VISIBLE);
                    FourthButton.setVisibility(View.INVISIBLE);
                    FifthButton.setVisibility(View.INVISIBLE);
                    SixthButton.setVisibility(View.INVISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);
                }else if (flipper == 3) {
                    flipper = 4;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.VISIBLE);
                    fourth.setVisibility(View.VISIBLE);
                    fifth.setVisibility(View.INVISIBLE);
                    sixth.setVisibility(View.INVISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.VISIBLE);
                    FourthButton.setVisibility(View.VISIBLE);
                    FifthButton.setVisibility(View.INVISIBLE);
                    SixthButton.setVisibility(View.INVISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);
                }else if (flipper == 4) {
                    flipper = 5;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.VISIBLE);
                    fourth.setVisibility(View.VISIBLE);
                    fifth.setVisibility(View.VISIBLE);
                    sixth.setVisibility(View.INVISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.VISIBLE);
                    FourthButton.setVisibility(View.VISIBLE);
                    FifthButton.setVisibility(View.VISIBLE);
                    SixthButton.setVisibility(View.INVISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);
                }else if (flipper == 5) {
                    flipper = 6;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.VISIBLE);
                    fourth.setVisibility(View.VISIBLE);
                    fifth.setVisibility(View.VISIBLE);
                    sixth.setVisibility(View.VISIBLE);
                    seventh.setVisibility(View.INVISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.VISIBLE);
                    FourthButton.setVisibility(View.VISIBLE);
                    FifthButton.setVisibility(View.VISIBLE);
                    SixthButton.setVisibility(View.VISIBLE);
                    SeventhButton.setVisibility(View.INVISIBLE);
                }else if (flipper == 6) {
                    flipper = 0;
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.VISIBLE);
                    third.setVisibility(View.VISIBLE);
                    fourth.setVisibility(View.VISIBLE);
                    fifth.setVisibility(View.VISIBLE);
                    sixth.setVisibility(View.VISIBLE);
                    seventh.setVisibility(View.VISIBLE);
                    FirstButton.setVisibility(View.VISIBLE);
                    SecondButton.setVisibility(View.VISIBLE);
                    ThirdButton.setVisibility(View.VISIBLE);
                    FourthButton.setVisibility(View.VISIBLE);
                    FifthButton.setVisibility(View.VISIBLE);
                    SixthButton.setVisibility(View.VISIBLE);
                    SeventhButton.setVisibility(View.VISIBLE);
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
        FirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    FirstMonster++;
                }else {
                    FirstMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);
            first.setText(names(FirstMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(FirstMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    SecondMonster++;
                }else {
                    SecondMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);
            second.setText(names(SecondMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(SecondMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        ThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    ThirdMonster++;
                }else {
                    ThirdMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);
            third.setText(names(ThirdMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(ThirdMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        FourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    FourthMonster++;
                }else {
                    FourthMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);
            fourth.setText(names(FourthMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(FourthMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        FifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    FifthMonster++;
                }else {
                    FifthMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);
            fifth.setText(names(FifthMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(FifthMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        SixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    SixthMonster++;
                }else {
                    SixthMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(SixthMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(SixthMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(SixthMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(SixthMonster).Speed);
            sixth.setText(names(SixthMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(SixthMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        SeventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    SeventhMonster++;
                }else {
                    SeventhMonster = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                }
                String H = " H" + SetIntToString((int) monstlist(SeventhMonster).Health);
                String D = " D" + SetIntToString((int) monstlist(SeventhMonster).Defense);
                String A = " A" + SetIntToString((int) monstlist(SeventhMonster).Attack);
                String S = " S" + SetIntToString((int) monstlist(SeventhMonster).Speed);
            seventh.setText(names(SeventhMonster)+H+D+A+S + "\n ");
                try {
                    MeemeekMakerMethod(SeventhMonster);
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        });
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String bant = inputbox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    try {
                        AgentPositions[new Random().nextInt(625)].Agent = monstlist(new Random().nextInt(90)).clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }else {
                    int GGGG = (int) Double.parseDouble(String.valueOf(inputbox1.getText()));
                    try {
                        AgentPositions[new Random().nextInt(625)].Agent = monstlist(GGGG).clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }


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
                    Seasons.setTextSize(TypedValue.COMPLEX_UNIT_SP, (((float)life/(float)6)+4));
                    datenum = "%s";



                    
                    if(flipper == 1) {

                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                      //  first.setTextSize(TypedValue.COMPLEX_UNIT_SP, ((FirstMonsterc/60)+4));
                        FirstMonsterc = 0;


                    }else if (flipper == 2){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                      //  first.setTextSize(TypedValue.COMPLEX_UNIT_SP, ((FirstMonsterc/60)+4));
                        FirstMonsterc = 0;
                        
                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;
                    }else if (flipper == 3){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                        FirstMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                        third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                        ThirdMonsterc = 0;
                    }else if (flipper == 4){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                        FirstMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                        third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                        ThirdMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                        fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                        FourthMonsterc = 0;
                    }else if (flipper == 5){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                        FirstMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                        third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                        ThirdMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                        fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                        FourthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                        fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                        FifthMonsterc = 0;
                    }else if (flipper == 6){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                        FirstMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                        third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                        ThirdMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                        fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                        FourthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                        fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                        FifthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SixthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SixthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SixthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SixthMonster).Speed);

                        sixth.setText(names(SixthMonster) + H + D + A + S + "\n" + SetIntToString(SixthMonsterc));
                        SixthMonsterc = 0;
                    }else if (flipper == 0){
                        String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                        String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                        String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                        String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                        first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                        FirstMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                        second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                        SecondMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                        third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                        ThirdMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                        fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                        FourthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                        fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                        FifthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SixthMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SixthMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SixthMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SixthMonster).Speed);

                        sixth.setText(names(SixthMonster) + H + D + A + S + "\n" + SetIntToString(SixthMonsterc));
                        SixthMonsterc = 0;

                        H = " H" + SetIntToString((int) monstlist(SeventhMonster).Health);
                        D = " D" + SetIntToString((int) monstlist(SeventhMonster).Defense);
                        A = " A" + SetIntToString((int) monstlist(SeventhMonster).Attack);
                        S = " S" + SetIntToString((int) monstlist(SeventhMonster).Speed);

                        seventh.setText(names(SeventhMonster) + H + D + A + S + "\n" + SetIntToString(SeventhMonsterc));
                        SeventhMonsterc = 0;
                    }

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


        try {
            MeemeekMakerMethod(92);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    private protomon.monst[] MeemeekMakerMethod(int Memeekchecker) throws CloneNotSupportedException {

        if (Memeekchecker == 92){
            for (int gd = 0; gd < Memeeks.length-1; gd++){
                Memeeks[gd] = monstlist((int)Memeek.Idnum).clone();
            }
        }
        return  Memeeks;
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
        testFiller(a21);
        testFiller(a22);
        testFiller(a23);
        testFiller(a24);
        testFiller(a25);

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
        testFiller(b21);
        testFiller(b22);
        testFiller(b23);
        testFiller(b24);
        testFiller(b25);

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
        testFiller(c21);
        testFiller(c22);
        testFiller(c23);
        testFiller(c24);
        testFiller(c25);

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
        testFiller(d21);
        testFiller(d22);
        testFiller(d23);
        testFiller(d24);
        testFiller(d25);

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
        testFiller(e21);
        testFiller(e22);
        testFiller(e23);
        testFiller(e24);
        testFiller(e25);

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
        testFiller(f21);
        testFiller(f22);
        testFiller(f23);
        testFiller(f24);
        testFiller(f25);

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
        testFiller(g21);
        testFiller(g22);
        testFiller(g23);
        testFiller(g24);
        testFiller(g25);

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
        testFiller(h21);
        testFiller(h22);
        testFiller(h23);
        testFiller(h24);
        testFiller(h25);

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
        testFiller(i21);
        testFiller(i22);
        testFiller(i23);
        testFiller(i24);
        testFiller(i25);

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
        testFiller(j21);
        testFiller(j22);
        testFiller(j23);
        testFiller(j24);
        testFiller(j25);

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
        testFiller(k21);
        testFiller(k22);
        testFiller(k23);
        testFiller(k24);
        testFiller(k25);

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
        testFiller(l21);
        testFiller(l22);
        testFiller(l23);
        testFiller(l24);
        testFiller(l25);

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
        testFiller(m21);
        testFiller(m22);
        testFiller(m23);
        testFiller(m24);
        testFiller(m25);

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
        testFiller(n21);
        testFiller(n22);
        testFiller(n23);
        testFiller(n24);
        testFiller(n25);

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
        testFiller(o21);
        testFiller(o22);
        testFiller(o23);
        testFiller(o24);
        testFiller(o25);

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
        testFiller(p21);
        testFiller(p22);
        testFiller(p23);
        testFiller(p24);
        testFiller(p25);

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
        testFiller(q21);
        testFiller(q22);
        testFiller(q23);
        testFiller(q24);
        testFiller(q25);

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
        testFiller(r21);
        testFiller(r22);
        testFiller(r23);
        testFiller(r24);
        testFiller(r25);

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
        testFiller(s21);
        testFiller(s22);
        testFiller(s23);
        testFiller(s24);
        testFiller(s25);

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
        testFiller(t21);
        testFiller(t22);
        testFiller(t23);
        testFiller(t24);
        testFiller(t25);

        testFiller(u01);
        testFiller(u02);
        testFiller(u03);
        testFiller(u04);
        testFiller(u05);
        testFiller(u06);
        testFiller(u07);
        testFiller(u08);
        testFiller(u09);
        testFiller(u10);
        testFiller(u11);
        testFiller(u12);
        testFiller(u13);
        testFiller(u14);
        testFiller(u15);
        testFiller(u16);
        testFiller(u17);
        testFiller(u18);
        testFiller(u19);
        testFiller(u20);
        testFiller(u21);
        testFiller(u22);
        testFiller(u23);
        testFiller(u24);
        testFiller(u25);

        testFiller(v01);
        testFiller(v02);
        testFiller(v03);
        testFiller(v04);
        testFiller(v05);
        testFiller(v06);
        testFiller(v07);
        testFiller(v08);
        testFiller(v09);
        testFiller(v10);
        testFiller(v11);
        testFiller(v12);
        testFiller(v13);
        testFiller(v14);
        testFiller(v15);
        testFiller(v16);
        testFiller(v17);
        testFiller(v18);
        testFiller(v19);
        testFiller(v20);
        testFiller(v21);
        testFiller(v22);
        testFiller(v23);
        testFiller(v24);
        testFiller(v25);

        testFiller(w01);
        testFiller(w02);
        testFiller(w03);
        testFiller(w04);
        testFiller(w05);
        testFiller(w06);
        testFiller(w07);
        testFiller(w08);
        testFiller(w09);
        testFiller(w10);
        testFiller(w11);
        testFiller(w12);
        testFiller(w13);
        testFiller(w14);
        testFiller(w15);
        testFiller(w16);
        testFiller(w17);
        testFiller(w18);
        testFiller(w19);
        testFiller(w20);
        testFiller(w21);
        testFiller(w22);
        testFiller(w23);
        testFiller(w24);
        testFiller(w25);

        testFiller(x01);
        testFiller(x02);
        testFiller(x03);
        testFiller(x04);
        testFiller(x05);
        testFiller(x06);
        testFiller(x07);
        testFiller(x08);
        testFiller(x09);
        testFiller(x10);
        testFiller(x11);
        testFiller(x12);
        testFiller(x13);
        testFiller(x14);
        testFiller(x15);
        testFiller(x16);
        testFiller(x17);
        testFiller(x18);
        testFiller(x19);
        testFiller(x20);
        testFiller(x21);
        testFiller(x22);
        testFiller(x23);
        testFiller(x24);
        testFiller(x25);

        testFiller(y01);
        testFiller(y02);
        testFiller(y03);
        testFiller(y04);
        testFiller(y05);
        testFiller(y06);
        testFiller(y07);
        testFiller(y08);
        testFiller(y09);
        testFiller(y10);
        testFiller(y11);
        testFiller(y12);
        testFiller(y13);
        testFiller(y14);
        testFiller(y15);
        testFiller(y16);
        testFiller(y17);
        testFiller(y18);
        testFiller(y19);
        testFiller(y20);
        testFiller(y21);
        testFiller(y22);
        testFiller(y23);
        testFiller(y24);
        testFiller(y25);
        if (uniquifier == 0) {

            for (int k = 0; k < AgentPositions.length; k++) {
                AgentPositions[k].Agent.UniqueID = UniqueIdentifier(0);
            }
            uniquifier = 1;

        } else{
        }
        arrayfillercountx = 0;
    }

    public void randomdisp() throws CloneNotSupportedException {
        
            imagegrant(a01, Daahnida.clone());
            imagegrant(a02, Daahnida.clone());
            imagegrant(a03, Daahnida.clone());
            imagegrant(a04, Daahnida.clone());
            imagegrant(a05, Daahnida.clone());
            imagegrant(a06, Daahnida.clone());
            imagegrant(a07, Daahnida.clone());
            imagegrant(a08, Daahnida.clone());
            imagegrant(a09, Daahnida.clone());
            imagegrant(a10, Daahnida.clone());
            imagegrant(a11, Daahnida.clone());
            imagegrant(a12, Daahnida.clone());
            imagegrant(a13, Daahnida.clone());
            imagegrant(a14, Daahnida.clone());
            imagegrant(a15, Daahnida.clone());
            imagegrant(a16, Daahnida.clone());
            imagegrant(a17, Daahnida.clone());
            imagegrant(a18, Daahnida.clone());
            imagegrant(a19, Daahnida.clone());
            imagegrant(a20, Daahnida.clone());
            imagegrant(a21, Daahnida.clone());
            imagegrant(a22, Daahnida.clone());
            imagegrant(a23, Daahnida.clone());
            imagegrant(a24, Daahnida.clone());
            imagegrant(a25, Daahnida.clone());

            imagegrant(b01, Daahnida.clone());
            imagegrant(b02, Daahnida.clone());
            imagegrant(b03, Daahnida.clone());
            imagegrant(b04, Daahnida.clone());
            imagegrant(b05, Daahnida.clone());
            imagegrant(b06, Daahnida.clone());
            imagegrant(b07, Daahnida.clone());
            imagegrant(b08, Daahnida.clone());
            imagegrant(b09, Daahnida.clone());
            imagegrant(b10, Daahnida.clone());
            imagegrant(b11, Daahnida.clone());
            imagegrant(b12, Daahnida.clone());
            imagegrant(b13, Daahnida.clone());
            imagegrant(b14, Daahnida.clone());
            imagegrant(b15, Daahnida.clone());
            imagegrant(b16, Daahnida.clone());
            imagegrant(b17, Daahnida.clone());
            imagegrant(b18, Daahnida.clone());
            imagegrant(b19, Daahnida.clone());
            imagegrant(b20, Daahnida.clone());
            imagegrant(b21, Daahnida.clone());
            imagegrant(b22, Daahnida.clone());
            imagegrant(b23, Daahnida.clone());
            imagegrant(b24, Daahnida.clone());
            imagegrant(b25, Daahnida.clone());

            imagegrant(c01, Daahnida.clone());
            imagegrant(c02, Daahnida.clone());
            imagegrant(c03, Daahnida.clone());
            imagegrant(c04, Daahnida.clone());
            imagegrant(c05, Daahnida.clone());
            imagegrant(c06, Daahnida.clone());
            imagegrant(c07, Daahnida.clone());
            imagegrant(c08, Daahnida.clone());
            imagegrant(c09, Daahnida.clone());
            imagegrant(c10, Daahnida.clone());
            imagegrant(c11, Daahnida.clone());
            imagegrant(c12, Daahnida.clone());
            imagegrant(c13, Daahnida.clone());
            imagegrant(c14, Daahnida.clone());
            imagegrant(c15, Daahnida.clone());
            imagegrant(c16, Daahnida.clone());
            imagegrant(c17, Daahnida.clone());
            imagegrant(c18, Daahnida.clone());
            imagegrant(c19, Daahnida.clone());
            imagegrant(c20, Daahnida.clone());
            imagegrant(c21, Daahnida.clone());
            imagegrant(c22, Daahnida.clone());
            imagegrant(c23, Daahnida.clone());
            imagegrant(c24, Daahnida.clone());
            imagegrant(c25, Daahnida.clone());

            imagegrant(d01, Daahnida.clone());
            imagegrant(d02, Daahnida.clone());
            imagegrant(d03, Daahnida.clone());
            imagegrant(d04, Daahnida.clone());
            imagegrant(d05, Daahnida.clone());
            imagegrant(d06, Daahnida.clone());
            imagegrant(d07, Daahnida.clone());
            imagegrant(d08, Daahnida.clone());
            imagegrant(d09, Daahnida.clone());
            imagegrant(d10, Daahnida.clone());
            imagegrant(d11, Daahnida.clone());
            imagegrant(d12, Daahnida.clone());
            imagegrant(d13, Daahnida.clone());
            imagegrant(d14, Daahnida.clone());
            imagegrant(d15, Daahnida.clone());
            imagegrant(d16, Daahnida.clone());
            imagegrant(d17, Daahnida.clone());
            imagegrant(d18, Daahnida.clone());
            imagegrant(d19, Daahnida.clone());
            imagegrant(d20, Daahnida.clone());
            imagegrant(d21, Daahnida.clone());
            imagegrant(d22, Daahnida.clone());
            imagegrant(d23, Daahnida.clone());
            imagegrant(d24, Daahnida.clone());
            imagegrant(d25, Daahnida.clone());

            imagegrant(e01, Daahnida.clone());
            imagegrant(e02, Daahnida.clone());
            imagegrant(e03, Daahnida.clone());
            imagegrant(e04, Daahnida.clone());
            imagegrant(e05, Daahnida.clone());
            imagegrant(e06, Daahnida.clone());
            imagegrant(e07, Daahnida.clone());
            imagegrant(e08, Daahnida.clone());
            imagegrant(e09, Daahnida.clone());
            imagegrant(e10, Daahnida.clone());
            imagegrant(e11, Daahnida.clone());
            imagegrant(e12, Daahnida.clone());
            imagegrant(e13, Daahnida.clone());
            imagegrant(e14, Daahnida.clone());
            imagegrant(e15, Daahnida.clone());
            imagegrant(e16, Daahnida.clone());
            imagegrant(e17, Daahnida.clone());
            imagegrant(e18, Daahnida.clone());
            imagegrant(e19, Daahnida.clone());
            imagegrant(e20, Daahnida.clone());
            imagegrant(e21, Daahnida.clone());
            imagegrant(e22, Daahnida.clone());
            imagegrant(e23, Daahnida.clone());
            imagegrant(e24, Daahnida.clone());
            imagegrant(e25, Daahnida.clone());

            imagegrant(f01, Daahnida.clone());
            imagegrant(f02, Daahnida.clone());
            imagegrant(f03, Daahnida.clone());
            imagegrant(f04, Daahnida.clone());
            imagegrant(f05, Daahnida.clone());
            imagegrant(f06, Daahnida.clone());
            imagegrant(f07, Daahnida.clone());
            imagegrant(f08, Daahnida.clone());
            imagegrant(f09, Daahnida.clone());
            imagegrant(f10, Daahnida.clone());
            imagegrant(f11, Daahnida.clone());
            imagegrant(f12, Daahnida.clone());
            imagegrant(f13, Daahnida.clone());
            imagegrant(f14, Daahnida.clone());
            imagegrant(f15, Daahnida.clone());
            imagegrant(f16, Daahnida.clone());
            imagegrant(f17, Daahnida.clone());
            imagegrant(f18, Daahnida.clone());
            imagegrant(f19, Daahnida.clone());
            imagegrant(f20, Daahnida.clone());
            imagegrant(f21, Daahnida.clone());
            imagegrant(f22, Daahnida.clone());
            imagegrant(f23, Daahnida.clone());
            imagegrant(f24, Daahnida.clone());
            imagegrant(f25, Daahnida.clone());

            imagegrant(g01, Daahnida.clone());
            imagegrant(g02, Daahnida.clone());
            imagegrant(g03, Daahnida.clone());
            imagegrant(g04, Daahnida.clone());
            imagegrant(g05, Daahnida.clone());
            imagegrant(g06, Daahnida.clone());
            imagegrant(g07, Daahnida.clone());
            imagegrant(g08, Daahnida.clone());
            imagegrant(g09, Daahnida.clone());
            imagegrant(g10, Daahnida.clone());
            imagegrant(g11, Daahnida.clone());
            imagegrant(g12, Daahnida.clone());
            imagegrant(g13, Daahnida.clone());
            imagegrant(g14, Daahnida.clone());
            imagegrant(g15, Daahnida.clone());
            imagegrant(g16, Daahnida.clone());
            imagegrant(g17, Daahnida.clone());
            imagegrant(g18, Daahnida.clone());
            imagegrant(g19, Daahnida.clone());
            imagegrant(g20, Daahnida.clone());
            imagegrant(g21, Daahnida.clone());
            imagegrant(g22, Daahnida.clone());
            imagegrant(g23, Daahnida.clone());
            imagegrant(g24, Daahnida.clone());
            imagegrant(g25, Daahnida.clone());

            imagegrant(h01, Daahnida.clone());
            imagegrant(h02, Daahnida.clone());
            imagegrant(h03, Daahnida.clone());
            imagegrant(h04, Daahnida.clone());
            imagegrant(h05, Daahnida.clone());
            imagegrant(h06, Daahnida.clone());
            imagegrant(h07, Daahnida.clone());
            imagegrant(h08, Daahnida.clone());
            imagegrant(h09, Daahnida.clone());
            imagegrant(h10, Daahnida.clone());
            imagegrant(h11, Daahnida.clone());
            imagegrant(h12, Daahnida.clone());
            imagegrant(h13, Daahnida.clone());
            imagegrant(h14, Daahnida.clone());
            imagegrant(h15, Daahnida.clone());
            imagegrant(h16, Daahnida.clone());
            imagegrant(h17, Daahnida.clone());
            imagegrant(h18, Daahnida.clone());
            imagegrant(h19, Daahnida.clone());
            imagegrant(h20, Daahnida.clone());
            imagegrant(h21, Daahnida.clone());
            imagegrant(h22, Daahnida.clone());
            imagegrant(h23, Daahnida.clone());
            imagegrant(h24, Daahnida.clone());
            imagegrant(h25, Daahnida.clone());

            imagegrant(i01, Daahnida.clone());
            imagegrant(i02, Daahnida.clone());
            imagegrant(i03, Daahnida.clone());
            imagegrant(i04, Daahnida.clone());
            imagegrant(i05, Daahnida.clone());
            imagegrant(i06, Daahnida.clone());
            imagegrant(i07, Daahnida.clone());
            imagegrant(i08, Daahnida.clone());
            imagegrant(i09, Daahnida.clone());
            imagegrant(i10, Daahnida.clone());
            imagegrant(i11, Daahnida.clone());
            imagegrant(i12, Daahnida.clone());
            imagegrant(i13, Daahnida.clone());
            imagegrant(i14, Daahnida.clone());
            imagegrant(i15, Daahnida.clone());
            imagegrant(i16, Daahnida.clone());
            imagegrant(i17, Daahnida.clone());
            imagegrant(i18, Daahnida.clone());
            imagegrant(i19, Daahnida.clone());
            imagegrant(i20, Daahnida.clone());
            imagegrant(i21, Daahnida.clone());
            imagegrant(i22, Daahnida.clone());
            imagegrant(i23, Daahnida.clone());
            imagegrant(i24, Daahnida.clone());
            imagegrant(i25, Daahnida.clone());

            imagegrant(j01, Daahnida.clone());
            imagegrant(j02, Daahnida.clone());
            imagegrant(j03, Daahnida.clone());
            imagegrant(j04, Daahnida.clone());
            imagegrant(j05, Daahnida.clone());
            imagegrant(j06, Daahnida.clone());
            imagegrant(j07, Daahnida.clone());
            imagegrant(j08, Daahnida.clone());
            imagegrant(j09, Daahnida.clone());
            imagegrant(j10, Daahnida.clone());
            imagegrant(j11, Daahnida.clone());
            imagegrant(j12, Daahnida.clone());
            imagegrant(j13, Daahnida.clone());
            imagegrant(j14, Daahnida.clone());
            imagegrant(j15, Daahnida.clone());
            imagegrant(j16, Daahnida.clone());
            imagegrant(j17, Daahnida.clone());
            imagegrant(j18, Daahnida.clone());
            imagegrant(j19, Daahnida.clone());
            imagegrant(j20, Daahnida.clone());
            imagegrant(j21, Daahnida.clone());
            imagegrant(j22, Daahnida.clone());
            imagegrant(j23, Daahnida.clone());
            imagegrant(j24, Daahnida.clone());
            imagegrant(j25, Daahnida.clone());

            imagegrant(k01, Daahnida.clone());
            imagegrant(k02, Daahnida.clone());
            imagegrant(k03, Daahnida.clone());
            imagegrant(k04, Daahnida.clone());
            imagegrant(k05, Daahnida.clone());
            imagegrant(k06, Daahnida.clone());
            imagegrant(k07, Daahnida.clone());
            imagegrant(k08, Daahnida.clone());
            imagegrant(k09, Daahnida.clone());
            imagegrant(k10, Daahnida.clone());
            imagegrant(k11, Daahnida.clone());
            imagegrant(k12, Daahnida.clone());
            imagegrant(k13, Daahnida.clone());
            imagegrant(k14, Daahnida.clone());
            imagegrant(k15, Daahnida.clone());
            imagegrant(k16, Daahnida.clone());
            imagegrant(k17, Daahnida.clone());
            imagegrant(k18, Daahnida.clone());
            imagegrant(k19, Daahnida.clone());
            imagegrant(k20, Daahnida.clone());
            imagegrant(k21, Daahnida.clone());
            imagegrant(k22, Daahnida.clone());
            imagegrant(k23, Daahnida.clone());
            imagegrant(k24, Daahnida.clone());
            imagegrant(k25, Daahnida.clone());

            imagegrant(l01, Daahnida.clone());
            imagegrant(l02, Daahnida.clone());
            imagegrant(l03, Daahnida.clone());
            imagegrant(l04, Daahnida.clone());
            imagegrant(l05, Daahnida.clone());
            imagegrant(l06, Daahnida.clone());
            imagegrant(l07, Daahnida.clone());
            imagegrant(l08, Daahnida.clone());
            imagegrant(l09, Daahnida.clone());
            imagegrant(l10, Daahnida.clone());
            imagegrant(l11, Daahnida.clone());
            imagegrant(l12, Daahnida.clone());
            imagegrant(l13, Daahnida.clone());
            imagegrant(l14, Daahnida.clone());
            imagegrant(l15, Daahnida.clone());
            imagegrant(l16, Daahnida.clone());
            imagegrant(l17, Daahnida.clone());
            imagegrant(l18, Daahnida.clone());
            imagegrant(l19, Daahnida.clone());
            imagegrant(l20, Daahnida.clone());
            imagegrant(l21, Daahnida.clone());
            imagegrant(l22, Daahnida.clone());
            imagegrant(l23, Daahnida.clone());
            imagegrant(l24, Daahnida.clone());
            imagegrant(l25, Daahnida.clone());

            imagegrant(m01, Daahnida.clone());
            imagegrant(m02, Daahnida.clone());
            imagegrant(m03, Daahnida.clone());
            imagegrant(m04, Daahnida.clone());
            imagegrant(m05, Daahnida.clone());
            imagegrant(m06, Daahnida.clone());
            imagegrant(m07, Daahnida.clone());
            imagegrant(m08, Daahnida.clone());
            imagegrant(m09, Daahnida.clone());
            imagegrant(m10, Daahnida.clone());
            imagegrant(m11, Daahnida.clone());
            imagegrant(m12, Daahnida.clone());
            imagegrant(m13, Daahnida.clone());
            imagegrant(m14, Daahnida.clone());
            imagegrant(m15, Daahnida.clone());
            imagegrant(m16, Daahnida.clone());
            imagegrant(m17, Daahnida.clone());
            imagegrant(m18, Daahnida.clone());
            imagegrant(m19, Daahnida.clone());
            imagegrant(m20, Daahnida.clone());
            imagegrant(m21, Daahnida.clone());
            imagegrant(m22, Daahnida.clone());
            imagegrant(m23, Daahnida.clone());
            imagegrant(m24, Daahnida.clone());
            imagegrant(m25, Daahnida.clone());

            imagegrant(n01, Daahnida.clone());
            imagegrant(n02, Daahnida.clone());
            imagegrant(n03, Daahnida.clone());
            imagegrant(n04, Daahnida.clone());
            imagegrant(n05, Daahnida.clone());
            imagegrant(n06, Daahnida.clone());
            imagegrant(n07, Daahnida.clone());
            imagegrant(n08, Daahnida.clone());
            imagegrant(n09, Daahnida.clone());
            imagegrant(n10, Daahnida.clone());
            imagegrant(n11, Daahnida.clone());
            imagegrant(n12, Daahnida.clone());
            imagegrant(n13, Daahnida.clone());
            imagegrant(n14, Daahnida.clone());
            imagegrant(n15, Daahnida.clone());
            imagegrant(n16, Daahnida.clone());
            imagegrant(n17, Daahnida.clone());
            imagegrant(n18, Daahnida.clone());
            imagegrant(n19, Daahnida.clone());
            imagegrant(n20, Daahnida.clone());
            imagegrant(n21, Daahnida.clone());
            imagegrant(n22, Daahnida.clone());
            imagegrant(n23, Daahnida.clone());
            imagegrant(n24, Daahnida.clone());
            imagegrant(n25, Daahnida.clone());

            imagegrant(o01, Daahnida.clone());
            imagegrant(o02, Daahnida.clone());
            imagegrant(o03, Daahnida.clone());
            imagegrant(o04, Daahnida.clone());
            imagegrant(o05, Daahnida.clone());
            imagegrant(o06, Daahnida.clone());
            imagegrant(o07, Daahnida.clone());
            imagegrant(o08, Daahnida.clone());
            imagegrant(o09, Daahnida.clone());
            imagegrant(o10, Daahnida.clone());
            imagegrant(o11, Daahnida.clone());
            imagegrant(o12, Daahnida.clone());
            imagegrant(o13, Daahnida.clone());
            imagegrant(o14, Daahnida.clone());
            imagegrant(o15, Daahnida.clone());
            imagegrant(o16, Daahnida.clone());
            imagegrant(o17, Daahnida.clone());
            imagegrant(o18, Daahnida.clone());
            imagegrant(o19, Daahnida.clone());
            imagegrant(o20, Daahnida.clone());
            imagegrant(o21, Daahnida.clone());
            imagegrant(o22, Daahnida.clone());
            imagegrant(o23, Daahnida.clone());
            imagegrant(o24, Daahnida.clone());
            imagegrant(o25, Daahnida.clone());

            imagegrant(p01, Daahnida.clone());
            imagegrant(p02, Daahnida.clone());
            imagegrant(p03, Daahnida.clone());
            imagegrant(p04, Daahnida.clone());
            imagegrant(p05, Daahnida.clone());
            imagegrant(p06, Daahnida.clone());
            imagegrant(p07, Daahnida.clone());
            imagegrant(p08, Daahnida.clone());
            imagegrant(p09, Daahnida.clone());
            imagegrant(p10, Daahnida.clone());
            imagegrant(p11, Daahnida.clone());
            imagegrant(p12, Daahnida.clone());
            imagegrant(p13, Daahnida.clone());
            imagegrant(p14, Daahnida.clone());
            imagegrant(p15, Daahnida.clone());
            imagegrant(p16, Daahnida.clone());
            imagegrant(p17, Daahnida.clone());
            imagegrant(p18, Daahnida.clone());
            imagegrant(p19, Daahnida.clone());
            imagegrant(p20, Daahnida.clone());
            imagegrant(p21, Daahnida.clone());
            imagegrant(p22, Daahnida.clone());
            imagegrant(p23, Daahnida.clone());
            imagegrant(p24, Daahnida.clone());
            imagegrant(p25, Daahnida.clone());

            imagegrant(q01, Daahnida.clone());
            imagegrant(q02, Daahnida.clone());
            imagegrant(q03, Daahnida.clone());
            imagegrant(q04, Daahnida.clone());
            imagegrant(q05, Daahnida.clone());
            imagegrant(q06, Daahnida.clone());
            imagegrant(q07, Daahnida.clone());
            imagegrant(q08, Daahnida.clone());
            imagegrant(q09, Daahnida.clone());
            imagegrant(q10, Daahnida.clone());
            imagegrant(q11, Daahnida.clone());
            imagegrant(q12, Daahnida.clone());
            imagegrant(q13, Daahnida.clone());
            imagegrant(q14, Daahnida.clone());
            imagegrant(q15, Daahnida.clone());
            imagegrant(q16, Daahnida.clone());
            imagegrant(q17, Daahnida.clone());
            imagegrant(q18, Daahnida.clone());
            imagegrant(q19, Daahnida.clone());
            imagegrant(q20, Daahnida.clone());
            imagegrant(q21, Daahnida.clone());
            imagegrant(q22, Daahnida.clone());
            imagegrant(q23, Daahnida.clone());
            imagegrant(q24, Daahnida.clone());
            imagegrant(q25, Daahnida.clone());

            imagegrant(r01, Daahnida.clone());
            imagegrant(r02, Daahnida.clone());
            imagegrant(r03, Daahnida.clone());
            imagegrant(r04, Daahnida.clone());
            imagegrant(r05, Daahnida.clone());
            imagegrant(r06, Daahnida.clone());
            imagegrant(r07, Daahnida.clone());
            imagegrant(r08, Daahnida.clone());
            imagegrant(r09, Daahnida.clone());
            imagegrant(r10, Daahnida.clone());
            imagegrant(r11, Daahnida.clone());
            imagegrant(r12, Daahnida.clone());
            imagegrant(r13, Daahnida.clone());
            imagegrant(r14, Daahnida.clone());
            imagegrant(r15, Daahnida.clone());
            imagegrant(r16, Daahnida.clone());
            imagegrant(r17, Daahnida.clone());
            imagegrant(r18, Daahnida.clone());
            imagegrant(r19, Daahnida.clone());
            imagegrant(r20, Daahnida.clone());
            imagegrant(r21, Daahnida.clone());
            imagegrant(r22, Daahnida.clone());
            imagegrant(r23, Daahnida.clone());
            imagegrant(r24, Daahnida.clone());
            imagegrant(r25, Daahnida.clone());

            imagegrant(s01, Daahnida.clone());
            imagegrant(s02, Daahnida.clone());
            imagegrant(s03, Daahnida.clone());
            imagegrant(s04, Daahnida.clone());
            imagegrant(s05, Daahnida.clone());
            imagegrant(s06, Daahnida.clone());
            imagegrant(s07, Daahnida.clone());
            imagegrant(s08, Daahnida.clone());
            imagegrant(s09, Daahnida.clone());
            imagegrant(s10, Daahnida.clone());
            imagegrant(s11, Daahnida.clone());
            imagegrant(s12, Daahnida.clone());
            imagegrant(s13, Daahnida.clone());
            imagegrant(s14, Daahnida.clone());
            imagegrant(s15, Daahnida.clone());
            imagegrant(s16, Daahnida.clone());
            imagegrant(s17, Daahnida.clone());
            imagegrant(s18, Daahnida.clone());
            imagegrant(s19, Daahnida.clone());
            imagegrant(s20, Daahnida.clone());
            imagegrant(s21, Daahnida.clone());
            imagegrant(s22, Daahnida.clone());
            imagegrant(s23, Daahnida.clone());
            imagegrant(s24, Daahnida.clone());
            imagegrant(s25, Daahnida.clone());

            imagegrant(t01, Daahnida.clone());
            imagegrant(t02, Daahnida.clone());
            imagegrant(t03, Daahnida.clone());
            imagegrant(t04, Daahnida.clone());
            imagegrant(t05, Daahnida.clone());
            imagegrant(t06, Daahnida.clone());
            imagegrant(t07, Daahnida.clone());
            imagegrant(t08, Daahnida.clone());
            imagegrant(t09, Daahnida.clone());
            imagegrant(t10, Daahnida.clone());
            imagegrant(t11, Daahnida.clone());
            imagegrant(t12, Daahnida.clone());
            imagegrant(t13, Daahnida.clone());
            imagegrant(t14, Daahnida.clone());
            imagegrant(t15, Daahnida.clone());
            imagegrant(t16, Daahnida.clone());
            imagegrant(t17, Daahnida.clone());
            imagegrant(t18, Daahnida.clone());
            imagegrant(t19, Daahnida.clone());
            imagegrant(t20, Daahnida.clone());
            imagegrant(t21, Daahnida.clone());
            imagegrant(t22, Daahnida.clone());
            imagegrant(t23, Daahnida.clone());
            imagegrant(t24, Daahnida.clone());
            imagegrant(t25, Daahnida.clone());

            imagegrant(u01, Daahnida.clone());
            imagegrant(u02, Daahnida.clone());
            imagegrant(u03, Daahnida.clone());
            imagegrant(u04, Daahnida.clone());
            imagegrant(u05, Daahnida.clone());
            imagegrant(u06, Daahnida.clone());
            imagegrant(u07, Daahnida.clone());
            imagegrant(u08, Daahnida.clone());
            imagegrant(u09, Daahnida.clone());
            imagegrant(u10, Daahnida.clone());
            imagegrant(u11, Daahnida.clone());
            imagegrant(u12, Daahnida.clone());
            imagegrant(u13, Daahnida.clone());
            imagegrant(u14, Daahnida.clone());
            imagegrant(u15, Daahnida.clone());
            imagegrant(u16, Daahnida.clone());
            imagegrant(u17, Daahnida.clone());
            imagegrant(u18, Daahnida.clone());
            imagegrant(u19, Daahnida.clone());
            imagegrant(u20, Daahnida.clone());
            imagegrant(u21, Daahnida.clone());
            imagegrant(u22, Daahnida.clone());
            imagegrant(u23, Daahnida.clone());
            imagegrant(u24, Daahnida.clone());
            imagegrant(u25, Daahnida.clone());

            imagegrant(v01, Daahnida.clone());
            imagegrant(v02, Daahnida.clone());
            imagegrant(v03, Daahnida.clone());
            imagegrant(v04, Daahnida.clone());
            imagegrant(v05, Daahnida.clone());
            imagegrant(v06, Daahnida.clone());
            imagegrant(v07, Daahnida.clone());
            imagegrant(v08, Daahnida.clone());
            imagegrant(v09, Daahnida.clone());
            imagegrant(v10, Daahnida.clone());
            imagegrant(v11, Daahnida.clone());
            imagegrant(v12, Daahnida.clone());
            imagegrant(v13, Daahnida.clone());
            imagegrant(v14, Daahnida.clone());
            imagegrant(v15, Daahnida.clone());
            imagegrant(v16, Daahnida.clone());
            imagegrant(v17, Daahnida.clone());
            imagegrant(v18, Daahnida.clone());
            imagegrant(v19, Daahnida.clone());
            imagegrant(v20, Daahnida.clone());
            imagegrant(v21, Daahnida.clone());
            imagegrant(v22, Daahnida.clone());
            imagegrant(v23, Daahnida.clone());
            imagegrant(v24, Daahnida.clone());
            imagegrant(v25, Daahnida.clone());

            imagegrant(w01, Daahnida.clone());
            imagegrant(w02, Daahnida.clone());
            imagegrant(w03, Daahnida.clone());
            imagegrant(w04, Daahnida.clone());
            imagegrant(w05, Daahnida.clone());
            imagegrant(w06, Daahnida.clone());
            imagegrant(w07, Daahnida.clone());
            imagegrant(w08, Daahnida.clone());
            imagegrant(w09, Daahnida.clone());
            imagegrant(w10, Daahnida.clone());
            imagegrant(w11, Daahnida.clone());
            imagegrant(w12, Daahnida.clone());
            imagegrant(w13, Daahnida.clone());
            imagegrant(w14, Daahnida.clone());
            imagegrant(w15, Daahnida.clone());
            imagegrant(w16, Daahnida.clone());
            imagegrant(w17, Daahnida.clone());
            imagegrant(w18, Daahnida.clone());
            imagegrant(w19, Daahnida.clone());
            imagegrant(w20, Daahnida.clone());
            imagegrant(w21, Daahnida.clone());
            imagegrant(w22, Daahnida.clone());
            imagegrant(w23, Daahnida.clone());
            imagegrant(w24, Daahnida.clone());
            imagegrant(w25, Daahnida.clone());

            imagegrant(x01, Daahnida.clone());
            imagegrant(x02, Daahnida.clone());
            imagegrant(x03, Daahnida.clone());
            imagegrant(x04, Daahnida.clone());
            imagegrant(x05, Daahnida.clone());
            imagegrant(x06, Daahnida.clone());
            imagegrant(x07, Daahnida.clone());
            imagegrant(x08, Daahnida.clone());
            imagegrant(x09, Daahnida.clone());
            imagegrant(x10, Daahnida.clone());
            imagegrant(x11, Daahnida.clone());
            imagegrant(x12, Daahnida.clone());
            imagegrant(x13, Daahnida.clone());
            imagegrant(x14, Daahnida.clone());
            imagegrant(x15, Daahnida.clone());
            imagegrant(x16, Daahnida.clone());
            imagegrant(x17, Daahnida.clone());
            imagegrant(x18, Daahnida.clone());
            imagegrant(x19, Daahnida.clone());
            imagegrant(x20, Daahnida.clone());
            imagegrant(x21, Daahnida.clone());
            imagegrant(x22, Daahnida.clone());
            imagegrant(x23, Daahnida.clone());
            imagegrant(x24, Daahnida.clone());
            imagegrant(x25, Daahnida.clone());

            imagegrant(y01, Daahnida.clone());
            imagegrant(y02, Daahnida.clone());
            imagegrant(y03, Daahnida.clone());
            imagegrant(y04, Daahnida.clone());
            imagegrant(y05, Daahnida.clone());
            imagegrant(y06, Daahnida.clone());
            imagegrant(y07, Daahnida.clone());
            imagegrant(y08, Daahnida.clone());
            imagegrant(y09, Daahnida.clone());
            imagegrant(y10, Daahnida.clone());
            imagegrant(y11, Daahnida.clone());
            imagegrant(y12, Daahnida.clone());
            imagegrant(y13, Daahnida.clone());
            imagegrant(y14, Daahnida.clone());
            imagegrant(y15, Daahnida.clone());
            imagegrant(y16, Daahnida.clone());
            imagegrant(y17, Daahnida.clone());
            imagegrant(y18, Daahnida.clone());
            imagegrant(y19, Daahnida.clone());
            imagegrant(y20, Daahnida.clone());
            imagegrant(y21, Daahnida.clone());
            imagegrant(y22, Daahnida.clone());
            imagegrant(y23, Daahnida.clone());
            imagegrant(y24, Daahnida.clone());
            imagegrant(y25, Daahnida.clone());

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
        Filler(a21);
        Filler(a22);
        Filler(a23);
        Filler(a24);
        Filler(a25);

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
        Filler(b21);
        Filler(b22);
        Filler(b23);
        Filler(b24);
        Filler(b25);

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
        Filler(c21);
        Filler(c22);
        Filler(c23);
        Filler(c24);
        Filler(c25);

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
        Filler(d21);
        Filler(d22);
        Filler(d23);
        Filler(d24);
        Filler(d25);

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
        Filler(e21);
        Filler(e22);
        Filler(e23);
        Filler(e24);
        Filler(e25);

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
        Filler(f21);
        Filler(f22);
        Filler(f23);
        Filler(f24);
        Filler(f25);

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
        Filler(g21);
        Filler(g22);
        Filler(g23);
        Filler(g24);
        Filler(g25);

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
        Filler(h21);
        Filler(h22);
        Filler(h23);
        Filler(h24);
        Filler(h25);

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
        Filler(i21);
        Filler(i22);
        Filler(i23);
        Filler(i24);
        Filler(i25);

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
        Filler(j21);
        Filler(j22);
        Filler(j23);
        Filler(j24);
        Filler(j25);

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
        Filler(k21);
        Filler(k22);
        Filler(k23);
        Filler(k24);
        Filler(k25);

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
        Filler(l21);
        Filler(l22);
        Filler(l23);
        Filler(l24);
        Filler(l25);

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
        Filler(m21);
        Filler(m22);
        Filler(m23);
        Filler(m24);
        Filler(m25);

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
        Filler(n21);
        Filler(n22);
        Filler(n23);
        Filler(n24);
        Filler(n25);

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
        Filler(o21);
        Filler(o22);
        Filler(o23);
        Filler(o24);
        Filler(o25);

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
        Filler(p21);
        Filler(p22);
        Filler(p23);
        Filler(p24);
        Filler(p25);

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
        Filler(q21);
        Filler(q22);
        Filler(q23);
        Filler(q24);
        Filler(q25);

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
        Filler(r21);
        Filler(r22);
        Filler(r23);
        Filler(r24);
        Filler(r25);

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
        Filler(s21);
        Filler(s22);
        Filler(s23);
        Filler(s24);
        Filler(s25);

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
        Filler(t21);
        Filler(t22);
        Filler(t23);
        Filler(t24);
        Filler(t25);

        Filler(u01);
        Filler(u02);
        Filler(u03);
        Filler(u04);
        Filler(u05);
        Filler(u06);
        Filler(u07);
        Filler(u08);
        Filler(u09);
        Filler(u10);
        Filler(u11);
        Filler(u12);
        Filler(u13);
        Filler(u14);
        Filler(u15);
        Filler(u16);
        Filler(u17);
        Filler(u18);
        Filler(u19);
        Filler(u20);
        Filler(u21);
        Filler(u22);
        Filler(u23);
        Filler(u24);
        Filler(u25);

        Filler(v01);
        Filler(v02);
        Filler(v03);
        Filler(v04);
        Filler(v05);
        Filler(v06);
        Filler(v07);
        Filler(v08);
        Filler(v09);
        Filler(v10);
        Filler(v11);
        Filler(v12);
        Filler(v13);
        Filler(v14);
        Filler(v15);
        Filler(v16);
        Filler(v17);
        Filler(v18);
        Filler(v19);
        Filler(v20);
        Filler(v21);
        Filler(v22);
        Filler(v23);
        Filler(v24);
        Filler(v25);

        Filler(w01);
        Filler(w02);
        Filler(w03);
        Filler(w04);
        Filler(w05);
        Filler(w06);
        Filler(w07);
        Filler(w08);
        Filler(w09);
        Filler(w10);
        Filler(w11);
        Filler(w12);
        Filler(w13);
        Filler(w14);
        Filler(w15);
        Filler(w16);
        Filler(w17);
        Filler(w18);
        Filler(w19);
        Filler(w20);
        Filler(w21);
        Filler(w22);
        Filler(w23);
        Filler(w24);
        Filler(w25);

        Filler(x01);
        Filler(x02);
        Filler(x03);
        Filler(x04);
        Filler(x05);
        Filler(x06);
        Filler(x07);
        Filler(x08);
        Filler(x09);
        Filler(x10);
        Filler(x11);
        Filler(x12);
        Filler(x13);
        Filler(x14);
        Filler(x15);
        Filler(x16);
        Filler(x17);
        Filler(x18);
        Filler(x19);
        Filler(x20);
        Filler(x21);
        Filler(x22);
        Filler(x23);
        Filler(x24);
        Filler(x25);

        Filler(y01);
        Filler(y02);
        Filler(y03);
        Filler(y04);
        Filler(y05);
        Filler(y06);
        Filler(y07);
        Filler(y08);
        Filler(y09);
        Filler(y10);
        Filler(y11);
        Filler(y12);
        Filler(y13);
        Filler(y14);
        Filler(y15);
        Filler(y16);
        Filler(y17);
        Filler(y18);
        Filler(y19);
        Filler(y20);
        Filler(y21);
        Filler(y22);
        Filler(y23);
        Filler(y24);
        Filler(y25);





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
         Clearimage(a21);
         Clearimage(a22);
         Clearimage(a23);
         Clearimage(a24);
         Clearimage(a25);

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
         Clearimage(b21);
         Clearimage(b22);
         Clearimage(b23);
         Clearimage(b24);
         Clearimage(b25);

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
         Clearimage(c21);
         Clearimage(c22);
         Clearimage(c23);
         Clearimage(c24);
         Clearimage(c25);

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
         Clearimage(d21);
         Clearimage(d22);
         Clearimage(d23);
         Clearimage(d24);
         Clearimage(d25);

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
         Clearimage(e21);
         Clearimage(e22);
         Clearimage(e23);
         Clearimage(e24);
         Clearimage(e25);

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
         Clearimage(f21);
         Clearimage(f22);
         Clearimage(f23);
         Clearimage(f24);
         Clearimage(f25);

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
         Clearimage(g21);
         Clearimage(g22);
         Clearimage(g23);
         Clearimage(g24);
         Clearimage(g25);

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
         Clearimage(h21);
         Clearimage(h22);
         Clearimage(h23);
         Clearimage(h24);
         Clearimage(h25);

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
         Clearimage(i21);
         Clearimage(i22);
         Clearimage(i23);
         Clearimage(i24);
         Clearimage(i25);

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
         Clearimage(j21);
         Clearimage(j22);
         Clearimage(j23);
         Clearimage(j24);
         Clearimage(j25);

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
         Clearimage(k21);
         Clearimage(k22);
         Clearimage(k23);
         Clearimage(k24);
         Clearimage(k25);

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
         Clearimage(l21);
         Clearimage(l22);
         Clearimage(l23);
         Clearimage(l24);
         Clearimage(l25);

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
         Clearimage(m21);
         Clearimage(m22);
         Clearimage(m23);
         Clearimage(m24);
         Clearimage(m25);

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
         Clearimage(n21);
         Clearimage(n22);
         Clearimage(n23);
         Clearimage(n24);
         Clearimage(n25);

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
         Clearimage(o21);
         Clearimage(o22);
         Clearimage(o23);
         Clearimage(o24);
         Clearimage(o25);

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
         Clearimage(p21);
         Clearimage(p22);
         Clearimage(p23);
         Clearimage(p24);
         Clearimage(p25);

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
         Clearimage(q21);
         Clearimage(q22);
         Clearimage(q23);
         Clearimage(q24);
         Clearimage(q25);

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
         Clearimage(r21);
         Clearimage(r22);
         Clearimage(r23);
         Clearimage(r24);
         Clearimage(r25);

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
         Clearimage(s21);
         Clearimage(s22);
         Clearimage(s23);
         Clearimage(s24);
         Clearimage(s25);

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
         Clearimage(t21);
         Clearimage(t22);
         Clearimage(t23);
         Clearimage(t24);
         Clearimage(t25);

         Clearimage(u01);
         Clearimage(u02);
         Clearimage(u03);
         Clearimage(u04);
         Clearimage(u05);
         Clearimage(u06);
         Clearimage(u07);
         Clearimage(u08);
         Clearimage(u09);
         Clearimage(u10);
         Clearimage(u11);
         Clearimage(u12);
         Clearimage(u13);
         Clearimage(u14);
         Clearimage(u15);
         Clearimage(u16);
         Clearimage(u17);
         Clearimage(u18);
         Clearimage(u19);
         Clearimage(u20);
         Clearimage(u21);
         Clearimage(u22);
         Clearimage(u23);
         Clearimage(u24);
         Clearimage(u25);

         Clearimage(v01);
         Clearimage(v02);
         Clearimage(v03);
         Clearimage(v04);
         Clearimage(v05);
         Clearimage(v06);
         Clearimage(v07);
         Clearimage(v08);
         Clearimage(v09);
         Clearimage(v10);
         Clearimage(v11);
         Clearimage(v12);
         Clearimage(v13);
         Clearimage(v14);
         Clearimage(v15);
         Clearimage(v16);
         Clearimage(v17);
         Clearimage(v18);
         Clearimage(v19);
         Clearimage(v20);
         Clearimage(v21);
         Clearimage(v22);
         Clearimage(v23);
         Clearimage(v24);
         Clearimage(v25);

         Clearimage(w01);
         Clearimage(w02);
         Clearimage(w03);
         Clearimage(w04);
         Clearimage(w05);
         Clearimage(w06);
         Clearimage(w07);
         Clearimage(w08);
         Clearimage(w09);
         Clearimage(w10);
         Clearimage(w11);
         Clearimage(w12);
         Clearimage(w13);
         Clearimage(w14);
         Clearimage(w15);
         Clearimage(w16);
         Clearimage(w17);
         Clearimage(w18);
         Clearimage(w19);
         Clearimage(w20);
         Clearimage(w21);
         Clearimage(w22);
         Clearimage(w23);
         Clearimage(w24);
         Clearimage(w25);

         Clearimage(x01);
         Clearimage(x02);
         Clearimage(x03);
         Clearimage(x04);
         Clearimage(x05);
         Clearimage(x06);
         Clearimage(x07);
         Clearimage(x08);
         Clearimage(x09);
         Clearimage(x10);
         Clearimage(x11);
         Clearimage(x12);
         Clearimage(x13);
         Clearimage(x14);
         Clearimage(x15);
         Clearimage(x16);
         Clearimage(x17);
         Clearimage(x18);
         Clearimage(x19);
         Clearimage(x20);
         Clearimage(x21);
         Clearimage(x22);
         Clearimage(x23);
         Clearimage(x24);
         Clearimage(x25);

         Clearimage(y01);
         Clearimage(y02);
         Clearimage(y03);
         Clearimage(y04);
         Clearimage(y05);
         Clearimage(y06);
         Clearimage(y07);
         Clearimage(y08);
         Clearimage(y09);
         Clearimage(y10);
         Clearimage(y11);
         Clearimage(y12);
         Clearimage(y13);
         Clearimage(y14);
         Clearimage(y15);
         Clearimage(y16);
         Clearimage(y17);
         Clearimage(y18);
         Clearimage(y19);
         Clearimage(y20);
         Clearimage(y21);
         Clearimage(y22);
         Clearimage(y23);
         Clearimage(y24);
         Clearimage(y25);
    }

    public  void Clearimage(ImageView A) throws CloneNotSupportedException {
        if (arrayfillercount < AgentPositions.length){
            AgentPositions[arrayfillercount].Gridspot = A;
            if(new Random().nextInt(70 ) >= 71) {
                AgentPositions[arrayfillercount].Agent = monstlist(new Random().nextInt(90)+1).clone();
            }else {
                AgentPositions[arrayfillercount].Agent = monstlist(201).clone();
            }
            arrayfillercount++;
        }
    /*  if(arrayfillercount == AgentPositions.length){
            Daahnida.Moveslotheal = 2;
            Daahnida.Moveslotattack = 6;
            Daahnida.Moveslotspeed = 6;
            AgentPositions[50].Agent = Daahnida.clone();
            AgentPositions[71].Agent = Daahnida.clone();
            AgentPositions[101].Agent = Daahnida.clone();
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
            AgentPositions[101].Agent = Daahnida.clone();
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


        if(flipper == 1) {



                if (arrayfillercountx < AgentPositions.length) {
                    AgentPositions[arrayfillercountx].Gridspot = A;
                        AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                    arrayfillercountx++;
                }

        }else if (flipper == 2){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 2) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 2) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                }
                arrayfillercountx++;
            }
        }else if (flipper == 3){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 3) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 3) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                } else if ((arrayfillercountx % 3) == 2) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(ThirdMonster).clone();
                }
                arrayfillercountx++;
            }
        }else if (flipper == 4){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 4) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 4) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                } else if ((arrayfillercountx % 4) == 2) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(ThirdMonster).clone();
                } else if ((arrayfillercountx % 4) == 3) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FourthMonster).clone();
                }
                arrayfillercountx++;
            }
        }else if (flipper == 5){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 5) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 5) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                } else if ((arrayfillercountx % 5) == 2) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(ThirdMonster).clone();
                } else if ((arrayfillercountx % 5) == 3) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FourthMonster).clone();
                } else {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FifthMonster).clone();
                }
                arrayfillercountx++;
            }
        }else if (flipper == 6){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 6) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 6) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                } else if ((arrayfillercountx % 6) == 2) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(ThirdMonster).clone();
                } else if ((arrayfillercountx % 6) == 3) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FourthMonster).clone();
                } else if ((arrayfillercountx % 6) == 4) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FifthMonster).clone();
                } else {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SixthMonster).clone();
                }
                arrayfillercountx++;
            }
        }else if (flipper == 0){
            if (arrayfillercountx < AgentPositions.length) {
                AgentPositions[arrayfillercountx].Gridspot = A;
                if ((arrayfillercountx % 7) == 0) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FirstMonster).clone();
                } else if ((arrayfillercountx % 7) == 1) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SecondMonster).clone();
                } else if ((arrayfillercountx % 7) == 2) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(ThirdMonster).clone();
                } else if ((arrayfillercountx % 7) == 3) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FourthMonster).clone();
                } else if ((arrayfillercountx % 7) == 4) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(FifthMonster).clone();
                } else if ((arrayfillercountx % 7) == 5) {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SixthMonster).clone();
                } else {
                    AgentPositions[arrayfillercountx].Agent = monstlist(SeventhMonster).clone();
                }
                arrayfillercountx++;
            }
        }
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

      //  Dummy.UniqueID = UniqueIdentifier(0);
        if(catcher == 0) {
            //(int) (new Random().nextInt(86))
            switchroller = switchroller++;
            switchroller = (switchroller % 90) + 1;
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

                if (Dummy.UniqueID< 70000000) {
                    PlayerDisplay.setImageResource(R.drawable.genaupresangb);
                }else{
                    PlayerDisplay.setImageResource(R.drawable.genaupresangc);
                }

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
               PlayerDisplay.setImageResource(R.drawable.vellup);
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
                PlayerDisplay.setImageResource(R.drawable.octgotot);
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
                if (Dummy.UniqueID < 22000000) {
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
                PlayerDisplay.setImageResource(R.drawable.tacroach);
                break;
            case 88:
                PlayerDisplay.setImageResource(R.drawable.manterfly);
                break;
            case 89:
                if (Dummy.UniqueID < 9000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearya);
                }else if(Dummy.UniqueID < 18000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyb);
                }else if(Dummy.UniqueID < 27000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyc);
                }else if(Dummy.UniqueID < 36000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyd);
                }else if(Dummy.UniqueID < 45000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearye);
                }else if(Dummy.UniqueID < 54000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyf);
                }else if(Dummy.UniqueID < 63000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyg);
                }else if(Dummy.UniqueID < 72000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyh);
                }else if(Dummy.UniqueID < 81000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyi);
                }else if(Dummy.UniqueID < 90000000) {
                    PlayerDisplay.setImageResource(R.drawable.bearyj);
                }else {
                    PlayerDisplay.setImageResource(R.drawable.bearyk);
                }break;

            case 90:
                PlayerDisplay.setImageResource(R.drawable.sluggernaut);
                break;
            case 91:
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



            case 92:

                int memeekcolorsetter = Dummy.UniqueID % 7; //>>>
                int memeekcolorcontroller = Dummy.UniqueID % 255;

                switch (memeekcolorsetter) {
                    case 0:
                        PlayerDisplay.setColorFilter(Color.argb(110, 255, 255, memeekcolorcontroller));
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
                if(Dummy.UniqueID < 15000000) {
                    PlayerDisplay.setImageResource(R.drawable.runnybabbita);
                }else if (Dummy.UniqueID < 20000000) {
                    PlayerDisplay.setImageResource(R.drawable.runnybabbitb);
                }else if (Dummy.UniqueID < 30000000) {
                    PlayerDisplay.setImageResource(R.drawable.runnybabbitc);
                }else if (Dummy.UniqueID < 40000000) {
                    PlayerDisplay.setImageResource(R.drawable.runnybabbitd);
                }else if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.runnybabbite);
                }else {

                    PlayerDisplay.setImageResource(R.drawable.runnybabbitx);
                }
                break;
            case 97:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.zubgondrakter);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.zubgondrakterhat);
                }
                break;
            case 98:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.whumpuhmp);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.whumpuhmp);
                }
                break;
            case 99:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.mangoon);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.mangoon);
                }
                break;
            case 100:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.scarbeque);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.fwuffynumpkins);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;
            case 102:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.dothog);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.reefcake);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.cheetza);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.sortsand);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.chilldabeest);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.chilldabeest);
                }
                break;
            case 107:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.communigator);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.mossboss);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.vamprey);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.parafox);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.rhischlosserous);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.hykeyna);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.tafantula);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.farmot);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.beeurchin);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.flyinsoup);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.meloncolli);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.scorphibian);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.scorphibian);
                }
                break;
            case 119:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.geliphant);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.geliphantx);
                }
                break;
            case 120:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.chimpansy);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.chimpansy);
                }
                break;
            case 121:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.giveup);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.giveupx);
                }
                break;
            case 122:

                if (Dummy.UniqueID < 50000000) {
                    PlayerDisplay.setImageResource(R.drawable.avokaboom);
                } else {
                    PlayerDisplay.setImageResource(R.drawable.avokaboomx);
                }
                break;
            case 201:
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

    public int AttackMoves(int startingmove){

        startingmove = startingmove + new Random().nextInt(9); // by setyting this to 1 it should make the moves just be attack, also reversing the damage withoiut actually removing the cause
// boosts
        return startingmove;
    }

    public int UniqueIdentifier(int needless){
        needless = new Random().nextInt(100000000);
        return new Random().nextInt(100000000);
}

    public void AgentDancer() throws CloneNotSupportedException {
        
        for (int i = 0; i < AgentPositions.length; i++ ) {



            int move = new Random().nextInt(9);

            if (AgentPositions[i].Agent.Idnum != 201) {



                if((int)AgentPositions[i].Agent.Idnum == Edgemonster){
                    EdgemonsterC++;
                }
                if((int)AgentPositions[i].Agent.Idnum == Centermonster){
                    CentermonsterC++;
                }
                if((int)AgentPositions[i].Agent.Idnum == MedianMonster){
                    MedianMonsterC++;
                }


                if((int)AgentPositions[i].Agent.Idnum == FirstMonster){
                    FirstMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == SecondMonster) {
                    SecondMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == ThirdMonster){
                    ThirdMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == FourthMonster){
                    FourthMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == FifthMonster){
                    FifthMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == SixthMonster){
                    SixthMonsterc++;
                }
                if((int)AgentPositions[i].Agent.Idnum == SeventhMonster){
                    SeventhMonsterc++;
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
                        AgentPositions[Math.abs(i - 1) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 2://up left
                        AgentPositions[Math.abs(i - 26) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 3: // top
                        AgentPositions[Math.abs(i - 25) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 4://up right
                        AgentPositions[Math.abs(i - 24) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 5: // right
                        AgentPositions[Math.abs(i + 1) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 6: // right down
                        AgentPositions[Math.abs(i + 26) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 7:// down
                        AgentPositions[Math.abs(i + 25) % 625].Agent = AgentPositions[i].Agent;
                        break;
                    case 8://left doen
                        AgentPositions[Math.abs(i + 24) % 625].Agent = AgentPositions[i].Agent;
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
                        for (int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 1) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 1) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 1) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 1) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 1) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 1) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 1) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 625].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 1) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        for (int z = 0; AgentPositions[Math.abs(i - 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 26) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 26) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 26) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 26) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 26) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 26) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 26) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 26) % 625].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 26) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 3: // top
                        for (int z = 0; AgentPositions[Math.abs(i - 25) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 25) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 25) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 25) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 25) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 25) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 25) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 25) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 25) % 625].Agent.Health > AgentPositions[i].Agent.Health) {

                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                        } else {

                            AgentPositions[Math.abs(i - 25) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 4://up right
                        for (int z = 0; AgentPositions[Math.abs(i - 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i - 24) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i - 24) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 24) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 24) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i - 24) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i - 24) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i - 24) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i - 24) % 625].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i - 24) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i - 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 5: // right
                        for (int z = 0; AgentPositions[Math.abs(i + 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 1) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 1) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 1) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 1) % 625].Agent);
                            } else {
                                // // // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 1) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 1) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 1) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 625].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 1) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 6: // right down
                        for (int z = 0; AgentPositions[Math.abs(i + 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 26) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 26) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 26) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 26) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 26) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 26) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 26) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 26) % 625].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 26) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 7:// down
                        for (int z = 0; AgentPositions[Math.abs(i + 25) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 25) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 25) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 25) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 25) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 25) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 25) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 25) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 25) % 625].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 25) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;

                        }
                        break;
                    case 8://left doen
                        for (int z = 0; AgentPositions[Math.abs(i + 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            if (AgentPositions[Math.abs(i + 24) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                RoboBrainMethod(AgentPositions[Math.abs(i + 24) % 625].Agent, AgentPositions[i].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 24) % 625].Agent, AgentPositions[i].Agent);
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 24) % 625].Agent);
                            } else {
                                // RoboBrainMethod(AgentPositions[i].Agent, AgentPositions[Math.abs(i + 24) % 625].Agent);
                                PlayBrainMethod(AgentPositions[Math.abs(i + 24) % 625].Agent, AgentPositions[i].Agent);
                                RoboBrainMethod(AgentPositions[Math.abs(i + 24) % 625].Agent, AgentPositions[i].Agent);
                            }
                        }
                        if (AgentPositions[Math.abs(i + 24) % 625].Agent.Health > AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                        } else {

                            AgentPositions[Math.abs(i + 24) % 625].Agent = AgentPositions[i].Agent.clone();
                            AgentPositions[Math.abs(i + 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 24) % 625].Agent.Idnum).Health;

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
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 1) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }

                            if (AgentPositions[Math.abs(i - 1) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 1) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 26) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i - 26) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 26) % 625].Agent.Health = AgentPositions[Math.abs(i - 26) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 26) % 625].Agent.Health = AgentPositions[Math.abs(i - 26) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 26) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 26) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {

                            AgentPositions[Math.abs(i - 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 26) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 3: // top
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 25) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 25) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            
                            if (AgentPositions[Math.abs(i - 25) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 25) % 625].Agent.Health = AgentPositions[Math.abs(i - 25) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 25) % 625].Agent.Health = AgentPositions[Math.abs(i - 25) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 25) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 25) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 25) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 4://up right
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 24) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i - 24) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 24) % 625].Agent.Health = AgentPositions[Math.abs(i - 24) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 24) % 625].Agent.Health = AgentPositions[Math.abs(i - 24) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i - 24) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 24) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 24) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 5: // right
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i + 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));    
                            
                            switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 1) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i + 1) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 1) % 625].Agent.Health = AgentPositions[Math.abs(i + 1) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i + 1) % 625].Agent.Health = AgentPositions[Math.abs(i + 1) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 1) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 1) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 6: // right down
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i + 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 26) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i + 26) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 26) % 625].Agent.Health = AgentPositions[Math.abs(i + 26) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i + 26) % 625].Agent.Health = AgentPositions[Math.abs(i + 26) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 26) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 26) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(+ 26) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 7:// down
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 25) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i - 1) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                            }
                        }
                        if (AgentPositions[Math.abs(i + 25) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 25) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 25) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 8://left doen
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.UniqueID != AgentPositions[i].Agent.UniqueID) {
                            for (int z = 0; AgentPositions[Math.abs(i + 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                                double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));
                                double DamageB = (int) ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(26) + 50));  
                                
                                switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

                                    case 0:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 1:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 2:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 3:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 4:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 5:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 6:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 7:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 8:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;


                                }
                                switch (AgentPositions[Math.abs(i + 24) % 625].Agent.Moveslotdefense){

                                    case 0:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 1:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 2:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 3:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 4:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 5:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 6:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 7:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 8:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;


                                }
                                
                                if (AgentPositions[Math.abs(i + 24) % 625].Agent.Speed >= AgentPositions[i].Agent.Speed) {
                                    AgentPositions[Math.abs(i + 24) % 625].Agent.Health = AgentPositions[Math.abs(i + 24) % 625].Agent.Health - DamageA;
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                } else {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                    AgentPositions[Math.abs(i + 24) % 625].Agent.Health = AgentPositions[Math.abs(i + 24) % 625].Agent.Health - DamageA;
                                }
                            }
                            if (AgentPositions[Math.abs(i + 24) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                                AgentPositions[Math.abs(i + 24) % 625].Agent = AgentPositions[i].Agent.clone();
                            } else {
                                AgentPositions[Math.abs(i + 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 24) % 625].Agent.Idnum).Health;

                            }
                        }
                        break;


                }
                int death = new Random().nextInt(60); //70
                if (death > life) {
                    AgentPositions[i].Agent = EmptyBox.clone();
                }
            }else {  // this one executes under normals I think
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
                        if ( AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 1) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            
                            if (AgentPositions[Math.abs(i - 1) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 1) % 625].Agent.Health = AgentPositions[Math.abs(i - 1) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 1) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 1) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 1) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 2://up left       for(int z = 0; AgentPositions[Math.abs(i - 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++){
                        if ( AgentPositions[Math.abs(i - 26) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i - 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 26) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }

    if (AgentPositions[Math.abs(i - 26) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 26) % 625].Agent.Health = AgentPositions[Math.abs(i - 26) % 625].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 26) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if(AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 26) % 625].Agent.Health = AgentPositions[Math.abs(i - 26) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 26) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 26) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {

                            AgentPositions[Math.abs(i - 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 26) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 3: // top
                        if ( AgentPositions[Math.abs(i - 25) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i - 25) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 25) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }

    if (AgentPositions[Math.abs(i - 25) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 25) % 625].Agent.Health = AgentPositions[Math.abs(i - 25) % 625].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 25) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                AgentPositions[Math.abs(i - 25) % 625].Agent.Health = AgentPositions[Math.abs(i - 25) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 25) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;

                                AgentPositions[Math.abs(i - 25) % 625].Agent = AgentPositions[i].Agent.clone();

                        } else {
                            AgentPositions[Math.abs(i - 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 25) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 4://up right
                        if ( AgentPositions[Math.abs(i - 24) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i - 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i - 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i - 24) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i - 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i - 24) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i - 24) % 625].Agent.Health = AgentPositions[Math.abs(i - 24) % 625].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i - 24) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if(AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i - 24) % 625].Agent.Health = AgentPositions[Math.abs(i - 24) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i - 24) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i - 24) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i - 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i - 24) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 5: // right
                        if ( AgentPositions[Math.abs(i + 1) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i + 1) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 1) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 1) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 1) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i + 1) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 1) % 625].Agent.Health = AgentPositions[Math.abs(i + 1) % 625].Agent.Health - DamageA;
                                if(AgentPositions[Math.abs(i + 1) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i + 1) % 625].Agent.Health = AgentPositions[Math.abs(i + 1) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 1) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 1) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 1) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 1) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 6: // right down
                        if ( AgentPositions[Math.abs(i + 26) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i + 26) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 26) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 26) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 26) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i + 26) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 26) % 625].Agent.Health = AgentPositions[Math.abs(i + 26) % 625].Agent.Health - DamageA;
                                if (AgentPositions[Math.abs(i + 26) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if (AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i + 26) % 625].Agent.Health = AgentPositions[Math.abs(i + 26) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 26) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 26) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 26) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(+ 26) % 625].Agent.Idnum).Health;
                      }
}
                        break;
                    case 7:// down
                        if ( AgentPositions[Math.abs(i + 25) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
for (int z = 0; AgentPositions[Math.abs(i + 25) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                            double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                            double DamageB = (int) ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

    switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

        case 0:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 25) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
    switch (AgentPositions[Math.abs(i + 25) % 625].Agent.Moveslotdefense){

        case 0:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 1:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 2:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 3:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 4:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 5:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;
        case 6:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
            break;
        case 7:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
            break;
        case 8:
            DamageB = ((AgentPositions[Math.abs(i + 25) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
            break;


    }
                            if (AgentPositions[Math.abs(i + 25) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                AgentPositions[Math.abs(i + 25) % 625].Agent.Health = AgentPositions[Math.abs(i + 25) % 625].Agent.Health - DamageA;
                                if(AgentPositions[Math.abs(i + 25) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                }
                            } else {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                if( AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                    AgentPositions[Math.abs(i + 25) % 625].Agent.Health = AgentPositions[Math.abs(i + 25) % 625].Agent.Health - DamageA;
                                }
                            }
                        }
                        if (AgentPositions[Math.abs(i + 25) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                            AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                            AgentPositions[Math.abs(i + 25) % 625].Agent = AgentPositions[i].Agent.clone();
                        } else {
                            AgentPositions[Math.abs(i + 25) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 25) % 625].Agent.Idnum).Health;

                      }
}
                        break;
                    case 8://left doen
                        if ( AgentPositions[Math.abs(i + 24) % 625].Agent.Idnum != AgentPositions[i].Agent.Idnum || (false)){
                            for (int z = 0; AgentPositions[Math.abs(i + 24) % 625].Agent.Health > 0 && AgentPositions[i].Agent.Health > 0 && z < 10; z++) {

                                double DamageA = (int) ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                double DamageB = (int) ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));

                                switch (AgentPositions[Math.abs(i) % 625].Agent.Moveslotdefense){

                                    case 0:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 1:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 2:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Attack / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 3:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 4:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 5:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Speed / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 6:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 7:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 8:
                                        DamageA = ((AgentPositions[Math.abs(i) % 625].Agent.Defense / AgentPositions[Math.abs(i + 24) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;


                                }
                                switch (AgentPositions[Math.abs(i + 24) % 625].Agent.Moveslotdefense){

                                    case 0:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 1:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 2:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Attack / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 3:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 4:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 5:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Speed / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 6:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Defense) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 7:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Speed) * (new Random().nextInt(21) + 50));
                                        break;
                                    case 8:
                                        DamageB = ((AgentPositions[Math.abs(i + 24) % 625].Agent.Defense / AgentPositions[Math.abs(i) % 625].Agent.Attack) * (new Random().nextInt(21) + 50));
                                        break;


                                }
                                if (AgentPositions[Math.abs(i + 24) % 625].Agent.Speed <= AgentPositions[i].Agent.Speed) {
                                    AgentPositions[Math.abs(i + 24) % 625].Agent.Health = AgentPositions[Math.abs(i + 24) % 625].Agent.Health - DamageA;
                                    if(AgentPositions[Math.abs(i + 24) % 625].Agent.Health > 0) {
                                        AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                    }
                                } else {
                                    AgentPositions[Math.abs(i) % 625].Agent.Health = AgentPositions[Math.abs(i) % 625].Agent.Health - DamageB;
                                    if( AgentPositions[Math.abs(i) % 625].Agent.Health > 0) {
                                        AgentPositions[Math.abs(i + 24) % 625].Agent.Health = AgentPositions[Math.abs(i + 24) % 625].Agent.Health - DamageA;
                                    }
                                }
                            }
                            if (AgentPositions[Math.abs(i + 24) % 625].Agent.Health < AgentPositions[i].Agent.Health) {
                                AgentPositions[Math.abs(i) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i) % 625].Agent.Idnum).Health;
                                AgentPositions[Math.abs(i + 24) % 625].Agent = AgentPositions[i].Agent.clone();
                            } else {
                                AgentPositions[Math.abs(i + 24) % 625].Agent.Health = monstlist((int) AgentPositions[Math.abs(i + 24) % 625].Agent.Idnum).Health;

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
/*
            for (int k = 0; k < AgentPositions.length; k++) {

                if(AgentPositions[k].Agent.Idnum == 92) {
                AgentPositions[k].Agent = monstlist((int)Memeek.Idnum).clone();
                }

            }

            for (int k = 0; k < AgentPositions.length; k++) {

                if(AgentPositions[k].Agent.Idnum != 101 && new Random().nextInt(16) > 14) {
                AgentPositions[k].Agent.Moveslotdefense = AttackMoves(0);
                }

            }
*/
            if(AgentPositions[i].Agent.Idnum == 92) {
                int randommemeek = new Random().nextInt(9990);
                int idcatcher = AgentPositions[i].Agent.UniqueID;
                AgentPositions[i].Agent = Memeeks[randommemeek].clone();
                //  AgentPositions[k].Agent = monstlist((int)Memeek.Idnum).clone();
                AgentPositions[i].Agent.UniqueID = idcatcher;
            }
        }

/*
        for (int k = 0; k < AgentPositions.length; k++) {

            if(AgentPositions[k].Agent.Idnum == 92) {
                int randommemeek = new Random().nextInt(9990);
                int idcatcher = AgentPositions[k].Agent.UniqueID;
                AgentPositions[k].Agent = Memeeks[randommemeek].clone();
              //  AgentPositions[k].Agent = monstlist((int)Memeek.Idnum).clone();
                AgentPositions[k].Agent.UniqueID = idcatcher;
            }

        }  */
/*
        for (int k = 0; k < AgentPositions.length; k++) {

            if(AgentPositions[k].Agent.Idnum != 201 && new Random().nextInt(16) > 14) {
                AgentPositions[k].Agent.Moveslotdefense = AttackMoves(0);
            }

        }
        */ // at current this would generate mutation IF the attack moves method allowed for it
        
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
                }else {
                    return Custom;
                }
            case 92:


                int attack = new Random().nextInt(100); // make these randoms?
                int speed = new Random().nextInt(100);
                int health = ((int)Memeek.Health - 50);

                //int health = new Random().nextInt(100);
                int defense = new Random().nextInt(100);

                for (int countertimer = 0; !(((attack * defense * speed * health) > 100000000) && ((attack * defense * speed * health) < 121000000) || countertimer > 100); countertimer++) { //countertimer > 1000

                    int Decider = new Random().nextInt(3);

                    switch (Decider) {

                        case 0:
                            attack = (attack + 7);// attack++;
                            break;
                        case 1:
                            speed = (speed + 7);// speed++;
                            break;
                        case 2:
                            defense = (defense + 7);// defense++;
                            break;
                        case 3:
                            //   health++;
                            break;
                    }


                }

                attack = attack+50;
                speed = speed+50;
                defense = defense+50;

                if(defense <= 101){
                    defense = 101;
                }
                if(attack <= 101){
                    attack = 101;
                }
                if(speed <= 101){
                    speed = 101;
                }
/*
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
*/ // in this mode it should be 101 because of the way the stats method is applied
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
            case 201:
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
               EnemyDisplay.setImageResource(R.drawable.genaupresangb);
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
                EnemyDisplay.setImageResource(R.drawable.vellup);
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
                }else {
                    EnemyDisplay.setImageResource(R.drawable.bearyk);
                }
                break;

            case 90:
                EnemyDisplay.setImageResource(R.drawable.sluggernaut);
                break;
            case 91:
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
                } else {
                    EnemyDisplay.setImageResource(R.drawable.scarbeque);
                }
                break;
            case 101:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.fwuffynumpkins);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.fwuffynumpkinsa);
                }
                break;
            case 102:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.dothog);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.dothog);
                }
                break;
            case 103:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.reefcake);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.reefcake);
                }
                break;
            case 104:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.cheetza);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.cheetza);
                }
                break;
            case 105:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.sortsand);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.sortsand);
                }
                break;
            case 106:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.chilldabeest);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.chilldabeest);
                }
                break;
            case 107:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.communigator);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.communigator);
                }
                break;
            case 108:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.mossboss);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.mossboss);
                }
                break;
            case 109:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.vamprey);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.vamprey);
                }
                break;
            case 110:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.parafox);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.parafox);
                }
                break;
            case 111:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.rhischlosserous);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.rhischlosserous);
                }
                break;
            case 112:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.hykeyna);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.hykeynax);
                }
                break;
            case 113:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.tafantula);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.tafantula);
                }
                break;
            case 114:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.farmot);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.farmot);
                }
                break;
            case 115:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.beeurchin);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.beeurchin);
                }
                break;
            case 116:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.flyinsoup);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.flyinsoup);
                }
                break;
            case 117:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.meloncolli);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.meloncolli);
                }
                break;
            case 118:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.scorphibian);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.scorphibian);
                }
                break;
            case 119:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.geliphant);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.geliphantx);
                }
                break;
            case 120:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.chimpansy);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.chimpansy);
                }
                break;
            case 121:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.giveup);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.giveupx);
                }
                break;
            case 122:

                if (AttackerMonsterHandle.UniqueID < 50000000) {
                    EnemyDisplay.setImageResource(R.drawable.avokaboom);
                } else {
                    EnemyDisplay.setImageResource(R.drawable.avokaboomx);
                }
                break;
            case 201:
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
                            Seasons.setTextSize(TypedValue.COMPLEX_UNIT_SP, (((float)life/(float)6)+4));
                            datenum = "%s";




                            if(flipper == 1) {

                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                //first.setTextSize(TypedValue.COMPLEX_UNIT_SP, ((FirstMonsterc/60)+4));
                                //first.setTextSize(TypedValue.COMPLEX_UNIT_SP, ((life/10)+4));
                                FirstMonsterc = 0;

                            }else if (flipper == 2){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                               // first.setTextSize(TypedValue.COMPLEX_UNIT_SP, ((FirstMonsterc/60)+4));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;
                            }else if (flipper == 3){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                                third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                                ThirdMonsterc = 0;
                            }else if (flipper == 4){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                                third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                                ThirdMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                                fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                                FourthMonsterc = 0;
                            }else if (flipper == 5){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                                third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                                ThirdMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                                fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                                FourthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                                fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                                FifthMonsterc = 0;
                            }else if (flipper == 6){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                                third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                                ThirdMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                                fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                                FourthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                                fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                                FifthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SixthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SixthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SixthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SixthMonster).Speed);

                                sixth.setText(names(SixthMonster) + H + D + A + S + "\n" + SetIntToString(SixthMonsterc));
                                SixthMonsterc = 0;
                            }else if (flipper == 0){
                                String H = " H" + SetIntToString((int) monstlist(FirstMonster).Health);
                                String D = " D" + SetIntToString((int) monstlist(FirstMonster).Defense);
                                String A = " A" + SetIntToString((int) monstlist(FirstMonster).Attack);
                                String S = " S" + SetIntToString((int) monstlist(FirstMonster).Speed);

                                first.setText(names(FirstMonster) + H + D + A + S + "\n" + SetIntToString(FirstMonsterc));
                                FirstMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SecondMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SecondMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SecondMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SecondMonster).Speed);

                                second.setText(names(SecondMonster) + H + D + A + S + "\n" + SetIntToString(SecondMonsterc));
                                SecondMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(ThirdMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(ThirdMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(ThirdMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(ThirdMonster).Speed);

                                third.setText(names(ThirdMonster) + H + D + A + S + "\n" + SetIntToString(ThirdMonsterc));
                                ThirdMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FourthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FourthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FourthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FourthMonster).Speed);

                                fourth.setText(names(FourthMonster) + H + D + A + S + "\n" + SetIntToString(FourthMonsterc));
                                FourthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(FifthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(FifthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(FifthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(FifthMonster).Speed);

                                fifth.setText(names(FifthMonster) + H + D + A + S + "\n" + SetIntToString(FifthMonsterc));
                                FifthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SixthMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SixthMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SixthMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SixthMonster).Speed);

                                sixth.setText(names(SixthMonster) + H + D + A + S + "\n" + SetIntToString(SixthMonsterc));
                                SixthMonsterc = 0;

                                H = " H" + SetIntToString((int) monstlist(SeventhMonster).Health);
                                D = " D" + SetIntToString((int) monstlist(SeventhMonster).Defense);
                                A = " A" + SetIntToString((int) monstlist(SeventhMonster).Attack);
                                S = " S" + SetIntToString((int) monstlist(SeventhMonster).Speed);

                                seventh.setText(names(SeventhMonster) + H + D + A + S + "\n" + SetIntToString(SeventhMonsterc));
                                SeventhMonsterc = 0;
                            }

                        }

                    }
                });

            }




        },100, 1992);

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

}