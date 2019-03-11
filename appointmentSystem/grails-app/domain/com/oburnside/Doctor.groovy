package com.oburnside

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
int doctorPhone
String bio

    static constraints = {

fullName blank: false, nullable: false, maxSize: 25
qualification blank: false, nullable: false, maxSize: 50
position blank: false, nullable: false, maxSize: 20
doctorEmail blank: false, nullable: false, maxSize: 25, email: true
password blank: false, nullable: false, maxSize: 25, minSize: 6
doctorOffice blank: false, nullable: false, maxSize: 10
bio blank: false, nullable: false, maxSize: 100
    }
}
