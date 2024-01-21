package com.example.zaliczenie;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView login;
    TextView content;
    TextView date;
    TextView id;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        login = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        date = itemView.findViewById(R.id.date);
        id = itemView.findViewById(R.id.id);


    }
}
