package com.example.appaplicatestes.options.ui.warning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appaplicatestes.R
import com.example.appaplicatestes.databinding.FragmentWarningBinding


class WarningFragment : Fragment() {

    private lateinit var binding: FragmentWarningBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWarningBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textWarning.text = "Atenção"
    }
}