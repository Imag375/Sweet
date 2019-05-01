package ru.mirea;

import java.util.ArrayList;

public class Master implements Technological_Service {

    String birth;
    int check;
    String name;
    String overdraft;
    String probation;
    float salary;
    String telephone;
    ArrayList responsible_for;

    Master(String birth, int check, String name, String overdraft, String probation, float salary,
           String telephone, ArrayList responsible_for) {

        this.birth = birth;
        this.check = check;
        this.name = name;
        this.overdraft = overdraft;
        this.probation = probation;
        this.salary = salary;
        this.telephone = telephone;
        this.responsible_for = responsible_for;
    }

    @Override
    public float getSalary(){
        return this.salary;
    }

    @Override
    public String getNam(){
        return this.name;
    }

    @Override
    public int getCheck() {
        return check;
    }

    @Override
    public String getBirth() {
        return birth;
    }

    @Override
    public String getOverdraft() {
        return overdraft;
    }
}
