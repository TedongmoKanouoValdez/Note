package training.androidkotlin.noteappcompose.feature_note.domain.use_case

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note
import training.androidkotlin.noteappcompose.feature_note.domain.repository.NoteRepository
import training.androidkotlin.noteappcompose.feature_note.domain.util.NoteOrder
import training.androidkotlin.noteappcompose.feature_note.domain.util.OrderType

//permet de classer les notes selon un ordre soit asc ou desc
class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        //map permet de transformer la liste de telle sorte que si nous avons une liste A et B
        // lorqu'on fait le classem elle transform la liste

        return repository.getNotes().map { notes ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}