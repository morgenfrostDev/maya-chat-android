/*
 * Copyright (c) 2025 Element Creations Ltd.
 * Copyright 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.rageshake.impl.di

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesTo
import io.element.android.features.rageshake.impl.crash.PreferencesCrashDataStore
import io.element.android.libraries.core.coroutine.CoroutineDispatchers
import io.element.android.libraries.core.meta.BuildMeta

@ContributesTo(AppScope::class)
interface RageshakeBindings {
    fun preferencesCrashDataStore(): PreferencesCrashDataStore
    fun buildMeta(): BuildMeta
    fun coroutineDispatchers(): CoroutineDispatchers
}
