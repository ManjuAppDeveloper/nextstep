package com.manju.nextstep
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class ItemAdapter (private var items:List<Item>, private val listener: OnItemClickListener) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{
     inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener
     {
        private val textid: TextView = itemView.findViewById(R.id.txt_id)
        private val textplace: TextView = itemView.findViewById(R.id.txt_place)
        init {
            itemView.setOnClickListener(this)
        }
        fun bind(item: Item) {
            textid.text = item.id.toString()
            textplace.text = item.place
        }
         override fun onClick(v: View?) {
            val position=adapterPosition
             if(position!=RecyclerView.NO_POSITION){
                 listener.onItemClick(items[position])
             }
         }
     }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }
    override fun getItemCount(): Int {
       return items.size
    }
    fun updateItems(newItems:List<Item>){
        items=newItems
        notifyDataSetChanged()
    }
}