package org.example.random;

import java.util.*;

public class TaskScheduler {
    public static int getMinTime(List<Integer> task_memory, List<Integer> task_type, int max_memory) {
        Map<Integer, List<Integer>> taskMap = new HashMap<>();

        // Populate the taskMap with task types and their memory requirements
        for (int i = 0; i < task_memory.size(); i++) {
            int type = task_type.get(i);
            int memory = task_memory.get(i);

            if (!taskMap.containsKey(type)) {
                taskMap.put(type, new ArrayList<>());
            }
            taskMap.get(type).add(memory);
        }

        int total_time = 0;  // Total processing time

        // Iterate through the taskMap and process tasks in pairs
        for (List<Integer> memList : taskMap.values()) {
            Collections.sort(memList, Collections.reverseOrder());  // Sort tasks of the same type by memory requirement
            while (!memList.isEmpty()) {
                if (memList.size() >= 2 && memList.get(0) + memList.get(1) <= max_memory) {
                    memList.remove(0);  // Remove the two tasks
                    memList.remove(0);
                    total_time++;  // Increment processing time
                } else {
                    memList.remove(0);  // Process a single task
                    total_time++;
                }
            }
        }

        return total_time;
    }

    public static int getMinTimePq(List<Integer> task_memory, List<Integer> task_type, int max_memory) {
        Map<Integer, PriorityQueue<Integer>> taskMap = new HashMap<>();
        LinkedList<Integer> availableMemory = new LinkedList<>();
        int total_time = 0;

        for (int i = 0; i < task_memory.size(); i++) {
            int type = task_type.get(i);
            int memory = task_memory.get(i);

            if (!taskMap.containsKey(type)) {
                taskMap.put(type, new PriorityQueue<>(Collections.reverseOrder()));
            }
            taskMap.get(type).add(memory);
        }

        for (int type : task_type) {
            PriorityQueue<Integer> memQueue = taskMap.get(type);
            int taskMemory = memQueue.poll();

            while (!availableMemory.isEmpty() && availableMemory.getFirst() < total_time) {
                availableMemory.removeFirst();
            }

            if (availableMemory.size() >= 2 && taskMemory + availableMemory.get(1) <= max_memory) {
                availableMemory.removeFirst();
                availableMemory.removeFirst();
            } else {
                total_time++;
            }

            availableMemory.add(total_time + 1);
        }

        return total_time;
    }

    public static void main(String[] args) {
        List<Integer> task_memory = Arrays.asList(7, 2, 3, 9);
        List<Integer> task_type = Arrays.asList(1, 2, 1, 3);
        int max_memory = 10;
        int result = getMinTimePq(task_memory, task_type, max_memory);
        int result1 = getMinTimePq(Arrays.asList(1, 2, 3, 4, 2), Arrays.asList(1, 2, 1, 2, 3), 4);//exp: 4
        System.out.println("Minimum processing time1: " + result);
        System.out.println("Minimum processing time2: " + result1);
    }
}