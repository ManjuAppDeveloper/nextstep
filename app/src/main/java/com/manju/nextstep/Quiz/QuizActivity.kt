package com.manju.nextstep.Quiz
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.manju.nextstep.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class QuizActivity : AppCompatActivity() {
    private val quizViewModel: QuizViewModel by viewModels()
    private lateinit var quizAdapter: QuizAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        // Initialize RecyclerView
        val recyclerViewQuiz = findViewById<RecyclerView>(R.id.recyclerViewQuiz)
        recyclerViewQuiz.layoutManager = LinearLayoutManager(this)
        // Fetch quiz data
        quizViewModel.fetchData()
        // Observe LiveData from ViewModel
        quizViewModel.liveData.observe(this, Observer { qu -> qu?.let{
            quizAdapter=QuizAdapter(it.Testarray)
            recyclerViewQuiz.adapter=quizAdapter
        } })
    }
}