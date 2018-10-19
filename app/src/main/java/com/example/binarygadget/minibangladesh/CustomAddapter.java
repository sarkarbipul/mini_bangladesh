package com.example.binarygadget.minibangladesh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.NameList;

public class CustomAddapter extends BaseAdapter {
    Context context;
    String Namelist[];
    int flags[];
    LayoutInflater inflter;


    public CustomAddapter(Context applicationContext, String[] NameList, int[] flags) {

        this.context = context;
        this.Namelist = NameList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return Namelist.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView student = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        student.setText(Namelist[i]);
        icon.setImageResource (flags[i]);
        return view;
    }
}
