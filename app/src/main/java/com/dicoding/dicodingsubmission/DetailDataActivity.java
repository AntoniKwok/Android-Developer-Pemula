package com.dicoding.dicodingsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.dicodingsubmission.Object.President;
import com.dicoding.dicodingsubmission.Object.PresidentData;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailDataActivity extends AppCompatActivity {

    CircleImageView circleImageView;
    TextView txtName, txtRemark, txtDesc, txtBorn, txtDied, txtTall;


    ArrayList<President> presidents = new ArrayList<>();
//    int id = intent.getIntExtra("id", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);

        presidents.addAll(PresidentData.getListData());

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);


        circleImageView = (CircleImageView) findViewById(R.id.circleImageView);
        txtName = (TextView) findViewById(R.id.txtName);
        txtRemark = (TextView) findViewById(R.id.txtRemark);
        txtDesc = (TextView) findViewById(R.id.txtDesc);
        txtBorn = (TextView) findViewById(R.id.bornTxt);
        txtDied = (TextView) findViewById(R.id.diedTxt);
        txtTall = (TextView) findViewById(R.id.tallTxt);

        Glide.with(getApplicationContext()).load(presidents.get(id).getPhoto()).into(circleImageView);
        txtName.setText(presidents.get(id).getName());
        txtRemark.setText(presidents.get(id).getRemark());
        txtDesc.setText(presidents.get(id).getDesc());
        txtBorn.setText(presidents.get(id).getBornDate());
        txtDied.setText(presidents.get(id).getDiedDate());
        txtTall.setText(presidents.get(id).getTall());

    }
}
