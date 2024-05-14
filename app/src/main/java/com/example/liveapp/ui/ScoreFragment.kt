package com.example.liveapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.liveapp.R
import com.example.liveapp.SharedViewModel
import com.example.liveapp.databinding.FragmentQuizBinding


class ScoreFragment : Fragment(R.layout.fragment_score) {

    private val binding by lazy { FragmentQuizBinding.bind(requireView()) }
    private val viewModel: SharedViewModel by viewModels()

}