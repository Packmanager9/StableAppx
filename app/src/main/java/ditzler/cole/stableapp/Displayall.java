package ditzler.cole.stableapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Displayall extends AppCompatActivity {

    int arrayfillercount = 0;
    int arrayfillercountx = 0;


    public Displayall() throws CloneNotSupportedException {
    }

    public class AgentObjectx implements Cloneable {
        public ImageView Gridspot;
        public int Agent;

        public AgentObjectx (ImageView gridspot, int agent){

            Gridspot = gridspot;
            Agent = agent;
        }

        public AgentObjectx clone() throws CloneNotSupportedException {
            AgentObjectx clonedmonster = (AgentObjectx) super.clone();
            return clonedmonster;
        }
    }




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


    Button Status, SpecialAttack, Turn, HealButton, Teller, FasterButton, SlowerButton, FlipButton, FirstButton, SecondButton, ThirdButton, FourthButton, FifthButton, SixthButton, SeventhButton;


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


   AgentObjectx emptybox = new AgentObjectx(a01, 0);
   AgentObjectx[] AgentPositions =  { emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(),emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(),emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(),emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(),emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(),  emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone(), emptybox.clone() };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DarkView = getLayoutInflater().inflate(R.layout.garlitos_lab_activity, null);
        setContentView(R.layout.dynamics_activity_forkt);

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
        b11 = findViewById(R.id.B11);
        b12 = findViewById(R.id.B12);


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

        try {
            Doit();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        


        for (int q = 0 ;  q < AgentPositions.length; q++){
            Doubledoit(AgentPositions[q]);
        }
        
        
    }

    private void Doubledoit(AgentObjectx AttackerMonsterHandle) {

        {
            try {
                Doit();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(0, 0, 0, 0));


            switch((int) AttackerMonsterHandle.Agent){

                case 0:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.errantnope);
                    break;
                case 1:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.kunk);
                    break;
                case 2:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.kohboh);
                    break;
                case 3:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.djoper);
                    break;
                case 4:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.schorp);
                    break;
                case 5:
                    if (0 < 22000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zaume);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zaumer);
                    }else if(0 < 70000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zaumeb);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zaumeg);
                    }
                    break;
                case 6:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.nhainhai);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.nhainhaii);
                    }
                    break;
                case 7:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.degeissdt);
                    break;
                case 8:

                    if (0 < 22000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.yuggle);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.yugglee);
                    }else if(0 < 70000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.yugglet);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.yuggler);
                    }
                    break;
                case 9:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bongu);
                    break;
                case 10:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.giteriglia);
                    break;
                case 11:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.cyosteroth);
                    break;
                case 12:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.nentopode);
                    break;
                case 13:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.centiclak);
                    break;
                case 14:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.uggnawb);
                    break;
                case 15:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.grobhost);
                    break;
                case 16:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.illelonab);
                    break;
                case 17:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rongzeed);
                    break;
                case 18:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.blattle);
                    break;
                case 19:

                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.swogharnlera);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.swogharnler);
                    }
                    break;
                case 20:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.adenolish);
                    break;
                case 21:
                    if (0 < 70000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.genaupresangb);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.genaupresangc);
                    }


                    break;
                case 22:

                    if (0 < 20000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.daahnida);
                    }else if (0 < 40000000){
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.daahnidaa);
                    }else if (0 < 60000000){
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.daahnidab);
                    }else if (0 < 80000000){
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.daahnidac);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.daahnidad);
                    }


                    int daahnidacolorsetter = 0 % 7; //>>>
                    int daahnidacolorcontroller = 0 % 255;

                    switch (daahnidacolorsetter){
                        case 0:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, 255, 255, daahnidacolorcontroller));
                            break;
                        case 1:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, 255 ));
                            break;
                        case 2:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, 255 ));
                            break;
                        case 3:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, daahnidacolorcontroller, 255, daahnidacolorcontroller));
                            break;
                        case 4:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, 255, daahnidacolorcontroller, daahnidacolorcontroller ));
                            break;
                        case 5:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, 255 ));
                            break;
                        case 6:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(70, daahnidacolorcontroller, daahnidacolorcontroller, daahnidacolorcontroller ));
                            break;
                    }

                    break;
                case 23:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sorba);
                    break;
                case 24:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.jiyou);
                    break;
                case 25:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sparvae);
                    break;
                case 26:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.vellup);
                    break;
                case 27:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bellaja);
                    break;
                case 28:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.levdzell);
                    break;
                case 29:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.ryteggg);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rytegg);
                    }
                    break;
                case 30:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.flashmer);
                    break;
                case 31:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.schmodozer);
                    break;
                case 32:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.octgotot);
                    break;
                case 33:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.triaural);
                    break;
                case 34:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.dicyto);
                    break;
                case 35:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.monopteryx);
                    break;
                case 36:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.elastocark);
                    break;
                case 37:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.toobapath);
                    break;
                case 38:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.wheeliosbop);
                    break;
                case 39:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.ihmpdrap);
                    break;
                case 40:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.epibazang);
                    break;
                case 41:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hemtan);
                    break;
                case 42:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.ogo);
                    break;
                case 43:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.strachid);
                    break;
                case 44:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.toximastica);
                    break;
                case 45:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.urcuria);
                    break;
                case 46:
                    if (0 < 22000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hyuntress);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hyuntressa);
                    }else if(0 < 70000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hyuntressb);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hyuntressc);
                    }
                    break;
                case 47:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mondosplak);
                    break;
                case 48:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.kaheksaguge);
                    break;
                case 49:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sapiosuant);
                    break;
                case 50:
                    if (0 < 22000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.munegullx);
                    } else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.munegull);
                    }

                    break;
                case 51:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sudakleez);
                    break;
                case 52:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.halocordate);
                    break;
                case 53:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.faedendron);
                    break;
                case 54:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.osteoplang);
                    break;
                case 55:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zrachnid);
                    break;
                case 56:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.xlitch);
                    break;
                case 57:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.baa);
                    break;
                case 58:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mantidile);
                    break;
                case 59:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.nokoyl);
                    break;
                case 60:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.yallod);
                    break;
                case 61:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.algaetizer);
                    break;
                case 62:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.kachort);
                    break;
                case 63:
                    if (0 < 22000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.slamelion);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.slamelionb);
                    }else if(0 < 70000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.slameliona);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.slamelion);
                    }
                    break;
                case 64:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.ayateda);
                    break;
                case 65:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.wochem);
                    break;
                case 66:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.humun);
                    break;
                case 67:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.psychobath);
                    break;
                case 68:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.gytanic);
                    break;
                case 69:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.beis);
                    break;
                case 70:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.gungholio);
                    break;
                case 71:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.honigkonig);
                    break;
                case 72:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.kungulp);
                    break;
                case 73:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.satinella);
                    break;
                case 74:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.elocurl);
                    break;
                case 75:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.takobie);
                    break;
                case 76:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.obchovy);
                    break;
                case 77:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.nimnamnom);
                    break;
                case 78:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.tutewtoo);
                    break;
                case 79:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.blanqast);
                    break;
                case 80:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.indeo);
                    break;
                case 81:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.deblobbio);
                    break;
                case 82:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.knightstacean);
                    break;
                case 83:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.prostrax);
                    break;
                case 84:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.haptozahen);
                    break;
                case 85:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.minkohabod);
                    break;
                case 86:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zeen);
                    break;
                case 87:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.tacroach);
                    break;
                case 88:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.manterfly);
                    break;
                case 89:
                    if (0 < 9000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearya);
                    }else if(0 < 18000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyb);
                    }else if(0 < 27000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyc);
                    }else if(0 < 36000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyd);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearye);
                    }else if(0 < 54000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyf);
                    }else if(0 < 63000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyg);
                    }else if(0 < 72000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyh);
                    }else if(0 < 81000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyi);
                    }else if(0 < 90000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyj);
                    }else  {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.bearyk);
                    }
                    break;
                case 90:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sluggernaut);
                    break;
                case 91:
                    if (0 < 12000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.firstcustom);
                    }else if(0 < 44000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.missleaneous);
                    }else if(0 < 45000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.firstcustoma);
                    }else if(0 < 87000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.whumpuhmp);
                    }else if(0 < 88000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zubgondrakter);
                    }else if(0 < 89000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rattic);
                    }else if(0 < 89500000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.doughgnat);
                    }else if(0 < 90000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sluggernaut);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.firstcustomc);
                    }


                    break;

                case 92:


                    int memeekcolorsetter = 0 % 7; //>>>
                    int memeekcolorcontroller = 0 % 255;

                    switch (memeekcolorsetter){
                        case 0:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, 255, 255, memeekcolorcontroller));
                            break;
                        case 1:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, 255 ));
                            break;
                        case 2:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, 255 ));
                            break;
                        case 3:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, memeekcolorcontroller, 255, memeekcolorcontroller));
                            break;
                        case 4:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, 255, memeekcolorcontroller, memeekcolorcontroller ));
                            break;
                        case 5:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, 255 ));
                            break;
                        case 6:
                            AttackerMonsterHandle.Gridspot.setColorFilter(Color.argb(110, memeekcolorcontroller, memeekcolorcontroller, memeekcolorcontroller ));
                            break;
                    }
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.memeeka);
                    break;
                case 93:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.doughgnat);
                    break;
                case 94:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rattic);
                    break;
                case 95:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.missleaneous);
                    break;
                case 96:
                    if(0 < 15000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbita);
                    }else if (0 < 20000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbitb);
                    }else if (0 < 30000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbitc);
                    }else if (0 < 40000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbitd);
                    }else if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbite);
                    }else {

                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.runnybabbitx);
                    }
                    break;
                case 97:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zubgondrakter);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zubgondrakterhat);
                    }
                    break;
                case 98:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.whumpuhmp);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.whumpuhmp);
                    }
                    break;
                case 99:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mangoon);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mangoon);
                    }
                    break;
                case 100:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.scarbeque);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.scarbeque);
                    }
                    break;
                case 101:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.fwuffynumpkins);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.fwuffynumpkinsa);
                    }
                    break;
                case 102:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.dothog);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.dothog);
                    }
                    break;
                case 103:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.reefcake);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.reefcake);
                    }
                    break;
                case 104:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.cheetza);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.cheetza);
                    }
                    break;
                case 105:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sortsand);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.sortsand);
                    }
                    break;
                case 106:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.chilldabeest);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.chilldabeest);
                    }
                    break;
                case 107:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.communigator);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.communigator);
                    }
                    break;
                case 108:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mossboss);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.mossboss);
                    }
                    break;
                case 109:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.vamprey);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.vamprey);
                    }
                    break;
                case 110:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.parafox);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.parafox);
                    }
                    break;
                case 111:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rhischlosserous);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.rhischlosserous);
                    }
                    break;
                case 112:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hykeyna);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.hykeynax);
                    }
                    break;
                case 113:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.tafantula);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.tafantula);
                    }
                    break;
                case 114:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.farmot);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.farmot);
                    }
                    break;
                case 115:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.beeurchin);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.beeurchin);
                    }
                    break;
                case 116:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.flyinsoup);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.flyinsoup);
                    }
                    break;
                case 117:
                    if (0 < 50000000) {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.meloncolli);
                    }else {
                        AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.meloncolli);
                    }
                    break;
                case 118:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.scorphibian);
                    break;
                case 119:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.geliphant);
                    break;
                case 120:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.chimpansy);
                    break;
                case 121:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.giveup);
                    break;
                case 122:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.avokaboom);
                    break;

                case 123:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.eggressx);
                    break;

                case 124:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.zentapede);
                    break;

                case 125:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.probocetus);
                    break;

                case 126:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.tankgolin);
                    break;

                case 127:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.spiekgul);
                    break;

                case 128:
                    AttackerMonsterHandle.Gridspot.setImageResource(R.drawable.errantnope);
                    break;
            }


        }
    }

    private void Doit() throws CloneNotSupportedException {


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

        
    }


    public  void Filler(ImageView A) throws CloneNotSupportedException {
        if (arrayfillercount < AgentPositions.length) {
            AgentPositions[arrayfillercount].Gridspot = A;
            AgentPositions[arrayfillercount].Agent = (arrayfillercount % 128) + 1;

            arrayfillercount++;
        }
    }
    }
