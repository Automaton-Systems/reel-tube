package com.systems.automaton.realtube.fragments.list;

import com.systems.automaton.realtube.fragments.ViewContract;

public interface ListViewContract<I, N> extends ViewContract<I> {
    void showListFooter(boolean show);

    void handleNextItems(N result);
}
