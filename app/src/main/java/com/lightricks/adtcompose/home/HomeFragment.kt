package com.lightricks.adtcompose.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.lightricks.adtcompose.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = { findNavController().navigate(R.id.exercise1Fragment) }) {
                        Text("Exercise 1")
                    }
                    Button(onClick = { findNavController().navigate(R.id.exercise2Fragment) }) {
                        Text("Exercise 2")
                    }
                    Button(onClick = { findNavController().navigate(R.id.exercise3Fragment) }) {
                        Text("Exercise 3")
                    }
                }
            }
        }
    }
}

