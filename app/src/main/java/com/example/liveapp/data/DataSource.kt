package com.example.liveapp.data

import com.example.liveapp.data.model.Answer
import com.example.liveapp.data.model.Question

object DataSource {

    val questionList = listOf(
        Question(
            question = "Welche Schlüsselwort wird in Kotlin verwendet, um eine Variable zu deklarieren, die nicht geändert werden kann?",
            answers = listOf(
                Answer("var", false),
                Answer("let", false),
                Answer("const", false),
                Answer("val", true),
            )
        ),
        Question(
            question = "Welches Dateiformat wird für Android-Anwendungsressourcen wie Layouts und Strings verwendet?",
            answers = listOf(
                Answer("JSON", false),
                Answer("YAML", false),
                Answer("TXT", false),
                Answer("XML", true),
            )
        ),
        Question(
            question = "Welches Layout wird verwendet, um UI-Elemente relativ zueinander zu positionieren?",
            answers = listOf(
                Answer("LinearLayout", false),
                Answer("FrameLayout", false),
                Answer("ConstraintLayout", true),
                Answer("TableLayout", false),
            )
        ),
        Question(
            question = "Welche Funktion in Kotlin wird verwendet, um eine Schleife über eine Sammlung zu durchlaufen?",
            answers = listOf(
                Answer("repeat", false),
                Answer("loop", false),
                Answer("for", true),
                Answer("while", true),
            )
        ),
        Question(
            question = "Welche der folgenden sind primitive Datentypen in Kotlin?",
            answers = listOf(
                Answer("Int", true),
                Answer("String", false),
                Answer("Boolean", true),
                Answer("List", false),
            )
        ),
        Question(
            question = "Was ist der Basisklassenname für alle Aktivitäten in einer Android-Anwendung?",
            answers = listOf(
                Answer("AppCompatActivity", true),
                Answer("Activity", true),
                Answer("FragmentActivity", false),
                Answer("BaseActivity", false),
            )
        ),
        Question(
            question = "Welches Schlüsselwort wird in Kotlin verwendet, um eine Funktion zu definieren?",
            answers = listOf(
                Answer("fun", true),
                Answer("def", false),
                Answer("function", false),
                Answer("fn", false),
            )
        ),
        Question(
            question = "Welche der folgenden Komponenten können in einer Android-Anwendung als Service verwendet werden?",
            answers = listOf(
                Answer("IntentService", true),
                Answer("Service", true),
                Answer("BroadcastReceiver", false),
                Answer("ContentProvider", false),
            )
        ),
        Question(
            question = "Welche Methode wird aufgerufen, wenn eine Aktivität in den Vordergrund kommt?",
            answers = listOf(
                Answer("onCreate", false),
                Answer("onPause", false),
                Answer("onResume", true),
                Answer("onStop", false),
            )
        ),
        Question(
            question = "Welche Klasse wird verwendet, um eine einfache Benachrichtigung in Android zu erstellen?",
            answers = listOf(
                Answer("NotificationBuilder", false),
                Answer("NotificationCompat.Builder", true),
                Answer("NotificationCreator", false),
                Answer("NotificationMaker", false),
            )
        )
    )


}