package com.example.appanim;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button frameButton = findViewById(R.id.frameButton);
        Button tweenButton = findViewById(R.id.tweenButton);

        Animation buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.button_animation2);


        frameButton.startAnimation(buttonAnimation);
        tweenButton.startAnimation(buttonAnimation);
        frameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class); // Замените на вашу FrameAnimActivity
                startActivity(intent);
            }
        });

        tweenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class); // Замените на вашу TweenAnimActivity
                startActivity(intent);
            }
        });
    }


}