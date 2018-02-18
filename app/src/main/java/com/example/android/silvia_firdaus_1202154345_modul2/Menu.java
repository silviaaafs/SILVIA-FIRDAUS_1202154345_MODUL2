package com.example.android.silvia_firdaus_1202154345_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter untuk data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adapter dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Agar RecyclerView menjadi tampilan default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){ //menambahkan makanan yang akan di tampilkan
        for (int i = 0;i < 3; i++){
            foods.add("Nasi Goreng Seafood");
            foods.add("Mie Goreng");
            foods.add("Cumi Saos Tiram");
            foods.add("Udang Goreng Tepung");
            foods.add("Kepiting Saos Padang");
            foods.add("Fried Chicken Fillet");
            foods.add("Sapi Lada Hitam");

            // menentukan harga makanan
            priceses.add(40000);
            priceses.add(35000);
            priceses.add(75000);
            priceses.add(75000);
            priceses.add(200000);
            priceses.add(150000);
            priceses.add(80000);

            //untut mengambil gambar yang ada pada file drawable
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.miegoreng);
            photos.add(R.drawable.cumisaostiram);
            photos.add(R.drawable.udang);
            photos.add(R.drawable.kepiting);
            photos.add(R.drawable.chickenfillet);
            photos.add(R.drawable.sapi);
        }
    }
}
