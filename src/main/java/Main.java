import java.util.List;

public class Main {

    public static void main(String[] args) {

        var nestedList = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(7, 8, 9)
        );

        var flatList = nestedList
                .stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(nestedList);
        System.out.println(flatList);
    }
}
