package com.example.yechanviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yechanviewpager.R;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView listview;
    View v;

    public Fragment1() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = LayoutInflater.from(getContext()).inflate(R.layout.fragment, null);

        listview =v.findViewById(R.id.listview);
        mAdapter = new ListAdapter(items);
        listview.setAdapter(mAdapter);

        items.add(new Data("a1","a1"));
        items.add(new Data("a2","a2"));
        items.add(new Data("a3","a3"));
        items.add(new Data("a4","a4"));
        items.add(new Data("a5","a5"));
        items.add(new Data("a6","a6"));
        items.add(new Data("a7","a7"));
        mAdapter.notifyDataSetChanged();

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(v.getContext(),Detail_Activity.class);
                intent.putExtra("title",items.get(position).getTitle());
                intent.putExtra("content",items.get(position).getContent());

                startActivity(intent);
            }
        });

        mAdapter.notifyDataSetChanged();

        return v;
    }
}