package training.androidkotlin.noteappcompose.feature_note.domain.use_case

import training.androidkotlin.noteappcompose.feature_note.domain.model.InvalidNoteException
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws


//pour inserer et invoquer une note et lorsque le titre et le contenu de la note est vide ça renvoi l'exception
class AddNote (
    private val repository: NoteRepository
    ){
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}