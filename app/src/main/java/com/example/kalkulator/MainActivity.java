package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Operator operator = Operator.NONE;

    double br1 = 0;
    double br2 = 0;
    boolean zbrajanje, oduzimanje, dijeljenje, mnozenje, modul;
    boolean dec;

    double chooseNumber;
    double chooseSecond;
    double result;

    TextView rezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izgled);


        rezultat = (TextView) findViewById(R.id.rezultat);
        rezultat.setText("0");

        Button ac = (Button) findViewById(R.id.ac);
        Button brisi = (Button) findViewById(R.id.brisi);
        Button posto = (Button) findViewById(R.id.posto);
        Button podijeli = (Button) findViewById(R.id.podijeli);
        Button sedam = (Button) findViewById(R.id.sedam);
        Button osam = (Button) findViewById(R.id.osam);
        Button devet = (Button) findViewById(R.id.devet);
        Button pomnozi = (Button) findViewById(R.id.pomnozi);
        Button cetiri = (Button) findViewById(R.id.cetiri);
        Button pet = (Button) findViewById(R.id.pet);
        Button sest = (Button) findViewById(R.id.sest);
        Button oduzmi = (Button) findViewById(R.id.oduzmi);
        Button jedan = (Button) findViewById(R.id.jedan);
        Button dva = (Button) findViewById(R.id.dva);
        Button tri = (Button) findViewById(R.id.tri);
        Button zbroji = (Button) findViewById(R.id.zbroji);
        Button nula = (Button) findViewById(R.id.nula);
        Button tocka = (Button) findViewById(R.id.tocka);
        Button jednako = (Button) findViewById(R.id.jednako);


        jedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zbroji.setBackgroundColor(Color.parseColor("#ff8c00"));
                zbroji.setTextColor(Color.WHITE);
                if (operator!=Operator.NONE) {
                    chooseSecond=1;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=1;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "2");
            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "3");
            }
        });

        cetiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "4");
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "5");
            }
        });

        sest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "6");
            }
        });

        sedam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "7");
            }
        });

        osam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "8");
            }
        });

        devet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "9");
            }
        });

        nula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rezultat.setText(rezultat.getText() + "0");
            }
        });

        zbroji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zbroji.setBackgroundColor(Color.WHITE);
                zbroji.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.ZBROJI;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                }
            }
        });

        oduzmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rezultat.getText().length() != 0) {
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    oduzimanje = true;
                    dec = false;
                    rezultat.setText("");

                }

            }
        });

        pomnozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rezultat.getText().length() != 0) {
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    mnozenje = true;
                    dec = false;
                    rezultat.setText(null);

                }

            }
        });

        podijeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rezultat.getText().length() != 0) {
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    dijeljenje = true;
                    dec = false;
                    rezultat.setText(null);

                }

            }
        });

        posto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rezultat.getText().length() != 0) {
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    modul = true;
                    dec = false;
                    rezultat.setText(null);
                }
            }
        });

        jednako.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                jednako.setBackgroundColor(Color.WHITE);
                jednako.setTextColor(Color.parseColor("#ff8c00"));
                double res = calculate(chooseNumber,chooseSecond,operator);
                chooseNumber=res;
                rezultat.setText(String.valueOf(res));
                operator=Operator.NONE;
                jednako.setBackgroundColor(Color.parseColor("#ff8c00"));
                jednako.setTextColor(Color.WHITE);
            }









//                if (zbrajanje || oduzimanje || mnozenje || dijeljenje || modul) {
//                    br2 = Float.parseFloat(rezultat.getText() + "");
//                }
//                if (zbrajanje) {
//                    rezultat.setText(br1 + br2 + "");
//                    zbrajanje = false;
//                }
//
//                if (oduzimanje) {
//                    rezultat.setText(br1 - br2 + "");
//                    oduzimanje = false;
//                }
//
//                if (mnozenje) {
//                    rezultat.setText(br1 * br2 + "");
//                    mnozenje = false;
//                }
//
//                if (dijeljenje) {
//                    rezultat.setText(br1 / br2 + "");
//                    dijeljenje = false;
//                }
//                if (modul) {
//                    rezultat.setText(br1 % br2 + "");
//                    modul = false;
//                }
//            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rezultat.setText("");
                br1 = 0.0;
                br2 = 0.0;
            }
        });

        tocka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dec) {

                } else {
                    rezultat.setText(rezultat.getText() + ".");
                    dec = true;
                }

            }


        })
        ;
    }

    private double calculate(double x, double y, Operator op) {
        double res = 0;
        if (op == Operator.ZBROJI) {
            res = x + y;
        }
        if (oduzimanje) {
            res = x - y;
            oduzimanje = false;
        }

        if (mnozenje) {
            res = x * y;
            mnozenje = false;
        }

        if (dijeljenje) {
            res = x / y;
            dijeljenje = false;
        }
        if (modul) {
            res = x % y;
            modul = false;
        }
        return res;
    }

}


