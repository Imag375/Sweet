package ru.mirea;

public class Request {

    public void requestSalary(Technological_Service obj) {
        if(obj.getSalary() >= 31000) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestCheck(Technological_Service obj) {
        if(obj.getCheck() > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestCheckT(Technical_Service obj) {
        if(obj.getCheck() > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }


    public void requestOverdraft(Technological_Service obj) {
        if(obj.getCheck() > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestOverdraftT(Technical_Service obj) {
        if(obj.getCheck() > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }
    public void requestBirth(Technological_Service obj) {
        if(obj.getBirth().indexOf(".05.") > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestBirthT(Technical_Service obj) {
        if(obj.getBirth().indexOf(".05.") > 0) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestGender(Technological_Service obj) {
        if(obj.getNam().endsWith("a")) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }

    public void requestGenderT(Technical_Service obj) {
        if(obj.getNam().endsWith("a")) {
            System.out.println("  " + obj.getNam() + " (" + obj.getClass().getName() + ")");
        }
    }
}
