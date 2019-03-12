package com.oburnside

class BootStrap {

    def init = { servletContext ->

def Steven_Bold = new Doctor(
fullName: 'Steven Bold',
qualification: 'PHD',
position: 'Head Doctor',
doctorEmail: 'stevenbold@cityhealth.co.uk',
password: 'password1',
doctorOffice: 'City Health Centre',
doctorPhone: '01142123455',
bio: 'orem in libero vitae finibus.',
).save()

def Linda_Newman = new Doctor(
fullName: 'Linda Newman',
qualification: 'PHD',
position: 'Doctor',
doctorEmail: 'Lindanewman@cityhealth.co.uk',
password: 'password1',
doctorOffice: 'City Health Centre',
doctorPhone: '01142123456',
bio: 'orem helloero vitae finibus.',
).save()
  
def appointment1 = new Appointment(
appDate: new Date('22/04/2019'),
appTime: 12.15,
appDuration: 15,
roomNumber: 'B-1234',
).save()

def appointment2 = new Appointment(
appDate: new Date('22/04/2019'),
appTime: 12.30,
appDuration: 60,
roomNumber: 'B-1234',
).save()

def Jordan_Graves = new Nurse(
nurseName: 'Jordan Graves',
qualifications: 'Nursing',
nurseEmail: 'JordanGraves@cityhealthcentre.co.uk',
nurseOffice: 'A-100',
nursePhone: '01142123457',
).save()

def Sandy_Stephens = new Nurse(
nurseName: 'Sandy Stephens',
qualifications: 'Nursing',
nurseEmail: 'SandyStephens@cityhealthcentre.co.uk',
nurseOffice: 'A-101',
nursePhone: '01142123458',
).save()

def Barny_Michaels = new Patient(
patientName: 'Barny Michaels',
patientAddress: '17 City Road',
patientResidence: 'Home',
patientDOB: new Date('20/05/1982'),
patientID: 'A1',
dateRegistered:new Date('17/09/1982'),
patientPhone: '07765458760',
).save()

def Murphy_Davids = new Patient(
patientName: 'Murphy Davids',
patientAddress: '105 City Road',
patientResidence: 'Home',
patientDOB: new Date('15/11/1991'),
patientID: 'A1',
dateRegistered:new Date('06/09/1982'),
patientPhone: '07765458987',
).save()


def recep1 = new Receptionist(
recepName: 'Rylan Ashbourne',
recepEmail: 'RylanAshbourne@cityhealthcentre.co.uk',
recepUsername: 'rashbourne',
recepPassword: 'password1',
recepPhone: '07345678910',
).save()

def recep2 = new Receptionist(
recepName: 'Chris Manley',
recepEmail: 'ChrisManley@cityhealthcentre.co.uk',
recepUsername: 'cmanley',
recepPassword: 'password1',
recepPhone: '07345678911',
).save()


def Surgery1 = new Surgery(
name: 'City Health Centre',
address: '1 City Road',
postcode: 'S1 1AB',
telephone: '01142345677',
numberOfPatients: '205',
description: 'Surgery on City Road',
openingTime: 'Mon-Fri 9AM-5PM',
).save()

def Surgery2 = new Surgery(
name: 'Hallam Health Centre',
address: '75 Hallam Street',
postcode: 'S2 7BJ',
telephone: '01142345678',
numberOfPatients: '64',
description: 'Surgery on Hallam Road',
openingTime: 'Mon-Fri 9AM-5PM',
).save()

def Prescription1 = new Prescription(
pharmacyName: 'City Pharmacy',
prescripNumber: '879432',
medicine: 'Calpol',
totalCost: '12.95',
dateIssued:new Date('13/03/2019'),
patientPaying: true,
).save()


def Prescription2 = new Prescription(
pharmacyName: 'Hallam Pharmacy',
prescripNumber: '8794321',
medicine: 'Calpol',
totalCost: '12.95',
dateIssued:new Date('17/03/2019'),
patientPaying: false,
).save()
}
    def destroy = {
    }
}
