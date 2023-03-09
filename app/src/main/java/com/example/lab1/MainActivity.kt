package com.example.lab1


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mEdit: EditText? = null
    private var mConvert: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mEdit = findViewById<View>(R.id.enter) as EditText

        mConvert = findViewById<View>(R.id.Cels) as RadioButton
    }


    private fun convertCtoF(cels: Float): Float {
        return (cels * 1.8 + 32).toFloat()
    }


    private fun convertFtoC(fara: Float): Float {
        return ((fara - 32) / 1.8).toFloat()
    }


    fun onClick(view: View) {
        when (view.getId()) {
            R.id.convert -> {
                val toast = Toast.makeText(this, "Невірне значення", Toast.LENGTH_LONG)
                var enterNumber: Float
                enterNumber = 0.1F
                try {
                    enterNumber = mEdit!!.text.toString().toFloat()
                } catch (e: Exception) {

                    toast.show()
                }

                    if (mConvert!!.isChecked) {
                        if (enterNumber == 0.1F){
                            toast.show()
                        }
                        else{
                            mEdit!!.setText(convertFtoC(enterNumber).toString())
                        }

                    } else {
                        if (enterNumber == 0.1F){
                            toast.show()
                        }
                        else{
                            mEdit!!.setText(convertCtoF(enterNumber).toString())
                        }

                    }




            }
        }
    }

}