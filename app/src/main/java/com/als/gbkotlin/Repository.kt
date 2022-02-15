package com.als.gbkotlin

import android.util.Log

object Repository {
    private val weatherList: ArrayList<Weather>
    private val weatherList0: List<Weather> = emptyList()
    private val pVal = 5
    private var pVar = 7

    init {
        weatherList = arrayListOf(
            Weather("New-York", true,-9)
        )
        val w = Weather("Saratov" , false,-10)
        val w1 = Weather( isHomeTown = false, temperature = 25, town = "Samara")
        val w2 = Weather("Ul'yanovsk", temperature = 3, isHomeTown = true)
        pVar = -9
        val copyClass =  w.copy(temperature = -15)
        MainActivity.TAG
        MainActivity.doIt()
        val s = if (w.temperature > 0) {
            w1.isHomeTown
            "teplo"
        } else {
            "holodno"
        }

        val s1 = when (w.temperature) {
            -30 -> "och holodno"
            -20 -> "teplee"
            0 -> "norm"
            else -> "teplo"

        }

    }

    fun getWeatherList() : List<Weather> {
        weatherList.add(Weather())
        val vs = MainViewState(weatherList0)
        vs.weatherList = emptyList()
        return weatherList0
    }

    fun cycle(){
        for (weather in weatherList){
            Log.e("tag",weather.toString())
        }

        for (i in 0..10){
            Log.e(null, i.toString())
        }

        for (i in 10 downTo 0 step 2)
            Log.e(null, i.toString())

        for (i in weatherList.indices){
            Log.e(null, i.toString())
        }
    }

    fun getWeather() : List<Weather> = weatherList0

    fun getItemCount() = weatherList.size

    fun printStings(vararg strings: String) {
        for (s in strings){
            Log.e("vararg", s)
        }
    }
}