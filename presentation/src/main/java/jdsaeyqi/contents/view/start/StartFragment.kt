package jdsaeyqi.contents.view.start

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import jdsaeyqi.contents.R
import jdsaeyqi.contents.base.BaseFragment
import jdsaeyqi.contents.databinding.FragmentStartBinding

class StartFragment : BaseFragment<FragmentStartBinding>(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initClickListener()
    }

    fun initClickListener() {
        binding.apply {
            btnStart.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_homeFragment)
            }
        }
    }


}