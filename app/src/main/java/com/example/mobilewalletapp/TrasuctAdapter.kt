package com.example.mobilewalletapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*

class TrasuctAdapter(var TrasuctionList:List<Trasactions>): Adapter<TransuctionViewHolder>{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransuctionViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.trasuctions_list_items,parent,false)
       return TransuctionViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TransuctionViewHolder, position: Int) {
        var currenttrasuctions=TrasuctionList.get(position)
        holder.tvDescription.text=currenttrasuctions.Description
        holder.tvDate.text=currenttrasuctions.Date
        holder.tvReference.text=currenttrasuctions.Reference
        holder.tvTransuctionType.text=currenttrasuctions.TransactionType

    }

    override fun getItemCount(): Int {
        return TrasuctionList.size
    }
}

class TransuctionViewHolder(itemView: View): ViewHolder(itemView){
    var tvDescription=itemView.findViewById<TextView>(R.id.tvDescription)
    var tvReference=itemView.findViewById<TextView>(R.id.tvReference)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
    var tvTransuctionType=itemView.findViewById<TextView>(R.id.tvTransactionType)

}