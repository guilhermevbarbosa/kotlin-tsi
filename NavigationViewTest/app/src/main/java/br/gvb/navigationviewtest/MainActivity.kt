package br.gvb.navigationviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var toggle: ActionBarDrawerToggle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.closed)

        toggle?.let {
            drawerLayout.addDrawerListener(it)
            it.syncState()
        }

        navigationView.setNavigationItemSelectedListener {
            drawerLayout.closeDrawers()

            if(it.itemId == R.id.catalogo){
                val frag = Fragmento01()
                supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()

                true
            }else if (it.itemId == R.id.carrinho){
                val frag = Fragmento02()
                supportFragmentManager.beginTransaction().replace(R.id.fragContainer, frag).commit()

                true
            }

            false
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        toggle?.let {
            return it.onOptionsItemSelected(item)
        }

        return super.onOptionsItemSelected(item)
    }
}