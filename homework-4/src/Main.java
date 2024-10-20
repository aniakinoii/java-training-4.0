public class Main {
    public static void main(String[] args) {
    //create 3 objects of Student type
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    //input information about them.
    s1.setName("John");
    s1.setRating(1);
    s2.setName("Brie");
    s2.setRating(2);
    s3.setName("Anna");
    s3.setRating(3);
    // Display the average rating of all students.
    System.out.println("average rating = " +
            (s1.getRating() + s2.getRating() + s3.getRating())/3.0);
    //Change the rating of any student.
    s1.changeRating(3);
    //Display the new average rating.

        System.out.println("average rating = " +
                (s1.getRating() + s2.getRating() + s3.getRating())/3.0);
    }

}