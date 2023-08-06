package com.muzo.composenoteapp.di

import android.content.Context
import androidx.room.Room
import com.muzo.composenoteapp.feature_note.data.data_source.NoteDatabase
import com.muzo.composenoteapp.feature_note.data.repository.NoteRepositoryImpl
import com.muzo.composenoteapp.feature_note.domain.repository.NoteRepository
import com.muzo.composenoteapp.feature_note.domain.use_case.AddNoteUseCases
import com.muzo.composenoteapp.feature_note.domain.use_case.DeleteNoteUseCase
import com.muzo.composenoteapp.feature_note.domain.use_case.GetNoteUseCases
import com.muzo.composenoteapp.feature_note.domain.use_case.GetNotesUseCase
import com.muzo.composenoteapp.feature_note.domain.use_case.NotesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideNoteDataBase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, NoteDatabase::class.java, NoteDatabase.DATABASE_NAME).build()

    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDatabase):NoteRepository{
        return NoteRepositoryImpl(db.noteDao())
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository:NoteRepository):NotesUseCases{
        return  NotesUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCases(repository),
            getNoteUseCase = GetNoteUseCases(repository)
        )
    }
}