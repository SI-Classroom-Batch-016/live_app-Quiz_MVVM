package com.example.liveapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.liveapp.data.DataSource
import com.example.liveapp.data.model.Answer
import com.example.liveapp.data.model.Question

class SharedViewModel : ViewModel() {

    val allQuestions = DataSource.questionList.toMutableList()

    private val _question: MutableLiveData<Question> =
        MutableLiveData(DataSource.questionList.random())
    val question: LiveData<Question>
        get() = _question

    private val _quizFinished: MutableLiveData<Boolean> = MutableLiveData(false)
    val quizFinished: LiveData<Boolean>
        get() = _quizFinished

    private val _rightAnswers: MutableLiveData<Int> = MutableLiveData(0)
    val rightAnswers: LiveData<Int>
        get() = _rightAnswers


    fun answerSelected(selectedAnswer: Answer) {
        if (selectedAnswer.correct) {

            _rightAnswers.value = rightAnswers.value!! + 1
            Log.d("RightAnswers", rightAnswers.value.toString())

            nextQuestion()

        } else {
            endQuiz()
        }
    }

    fun endQuiz() {
        _quizFinished.value = true
    }

    fun resetQuiz() {

        _rightAnswers.value = 0
        nextQuestion()

        _quizFinished.value = false
    }

    fun nextQuestion() {

        //Alte Frage aus der Liste löschen, um Duplikate zu vermeiden
        allQuestions.remove(question.value!!)
        //TODO: Was ist wenn die Liste leer ist?

        _question.value = allQuestions.random()

        Log.d("AllQuestions", allQuestions.map { it.question }.toString())

    }



}