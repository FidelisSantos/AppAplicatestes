package com.example.appaplicatestes.options.ui.personality

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appaplicatestes.databinding.FragmentPersonalityBinding

class PersonalityFragment : Fragment() {

    private lateinit var binding:FragmentPersonalityBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPersonalityBinding.inflate(inflater, container,false)
        return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textPersonality.text="Personalidade"
    }
}