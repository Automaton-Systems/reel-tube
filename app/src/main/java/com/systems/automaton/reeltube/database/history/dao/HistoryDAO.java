package com.systems.automaton.reeltube.database.history.dao;

import com.systems.automaton.reeltube.database.BasicDAO;

public interface HistoryDAO<T> extends BasicDAO<T> {
    T getLatestEntry();
}
