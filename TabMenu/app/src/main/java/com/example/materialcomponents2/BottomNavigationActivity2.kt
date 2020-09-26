package com.example.materialcomponents2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bottom_navigation2.*

class BottomNavigationActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation2)

        val frag = AlbumsFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()

        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.recentes -> {
                    val frag = RecentsFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()
                }
                R.id.albuns -> {
                    val frag = AlbumsFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()
                }
                R.id.artistas -> {
                    val frag = ArtistsFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()
                }
            }

            true
        }
    }
}