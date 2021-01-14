package com.example.week6assignment1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6assignment1.R
import com.example.week6assignment1.adapter.studentadapter
import com.example.week6assignment1.model.studentClass

class HomeFragment : Fragment() {

    private lateinit var homerecyclerview : RecyclerView
    private var home = ArrayList<studentClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home,container,false)
        homerecyclerview = view.findViewById(R.id.homeRecyclerView)
        loadhome()
        val adapter = studentadapter(home,this)
        homerecyclerview.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        homerecyclerview.adapter = adapter
        return view
    }

    private fun loadhome() {
        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
        "Sujit Prasad Kushwaha","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "roshan koirala","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "riya pandey","21","Baniyatar","Female"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "Sujit Prasad Kushwaha","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "Sujit Prasad Kushwaha","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "Sujit Prasad Kushwaha","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "Sujit Prasad Kushwaha","21","Baniyatar","Male"))

        home.add(studentClass("https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
            "Sujit Prasad Kushwaha","21","Baniyatar","Male"))
    }
}