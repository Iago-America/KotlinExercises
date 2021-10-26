package com.example.exerccio_linearlayoutcheckboxeimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CheckboxClicked.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id

        if (id == R.id.CheckboxClicked) {
            checked3()
        }
    }

    private fun checked3() {
        if (CheckboxClicked.isChecked) {
            luz.setColorFilter(resources.getColor(R.color.yellow))
        } else {
            luz.setColorFilter(resources.getColor(R.color.black))
        }
    }


}