package com.example.image_videopicker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.activity_videos.*


class VideosActivity : AppCompatActivity() {
    val Video : Int = 0
    val Image : Int = 0
    lateinit var uri : Uri
    lateinit var mStorage : StorageReference
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)
        title = "Videos"
        addvideofab.setOnClickListener {
            startActivity(Intent(this, AddVideoActivity::class.java))

        }
    }
}