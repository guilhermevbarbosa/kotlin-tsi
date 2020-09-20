package br.gvb.aula3

import android.app.AlertDialog
import android.content.Context

fun alert (title: String, msg: String, Context: Context) {
    val builder = AlertDialog.Builder(Context)

    builder
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("OK",null)
        .create()
        .show()
}