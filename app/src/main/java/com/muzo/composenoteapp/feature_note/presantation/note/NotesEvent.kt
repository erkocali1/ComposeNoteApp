package com.muzo.composenoteapp.feature_note.presantation.note

import com.muzo.composenoteapp.feature_note.domain.model.Note
import com.muzo.composenoteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder:NoteOrder): NotesEvent()
    data class DeleteNote(val note:Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSelection: NotesEvent()

}
