package com.dicoding.dicodingsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dicoding.dicodingsubmission.Object.Skincare;
import com.dicoding.dicodingsubmission.Object.SkincareData;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailDataActivity extends AppCompatActivity {

    CircleImageView circleImageView;
    TextView txtName, txtPrice, txtQty, txtDesc;
    Button btnBuy;
    RatingBar ratingView;


    ArrayList<Skincare> skincares = new ArrayList<>();
//    int id = intent.getIntExtra("id", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);

        skincares.addAll(SkincareData.getListData());

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);


        circleImageView = (CircleImageView) findViewById(R.id.circleImageView);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPrice = (TextView) findViewById(R.id.txtPrice);
        txtDesc = (TextView) findViewById(R.id.txtDesc);
        txtQty = (TextView) findViewById(R.id.txtQuantity);
        btnBuy = (Button) findViewById(R.id.buttonBuy);
        ratingView = (RatingBar) findViewById(R.id.ratingBar);

        Glide.with(getApplicationContext()).load(skincares.get(id).getImage()).into(circleImageView);
        txtName.setText(skincares.get(id).getName());
        txtPrice.setText(skincares.get(id).getPrice());
        txtDesc.setText(skincares.get(id).getDesc());
        txtQty.setText(skincares.get(id).getQuantity());
        ratingView.setRating(skincares.get(id).getRating());

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailDataActivity.this, "You have purchased " + txtName.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
