public class Student {
    private String name;
    private int rating;
    public String getName(){
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
    public Student() {
        name = "";
        rating = 0;
    }
    public Student(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
//method to define the better student (between two, return true or false)
// returns true when sa is better than sb
    public static boolean betterStudent(Student sa, Student sb) {
        return sa.rating > sb.rating;
    }
//method to output information about student

    public String toString() {
        return name + " rating: " + rating;
    }

    public void changeRating(int newRating){
        rating = newRating;
    }
}
