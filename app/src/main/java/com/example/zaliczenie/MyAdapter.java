package com.example.zaliczenie;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zaliczenie.networking.ProductResult;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    List<Item> messages;


    public MyAdapter(List<Item> messages) {

        this.messages = messages;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.login.setText(messages.get(position).getLogin());
        holder.content.setText(messages.get(position).getContent());
        holder.date.setText(messages.get(position).getDate());
        holder.id.setText(messages.get(position).getId());


    }


    @Override
    public int getItemCount() {
        return messages.size();
    }
}
