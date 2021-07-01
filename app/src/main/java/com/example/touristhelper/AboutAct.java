package com.example.touristhelper;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutAct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { //открытие окна с правилами игры, при нажатии на кнопку About.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity); //отображение окна с информацией о приложении
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//сохранение вертикальной ориентации окна
    }
}
