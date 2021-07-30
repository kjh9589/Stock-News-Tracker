package com.teamnoyes.stock_news_tracker.stock_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.teamnoyes.stock_news_tracker.R

class StockListFragment : Fragment() {

    companion object {
        fun newInstance() = StockListFragment()
    }

    private lateinit var viewModel: StockListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.stock_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StockListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}