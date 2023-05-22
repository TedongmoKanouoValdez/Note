package training.androidkotlin.noteappcompose.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType){

    //permet d'ordonner les notes en fonction du titre la date color en faite en fonction de l'elem choisit
    class Title(orderType: OrderType):NoteOrder(orderType)
    class Date(orderType: OrderType):NoteOrder(orderType)
    class Color(orderType: OrderType):NoteOrder(orderType)

    fun copy(orderType: OrderType):NoteOrder{
        return when(this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}
