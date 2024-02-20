package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class domain extends AppCompatActivity {
    Button btn;
    int hour=0;
    int min=0;
    int i=0;
    int sec=0;
    static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0, count13 = 0, count14 = 0, count15 = 0, count16 = 0, count17 = 0, count18 = 0, count19 = 0, count20 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domain);



//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            while (i<5) {
//
//                                TimeUnit.SECONDS.sleep(1);
//                                updateText();
//                                i++;
//                            }
//
//
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }).start();
//            }
//        });
    }

    public void scroll(View v) {

        ++count1;

        Toast.makeText(domain.this, "Clicks on Agribusiness:" + count1, Toast.LENGTH_LONG).show();

        gotoUrl("https://courseware.cutm.ac.in/courses/agri-business-management/");

    }

    public void scroll1(View v) {

        ++count2;

        Toast.makeText(domain.this, "Clicks on AR-VR:" + count2, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/introduction-to-ar-vr/");
    }

    public void scroll2(View v) {

        ++count3;

        Toast.makeText(domain.this, "Clicks on Automobile Engineering:" + count3, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/automobile-engineering/");
    }

    public void scroll3(View v) {

        ++count4;

        Toast.makeText(domain.this, "Clicks on Business Statistics:" + count4, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/business-statistics-2/");
    }

    public void scroll4(View v) {

        ++count5;

        Toast.makeText(domain.this, "Clicks on Cloud Computing:" + count5, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/cloud-technology/");
    }

    public void scroll5(View v) {

        ++count6;

        Toast.makeText(domain.this, "Clicks on CNC:" + count6, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/cnc-programming-and-cnc-machining/");
    }

    public void scroll6(View v) {

        ++count7;

        Toast.makeText(domain.this, "Clicks on Communication Systems:" + count7, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/communication-domain/");
    }

    public void scroll7(View v) {

        ++count8;

        Toast.makeText(domain.this, "Clicks on Computer Systems:" + count8, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/computer-system-architecture/");
    }

    public void scroll8(View v) {

        ++count9;

        Toast.makeText(domain.this, "Clicks on Cyber-Security:" + count9, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/domain-track-cyber-security/");
    }

    public void scroll9(View v) {

        ++count10;

        Toast.makeText(domain.this, "Clicks on Cyber With Forencics:" + count10, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/domain-track-cybersecurity-digital-forensics/");
    }

    public void scroll10(View v) {

        ++count11;

        Toast.makeText(domain.this, "Clicks on B2B:" + count11, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/marketing-domain-b2b-marketing/");
    }

    public void scroll11(View v) {

        ++count12;

        Toast.makeText(domain.this, "Clicks on Data Analytics:" + count12, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/introduction-to-data-analytics/");
    }

    public void scroll12(View v) {

        ++count13;

        Toast.makeText(domain.this, "Clicks on Data Science:" + count13, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/17927/");
    }

    public void scroll13(View v) {

        ++count14;

        Toast.makeText(domain.this, "Clicks on Digital Marketing:" + count14, Toast.LENGTH_LONG).show();
        gotoUrl("hhttps://courseware.cutm.ac.in/courses/marketing-domain-digital-marketing-and-marketing-communications/");
    }

    public void scroll14(View v) {

        ++count15;

        Toast.makeText(domain.this, "CLicks on Ecommerce:" + count15, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/e-commerce/");
    }

    public void scroll15(View v) {

        ++count16;

        Toast.makeText(domain.this, "Clicks on Electrography:" + count16, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/68328/");
    }

    public void scroll16(View v) {

        ++count17;

        Toast.makeText(domain.this, "Clicks on Embdded Systems:" + count17, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/2285/");
    }

    public void scroll17(View v) {

        ++count18;

        Toast.makeText(domain.this, "Clicks on Food Processing:" + count18, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/food-processing/");
    }

    public void scroll18(View v) {

        ++count19;

        Toast.makeText(domain.this, "Clicks on Internet Web:" + count19, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/internet-and-web-technology/");
    }

    public void scroll19(View v) {

        ++count20;

        Toast.makeText(domain.this, "CLicks on Job Readiness:" + count20, Toast.LENGTH_LONG).show();
        gotoUrl("https://courseware.cutm.ac.in/courses/25090/");
    }


    public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


//    public void updateText() {
//
//
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//
//                String str;
//
//                if (sec < 60) {
//
//                    sec++;
//                }
//                if (sec == 59) {
//                    min++;
//                    sec = 0;
//                }
//                if (min > 59) {
//                    hour++;
//                    min = 0;
//                    sec = 0;
//                }
//                str = Integer.toString(hour) + ":" + Integer.toString(min) + ":" + Integer.toString(sec);
//                Toast.makeText(domain.this, "Time :"+str, Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
//    }
}