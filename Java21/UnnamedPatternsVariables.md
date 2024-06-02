```Java
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            int intString = Integer.parseInt(userInput);
            System.out.println(intString);
        } catch (NumberFormatException ex) {
            System.out.println(STR."Invalid input: \{userInput}");
        }

        // todo: In Java 21

        try {
            int intString = Integer.parseInt(userInput);
            System.out.println(intString);
        } catch (NumberFormatException _) {
            System.out.println(STR."Invalid input: \{userInput}");
        }

```
