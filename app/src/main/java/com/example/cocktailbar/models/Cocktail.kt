package com.example.cocktailbar.models

import com.squareup.moshi.Json
import java.io.Serializable

data class Drinks(
    @Json(name = "drinks") val cocktails: List<Cocktail>
)

data class Cocktail (
    @Json(name = "idDrink") val id: String,
    @Json(name = "strDrink") val name: String?,
    @Json(name = "strAlcoholic") val alcohol: String?,
    @Json(name = "strGlass") val glass: String?,
    @Json(name = "strInstructions") val instructions: String?,
    @Json(name = "strDrinkThumb") val imageUrlThumb: String?,
    @Json(name = "strIngredient1") val ingredient1: String?,
    @Json(name = "strIngredient2") val ingredient2: String?,
    @Json(name = "strIngredient3") val ingredient3: String?,
    @Json(name = "strIngredient4") val ingredient4: String?,
    @Json(name = "strIngredient5") val ingredient5: String?,
    @Json(name = "strIngredient6") val ingredient6: String?,
    @Json(name = "strIngredient7") val ingredient7: String?,
    @Json(name = "strIngredient8") val ingredient8: String?,
    @Json(name = "strIngredient9") val ingredient9: String?,
    @Json(name = "strIngredient10") val ingredient10: String?,
    @Json(name = "strIngredient11") val ingredient11: String?,
    @Json(name = "strIngredient12") val ingredient12: String?,
    @Json(name = "strIngredient13") val ingredient13: String?,
    @Json(name = "strIngredient14") val ingredient14: String?,
    @Json(name = "strIngredient15") val ingredient15: String?,
    @Json(name = "strMeasure1") val ingredient1measure: String?,
    @Json(name = "strMeasure2") val ingredient2measure: String?,
    @Json(name = "strMeasure3") val ingredient3measure: String?,
    @Json(name = "strMeasure4") val ingredient4measure: String?,
    @Json(name = "strMeasure5") val ingredient5measure: String?,
    @Json(name = "strMeasure6") val ingredient6measure: String?,
    @Json(name = "strMeasure7") val ingredient7measure: String?,
    @Json(name = "strMeasure8") val ingredient8measure: String?,
    @Json(name = "strMeasure9") val ingredient9measure: String?,
    @Json(name = "strMeasure10") val ingredient10measure: String?,
    @Json(name = "strMeasure11") val ingredient11measure: String?,
    @Json(name = "strMeasure12") val ingredient12measure: String?,
    @Json(name = "strMeasure13") val ingredient13measure: String?,
    @Json(name = "strMeasure14") val ingredient14measure: String?,
    @Json(name = "strMeasure15") val ingredient15measure: String?,
    @Json(name = "strImageSource") val imageSource: String?,
    @Json(name = "strImageAttribution") val imageBy: String?
) :  Serializable