package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Operator operator = Operator.NONE;
    final Handler handler = new Handler();
    double br1 = 0;
    double br2 = 0;
    boolean zbrajanje, oduzimanje, dijeljenje, mnozenje, modul;
    boolean dec;
    String t;
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
                    boja();
                    dec = false;
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
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=2;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=2;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=3;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=3;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        cetiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=4;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=4;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=5;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=5;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        sest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=6;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=6;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        sedam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=7;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=7;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        osam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=8;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=8;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        devet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=9;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=9;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        nula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                dec = false;
                if (operator!=Operator.NONE) {
                    chooseSecond=0;
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    chooseNumber=0;
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        zbroji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                zbroji.setBackgroundColor(Color.WHITE);
                zbroji.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.ZBROJI;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                    operator=Operator.ZBROJI;

                }
            }
        });

        oduzmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                oduzmi.setBackgroundColor(Color.WHITE);
                oduzmi.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.ODUZMI;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                    operator=Operator.ODUZMI;
                }

            }
        });

        pomnozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                pomnozi.setBackgroundColor(Color.WHITE);
                pomnozi.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.MNOZI;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                    operator=Operator.MNOZI;
                }

            }
        });

        podijeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                podijeli.setBackgroundColor(Color.WHITE);
                podijeli.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.DIJELI;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                    operator=Operator.DIJELI;
                }

            }
        });

        posto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boja();
                posto.setBackgroundColor(Color.WHITE);
                posto.setTextColor(Color.parseColor("#ff8c00"));
                if(operator==Operator.NONE){
                    operator=Operator.MODUL;
                }else{
                    double res = calculate(chooseNumber,chooseSecond,operator);
                    chooseNumber=res;
                    rezultat.setText(String.valueOf(res));
                    operator=Operator.MODUL;
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

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        jednako.setBackgroundColor(Color.parseColor("#ff8c00"));
                        jednako.setTextColor(Color.WHITE);
                    }
                }, 300);


            }

        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boja();
                rezultat.setText("");
                chooseNumber = 0;
                chooseSecond = 0;
            }
        });

        brisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boja();
                t = (String) rezultat.getText();

                if (t.isEmpty()){
                    rezultat.setText("0");
                } else {
                    rezultat.setText(t.substring(0, t.length() - 1));
                }
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


        });

    }

    public void boja(){
        Button posto = (Button) findViewById(R.id.posto);
        Button podijeli = (Button) findViewById(R.id.podijeli);
        Button pomnozi = (Button) findViewById(R.id.pomnozi);
        Button oduzmi = (Button) findViewById(R.id.oduzmi);
        Button zbroji = (Button) findViewById(R.id.zbroji);


        zbroji.setBackgroundColor(Color.parseColor("#ff8c00"));
        zbroji.setTextColor(Color.WHITE);
        oduzmi.setBackgroundColor(Color.parseColor("#ff8c00"));
        oduzmi.setTextColor(Color.WHITE);
        posto.setBackgroundColor(Color.parseColor("#808080"));
        posto.setTextColor(Color.BLACK);
        pomnozi.setBackgroundColor(Color.parseColor("#ff8c00"));
        pomnozi.setTextColor(Color.WHITE);
        podijeli.setBackgroundColor(Color.parseColor("#ff8c00"));
        podijeli.setTextColor(Color.WHITE);


    }








    private double calculate(double x, double y, Operator op) {
        double res = 0;
        if (op == Operator.ZBROJI) {
            res = x + y;
        }
        if (op == Operator.ODUZMI) {
            res = x - y;
        }

        if (op == Operator.MNOZI) {
            res = x * y;
        }

        if (op == Operator.DIJELI) {
            res = x / y;
        }
        if (op == Operator.MODUL) {
            res = x % y;
        }
        return res;
    }

}


