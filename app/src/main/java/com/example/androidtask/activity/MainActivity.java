package com.example.androidtask.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtask.R;
import com.example.androidtask.model.data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TextView jobTitle;
    @BindView(R.id.date)
    TextView createdDate;
    @BindView(R.id.image)
    ImageView image;

    private Unbinder unbinder;
    private Bitmap photoBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);

//        DateFormat df = android.text.format.DateFormat.getDateFormat(this);
//        String date = df.format(data.getCreatedDate());
//        createdDate.setText(date);
//
//        jobTitle.setText(data.getJobTitle());

    }
}
