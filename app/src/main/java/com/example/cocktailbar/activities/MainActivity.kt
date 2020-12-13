package com.example.cocktailbar.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocktailbar.R
import com.example.cocktailbar.adapters.MainActivityListAdapter
import com.example.cocktailbar.databinding.ActivityMainBinding
import com.example.cocktailbar.viewModel.CocktailViewModel

class MainActivity : AppCompatActivity(), MainActivityListAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CocktailViewModel by lazy {
        ViewModelProvider(this).get(CocktailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        context = this

        initializeView()
        initializeList()
    }

    override fun onResume() {
        super.onResume()
        context = this
    }

    fun initializeView() {
        binding.swiperefresh.isRefreshing = true
        binding.cocktailList.visibility = View.GONE
        binding.result.visibility = View.GONE

        viewModel.getAllCocktails()

        binding.swiperefresh.setOnRefreshListener {
            viewModel.getAllCocktails()
        }
    }

    fun initializeList() {
        listAdapter = MainActivityListAdapter(this)
        binding.cocktailList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }
    }

    fun showCocktailList(result: String) {
        binding.result.text = result
        binding.result.visibility = View.VISIBLE
        binding.cocktailList.visibility = View.VISIBLE
    }

    fun hideCocktailList(result: String) {
        binding.result.text = result
        binding.result.visibility = View.VISIBLE
        binding.cocktailList.visibility = View.GONE
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, CocktailDetailActivity::class.java)
        intent.putExtra(COCKTAIL, listAdapter?.currentList?.get(position))
        startActivity(intent)
    }

    companion object {
        var context: MainActivity? = null
        val COCKTAIL = "cocktail"

        fun getNetworkErrorMessage() : String {
            return context?.getString(R.string.network_error) ?: ""
        }
        fun getNumberOfCocktailsText(count: Int) : String {
            return context?.getString(R.string.number_of_cocktails_text, count) ?: ""
        }

        fun showList(result: String) {
            context?.showCocktailList(result)
        }

        fun hideList(result: String) {
            context?.hideCocktailList(result)
        }

        fun dataLoadFinished() {
            context?.binding?.swiperefresh?.isRefreshing = false
        }

        var listAdapter: MainActivityListAdapter? = null
    }
}