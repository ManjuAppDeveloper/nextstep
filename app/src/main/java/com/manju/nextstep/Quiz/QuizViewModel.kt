package com.manju.nextstep.Quiz
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
class QuizViewModel : ViewModel() {
    private val repository = QuizRepository()
    private val mutableData = MutableLiveData<QuizResponse?>()
    val liveData: LiveData<QuizResponse?> = mutableData

    fun fetchData() {
        viewModelScope.launch {
            val quizResponse = repository.getQuizData()
            mutableData.postValue(quizResponse)
        }
    }
}
