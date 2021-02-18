package com.okcodex.easyconverters.ui.tools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.okcodex.easyconverters.R


class ToolsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  root = inflater.inflate(R.layout.fragment_tools, container, false)


        return root
    }


}