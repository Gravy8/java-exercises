public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int score;

    Student(String firstName, String lastName, int score){
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int comparison = lastName.compareTo(o.lastName);

        if (comparison == 0) {
            return firstName.compareTo(o.firstName);
        }

        return comparison;
    }

    public int compareByScore(Student other) {
        if (score > other.score) return 1;
        if (score < other.score) return -1;
        return 0;
    }
}
