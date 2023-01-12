package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    private val args : SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val textViewName : TextView = view.findViewById(R.id.textView_name)
        val insertedName = args.name
        textViewName.text = insertedName

        val textViewReturn : TextView = view.findViewById(R.id.textView_return)
        textViewReturn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.goToFirstFragment)
        }
        return view
    }
}