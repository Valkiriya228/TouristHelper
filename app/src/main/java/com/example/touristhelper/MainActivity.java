package com.example.touristhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu); //метод отображения главного окна
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //сохранение вертикальной ориентации окна
    }

    public void startApp(View v){ //метод-обработчик кнопки "Старт"
        Intent startAct = new Intent(MainActivity.this, startActivity.class); //при нажатии переход к классу startActivity
        startActivity(startAct);
    }
   public void aboutInfo(View v){ //метод-обработчик кнопки "О приложении"
       Intent aboutInfo = new Intent(MainActivity.this, AboutAct.class); //при нажатии переход к классу AboutAct
       startActivity(aboutInfo);
   }
    public void closeApp(View v){ //метод-обработчик кнопки "Закрыть"
        moveTaskToBack(true); //по нажатию на кнопку приложение закрывается
        finish();
        System.exit(0);
    }
}