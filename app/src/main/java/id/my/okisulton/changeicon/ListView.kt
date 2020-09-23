package id.my.okisulton.changeicon

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var kumpulanList = ArrayList<String>()
        kumpulanList.add("Oki")
        kumpulanList.add("Sulton")
        kumpulanList.add("Alimi")
        kumpulanList.add("Orang")
        kumpulanList.add("Paling")
        kumpulanList.add("Ganteng")

        val oki = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.oki)
        val sulton = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.sulton)
        val alimi = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.alimi)
        val orang = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.orang)
        val paling = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.paling)
        val ganteng = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ganteng)

        var kumpulanGambar = ArrayList<Bitmap>()
        kumpulanGambar.add(oki)
        kumpulanGambar.add(sulton)
        kumpulanGambar.add(alimi)
        kumpulanGambar.add(orang)
        kumpulanGambar.add(paling)
        kumpulanGambar.add(ganteng)

        var arrayadapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, kumpulanList)
        listView.adapter = arrayadapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(applicationContext, Detail::class.java)
            intent.putExtra("nama", kumpulanList[i])
            val panggil = Globals.Dipilih
            panggil.gambarTerpilih = kumpulanGambar[i]
            startActivity(intent)
        }
    }
}
