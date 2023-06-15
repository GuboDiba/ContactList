package com.gubod.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gubod.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()
        binding.btnFloat.setOnClickListener {
            val intent = Intent(this, NewContacts::class.java)
            startActivity(intent)
        }
    }
    fun displayContact(){
        var contact1=ContactData("https://images.unsplash.com/photo-1458631163262-224e05af286a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fHByb2ZpbGUlMjBwaWN0dXJlJTIwYmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Gubo Diba","0789886655","gubodibawario@gmail.com")
        var contact2=ContactData("https://images.unsplash.com/photo-1474176857210-7287d38d27c6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Esther Mwangi","0767886655","esthermwangi@gmail.com")
        var contact3=ContactData("https://images.unsplash.com/photo-1524660988542-c440de9c0fde?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Joan Njiru","07796687","njirujoan@gmail.com")
        var contact4=ContactData("https://images.unsplash.com/photo-1596510914965-9ae08acae566?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=449&q=80","Veronica Ndemo","0734886655","ndemoveronica@gmail.com")
        var contact5=ContactData("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Wambui Nyambura","072356655","gubodibawario@gmail.com")
        var contact6=ContactData("https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaWN0dXJlJTIwYWZyaWNhbiUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Ann Christine","07214786655","christne@gmail.com")
        var contact7=ContactData("https://images.unsplash.com/photo-1535295972055-1c762f4483e5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Grace Njuguna","071217683","grace@gmail.com")
        var contact8=ContactData("https://images.unsplash.com/photo-1492106087820-71f1a00d2b11?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Alice Moraa","07653246555","moraaalice@gmail.com")
        var contact9=ContactData("https://images.unsplash.com/photo-1500771471050-fb3ee40b66c2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Antiba Clarine","072154655","antiba@gmail.com")
        var contact10=ContactData("https://images.unsplash.com/photo-1496203695688-3b8985780d6a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=395&q=80","Snaida Mary","07097986655","snaidamary@gmail.com")
        var contact11=ContactData("https://images.unsplash.com/photo-1485811661309-ab85183a729c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Lucky Wangari","079874886655","wangari@gmail.com")
        var contact12=ContactData("https://images.unsplash.com/photo-1519699047748-de8e457a634e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=580&q=80","Vallary Buraje","071243886655","burajeval@gmail.com")
        var contact13=ContactData("https://images.unsplash.com/photo-1519419691348-3b3433c4c20e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjl8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Masian Parkire","077686655","parkiremasian@gmail.com")
        var contact14=ContactData("https://images.unsplash.com/photo-1440133197387-5a6020d5ace2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Purity Wanjiku","0789886655","wanjikupurity@gmail.com")
        var contact15=ContactData("https://images.unsplash.com/photo-1485893086445-ed75865251e0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=580&q=80","Bridget Mutesi","0789886655","mutesibridget@gmail.com")
        var contact16=ContactData("https://images.unsplash.com/photo-1525186402429-b4ff38bedec6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDl8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Akech Ann","0789886655","akechann@gmail.com")
        var contact17=ContactData("https://images.unsplash.com/photo-1485178575877-1a13bf489dfe?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Elizabeth Njoroge","0789886655","njoroge@gmail.com")
        var contact18=ContactData("https://images.unsplash.com/photo-1500336624523-d727130c3328?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTR8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Mitingi Joy","0789886655","joymitingi@gmail.com")
        var contact19=ContactData("https://images.unsplash.com/photo-1483706600674-e0c87d3fe85b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTZ8fHByb2ZpbGUlMjBwaWN0dHVyZSUyMHBlb3BsZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Sonia sonia","0789886655","sonia@gmail.com")



        var contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18,contact19)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        var contactRvAdapter=ContactRvAdapter(contactList)
        binding.rvContact.adapter=  contactRvAdapter
    }
}


