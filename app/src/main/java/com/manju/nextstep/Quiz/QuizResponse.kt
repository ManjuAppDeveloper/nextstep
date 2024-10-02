package com.manju.nextstep.Quiz
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class QuizResponse(
    val Testarray: List<Question>
) : Parcelable
@Parcelize
data class Question(
    val Question1: String,
    val options: Options,
    val answer: String
) : Parcelable
@Parcelize
data class Options(
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String
) : Parcelable



