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
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dicoding.dicodingsubmission.DetailDataActivity;
import com.dicoding.dicodingsubmission.Object.Skincare;
import com.dicoding.dicodingsubmission.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {

    Context context;
    ArrayList<Skincare> skincareList;

    public ViewAdapter(Context context, ArrayList<Skincare> skincareList) {
        this.context = context;
        this.skincareList = skincareList;
    }

    public List<Skincare> getSkincareList() {
        return skincareList;
    }

    public void setSkincareList(ArrayList<Skincare> skincareList) {
        this.skincareList = skincareList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final int a = i;
        viewHolder.nameText.setText(getSkincareList().get(i).getName());
        viewHolder.qtyText.setText(getSkincareList().get(i).getQuantity());
        viewHolder.priceText.setText(getSkincareList().get(i).getPrice());
        Glide.with(context).load(getSkincareList().get(i).getImage()).into(viewHolder.photoView);
        viewHolder.ratingView.setRating(getSkincareList().get(i).getRating());
        viewHolder.viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailDataActivity.class);
                intent.putExtra("id", a);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return skincareList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView photoView;
        TextView nameText, priceText, qtyText;
        RatingBar ratingView;
        Button viewBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoView = itemView.findViewById(R.id.circleImageView);
            nameText = itemView.findViewById(R.id.txtName);
            priceText = itemView.findViewById(R.id.txtPrice);
            qtyText = itemView.findViewById(R.id.txtQuantity);
            ratingView = itemView.findViewById(R.id.ratingBar);
            viewBtn = itemView.findViewById(R.id.viewMoreBtn);
        }
    }
}


