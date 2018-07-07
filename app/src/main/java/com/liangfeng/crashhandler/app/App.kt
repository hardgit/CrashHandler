package com.liangfeng.crashhandler.app

import android.app.Application
import com.liangfeng.crashhandler.CrashHandler

/**
 * Created by mzf on 2018/7/7.
 * Email:liangfeng093@gmail.com
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashHandler.init(this, "544935678@qq.com")
    }
}