package com.example.touristhelper;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static com.example.touristhelper.startActivity.indOfCell;

public class LogicActivity extends ListActivity  {
    ArrayAdapter<String> mAdapter = null;//создаем адаптер для дальнейшей работы с выстраиванием списков
    @Override
    protected void onCreate(Bundle savedInstanceState) {//метод запускающий работу читки тхт файла
        super.onCreate(savedInstanceState);
        try {
            readText();//вызов метода readText
           } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readText() throws IOException {//метод, который открывает определенный тхт файл в зависимости от значения переменной
        if (indOfCell == 1) {                 //которую мы получили в классе startActivity
            String[] food = new String[10]; //создание пустого массива определенного размера для дальнейшей работы в нем
            makeList("food.txt", food);//вызов метода makeList с переменными "food.txt" и food
       }
        if (indOfCell == 2) {
            String[] hello = new String[30];
            makeList("hello.txt", hello);
        }
        if (indOfCell == 3) {
            String[] hotel = new String[12];
            makeList("hotel.txt", hotel);
        }
        if (indOfCell == 4) {
            String[] findRoad = new String[9] ;
            makeList("findRoad.txt", findRoad);
        }
        if (indOfCell == 5) {
            String[] money = new String[12] ;
            makeList("money.txt", money);
        }
        if (indOfCell == 6){
            String[] tour = new String[34];
            makeList("tour.txt", tour);
        }
        if (indOfCell == 7) {
            String[] taxi = new String[15];
            makeList("taxi.txt", taxi);
        }
        if (indOfCell == 8) {
            String[] shopping = new String[15];
            makeList("shopping.txt", shopping);
        }
        if (indOfCell == 9) {
            String[] airport = new String[18] ;
            makeList("airport.txt", airport);
        }
        if (indOfCell == 10) {
            String[] hospital = new String[22] ;
            makeList("hospital.txt", hospital);
        }
        if (indOfCell == 11){
            String[] busTrain = new String[28];
            makeList("busTrain.txt", busTrain);
        }
    }
    public void makeList(String filename, String[] cell) throws IOException {//метод, преобразующий тхт файл в прокручивающийся список строк
        InputStream is = getAssets().open(filename);//определение тхт файл из папки assets
        int size  = is.available(); // возвращение количество байтов ввода, доступные в данный момент для чтения
        byte[] buffer = new byte[size];//создание массива байтов размера size, доступные в данный момент для чтения
        is.read(buffer);//чтение байт в буфер, возвращая количество прочитанных байтов. По достижении конца файла возвращает значение -1
        String arr = new String(buffer);//перевод массива байтов в строку для чтения
        for (int i = 0; i < Arrays.asList(arr.split("\n")).size(); i++) {//заполнение пустого массива cell значениями из тхт файла
            cell[i] = Arrays.asList(arr.split("\n")).get(i);
        }
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cell);//преобразование массива в прокручиваемый список

        is.close();//закрытие источник ввода. Следующие попытки чтения передадут исключение IOException
        setListAdapter(mAdapter);//подключение адаптера
    }
}
