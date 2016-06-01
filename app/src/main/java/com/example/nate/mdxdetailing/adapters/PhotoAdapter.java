package com.example.nate.mdxdetailing.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.nate.mdxdetailing.PhotoCollection;
import com.example.nate.mdxdetailing.R;


public class PhotoAdapter extends BaseAdapter {

    private Context mContext;
    private PhotoCollection[] mPhotos;

    public PhotoAdapter(Context context, PhotoCollection[] photos) {
        mContext = context;
        mPhotos = photos;
    }

    @Override
    public int getCount() {
        return mPhotos.length;
    }

    @Override
    public Object getItem(int position) {
        return mPhotos[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; // Not going to use this. Used to tag items for easy reference
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.photo_list_item, null);
            holder = new ViewHolder();

            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            holder.photoDescription = (TextView) convertView.findViewById(R.id.photoDescription);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        PhotoCollection photo = mPhotos[position];

        holder.imageView.setImageResource(photo.getPhoto());
        holder.photoDescription.setText(photo.getPhotoDescription());


        return convertView;
    }

    private static class ViewHolder {
        ImageView imageView;
        TextView photoDescription;
    }
}
