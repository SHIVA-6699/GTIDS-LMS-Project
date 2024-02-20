package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.security.cert.Certificate;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    int hour=0;
    int min=0;

    int sec=0;
  static   int i=0;
    int hour1=0;
    int min1=0;

    int sec1=0;

    int hour2=0;
    int min2=0;

    int sec2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button skill;
        Button domain;
        Button certification;

        Intent i = getIntent();

        skill = findViewById(R.id.skill);
        domain = findViewById(R.id.domain);
        certification = findViewById(R.id.certification);

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), skill.class);
                startActivity(i);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int j=0;
                        try {
                            while (j<10) {

                                TimeUnit.SECONDS.sleep(1);
                                updateText3();
                                j++;

                            }


                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

        domain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), domain.class);
                startActivity(i);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int j=0;
                        try {
                            while (j<3) {

                                TimeUnit.SECONDS.sleep(1);
                                updateText2();
                                j++;
                            }


                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

        certification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), certificate.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Certificate Time  Started:" , Toast.LENGTH_SHORT).show();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int i=0;

                        try {
                            while (i<10) {

                                TimeUnit.SECONDS.sleep(1);
                                updateText1();


                            }


                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });


//        domain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
    public void updateText1() {


            runOnUiThread(new Runnable() {

                @Override
                public void run() {

                    String str;

                    if (sec < 60) {

                        sec++;
                    }
                    if (sec == 59) {
                        min++;
                        sec = 0;
                    }
                    if (min > 59) {
                        hour++;
                        min = 0;
                        sec = 0;
                    }
                    str=hour+":"+min+":"+sec;
                    System.out.println(str);






                }
            });

    }



    public void updateText2() {


        runOnUiThread(new Runnable() {

            @Override
            public void run() {

                String str;

                if (sec1 < 60) {

                    sec1++;
                }
                if (sec1 == 59) {
                    min1++;
                    sec1 = 0;
                }
                if (min1 > 59) {
                    hour1++;
                    min1 = 0;
                    sec1 = 0;
                }
                str = Integer.toString(hour1) + ":" + Integer.toString(min1) + ":" + Integer.toString(sec1);
                Toast.makeText(MainActivity.this, "Domain Time :"+str, Toast.LENGTH_SHORT).show();


            }
        });
    }



    public void updateText3() {


        runOnUiThread(new Runnable() {

            @Override
            public void run() {

                String str;

                if (sec2 < 60) {

                    sec2++;
                }
                if (sec2 == 59) {
                    min2++;
                    sec2 = 0;
                }
                if (min2 > 59) {
                    hour2++;
                    min2 = 0;
                    sec2 = 0;
                }
                str = Integer.toString(hour2) + ":" + Integer.toString(min2) + ":" + Integer.toString(sec2);
                Toast.makeText(MainActivity.this, "Skill Time :"+str, Toast.LENGTH_SHORT).show();


            }
        });
    }
}