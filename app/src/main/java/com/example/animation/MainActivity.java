package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    TextView t1;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1=findViewById(R.id.button);
        bn2=findViewById(R.id.button2);
        bn3=findViewById(R.id.button3);
        bn4=findViewById(R.id.button4);
        bn5=findViewById(R.id.button6);
        bn6=findViewById(R.id.button5);
        bn7=findViewById(R.id.button7);

        t1=findViewById(R.id.textView);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn2.setClickable(false);
                bn3.setClickable(false);
                bn4.setClickable(false);
                bn5.setClickable(false);
                bn6.setClickable(false);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn1.setClickable(false);
                bn3.setClickable(false);
                bn4.setClickable(false);
                bn5.setClickable(false);
                bn6.setClickable(false);
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn1.setClickable(false);
                bn2.setClickable(false);
                bn4.setClickable(false);
                bn5.setClickable(false);
                bn6.setClickable(false);
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn1.setClickable(false);
                bn2.setClickable(false);
                bn3.setClickable(false);
                bn5.setClickable(false);
                bn6.setClickable(false);
            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn1.setClickable(false);
                bn2.setClickable(false);
                bn3.setClickable(false);
                bn4.setClickable(false);
                bn6.setClickable(false);
            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_right);
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(animation);
                bn1.setClickable(false);
                bn2.setClickable(false);
                bn3.setClickable(false);
                bn4.setClickable(false);
                bn5.setClickable(false);
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bn1.setClickable(true);
                bn2.setClickable(true);
                bn3.setClickable(true);
                bn4.setClickable(true);
                bn5.setClickable(true);
            }
        });

    }
}