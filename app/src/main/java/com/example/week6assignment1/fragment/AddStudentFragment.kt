package com.example.week6assignment1.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.week6assignment1.MainActivity
import com.example.week6assignment1.R
import com.example.week6assignment1.communicator
import com.example.week6assignment1.model.studentClass

class AddStudentFragment : Fragment() {

    private lateinit var fullname: EditText
    private lateinit var age: EditText
    private lateinit var genderGroup: RadioGroup
    private lateinit var genderMale: RadioButton
    private lateinit var genderFemale: RadioButton
    private lateinit var genderOthers: RadioButton
    private lateinit var address: EditText
    private lateinit var saveButton: Button
    private lateinit var  comm : communicator

    private var array = ArrayList<String>()

    var genderSelected: String = ""
    var gender: String = ""
    private var liststudent = ArrayList<studentClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)

        binding(view)
        genderSelected = genderSelection()
        comm = activity as communicator


        saveButton.setOnClickListener(){
           comm.passDataCom(fullname.text.toString())

        }

//        saveButton.setOnClickListener() {
//            var name = fullname
//            val age = age.text.toString()
//            var address = address.text.toString()
//            var gender = genderSelected
//
//            liststudent.add(
//                studentClass(
//                    "https://www.facebook.com/photo/?fbid=1782298345280131&set=a.101177116725604",
//                    "$name", "$age", "$address", "$gender"
//                )
//            )
//        }
//        val intent = Intent(context, MainActivity::class.java)
//        intent.putExtra("liststudent", liststudent)
//        startActivity(intent)
//
        return view
    }

    private fun genderSelection(): String {
        genderGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { radioGroup, checkedID ->
                if (genderMale.isChecked) {
                    gender = "male"
//                    Toast.makeText(context, "$gender is selected", Toast.LENGTH_SHORT).show()
                }
                if (genderFemale.isChecked) {
                    gender = "female"
//                    Toast.makeText(context, "$gender is selected", Toast.LENGTH_SHORT).show()

                }

                if (genderOthers.isChecked) {
                    gender = "others"
//                    Toast.makeText(context, "$gender is selected", Toast.LENGTH_SHORT).show()
                }
            }
        )
        return gender
    }

    private fun binding(view: View) {
        fullname = view.findViewById(R.id.etFullName)
        age = view.findViewById(R.id.etAge)
        genderGroup = view.findViewById(R.id.genderRadio)
        genderMale = view.findViewById(R.id.gendermale)
        genderFemale = view.findViewById(R.id.genderfemale)
        genderOthers = view.findViewById(R.id.genderothers)
        address = view.findViewById(R.id.etAddress)
        saveButton = view.findViewById(R.id.btnSave)
    }
}

