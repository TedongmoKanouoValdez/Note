package training.androidkotlin.noteappcompose.feature_note.data.repository

import kotlinx.coroutines.flow.Flow
import training.androidkotlin.noteappcompose.feature_note.data.data_source.NoteDao
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.repository.NoteRepository

//Recuperation des notes qui viennent de la base de donnees
class NoteRepositoryImpl(
    private val dao:NoteDao
):NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }

}