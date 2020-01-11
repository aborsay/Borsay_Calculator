package xyz.borsay.borsaycalculator.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProviders
import xyz.borsay.borsaycalculator.R
import xyz.borsay.borsaycalculator.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit){
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            showGeneralCalculator()
            /*
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()


            supportFragmentManager.inTransaction {
                add(R.id.container,MainFragment.newInstance())
            }*/
        }
        lateinit var viewModel: MainViewModel

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.ad
    }

    private fun showGeneralCalculator(){
        val transaction = manager.beginTransaction()
        val fragment = MainFragment()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


    }


}
