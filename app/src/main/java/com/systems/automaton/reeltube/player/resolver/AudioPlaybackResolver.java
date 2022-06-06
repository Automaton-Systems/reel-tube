package com.systems.automaton.reeltube.player.resolver;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.exoplayer2.source.MediaSource;

import org.schabi.newpipe.extractor.MediaFormat;
import org.schabi.newpipe.extractor.stream.AudioStream;
import org.schabi.newpipe.extractor.stream.StreamInfo;
import com.systems.automaton.reeltube.player.helper.PlayerDataSource;
import com.systems.automaton.reeltube.player.helper.PlayerHelper;
import com.systems.automaton.reeltube.player.mediaitem.MediaItemTag;
import com.systems.automaton.reeltube.player.mediaitem.StreamInfoTag;
import com.systems.automaton.reeltube.util.ListHelper;

public class AudioPlaybackResolver implements PlaybackResolver {
    @NonNull
    private final Context context;
    @NonNull
    private final PlayerDataSource dataSource;

    public AudioPlaybackResolver(@NonNull final Context context,
                                 @NonNull final PlayerDataSource dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    @Nullable
    public MediaSource resolve(@NonNull final StreamInfo info) {
        final MediaSource liveSource = maybeBuildLiveMediaSource(dataSource, info);
        if (liveSource != null) {
            return liveSource;
        }

        final int index = ListHelper.getDefaultAudioFormat(context, info.getAudioStreams());
        if (index < 0 || index >= info.getAudioStreams().size()) {
            return null;
        }

        final AudioStream audio = info.getAudioStreams().get(index);
        final MediaItemTag tag = StreamInfoTag.of(info);
        return buildMediaSource(dataSource, audio.getUrl(), PlayerHelper.cacheKeyOf(info, audio),
                MediaFormat.getSuffixById(audio.getFormatId()), tag);
    }
}
