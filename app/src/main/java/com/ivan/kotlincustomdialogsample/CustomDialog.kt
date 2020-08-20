package com.ivan.kotlincustomdialogsample

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.custom_dialog.*

class CustomDialog(context: Context, customDialogOnClick: CustomDialogOnClick) : Dialog(context) {

    init {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(R.layout.custom_dialog)

        setCancelable(true)
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(this.window?.attributes)
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.gravity = Gravity.CENTER
        this.window?.attributes = layoutParams

        button.setOnClickListener {
            customDialogOnClick.onClickEvent()
        }
    }

    interface CustomDialogOnClick {
        fun onClickEvent()
    }
}