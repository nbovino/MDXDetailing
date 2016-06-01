package com.example.nate.mdxdetailing;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nate on 5/19/16.
 */
public class PhotoCollection implements Parcelable {

    private int mPhoto;
    private String mPhotoDescription;

    public String getPhotoDescription() { return mPhotoDescription; }

    public void setPhotoDescription(String photoDescription) { mPhotoDescription = photoDescription; }

    public int getPhoto() { return mPhoto; }

    public void setPhoto(int photo) { mPhoto = photo; }

    public static PhotoCollection[] makeInteriorPhotos() {

        PhotoCollection[] allInteriorPhotos = new PhotoCollection[2];

        PhotoCollection before1 = new PhotoCollection();
        before1.setPhotoDescription("Before");
        before1.setPhoto(R.drawable.interior_before_1);
        allInteriorPhotos[0] = before1;

        PhotoCollection after1 = new PhotoCollection();
        after1.setPhotoDescription("After");
        after1.setPhoto(R.drawable.interior_after_1);
        allInteriorPhotos[1] = after1;

        return allInteriorPhotos;
    }

    public static PhotoCollection[] makeExteriorPhotos() {

        PhotoCollection[] allExteriorPhotos = new PhotoCollection[3];

        PhotoCollection exterior_1 = new PhotoCollection();
        exterior_1.setPhotoDescription("Exterior");
        exterior_1.setPhoto(R.drawable.exterior_1);
        allExteriorPhotos[0] = exterior_1;

        // These two actually go in paint restoration service
        PhotoCollection before1 = new PhotoCollection();
        before1.setPhotoDescription("Before");
        before1.setPhoto(R.drawable.paint_before_1);
        allExteriorPhotos[1] = before1;

        PhotoCollection after1 = new PhotoCollection();
        after1.setPhotoDescription("After");
        after1.setPhoto(R.drawable.paint_after_1);
        allExteriorPhotos[2] = after1;

        return allExteriorPhotos;
    }

    public static PhotoCollection[] makeRestorationPhotos() {

        PhotoCollection[] allRestorationPhotos = new PhotoCollection[1];

        PhotoCollection restoration_compare_1 = new PhotoCollection();
        restoration_compare_1.setPhotoDescription("Headlight Restoration");
        restoration_compare_1.setPhoto(R.drawable.restoration_compare_1);
        allRestorationPhotos[0] = restoration_compare_1;

        return allRestorationPhotos;
    }

    public static PhotoCollection[] makeUltimatePhotos() {
        PhotoCollection[] allUltimatePhotos = new PhotoCollection[2];

        PhotoCollection tire_before_1 = new PhotoCollection();
        tire_before_1.setPhotoDescription("Tire dressing before");
        tire_before_1.setPhoto(R.drawable.tire_before_1);
        allUltimatePhotos[0] = tire_before_1;

        PhotoCollection tire_after_1 = new PhotoCollection();
        tire_after_1.setPhotoDescription("Tire dressing after");
        tire_after_1.setPhoto(R.drawable.tire_after_1);
        allUltimatePhotos[1] = tire_after_1;

        return allUltimatePhotos;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mPhoto);
        dest.writeString(mPhotoDescription);
    }

    private PhotoCollection(Parcel in) {
        mPhoto = in.readInt();
        mPhotoDescription = in.readString();
    }

    public PhotoCollection() { }

    public static final Parcelable.Creator<PhotoCollection> CREATOR = new Parcelable.Creator<PhotoCollection>() {
        @Override
        public PhotoCollection createFromParcel(Parcel source) {
            return new PhotoCollection(source);
        }

        @Override
        public PhotoCollection[] newArray(int size) {
            return new PhotoCollection[size];
        }
    };

}
