package training.androidkotlin.noteappcompose.feature_note.domain.use_case

import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    //permet d'invoquer les notes pr la suppression d'une note
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}