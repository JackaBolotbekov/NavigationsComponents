package com.example.navigationomponent.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationomponent.R
import com.example.navigationomponent.data.repository.Repository
import com.example.navigationomponent.databinding.FragmentFirstBinding
import com.example.navigationomponent.ui.adapters.FirstAdapter

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var firstAdapter : FirstAdapter? = null
    private val repository = Repository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment.
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onAdapter()
    }

    private fun onAdapter() {
        binding.rv1.adapter = firstAdapter
    }

}