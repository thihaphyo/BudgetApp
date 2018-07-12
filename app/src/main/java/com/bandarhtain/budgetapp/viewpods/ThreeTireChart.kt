package com.bandarhtain.budgetapp.viewpods

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_pod_three_tire.view.*

/**
 *
 * Created by Phyo Thiha on 7/13/18.
 */
class ThreeTireChart:LinearLayout{

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onFinishInflate() {
        super.onFinishInflate()

        rl_income.setOnClickListener {
            Log.d("aa","aaaaaa")
        }

    }

    fun setData(){

    }
}