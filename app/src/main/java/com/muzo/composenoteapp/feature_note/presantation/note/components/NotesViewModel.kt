package com.muzo.composenoteapp.feature_note.presantation.note.components

import androidx.lifecycle.ViewModel
import com.muzo.composenoteapp.feature_note.domain.use_case.NotesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NotesViewModel @Inject constructor(
    private val notesUseCases: NotesUseCases
) : ViewModel() {





}

