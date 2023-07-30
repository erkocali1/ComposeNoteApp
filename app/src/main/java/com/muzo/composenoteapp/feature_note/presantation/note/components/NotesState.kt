package com.muzo.composenoteapp.feature_note.presantation.note.components

import com.muzo.composenoteapp.feature_note.domain.model.Note
import com.muzo.composenoteapp.feature_note.domain.util.NoteOrder
import com.muzo.composenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
