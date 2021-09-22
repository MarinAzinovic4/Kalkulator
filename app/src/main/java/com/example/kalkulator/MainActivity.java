package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double br1 = 0;
    double br2 = 0;
    boolean zbrajanje,oduzimanje,dijeljenje,mnozenje;
    boolean dec,ostatak;
    TextView rezultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izgled);


        rezultat = (TextView) findViewById(R.id.rezultat);

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
                rezultat.setText(rezultat.getText() + "1");
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
                if(rezultat.getText().length()!=0){
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    zbrajanje=true;
                    dec = false;
                    rezultat.setText(null);

                }

            }
        });

        oduzmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rezultat.getText().length()!=0){
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    oduzimanje=true;
                    dec = false;
                    rezultat.setText(null);

                }

            }
        });

        pomnozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rezultat.getText().length()!=0){
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    mnozenje=true;
                    dec = false;
                    rezultat.setText(null);

                }

            }
        });

        podijeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rezultat.getText().length()!=0){
                    br1 = Float.parseFloat(rezultat.getText() + "");
                    dijeljenje=true;
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
                    ostatak = true;
                    dec = false;
                    rezultat.setText(null);
                }
            }
        });

        jednako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zbrajanje || oduzimanje || mnozenje || dijeljenje || ostatak){
                    br2 = Float.parseFloat(rezultat.getText() + "");
                }
                if (zbrajanje){
                    rezultat.setText(br1 + br2 + "");
                    zbrajanje = false;
                }

                if (oduzimanje){
                    rezultat.setText(br1 - br2 + "");
                    oduzimanje = false;
                }

                if (mnozenje){
                    rezultat.setText(br1 * br2 + "");
                    mnozenje = false;
                }

                if (dijeljenje){
                    rezultat.setText(br1 / br2 + "");
                    dijeljenje = false;
                }
                if(ostatak){
                    rezultat.setText(br1 % br2 +"");
                    ostatak=false;
                }
            }
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
    ;}
}