package com.lightricks.adtcompose.exercise3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

/**
 *  Your challenge is to build a custom layout that is a clone of the built in Column layout
 *
 *  It should layout its children vertically.  Bonus points for supporting the following:
 *  - Spacing between children
 *  - Padding around the children
 *  - Alignment of the children
 */
class Exercise3Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Box {

                }
            }
        }
    }
}
