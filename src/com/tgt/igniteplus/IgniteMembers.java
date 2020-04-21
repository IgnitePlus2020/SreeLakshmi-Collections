package com.tgt.igniteplus;

import java.util.Set;

public class IgniteMembers {
    private String Name;
    private String College;
    private int Age;
    private Set<String> SkillSet;
    private String Department;

    public IgniteMembers(String name, String college, String department, Set<String> skillSet, int age) {
        Name = name;
        College = college;
        Department = department;
        SkillSet = skillSet;
        Age = age;
    }

    public IgniteMembers(){};

    @Override
    public String toString() {
        return "IgniteMembers{" +
                "Name='" + Name + '\'' +
                ", College='" + College + '\'' +
                ", Age=" + Age +
                ", SkillSet=" + SkillSet +
                ", Department='" + Department + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public String getCollege() {
        return College;
    }

    public int getAge() {
        return Age;
    }

    public Set<String> getSkillSet() {
        return SkillSet;
    }

    public String getDepartment() {
        return Department;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCollege(String college) {
        College = college;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSkillSet(Set<String> skillSet) {
        SkillSet = skillSet;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
