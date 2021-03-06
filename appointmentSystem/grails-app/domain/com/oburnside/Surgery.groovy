package com.oburnside

class Surgery {

String name
String address
String postcode
String telephone
int numberOfPatients
String description
String openingTime

static hasMany=[patients: Patient, appointments: Appointment]
static hasOne=[receptionists: Receptionist, nurses: Nurse, doctors: Doctor]

    static constraints = {

name blank: false, nullable: false, maxSize: 30
address blank: false, nullable: false, maxSize: 50
postcode blank: false, nullable: false, maxSize: 8
telephone blank: false, nullable: false, size: 11..11
numberOfPatients blank: false, nullable: false
description blank: false, nullable: false, maxSize: 100
openingTime blank: false, nullable: false, maxSize: 100
    }
}
