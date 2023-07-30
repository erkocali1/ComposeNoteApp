package com.muzo.composenoteapp.feature_note.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.muzo.composenoteapp.ui.theme.BabyBlue
import com.muzo.composenoteapp.ui.theme.LightGreen
import com.muzo.composenoteapp.ui.theme.RedOrange
import com.muzo.composenoteapp.ui.theme.RedPink
import com.muzo.composenoteapp.ui.theme.Violet
import java.lang.Exception
import java.sql.Timestamp

@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp: Long,
    val color:Int,
    @PrimaryKey val id:Int?=null
){
    companion object
    val noteColors= listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
}

class InvalidNoteException(message:String):Exception(message)
