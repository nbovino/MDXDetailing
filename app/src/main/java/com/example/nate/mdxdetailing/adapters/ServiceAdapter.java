package com.example.nate.mdxdetailing.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nate.mdxdetailing.R;
import com.example.nate.mdxdetailing.Service;


/**
 * Created by Nate on 5/11/16.
*/
public class ServiceAdapter extends BaseAdapter {
//
//    private Context mContext;
//    private InteriorService[] mInteriorServices;
//
//    public ServiceAdapter(Context context, InteriorService[] days) {
//        mContext = context;
//        mInteriorServices = days;
//    }
//
//    @Override
//    public int getCount() {
//        return mInteriorServices.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mInteriorServices[position];
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0; // Not going to use this. Used to tag items for easy reference
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//
//        if (convertView == null) {
//            // brand new
//            convertView = LayoutInflater.from(mContext).inflate(R.layout.service_list_item, null);
//            holder = new ViewHolder();
//        //    holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
//            holder.serviceType = (TextView) convertView.findViewById(R.id.serviceType);
//            holder.serviceDescription = (TextView) convertView.findViewById(R.id.serviceDescription);
//
//            convertView.setTag(holder);
//        }
//        else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//        InteriorService interiorService = mInteriorServices[position];
//
////        holder.iconImageView.setImageResource(day.getIconId());
////        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
////        holder.dayLabel.setText(day.getDayOfTheWeek());
//        holder.serviceType.setText(interiorService.getTypeOfService() + "");
//        holder.serviceDescription.setText(interiorService.getDescription() + "");
//
//        return convertView;
//    }
//
//    private static class ViewHolder {
//        TextView serviceType;
//        TextView serviceDescription;
//    }
/***************************/
    private Context mContext;
    private Service[] mServices;

    public ServiceAdapter(Context context, Service[] days) {
        mContext = context;
        mServices = days;
    }

    @Override
    public int getCount() {
        return mServices.length;
    }

    @Override
    public Object getItem(int position) {
        return mServices[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; // Not going to use this. Used to tag items for easy reference
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // brand new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.service_list_item, null);
            holder = new ViewHolder();
            //    holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            holder.serviceType = (TextView) convertView.findViewById(R.id.serviceType);
            holder.serviceShortDescription = (TextView) convertView.findViewById(R.id.serviceShortDescription);
            holder.serviceDescription = (TextView) convertView.findViewById(R.id.serviceDescription);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Service service = mServices[position];

//        holder.iconImageView.setImageResource(day.getIconId());
//        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
//        holder.dayLabel.setText(day.getDayOfTheWeek());
        holder.serviceType.setText(service.getTypeOfService() + "");
        holder.serviceDescription.setText(service.getDescription() + "");
        holder.serviceShortDescription.setText(service.getShortDescription() + "");

        return convertView;
    }

    private static class ViewHolder {
        TextView serviceType;
        TextView serviceShortDescription;
        TextView serviceDescription;
    }

}

