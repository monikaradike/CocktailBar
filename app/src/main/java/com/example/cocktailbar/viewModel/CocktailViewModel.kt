package com.example.cocktailbar.viewModel

import androidx.lifecycle.*
import androidx.lifecycle.ViewModel
import com.example.cocktailbar.activities.MainActivity
import com.example.cocktailbar.network.CocktailApi
import kotlinx.coroutines.launch

class CocktailViewModel : ViewModel() {

    fun getAllCocktails() {
        viewModelScope.launch {
            try {
                val listResult = CocktailApi.retrofitService.getAllCocktails().cocktails
                val result = MainActivity.getNumberOfCocktailsText(listResult.size)
                MainActivity.listAdapter?.submitList(listResult)
                MainActivity.showList(result)
                MainActivity.dataLoadFinished()
            } catch (e: Exception) {
                val result = MainActivity.getNetworkErrorMessage()
                MainActivity.hideList(result)
                MainActivity.dataLoadFinished()
            }
        }
    }
}