package com.manju.nextstep.Quiz

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class QuizRepository {
    private val quizApi = RetrofitClient.instance.create(ApiInterface::class.java)
    fun getQuizData(callback: (QuizResponse?)->Unit){
        val call=quizApi.getQuiz()
        call.enqueue(object :Callback<QuizResponse>{
            override fun onResponse(p0: Call<QuizResponse>, p1: Response<QuizResponse>) {
                if(p1.isSuccessful){
                    callback(p1.body())
                }
                else{
                    callback(null)
                }
            }

            override fun onFailure(p0: Call<QuizResponse>, p1: Throwable) {
                callback(null)
            }
        })
        }
}