package com.example.nate.mdxdetailing;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nate.mdxdetailing.R;
import com.example.nate.mdxdetailing.adapters.ServiceAdapter;
import com.example.nate.mdxdetailing.InteriorService;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShowServicesActivity extends AppCompatActivity {
//
//    private InteriorService[] mInteriorServices;
//
//    @Bind(android.R.id.list) ListView mListView;
//    @Nullable @Bind(android.R.id.empty) TextView mEmptyTextView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_show_services);
//        ButterKnife.bind(this);
//
//        Intent intent = getIntent();
//        TextView serviceType = (TextView)findViewById(R.id.serviceCategory);
//
//        String pageHeading = intent.getStringExtra("service");
//        serviceType.setText(pageHeading);
//
//        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.SERVICE);
//        mInteriorServices = Arrays.copyOf(parcelables, parcelables.length, InteriorService[].class);
//
//        ServiceAdapter adapter = new ServiceAdapter(this, mInteriorServices);
//        mListView.setAdapter(adapter);
//        mListView.setEmptyView(mEmptyTextView);
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //String dayOfTheWeek = mDays[position].getDayOfTheWeek();
//                //String condition = mDays[position].getSummary();
//                //String highTemp = mDays[position].getTemperatureMax() + "";
//                //String message = String.format("On %s the high will be %s and it will be %s",
//                //        dayOfTheWeek, highTemp, condition);
//                //Toast.makeText(DailyForecastActivity.this, message, Toast.LENGTH_LONG).show();
//            }
//        });
//
//
//    }



    private Service[] mServices;

    @Bind(android.R.id.list) ListView mListView;
    // This must be Nullable or else it throws an exception. I don't know why
    @Nullable @Bind(android.R.id.empty) TextView mEmptyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_services);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        TextView serviceType = (TextView)findViewById(R.id.serviceCategory);

        String pageHeading = intent.getStringExtra("service");
        serviceType.setText(pageHeading);

        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.SERVICE);
        mServices = Arrays.copyOf(parcelables, parcelables.length, Service[].class);

        ServiceAdapter adapter = new ServiceAdapter(this, mServices);
        mListView.setAdapter(adapter);
        mListView.setEmptyView(mEmptyTextView);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String dayOfTheWeek = mDays[position].getDayOfTheWeek();
                //String condition = mDays[position].getSummary();
                //String highTemp = mDays[position].getTemperatureMax() + "";
                //String message = String.format("On %s the high will be %s and it will be %s",
                //        dayOfTheWeek, highTemp, condition);
                //Toast.makeText(DailyForecastActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });


    }
}
