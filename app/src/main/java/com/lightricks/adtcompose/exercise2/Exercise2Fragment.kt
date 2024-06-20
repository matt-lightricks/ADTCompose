package com.lightricks.adtcompose.exercise2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

/**
 *  Your challenge is to build that shows a list of suggested colors as the user types in the text box
 *  There is already a list of colors in the ViewModel that you can use
 *  When the user clicks on a suggestion then the text box should be updated with the color name
 *
 *  Use what you know about state in compose to build this screen
 */
@AndroidEntryPoint
class Exercise2Fragment: Fragment() {

    private val viewModel by viewModels<Exercise2ViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Exercise2Screen()
            }
        }
    }

}
