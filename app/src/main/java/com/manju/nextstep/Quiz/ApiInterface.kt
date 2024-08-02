package com.manju.nextstep.Quiz

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
   @GET("R7NW")
   fun getQuiz():Call<QuizResponse>
}