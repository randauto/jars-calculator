package com.bip.jars

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bip.jars.model.JarsModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                calcuLator()
            }

        })


    }

    private fun calcuLator() {

        try {
            val currentMoney: Double? = editText.numericValue

            val jarsModel = JarsModel(currentMoney = currentMoney)
            etNec.setText(jarsModel.getNec().toString())
            etEdu.setText(jarsModel.getEdu().toString())
            etFfa.setText(jarsModel.getFfa().toString())
            etGive.setText(jarsModel.getGive().toString())
            etLts.setText(jarsModel.getLts().toString())
            etPlay.setText(jarsModel.getPlay().toString())

        } catch (ex: Exception) {
            Log.d(TAG, ex.message)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_about -> openAbout()
            R.id.action_setting -> openSetting()
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openSetting(): Boolean {
        startActivity(Intent(this, SettingActivity::class.java))
        return true
    }

    private fun openAbout(): Boolean {
        startActivity(Intent(this, AboutActivity::class.java))

        return true
    }
}
