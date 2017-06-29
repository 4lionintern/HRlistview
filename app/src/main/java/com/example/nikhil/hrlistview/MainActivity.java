package com.example.nikhil.hrlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView mRecyclerView;
    private HorizontalRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.fragment_horizontal_recycler_view);
        mRecyclerView.setHasFixedSize(true);


        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);//new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new HorizontalRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL);
        mRecyclerView.addItemDecoration(itemDecoration);
        mAdapter.setOnItemClickListener(this);



        mRecyclerView = (RecyclerView) findViewById(R.id.fragment_horizontal_recycler_view2);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);//new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HorizontalRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(itemDecoration);
        mAdapter.setOnItemClickListener(this);



        mRecyclerView = (RecyclerView) findViewById(R.id.fragment_horizontal_recycler_view3);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);//new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HorizontalRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(itemDecoration);
        mAdapter.setOnItemClickListener(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.fragment_horizontal_recycler_view4);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);//new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HorizontalRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(itemDecoration);
        mAdapter.setOnItemClickListener(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.fragment_horizontal_recycler_view5);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);//new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HorizontalRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(itemDecoration);
        mAdapter.setOnItemClickListener(this);

        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);



    }


    private ArrayList<HorizontalData> getDataSet() {
        ArrayList results = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            HorizontalData obj = new HorizontalData("Some Primary Text " + index,
                    "Secondary " + index);
            results.add(index, obj);
        }
        return results;
    }

}

