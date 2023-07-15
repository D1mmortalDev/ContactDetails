package com.example.contactdetails

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contactdetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lAContact.playAnimation()

        binding.btnSubmit.setOnClickListener {
            val contactName = binding.editTxtContactName.text.toString()
            val contactNumber = binding.editTxtContactNumber.text.toString()
            val emailAddress:String = binding.editTxtEmailAddress.text.toString()
            val address:String = binding.editTxtPostalAddress.text.toString()
            val zipCode:Int = binding.editTxtZipCode.text.toString().toInt()
            val city:String = binding.editTxtCity.text.toString()
            val country:String = binding.editTxtCountry.text.toString()
            val organization:String=binding.editTxtOrganization.text.toString()
            val profession:String = binding.editTxtProfession.text.toString()

            val contactDetails = ContactDetails(contactName,contactNumber,emailAddress,address,zipCode,city,country,organization,profession)

            val myIntent = Intent(this,ContactDetailsActivity::class.java)
            val extras = Bundle()
            extras.putString("EXTRA_CONTACT_NAME", contactDetails.getContactName())
            extras.putString("EXTRA_CONTACT_NUMBER",contactDetails.getContactNumber().toString())
            extras.putString("EXTRA_EMAIL_ADDRESS",contactDetails.getEmailAddress())
            extras.putString("EXTRA_ADDRESS",contactDetails.getAddress())
            extras.putInt("EXTRA_ZIP_CODE",contactDetails.getZipCode())
            extras.putString("EXTRA_CITY",contactDetails.getCity())
            extras.putString("EXTRA_COUNTRY",contactDetails.getCountry())
            extras.putString("EXTRA_ORGANIZATION",contactDetails.getOrganizations())
            extras.putString("EXTRA_PROFESSION",contactDetails.getProfession())
            myIntent.putExtras(extras)
            startActivity(myIntent)
            finish()
        }
    }
}