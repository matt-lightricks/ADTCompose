package com.lightricks.adtcompose.exercise1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment

/**
 *  Your challenge is allow the user to drag the box around the screen with their finger.
 *  The box should move with the user's finger and stay in the position where the user lifts their finger.
 *
 *  Use what you know about Compose to ensure that we don't recompose every time the box moves
 *
 */
class Exercise1Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Box(modifier = Modifier.fillMaxSize().background(Color.White)) {

                    // this box should be draggable
                    Box(
                        modifier = Modifier
                            .size(150.dp)
                            .background(Color.Green)
                    )
                }
            }
        }
    }

}
