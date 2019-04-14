package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String Pro[] = {"Apple","Samsung","Oppo","Mi","Honor","Panasonic","Huawei","Vivo","Realme","Infinix","Blackberry","Htc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerid);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));

       CuctomAdapter cuctomAdapter = new CuctomAdapter(Pro, this);
       recyclerView.setAdapter(cuctomAdapter);

    }
}
