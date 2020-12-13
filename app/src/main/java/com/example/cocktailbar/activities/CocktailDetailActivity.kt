package com.example.cocktailbar.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.cocktailbar.databinding.ActivityCocktailDetailBinding
import com.example.cocktailbar.models.Cocktail

class CocktailDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCocktailDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCocktailDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (intent.getSerializableExtra(MainActivity.COCKTAIL) != null) {
            val cocktail = intent.getSerializableExtra(MainActivity.COCKTAIL) as Cocktail
            binding.name.text = cocktail.name ?: ""
            binding.instructions.text = cocktail.instructions ?: ""
            bindIngredients(cocktail)
            Glide.with(this)
                .load(cocktail.imageUrlThumb)
                .into(binding.imageView)
        }
    }

    fun bindIngredients(cocktail: Cocktail) {
        if (cocktail.ingredient1 != null) {
            binding.ingredient1Measure.text = cocktail.ingredient1measure ?: ""
            binding.ingredient1Measure.visibility = View.VISIBLE
            binding.ingredient1.text = cocktail.ingredient1
            binding.ingredient1.visibility = View.VISIBLE
        }
        if (cocktail.ingredient2 != null) {
            binding.ingredient2Measure.text = cocktail.ingredient2measure ?: ""
            binding.ingredient2Measure.visibility = View.VISIBLE
            binding.ingredient2.text = cocktail.ingredient2
            binding.ingredient2.visibility = View.VISIBLE
        }
        if (cocktail.ingredient3 != null) {
            binding.ingredient3Measure.text = cocktail.ingredient3measure ?: ""
            binding.ingredient3Measure.visibility = View.VISIBLE
            binding.ingredient3.text = cocktail.ingredient3
            binding.ingredient3.visibility = View.VISIBLE
        }
        if (cocktail.ingredient4 != null) {
            binding.ingredient4Measure.text = cocktail.ingredient4measure ?: ""
            binding.ingredient4Measure.visibility = View.VISIBLE
            binding.ingredient4.text = cocktail.ingredient4
            binding.ingredient4.visibility = View.VISIBLE
        }
        if (cocktail.ingredient5 != null) {
            binding.ingredient5Measure.text = cocktail.ingredient5measure ?: ""
            binding.ingredient5Measure.visibility = View.VISIBLE
            binding.ingredient5.text = cocktail.ingredient5
            binding.ingredient5.visibility = View.VISIBLE
        }
        if (cocktail.ingredient6 != null) {
            binding.ingredient6Measure.text = cocktail.ingredient6measure ?: ""
            binding.ingredient6Measure.visibility = View.VISIBLE
            binding.ingredient6.text = cocktail.ingredient6
            binding.ingredient6.visibility = View.VISIBLE
        }
        if (cocktail.ingredient7 != null) {
            binding.ingredient7Measure.text = cocktail.ingredient7measure ?: ""
            binding.ingredient7Measure.visibility = View.VISIBLE
            binding.ingredient7.text = cocktail.ingredient7
            binding.ingredient7.visibility = View.VISIBLE
        }
        if (cocktail.ingredient8 != null) {
            binding.ingredient8Measure.text = cocktail.ingredient8measure ?: ""
            binding.ingredient8Measure.visibility = View.VISIBLE
            binding.ingredient8.text = cocktail.ingredient8
            binding.ingredient8.visibility = View.VISIBLE
        }
        if (cocktail.ingredient9 != null) {
            binding.ingredient9Measure.text = cocktail.ingredient9measure ?: ""
            binding.ingredient9Measure.visibility = View.VISIBLE
            binding.ingredient9.text = cocktail.ingredient9
            binding.ingredient9.visibility = View.VISIBLE
        }
        if (cocktail.ingredient10 != null) {
            binding.ingredient10Measure.text = cocktail.ingredient10measure ?: ""
            binding.ingredient10Measure.visibility = View.VISIBLE
            binding.ingredient10.text = cocktail.ingredient10
            binding.ingredient10.visibility = View.VISIBLE
        }
        if (cocktail.ingredient11 != null) {
            binding.ingredient11Measure.text = cocktail.ingredient11measure ?: ""
            binding.ingredient11Measure.visibility = View.VISIBLE
            binding.ingredient11.text = cocktail.ingredient11
            binding.ingredient11.visibility = View.VISIBLE
        }
        if (cocktail.ingredient12 != null) {
            binding.ingredient12Measure.text = cocktail.ingredient12measure ?: ""
            binding.ingredient12Measure.visibility = View.VISIBLE
            binding.ingredient12.text = cocktail.ingredient12
            binding.ingredient12.visibility = View.VISIBLE
        }
        if (cocktail.ingredient13 != null) {
            binding.ingredient13Measure.text = cocktail.ingredient13measure ?: ""
            binding.ingredient13Measure.visibility = View.VISIBLE
            binding.ingredient13.text = cocktail.ingredient13
            binding.ingredient13.visibility = View.VISIBLE
        }
        if (cocktail.ingredient14 != null) {
            binding.ingredient14Measure.text = cocktail.ingredient14measure ?: ""
            binding.ingredient14Measure.visibility = View.VISIBLE
            binding.ingredient14.text = cocktail.ingredient14
            binding.ingredient14.visibility = View.VISIBLE
        }
        if (cocktail.ingredient15 != null) {
            binding.ingredient15Measure.text = cocktail.ingredient15measure ?: ""
            binding.ingredient15Measure.visibility = View.VISIBLE
            binding.ingredient15.text = cocktail.ingredient15
            binding.ingredient15.visibility = View.VISIBLE
        }
    }
}