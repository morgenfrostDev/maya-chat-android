/*
 * Copyright (c) 2025 Element Creations Ltd.
 * Copyright 2024, 2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.preferences.impl.root

sealed interface PreferencesRootEvent {
    data object OnVersionInfoClick : PreferencesRootEvent
    data object ToggleOtherAccountsExpanded : PreferencesRootEvent
    data class SetTheme(val theme: ThemeOption) : PreferencesRootEvent
    data class SetThemeColor(val colorHex: String) : PreferencesRootEvent
    data object ResetThemeColor : PreferencesRootEvent
    data class SetChatBackgroundImageEnabled(val enabled: Boolean) : PreferencesRootEvent
    data class SetChatBackgroundImage(val uri: String?) : PreferencesRootEvent
}
