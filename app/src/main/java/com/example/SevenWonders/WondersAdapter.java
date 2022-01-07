package com.example.SevenWonders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WondersAdapter extends RecyclerView.Adapter<WondersAdapter.WonderViewHolder> {

    private final ArrayList<WonderItem> mWondersList;

    public static class WonderViewHolder extends RecyclerView.ViewHolder {
        public ImageView mWonderImage;
        public TextView mWonderName;
        public TextView mWonderDescription;
        public TextView mWonderLocation;


        public WonderViewHolder(@NonNull View itemView) {
            super(itemView);
            mWonderImage = itemView.findViewById(R.id.wonderImage);
            mWonderName = itemView.findViewById(R.id.wonderName);
            mWonderDescription = itemView.findViewById(R.id.wonderDescription);
            mWonderLocation = itemView.findViewById(R.id.location);

        }
    }

    public WondersAdapter(ArrayList<WonderItem> wondersList) {
        mWondersList = wondersList;
    }

    @NonNull
    @Override
    public WonderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wonder_item, parent, false);
        return new WonderViewHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull WonderViewHolder holder, int position) {
        WonderItem currentItem = mWondersList.get(position);

        holder.mWonderImage.setImageResource(currentItem.getImageResource());
        holder.mWonderName.setText(currentItem.getText1());
        holder.mWonderDescription.setText(currentItem.getText2());
        holder.mWonderLocation.setText(currentItem.getLocation());

    }

    @Override
    public int getItemCount() {
        return mWondersList.size();
    }


}
