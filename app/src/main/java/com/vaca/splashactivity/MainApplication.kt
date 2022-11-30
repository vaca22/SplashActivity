package com.vaca.splashactivity

import android.app.Application
import java.lang.Thread.sleep

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        sleep(5000)
    }
}