package com.example.damnvulnerablemobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.damnvulnerablemobileapp.databinding.FragmentGuidesAuthenticationBinding

class GuidesAuthenticationFragment : Fragment() {

    private var _binding: FragmentGuidesAuthenticationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGuidesAuthenticationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}