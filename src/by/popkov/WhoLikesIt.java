package by.popkov;

//likes {} // must be "no one likes this"
//        likes {"Peter"} // must be "Peter likes this"
//        likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
//        likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
//        likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        StringBuilder outPut = new StringBuilder();
        if (names.length > 3) {
            outPut.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others like this");
        } else if (names.length == 0) {
            outPut.append("no one likes this");
        } else if (names.length == 1) {
            outPut.append(names[0]).append(" likes this");
        } else if (names.length == 2) {
            outPut.append(names[0]).append(" and ").append(names[1]).append(" like this");
        } else {
            outPut.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
        }
        return outPut.toString();
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
