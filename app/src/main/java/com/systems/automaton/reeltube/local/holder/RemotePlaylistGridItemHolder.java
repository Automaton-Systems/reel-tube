package com.systems.automaton.reeltube.local.holder;

import android.view.ViewGroup;

import com.systems.automaton.reeltube.R;
import com.systems.automaton.reeltube.local.LocalItemBuilder;

public class RemotePlaylistGridItemHolder extends RemotePlaylistItemHolder {
    public RemotePlaylistGridItemHolder(final LocalItemBuilder infoItemBuilder,
                                        final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
