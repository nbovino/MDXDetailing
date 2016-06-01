package com.example.nate.mdxdetailing;

import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nate.mdxdetailing.adapters.ServiceAdapter;


import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ShowServicesActivity extends AppCompatActivity {

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

    }
}
