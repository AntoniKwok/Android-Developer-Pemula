package com.dicoding.dicodingsubmission.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dicoding.dicodingsubmission.DetailDataActivity;
import com.dicoding.dicodingsubmission.ItemClickSupport;
import com.dicoding.dicodingsubmission.MainActivity;
import com.dicoding.dicodingsubmission.Object.President;
import com.dicoding.dicodingsubmission.Object.PresidentData;
import com.dicoding.dicodingsubmission.R;

import java.util.ArrayList;
import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {

    Context context;
    ArrayList<President> presidentList;

    public ViewAdapter(Context context, ArrayList<President> presidentList) {
        this.context = context;
        this.presidentList = presidentList;
    }

    public List<President> getPresidentList() {
        return presidentList;
    }

    public void setPresidentList(ArrayList<President> presidentList) {
        this.presidentList = presidentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        viewHolder.nameText.setText(getPresidentList().get(i).getName());
        viewHolder.remarkText.setText(getPresidentList().get(i).getRemark());
        Glide.with(context).load(getPresidentList().get(i).getPhoto()).into(viewHolder.photoView);

        viewHolder.favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Favorite " + viewHolder.nameText.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Share " + viewHolder.nameText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView photoView;
        TextView nameText, remarkText;
        Button favBtn, shareBtn;
        RelativeLayout relativeLayout;
        CardView cardLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoView = itemView.findViewById(R.id.imgView);
            nameText = itemView.findViewById(R.id.txtName);
            remarkText = itemView.findViewById(R.id.txtDesc);
            favBtn = itemView.findViewById(R.id.btnFavorite);
            shareBtn = itemView.findViewById(R.id.btnShare);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            cardLayout = itemView.findViewById(R.id.cardLayout);
        }
    }
}


