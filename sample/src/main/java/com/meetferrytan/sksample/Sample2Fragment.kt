package com.meetferrytan.sksample

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Sample2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_sample2, container, false)

        view.setBackgroundColor(Color.parseColor("#0000ff"))
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = Sample2Fragment()
    }
}
