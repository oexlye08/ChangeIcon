package id.my.okisulton.changeicon

import android.graphics.Bitmap

/**
 *Created by osalimi on 23-09-2020.
 **/
class Globals {
    companion object Dipilih{
        var  gambarTerpilih: Bitmap? = null
        fun returnImage(): Bitmap? {
            return gambarTerpilih
        }
    }
}