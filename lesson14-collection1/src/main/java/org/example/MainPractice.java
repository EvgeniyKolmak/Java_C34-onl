package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainPractice {

    public static void main(String[] args) {

        var eq = "CL_RESET_BY_CLIENT".equals("CL_RESET_BY_CLIENT");

        int [] arr = {1,2,2,3,4,4,4,5,6,7,1,1,4,4,1};

        Map<Integer,Integer> map = new HashMap<>();

        for (int item : arr) {

            map.put(item, map.getOrDefault(item, 0) + 1);


//            var exist = map.containsKey(item);
//
//            if (exist) {
//
//                var newCount = map.get(item) + 1;
//
//                map.put(item, newCount);
//
//            } else {
//                map.put(item, 1);
//            }

        }

        System.out.println(map);

        Set<Integer> integers = map.keySet();
        int max = 0;
        int number = 0;

        for (Integer num : integers) {
            int count = map.get(num);

            if (count > max) {
                number = num;
                max = count;
            }

        }

        System.out.println(number);


//        List<Worker> workers = List.of(
//                new Worker("worker1", 45, 3000, List.of(
//                        new Child("worker1_1", 12),
//                        new Child("worker1_2", 8)
//                )),
//                new Worker("worker2", 25, 2000, List.of(
//                        new Child("worker2_1", 2)
//                )),
//                new Worker("worker3", 50, 4000, List.of(
//                        new Child("worker3_1", 4),
//                        new Child("worker3_2", 12),
//                        new Child("worker3_3", 20)
//                )),
//                new Worker("worker1", 19, 1000, List.of()));

//        List<Child> children = new ArrayList<>();
//
//        for (Worker worker : workers) {
//
//            List<Child> childList = worker.getChildList();
//
//            if (childList != null) {
//
//                for (Child child : childList) {
//
//                    if (child.getAge() >= 6 && child.getAge() <= 16) {
//                        childList.add(child);
//                    }
//
//                }
//
//            }
//
//        }
//
//        System.out.println(children);

//        int childNumber = 0;
//
//        for (Worker worker : workers) {
//
//            List<Child> childList = worker.getChildList();
//
//            if (childList != null) {
//                int size = childList.size();
//                childNumber += size;
//            }
//
//        }
//
//        System.out.println(childNumber);

//        Set<String> uniqNames = new HashSet<>();
//
//        for (Worker worker : workers) {
//            uniqNames.add(worker.getName());
//        }
//
//        System.out.println(uniqNames);

//        List<Worker> listAgeGreat30 = new ArrayList<>();
//
//        for (Worker worker : workers) {
//
//            if (worker.getAge() >= 30) {
//                listAgeGreat30.add(worker);
//            }
//
//        }
//
//        System.out.println(listAgeGreat30);

//        int sumSalary = 0;
//
//        for (Worker worker : workers) {
//            Integer salary = worker.getSalary();
//            sumSalary += salary;
//        }
//
//        System.out.println(sumSalary);

    }

}
