package com.gubod.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gubod.contactlist.databinding.ContactListItemBinding

class ContactRvAdapter(var contactData: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
         val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
         return ContactViewHolder(binding)

     }

     override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
         var currentContact=contactData.get(position)
         var binding=holder.binding
         binding.tvName.text=currentContact.name
         binding.tvNumber.text=currentContact.number
         binding.tvEmail.text=currentContact.email


     }

     override fun getItemCount(): Int {
         return contactData.size
     }
 }
class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

}