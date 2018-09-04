package com.example.f.submission1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//anko parcelize
@Parcelize
class Barang (val namaBarang:String,val hargaBarang:Int,val gambarBarang:String,val ket:String):Parcelable