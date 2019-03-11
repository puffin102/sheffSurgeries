package com.oburnside

class Prescription {

String pharmacyName
long prescripNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying

    static constraints = {

pharmacyName blank: false, nullable: false, maxSize: 30
prescripNumber blank: false, nullable: false, max: 10
medicine blank: false, nullable: false, maxSize: 50
totalCost blank: false, nullable: false
dateIssued blank: false, nullable: false
patientPaying blank: false, nullable: false


    }
}
