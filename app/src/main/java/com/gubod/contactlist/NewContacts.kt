package com.gubod.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gubod.contactlist.databinding.ActivityNewContactsBinding


class NewContacts : AppCompatActivity() {
    lateinit var binding:ActivityNewContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewContactsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_new_contacts)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnButton.setOnClickListener {
            validateContact()
        }

    }

    fun validateContact(){
        val name = binding.etFirstName.text.toString()
        val lastName=binding.etLastName.text.toString()
        val email = binding.etEmail.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilFirstName.error = "Name field cannot be empty"
            error = true
        }
        if (name.isBlank()){
            binding.tilLastName.error = "Name field cannot be empty"
            error = true
        }


        if (phone.isBlank()){
            binding.tilPhoneNumber.error = "Phone number field cannot be empty"
            error = true
        }

        if (!error){
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }
    }
}