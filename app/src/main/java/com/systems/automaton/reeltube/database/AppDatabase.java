package com.systems.automaton.reeltube.database;

import static com.systems.automaton.reeltube.database.Migrations.DB_VER_5;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.systems.automaton.reeltube.database.feed.dao.FeedDAO;
import com.systems.automaton.reeltube.database.feed.dao.FeedGroupDAO;
import com.systems.automaton.reeltube.database.feed.model.FeedEntity;
import com.systems.automaton.reeltube.database.feed.model.FeedGroupEntity;
import com.systems.automaton.reeltube.database.feed.model.FeedGroupSubscriptionEntity;
import com.systems.automaton.reeltube.database.feed.model.FeedLastUpdatedEntity;
import com.systems.automaton.reeltube.database.history.dao.SearchHistoryDAO;
import com.systems.automaton.reeltube.database.history.dao.StreamHistoryDAO;
import com.systems.automaton.reeltube.database.history.model.SearchHistoryEntry;
import com.systems.automaton.reeltube.database.history.model.StreamHistoryEntity;
import com.systems.automaton.reeltube.database.playlist.dao.PlaylistDAO;
import com.systems.automaton.reeltube.database.playlist.dao.PlaylistRemoteDAO;
import com.systems.automaton.reeltube.database.playlist.dao.PlaylistStreamDAO;
import com.systems.automaton.reeltube.database.playlist.model.PlaylistEntity;
import com.systems.automaton.reeltube.database.playlist.model.PlaylistRemoteEntity;
import com.systems.automaton.reeltube.database.playlist.model.PlaylistStreamEntity;
import com.systems.automaton.reeltube.database.stream.dao.StreamDAO;
import com.systems.automaton.reeltube.database.stream.dao.StreamStateDAO;
import com.systems.automaton.reeltube.database.stream.model.StreamEntity;
import com.systems.automaton.reeltube.database.stream.model.StreamStateEntity;
import com.systems.automaton.reeltube.database.subscription.SubscriptionDAO;
import com.systems.automaton.reeltube.database.subscription.SubscriptionEntity;

@TypeConverters({Converters.class})
@Database(
        entities = {
                SubscriptionEntity.class, SearchHistoryEntry.class,
                StreamEntity.class, StreamHistoryEntity.class, StreamStateEntity.class,
                PlaylistEntity.class, PlaylistStreamEntity.class, PlaylistRemoteEntity.class,
                FeedEntity.class, FeedGroupEntity.class, FeedGroupSubscriptionEntity.class,
                FeedLastUpdatedEntity.class
        },
        version = DB_VER_5
)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "newpipe.db";

    public abstract SearchHistoryDAO searchHistoryDAO();

    public abstract StreamDAO streamDAO();

    public abstract StreamHistoryDAO streamHistoryDAO();

    public abstract StreamStateDAO streamStateDAO();

    public abstract PlaylistDAO playlistDAO();

    public abstract PlaylistStreamDAO playlistStreamDAO();

    public abstract PlaylistRemoteDAO playlistRemoteDAO();

    public abstract FeedDAO feedDAO();

    public abstract FeedGroupDAO feedGroupDAO();

    public abstract SubscriptionDAO subscriptionDAO();
}
