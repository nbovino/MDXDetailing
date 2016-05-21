package com.example.nate.mdxdetailing;

import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nate.mdxdetailing.adapters.PhotoAdapter;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShowPhotosActivity extends AppCompatActivity {

//    private PhotoCollection[] mPhoto;
//
//    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_show_photos);
//        ButterKnife.bind(this);
//
//        Intent intent = getIntent();
//        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.PHOTOS);
//        mPhoto = Arrays.copyOf(parcelables, parcelables.length, PhotoCollection[].class);
//
//        PhotoAdapter adapter = new PhotoAdapter(this, mPhoto);
//        mRecyclerView.setAdapter(adapter);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setHasFixedSize(true);
//    }


    private PhotoCollection[] mPhotos;

    @Bind(android.R.id.list)
    ListView mListView;
    // This must be Nullable or else it throws an exception. I don't know why
    @Nullable
    @Bind(android.R.id.empty)
    TextView mEmptyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_photos);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        TextView serviceType = (TextView)findViewById(R.id.serviceCategory);

        String pageHeading = intent.getStringExtra("service");
        serviceType.setText(pageHeading);

        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.PHOTOS);
        mPhotos = Arrays.copyOf(parcelables, parcelables.length, PhotoCollection[].class);

        PhotoAdapter adapter = new PhotoAdapter(this, mPhotos);
        mListView.setAdapter(adapter);
        mListView.setDivider(null);
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
