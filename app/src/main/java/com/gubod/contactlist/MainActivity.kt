package com.gubod.contactlist

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
    }
    fun displayContact(){
        var contact1=ContactData("","Gubo Diba","0789886655","gubodibawario@gmail.com")
        var contact2=ContactData("","Esther Mwangi","0767886655","esthermwangi@gmail.com")
        var contact3=ContactData("","Joan Njiru","07796687","njirujoan@gmail.com")
        var contact4=ContactData("","Veronica Ndemo","0734886655","ndemoveronica@gmail.com")
        var contact5=ContactData("","Wambui Nyambura","072356655","gubodibawario@gmail.com")
        var contact6=ContactData("","Ann Christine","07214786655","christne@gmail.com")
        var contact7=ContactData("","Grace Njuguna","071217683","grace@gmail.com")
        var contact8=ContactData("","Alice Moraa","07653246555","moraaalice@gmail.com")
        var contact9=ContactData("","Antiba Clarine","072154655","antiba@gmail.com")
        var contact10=ContactData("","Snaida Mary","07097986655","snaidamary@gmail.com")
        var contact11=ContactData("","Lucky Wangari","079874886655","wangari@gmail.com")
        var contact12=ContactData("","Vallary Buraje","071243886655","burajeval@gmail.com")
        var contact13=ContactData("","Masian Parkire","077686655","parkiremasian@gmail.com")
        var contact14=ContactData("","Purity Wanjiku","0789886655","wanjikupurity@gmail.com")
        var contact15=ContactData("","Bridget Mutesi","0789886655","mutesibridget@gmail.com")
        var contact16=ContactData("","Akech Ann","0789886655","akechann@gmail.com")
        var contact17=ContactData("","Elizabeth Njoroge","0789886655","njoroge@gmail.com")
        var contact18=ContactData("","Mitingi Joy","0789886655","joymitingi@gmail.com")
        var contact19=ContactData("","Sonia sonia","0789886655","sonia@gmail.com")



        var contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15,contact16,contact17,contact18,contact19)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        var contactRvAdapter=ContactRvAdapter(contactList)
        binding.rvContact.adapter=  contactRvAdapter
    }
}


