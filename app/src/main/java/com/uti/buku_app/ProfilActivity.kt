package com.uti.buku_app

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.uti.buku_app.database.DatabaseHelper

class ProfilActivity : AppCompatActivity() {
    private lateinit var dbHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        dbHelper = DatabaseHelper(this)

        val prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val username = prefs.getString("username", "") ?: ""

        val user = dbHelper.getUserProfile(username)
        if (user != null) {
            findViewById<TextView>(R.id.nameText).text = user.name
            findViewById<TextView>(R.id.emailText).text = user.email
            findViewById<TextView>(R.id.phoneText).text = user.phone
        } else {
            Toast.makeText(this, "Failed to load profile data", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialButton>(R.id.editProfileButton).setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()

        val prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val username = prefs.getString("username", "") ?: ""
        val user = dbHelper.getUserProfile(username)
        if (user != null) {
            findViewById<TextView>(R.id.nameText).text = user.name
            findViewById<TextView>(R.id.emailText).text = user.email
            findViewById<TextView>(R.id.phoneText).text = user.phone
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish() // menggantikan onBackPressed() agar tidak deprecated
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
