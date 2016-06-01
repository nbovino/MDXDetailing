package com.example.nate.mdxdetailing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.String;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private String mService;
    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String LAYOUT_SWITCH = "LAYOUT_SWITCH";
    public static final String SERVICE = "CHOSEN_SERVICE";
    public static final String PHOTOS = "PHOTOS";
    private Integer mViewCount = 2;

    //Create services
    private Service[] mInteriorService = Service.makeInteriorServices();
    private Service[] mExteriorService = Service.makeExteriorServices();
    private Service[] mUltimateItems = Service.makeUltimateItems();
    private Service[] mRestorationServices = Service.getRestorationServices();

    // Create photos of packages
    private PhotoCollection[] mInteriorPhotos = PhotoCollection.makeInteriorPhotos();
    private PhotoCollection[] mExteriorPhotos = PhotoCollection.makeExteriorPhotos();
    private PhotoCollection[] mUltimatePhotos = PhotoCollection.makeUltimatePhotos();
    private PhotoCollection[] mRestorationPhotos = PhotoCollection.makeRestorationPhotos();

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(LAYOUT_SWITCH, mViewCount);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mViewCount = savedInstanceState.getInt(LAYOUT_SWITCH);

        if (!onPhotoSelect()) {
            setContentView(R.layout.activity_main2);
            ButterKnife.bind(this);
        } else {
            setContentView(R.layout.activity_main_photo);
            ButterKnife.bind(this);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!onPhotoSelect()) {
            setContentView(R.layout.activity_main2);
            ButterKnife.bind(this);
        } else {
            setContentView(R.layout.activity_main_photo);
            ButterKnife.bind(this);
        }
    }

    // Changes view so know when click services it will show pictures or descriptions of the services
    @OnClick (R.id.viewSwitch)
    public void photoActivity() {
        if (onPhotoSelect()) {
            setContentView(R.layout.activity_main2);
            ButterKnife.bind(this);
        } else {
            setContentView(R.layout.activity_main_photo);
            ButterKnife.bind(this);
        }
        mViewCount++;
    }

    @OnClick (R.id.interiorService)
    public void interiorButton() {
        if (!onPhotoSelect()) {
            sendDetailsIntent("Interior Services", mInteriorService);
        } else {
            sendPhotoIntent("Interior Services", mInteriorPhotos);
        }
    }

    @OnClick (R.id.exteriorService)
    public void exteriorButton() {
        if (!onPhotoSelect()) {
            sendDetailsIntent("Exterior Services", mExteriorService);
        } else {
            sendPhotoIntent("Exterior Services", mExteriorPhotos);
        }
    }

    @OnClick (R.id.ultimateItems)
    public void ultimateButton() {
        if (!onPhotoSelect()) {
            sendDetailsIntent("Ultimate Items", mUltimateItems);
        } else {
            sendPhotoIntent("Ultimate Items", mUltimatePhotos);
        }
    }

    @OnClick (R.id.restorationServices)
    public void restorationButton() {
        if (!onPhotoSelect()) {
            sendDetailsIntent("Restoration Services", mRestorationServices);
        } else {
            sendPhotoIntent("Restoration Services", mRestorationPhotos);
        }
    }

    public void setChoiceToNothing() {
        mService= "";
    }

    // Returns true if photo layout is being used
    private Boolean onPhotoSelect() {
        if (mViewCount % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void sendDetailsIntent(String choice, Service[] choicePackage) {
        setChoiceToNothing();
        Intent intent = new Intent(this, ShowServicesActivity.class);
        intent.putExtra("service", choice);
        intent.putExtra(SERVICE, choicePackage);
        startActivity(intent);
    }

    public void sendPhotoIntent(String choice, PhotoCollection[] photoCategory) {
        setChoiceToNothing();
        Intent intent = new Intent(this, ShowPhotosActivity.class);
        intent.putExtra("service", choice);
        intent.putExtra(PHOTOS, photoCategory);
        startActivity(intent);
    }

}
