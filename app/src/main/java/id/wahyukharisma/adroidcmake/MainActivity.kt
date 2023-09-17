package id.wahyukharisma.adroidcmake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.wahyukharisma.adroidcmake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("native-lib")
    }

    private external fun getKey(): String

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvIntro.text = getKey()
    }
}