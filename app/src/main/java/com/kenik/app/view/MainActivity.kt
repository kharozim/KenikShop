package com.kenik.app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenik.app.ProductDomain
import com.kenik.app.R
import com.kenik.app.databinding.ActivityMainBinding
import com.kenik.app.view.adapter.HomeAdapter
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    private lateinit var adapter : HomeAdapter
    val listKU = ArrayList<ProductDomain>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listData = listOf(
            ProductDomain(1, "https://id-test-11.slatic.net/p/a3e04c6f9f8ad8cdfd57d57c6941831b.jpg_720x720q80.jpg_.webp", "baju pertama", "sarung", " ini baju apa ya 1", 90000, "90.000"),
            ProductDomain(1, "https://i.pinimg.com/originals/94/c8/28/94c828e0198732a10f75845a3ac96678.jpg", "baju kedua", "sarung", " ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1", 50000, "50.000"),
            ProductDomain(1, "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//85/MTA-9162210/oem_baju_kaos_distro_pria_spongebob__full01_m79ixc95.jpg", "baju ketiga", "sarung", " ini baju apa ya 1", 50000, "50.000"),
            ProductDomain(1, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcFIWiN7sQLkjco-Oe8jS-ASYJwIrAMuwCPw&usqp=CAU", "baju keempat", "sarung", " ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1ini baju apa ya 1", 50000, "50.000")
        )

        listKU.addAll(listData)

        binding.run {
            adapter = HomeAdapter(this@MainActivity, listKU)
            mListProduct.adapter = adapter
        }

        Timber.tag("dataku").d("$listKU")


    }
}