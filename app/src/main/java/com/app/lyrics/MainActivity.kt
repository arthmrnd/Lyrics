package com.app.lyrics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lyrics()

        val translatedLyricsButton = findViewById<Button>(R.id.buttonTranslate)
        translatedLyricsButton.setOnClickListener {
            lyricsTranslate()
        }

        val originalLyricsButton = findViewById<Button>(R.id.buttonOriginal)
        originalLyricsButton.setOnClickListener {
            lyrics()
        }
    }

    fun lyrics(){
        val textViewTitle = findViewById<TextView>(R.id.music)
        textViewTitle.text = TITLE

        val textViewArtist = findViewById<TextView>(R.id.artist)
        textViewArtist.text = ARTIST

        val textViewLyrics = findViewById<TextView>(R.id.lyrics)
        textViewLyrics.text = ORIGINAL_LYRICS
    }

    fun lyricsTranslate(){
        val textViewTitle = findViewById<TextView>(R.id.music)
        textViewTitle.text = TRANSLATED_TITLE        
        
        val textViewArtist = findViewById<TextView>(R.id.artist)
        textViewArtist.text = ARTIST

        val textViewLyrics = findViewById<TextView>(R.id.lyrics)
        textViewLyrics.text = TRANSLATED_LYRICS
    }

    companion object {
        val ARTIST = "Bruno e Marrone"
        val TITLE = "Boate Azul"
        val TRANSLATED_TITLE = "Blue Nightclub"
        val TRANSLATED_LYRICS = "Sick of love, I looked for remedy in the night life\n"+
        "With the flower of the night in a nightclub here in the south zone\n"+
        "The pain of love is cured with another love\n"+
        "I came to cure the pain of this evil love in the blue nightclub\n"+
        "And when the night fades away in the brightness of the dawn\n"+
        "The members of the night life went to sleep\n"+
        "And the night lady that was with me also went away\n"+
        "Closed doors, alone again, I had to leave\n\n"+
        "Leave how,\n"+
        "If I don't even know where I should go\n"+
        "Vaguely I remember that I am\n"+
        "In a nightclub in the south zone\n"+
        "I drank too much\n"+
        "And I can't even remember\n"+
        "What was the name of that woman\n"+
        "The flower of the night in the blue nightclub"
        val ORIGINAL_LYRICS = "Doente de amor procurei remédio na vida noturna\n"+
        "Com a flor da noite em uma boate aqui na zona sul\n"+
        "A dor do amor é com outro amor que a gente cura\n"+
        "Vim curar a dor desse mal de amor na boate azul\n"+
        "E quando a noite vai se agonizando no clarão da aurora\n"+
        "Os integrantes da vida noturna se foram dormir\n"+
        "E a dama da noite que estava comigo também foi embora\n"+
        "Fecharam-se as portas, sozinho de novo tive que sair\n\n"+
        "Sair de que jeito,\n"+
        "Se nem sei o rumo para onde vou\n"+
        "Muito vagamente me lembro que estou
        Em uma boate aqui na zona sul\n"+
        "Eu bebi demais\n"+
        "E não consigo me lembrar sequer\n"+
        "Qual era o nome daquela mulher\n"+
        "A flor da noite na boate azul"
    }
}