package com.oburnside

class Patient {

String patientName
String patientAddress
String patientResidence
Date patientDOB
String patientID
Date dateRegistered
int patientPhone

    static constraints = {

patientName blank: false, nullable: false, maxSize: 25
patientAddress blank: false, nullable: false, maxSize: 50
patientResidence blank: false, nullable: false, maxSize: 25
patientDOB blank: false, nullable: false
patientID blank: false, nullable: false
dateRegistered blank: false, nullable: false, maxSize: 25
patientPhone blank: false, nullable: false, max: 11
    }
}
