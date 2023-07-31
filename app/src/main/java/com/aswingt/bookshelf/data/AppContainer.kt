package com.aswingt.bookshelf.data

import com.aswingt.bookshelf.network.BookService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val booksRepository: com.aswingt.bookshelf.data.BooksRepository
}

class DefaultAppContainer : com.aswingt.bookshelf.data.AppContainer {
    private val BASE_URL = "https://www.googleapis.com/books/v1/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: BookService by lazy {
        retrofit.create(BookService::class.java)
    }

    override val booksRepository: com.aswingt.bookshelf.data.BooksRepository by lazy {
        com.aswingt.bookshelf.data.NetworkBooksRepository(retrofitService)
    }
}