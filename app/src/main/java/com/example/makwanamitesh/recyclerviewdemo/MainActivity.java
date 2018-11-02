package com.example.makwanamitesh.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.makwanamitesh.recyclerviewdemo.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.programmingList1);

        mRecyclerView.setHasFixedSize(true);

        // Manager layout
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //items
        String[] languages={"Java","JavaScript","C#","PHP","Python","C","C++","Node","Ruby",};
        //create adapter
        mAdapter = new adapter(languages);
        mRecyclerView.setAdapter(mAdapter);
    }
}
