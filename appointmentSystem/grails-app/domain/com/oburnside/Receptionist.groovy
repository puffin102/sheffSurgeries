package com.oburnside

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

    static constraints = {

recepName blank: false, nullable: false, maxSize: 25
recepEmail blank: false, nullable: false, maxSize: 25, email: true
recepUsername blank: false, nullable: false, maxSize: 10
recepPassword blank: false, nullable: false, maxSize: 25, minSize: 6
recepPhone blank: false, nullable: false, size: 11..11
    }
}
