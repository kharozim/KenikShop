package com.kenik.app

data class ProductDomain(
    val id : Int,
    val thumbnail : String,
    val name: String,
    val type : String,
    val description: String,
    val price: Int,
    val priceFormatter: String
)