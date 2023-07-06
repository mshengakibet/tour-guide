package com.example.tourguide

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TourGuideActivity : AppCompatActivity() {
    lateinit var mycall1: ImageView
    lateinit var mycall2: ImageView
    lateinit var mycall3: ImageView
    lateinit var mycall4: ImageView
    lateinit var mycall5: ImageView
    lateinit var mycall6: ImageView
    lateinit var mycall7: ImageView
    lateinit var myemail1: ImageView
    lateinit var myemail2: ImageView
    lateinit var myemail3: ImageView
    lateinit var myemail4: ImageView
    lateinit var myemail5: ImageView
    lateinit var myemail6: ImageView
    lateinit var myemail7: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_guide)
        mycall1 = findViewById(R.id.call1)
        mycall2 = findViewById(R.id.call2)
        mycall3 = findViewById(R.id.call3)
        mycall4 = findViewById(R.id.call4)
        mycall5 = findViewById(R.id.call5)
        mycall6 = findViewById(R.id.call6)
        mycall7 = findViewById(R.id.call7)
        myemail1 = findViewById(R.id.email1)
        myemail2 = findViewById(R.id.email2)
        myemail3 = findViewById(R.id.email3)
        myemail4 = findViewById(R.id.email4)
        myemail5 = findViewById(R.id.email5)
        myemail6 = findViewById(R.id.email6)
        myemail7 = findViewById(R.id.email7)

        mycall1.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0734567834")
            startActivity(dialIntent)
        }

        myemail1.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Amos56@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }
        mycall2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+25145678990")
            startActivity(dialIntent)

        }
        myemail2.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "annah56@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }

        mycall3.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+25145678990")
            startActivity(dialIntent)
        }
        myemail3.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Mohammed4@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        mycall4.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+9316539856145")
            startActivity(dialIntent)
        }
        myemail4.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Gonzalez34@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        mycall5.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+11239871356")
            startActivity(dialIntent)
        }
        myemail5.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Coban4@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        mycall6.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+2495634567834")
            startActivity(dialIntent)
        }
        myemail6.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Willian@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        mycall7.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+2540734567834")
            startActivity(dialIntent)
        }

        myemail7.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "Kinyua@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}
