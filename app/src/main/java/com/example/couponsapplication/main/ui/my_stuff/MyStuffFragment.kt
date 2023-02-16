package com.example.couponsapplication.main.ui.my_stuff

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.couponsapplication.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyStuffFragment : Fragment() {

    companion object {
        fun newInstance() = MyStuffFragment()
    }

    private lateinit var viewModel: MyStuffViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_stuff, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyStuffViewModel::class.java)
        // TODO: Use the ViewModel
    }

}