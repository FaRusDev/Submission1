package com.example.f.submission1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var adapter: BarangAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = BarangAdapter(this,Data.barang){barang ->
            //anko commons intent
            startActivity<DetailActivity>("tes" to barang)
        }

        //kotlin extension
        recylerView.adapter = adapter
        recylerView.setHasFixedSize(true)
        recylerView.layoutManager = GridLayoutManager(this,2)

    }
}
