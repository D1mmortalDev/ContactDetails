package com.example.contactdetails

class ContactDetails(private var contactName:String,private var contactNumber:String,private var emailAddress:String,private var address:String, private var zipCode:Int,private var city:String,private var country:String,private  var organization:String,private var profession:String){

    fun setContactName(contactName: String){
        this.contactName =contactName
    }
    fun setContactNumber(contactNumber: String){
        this.contactNumber =contactNumber
    }
    fun setEmailAddress(emailAddress: String){
        this.emailAddress =emailAddress
    }
    fun setAddress(address: String){
        this.address = address
    }
    fun setZipCode(zipCode: Int){
        this.zipCode =zipCode
    }
    fun setCity(city: String){
        this.city =city
    }
    fun setCountry(country: String){
        this.country =country
    }
    fun setOrganization(organization: String){
        this.organization =organization
    }
    fun setProfession(profession: String){
        this.profession
    }
    fun getContactName():String{
        return contactName
    }
    fun getContactNumber():String{
        return contactNumber
    }
    fun getEmailAddress():String{
        return emailAddress
    }
    fun getAddress():String{
        return address
    }
    fun getZipCode():Int{
        return zipCode
    }
    fun getCity():String{
        return city
    }
    fun getCountry():String{
        return country
    }
    fun getOrganizations():String{
        return organization
    }
    fun getProfession():String{
        return profession
    }
}