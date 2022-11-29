package com.example.appaplicatestes.options.ui.depression

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appaplicatestes.databinding.FragmentDepressionBinding


class DepressionFragment : Fragment() {
    private lateinit var  binding: FragmentDepressionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDepressionBinding.inflate(inflater, container, false)
        return binding.root
    }
}