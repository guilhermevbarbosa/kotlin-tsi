package br.gvb.exemplofragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class FragEstaticoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag_estatico)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.default_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.android_icon){
            val intent = Intent(this, FragDinamActivity::class.java)
            startActivity(intent)
            return true
        }else if (item.itemId == R.id.sair){
            finishAffinity()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}