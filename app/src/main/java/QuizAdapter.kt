// QuizAdapter.kt
package com.manju.nextstep.Quiz
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.manju.nextstep.R
class QuizAdapter(private val dataList: List<Question>) : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_question, parent, false)
        return QuizViewHolder(view)
    }
    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        val question = dataList[position]
        holder.bind(question)
    }
    override fun getItemCount(): Int = dataList.size
    inner class QuizViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val questionTextView: TextView = itemView.findViewById(R.id.textViewQuestion)
        private val option1TextView: TextView = itemView.findViewById(R.id.textViewOption1)
        private val option2TextView: TextView = itemView.findViewById(R.id.textViewOption2)
        private val option3TextView: TextView = itemView.findViewById(R.id.textViewOption3)
        private val option4TextView: TextView = itemView.findViewById(R.id.textViewOption4)
        fun bind(question: Question) {
            questionTextView.text = question.question1
            option1TextView.text = question.options.option1
            option2TextView.text = question.options.option2
            option3TextView.text = question.options.option3
            option4TextView.text = question.options.option4
           // option4TextView.text = question.answer
        }
    }
}
