package com.fcdream.kotlin.app.weather

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.fcdream.kotlin.app.weather.adapter.ForecastListAdapter
import com.fcdream.kotlin.app.weather.bo.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private val items = listOf(
            "Mon	6/23	-	Sunny	-	31/17",
            "Tue	6/24	-	Foggy	-	21/8",
            "Wed	6/25	-	Cloudy	-	22/17",
            "Thurs	6/26	-	Rainy	-	18/11",
            "Fri	6/27	-	Foggy	-	21/10",
            "Sat	6/28	-	TRAPPED	IN	WEATHERSTATION	-	23/18",
            "Sun	6/29	-	Sunny	-	20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val person = Person("dsm", "shmdu")

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

    }

    fun niceToast(message: String = "Hello", tag: String = TAG, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    data class Forecast(val date: Date, val temperature: Float, val details: String)
}
