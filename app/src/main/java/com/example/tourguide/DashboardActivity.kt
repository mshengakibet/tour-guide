package com.example.tourguide

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import com.example.tourguide.R

class DashboardActivity : AppCompatActivity() {
    lateinit var hotel: CardView
    lateinit var places: CardView
    lateinit var Profile: CardView
    lateinit var location: CardView
    lateinit var contact: CardView
    lateinit var Logout: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        hotel = findViewById(R.id.cardhotel)
        places = findViewById(R.id.cardChat)
        Profile = findViewById(R.id.cardProfile)
        location = findViewById(R.id.cardWidgets)
        contact = findViewById(R.id.cardSettings)
        Logout = findViewById(R.id.cardlogout)

        hotel.setOnClickListener {
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)

        }
        places.setOnClickListener {
            val intent = Intent(this, OtherplacesActivity::class.java)
            startActivity(intent)
        }
        Profile.setOnClickListener {
            val intent = Intent(this, TourGuideActivity::class.java)
            startActivity(intent)
        }
        location.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        contact.setOnClickListener {
            val intent = Intent(this, EmailActivity::class.java)
            startActivity(intent)

        }
        Logout.setOnClickListener {

            var box = AlertDialog.Builder(this)
            box.setMessage("Do you want to exit?")
            box.setPositiveButton("PROCEED",DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id ->cancel()  })


            var alert = box.create()
            alert.setTitle("Tour Guide")
            alert.show()
        }

    }

    private fun cancel() {
        TODO("Not yet implemented")
    }

}