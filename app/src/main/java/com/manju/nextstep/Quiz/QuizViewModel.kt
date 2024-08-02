package com.manju.nextstep.Quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    private val repository = QuizRepository()
    private val muteData=MutableLiveData<QuizResponse?>()
    val liveData:LiveData<QuizResponse?> = muteData
    fun fetchData(){
        repository.getQuizData { quizResponse ->
            muteData.postValue(quizResponse)
        }
    }
}