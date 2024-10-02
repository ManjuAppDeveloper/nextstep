package com.manju.nextstep.Quiz
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class QuizRepository {
    private val quizApi = RetrofitClient.instance.create(ApiInterface::class.java)
    suspend fun getQuizData(): QuizResponse? {
        return try{
            withContext(Dispatchers.IO) {
                quizApi.getQuiz()
            }
        } catch (e: Exception) {
            null
        }
    }
}
