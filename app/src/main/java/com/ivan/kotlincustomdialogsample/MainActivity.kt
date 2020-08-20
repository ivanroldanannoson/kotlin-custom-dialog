package com.ivan.kotlincustomdialogsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomDialog(this, object : CustomDialog.CustomDialogOnClick {
            override fun onClickEvent() {
                showToast()
            }
        }).show()
    }

    fun showToast() {
        Toast.makeText(this, "Sample toast", Toast.LENGTH_LONG).show()
    }
}
