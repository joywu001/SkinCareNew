package com.example.skincare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<ProductModel> list;
    public Adapter(ArrayList<ProductModel> list) {this.list = list;}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_list_item,viewGroup,false);
        Adapter.ViewHolder ViewHolder = new Adapter.ViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder ViewHolder, int i){
        ProductModel currentData = list.get(i);
        ViewHolder.name.setText(currentData.getName());
        ViewHolder.price.setText(currentData.getPrice());
        ViewHolder.link.setText(currentData.getLink());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView price;
        TextView link;
        View rootView;

        public ViewHolder(@NonNull View view) {
            super(view);
            rootView = view;
            name=view.findViewById(R.id.txt_name);
            price = view.findViewById(R.id.txt_price);
            link = view.findViewById(R.id.txt_link);
        }
    }
}
