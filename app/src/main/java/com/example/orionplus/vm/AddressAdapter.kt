package com.example.orionplus.vm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orionplus.R
import com.example.orionplus.databinding.AddressItemBinding
import com.example.orionplus.model.ConcretAddress

class AddressAdapter : RecyclerView.Adapter<AddressAdapter.AddressHolder>(){
    var addressList = ArrayList<String>()
    class AddressHolder(item : View): RecyclerView.ViewHolder(item){
        val binding = AddressItemBinding.bind(item)
        fun bind(address : String) = with (binding){
            streetName.text = address
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.address_item, parent, false)
        return AddressHolder(view)
    }

    override fun onBindViewHolder(holder: AddressHolder, position: Int) {
        holder.bind(addressList[position])
    }

    override fun getItemCount(): Int {
        return addressList.size
    }

    fun addAddressName(address : String){
        addressList.add(address)
        notifyDataSetChanged()
    }
}