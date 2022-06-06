package com.systems.automaton.reeltube.player.event;

import com.systems.automaton.reeltube.player.MainPlayer;
import com.systems.automaton.reeltube.player.Player;

public interface PlayerServiceExtendedEventListener extends PlayerServiceEventListener {
    void onServiceConnected(Player player,
                            MainPlayer playerService,
                            boolean playAfterConnect);
    void onServiceDisconnected();
}
