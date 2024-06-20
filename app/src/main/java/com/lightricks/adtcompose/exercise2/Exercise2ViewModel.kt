package com.lightricks.adtcompose.exercise2

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class Exercise2ViewModel : ViewModel() {

    companion object {
        private val COLORS = listOf(
            "Red", "Green", "Blue", "Yellow", "Purple", "Orange", "Pink", "Brown", "Gray", "Black",
            "White", "Cyan", "Magenta", "Lime", "Maroon", "Navy", "Olive", "Teal", "Silver", "Gold",
            "Aqua", "Beige", "Coral", "Crimson", "Fuchsia", "Indigo", "Ivory", "Khaki", "Lavender", "Lilac",
            "Mint", "Mustard", "Peach", "Periwinkle", "Plum", "Salmon", "Scarlet", "Tan", "Turquoise", "Violet",
            "Amber", "Azure", "Charcoal", "Chartreuse", "Chestnut", "Cinnamon", "Copper", "Eggplant", "Emerald", "Jade",
            "Mauve", "Ochre", "Onyx", "Papaya", "Peacock", "Pistachio", "Raspberry", "Ruby", "Sapphire", "Seashell",
            "Slate", "Taupe", "Thistle", "Tomato", "Topaz", "Tangerine", "Zaffre", "Amethyst", "Blush", "Bronze",
            "Candy", "Cerulean", "Denim", "Dusty Rose", "Feldspar", "Frost", "Ginger", "Honey", "Iris", "Lemon",
            "Linen", "Mint Cream", "Obsidian", "Orchid", "Peony", "Pine", "Quartz", "Rosewood", "Snow", "Sunflower"
        )
    }

    private val matchingColorsFlow = MutableStateFlow(listOf<String>())

    fun setText(text: String) {
        matchingColorsFlow.value = COLORS.filter { it.contains(text, ignoreCase = true) }
    }

    fun getMatchingColors(): StateFlow<List<String>> = matchingColorsFlow
}
