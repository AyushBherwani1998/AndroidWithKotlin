package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val doneButton = findViewById<Button>(R.id.button)

        doneButton.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view: View){
        val nickname_edit = findViewById<EditText>(R.id.nickname_edit)
        val nickname_text = findViewById<TextView>(R.id.nickname_text)

        nickname_text.text = nickname_edit.text
        nickname_edit.visibility = View.GONE
        nickname_text.visibility = View.VISIBLE
        view.visibility = View.GONE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
