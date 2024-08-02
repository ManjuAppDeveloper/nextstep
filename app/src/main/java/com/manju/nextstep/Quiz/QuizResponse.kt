package com.manju.nextstep.Quiz

data class QuizResponse(
    val Testarray: List<Question>
)

data class Question(
    val Question1: String,
    val options: Options,
    val answer: String
)

data class Options(
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String
)

