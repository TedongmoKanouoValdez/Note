package training.androidkotlin.noteappcompose.feature_note.domain.util

//elle permet sceller le type de l'ordre de la note
sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
