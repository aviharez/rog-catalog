package com.aviharez.submispemula;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLaptopAdapter extends RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder> {

    private ArrayList<Laptop> listLaptop;
    private Context context;

    ListLaptopAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Laptop> getListLaptop() {
        return listLaptop;
    }

    void setListLaptop(ArrayList<Laptop> listLaptop) {
        this.listLaptop = listLaptop;
    }

    @NonNull
    @Override
    public ListLaptopAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListLaptopAdapter.ListViewHolder holder, int position) {
        Laptop laptop = listLaptop.get(position);

        Glide.with(holder.itemView.getContext()).load(laptop.getPhoto()).apply(new RequestOptions().override(55,55)).into(holder.imgPhoto);
        holder.tvName.setText(laptop.getName());
        holder.tvPrice.setText(laptop.getPrice());
    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvPrice;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_item);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
        }
    }

}
