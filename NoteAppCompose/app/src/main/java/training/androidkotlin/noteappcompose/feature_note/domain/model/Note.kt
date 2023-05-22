package training.androidkotlin.noteappcompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import training.androidkotlin.noteappcompose.ui.theme.*

//pour la declaration des donnees de la class note Rooms
@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id:Int?=null
)
    {
        //pour la definition des couleurs
    companion object{
        val noteColors= listOf(RedOrange,LightGreen,Violet,BabyBlue,RedPink)
    }

    }
class InvalidNoteException(message:String):Exception(message)
