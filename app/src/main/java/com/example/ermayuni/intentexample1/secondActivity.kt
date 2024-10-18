package com.example.ermayuni.intentexample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ermayuni.intentexample1.databinding. SecondActivityBinding
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {
    private val log = Logger.getLogger(SecondActivity::class.java.name)
    private lateinit var binding: SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        log.info("onCreate")

        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        log.info("onStop")
    }
}
