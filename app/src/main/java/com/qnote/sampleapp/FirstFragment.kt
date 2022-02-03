package com.qnote.sampleapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.qnote.sampleapp.databinding.FragmentFirstBinding
import com.qnote.sampleapp.viewmodel.FirstViewModel


class FirstFragment : Fragment() {

//    private val firstViewModel by lazy {
//        activity?.application?.let {
//            ViewModelProvider(this).get(FirstViewModel::class.java)
//        }
//    }

    private val firstViewModel = FirstViewModel()

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = firstViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        firstViewModel?.onClickTextChange()
//        firstViewModel?.text?.observe(viewLifecycleOwner, Observer {
//            Log.d("viewmodel", "監視した")
//            binding.tvClickJudge.text = "押された"
//        })

//        val navHostFragment = activity?.supportFragmentManager?.findFragmentById(R.id.host_fragment) as NavHostFragment


        binding.btSecond.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        binding.btThird.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }


    }


}