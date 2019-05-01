package ru.mirea;


import java.util.ArrayList;

public class Foreman extends Guide implements Technical_Service, Technological_Service {

    ArrayList responsible_for;

    Foreman(String birth, int check, String name, String overdraft, String probation, float salary,
            String telephone, ArrayList responsible_for) {

        super(birth, check, name, overdraft, probation, salary, telephone);
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
