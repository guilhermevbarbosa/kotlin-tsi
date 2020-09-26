package com.example.materialcomponents2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageAdapter = TabPageAdapter(this)

        viewPager.adapter = pageAdapter

        val tlm = TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when(position){
                0 -> {
                    tab.text = "Recentes"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.history)
                }
                1 -> {
                    tab.text = "Álbuns"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.album)
                }
                2 -> {
                    tab.text = "Artistas"
                    tab.icon = ContextCompat.getDrawable(this, R.drawable.artist)
                }
            }
        }

        tlm.attach()
    }
}