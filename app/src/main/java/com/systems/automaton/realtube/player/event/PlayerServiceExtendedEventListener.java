package com.systems.automaton.realtube.player.event;

import com.systems.automaton.realtube.player.MainPlayer;
import com.systems.automaton.realtube.player.Player;

public interface PlayerServiceExtendedEventListener extends PlayerServiceEventListener {
    void onServiceConnected(Player player,
                            MainPlayer playerService,
                            boolean playAfterConnect);
    void onServiceDisconnected();
}
