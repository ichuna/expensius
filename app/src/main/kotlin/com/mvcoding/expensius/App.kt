/*
 * Copyright (C) 2016 Mantas Varnagiris.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.mvcoding.expensius

import android.app.Application
import com.memoizrlabs.ShankModuleInitializer.initializeModules
import com.mvcoding.expensius.feature.intro.IntroModule
import com.mvcoding.expensius.feature.overview.OverviewModule
import com.mvcoding.expensius.feature.splash.SplashModule
import com.mvcoding.expensius.feature.tag.QuickTagsModule
import com.mvcoding.expensius.feature.tag.TagModule
import com.mvcoding.expensius.feature.tag.TagsModule
import com.mvcoding.expensius.feature.transaction.TransactionModule
import net.danlew.android.joda.JodaTimeAndroid

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this);
        initializeModules(AppModule(this),
                          SplashModule(),
                          IntroModule(),
                          OverviewModule(),
                          TagsModule(),
                          TagModule(),
                          QuickTagsModule(),
                          TransactionModule())
    }
}