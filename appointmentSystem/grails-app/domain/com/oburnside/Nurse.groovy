package com.oburnside

class Nurse {

String nurseName
String qualifications
String nurseEmail
String nurseOffice
String nursePhone

static hasMany=[doctors: Doctor, surgeries: Surgery]

    static constraints = {

nurseName blank: false, nullable: false, maxSize: 25
qualifications blank: false, nullable: false, maxSize: 100
nurseEmail blank: false, nullable: false, maxSize: 50, email: true
nurseOffice blank: false, nullable: false, size: 5..5
nursePhone blank: false, nullable: false, size: 11..11

    }
}
