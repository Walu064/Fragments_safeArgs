package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val textViewFirst : TextView = view.findViewById(R.id.textView_pass)
        textViewFirst.setOnClickListener{
            val input : EditText = view.findViewById(R.id.editTextTextPersonName)
            val action = FirstFragmentDirections.goToSecondFragment(input.text.toString())
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }
}