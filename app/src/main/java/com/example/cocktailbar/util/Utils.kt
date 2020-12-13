package com.example.cocktailbar.util

import com.example.cocktailbar.models.Cocktail

fun getIngredientsAsString(item: Cocktail) : String {
    val ingredients: StringBuilder = StringBuilder()
    ingredients.append(item.ingredient1 ?: "")
    ingredients.append(if (item.ingredient2 != null) ", " + item.ingredient2 else "")
    ingredients.append(if (item.ingredient3 != null) ", " + item.ingredient3 else "")
    ingredients.append(if (item.ingredient4 != null) ", " + item.ingredient4 else "")
    ingredients.append(if (item.ingredient5 != null) ", " + item.ingredient5 else "")
    ingredients.append(if (item.ingredient6 != null) ", " + item.ingredient6 else "")
    ingredients.append(if (item.ingredient7 != null) ", " + item.ingredient7 else "")
    ingredients.append(if (item.ingredient8 != null) ", " + item.ingredient8 else "")
    ingredients.append(if (item.ingredient9 != null) ", " + item.ingredient9 else "")
    ingredients.append(if (item.ingredient10 != null) ", " + item.ingredient10 else "")
    ingredients.append(if (item.ingredient11 != null) ", " + item.ingredient11 else "")
    ingredients.append(if (item.ingredient12 != null) ", " + item.ingredient12 else "")
    ingredients.append(if (item.ingredient13 != null) ", " + item.ingredient13 else "")
    ingredients.append(if (item.ingredient14 != null) ", " + item.ingredient14 else "")
    ingredients.append(if (item.ingredient15 != null) ", " + item.ingredient15 else "")

    return ingredients.toString()
}