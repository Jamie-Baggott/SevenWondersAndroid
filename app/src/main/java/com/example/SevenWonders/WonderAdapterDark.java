package com.example.SevenWonders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class WonderAdapterDark extends RecyclerView.Adapter<WonderAdapterDark.WonderViewHolderDark> {

    private final ArrayList<WonderItem> mWonderList;

    public static class WonderViewHolderDark extends RecyclerView.ViewHolder {
        public ImageView mWonderImage;
        public TextView mWonderName;
        public TextView mWonderDescription;
        public TextView mWonderLocation;


        public WonderViewHolderDark(@NonNull View itemView) {
            super(itemView);
            mWonderImage = itemView.findViewById(R.id.wonderImage);
            mWonderName = itemView.findViewById(R.id.wonderName);
            mWonderDescription = itemView.findViewById(R.id.wonderDescription);
            mWonderLocation = itemView.findViewById(R.id.location);

        }
    }

    public WonderAdapterDark(ArrayList<WonderItem> wonderList) {
        mWonderList = wonderList;
    }

    @NonNull
    @Override
    public WonderViewHolderDark onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wonder_item_dark, parent, false);
        return new WonderViewHolderDark(v);
    }



    @Override
    public void onBindViewHolder(@NonNull WonderViewHolderDark holder, int position) {
        WonderItem currentItem = mWonderList.get(position);

        holder.mWonderImage.setImageResource(currentItem.getImageResource());
        holder.mWonderName.setText(currentItem.getText1());
        holder.mWonderDescription.setText(currentItem.getText2());
        holder.mWonderLocation.setText(currentItem.getLocation());

    }

    @Override
    public int getItemCount() {
        return mWonderList.size();
    }


}
