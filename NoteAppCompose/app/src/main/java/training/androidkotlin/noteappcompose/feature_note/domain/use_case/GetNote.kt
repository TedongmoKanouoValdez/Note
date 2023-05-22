package training.androidkotlin.noteappcompose.feature_note.domain.use_case

import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.repository.NoteRepository

class GetNote (
    private val repository: NoteRepository
    )
{
    //pour recuperer l'id de la note
    suspend operator fun invoke(id:Int): Note?{
        return repository.getNoteById(id)
    }
}