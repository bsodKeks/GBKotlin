package com.als.gbkotlin

data class Weather(
    val town: String = "Moscow",
    val isHomeTown: Boolean = false,
    val temperature: Int = 15
)