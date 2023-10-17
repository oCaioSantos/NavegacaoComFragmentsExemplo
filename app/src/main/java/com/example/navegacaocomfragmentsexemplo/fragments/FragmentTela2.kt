package com.example.navegacaocomfragmentsexemplo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navegacaocomfragmentsexemplo.R
import com.example.navegacaocomfragmentsexemplo.databinding.FragmentTela2Binding

class FragmentTela2 : Fragment() {

    private lateinit var binding: FragmentTela2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTela2Binding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}