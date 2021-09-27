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
    boolean dec=false;
    boolean jednakob=false;
    String t;
    String chooseNumber ="";
    String chooseSecond ="";
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
                    prvi();
                        if (operator!=Operator.NONE) {
                        chooseSecond=chooseSecond + "1";
                            rezultat.setText(String.valueOf(chooseSecond));

                        }else {
                            if(jednakob){
                                jednakob=false;
                                chooseNumber="";
                            }
                            chooseNumber=chooseNumber + "1";
                            rezultat.setText(String.valueOf(chooseNumber));
                        }
            }
        });

        dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                drugi();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"2";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"2";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                treci();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"3";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"3";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        cetiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                cetvrti();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"4";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"4";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                peti();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"5";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"5";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        sest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                sesti();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"6";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"6";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        sedam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                sedmi();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"7";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"7";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        osam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                osmi();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"8";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"8";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        devet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                deveti();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"9";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"9";
                    rezultat.setText(String.valueOf(chooseNumber));
                }
            }
        });

        nula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boja();
                nulti();
                if (operator!=Operator.NONE) {
                    chooseSecond=chooseSecond+"0";
                    rezultat.setText(String.valueOf(chooseSecond));
                }else {
                    if(jednakob){
                        jednakob=false;
                        chooseNumber="";
                    }
                    chooseNumber=chooseNumber+"0";
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
                if(operator!=Operator.NONE){
                    if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()){
                        double res = calculate(Double.parseDouble(chooseNumber),Double.parseDouble(chooseSecond),operator);
                        chooseNumber=String.valueOf(res);
                        chooseSecond="";
                        rezultat.setText(String.valueOf(res));
                        operator=Operator.ZBROJI;

                    }
                }else{

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
                if(operator!=Operator.NONE){
                    if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()) {
                        double res = calculate(Double.parseDouble(chooseNumber), Double.parseDouble(chooseSecond), operator);
                        chooseNumber = String.valueOf(res);
                        chooseSecond = "";
                        rezultat.setText(String.valueOf(res));
                        operator = Operator.ODUZMI;
                    }
                }else{

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
                if(operator!=Operator.NONE){
                    if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()) {
                        double res = calculate(Double.parseDouble(chooseNumber), Double.parseDouble(chooseSecond), operator);
                        chooseNumber = String.valueOf(res);
                        chooseSecond = "";
                        rezultat.setText(String.valueOf(res));
                        operator = Operator.MNOZI;
                    }
                }else{
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
                if(operator!=Operator.NONE){
                    if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()) {
                        double res = calculate(Double.parseDouble(chooseNumber), Double.parseDouble(chooseSecond), operator);
                        chooseNumber = String.valueOf(res);
                        chooseSecond = "";
                        rezultat.setText(String.valueOf(res));
                        operator = Operator.DIJELI;
                    }
                }else{

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
                if(operator!=Operator.NONE){
                    if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()) {
                        double res = calculate(Double.parseDouble(chooseNumber), Double.parseDouble(chooseSecond), operator);
                        chooseNumber = String.valueOf(res);
                        chooseSecond = "";
                        rezultat.setText(String.valueOf(res));
                        operator = Operator.MODUL;
                    }
                }else{

                    operator=Operator.MODUL;
                }
            }
        });

        jednako.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                jednako.setBackgroundColor(Color.WHITE);
                jednako.setTextColor(Color.parseColor("#ff8c00"));
                jednakob=true;
                if(!chooseNumber.isEmpty()&&!chooseSecond.isEmpty()) {
                    double res = calculate(Double.parseDouble(chooseNumber), Double.parseDouble(chooseSecond), operator);
                    chooseNumber = String.valueOf(res);
                    chooseSecond = "";
                    if (res % 1 == 0) {
                        rezultat.setText(String.valueOf((int) res));
                    } else {
                        rezultat.setText(String.valueOf(res));
                    }
                }


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
                rezultat.setText("0");
                chooseNumber = "";
                chooseSecond = "";
            }
        });

        brisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boja();
                del();
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
                toc();
                if (!dec) {

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


    public void prvi(){
        Button jedan = (Button) findViewById(R.id.jedan);
        jedan.setBackgroundColor(Color.WHITE);
        jedan.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                jedan.setBackgroundColor(Color.parseColor("#D3D3D3"));
                jedan.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void drugi(){
        Button dva = (Button) findViewById(R.id.dva);
        dva.setBackgroundColor(Color.WHITE);
        dva.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                dva.setBackgroundColor(Color.parseColor("#D3D3D3"));
                dva.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void treci(){
        Button tri = (Button) findViewById(R.id.tri);
        tri.setBackgroundColor(Color.WHITE);
        tri.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tri.setBackgroundColor(Color.parseColor("#D3D3D3"));
                tri.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void cetvrti(){
        Button cetiri = (Button) findViewById(R.id.cetiri);
        cetiri.setBackgroundColor(Color.WHITE);
        cetiri.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cetiri.setBackgroundColor(Color.parseColor("#D3D3D3"));
                cetiri.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void peti(){
        Button pet = (Button) findViewById(R.id.pet);
        pet.setBackgroundColor(Color.WHITE);
        pet.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pet.setBackgroundColor(Color.parseColor("#D3D3D3"));
                pet.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void sesti(){
        Button sest = (Button) findViewById(R.id.sest);
        sest.setBackgroundColor(Color.WHITE);
        sest.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sest.setBackgroundColor(Color.parseColor("#D3D3D3"));
                sest.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void sedmi(){
        Button sedam = (Button) findViewById(R.id.sedam);
        sedam.setBackgroundColor(Color.WHITE);
        sedam.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                sedam.setBackgroundColor(Color.parseColor("#D3D3D3"));
                sedam.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void osmi(){
        Button osam = (Button) findViewById(R.id.osam);
        osam.setBackgroundColor(Color.WHITE);
        osam.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                osam.setBackgroundColor(Color.parseColor("#D3D3D3"));
                osam.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void deveti(){
        Button devet = (Button) findViewById(R.id.devet);
        devet.setBackgroundColor(Color.WHITE);
        devet.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                devet.setBackgroundColor(Color.parseColor("#D3D3D3"));
                devet.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void nulti(){
        Button nula = (Button) findViewById(R.id.nula);
        nula.setBackgroundColor(Color.WHITE);
        nula.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nula.setBackgroundColor(Color.parseColor("#D3D3D3"));
                nula.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void del(){
        Button brisi = (Button) findViewById(R.id.brisi);
        brisi.setBackgroundColor(Color.WHITE);
        brisi.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                brisi.setBackgroundColor(Color.parseColor("#808080"));
                brisi.setTextColor(Color.BLACK);
            }
        }, 300);
    }

    public void toc(){
        Button tocka = (Button) findViewById(R.id.tocka);
        tocka.setBackgroundColor(Color.WHITE);
        tocka.setTextColor(Color.parseColor("#ff8c00"));
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tocka.setBackgroundColor(Color.parseColor("#D3D3D3"));
                tocka.setTextColor(Color.BLACK);
            }
        }, 300);
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


