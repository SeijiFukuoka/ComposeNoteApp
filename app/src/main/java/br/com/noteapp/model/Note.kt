package br.com.noteapp.model

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.*

data class Note @RequiresApi(Build.VERSION_CODES.O) constructor(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: Date = Date.from(Instant.now())
)
