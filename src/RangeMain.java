public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(10, 35);
        System.out.println("Range length: " + range.getLength());

        System.out.println();

        System.out.println("Starting point: " + range.getFrom());
        System.out.println("End point: " + range.getTo());

        System.out.println();

        range.setFrom(25);
        range.setTo(75);
        System.out.println("Range length: " + range.getLength());

        System.out.println();

        double point = 35;

        if (range.isInside(point)) {
            System.out.println("The Point belongs to the line");
        } else {
            System.out.println("The Point DOES NOT belongs to the line");
        }
    }
}
