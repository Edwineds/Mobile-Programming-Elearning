package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<fruit> persons;

    private static class ViewHolder {
        ImageView photo;
        TextView name;
        TextView price;
    }

    public ListAdapter(Activity activity, List<fruit> persons) {
        this.context = activity.getBaseContext();
        this.persons = persons;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int id) {
        return persons.get(id);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int pos, View v, ViewGroup vGroup) {
        // TODO Auto-generated method stub

        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (v == null) {
            holder = new ViewHolder();

            v = inflater.inflate(R.layout.list_item, vGroup, false);

            holder.photo = v.findViewById(R.id.photo);
            holder.name = v.findViewById(R.id.name);
            holder.price = v.findViewById(R.id.price);

            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();

        }

        fruit p = persons.get(pos);

        holder.photo.setImageResource(p.getPhotoId());
        holder.name.setText(p.getName());
        holder.price.setText(p.getPrice());


        return v;
    }
}
