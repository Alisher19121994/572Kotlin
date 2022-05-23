package com.example.a572kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a571kotlin.`1-Adapters`.Main_Adapter
import com.example.a571kotlin.`1-Models`.Contents
import com.example.a572kotlin.`2-Adapter`.Adapter_Short_Videos
import com.example.a572kotlin.`2-Models`.Shorts

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var shorts_rec: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        shorts_rec = findViewById(R.id.main_2_recyclerView_id)
        shorts_rec.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        adapterFun(dataOfShorts())
        getAdapter(data())
    }

    private fun dataOfShorts(): ArrayList<Shorts> {
        val shortsList = ArrayList<Shorts>()
        shortsList.add(
            Shorts(
                R.drawable.rasm5,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm5,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm6,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm6,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm7,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm5,
                "Yevropadagi IT sanoati bilan tanishuv",
                "158K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm9,
                "Yevropadagi IT sanoati bilan tanishuv",
                "487K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm,
                "Yevropadagi IT sanoati bilan tanishuv",
                "17K views"
            )
        )
        shortsList.add(
            Shorts(
                R.drawable.rasm7,
                "Yevropadagi IT sanoati bilan tanishuv",
                "98K views"
            )
        )
        return shortsList
    }

    private fun adapterFun(list: ArrayList<Shorts>) {
        val adapter = Adapter_Short_Videos(this, list)
        shorts_rec.adapter = adapter
    }

    private fun data(): ArrayList<Contents> {
        val contents = ArrayList<Contents>()
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        return contents
    }

    private fun getAdapter(list: ArrayList<Contents>) {
        val adapter = Main_Adapter(this, list)
        recyclerView.adapter = adapter
    }
}