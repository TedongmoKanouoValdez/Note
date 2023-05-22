package training.androidkotlin.noteappcompose.feature_note.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note

@Dao

//ROOMS pour la persistance des donnees
interface NoteDao {

    //pour creer les differentes requetes
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id=:id")
    suspend fun getNoteById(id:Int):Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note:Note)

    @Delete
    suspend fun deleteNote(note:Note)
}