package com.example.contactdetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contactdetails.databinding.ActivityContactDetailsBinding


class ContactDetailsActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lAContact.playAnimation()
        val bundle = intent.extras
        if(bundle!=null){
            val contactName = bundle.getString("EXTRA_CONTACT_NAME")
            val contactNumber = bundle.getString("EXTRA_CONTACT_NUMBER")
            val emailAddress = bundle.getString("EXTRA_EMAIL_ADDRESS")
            val postalAddress= bundle.getString("EXTRA_ADDRESS")
            val zipCode =bundle.getInt("EXTRA_ZIP_CODE")
            val city= bundle.getString("EXTRA_CITY")
            val country = bundle.getString("EXTRA_COUNTRY")
            val organization= bundle.getString("EXTRA_ORGANIZATION")
            val profession= bundle.getString("EXTRA_PROFESSION")

            binding.txtViewContactName.text= "Would you like to connect with $contactName?"
            binding.txtViewPhoneNumber.text =contactNumber
            binding.txtViewEmailAddress.text = emailAddress
            binding.txtViewPostalAddress.text = postalAddress
            binding.txtViewZipCode.text = zipCode.toString()
            binding.txtViewCity.text =city
            binding.txtViewCountry.text =country
            binding.txtViewOrganization.text = organization
            binding.txtViewProfession.text = profession

        }
    }
}