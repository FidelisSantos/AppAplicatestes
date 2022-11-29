package com.example.appaplicatestes.options.ui.intelligence

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appaplicatestes.databinding.FragmentIntelligenceBinding


class IntelligenceFragment : Fragment() {

    private lateinit var binding: FragmentIntelligenceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentIntelligenceBinding.inflate(inflater, container, false)
        return binding.root
    }
}