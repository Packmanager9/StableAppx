package ditzler.cole.stableapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class CounterTiles extends AppCompatActivity {

    private  Integer imagos[] = {R.drawable.s0, R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13, R.drawable.s14, R.drawable.s15, R.drawable.s16, R.drawable.s17, R.drawable.s18, R.drawable.s19, R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s23, R.drawable.s24, R.drawable.s25, R.drawable.s26, R.drawable.s27, R.drawable.s28, R.drawable.s29, R.drawable.s30, R.drawable.s31, R.drawable.s32, R.drawable.s33, R.drawable.s34, R.drawable.s35, R.drawable.s36, R.drawable.s37, R.drawable.s38, R.drawable.s39, R.drawable.s40, R.drawable.s41, R.drawable.s42, R.drawable.s43, R.drawable.s44, R.drawable.s45, R.drawable.s46, R.drawable.s47, R.drawable.s48, R.drawable.s49, R.drawable.s50, R.drawable.s51, R.drawable.s52, R.drawable.s53, R.drawable.s54, R.drawable.s55, R.drawable.s56, R.drawable.s57, R.drawable.s58, R.drawable.s59};

    Timer timer;

    int twelves, twelvesa, twelvesb, twelvesc, twelvesd, twelvese;
    int  elevens,  elevensa,  elevensb,  elevensc,  elevensd,  elevense;
    int  tens,  tensa,  tensb,  tensc,  tensd,  tense;
    int  nines,  ninesa,  ninesb,  ninesc,  ninesd,  ninese;
    int  eights,  eightsa,  eightsb,  eightsc,  eightsd,  eightse;
    int  sevens,  sevensa,  sevensb,  sevensc,  sevensd,  sevense;
    int  sixes,  sixesa,  sixesb,  sixesc,  sixesd,  sixese;
    int  fives,  fivesa,  fivesb,  fivesc,  fivesd,  fivese;
    int  fours,  foursa,  foursb,  foursc,  foursd,  fourse;
    int  threes,  threesa,  threesb,  threesc,  threesd,  threese;
    int  twos,  twosa,  twosb,  twosc,  twosd,  twose;
    int  wholes,  wholesa,  wholesb,  wholesc,  wholesd,  wholese;
    int one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;

    ImageView i1, i1a, i1b, i1c, i1d, i1e,i7, i7a, i7b, i7c, i7d, i7e,i2, i2a, i2b, i2c, i2d, i2e,i3, i3a, i3b, i3c, i3d, i3e,i4, i4a, i4b, i4c, i4d, i4e,i5, i5a, i5b, i5c, i5d, i5e, i6, i6a, i6b, i6c, i6d, i6e, i8, i8a, i8b, i8c, i8d, i8e, i9,  i9a,  i9b,  i9c,  i9d,  i9e, i10,  i10a,  i10b,  i10c,  i10d,  i10e, i11, i11a, i11b, i11c, i11d, i11e, i12, i12a, i12b, i12c, i12d, i12e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter_tiles);
        i1 = (ImageView) findViewById(R.id.whole);
        i2 = (ImageView) findViewById(R.id.halves);
        i3 = (ImageView) findViewById(R.id.thirds);
        i4 = (ImageView) findViewById(R.id.fourths);
        i5 = (ImageView) findViewById(R.id.fifths);
        i6 = (ImageView) findViewById(R.id.sixths);
        i7 = (ImageView) findViewById(R.id.sevenths);
        i8 = (ImageView) findViewById(R.id.eighths);
        i9 = (ImageView) findViewById(R.id.ninths);
        i12 = (ImageView) findViewById(R.id.twelvths);
        i12a = (ImageView) findViewById(R.id.twelvthsa);
        i12b = (ImageView) findViewById(R.id.twelvthsb);
        i12c = (ImageView) findViewById(R.id.twelvthsc);
        i12d = (ImageView) findViewById(R.id.twelvthsd);
        i12e = (ImageView) findViewById(R.id.twelvthse);
        i11 = (ImageView) findViewById(R.id. elevenths);
        i11a = (ImageView) findViewById(R.id. eleventhsa);
        i11b = (ImageView) findViewById(R.id. eleventhsb);
        i11c = (ImageView) findViewById(R.id. eleventhsc);
        i11d = (ImageView) findViewById(R.id. eleventhsd);
        i11e = (ImageView) findViewById(R.id. eleventhse);
        i10 = (ImageView) findViewById(R.id. tenths);
        i10a = (ImageView) findViewById(R.id. tenthsa);
        i10b = (ImageView) findViewById(R.id. tenthsb);
        i10c = (ImageView) findViewById(R.id. tenthsc);
        i10d = (ImageView) findViewById(R.id. tenthsd);
        i10e = (ImageView) findViewById(R.id. tenthse);
        i9 = (ImageView) findViewById(R.id. ninths);
        i9a = (ImageView) findViewById(R.id. ninthsa);
        i9b = (ImageView) findViewById(R.id. ninthsb);
        i9c = (ImageView) findViewById(R.id. ninthsc);
        i9d = (ImageView) findViewById(R.id. ninthsd);
        i9e = (ImageView) findViewById(R.id. ninthse);

        i8 = (ImageView) findViewById(R.id. eighths);
        i8a = (ImageView) findViewById(R.id. eighthsa);
        i8b = (ImageView) findViewById(R.id. eighthsb);
        i8c = (ImageView) findViewById(R.id. eighthsc);
        i8d = (ImageView) findViewById(R.id. eighthsd);
        i8e = (ImageView) findViewById(R.id. eighthse);

        i7 = (ImageView) findViewById(R.id. sevenths);
        i7a = (ImageView) findViewById(R.id. seventhsa);
        i7b = (ImageView) findViewById(R.id. seventhsb);
        i7c = (ImageView) findViewById(R.id. seventhsc);
        i7d = (ImageView) findViewById(R.id. seventhsd);
        i7e = (ImageView) findViewById(R.id. seventhse);
        
        i6 = (ImageView) findViewById(R.id. sixths);
        i6a = (ImageView) findViewById(R.id. sixthsa);
        i6b = (ImageView) findViewById(R.id. sixthsb);
        i6c = (ImageView) findViewById(R.id. sixthsc);
        i6d = (ImageView) findViewById(R.id. sixthsd);
        i6e = (ImageView) findViewById(R.id. sixthse);

        i5 = (ImageView) findViewById(R.id. fifths);
        i5a = (ImageView) findViewById(R.id. fifthsa);
        i5b = (ImageView) findViewById(R.id. fifthsb);
        i5c = (ImageView) findViewById(R.id. fifthsc);
        i5d = (ImageView) findViewById(R.id. fifthsd);
        i5e = (ImageView) findViewById(R.id. fifthse);

        i4 = (ImageView) findViewById(R.id. fourths);
        i4a = (ImageView) findViewById(R.id. fourthsa);
        i4b = (ImageView) findViewById(R.id. fourthsb);
        i4c = (ImageView) findViewById(R.id. fourthsc);
        i4d = (ImageView) findViewById(R.id. fourthsd);
        i4e = (ImageView) findViewById(R.id. fourthse);

        i3 = (ImageView) findViewById(R.id. thirds);
        i3a = (ImageView) findViewById(R.id. thirdsa);
        i3b = (ImageView) findViewById(R.id. thirdsb);
        i3c = (ImageView) findViewById(R.id. thirdsc);
        i3d = (ImageView) findViewById(R.id. thirdsd);
        i3e = (ImageView) findViewById(R.id. thirdse);

        i2 = (ImageView) findViewById(R.id. halves);
        i2a = (ImageView) findViewById(R.id. halvesa);
        i2b = (ImageView) findViewById(R.id. halvesb);
        i2c = (ImageView) findViewById(R.id. halvesc);
        i2d = (ImageView) findViewById(R.id. halvesd);
        i2e = (ImageView) findViewById(R.id. halvese);

        i1 = (ImageView) findViewById(R.id. whole);
        i1a = (ImageView) findViewById(R.id. wholea);
        i1b = (ImageView) findViewById(R.id. wholeb);
        i1c = (ImageView) findViewById(R.id. wholec);
        i1d = (ImageView) findViewById(R.id. wholed);
        i1e = (ImageView) findViewById(R.id. wholee);
        
        
        i1.setImageResource(R.drawable.a0);
        i2.setImageResource(R.drawable.a0);
        i3.setImageResource(R.drawable.a0);
        i4.setImageResource(R.drawable.a0);
        i5.setImageResource(R.drawable.a0);
        i6.setImageResource(R.drawable.a0);
        i7.setImageResource(R.drawable.a0);
        i8.setImageResource(R.drawable.a0);
        i9.setImageResource(R.drawable.a0);
        i12.setImageResource(R.drawable.a0);
        i12a.setImageResource(R.drawable.a0);
        i12b.setImageResource(R.drawable.a0);
        i12c.setImageResource(R.drawable.a0);
        i12d.setImageResource(R.drawable.a0);
        i12e.setImageResource(R.drawable.a0);
        i11.setImageResource(R.drawable.a0);
        i11a.setImageResource(R.drawable.a0);
        i11b.setImageResource(R.drawable.a0);
        i11c.setImageResource(R.drawable.a0);
        i11d.setImageResource(R.drawable.a0);
        i11e.setImageResource(R.drawable.a0);
        i10.setImageResource(R.drawable.a0);
        i10a.setImageResource(R.drawable.a0);
        i10b.setImageResource(R.drawable.a0);
        i10c.setImageResource(R.drawable.a0);
        i10d.setImageResource(R.drawable.a0);
        i10e.setImageResource(R.drawable.a0);
        i9.setImageResource(R.drawable.a0);
        i9a.setImageResource(R.drawable.a0);
        i9b.setImageResource(R.drawable.a0);
        i9c.setImageResource(R.drawable.a0);
        i9d.setImageResource(R.drawable.a0);
        i9e.setImageResource(R.drawable.a0);

        i8.setImageResource(R.drawable.a0);
        i8a.setImageResource(R.drawable.a0);
        i8b.setImageResource(R.drawable.a0);
        i8c.setImageResource(R.drawable.a0);
        i8d.setImageResource(R.drawable.a0);
        i8e.setImageResource(R.drawable.a0);

        i7.setImageResource(R.drawable.a0);
        i7a.setImageResource(R.drawable.a0);
        i7b.setImageResource(R.drawable.a0);
        i7c.setImageResource(R.drawable.a0);
        i7d.setImageResource(R.drawable.a0);
        i7e.setImageResource(R.drawable.a0);
        
        i6.setImageResource(R.drawable.a0);
        i6a.setImageResource(R.drawable.a0);
        i6b.setImageResource(R.drawable.a0);
        i6c.setImageResource(R.drawable.a0);
        i6d.setImageResource(R.drawable.a0);
        i6e.setImageResource(R.drawable.a0);

        i5.setImageResource(R.drawable.a0);
        i5a.setImageResource(R.drawable.a0);
        i5b.setImageResource(R.drawable.a0);
        i5c.setImageResource(R.drawable.a0);
        i5d.setImageResource(R.drawable.a0);
        i5e.setImageResource(R.drawable.a0);

        i4.setImageResource(R.drawable.a0);
        i4a.setImageResource(R.drawable.a0);
        i4b.setImageResource(R.drawable.a0);
        i4c.setImageResource(R.drawable.a0);
        i4d.setImageResource(R.drawable.a0);
        i4e.setImageResource(R.drawable.a0);

        i3.setImageResource(R.drawable.a0);
        i3a.setImageResource(R.drawable.a0);
        i3b.setImageResource(R.drawable.a0);
        i3c.setImageResource(R.drawable.a0);
        i3d.setImageResource(R.drawable.a0);
        i3e.setImageResource(R.drawable.a0);

        i2.setImageResource(R.drawable.a0);
        i2a.setImageResource(R.drawable.a0);
        i2b.setImageResource(R.drawable.a0);
        i2c.setImageResource(R.drawable.a0);
        i2d.setImageResource(R.drawable.a0);
        i2e.setImageResource(R.drawable.a0);

        i1.setImageResource(R.drawable.a0);
        i1a.setImageResource(R.drawable.a0);
        i1b.setImageResource(R.drawable.a0);
        i1c.setImageResource(R.drawable.a0);
        i1d.setImageResource(R.drawable.a0);
        i1e.setImageResource(R.drawable.a0);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                one = one + 27720;
                        if (one == 27720){
                            wholes++;
                            one = 0;
                        }
                
                if ( wholes == 60){
                    wholes = 0;
                    wholesa =  wholesa+1;
                }
                if ( wholesa == 60){
                    wholesa = 0;
                    wholesb =  wholesb+1;
                }
                if ( wholesb == 60){
                    wholesb = 0;
                    wholesc =  wholesc+1;
                }
                if ( wholesc == 60){
                    wholesc = 0;
                    wholesd =  wholesd+1;
                }
                if ( wholesd == 60){
                    wholesd = 0;
                    wholese =  wholese+1;
                }

                two = two + (27720/2);
                if (two == 27720){
                    twos++;
                    two = 0;
                }
                
                if ( twos == 60){
                    twos = 0;
                    twosa =  twosa+1;
                }
                if ( twosa == 60){
                    twosa = 0;
                    twosb =  twosb+1;
                }
                if ( twosb == 60){
                    twosb = 0;
                    twosc =  twosc+1;
                }
                if ( twosc == 60){
                    twosc = 0;
                    twosd =  twosd+1;
                }
                if ( twosd == 60){
                    twosd = 0;
                    twose =  twose+1;
                }

                three = three + (27720/3);
                if (three == 27720){
                    threes++;
                    three = 0;
                }
                if ( threes == 60){
                    threes = 0;
                    threesa =  threesa+1;
                }
                if ( threesa == 60){
                    threesa = 0;
                    threesb =  threesb+1;
                }
                if ( threesb == 60){
                    threesb = 0;
                    threesc =  threesc+1;
                }
                if ( threesc == 60){
                    threesc = 0;
                    threesd =  threesd+1;
                }
                if ( threesd == 60){
                    threesd = 0;
                    threese =  threese+1;
                }

                four = four + (27720/4);
                if (four == 27720){
                    fours++;
                    four = 0;
                }
                if ( fours == 60){
                    fours = 0;
                    foursa =  foursa+1;
                }
                if ( foursa == 60){
                    foursa = 0;
                    foursb =  foursb+1;
                }
                if ( foursb == 60){
                    foursb = 0;
                    foursc =  foursc+1;
                }
                if ( foursc == 60){
                    foursc = 0;
                    foursd =  foursd+1;
                }
                if ( foursd == 60){
                    foursd = 0;
                    fourse =  fourse+1;
                }

                five = five + (27720/5);
                if (five == 27720){
                    fives++;
                    five = 0;
                }
                if ( fives == 60){
                    fives = 0;
                    fivesa =  fivesa+1;
                }
                if ( fivesa == 60){
                    fivesa = 0;
                    fivesb =  fivesb+1;
                }
                if ( fivesb == 60){
                    fivesb = 0;
                    fivesc =  fivesc+1;
                }
                if ( fivesc == 60){
                    fivesc = 0;
                    fivesd =  fivesd+1;
                }
                if ( fivesd == 60){
                    fivesd = 0;
                    fivese =  fivese+1;
                }

                six = six + (27720/6);
                if (six == 27720){
                    sixes++;
                    six = 0;
                }
                if ( sixes == 60){
                    sixes = 0;
                    sixesa =  sixesa+1;
                }
                if ( sixesa == 60){
                    sixesa = 0;
                    sixesb =  sixesb+1;
                }
                if ( sixesb == 60){
                    sixesb = 0;
                    sixesc =  sixesc+1;
                }
                if ( sixesc == 60){
                    sixesc = 0;
                    sixesd =  sixesd+1;
                }
                if ( sixesd == 60){
                    sixesd = 0;
                    sixese =  sixese+1;
                }


                seven = seven + (27720/7);
                if (seven == 27720){
                    sevens++;
                    seven = 0;
                }
                if ( sevens == 60){
                    sevens = 0;
                    sevensa =  sevensa+1;
                }
                if ( sevensa == 60){
                    sevensa = 0;
                    sevensb =  sevensb+1;
                }
                if ( sevensb == 60){
                    sevensb = 0;
                    sevensc =  sevensc+1;
                }
                if ( sevensc == 60){
                    sevensc = 0;
                    sevensd =  sevensd+1;
                }
                if ( sevensd == 60){
                    sevensd = 0;
                    sevense =  sevense+1;
                }


                eight = eight + (27720/8);
                if (eight == 27720){
                    eights++;
                    eight = 0;
                }
                if ( eights == 60){
                    eights = 0;
                    eightsa =  eightsa+1;
                }
                if ( eightsa == 60){
                    eightsa = 0;
                    eightsb =  eightsb+1;
                }
                if ( eightsb == 60){
                    eightsb = 0;
                    eightsc =  eightsc+1;
                }
                if ( eightsc == 60){
                    eightsc = 0;
                    eightsd =  eightsd+1;
                }
                if ( eightsd == 60){
                    eightsd = 0;
                    eightse =  eightse+1;
                }

                nine = nine + (27720/9);
                if (nine == 27720){
                    nines++;
                    nine = 0;
                }
                if ( nines == 60){
                    nines = 0;
                    ninesa =  ninesa+1;
                }
                if ( ninesa == 60){
                    ninesa = 0;
                    ninesb =  ninesb+1;
                }
                if ( ninesb == 60){
                    ninesb = 0;
                    ninesc =  ninesc+1;
                }
                if ( ninesc == 60){
                    ninesc = 0;
                    ninesd =  ninesd+1;
                }
                if ( ninesd == 60){
                    ninesd = 0;
                    ninese =  ninese+1;
                }

                ten = ten + (27720/10);
                if (ten == 27720){
                    tens++;
                    ten = 0;
                }
                if ( tens == 60){
                    tens = 0;
                    tensa =  tensa+1;
                }
                if ( tensa == 60){
                    tensa = 0;
                    tensb =  tensb+1;
                }
                if ( tensb == 60){
                    tensb = 0;
                    tensc =  tensc+1;
                }
                if ( tensc == 60){
                    tensc = 0;
                    tensd =  tensd+1;
                }
                if ( tensd == 60){
                    tensd = 0;
                    tense =  tense+1;
                }

                eleven = eleven + (27720/11);
                if (eleven == 27720){
                    elevens++;
                    eleven = 0;
                }
                if ( elevens == 60){
                    elevens = 0;
                    elevensa =  elevensa+1;
                }
                if ( elevensa == 60){
                    elevensa = 0;
                    elevensb =  elevensb+1;
                }
                if ( elevensb == 60){
                    elevensb = 0;
                    elevensc =  elevensc+1;
                }
                if ( elevensc == 60){
                    elevensc = 0;
                    elevensd =  elevensd+1;
                }
                if ( elevensd == 60){
                    elevensd = 0;
                    elevense =  elevense+1;
                }

                twelve = twelve + (27720/12);
                if (twelve == 27720){
                    twelves++;
                    twelve = 0;
                }
                if (twelves == 60){
                    twelves = 0;
                    twelvesa = twelvesa+1;
                }
                if (twelvesa == 60){
                    twelvesa = 0;
                    twelvesb = twelvesb+1;
                }
                if (twelvesb == 60){
                    twelvesb = 0;
                    twelvesc = twelvesc+1;
                }
                if (twelvesc == 60){
                    twelvesc = 0;
                    twelvesd = twelvesd+1;
                }
                if (twelvesd == 60){
                    twelvesd = 0;
                    twelvese = twelvese+1;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        i12.setImageResource(imagos[twelves]);
                        i12a.setImageResource(imagos[twelvesa]);
                        i12b.setImageResource(imagos[twelvesb]);
                        i12c.setImageResource(imagos[twelvesc]);
                        i12d.setImageResource(imagos[twelvesd]);
                        i12e.setImageResource(imagos[twelvese%60]);

                        i11.setImageResource(imagos[ elevens]);
                        i11a.setImageResource(imagos[ elevensa]);
                        i11b.setImageResource(imagos[ elevensb]);
                        i11c.setImageResource(imagos[ elevensc]);
                        i11d.setImageResource(imagos[ elevensd]);
                        i11e.setImageResource(imagos[ elevense%60]);


                        i10.setImageResource(imagos[ tens]);
                        i10a.setImageResource(imagos[ tensa]);
                        i10b.setImageResource(imagos[ tensb]);
                        i10c.setImageResource(imagos[ tensc]);
                        i10d.setImageResource(imagos[ tensd]);
                        i10e.setImageResource(imagos[ tense%60]);


                        i9.setImageResource(imagos[ nines]);
                        i9a.setImageResource(imagos[ ninesa]);
                        i9b.setImageResource(imagos[ ninesb]);
                        i9c.setImageResource(imagos[ ninesc]);
                        i9d.setImageResource(imagos[ ninesd]);
                        i9e.setImageResource(imagos[ ninese%60]);

                        i8.setImageResource(imagos[ eights]);
                        i8a.setImageResource(imagos[ eightsa]);
                        i8b.setImageResource(imagos[ eightsb]);
                        i8c.setImageResource(imagos[ eightsc]);
                        i8d.setImageResource(imagos[ eightsd]);
                        i8e.setImageResource(imagos[ eightse%60]);


                        i7.setImageResource(imagos[ sevens]);
                        i7a.setImageResource(imagos[ sevensa]);
                        i7b.setImageResource(imagos[ sevensb]);
                        i7c.setImageResource(imagos[ sevensc]);
                        i7d.setImageResource(imagos[ sevensd]);
                        i7e.setImageResource(imagos[ sevense%60]);


                        i6.setImageResource(imagos[ sixes]);
                        i6a.setImageResource(imagos[ sixesa]);
                        i6b.setImageResource(imagos[ sixesb]);
                        i6c.setImageResource(imagos[ sixesc]);
                        i6d.setImageResource(imagos[ sixesd]);
                        i6e.setImageResource(imagos[ sixese%60]);


                        i5.setImageResource(imagos[ fives]);
                        i5a.setImageResource(imagos[ fivesa]);
                        i5b.setImageResource(imagos[ fivesb]);
                        i5c.setImageResource(imagos[ fivesc]);
                        i5d.setImageResource(imagos[ fivesd]);
                        i5e.setImageResource(imagos[ fivese%60]);


                        i4.setImageResource(imagos[ fours]);
                        i4a.setImageResource(imagos[ foursa]);
                        i4b.setImageResource(imagos[ foursb]);
                        i4c.setImageResource(imagos[ foursc]);
                        i4d.setImageResource(imagos[ foursd]);
                        i4e.setImageResource(imagos[ fourse%60]);


                        i3.setImageResource(imagos[ threes]);
                        i3a.setImageResource(imagos[ threesa]);
                        i3b.setImageResource(imagos[ threesb]);
                        i3c.setImageResource(imagos[ threesc]);
                        i3d.setImageResource(imagos[ threesd]);
                        i3e.setImageResource(imagos[ threese%60]);


                        i2.setImageResource(imagos[ twos]);
                        i2a.setImageResource(imagos[ twosa]);
                        i2b.setImageResource(imagos[ twosb]);
                        i2c.setImageResource(imagos[ twosc]);
                        i2d.setImageResource(imagos[ twosd]);
                        i2e.setImageResource(imagos[ twose%60]);


                        i1.setImageResource(imagos[ wholes]);
                        i1a.setImageResource(imagos[ wholesa]);
                        i1b.setImageResource(imagos[ wholesb]);
                        i1c.setImageResource(imagos[ wholesc]);
                        i1d.setImageResource(imagos[ wholesd]);
                        i1e.setImageResource(imagos[ wholese%60]);
                    }
                });
            }
        }, 0, (250));
        
        /*
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                one = one + 12;
                        if (one == 27720){
                            wholes++;
                            one = 0;
                        }

                if ( wholes == 60){
                    wholes = 0;
                    wholesa =  wholesa+1;
                }
                if ( wholesa == 60){
                    wholesa = 0;
                    wholesb =  wholesb+1;
                }
                if ( wholesb == 60){
                    wholesb = 0;
                    wholesc =  wholesc+1;
                }
                if ( wholesc == 60){
                    wholesc = 0;
                    wholesd =  wholesd+1;
                }
                if ( wholesd == 60){
                    wholesd = 0;
                    wholese =  wholese+1;
                }

                two = two + 11;
                if (two == 27720){
                    twos++;
                    two = 0;
                }

                if ( twos == 60){
                    twos = 0;
                    twosa =  twosa+1;
                }
                if ( twosa == 60){
                    twosa = 0;
                    twosb =  twosb+1;
                }
                if ( twosb == 60){
                    twosb = 0;
                    twosc =  twosc+1;
                }
                if ( twosc == 60){
                    twosc = 0;
                    twosd =  twosd+1;
                }
                if ( twosd == 60){
                    twosd = 0;
                    twose =  twose+1;
                }

                three = three + 10;
                if (three == 27720){
                    threes++;
                    three = 0;
                }
                if ( threes == 60){
                    threes = 0;
                    threesa =  threesa+1;
                }
                if ( threesa == 60){
                    threesa = 0;
                    threesb =  threesb+1;
                }
                if ( threesb == 60){
                    threesb = 0;
                    threesc =  threesc+1;
                }
                if ( threesc == 60){
                    threesc = 0;
                    threesd =  threesd+1;
                }
                if ( threesd == 60){
                    threesd = 0;
                    threese =  threese+1;
                }

                four = four + 9;
                if (four == 27720){
                    fours++;
                    four = 0;
                }
                if ( fours == 60){
                    fours = 0;
                    foursa =  foursa+1;
                }
                if ( foursa == 60){
                    foursa = 0;
                    foursb =  foursb+1;
                }
                if ( foursb == 60){
                    foursb = 0;
                    foursc =  foursc+1;
                }
                if ( foursc == 60){
                    foursc = 0;
                    foursd =  foursd+1;
                }
                if ( foursd == 60){
                    foursd = 0;
                    fourse =  fourse+1;
                }

                five = five + 8;
                if (five == 27720){
                    fives++;
                    five = 0;
                }
                if ( fives == 60){
                    fives = 0;
                    fivesa =  fivesa+1;
                }
                if ( fivesa == 60){
                    fivesa = 0;
                    fivesb =  fivesb+1;
                }
                if ( fivesb == 60){
                    fivesb = 0;
                    fivesc =  fivesc+1;
                }
                if ( fivesc == 60){
                    fivesc = 0;
                    fivesd =  fivesd+1;
                }
                if ( fivesd == 60){
                    fivesd = 0;
                    fivese =  fivese+1;
                }

                six = six + 7;
                if (six == 27720){
                    sixes++;
                    six = 0;
                }
                if ( sixes == 60){
                    sixes = 0;
                    sixesa =  sixesa+1;
                }
                if ( sixesa == 60){
                    sixesa = 0;
                    sixesb =  sixesb+1;
                }
                if ( sixesb == 60){
                    sixesb = 0;
                    sixesc =  sixesc+1;
                }
                if ( sixesc == 60){
                    sixesc = 0;
                    sixesd =  sixesd+1;
                }
                if ( sixesd == 60){
                    sixesd = 0;
                    sixese =  sixese+1;
                }


                seven = seven + 6;
                if (seven == 27720){
                    sevens++;
                    seven = 0;
                }
                if ( sevens == 60){
                    sevens = 0;
                    sevensa =  sevensa+1;
                }
                if ( sevensa == 60){
                    sevensa = 0;
                    sevensb =  sevensb+1;
                }
                if ( sevensb == 60){
                    sevensb = 0;
                    sevensc =  sevensc+1;
                }
                if ( sevensc == 60){
                    sevensc = 0;
                    sevensd =  sevensd+1;
                }
                if ( sevensd == 60){
                    sevensd = 0;
                    sevense =  sevense+1;
                }


                eight = eight + 5;
                if (eight == 27720){
                    eights++;
                    eight = 0;
                }
                if ( eights == 60){
                    eights = 0;
                    eightsa =  eightsa+1;
                }
                if ( eightsa == 60){
                    eightsa = 0;
                    eightsb =  eightsb+1;
                }
                if ( eightsb == 60){
                    eightsb = 0;
                    eightsc =  eightsc+1;
                }
                if ( eightsc == 60){
                    eightsc = 0;
                    eightsd =  eightsd+1;
                }
                if ( eightsd == 60){
                    eightsd = 0;
                    eightse =  eightse+1;
                }

                nine = nine + 4;
                if (nine == 27720){
                    nines++;
                    nine = 0;
                }
                if ( nines == 60){
                    nines = 0;
                    ninesa =  ninesa+1;
                }
                if ( ninesa == 60){
                    ninesa = 0;
                    ninesb =  ninesb+1;
                }
                if ( ninesb == 60){
                    ninesb = 0;
                    ninesc =  ninesc+1;
                }
                if ( ninesc == 60){
                    ninesc = 0;
                    ninesd =  ninesd+1;
                }
                if ( ninesd == 60){
                    ninesd = 0;
                    ninese =  ninese+1;
                }

                ten = ten + 3;
                if (ten == 27720){
                    tens++;
                    ten = 0;
                }
                if ( tens == 60){
                    tens = 0;
                    tensa =  tensa+1;
                }
                if ( tensa == 60){
                    tensa = 0;
                    tensb =  tensb+1;
                }
                if ( tensb == 60){
                    tensb = 0;
                    tensc =  tensc+1;
                }
                if ( tensc == 60){
                    tensc = 0;
                    tensd =  tensd+1;
                }
                if ( tensd == 60){
                    tensd = 0;
                    tense =  tense+1;
                }

                eleven = eleven + 2;
                if (eleven == 27720){
                    elevens++;
                    eleven = 0;
                }
                if ( elevens == 60){
                    elevens = 0;
                    elevensa =  elevensa+1;
                }
                if ( elevensa == 60){
                    elevensa = 0;
                    elevensb =  elevensb+1;
                }
                if ( elevensb == 60){
                    elevensb = 0;
                    elevensc =  elevensc+1;
                }
                if ( elevensc == 60){
                    elevensc = 0;
                    elevensd =  elevensd+1;
                }
                if ( elevensd == 60){
                    elevensd = 0;
                    elevense =  elevense+1;
                }

                twelve = twelve + 1;
                if (twelve == 27720){
                    twelves++;
                    twelve = 0;
                }
                if (twelves == 60){
                    twelves = 0;
                    twelvesa = twelvesa+1;
                }
                if (twelvesa == 60){
                    twelvesa = 0;
                    twelvesb = twelvesb+1;
                }
                if (twelvesb == 60){
                    twelvesb = 0;
                    twelvesc = twelvesc+1;
                }
                if (twelvesc == 60){
                    twelvesc = 0;
                    twelvesd = twelvesd+1;
                }
                if (twelvesd == 60){
                    twelvesd = 0;
                    twelvese = twelvese+1;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                        i12.setImageResource(imagos[twelves]);
                        i12a.setImageResource(imagos[twelvesa]);
                        i12b.setImageResource(imagos[twelvesb]);
                        i12c.setImageResource(imagos[twelvesc]);
                        i12d.setImageResource(imagos[twelvesd]);
                        i12e.setImageResource(imagos[twelvese%60]);

                        i11.setImageResource(imagos[ elevens]);
                        i11a.setImageResource(imagos[ elevensa]);
                        i11b.setImageResource(imagos[ elevensb]);
                        i11c.setImageResource(imagos[ elevensc]);
                        i11d.setImageResource(imagos[ elevensd]);
                        i11e.setImageResource(imagos[ elevense%60]);


                        i10.setImageResource(imagos[ tens]);
                        i10a.setImageResource(imagos[ tensa]);
                        i10b.setImageResource(imagos[ tensb]);
                        i10c.setImageResource(imagos[ tensc]);
                        i10d.setImageResource(imagos[ tensd]);
                        i10e.setImageResource(imagos[ tense%60]);


                        i9.setImageResource(imagos[ nines]);
                        i9a.setImageResource(imagos[ ninesa]);
                        i9b.setImageResource(imagos[ ninesb]);
                        i9c.setImageResource(imagos[ ninesc]);
                        i9d.setImageResource(imagos[ ninesd]);
                        i9e.setImageResource(imagos[ ninese%60]);

                        i8.setImageResource(imagos[ eights]);
                        i8a.setImageResource(imagos[ eightsa]);
                        i8b.setImageResource(imagos[ eightsb]);
                        i8c.setImageResource(imagos[ eightsc]);
                        i8d.setImageResource(imagos[ eightsd]);
                        i8e.setImageResource(imagos[ eightse%60]);


                        i7.setImageResource(imagos[ sevens]);
                        i7a.setImageResource(imagos[ sevensa]);
                        i7b.setImageResource(imagos[ sevensb]);
                        i7c.setImageResource(imagos[ sevensc]);
                        i7d.setImageResource(imagos[ sevensd]);
                        i7e.setImageResource(imagos[ sevense%60]);


                        i6.setImageResource(imagos[ sixes]);
                        i6a.setImageResource(imagos[ sixesa]);
                        i6b.setImageResource(imagos[ sixesb]);
                        i6c.setImageResource(imagos[ sixesc]);
                        i6d.setImageResource(imagos[ sixesd]);
                        i6e.setImageResource(imagos[ sixese%60]);


                        i5.setImageResource(imagos[ fives]);
                        i5a.setImageResource(imagos[ fivesa]);
                        i5b.setImageResource(imagos[ fivesb]);
                        i5c.setImageResource(imagos[ fivesc]);
                        i5d.setImageResource(imagos[ fivesd]);
                        i5e.setImageResource(imagos[ fivese%60]);


                        i4.setImageResource(imagos[ fours]);
                        i4a.setImageResource(imagos[ foursa]);
                        i4b.setImageResource(imagos[ foursb]);
                        i4c.setImageResource(imagos[ foursc]);
                        i4d.setImageResource(imagos[ foursd]);
                        i4e.setImageResource(imagos[ fourse%60]);


                        i3.setImageResource(imagos[ threes]);
                        i3a.setImageResource(imagos[ threesa]);
                        i3b.setImageResource(imagos[ threesb]);
                        i3c.setImageResource(imagos[ threesc]);
                        i3d.setImageResource(imagos[ threesd]);
                        i3e.setImageResource(imagos[ threese%60]);


                        i2.setImageResource(imagos[ twos]);
                        i2a.setImageResource(imagos[ twosa]);
                        i2b.setImageResource(imagos[ twosb]);
                        i2c.setImageResource(imagos[ twosc]);
                        i2d.setImageResource(imagos[ twosd]);
                        i2e.setImageResource(imagos[ twose%60]);


                        i1.setImageResource(imagos[ wholes]);
                        i1a.setImageResource(imagos[ wholesa]);
                        i1b.setImageResource(imagos[ wholesb]);
                        i1c.setImageResource(imagos[ wholesc]);
                        i1d.setImageResource(imagos[ wholesd]);
                        i1e.setImageResource(imagos[ wholese%60]);
                    }
                });
            }
        }, 0, (10));

        /*
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/11), (27720/11));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/10), (27720/10));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/9), (27720/9));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/8), (27720/8));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/7), (27720/7));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/6), (27720/6));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

           
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/5), (27720/5));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/4), (27720/4));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

              
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/3), (27720/3));
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/2), (27720/2));


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                
                runOnUiThread(new Runnable() {
                    @Override
                    public void run () {
                    }
                });
            }
        }, (27720/1), (27720/1));


*/
    }
}
