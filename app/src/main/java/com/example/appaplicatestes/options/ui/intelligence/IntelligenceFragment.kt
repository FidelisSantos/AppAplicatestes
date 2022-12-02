package com.example.appaplicatestes.options.ui.intelligence

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appaplicatestes.databinding.FragmentIntelligenceBinding
import com.example.appaplicatestes.options.ui.intelligence.activys.CpmActivity
import com.example.appaplicatestes.options.ui.intelligence.activys.G36Activity


class IntelligenceFragment : Fragment() {

    private lateinit var binding: FragmentIntelligenceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentIntelligenceBinding.inflate(inflater, container, false)
        binding.btnG36.setOnClickListener {
            val intent = Intent(this.activity, G36Activity::class.java)
            startActivity(intent)
        }
        binding.btnCpm.setOnClickListener {
            val intent = Intent(this.activity, CpmActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}