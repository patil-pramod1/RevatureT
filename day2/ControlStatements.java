class ControlStatements{
    public static void main(String[] args) {
        // if-else statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop count: " + i);
        }

        // while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("While loop count: " + count);
            count++;
        }

        // do-while loop
        int doCount = 1;
        do {
            System.out.println("Do-while loop count: " + doCount);
            doCount++;
        } while (doCount <= 5);
    }
}