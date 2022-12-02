package com.example.appaplicatestes.options.ui.warning

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appaplicatestes.databinding.FragmentWarningBinding
import com.example.appaplicatestes.options.ui.warning.activys.AcActivity
import com.example.appaplicatestes.options.ui.warning.activys.BpaActivity
import com.example.appaplicatestes.options.ui.warning.activys.NeupsilinActivity
import com.example.appaplicatestes.options.ui.warning.activys.RotasActivity


class WarningFragment : Fragment() {

    private lateinit var binding: FragmentWarningBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWarningBinding.inflate(inflater,container, false)

        binding.btnAc.setOnClickListener {
            val intent = Intent(this.activity, AcActivity::class.java)
            startActivity(intent)
        }

        binding.btnBpa.setOnClickListener {
            val intent = Intent(this.activity, BpaActivity::class.java)
            startActivity(intent)
        }

        binding.btnNeupsilin.setOnClickListener {
            val intent = Intent(this.activity, NeupsilinActivity::class.java)
            startActivity(intent)
        }

        binding.btnRotas.setOnClickListener {
            val intent = Intent(this.activity, RotasActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}