/*
 * Copyright 2015 Maxim Tuev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.agna.ferro.mvp.dagger.module;

import com.agna.ferro.core.PersistentScreenScope;
import com.agna.ferro.mvp.activity.MvpActivityView;
import com.agna.ferro.mvp.dagger.provider.ActivityProvider;
import com.agna.ferro.mvp.dagger.scope.PerScreen;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module, which provide {@link ActivityProvider}
 * used for screens, based on {@link MvpActivityView}
 */
@Module
public class MvpActivityModule {
    private PersistentScreenScope persistentScreenScope;

    public MvpActivityModule(PersistentScreenScope persistentScreenScope) {
        this.persistentScreenScope = persistentScreenScope;
    }

    @Provides
    @PerScreen
    ActivityProvider provideActivityProvider() {
        return new ActivityProvider(persistentScreenScope);
    }

}
