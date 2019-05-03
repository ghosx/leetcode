package employee_importance;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    }
}


class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee em : employees
        ) {
            map.put(em.id, em);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        importance += map.get(id).importance;
        while (!queue.isEmpty()) {
            Employee e = queue.poll();
            for (Integer i : e.subordinates
            ) {
                queue.offer(map.get(i));
                importance += map.get(i).importance;
            }
        }
        return importance;
    }
}