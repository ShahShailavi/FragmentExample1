package edu.fullerton.shailavishah.fragmentexample1

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment.*
import java.text.DecimalFormat

class addFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var networkSpeed: EditText? = null
        var fileSize: EditText? = null
        var textView4: TextView? = null



//        networkSpeed = findViewById<View>(R.id.networkSpeed)
//        fileSize = findViewById<View>(R.id.fileSize)
//        textView4 = findViewById<View>(R.id.textView4)

            networkSpeed=networkSpeedAct;
            fileSize=fileSizeAct;
            textView4=textView4Act;

            fileSize!!.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                }

                override fun afterTextChanged(s: Editable) {
                    if (networkSpeed!!.text.toString().length > 0 && fileSize!!.text.toString().length > 0) {
                        val dblNetworkSpeed = java.lang.Double.parseDouble(networkSpeed!!.text.toString())
                        val dblFileSize = java.lang.Double.parseDouble(fileSize!!.text.toString())
                        textView4!!.setTextColor(Color.BLACK)
                        textView4!!.text = "Computed transfer time in seconds: " + DecimalFormat("##.#").format(dblFileSize * 1024.0 * 1024.0 * 8.0 / (dblNetworkSpeed * 1000000))
                    } else {
                        textView4!!.setTextColor(Color.RED)
                        textView4!!.text = "Please enter above mentioned value"
                    }
                }
            })
            networkSpeed!!.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                }

                override fun afterTextChanged(s: Editable) {
                    if (networkSpeed!!.text.toString().length > 0 && fileSize!!.text.toString().length > 0) {
                        val dblNetworkSpeed = java.lang.Double.parseDouble(networkSpeed!!.text.toString())
                        val dblFileSize = java.lang.Double.parseDouble(fileSize!!.text.toString())
                        textView4!!.setTextColor(Color.BLACK)
                        textView4!!.text = "Computed transfer time in seconds: " + DecimalFormat("##.#").format(dblFileSize * 1024.0 * 1024.0 * 8.0 / (dblNetworkSpeed * 1000000))
                    } else {
                        textView4!!.setTextColor(Color.RED)
                        textView4!!.text = "Please enter above mentioned value"
                    }
                }
            })
        }
    }