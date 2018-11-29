package edu.fullerton.shailavishah.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.transaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            supportFragmentManager.transaction(allowStateLoss = true) {
                replace(R.id.fragment_container, addFragment())

                // supportFragmentManager.beginTransaction().add(R.id.fragment_container,addFragment()).commit()

            }
        }
    }
}

