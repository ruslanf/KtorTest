package com.example.ktortest.di

import org.koin.dsl.module

val repositoryModule = module {
//    fun provideDataBaseRepository(
//        trainingsDao: TrainingsDao,
//        mediaDao: MediaDao,
//        lessonsDao: LessonsDao,
//        grammarDao: GrammarDao,
//        profileDao: ProfileDao,
//        lessonDao: LessonDao,
//        phrasesDao: PhrasesDao,
//        wordsDao: WordsDao
//    ): DataBase = DataBaseRepository(
//        trainingsDao, mediaDao, lessonsDao, grammarDao, profileDao, lessonDao, phrasesDao, wordsDao
//    )
//
//    single { provideDataBaseRepository(get(), get(), get(), get(), get(), get(), get(), get()) }
//    single<LocalStorage> { LocalStorageImpl(get()) }
//    single<Repository> { RepositoryImpl(get(), get()) }
}