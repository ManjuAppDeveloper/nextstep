package com.manju.nextstep.Quiz
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.manju.nextstep.R

class QuizActivity : AppCompatActivity() {
    private val quizViewModel: QuizViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizViewModel.liveData.observe(this, Observer { quizResponse ->
            // Handle the quiz data
            quizResponse?.let {
                println(it)
            }
        })

        // Fetch quiz data
        quizViewModel.fetchData()
    }
}
