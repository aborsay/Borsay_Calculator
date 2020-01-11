package xyz.borsay.borsaycalculator.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import xyz.borsay.borsaycalculator.R
import xyz.borsay.borsaycalculator.viewmodel.MainViewModel

class MainFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View {
        val view: View = inflater!!.inflate(R.layout.main_fragment, container, false)
        //val digitNine: Button =
        view.findViewById<Button>(R.id.digitNine).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitEight).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitSeven).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitSix).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitFive).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitFour).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitThree).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitTwo).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitOne).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitZero).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitSign).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitDecimal).setOnClickListener(this)
        view.findViewById<Button>(R.id.basicDivide).setOnClickListener(this)
        view.findViewById<Button>(R.id.basicMultiply).setOnClickListener(this)
        view.findViewById<Button>(R.id.basicSubtract).setOnClickListener(this)
        view.findViewById<Button>(R.id.basicAdd).setOnClickListener(this)
        view.findViewById<Button>(R.id.basicEqual).setOnClickListener(this)
        view.findViewById<Button>(R.id.digitDelete).setOnClickListener(this)


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onClick(v: View?) {
        var digit:String
        when(v?.id){
            R.id.digitNine,
            R.id.digitEight,
            R.id.digitSeven,
            R.id.digitSix,
            R.id.digitFive,
            R.id.digitFour,
            R.id.digitThree,
            R.id.digitTwo,
            R.id.digitOne->{
                Toast.makeText(activity, "nine",Toast.LENGTH_LONG).show()

                digit = (v as Button).text.toString()
                viewModel.onDigit(digit)
            }
            R.id.digitDecimal -> {

            }
            R.id.digitDelete ->{

            }
            R.id.basicDivide -> {
            }
            R.id.basicMultiply -> {

            }
            R.id.basicAdd -> {

            }
            R.id.basicSubtract -> {

            }
            else ->{
                Toast.makeText(activity, "BLANK",Toast.LENGTH_LONG).show()

            }
        }
    }

    fun onDigit(view: View){
        Log.d("here","h")
        var digit:String = (view as Button).text.toString()
       // val model = ViewModelProviders.of(this)[MainViewModel::class.java]
        //model.onDigit(digit)
        //
    }
    fun onOperation(view: View){

    }

    fun onDeleta(view: View){

    }

    fun onDecimal(view: View){

    }

    fun onChangeSign(view: View){

    }
}
