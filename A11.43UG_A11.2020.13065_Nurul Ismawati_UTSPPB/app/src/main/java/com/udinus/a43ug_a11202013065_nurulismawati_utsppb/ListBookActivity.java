package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListBookActivity extends AppCompatActivity {
    private RecyclerView rvBook;
    private ArrayList<ListBook> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);

        rvBook = findViewById(R.id.rv_book);
        rvBook.setHasFixedSize(true);

        list.addAll(DataBuku.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBook.setAdapter(listBookAdapter);

        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(ListBook listBook){
                Intent moveIntent = new Intent(ListBookActivity.this, DetailBukuActivity.class);
                moveIntent.putExtra(DetailBukuActivity.ITEM_EXTRA, listBook);
                startActivity(moveIntent);
            }
        });
    }

}