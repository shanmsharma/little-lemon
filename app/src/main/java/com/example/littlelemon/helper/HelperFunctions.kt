package com.example.littlelemon.helper

fun validateRegData(firstName:String, lastName: String, email: String): Boolean{
    var validated = false

    if(firstName.isNotBlank() && lastName.isNotBlank() && email.isNotBlank()){
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
            validated = true
    }

    return validated
}