package com.manju.nextstep.Quiz
import retrofit2.Call
import retrofit2.http.GET
interface ApiInterface {
   @GET("R60Z")
   suspend fun getQuiz(): QuizResponse
}
