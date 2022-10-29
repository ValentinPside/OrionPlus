package com.example.orionplus.vm

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.orionplus.model.ConcretAddress

class AddressAdapter : RecyclerView.Adapter<AddressAdapter.AddressHolder> {
    class AddressHolder(item : View): RecyclerView.ViewHolder(item){
        fun bind(address : ConcretAddress){

        }
    }
}