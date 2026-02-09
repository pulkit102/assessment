package sorting;

public class bubbleSortobj {

    // Make Student static so it can be used in static methods
    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void bubbleSort(Student[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j].marks > arr[j + 1].marks) {

                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student("Aman", 75),
                new Student("Riya", 90),
                new Student("Karan", 60),
                new Student("Neha", 85)
        };

        bubbleSort(students);

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}
