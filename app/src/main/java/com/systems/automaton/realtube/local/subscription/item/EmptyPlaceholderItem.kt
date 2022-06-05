package com.systems.automaton.realtube.local.subscription.item

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import com.systems.automaton.realtube.R
import com.systems.automaton.realtube.databinding.ListEmptyViewBinding

class EmptyPlaceholderItem : BindableItem<ListEmptyViewBinding>() {
    override fun getLayout(): Int = R.layout.list_empty_view
    override fun bind(viewBinding: ListEmptyViewBinding, position: Int) {}
    override fun getSpanSize(spanCount: Int, position: Int): Int = spanCount
    override fun initializeViewBinding(view: View) = ListEmptyViewBinding.bind(view)
}
