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


class QuizFragment : Fragment(R.layout.fragment_quiz) {

    private val binding by lazy { FragmentQuizBinding.bind(requireView()) }
    private val viewModel: SharedViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.question.observe(viewLifecycleOwner){question ->
            Log.d("QuizFragmentObserver1", question.toString())

            binding.questionTV.text = question.question

            binding.answerATV.text = question.answers[0].answer
            binding.answerACV.setOnClickListener {
                viewModel.answerSelected(question.answers[0])
            }

            binding.answerBTV.text = question.answers[1].answer
            binding.answerBCV.setOnClickListener {
                viewModel.answerSelected(question.answers[1])
            }

            binding.answerCTV.text = question.answers[2].answer
            binding.answerCCV.setOnClickListener {
                viewModel.answerSelected(question.answers[2])
            }

            binding.answerDTV.text = question.answers[3].answer
            binding.answerDCV.setOnClickListener {
                viewModel.answerSelected(question.answers[3])
            }
        }

        viewModel.quizFinished.observe(viewLifecycleOwner){finished ->
            Log.d("QuizFragmentObserver2", finished.toString())

            if(finished){
                findNavController().navigate(R.id.scoreFragment)
            }
        }



    }

}