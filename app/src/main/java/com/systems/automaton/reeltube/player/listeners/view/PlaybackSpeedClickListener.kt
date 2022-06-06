package com.systems.automaton.reeltube.player.listeners.view

import android.util.Log
import android.view.View
import androidx.appcompat.widget.PopupMenu
import com.systems.automaton.reeltube.MainActivity
import com.systems.automaton.reeltube.player.Player
import com.systems.automaton.reeltube.player.helper.PlaybackParameterDialog

/**
 * Click listener for the playbackSpeed textview of the player
 */
class PlaybackSpeedClickListener(
    private val player: Player,
    private val playbackSpeedPopupMenu: PopupMenu
) : View.OnClickListener {

    companion object {
        private const val TAG: String = "PlaybSpeedClickListener"
    }

    override fun onClick(v: View) {
        if (MainActivity.DEBUG) {
            Log.d(TAG, "onPlaybackSpeedClicked() called")
        }

        if (player.videoPlayerSelected()) {
            PlaybackParameterDialog.newInstance(
                player.playbackSpeed.toDouble(),
                player.playbackPitch.toDouble(),
                player.playbackSkipSilence
            ) { speed: Float, pitch: Float, skipSilence: Boolean ->
                player.setPlaybackParameters(
                    speed,
                    pitch,
                    skipSilence
                )
            }
                .show(player.parentActivity!!.supportFragmentManager, null)
        } else {
            playbackSpeedPopupMenu.show()
            player.isSomePopupMenuVisible = true
        }

        player.manageControlsAfterOnClick(v)
    }
}
