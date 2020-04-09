package com.elyeproj.appcompanion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.development.activity_setting.*

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        setting_button.setOnClickListener {
            val value: String = setting_edit_text.text.toString()
            value.takeIf { it.isNotBlank() }?.let {
                Setting.setSetting(this, it)
            }
        }
    }
}
