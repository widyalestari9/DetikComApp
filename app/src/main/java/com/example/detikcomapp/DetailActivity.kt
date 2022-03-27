package com.example.detikcomapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_titleNews.setText(intent.getStringExtra(cont_TitleNews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews)!!.toInt())

        btn_back.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(p0: View?) {
                val intentMain = Intent(this@DetailActivity, MainActivity::class.java)

                startActivity(intentMain)
                finish()
            }
        })
    }
}