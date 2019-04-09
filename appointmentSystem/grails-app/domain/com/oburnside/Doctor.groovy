package com.oburnside

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
String doctorPhone
String bio

static hasMany=[surgeries: Surgery, nurses: Nurse, patients: Patient]
static hasOne=[prescriptions: Prescription, appointments: Appointment]

    static constraints = {

fullName blank: false, nullable: false, maxSize: 25
qualification blank: false, nullable: false, maxSize: 50
position blank: false, nullable: false, maxSize: 20
doctorEmail blank: false, nullable: false, maxSize: 35, email: true
password blank: false, nullable: false, maxSize: 25, minSize: 6
doctorOffice blank: false, nullable: false, size: 10..50
doctorPhone blank:false, nullable: false, size: 11..11
bio blank: false, nullable: false, maxSize: 100

    }
}
