package training.androidkotlin.noteappcompose.feature_note.domain.repository

import kotlinx.coroutines.flow.Flow
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note

// permet de recuperer les notes qui seront affichees sur l'interface des notes
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id:Int):Note?

    suspend fun insertNote(note:Note)

    suspend fun deleteNote(note:Note)

}