package edu.sdsu.cs160l.datastructure.queue;

import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;
import jdk.javadoc.internal.tool.JavadocTodo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // TODO (DONE) - Create a queue of students 5 students
        // TODO (DONE) - initialise 5 students and add them to the queue
        // TODO (DONE) - remove the first two students and add 1 student
        // TODO (DONE) - print the final queue
        Queue<Student> students = new LinkedList<>();

        Student john = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student elissa = new Student(1L, "Elissa", 4.0, StudentLevel.SENIOR, StudentMajor.PHYSICS);
        Student jean = new Student(1L, "Jean", 4.0, StudentLevel.FRESHMAN, StudentMajor.BIOLOGY);
        Student vincent = new Student(1L, "Vincent", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student sooben = new Student(1L, "Sooben", 4.0, StudentLevel.SOPHOMORE, StudentMajor.MATH);
        Student lilian = new Student(1L, "Lilian", 4.0, StudentLevel.SOPHOMORE, StudentMajor.BIOLOGY);

        students.add(john);
        students.add(elissa);
        students.add(jean);
        students.add(vincent);
        students.add(sooben);

        students.poll();
        students.poll();
        students.add(lilian);

        System.out.println(students);
    }
}
