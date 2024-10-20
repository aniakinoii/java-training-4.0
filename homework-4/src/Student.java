public class Student {
    int rating;
    private String name;

    public Student() {
        name = "";
        rating = 0;
    }
    public Student(String name) {
        this.name = name;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;

    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students

    }
    

    @Override
    public String toString() {
        return name + " rating: " + rating;
    }
}