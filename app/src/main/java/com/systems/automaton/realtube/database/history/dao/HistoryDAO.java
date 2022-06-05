package com.systems.automaton.realtube.database.history.dao;

import com.systems.automaton.realtube.database.BasicDAO;

public interface HistoryDAO<T> extends BasicDAO<T> {
    T getLatestEntry();
}
