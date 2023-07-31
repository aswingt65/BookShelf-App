package com.aswingt.bookshelf

import android.app.Application
import com.aswingt.bookshelf.data.AppContainer
import com.aswingt.bookshelf.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: com.aswingt.bookshelf.data.AppContainer
    override fun onCreate() {
        super.onCreate()
        container = com.aswingt.bookshelf.data.DefaultAppContainer()
    }
}