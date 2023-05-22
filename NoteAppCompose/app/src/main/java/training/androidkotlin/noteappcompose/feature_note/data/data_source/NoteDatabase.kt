package training.androidkotlin.noteappcompose.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import training.androidkotlin.noteappcompose.feature_note.domain.model.Note

//Rooms
@Database(
    entities=[Note::class],
    version = 1
)

abstract class NoteDatabase:RoomDatabase() {
    abstract val noteDao:NoteDao

    //pour creer le nom de la base de donnees
    companion object{
        const val DATABASE_NAME="notes_db"
    }
}