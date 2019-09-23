package ditzler.cole.stableapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NarcSixties extends AppCompatActivity {

    String notechar = "";
    TextView AView;
    Button AButton;
    String Eggstring = "";
    String Eggstrings = "%.0f,";
    String Eggstringss = "%s,";
    double HappinessCounter = 0;
    double currentvalue = 0;
    double HappinessCounteress = 0;
    int Magicalpowercounter = 2;
    int seriousbuisness;
    int needstobeeight;
    int lazybuisness;
    double Base = 211;
    double BaseTwo = Base*Base;
    double BaseThree = Base*Base*Base;
    double BaseFour = Base*Base*Base*Base;
    double BaseFive = Base*Base*Base*Base*Base;
    double BaseSix = Base*Base*Base*Base*Base*Base;
    int[] sanddancerset = new int[999999];

    private Integer imagos[] = {R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20, R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40, R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59};
    private Integer Emagos[] = {R.drawable.noerrorsmall, R.drawable.errorsmall,};

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happylayout);

        AView = (TextView) findViewById(R.id.TextViewA);

        AButton = (Button) findViewById(R.id.ButtonA);


        AButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AButton.setVisibility(View.INVISIBLE);

                for (Base = 1; Base < 101; Base++) {
                    BaseTwo = Base * Base;
                    BaseThree = Base * Base * Base;
                    BaseFour = Base * Base * Base * Base;
                    BaseFive = Base * Base * Base * Base * Base;
                    BaseSix = Base * Base * Base * Base * Base * Base;
                    Eggstring = String.format(Eggstring + "\n"+ Base + ": ");

                    for (HappinessCounter = 0; HappinessCounter < (3*BaseTwo); HappinessCounter++) {
                        seriousbuisness = 0;
                        currentvalue = 0;
                        lazybuisness = 0;
                        for (HappinessCounteress = 1; currentvalue != HappinessCounter && HappinessCounteress < 2; HappinessCounteress++) {


                            if (seriousbuisness == 0) {
                                double normalpeople;
                                normalpeople = HappinessCounter % Base;
                                double everyone;
                                everyone = (HappinessCounter % BaseTwo);
                                everyone = everyone / Base;
                                everyone = (int) Math.floor(everyone);
                                double assholes;

                                assholes = (HappinessCounter % BaseThree);
                                assholes = assholes / BaseTwo;
                                assholes = (int) Math.floor(assholes);
                                double idiots;

                                idiots = (HappinessCounter % BaseFour);
                                idiots = idiots / BaseThree;
                                idiots = (int) Math.floor(idiots);
                                double trumpvoters;

                                trumpvoters = (HappinessCounter % BaseFive);
                                trumpvoters = trumpvoters / BaseFour;
                                trumpvoters = (int) Math.floor(trumpvoters);
                                double winos;


                                winos = (HappinessCounter % (BaseSix));
                                winos = winos / BaseFive;
                                winos = (int) Math.floor(winos);


                                currentvalue = Math.pow(winos, Magicalpowercounter) + Math.pow(trumpvoters, Magicalpowercounter) + Math.pow(idiots, Magicalpowercounter) + Math.pow(assholes, Magicalpowercounter) + Math.pow(everyone, Magicalpowercounter) + Math.pow(normalpeople, Magicalpowercounter);
                                seriousbuisness = 1;
                                sanddancerset[(int) Math.round(HappinessCounteress)] = (int) Math.round(currentvalue);
                            } else {


                                double normalpeople;
                                normalpeople = currentvalue % Base;
                                double everyone;
                                everyone = (currentvalue % BaseTwo);
                                everyone = everyone / Base;
                                everyone = (int) Math.floor(everyone);
                                double assholes;

                                assholes = (currentvalue % BaseThree);
                                assholes = assholes / BaseTwo;
                                assholes = (int) Math.floor(assholes);
                                double idiots;

                                idiots = (currentvalue % BaseFour);
                                idiots = idiots / BaseThree;
                                idiots = (int) Math.floor(idiots);
                                double trumpvoters;

                                trumpvoters = (currentvalue % BaseFive);
                                trumpvoters = trumpvoters / BaseFour;
                                trumpvoters = (int) Math.floor(trumpvoters);
                                double winos;


                                winos = (HappinessCounter % (BaseSix));
                                winos = winos / BaseFive;
                                winos = (int) Math.floor(winos);

                                currentvalue = Math.pow(winos, Magicalpowercounter) + Math.pow(trumpvoters, Magicalpowercounter) + Math.pow(idiots, Magicalpowercounter) + Math.pow(assholes, Magicalpowercounter) + Math.pow(everyone, Magicalpowercounter) + Math.pow(normalpeople, Magicalpowercounter);
                                seriousbuisness = 1;
                                sanddancerset[(int) Math.round(HappinessCounteress)] = (int) Math.round(currentvalue);


                            }
/*
                            if (currentvalue == HappinessCounter && lazybuisness == 0){

                                int notedigit = (int) HappinessCounter % 7;
                                switch(notedigit){
                                    case 0:
                                        notechar = "A";
                                        break;
                                    case 1:
                                        notechar = "B";
                                        break;
                                    case 2:
                                        notechar = "C";
                                        break;
                                    case 3:
                                        notechar = "D";
                                        break;
                                    case 4:
                                        notechar = "E";
                                        break;
                                    case 5:
                                        notechar = "F";
                                        break;
                                    case 6:
                                        notechar = "G";
                                        break;
                                }


                                Eggstring = String.format(Eggstring + String.format(Eggstringss, notechar));
                                lazybuisness = 1;
                                needstobeeight = needstobeeight+1;
                            }
*/
                            if (currentvalue == HappinessCounter && lazybuisness == 0 && currentvalue != 1) {
                                Eggstring = String.format(Eggstring + String.format(Eggstrings, HappinessCounter));
                                lazybuisness = 1;
                                needstobeeight = needstobeeight + 1;
                            }

                            if (needstobeeight == 4) {
                             //   Eggstring = String.format(Eggstring + "\n");
                                needstobeeight = 0;
                            }
                        }
                    }
                }

AView.setText(Eggstring);
int cantlookback =0;
int cantlookbacka =0;
                /*
                int wherearethis;
                int kength = sanddancerset.length;
                for (wherearethis = 0; wherearethis < kength; wherearethis++) {
                    if (sanddancerset[wherearethis] == 1) {
                        AView.setText("Hit");
                        wherearethis = kength;
                        break;
                    } else {
                      //  String HolyCow = String.format((String.valueOf(wherearethis) +"," + String.valueOf(sanddancerset[wherearethis])));
                     //   AView.setText("Miss " + HolyCow);
                    }
                }*/
            }
        });

    }
}