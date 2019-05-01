package ru.mirea;

public class Electric implements Technical_Service {
    String birth;
    int check;
    String name;
    String overdraft;
    String probation;
    float salary;
    String telephone;

    String rank;

    Electric(String birth, int check, String name, String overdraft, String probation, float salary, String telephone, String rank) {
        this.birth = birth;
        this.check = check;
        this.name = name;
        this.overdraft = overdraft;
        this.probation = probation;
        this.salary = salary;
        this.telephone = telephone;
        this.rank = rank;
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
    public String getOverdraft() {
        return overdraft;
    }

    @Override
    public String getBirth() {
        return birth;
    }
}
