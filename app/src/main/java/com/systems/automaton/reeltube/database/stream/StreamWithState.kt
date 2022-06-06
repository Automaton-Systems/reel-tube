package com.systems.automaton.reeltube.database.stream

import androidx.room.ColumnInfo
import androidx.room.Embedded
import com.systems.automaton.reeltube.database.stream.model.StreamEntity
import com.systems.automaton.reeltube.database.stream.model.StreamStateEntity

data class StreamWithState(
    @Embedded
    val stream: StreamEntity,

    @ColumnInfo(name = StreamStateEntity.STREAM_PROGRESS_MILLIS)
    val stateProgressMillis: Long?
)
