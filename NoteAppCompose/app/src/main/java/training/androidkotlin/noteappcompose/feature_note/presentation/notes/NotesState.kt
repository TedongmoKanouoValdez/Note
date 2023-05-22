package training.androidkotlin.noteappcompose.feature_note.presentation.notes

import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.util.NoteOrder
import training.androidkotlin.noteappcompose.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder:NoteOrder=NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean=false
) {

}