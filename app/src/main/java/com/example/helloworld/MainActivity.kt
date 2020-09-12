package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val MESSAGE_ID = "com.example.helloworld.MESSAGE_ID"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendClicked(v: View){
        Toast.makeText(this, "Send is clicked", Toast.LENGTH_SHORT).show()
        val messageEditText = findViewById<EditText>(R.id.message_etv)
        val message = messageEditText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra(MESSAGE_ID,message)
        startActivity(intent)
    }
}