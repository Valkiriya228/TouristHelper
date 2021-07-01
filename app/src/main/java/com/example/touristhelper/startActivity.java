package com.example.touristhelper;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class startActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) { //открытие окна с правилами игры, при нажатии на кнопку About.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_cells);//отображение окна с выбором категорий
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//сохранение вертикальной ориентации окна
        findViewsById();
    }
    public void back(View v){ //метод-обработчик кнопки "Назад" в окне с выбором категорий
        Intent back = new Intent(startActivity.this, MainActivity.class);
        startActivity(back);//при нажатии "назад" пользователь перейдет в главное меню
    }
    public void findViewsById(){ //метод который определяет каждой кнопке его id в рабочем окне
        View buttonFood = findViewById(R.id.food);
        buttonFood.setOnClickListener(this); //обработчик нажатия на кнопки
        View buttonMeeting = findViewById(R.id.findRoad);
        buttonMeeting.setOnClickListener(this);
        View buttonTour = findViewById(R.id.tour);
        buttonTour.setOnClickListener(this);
        View buttonHotel = findViewById(R.id.hotel);
        buttonHotel.setOnClickListener(this);
        View buttonHello = findViewById(R.id.hello);
        buttonHello.setOnClickListener(this);
        View buttonMoney = findViewById(R.id.money);
        buttonMoney.setOnClickListener(this);
        View buttonAirport = findViewById(R.id.airport);
        buttonAirport.setOnClickListener(this);
        View buttonHospital = findViewById(R.id.hospital);
        buttonHospital.setOnClickListener(this);
        View buttonTaxi = findViewById(R.id.taxi);
        buttonTaxi.setOnClickListener(this);
        View buttonShopping = findViewById(R.id.shopping);
        buttonShopping.setOnClickListener(this);
        View buttonBusTrain = findViewById(R.id.busTrain);
        buttonBusTrain.setOnClickListener(this);
    }
    public static int indOfCell; //переменная класса, которой мы присваиваем значение в зависимости от выбранной категории
    public void onClick(View view) { //метод-обработчик нажатия кнопок
        if (view.getId() == (R.id.food)) { indOfCell =  1; } //присваивание переменной значения при нажатии
        if (view.getId() == (R.id.findRoad)) {indOfCell =  4;}
        if (view.getId() == (R.id.tour)) {   indOfCell =  6; }
        if (view.getId() == (R.id.hotel)) {  indOfCell =  3; }
        if (view.getId() == (R.id.hello)) {  indOfCell =  2; }
        if (view.getId() == (R.id.money)) {  indOfCell =  5; }
        if (view.getId() == (R.id.taxi)) { indOfCell =  7; }
        if (view.getId() == (R.id.shopping)) {   indOfCell =  8; }
        if (view.getId() == (R.id.airport)) {  indOfCell =  9; }
        if (view.getId() == (R.id.hospital)) {  indOfCell =  10; }
        if (view.getId() == (R.id.busTrain)) {  indOfCell =  11; }
        Intent logicActivity = new Intent(this, LogicActivity.class);
        startActivity(logicActivity); //осуществляется переход в класс LogicActivity
    }
}
