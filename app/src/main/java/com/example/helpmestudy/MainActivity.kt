package com.example.helpmestudy

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat



class MainActivity : AppCompatActivity() {

    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994.",
        "The Great Wall of China is in Japan.",
        "World War II ended in 1945.",
        "Julius Caesar was a Roman Emperor.",
        "The Berlin Wall fell in 1989."
    )

    private val answers = arrayOf(true, false, true, false, true)
    private val reviewData = mutableListOf<String>()

    private var index = 0
    private var score = 0

    lateinit var textView: TextView
    lateinit var startButton: Button
    lateinit var trueButton: Button
    lateinit var falseButton: Button
    lateinit var nextButton: Button
    lateinit var reviewButton: Button
    lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        startButton = findViewById(R.id.startButton)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextButton = findViewById(R.id.nextButton)
        reviewButton = findViewById(R.id.reviewButton)
        exitButton = findViewById(R.id.exitButton)

        startButton.setOnClickListener {
            startButton.visibility = View.GONE
            index = 0
            score = 0
            reviewData.clear()
            showQuestion()
        }

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }

        nextButton.setOnClickListener {
            index++
            if (index < questions.size) {
                showQuestion()
            } else {
                showScore()
            }
        }

        reviewButton.setOnClickListener {
            showReview()
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }

    private fun showQuestion() {
        textView.text = questions[index]
        trueButton.visibility = View.VISIBLE
        falseButton.visibility = View.VISIBLE
        nextButton.visibility = View.GONE
        reviewButton.visibility = View.GONE
        exitButton.visibility = View.GONE
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correct = answers[index]
        val feedback = if (userAnswer == correct) {
            score++
            "✅ Correct!"
        } else {
            "❌ Incorrect!"
        }

        // Save for review
        reviewData.add("Q: ${questions[index]}\nA: ${if (correct) "True" else "False"}")

        textView.text = feedback
        trueButton.visibility = View.GONE
        falseButton.visibility = View.GONE
        nextButton.visibility = View.VISIBLE
    }

    private fun showScore() {
        val message = if (score >= 3) {
            "Great Job!"
        } else {
            "Keep learning!"
        }

        textView.text = "You scored $score out of ${questions.size}.\n$message"
        nextButton.visibility = View.GONE
        reviewButton.visibility = View.VISIBLE
        exitButton.visibility = View.VISIBLE
    }

    private fun showReview() {
        val builder = StringBuilder("📚 Review:\n\n")
        for (line in reviewData) {
            builder.append(line).append("\n\n")
        }
        textView.text = builder.toString()

        reviewButton.visibility = View.GONE
        exitButton.visibility = View.VISIBLE
    }
}