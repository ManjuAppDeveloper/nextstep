package com.manju.nextstep.Quiz
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manju.nextstep.R
class QuizActivity : AppCompatActivity() {
    private val quizViewModel: QuizViewModel by viewModels()
    private lateinit var quizAdapter: QuizAdapter
    private lateinit var recyclerViewQuiz: RecyclerView
    private lateinit var progressBar: View // Reference to ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        recyclerViewQuiz = findViewById(R.id.recyclerViewQuiz)
        progressBar = findViewById(R.id.progressBar)
        recyclerViewQuiz.layoutManager = LinearLayoutManager(this)
        quizViewModel.fetchData()
        quizViewModel.liveData.observe(this, Observer { qu -> qu?.let { val data = it.responseArray ?: emptyList()
                progressBar.visibility = View.GONE
                recyclerViewQuiz.visibility = View.VISIBLE
                quizAdapter = QuizAdapter(data)
                recyclerViewQuiz.adapter = quizAdapter
            }
        })
    }
}
