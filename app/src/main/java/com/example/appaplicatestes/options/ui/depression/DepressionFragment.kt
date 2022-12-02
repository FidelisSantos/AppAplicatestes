package com.example.appaplicatestes.options.ui.depression

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appaplicatestes.databinding.FragmentDepressionBinding
import com.example.appaplicatestes.options.OptionsActivity
import com.example.appaplicatestes.options.ui.depression.activys.BdiIiActivity


class DepressionFragment : Fragment() {
    private lateinit var  binding: FragmentDepressionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentDepressionBinding.inflate(inflater, container, false)
        binding.btnBdiIi.setOnClickListener {
            val intent = Intent(this.activity, BdiIiActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

}