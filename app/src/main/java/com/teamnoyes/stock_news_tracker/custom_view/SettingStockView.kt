package com.teamnoyes.stock_news_tracker.custom_view

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import com.teamnoyes.stock_news_tracker.R
import com.teamnoyes.stock_news_tracker.databinding.SettingStockDefaultViewBinding

class SettingStockView: LinearLayout {
    // 코드 상에서 View 객체를 생성할 때 사용하는 생성자
    constructor(context: Context) : super(context)

    // XML로부터 View 객체를 생성(inflate)할 때 사용되는 생성자
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        getDefaultAttrs(attrs)
    }

    // XML inflate + theme attribute로 기본 스타일을 적용할 때 사용되는 생성자
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        getDefaultAttrs(attrs, defStyleAttr)
    }

    // XML inflate + theme attribute + style attribute로 기본 스타일을 적용할 때 사용되는 생성자자
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes){

    }

    private val binding = SettingStockDefaultViewBinding.inflate(LayoutInflater.from(context), this, true)

    @SuppressLint("Recycle")
    private fun getDefaultAttrs(attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SettingStockView)
        setDefaultTypeArray(typedArray)
    }

    @SuppressLint("Recycle")
    private fun getDefaultAttrs(attrs: AttributeSet, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.SettingStockView)
        setDefaultTypeArray(typedArray)
    }

    init {
        gravity = Gravity.CENTER
        orientation = VERTICAL
    }

    private fun setDefaultTypeArray(typedArray: TypedArray) {
        val ssvBackgroundId = typedArray.getResourceId(R.styleable.SettingStockView_SSVBackground, R.color.main_color)
        this.setBackgroundResource(ssvBackgroundId)

        val ssvImageId = typedArray.getResourceId(R.styleable.SettingStockView_SSVImage, R.drawable.ic_launcher_foreground)
        binding.settingStockImageView.setImageResource(ssvImageId)

        val ssvText = typedArray.getText(R.styleable.SettingStockView_SSVText)
        binding.settingStockTitleTextView.text = ssvText

        typedArray.recycle()
    }
}