package com.oburnside

class Prescription {

String pharmacyName
String prescripNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying

static hasMany=[doctors: Doctor, patients: Patient]

    static constraints = {

pharmacyName blank: false, nullable: false, maxSize: 30
prescripNumber blank: false, nullable: false, maxSize: 10
medicine blank: false, nullable: false, maxSize: 50
totalCost blank: false, nullable: false, scale: 2
dateIssued blank: false, nullable: false
patientPaying blank: false, nullable: false


    }
}
