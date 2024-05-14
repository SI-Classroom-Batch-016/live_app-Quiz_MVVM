package com.example.liveapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.liveapp.R
import com.example.liveapp.SharedViewModel
import com.example.liveapp.databinding.FragmentQuizBinding
import com.example.liveapp.databinding.FragmentScoreBinding


class ScoreFragment : Fragment(R.layout.fragment_score) {

    private val binding by lazy { FragmentScoreBinding.bind(requireView()) }
    private val viewModel: SharedViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.resetBTN.setOnClickListener {
            viewModel.resetQuiz()
        }

        viewModel.quizFinished.observe(viewLifecycleOwner){finished ->
            Log.d("ScoreFragmentObserver", finished.toString())

            if(!finished){
                findNavController().navigate(R.id.quizFragment)
            }
        }

        viewModel.rightAnswers.observe(viewLifecycleOwner){score ->
            binding.resultTV.text = "Du hast $score  Punkte erreicht"
        }
    }
}