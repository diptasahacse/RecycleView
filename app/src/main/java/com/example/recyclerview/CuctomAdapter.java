package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CuctomAdapter extends RecyclerView.Adapter<DataHolder> {
    String name[];
    Context context;


    public CuctomAdapter(String[] name, Context context) {
        this.name = name;
        this.context = context;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.childdemo,viewGroup,false);
        DataHolder dataHolder = new DataHolder(view);

        return dataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder dataHolder, int i) {

        dataHolder.textView.setText(name[i]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
