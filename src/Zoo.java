import java.util.List;

public class Zoo {

    /**
     * Feeds different bird sections of the zoo.
     *
     * @param list list of birds of particular type.
     */
    public static <T extends Bird> void feed(List<T> list) {
        System.out.println("Feeding birds");
        for (var bird : list){
            bird.eat();
        }
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type.
     * @param bird a new bird.
     */
    public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
        System.out.println("Accepting a bird to a section");
        // TODO check flying bird wings
        bird.checkWings();
        // TODO add a bird to the list and print it
        list.add(bird);
        System.out.println(bird);
    }

    /**
     * Adds bird to the general list.
     *
     * @param list    list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> list, Bird newBird) {
        System.out.println("Adding a bird to the birds list");
        list.add(newBird);
        for (var bird : list){
            System.out.println(bird);
        }
    }
}