package com.example.appanim;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationIV = findViewById(R.id.frame_anim_iv);
        startBtn = findViewById(R.id.start_frame);
        pauseBtn = findViewById(R.id.pause_frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        // Загружаем анимацию для кнопок
        Animation buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.button_anim);

        // Запускаем анимацию кнопок при создании Activity
        startBtn.startAnimation(buttonAnimation);
        pauseBtn.startAnimation(buttonAnimation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();

            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.stop();

            }
        });
    }
}