package training.androidkotlin.noteappcompose.feature_note.domain.use_case

//permet la declaration des diff donnees de add delete et getNote pour pouvoir utiliser les diff fonctions
data class NoteUseCases(
   val getNotes: GetNotes,
   val deleteNote: DeleteNote,
   val addNote: AddNote,
   val getNote: GetNote
) {

}
