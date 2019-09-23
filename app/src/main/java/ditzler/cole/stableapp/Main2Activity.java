package ditzler.cole.stableapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private  final int BASE = 60;
    private  final String ANSWER_STRING = "%s %s %s is %s so %s,%s,%s,%s,%s,%s,%s,%s,%s";
    private  final String ANSWER_STRINGS = "%s %s %s is %s %s so %s,%s,%s,%s,%s,%s,%s,%s,%s";
    private  final String Warn_Warning = "%s";
    private  double a = 0;
    private  double b = 0;
    private  double c = 0;
    private  double d = 0;
    int activityopemer;
    private  EditText inputBox1;
    private  EditText inputBox2;
    private  TextView answerView;
    private  TextView WarningBox;
    private  int resultingNumberOfSixtys;
    private  long resultingRemainderOfSixtys;
    private  int UltraDummy = 1;
    private  int F;
    private  int N;
    private  int G;
    private  int L;
    private  int Q;
    private  int J;
    private  int H;
    private  int S;
    private  int P;
    private  int M;
    private  int O;
    private  int Y;
    private  int p;
    private  int last;
    private  int dlast;
    private  int sH;
    private  int Sh;
    private  int HH;
    private  int HHTwo;
    private  int resultingRemainderOfSixties;
    private  int resultingNumberOfSixties;
    private  int resultingNumberOfSixds;
    private  int RzDg;
    private  int gezultingNextDigit;
    private  int resultingNextzDigit;
    private  int RzoDg;
    private  long Blank;
    private  long rezultingNextDigit;
    private  int resultingNextDigit;
    private  long resultingNextsDigit;
    private  int x;
    private  int X;
    private  int u;
    private  int U;
    private  int e;
    private  int E;
    private  int xI = 0;
    private  int XI = 0;
    private  int uI = 0;
    private  int UI = 0;
    private  int eI = 0;
    private  int EI = 0;
    private  int pI = 0;
    private  int XX = 0;
    private  int YY = 0;
    private  int ZZ = 0;
    private  int VV = 0;
    private  int VY = 0;
    private  int VX = 0;
    private  int wI = 0;
    private  int WI = 0;
    private  Integer imagos[] = {R.drawable.s0, R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15, R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24, R.drawable.s25, R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, R.drawable.s31, R.drawable.s32, R.drawable.s33, R.drawable.s34, R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43, R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52, R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59};
    private  Integer Emagos[] = {R.drawable.noerrorsmall, R.drawable.errorsmall,};
    private  int OI;
    private  int FI;
    private  int NI;
    private  int GI;
    private  int LI;
    private  int QI;
    private  int JI;
    private  int HI;
    private  int SI;
    private  int PI;
    private  int MI;
    private  int YI;
    private  int sHI;
    private  int ShI;
    private  int ZZI;
    private  int QQI;
    private  int GGI;
    private  Button btnImageChanger;
    private  Button btnImageChangess;
    private  Button Wipe;
    private  ImageView hIm;
    private ImageView yIm;
    private ImageView nIm;
    private ImageView qIm;
    private ImageView zIm;
    private ImageView fIm;
    private ImageView pIm;
    private ImageView Fim;
    private ImageView Yim;
    private ImageView Nim;
    private ImageView Gim;
    private ImageView Lim;
    private ImageView Qim;
    private ImageView Jim;
    private ImageView Him;
    private ImageView Sim;
    private ImageView Pim;
    private ImageView Mim;
    private ImageView Oim;
    private ImageView ShIm;
    private ImageView sHIm;
    private ImageView EIm;
    private ImageView eIm;
    private ImageView QQIm;
    private ImageView ZZIm;
    private ImageView Exim;
    private ImageView FFIm;
    private  int Blanco;
    private  int RI;
    private  final String dummy = "";
    final int mina = 0;
    final int maxa = 60;
    final int minb = 0;
    final int maxb = 60;
    private int randa = 0;
    private int randb = 0;
    private  int FF = 0;
    private  int GG = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // AOCmethod();
        //StereoscopePendulumOpen();
        //AnimationOpen();
        // NumbersPracticeOpen();
      // RotationPracticeOpen();
       // ShortOpen();
       // LongOpen();
        // AnalogClock();
       // ProtomonMethod();
        // CpracOpen();
       // AOCmethod();
     //   dispall();
     //   ProtomonMethod();
    //    Intent go = new Intent(this, GarlitosNotes.class);
    //    startActivity(go);
        initializeElements();
        enableCountess();
        enableMultiply();
        enableDivide();
        enableAdd();
        enableSubtract();
        enableCount();
        Exim = (ImageView) findViewById(R.id.EA);
        Fim = (ImageView) findViewById(R.id.SV1);
        Nim = (ImageView) findViewById(R.id.SV2);
        Gim = (ImageView) findViewById(R.id.SV3);
        Lim = (ImageView) findViewById(R.id.SV4);
        Qim = (ImageView) findViewById(R.id.SV5);
        Oim = (ImageView) findViewById(R.id.VS1);
        ShIm = (ImageView) findViewById(R.id.L1);
        EIm = (ImageView) findViewById(R.id.E2);
        Jim = (ImageView) findViewById(R.id.SV6);
        Him = (ImageView) findViewById(R.id.SV7);
        Sim = (ImageView) findViewById(R.id.SV8);
        Pim = (ImageView) findViewById(R.id.SV9);
        Mim = (ImageView) findViewById(R.id.SV0);
        Yim = (ImageView) findViewById(R.id.VS2);
        sHIm = (ImageView) findViewById(R.id.L2);
        eIm = (ImageView) findViewById(R.id.E1);
        yIm = (ImageView) findViewById(R.id.imageView1);
        hIm = (ImageView) findViewById(R.id.imageView2);
        nIm = (ImageView) findViewById(R.id.imageView3);
        qIm = (ImageView) findViewById(R.id.imageView4);
        zIm = (ImageView) findViewById(R.id.imageView5);
        fIm = (ImageView) findViewById(R.id.imageView6);
        pIm = (ImageView) findViewById(R.id.imageView7);
        ZZIm = (ImageView) findViewById(R.id.imageView8);
        QQIm = (ImageView) findViewById(R.id.E4);
        FFIm = (ImageView) findViewById(R.id.E3);
        Wipe = (Button) findViewById(R.id.Swipe);
        Wipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(activityopemer ==  0){
                    activityopemer=1;
                if (a == 389 && b == 59) {
                    ProtomonMethod();
                }
                if (a == 389 && b == 58) {
                    ProtomonsMethod();
                }
                if (a == 390 && b == 58) {
                    BalanceProto();
                }
                if (a == 390 && b == 59) {
                    ShortOpen();
                }
                if (a == 390 && b == 37) {
                    LongOpen();
                }
                if (a == 391 && b == 59) {
                    PrimeClock();
                }
                if (a == 392 && b == 59) {
                    OpenTiles();
                }
                if (a == 393 && b == 59) {
                    OpenFont();
                }
                if (a == 394 && b == 59) {
                    AnalogClock();
                }
                if (a == 395 && b == 59) {
                    StereoscopeOpen();
                }
                if (a == 396 && b == 59) {
                    StereoscopePendulumOpen();
                }
                if (a == 397 && b == 59) {
                    AnimationOpen();
                }
                if (a == 398 && b == 59) {
                    NumbersPracticeOpen();
                }
                if (a == 399 && b == 59) {
                    RotationPracticeOpen();
                }
                if (a == b && a == 1) {
                    OpenGraphs();
                }
                if ((a % 2) == 0 && a == b && a > 0 && (a % 3) != 0) {
                    NarcSixty();
                } else if ((a % 2) == 0 && a == b && a > 0 && (a % 3) == 0 && (a % 5) != 0) {
                    HappySixty();
                } else if ((a % 2) == 0 && a == b && a > 0 && (a % 3) == 0 && (a % 5) == 0 && (a % 7) != 0) {
                    AOCmethod();
                } else if ((a % 2) == 0 && a == b && a > 0 && (a % 3) == 0 && (a % 5) == 0 && (a % 7) == 0 && (a % 11) != 0) {
                    CpracOpen();
                } else if (a == b && a > 2310 && b < 2345) {
                    OpenRedHerring();
                } else if (!(xI == 42 || xI == 9) && a != 1 && a != 389 && a != 390 && a != 391 && a != 392 && a != 393 && a != 394 && a != 395 && a != 396 && a != 397 && a != 398 && a != 399) {
                    if (b != 123) {
                        OpenStockMania();
                    }
                    if (a == 9 && b == 123) {
                        OpenStockManiaWithTime();
                    }
                } else if (XI == 9) {
                    OpenStockManiaAutoplayer();

                } else if (XI == 42) {

                    if (uI != 42) {
                        OpenStockManiaPowerfulAutoplayer();
                    } else {
                        OpenStockManiaPowerfulAutoplayerTwo();
                    }
                } else {
                    if (a != 1 && a != 389 && a != 390 && a != 391 && a != 392 && a != 393 && a != 394 && a != 395 && a != 396 && a != 397 && a != 398 && a != 399) {
                        OpenStockManiaWithTime();
                    } else if (a == 9 && b == 123) {
                        OpenStockManiaWithTime();
                    }
                }
            }
                }



        });
        btnImageChanger = (Button) findViewById(R.id.btnImageChanger);
        btnImageChangess = (Button) findViewById(R.id.btn2);
    }

    private void BalanceProto() {
        Intent go = new Intent(this, BalanceCalculator.class);
        startActivity(go);
    }
    private void CpracOpen() {
        Intent go = new Intent(this, Cprac.class);
        startActivity(go);
    }
    private void ShortOpen() {
        Intent go = new Intent(this, ShortPractice.class);
        startActivity(go);
    }
    private void LongOpen() {
        Intent go = new Intent(this, LongPractice.class);
        startActivity(go);
    }

    public void ProtomonsMethod() {
            Intent go = new Intent(this, protomons.class);
                    startActivity(go);
        }
    public void ProtomonMethod() {
            Intent go = new Intent(this, protomon.class);
                    startActivity(go);
        }
    public void OpenRedHerring() {
            Intent go = new Intent(this, CalculatorRedHerring.class);
                    startActivity(go);
        }
        public void AnalogClock() {
            Intent go = new Intent(this, AnalogSixtyClock.class);
                    startActivity(go);
        }
        public void StereoscopeOpen() {
            Intent go = new Intent(this, Stereoscope.class);
                    startActivity(go);
        }
        public void StereoscopePendulumOpen() {
            Intent go = new Intent(this, StereoscopePendulum.class);
                    startActivity(go);
        }
        public void AnimationOpen() {
            Intent go = new Intent(this, AnimationPractice.class);
                    startActivity(go);
        }
        public void NumbersPracticeOpen() {
            Intent go = new Intent(this, NumbersPractice.class);
                    startActivity(go);
        }
        public void RotationPracticeOpen() {
            Intent go = new Intent(this, RotationPractice.class);
                    startActivity(go);
        }
        public void PrimeClock() {
            Intent go = new Intent(this, AdobrasigianPrimeClock.class);
                    startActivity(go);
        }
        public void OpenGraphs() {
            Intent go = new Intent(this, StockManiaActivityGraphs.class);
                    startActivity(go);
        }
        public void HappySixty() {
            Intent go = new Intent(this, HappySixties.class);
                    startActivity(go);
        }
        public void AOCmethod() {
            Intent go = new Intent(this, AOC.class);
                    startActivity(go);
        }
        public void NarcSixty() {
            Intent go = new Intent(this, NarcSixties.class);
                    startActivity(go);
        }
        public void OpenBlueHerring() {
            Intent go = new Intent(this, CalculatorBlueHerring.class);
                    startActivity(go);
        }
        public void OpenFont() {
            Intent go = new Intent(this, FontTile.class);
                    startActivity(go);
        }
        public void OpenTiles() {
            Intent go = new Intent(this, CounterTiles.class);
                    startActivity(go);
        }
        public void OpenStockMania() {
            Intent go = new Intent(this, StockManiaActivity.class);
                    startActivity(go);
        }
        public void OpenStockManiaWithTime() {
            Intent go = new Intent(this, StockManiaActivityWithTime.class);
            startActivity(go);
        }
        public void OpenStockManiaAutoplayer() {
            Intent go = new Intent(this, StockManiaActivityAutoplayer.class);
                    startActivity(go);
        }
        public void OpenStockManiaPowerfulAutoplayer() {
            Intent go = new Intent(this, StockManiaActivityPowerfulAutoplayer.class);
                    startActivity(go);
        }
        public void OpenStockManiaPowerfulAutoplayerTwo() {
            Intent go = new Intent(this, StockManiaActivityPowerfulAutoplayerVersionTwo.class);
                    startActivity(go);
        }
  public void onClick(View v) {
      Wipe.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v)
          {
              View av = findViewById(R.id.int1);
              av.setVisibility(View.GONE);
          }
      });
    }
    public void initializeElements() {
        inputBox1 = findViewById(R.id.int1);
        inputBox2 = findViewById(R.id.int2);
        answerView = findViewById(R.id.answer);
        WarningBox = findViewById(R.id.EX);
    }
    public void enableMultiply() {
        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();
                final double sum = a * b;
                final double suk = b;
                final double sua = a;
                sixtyify(sum, sua, suk);
                getAnswer("X", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                RenderMethod();
                }


        });
    }
    public void enableDivide() {
        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();
                if (b == 0){
                    b = 0;
                    answerView.setText("Can't divide by zero!");
                    final double suk = b;
                    final double sua = a;
                    sixtyify(0, sua, suk);
                    caution("This symbol next to # indicates possible inaccuracy");
                    GG = 1;
                    RenderMethod();
                    return;
                }else {
                    final double sum = a / b;

                    final double suk = b;
                    final double sua = a;
                    sixtyify(sum, sua, suk);
                    getAnswer("/", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                    caution("This symbol next to # indicates possible inaccuracy");
                    RenderMethod();
                }


            }
        });
    }
    public void enableAdd() {
        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();
                final double sum = a + b;
                final double suk = b;
                final double sua = a;
                sixtyify(sum, sua, suk);
                getAnswer("+", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                RenderMethod();
            }
        });
    }
    public void enableSubtract() {
        findViewById(R.id.subtractButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();
                final double sum = Math.abs(a - b);
                final double suk = b;
                final double sua = a;
                sixtyify(sum, sua, suk);
                getAnswer("-", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                RenderMethod();
            }
        });
    }
    public void enableCount() {
        findViewById(R.id.btnImageChanger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();
                final double sum = a % b;
                final double suk = b;
                final double sua = a;
                sixtyify(sum, sua, suk);
                getAnswer("mod", sum, dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                caution("This symbol next to # indicates possible inaccuracy");
                RenderMethod();
            }
        });
    }
    public void enableCountess() {
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputbox2 = (EditText) findViewById(R.id.int2);
                String ant = inputBox2.getText().toString();
                EditText inputbox1 = (EditText) findViewById(R.id.int1);
                String bant = inputBox1.getText().toString();
                if(TextUtils.isEmpty(bant)) {
                    inputbox1.setError("input required");
                    return;
                }
                if(TextUtils.isEmpty(ant)) {
                    inputbox2.setError("input required");
                    return;
                }
                getInputValues();

                if (b != 0) {
                    final double sum = (a / b) * 100;
                    final double suk = b;
                    final double sua = a;
                    sixtyify(sum, sua, suk);
                    getAnswers("out of", sum, "%", dlast, last, p, Blank, RzoDg, resultingNextDigit, resultingNextzDigit, resultingNumberOfSixtys, resultingRemainderOfSixtys);
                    caution("This symbol next to # indicates possible inaccuracy");
                    RenderMethod();
                }else {
                    b = 0;
                    answerView.setText("Can't divide by zero!");
                    final double suk = b;
                    final double sua = a;
                    sixtyify(0, sua, suk);
                    caution("This symbol next to # indicates possible inaccuracy");
                    GG = 1;
                    RenderMethod();
                }
            }
        });
    }
    public  void caution(final String warning) {
     Log.d("Danger",warning);
     WarningBox.setText(warning);
}
public void RenderMethod(){
    UltraDummy = 1;
    Exim.setImageResource(Emagos[UltraDummy]);
    JI = J % imagos.length;
    Jim.setImageResource(imagos[JI]);
    FI = F % imagos.length;
    Fim.setImageResource(imagos[FI]);
    xI = x % imagos.length;
    yIm.setImageResource(imagos[xI]);
    if (YY >= 1   || HHTwo != 0 || YY != 0) {
        wI = 1;
    } else if (YY == 0 && HHTwo == 0) {
        wI = 0;
    }

    if (XX >= 1  || HH != 0 || XX != 0) {
        WI = 1;
    } else if (XX == 0 && HH == 0 ) {
        WI = 0;
    }

    if (GG >= 1 || VV != 0) {
        GGI = 1;
    } else if (GG ==0) {
        GGI = 0;
    }
    QQIm.setImageResource(Emagos[GGI]);
    eIm.setImageResource(Emagos[WI]);
    EIm.setImageResource(Emagos[wI]);

    if (N >= 1   || HHTwo != 0 || YY != 0) {
        NI = N % imagos.length;
        Nim.setImageResource(imagos[NI]);
    } else if (N == 0 && G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && HHTwo == 0) {
        NI = N % imagos.length;
        Nim.setImageResource(Emagos[NI]);
    } else {
        NI = N % imagos.length;
        Nim.setImageResource(imagos[NI]);
    }
    if (G >= 1   || HHTwo != 0 || YY != 0) {
        GI = G % imagos.length;
        Gim.setImageResource(imagos[GI]);
    } else if (G == 0 && L == 0 && Q == 0 && O == 0 && Sh == 0 && HHTwo == 0) {
        GI = G % imagos.length;
        Gim.setImageResource(Emagos[GI]);
    } else {
        GI = G % imagos.length;
        Gim.setImageResource(imagos[GI]);
    }
    if (L >= 1   || HHTwo != 0 || YY != 0) {
        LI = L % imagos.length;
        Lim.setImageResource(imagos[LI]);
    } else if (L == 0 && Q == 0 && O == 0 && Sh == 0 && HHTwo == 0) {
        LI = L % imagos.length;
        Lim.setImageResource(Emagos[LI]);
    } else {
        LI = L % imagos.length;
        Lim.setImageResource(imagos[LI]);
    }
    if (Q >= 1   || HHTwo != 0 || YY != 0) {
        QI = Q % imagos.length;
        Qim.setImageResource(imagos[QI]);
    } else if (Q == 0 && O == 0 && Sh == 0 && HHTwo == 0) {
        QI = Q % imagos.length;
        Qim.setImageResource(Emagos[QI]);
    } else {
        QI = Q % imagos.length;
        Qim.setImageResource(imagos[QI]);
    }
    if (O >= 1   || HHTwo != 0 || YY != 0) {
        OI = O % imagos.length;
        Oim.setImageResource(imagos[OI]);
    } else if (O == 0 && Sh == 0 && HHTwo == 0) {
        OI = O % imagos.length;
        Oim.setImageResource(Emagos[OI]);
    } else {
        OI = O % imagos.length;
        Oim.setImageResource(imagos[OI]);
    }
    if (Sh >= 1 || HHTwo != 0 || YY != 0) {
        ShI = Sh % imagos.length;
        ShIm.setImageResource(imagos[ShI]);
    } else if (Sh == 0 && HHTwo == 0) {
        ShI = Sh % imagos.length;
        ShIm.setImageResource(Emagos[ShI]);
    } else {
        ShI = Sh % imagos.length;
        ShIm.setImageResource(imagos[ShI]);
    }
    if (H >= 1 || HH != 0 || XX != 0) {
        HI = H % imagos.length;
        Him.setImageResource(imagos[HI]);
    } else if (H == 0 && S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0 && HH == 0) {
        HI = H;
        Him.setImageResource(Emagos[HI]);
    } else {
        HI = (H % imagos.length);
        Him.setImageResource(imagos[HI]);
    }
    if (S >= 1 || HH != 0 || XX != 0) {
        SI = S % imagos.length;
        Sim.setImageResource(imagos[SI]);
    } else if (S == 0 && P == 0 && M == 0 && Y == 0 && sH == 0 && HH == 0) {
        SI = S;
        Sim.setImageResource(Emagos[SI]);
    } else {
        SI = (S % imagos.length);
        Sim.setImageResource(imagos[SI]);
    }
    if (P >= 1 || HH != 0 || XX != 0) {
        PI = P % imagos.length;
        Pim.setImageResource(imagos[PI]);
    } else if (P == 0 && M == 0 && Y == 0 && sH == 0 && HH == 0) {
        PI = P;
        Pim.setImageResource(Emagos[PI]);
    } else {
        PI = (P % imagos.length);
        Pim.setImageResource(imagos[PI]);
    }
    if (M >= 1 || HH != 0 || XX != 0) {
        MI = M % imagos.length;
        Mim.setImageResource(imagos[MI]);
    } else if (M == 0 && Y == 0 && sH == 0 && HH == 0) {
        MI = M;
        Mim.setImageResource(Emagos[MI]);
    } else {
        MI = (M % imagos.length);
        Mim.setImageResource(imagos[MI]);
    }
    if (Y >= 1 || HH != 0 || XX != 0) {
        YI = Y % imagos.length;
        Yim.setImageResource(imagos[YI]);
    } else if (Y == 0 && sH == 0 && HH == 0) {
        YI = Y;
        Yim.setImageResource(Emagos[YI]);
    } else {
        YI = (Y % imagos.length);
        Yim.setImageResource(imagos[YI]);
    }
    if (sH >= 1 || HH != 0 || XX != 0) {
        sHI = sH % imagos.length;
        sHIm.setImageResource(imagos[sHI]);
    } else if (sH == 0 && HH == 0) {
        sHI = sH;
        sHIm.setImageResource(Emagos[sHI]);
    } else {
        sHI = (sH % imagos.length);
        sHIm.setImageResource(imagos[sHI]);
    }
    if (FF >= 1 || VV != 0 || GG != 0) {
        QQI = (FF % imagos.length);
        FFIm.setImageResource(imagos[QQI]);
    } else if (last == 0 && FF == 0 && GG == 0 ) {
        QQI = 0;
        FFIm.setImageResource(Emagos[QQI]);
    } else {
        QQI = (FF % imagos.length);
        FFIm.setImageResource(Emagos[QQI]);
    }
    if (p >= 1 || VV != 0) {
        pI = (p % imagos.length);
        pIm.setImageResource(imagos[pI]);
    } else if (last == 0 && FF == 0 && GG == 0) {
        pI = 0;
        pIm.setImageResource(Emagos[pI]);
    } else {
        pI = (p % imagos.length);
        pIm.setImageResource(imagos[pI]);
    }
    if (ZZ >= 1 || VV != 0) {
        ZZI = (ZZ % imagos.length);
        ZZIm.setImageResource(imagos[ZZI]);
    } else if (ZZ == 0 && FF == 0 && last == 0 && GG == 0) {
        ZZI = 0;
        ZZIm.setImageResource(Emagos[ZZI]);
    } else {
        ZZI = (ZZ % imagos.length);
        ZZIm.setImageResource(imagos[ZZI]);
    }
    if (E >= 1 || VV != 0) {
        EI = (E % imagos.length);
        fIm.setImageResource(imagos[EI]);
    } else if (E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
        EI = 0;
        fIm.setImageResource(Emagos[EI]);
    } else {
        EI = (E % imagos.length);
        fIm.setImageResource(imagos[EI]);
    }
    if (e >= 1 || VV != 0) {
        eI = (e % imagos.length);
        zIm.setImageResource(imagos[eI]);
    } else if (e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
        eI = 0;
        zIm.setImageResource(Emagos[eI]);
    } else {
        eI = (e % imagos.length);
        zIm.setImageResource(imagos[eI]);
    }
    if (U >= 1 || VV != 0) {
        UI = (U % imagos.length);
        qIm.setImageResource(imagos[UI]);
    } else if (U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
        UI = 0;
        qIm.setImageResource(Emagos[UI]);
    } else {
        UI = (U % imagos.length);
        qIm.setImageResource(imagos[UI]);
    }
    if (u >= 1 || VV != 0) {
        uI = (u % imagos.length);
        nIm.setImageResource(imagos[uI]);
    } else if (u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
        uI = 0;
        nIm.setImageResource(Emagos[uI]);
    } else {
        uI = (u % imagos.length);
        nIm.setImageResource(imagos[uI]);
    }
    if (X >= 1 || VV != 0) {
        XI = (X % imagos.length);
        hIm.setImageResource(imagos[XI]);
    } else if (X == 0 && u == 0 && U == 0 && e == 0 && E == 0 && p == 0 && ZZ == 0 && last == 0 && FF == 0 && GG == 0) {
        XI = 0;
        hIm.setImageResource(Emagos[XI]);
    } else {
        XI = (X % imagos.length);
        hIm.setImageResource(imagos[XI]);
    }

}
    public  void getAnswer(final String sign, final double product, final long dlast, final long last, final long p, final long Blank, final long RzoDg, final long resultingNextDigit, final long resultingNextsDigit, final long numOfSixtys, final long remOfSixtys) {
        double canproduct = Math.round(product);
        String productpass = String.format("%.0f", canproduct);
        String cpass = String.format("%.0f", c);
        String dpass = String.format("%.0f", d);
        final String answer = String.format(ANSWER_STRING, cpass, sign, dpass, productpass, dlast, last, p, Blank, RzoDg, resultingNextsDigit, resultingNextDigit, numOfSixtys, remOfSixtys);
        Log.d("Base60", answer);
        answerView.setText(answer);
    }
    public void getInputValues() {
        b = Double.parseDouble(String.valueOf(inputBox1.getText()));
        a = Double.parseDouble(String.valueOf(inputBox2.getText()));
        c = a;
        d = b;
    }
    public  void sixtyify(double decimalToBeConverted, double W, double K) {
        resultingNumberOfSixties = (int) Math.floor(decimalToBeConverted / BASE);
        resultingNumberOfSixtys = (int) Math.floor((decimalToBeConverted / BASE) % BASE);
        resultingNumberOfSixds = (int) Math.floor(decimalToBeConverted / BASE);
        resultingRemainderOfSixtys = (long) Math.floor(decimalToBeConverted % BASE);
        resultingRemainderOfSixties = (int) Math.floor(decimalToBeConverted % BASE);
        RzoDg = (int) Math.floor((decimalToBeConverted / 12960000) % BASE);
        RzDg = (int) Math.floor(((decimalToBeConverted % 216000) / 3600) % BASE);
        Blank = (long) Math.floor((decimalToBeConverted / 777600000) % BASE);
        Blanco = (int) Math.floor(decimalToBeConverted / 777600000) % BASE;
        resultingNextDigit = (int) Math.floor(RzDg);
        rezultingNextDigit = (long) Math.floor(decimalToBeConverted / BASE);
        resultingNextsDigit = (long) Math.floor((decimalToBeConverted / 216000) % BASE);
        gezultingNextDigit = (int) Math.floor(decimalToBeConverted / 3600) % BASE;
        resultingNextzDigit = (int) Math.floor((decimalToBeConverted / 216000) % BASE);
        x = (int) Math.floor(decimalToBeConverted % BASE);
        X = (int)  (Math.floor(decimalToBeConverted / BASE) % BASE);
        u = (int)  (Math.floor((decimalToBeConverted / 60) /60 ) % BASE);
        U = (int)  (Math.floor(decimalToBeConverted / 216000)% BASE);
        e = (int)  (Math.floor(decimalToBeConverted / 12960000) % BASE);
        E = (int) (Math.floor(decimalToBeConverted / 777600000) % BASE);
        p = (int) (Math.floor(((decimalToBeConverted / 777600000) / 60 ) % BASE));
        ZZ = (int) (((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) % BASE));
        last = (int) ((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) % BASE);
        FF = (int) ((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) % BASE));
        GG = (int) (((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) /60) % BASE));
        VV = (int) ((((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) /60) /60)));
        dlast = (int) ((((Math.floor((decimalToBeConverted / 777600000) / 60 ) / 60) /60) % BASE));
        J = (int) (Math.floor(W % BASE)% BASE);
        H = (int)  (Math.floor(W / BASE)% BASE);
        S = (int)  (Math.floor(W / 3600)% BASE);
        P = (int)  (Math.floor(W / 216000)% BASE);
        M = (int)  (Math.floor(W / 12960000)% BASE);
        Y = (int) (Math.floor(W / 777600000)% BASE);
        sH = (int) (Math.floor((W / 777600000) / 60 ) % BASE);
        XX = (int) ((Math.floor((W / 777600000) / 60 ) /60));
        HH = (int) ((((Math.floor((W / 777600000) / 60 ) / 60) /60)));
        VX = (int) ((((((Math.floor((W / 777600000) / 60 ) / 60) /60) /60) /60)));
        F = (int) (Math.floor(K % BASE));
        N = (int)  (Math.floor(K / BASE)% BASE);
        G = (int)  (Math.floor(K / 3600)% BASE);
        L = (int)  (Math.floor(K / 216000)% BASE);
        Q = (int)  (Math.floor(K / 12960000)% BASE);
        O = (int)  (Math.floor(K / 777600000)% BASE);
        Sh = (int) (Math.floor((K / 777600000) / 60 ) % BASE);
        YY = (int) ((Math.floor((K / 777600000) / 60 ) /60) );
        HHTwo = (int) ((((Math.floor((K / 777600000) / 60 ) / 60) /60)));
        VY = (int) ((((((Math.floor((K / 777600000) / 60 ) / 60) /60) /60) /60)));
    }
    public  void getAnswers(final String sign, final double product, final String dummy, final long dlast, final long last, final long p, final long Blank, final long RzoDg, final long resultingNextDigit, final long resultingNextsDigit, final long numOfSixtys, final long remOfSixtys) {
        final String answers = String.format(ANSWER_STRINGS, c, sign, d, product, dummy, dlast, last, p, Blank, RzoDg, resultingNextsDigit, resultingNextDigit, numOfSixtys, remOfSixtys);
        Log.d("%60", answers);
        answerView.setText(answers);
    }
    public void onResume() {
        super.onResume();
        activityopemer = 0;
    }

    public void dispall() {
        Intent go = new Intent(this, Displayall.class);
        startActivity(go);
    }
}