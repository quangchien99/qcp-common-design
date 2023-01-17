package com.example.commondesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.qcp.common_design.dialog.elegant.ElegantDialog
import com.qcp.common_design.dialog.elegant.background
import com.qcp.common_design.dialog.elegant.body
import com.qcp.common_design.dialog.elegant.icon
import com.qcp.common_design.dialog.elegant.onClose
import com.qcp.common_design.dialog.elegant.onNegative
import com.qcp.common_design.dialog.elegant.onPositive
import com.qcp.common_design.dialog.elegant.position
import com.qcp.common_design.dialog.elegant.title
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title = "Congratulations"
        val body = "Your New Account has been created"
        val goToMyAccount = "Go To My Account"
        val cancel = "Cancel"
        first.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .onClose()
        }
        second.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .icon(com.qcp.common_design.R.drawable.ic_congrts)
                .onClose()
        }
        third.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .icon(com.qcp.common_design.R.drawable.ic_congrts)
                .onPositive(goToMyAccount) {
                    Log.d("TAG", "positive ")
                }
                .onClose()
        }
        fourth.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .icon(com.qcp.common_design.R.drawable.ic_congrts)
                .onPositive(goToMyAccount) {
                    Log.d("TAG", "positive ")
                }
                .onNegative(cancel) {
                    Log.d("TAG", "negative ")
                }
                .onClose()
        }
        fifth.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .onPositive(goToMyAccount) {
                    Log.d("TAG", "positive ")
                }
                .onClose()
        }
        sixth.setOnClickListener {
            ElegantDialog.build(this)
                .title(title)
                .body(body)
                .onPositive(goToMyAccount) {
                    Log.d("TAG", "positive ")
                }
                .onNegative(cancel) {
                    Log.d("TAG", "negative ")
                }
                .onClose()
        }
        seventh.setOnClickListener {
            ElegantDialog.build(this)
                .title(
                    title,
                    titleColor = ContextCompat.getColor(this, android.R.color.white)
                )
                .body(
                    body,
                    color = ContextCompat.getColor(this, android.R.color.white)
                )
                .background(R.drawable.layout_rounded_green)
                .onPositive(
                    goToMyAccount,
                    buttonBackgroundColor = R.drawable.layout_rounded_dark_white,
                    textColor = ContextCompat.getColor(this, android.R.color.black)
                ) {
                    Log.d("TAG", "positive ")
                }
                .onNegative(
                    cancel,
                    buttonBackgroundColor = R.drawable.layout_rounded_dark_white,
                    textColor = ContextCompat.getColor(this, android.R.color.black)
                ) {
                    Log.d("TAG", "negative ")
                }
                .onClose(
                    buttonColor = ContextCompat.getColor(this, android.R.color.white)
                )
        }
        eighth.setOnClickListener {
            ElegantDialog.build(this)
                .title(
                    title,
                    titleColor = ContextCompat.getColor(this, android.R.color.white)
                )
                .body(
                    body,
                    color = ContextCompat.getColor(this, android.R.color.white)
                )
                .icon(com.qcp.common_design.R.drawable.ic_congrts)
                .background(R.drawable.layout_rounded_green)
                .onPositive(
                    goToMyAccount,
                    buttonBackgroundColor = R.drawable.layout_rounded_dark_white,
                    textColor = ContextCompat.getColor(this, android.R.color.black)
                ) {
                    Log.d("TAG", "positive ")
                }
                .onClose(
                    buttonColor = ContextCompat.getColor(this, android.R.color.white)
                )
        }
        nine.setOnClickListener {
            ElegantDialog.build(this)
                .title(
                    title,
                    titleColor = ContextCompat.getColor(this, android.R.color.white)
                )
                .body(
                    body,
                    color = ContextCompat.getColor(this, android.R.color.white)
                )
                .icon(com.qcp.common_design.R.drawable.ic_congrts)
                .background(R.drawable.layout_rounded_green)
                .position(ElegantDialog.POSITIONS.CENTER)
                .onPositive(
                    goToMyAccount,
                    buttonBackgroundColor = R.drawable.layout_rounded_dark_white,
                    textColor = ContextCompat.getColor(this, android.R.color.black)
                ) {
                    Log.d("TAG", "positive ")
                }
                .onClose(
                    buttonColor = ContextCompat.getColor(this, android.R.color.white)
                )
        }
    }
}