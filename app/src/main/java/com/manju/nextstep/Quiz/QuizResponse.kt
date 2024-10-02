package com.manju.nextstep.Quiz
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
@Parcelize
data class QuizResponse(
    @SerializedName("Testarray")
    val responseArray: List<Question> = emptyList() // Using Testarray as the key
) : Parcelable

@Parcelize
data class Question(
    @SerializedName("Question1")
    val question1: String,
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
