package id.my.okisulton.changeicon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_stop_watch.*

class StopWatch : AppCompatActivity() {
    var number:Int = 0
    var handler:Handler = Handler()
    var runnable:Runnable = Runnable {  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stop_watch)
        timer.text = number.toString()

    }

    fun start(view: View) {
        
            number = 0
            runnable = object:Runnable{
                override fun run() {
                    timer.text = number.toString()
                    number++
                    timer.text = number.toString()
                    handler.postDelayed(this, 1000)
                }
            }
            handler.post(runnable)

    }
    fun stop(view: View) {
        handler.removeCallbacks(runnable)
        number=0
        timer.text = number.toString()
//        if (timer.text.toString().toInt()>1){
//            button5.isClickable=true
//        }else{
//            button6.isClickable=false
//        }
    }
}


