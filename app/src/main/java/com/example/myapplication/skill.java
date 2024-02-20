package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class skill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill);

        Intent i = getIntent();

        Button btn;
        btn = findViewById(R.id.courseware);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://courseware.cutm.ac.in/categories-courses/skill-courses/"));
                startActivity(i);
            }
        });

        Button btn1;
        btn1 = findViewById(R.id.adobe);
        btn1.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on ADOBE TOOLS AND ILLUSTRATIONS: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on ADOBE TOOLS AND ILLUSTRATIONS: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/adobe-tools-and-illustrations-2/"));
                startActivity(i);
            }
        });

        Button btn2;
        btn2 = findViewById(R.id.adv_geo);
        btn2.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Advanced Geographic Information System: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Advanced Geographic Information System: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/advanced-geographic-information-system-gis/"));
                startActivity(i);
            }
        });

        Button btn3;
        btn3 = findViewById(R.id.cnc);
        btn3.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on CNC Programming and CNC Machining: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on CNC Programming and CNC Machining: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/cnc-programming-and-cnc-machining/"));
                startActivity(i);
            }
        });

        Button btn4;
        btn4 = findViewById(R.id.dtp);

        btn4.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Desktop Publishing: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Desktop Publishing: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/digital-publishing-2/"));
                startActivity(i);
            }
        });

        Button btn5;
        btn5 = findViewById(R.id.ev);

        btn5.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on E-Vehicle Assembly and Service Technology: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on E-Vehicle Assembly and Service Technology: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/e-vehicle-assembly-and-service-technology-2/"));
                startActivity(i);
            }
        });

        Button btn6;
        btn6 = findViewById(R.id.nlp);

        btn6.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Introduction to NLP: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Introduction to NLP: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/30377/"));
                startActivity(i);
            }
        });

        Button btn7;
        btn7 = findViewById(R.id.quant);

        btn7.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Introduction to Quantum Computing: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Introduction to Quantum Computing: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/introduction-to-quantum-computing/"));
                startActivity(i);
            }
        });

        Button btn8;
        btn8 = findViewById(R.id.laser);

        btn8.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Laser modelling using principles of Design Thinking: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Laser modelling using principles of Design Thinking: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/laser-modelling-using-principles-of-design-thinking/"));
                startActivity(i);
            }
        });

        Button btn9;
        btn9 = findViewById(R.id.hydroponics);

        btn9.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Hydroponics Technician: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Hydroponics Technician: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/hydroponics-technician/"));
                startActivity(i);
            }
        });

        Button btn10;
        btn10 = findViewById(R.id.cad);

        btn10.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Computer Aided Drafting: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Computer Aided Drafting: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-computer-aided-drafting/"));
                startActivity(i);
            }
        });

        Button btn11;
        btn11 = findViewById(R.id.drone);

        btn11.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Drone Piloting: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Drone Piloting: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/dronepiloting/"));
                startActivity(i);
            }
        });

        Button btn12;
        btn12 = findViewById(R.id.bb);

        btn12.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on basketball: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on basketball: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-basket-ball/"));
                startActivity(i);
            }
        });

        Button btn13;
        btn13 = findViewById(R.id.fab);

        btn13.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Fabrication: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Fabrication: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-fabrication/"));
                startActivity(i);
            }
        });

        Button btn14;
        btn14 = findViewById(R.id.gda);

        btn14.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on General Duty Assistance: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on General Duty Assistance: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-general-duty-assistance/"));
                startActivity(i);
            }
        });

        Button btn15;
        btn15 = findViewById(R.id.gym);

        btn15.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Gym Instructor: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Gym Instructor: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-gym-instructor/"));
                startActivity(i);
            }
        });

        Button btn16;
        btn16 = findViewById(R.id.blockchain);

        btn16.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Introduction to Block Chain Technology: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Introduction to Block Chain Technology: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-block-chain-technology/"));
                startActivity(i);
            }
        });

        Button btn17;
        btn17 = findViewById(R.id.home);

        btn17.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Repair and Maintenance of Home Appliances: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Repair and Maintenance of Home Appliances: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/repair-and-maintenance-of-home-appliances/"));
                startActivity(i);
            }
        });

        Button btn18;
        btn18 = findViewById(R.id.motor);

        btn18.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Light Motor Vehicle Driving: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Light Motor Vehicle Driving: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-light-motor-vehicle-driving/"));
                startActivity(i);
            }
        });

        Button btn19;
        btn19 = findViewById(R.id.compbio);

        btn19.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Introduction to Computational Biology: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Introduction to Computational Biology: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-introduction-to-computational-biology/"));
                startActivity(i);
            }
        });

        Button btn20;
        btn20 = findViewById(R.id.solar);

        btn20.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Solar Lighting Technology: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Solar Lighting Technology: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-course-solar-lighting-technology/"));
                startActivity(i);
            }
        });

        Button btn21;
        btn21 = findViewById(R.id.ev_as);

        btn21.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on EV Assembly: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on EV Assembly: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-ev-assembly/"));
                startActivity(i);
            }
        });

        Button btn22;
        btn22 = findViewById(R.id.apparel);

        btn22.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Apparel Production and Marketing /IE: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Apparel Production and Marketing /IE: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-apparel-production-marketing-ie/"));
                startActivity(i);
            }
        });

        Button btn23;
        btn23 = findViewById(R.id.cim);

        btn23.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Computer Installation and Maintenance: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Computer Installation and Maintenance: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-computer-installation-maintenance/"));
                startActivity(i);
            }
        });

        Button btn24;
        btn24 = findViewById(R.id.welding);

        btn24.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Welding Fabrication: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Welding Fabrication: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-course-in-welding-fabrication/"));
                startActivity(i);
            }
        });

        Button btn25;
        btn25 = findViewById(R.id.rt);

        btn25.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Radiology Technician: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Radiology Technician: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-rdiology-technician/"));
                startActivity(i);
            }
        });

        Button btn26;
        btn26 = findViewById(R.id.ie);

        btn26.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Innovation and Entrepreneurship: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent Innovation and Entrepreneurship: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-innovation-and-entrepreneurship/"));
                startActivity(i);
            }
        });

        Button btn27;
        btn27 = findViewById(R.id.ot);

        btn27.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Operation Theatre Technology: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Operation Theatre Technology: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/30700/"));
                startActivity(i);
            }
        });

        Button btn28;
        btn28 = findViewById(R.id.fas);

        btn28.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on FIRST AID SERVICE: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on FIRST AID SERVICE: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-first-aid-service/"));
                startActivity(i);
            }
        });

        Button btn29;
        btn29 = findViewById(R.id.concrete);

        btn29.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Precast Concrete Manufacturing: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Precast Concrete Manufacturing: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/sfs-precast-concrete-manufacturing/"));
                startActivity(i);
            }
        });

        Button btn30;
        btn30 = findViewById(R.id.solid);

        btn30.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on solid Waste Management: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on solid Waste Management: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-solid-waste-management/"));
                startActivity(i);
            }
        });

        Button btn31;
        btn31 = findViewById(R.id.spectroscopy);

        btn31.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Spectroscopy for Analysis of Natural and Synthetic Compound: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Spectroscopy for Analysis of Natural and Synthetic Compound: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/spectroscopy-for-analysis-of-natural-and-synthetic-compounds/"));
                startActivity(i);
            }
        });

        Button btn32;
        btn32 = findViewById(R.id.web);

        btn32.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Web Content Development:  "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Web Content Development: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/web-content-development-mamc/"));
                startActivity(i);
            }
        });

        Button btn33;
        btn33 = findViewById(R.id.yoga);

        btn33.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on Yoga and Meditation: "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on Yoga and Meditation: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/yoga-and-meditation/"));
                startActivity(i);
            }
        });

        Button btn34;
        btn34 = findViewById(R.id.xray);

        btn34.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            long startTime = System.currentTimeMillis();
            long difference = System.currentTimeMillis() - startTime;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                count ++;
                Toast.makeText(skill.this, "Clicked on X-Ray Technician:  "+count, Toast.LENGTH_LONG).show();
                Toast.makeText(skill.this, "Time spent on X-Ray Technician: "+difference/1000+" sec", Toast.LENGTH_SHORT).show();
                i.setData(Uri.parse("https://courseware.cutm.ac.in/courses/skill-x-ray-technician-2/"));
                startActivity(i);
            }
        });

    }
}