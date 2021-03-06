package id.my.okisulton.changeicon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2.setTag("a")
    }

    fun change(view: View) {

        if(imageView2.getTag() == "a"){
            imageView2.setImageResource(R.drawable.southpark2)
            imageView2.setTag("b")
        }else{
            imageView2.setImageResource(R.drawable.southpark1)
            imageView2.setTag("a")
        }
    }

    fun moveto(view: View) {
        val intent = Intent(applicationContext, MainActivity2::class.java)
        intent.putExtra("entername", entername.text.toString())
        startActivity(intent)
    }

    fun stopwatch(view: View) {
        val intent = Intent(applicationContext, StopWatch::class.java)
        startActivity(intent)
    }

    fun listvuew(view: View) {
        val intent = Intent(applicationContext, ListView::class.java)
        startActivity(intent)
    }
}