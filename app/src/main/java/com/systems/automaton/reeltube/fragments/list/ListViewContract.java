package com.systems.automaton.reeltube.fragments.list;

import com.systems.automaton.reeltube.fragments.ViewContract;

public interface ListViewContract<I, N> extends ViewContract<I> {
    void showListFooter(boolean show);

    void handleNextItems(N result);
}
