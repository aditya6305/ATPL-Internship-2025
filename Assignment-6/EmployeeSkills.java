package com.aaslin.java.assignments.assignment6;

import java.util.*;

public class EmployeeSkills{
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Aditya", "Bharath", "Charan");
        List<List<String>> employeeSkills = new ArrayList<>();
        employeeSkills.add(Arrays.asList("Java", "Python", "SQL"));
        employeeSkills.add(Arrays.asList("Python", "C++", "HTML"));
        employeeSkills.add(Arrays.asList("Java", "React", "SQL"));
        String skillToFind = "Python";
        System.out.println("Employees with skill " + skillToFind + ":");
        for (int i = 0; i < employeeSkills.size(); i++) {
            List<String> skills = employeeSkills.get(i);
            for (int j = 0; j < skills.size(); j++) {
                if (skills.get(j).equalsIgnoreCase(skillToFind)) {
                    System.out.println(employeeNames.get(i));
                    break;
                }
            }
        }
        String emp1 = "Aditya";
        String emp2 = "Charan";
        int index1 = employeeNames.indexOf(emp1);
        int index2 = employeeNames.indexOf(emp2);
        if (index1 != -1 && index2 != -1) {
            System.out.println("Common skills between " + emp1 + " and " + emp2 + ":");
            List<String> list1 = employeeSkills.get(index1);
            List<String> list2 = employeeSkills.get(index2);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
                        System.out.println(list1.get(i));
                    }
                }
            }
        } else {
            System.out.println("Employees names are not valid");
        }
    }
}