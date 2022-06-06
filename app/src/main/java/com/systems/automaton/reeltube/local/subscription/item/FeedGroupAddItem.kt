package com.systems.automaton.reeltube.local.subscription.item

import android.view.View
import com.xwray.groupie.viewbinding.BindableItem
import com.systems.automaton.reeltube.R
import com.systems.automaton.reeltube.databinding.FeedGroupAddNewItemBinding

class FeedGroupAddItem : BindableItem<FeedGroupAddNewItemBinding>() {
    override fun getLayout(): Int = R.layout.feed_group_add_new_item
    override fun bind(viewBinding: FeedGroupAddNewItemBinding, position: Int) {}
    override fun initializeViewBinding(view: View) = FeedGroupAddNewItemBinding.bind(view)
}
