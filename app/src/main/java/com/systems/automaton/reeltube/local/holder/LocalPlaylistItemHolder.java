package com.systems.automaton.reeltube.local.holder;

import android.view.View;
import android.view.ViewGroup;

import com.systems.automaton.reeltube.database.LocalItem;
import com.systems.automaton.reeltube.database.playlist.PlaylistMetadataEntry;
import com.systems.automaton.reeltube.local.LocalItemBuilder;
import com.systems.automaton.reeltube.local.history.HistoryRecordManager;
import com.systems.automaton.reeltube.util.PicassoHelper;
import com.systems.automaton.reeltube.util.Localization;

import java.time.format.DateTimeFormatter;

public class LocalPlaylistItemHolder extends PlaylistItemHolder {
    public LocalPlaylistItemHolder(final LocalItemBuilder infoItemBuilder, final ViewGroup parent) {
        super(infoItemBuilder, parent);
    }

    LocalPlaylistItemHolder(final LocalItemBuilder infoItemBuilder, final int layoutId,
                            final ViewGroup parent) {
        super(infoItemBuilder, layoutId, parent);
    }

    @Override
    public void updateFromItem(final LocalItem localItem,
                               final HistoryRecordManager historyRecordManager,
                               final DateTimeFormatter dateTimeFormatter) {
        if (!(localItem instanceof PlaylistMetadataEntry)) {
            return;
        }
        final PlaylistMetadataEntry item = (PlaylistMetadataEntry) localItem;

        itemTitleView.setText(item.name);
        itemStreamCountView.setText(Localization.localizeStreamCountMini(
                itemStreamCountView.getContext(), item.streamCount));
        itemUploaderView.setVisibility(View.INVISIBLE);

        PicassoHelper.loadPlaylistThumbnail(item.thumbnailUrl).into(itemThumbnailView);

        super.updateFromItem(localItem, historyRecordManager, dateTimeFormatter);
    }
}
