package com.example.tugas69;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(R.drawable.ic_c, "Yoga", "50 Tahun", "Ayah"));
        keluargaArrayList.add(new Keluarga(R.drawable.ic_d, "Siti", "44 Tahun", "Ibu"));
        keluargaArrayList.add(new Keluarga(R.drawable.ic_e, "Adi", "20 Tahun", "Anak"));
        keluargaArrayList.add(new Keluarga(R.drawable.ic_ck, "Putra", "20 Tahun", "Anak"));
    }
}