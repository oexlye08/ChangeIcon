package id.my.okisulton.changeicon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extra = intent
        val nama = extra.getStringExtra("nama")
        textView.text = nama

        val panggil = Globals.Dipilih
        val  bitmap = panggil.returnImage()

        imageView.setImageBitmap(bitmap)
    }
}