package id.my.okisulton.changeicon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val  result: String? = intent.getStringExtra("entername")
        tvname.text = result

    }

    fun back(view: View) {
        finish()
    }

    fun startcount(view: View) {
        var time: Long?
        if (ettime.text.isEmpty()){
            time = 0
        }else{
            time = ettime.text.toString().toLong()
            object : CountDownTimer((time*1000), 1000){
                override fun onTick(p0: Long) {
                    tvshow.text = (p0/1000).toString()
                }

                override fun onFinish() {
                    tvshow.text = "0"
                }

            }.start()
        }
        
    }
}