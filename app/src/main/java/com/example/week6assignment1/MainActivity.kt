package com.example.week6assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.ui.AppBarConfiguration
import com.example.week6assignment1.fragment.AboutUsFragment
import com.example.week6assignment1.fragment.AddStudentFragment
import com.example.week6assignment1.fragment.HomeFragment
import com.example.week6assignment1.model.studentClass
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), communicator {

    private lateinit var bottom_navigation: BottomNavigationView
//    private lateinit var homeFragment: HomeFragment

    private var lstStudent = ArrayList<studentClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation = findViewById(R.id.bottom_navigation)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container,HomeFragment())
            commit()
        }

        bottom_navigation.setOnNavigationItemReselectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, HomeFragment())
//                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        addToBackStack(null)
//                        setTransition(FragmentTransaction.TRANSIT_NONE)
                        commit()
                    }
                }

                R.id.nav_addStudent -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, AddStudentFragment())
//                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//                        setTransition(FragmentTransaction.TRANSIT_NONE)
                        addToBackStack(null)
                        commit()

                    }
                }

                R.id.nav_aboutUs -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, AboutUsFragment())
//                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                        setTrans3ition(FragmentTransaction.TRANSIT_NONE)
                        addToBackStack(null)
                        commit()
                    }
                }
            }

            true
        }
    }
    override fun passDataCom(FullName: String, age: String, gender: String, address: String) {
        val bundle = Bundle()
        bundle.putStringArrayList("message", liststudent)

    }
}