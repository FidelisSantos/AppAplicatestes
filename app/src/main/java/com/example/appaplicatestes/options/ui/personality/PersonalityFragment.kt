package com.example.appaplicatestes.options.ui.personality

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appaplicatestes.databinding.FragmentPersonalityBinding
import com.example.appaplicatestes.options.ui.personality.activys.HtpActivity
import com.example.appaplicatestes.options.ui.personality.activys.PalograficoActivity
import com.example.appaplicatestes.options.ui.personality.activys.PfisterActivity
import com.example.appaplicatestes.options.ui.personality.activys.QuatyActivity

class PersonalityFragment : Fragment() {

    private lateinit var binding:FragmentPersonalityBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPersonalityBinding.inflate(inflater, container,false)

        binding.btnHtp.setOnClickListener {
            val intent = Intent(this.activity,HtpActivity::class.java)
            startActivity(intent)
        }

        binding.btnPFister.setOnClickListener {
            val intent = Intent(this.activity,PfisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnPalografico.setOnClickListener {
            val intent = Intent(this.activity,PalograficoActivity::class.java)
            startActivity(intent)
        }

        binding.btnQuati.setOnClickListener {
            val intent = Intent(this.activity,QuatyActivity::class.java)
            startActivity(intent)
        }

        return binding.root
        }


}