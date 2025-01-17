package com.systems.automaton.reeltube.database.playlist.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.systems.automaton.reeltube.database.BasicDAO;
import com.systems.automaton.reeltube.database.playlist.model.PlaylistEntity;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

import static com.systems.automaton.reeltube.database.playlist.model.PlaylistEntity.PLAYLIST_ID;
import static com.systems.automaton.reeltube.database.playlist.model.PlaylistEntity.PLAYLIST_TABLE;

@Dao
public interface PlaylistDAO extends BasicDAO<PlaylistEntity> {
    @Override
    @Query("SELECT * FROM " + PLAYLIST_TABLE)
    Flowable<List<PlaylistEntity>> getAll();

    @Override
    @Query("DELETE FROM " + PLAYLIST_TABLE)
    int deleteAll();

    @Override
    default Flowable<List<PlaylistEntity>> listByService(final int serviceId) {
        throw new UnsupportedOperationException();
    }

    @Query("SELECT * FROM " + PLAYLIST_TABLE + " WHERE " + PLAYLIST_ID + " = :playlistId")
    Flowable<List<PlaylistEntity>> getPlaylist(long playlistId);

    @Query("DELETE FROM " + PLAYLIST_TABLE + " WHERE " + PLAYLIST_ID + " = :playlistId")
    int deletePlaylist(long playlistId);

    @Query("SELECT COUNT(*) FROM " + PLAYLIST_TABLE)
    Flowable<Long> getCount();
}
