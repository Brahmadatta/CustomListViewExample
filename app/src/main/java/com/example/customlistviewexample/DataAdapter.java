package com.example.customlistviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DataAdapter extends ArrayAdapter<String> {

    public String[] aplhabetNames;

    public Context context;

    public DataAdapter(Context context, String[] values) {
        super(context, R.layout.list_mobile, values);
        this.context = context;
        this.aplhabetNames = values;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.list_mobile,parent,false);

        TextView textView = view.findViewById(R.id.alphabetName);

        textView.setText(aplhabetNames[position]);

        return view;
    }
}
