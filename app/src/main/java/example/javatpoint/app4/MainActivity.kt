package example.javatpoint.app4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var number:String=""
    var numberOne:Float=0.0F
    var numbertwo:Float=0.0F
    var isDivide:Boolean=false
    var isAddition:Boolean=false
    var isSubtract : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun operationFunction(view:View){
        var editText:EditText?=findViewById(R.id.edit_text)
        when(view.id){
            R.id.button_one->{
                number+="1"
                editText?.setText(number)}
            R.id.button_two ->{
                number += "2"
                editText?.setText(number)
            }
            R.id.button_three ->{
                number += "3"
                editText?.setText(number)
            }
            R.id.button_four ->{
                number += "4"
                editText?.setText(number)
            }
            R.id.button_five ->{
                number += "5"
                editText?.setText(number)
            }
            R.id.button_six ->{
                number += "6"
                editText?.setText(number)
            }
            R.id.button_seven ->{
                number += "7"
                editText?.setText(number)
            }
            R.id.button_eight ->{
                number += "8"
                editText?.setText(number)
            }
            R.id.button_nine ->{
                number += "9"
                editText?.setText(number)
            }
            R.id.button_zero ->{
                number += "0"
                editText?.setText(number)
            }
            R.id.button_clear -> {
                number=""
                editText?.setText("")

                }
            R.id.button_dot->{
                number+="."
                editText?.setText(number)
            }
            R.id.button_plus ->{
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }
                else{
                    numberOne=number.toFloat()
                    editText?.setText("")
                    isAddition=true
                    number=""
                }
            }
            R.id.button_divide->{
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne=number.toFloat()
                    editText?.setText("")
                    isDivide=true
                    number=""

                }
            }
            R.id.button_equal->{
                if(isAddition==true){
                    numbertwo=number.toFloat()
                    editText?.setText((numberOne+numbertwo).toString())

                }
                else if(isDivide){
                    numbertwo=number.toFloat()
                    editText?.setText((numberOne/numbertwo).toString())

                }
            }
            R.id.button_subtract ->{
                if (number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    editText?.setText("")
                    isSubtract = true
                    number = ""
                }
            }
            R.id.button_equal ->{

                if (isAddition == true){
                    numbertwo = number.toFloat()
                    editText?.setText((numberOne+numbertwo).toString())
                }else if(isDivide){
                    numbertwo = number.toFloat()
                    editText?.setText((numberOne/numbertwo).toString())
                }else if(isSubtract){
                    numbertwo = number.toFloat()
                    editText?.setText((numberOne - numbertwo).toString())
                }else{
                    editText?.setText("")
                }

            }

        }
    }
}