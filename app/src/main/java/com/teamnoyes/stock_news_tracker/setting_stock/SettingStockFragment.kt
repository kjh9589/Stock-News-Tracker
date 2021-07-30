package com.teamnoyes.stock_news_tracker.setting_stock

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.teamnoyes.stock_news_tracker.R
import com.teamnoyes.stock_news_tracker.databinding.SettingStockFragmentBinding

class SettingStockFragment : Fragment(R.layout.setting_stock_fragment) {

    companion object {
        fun newInstance() = SettingStockFragment()
    }
    private lateinit var binding: SettingStockFragmentBinding
    private lateinit var viewModel: SettingStockViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentBinding = SettingStockFragmentBinding.bind(view)
        binding = fragmentBinding


    }

}