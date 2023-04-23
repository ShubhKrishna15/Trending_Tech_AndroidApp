package com.example.trending_tech_androidapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ml = findViewById<Button>(R.id.button9)
        val aI = findViewById<Button>(R.id.button8)
        val webDev = findViewById<Button>(R.id.button2)
        val blockChain = findViewById<Button>(R.id.button3)
        val android = findViewById<Button>(R.id.button7)
        val iOS = findViewById<Button>(R.id.button6)


        ml.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.netapp.com/artificial-intelligence/what-is-machine-learning/#:~:text=A%20subset%20of%20artificial%20intelligence,making%20outside%20of%20human%20interaction.")
            startActivity(intent)
        }
        aI.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.ibm.com/in-en/topics/artificial-intelligence#:~:text=Artificial%20intelligence%20leverages%20computers%20and,capabilities%20of%20the%20human%20mind")
            startActivity(intent)
        }

        webDev.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/whatis/")
            startActivity(intent)
        }
        blockChain.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.investopedia.com/terms/b/blockchain.asp")
            startActivity(intent)
        }

        android.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Android_software_development#:~:text=Android%20software%20development%20is%20the,other%20languages%20is%20also%20possible.")
            startActivity(intent)
        }


        iOS.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://redblink.com/learn-ios-development/")
            startActivity(intent)
        }

    }
}