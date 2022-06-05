package com.systems.automaton.realtube.database.stream

import androidx.room.ColumnInfo
import androidx.room.Embedded
import com.systems.automaton.realtube.database.stream.model.StreamEntity
import com.systems.automaton.realtube.database.stream.model.StreamStateEntity

data class StreamWithState(
    @Embedded
    val stream: StreamEntity,

    @ColumnInfo(name = StreamStateEntity.STREAM_PROGRESS_MILLIS)
    val stateProgressMillis: Long?
)
