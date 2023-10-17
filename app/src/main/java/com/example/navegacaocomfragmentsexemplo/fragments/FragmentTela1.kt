package com.example.navegacaocomfragmentsexemplo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navegacaocomfragmentsexemplo.databinding.FragmentTela1Binding

class FragmentTela1 : Fragment() {

    private lateinit var binding: FragmentTela1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTela1Binding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    /*
        Este método é chamado após a criação da View do fragmento;
        Você pode adicionar lógica adicional relacionada a esta tela aqui.
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}