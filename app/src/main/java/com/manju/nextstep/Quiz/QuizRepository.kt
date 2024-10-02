package com.manju.nextstep.Quiz
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class QuizRepository {
    private val quizApi = RetrofitClient.instance.create(ApiInterface::class.java)

    suspend fun getQuizData(): QuizResponse? {
        return try {
            withContext(Dispatchers.IO) {
                val response = quizApi.getQuiz()
                response?.copy(responseArray = response.responseArray ?: emptyList()) // Replace null with empty list
            }
        } catch (e: Exception) {
            null
        }
    }
}

