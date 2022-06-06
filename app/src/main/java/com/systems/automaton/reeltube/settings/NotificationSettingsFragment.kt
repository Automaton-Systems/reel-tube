package com.systems.automaton.reeltube.settings

import android.os.Build
import android.os.Bundle
import androidx.preference.Preference
import com.systems.automaton.reeltube.R

class NotificationSettingsFragment : BasePreferenceFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResourceRegistry()

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            val colorizePref: Preference? = findPreference(getString(R.string.notification_colorize_key))
            colorizePref?.let {
                preferenceScreen.removePreference(it)
            }
        }
    }
}
