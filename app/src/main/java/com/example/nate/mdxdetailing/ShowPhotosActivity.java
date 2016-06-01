package com.example.nate.mdxdetailing;

import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;
import android.widget.TextView;

import com.example.nate.mdxdetailing.adapters.PhotoAdapter;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShowPhotosActivity extends AppCompatActivity {

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

    }
}
