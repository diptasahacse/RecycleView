package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DataHolder extends RecyclerView.ViewHolder {

        TextView textView;


    public DataHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.productid);
    }
}
