package com.manju.nextstep
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.manju.nextstep.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity(), OnItemClickListener{
    lateinit var binding: ActivityMainBinding
    private lateinit var itemViewModel: ItemViewModel
    private lateinit var adapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter =ItemAdapter(listOf(),this)
        binding.recyclerview.layoutManager=LinearLayoutManager(this)
        binding.recyclerview.adapter=adapter
        itemViewModel=ViewModelProvider(this).get(ItemViewModel::class.java)
        itemViewModel.itemsLive.observe(this, Observer {
            adapter.updateItems(it)
        })
    }
    override fun onItemClick(item: Item) {
       Toast.makeText(this,"${item.place}",Toast.LENGTH_SHORT).show()
    }
}