package com.example.f.submission1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailAnko().setContentView(this)

    }

    //anko layout
    inner class DetailAnko:AnkoComponent<DetailActivity>{

        override fun createView(ui: AnkoContext<DetailActivity>)= with(ui) {

            val data = intent.getParcelableExtra<Barang>("tes")
            val gbr = this.resources.getIdentifier(data.gambarBarang,"drawable",packageName)

            verticalLayout{
                imageView(gbr).lparams(
                        width = matchParent,
                        height = wrapContent
                ){
                    padding = dip(16)
                    margin = dip(8)
                }

                linearLayout() {
                    textView("Nama Barang : ").lparams(){
                        marginEnd = dip(5)

                    }

                    textView(data.namaBarang).lparams(
                            width = matchParent,
                            height = wrapContent
                    ){
                        weight = 2F
                        marginStart = dip(5)
                    }

                }.lparams(
                        width = matchParent,
                        height = wrapContent
                ){
                    padding = dip(5)
                    margin  = dip(10)

                }

                linearLayout() {
                    textView("Nama Barang : ").lparams(){
                        marginEnd = dip(5)

                    }

                    textView("Rp.${data.hargaBarang},-").lparams(
                            width = matchParent,
                            height = wrapContent
                    ){
                        weight = 2F
                        marginStart = dip(5)
                    }

                }.lparams(
                        width = matchParent,
                        height = wrapContent
                ){
                    padding = dip(5)
                    margin  = dip(10)

                }


                linearLayout() {
                    textView("Keterangan : ").lparams(){
                        marginEnd = dip(5)

                    }

                    textView(data.ket).lparams(
                            width = matchParent,
                            height = wrapContent
                    ){
                        weight = 2F
                        marginStart = dip(5)
                    }

                }.lparams(
                        width = matchParent,
                        height = wrapContent
                ){
                    padding = dip(5)
                    margin  = dip(10)

                }
            }
        }
    }



}
