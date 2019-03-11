package com.oburnside

class Surgery {

String name
String address
String postcode
String telephone
int numberOfPatients
String description
String openingTime

    static constraints = {

name blank: false, nullable: false, maxSize: 25
address blank: false, nullable: false, maxSize: 50
postcode blank: false, nullable: false, maxSize: 8
telephone blank: false, nullable: false, size: 11..11
numberOfPatients blank: false, nullable: false, max: 11
description blank: false, nullable: false, maxSize: 100
openingTime blank: false, nullable: false, maxSize: 100
    }
}
