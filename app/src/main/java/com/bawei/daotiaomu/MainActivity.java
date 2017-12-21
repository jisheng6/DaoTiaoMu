package com.bawei.daotiaomu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MaView{
    private RecyclerView xr;
    private MainPresenter presenter;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xr = findViewById(R.id.recyclerview);
        presenter = new MainPresenter(this);
        presenter.get();
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        xr.setLayoutManager(manager);
        adapter = new MyAdapter(MainActivity.this);
        xr.setAdapter(adapter);
    }

    @Override
    public void success(Bean bean) {
        adapter.addData(bean);
    }

    @Override
    public void failure() {

    }
}
