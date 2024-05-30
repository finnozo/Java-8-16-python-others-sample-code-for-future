# Pattern Matching

## Before Java 21

```java
switch (response.toLowerCase()) {
            case "yes":
            case "yeah":
                System.out.println("You said yes!");
                break;
            case "no":
            case "nope":
                System.out.println("You said no!");
                break;
            default:
                System.out.println("Please choose.");
        }
```

## In Java 21

```java
System.out.println("todo: In Java 21");
        switch (response.toLowerCase()) {
            case "yes", "yeah" -> System.out.println("You said yes!");
            case "no", "nope" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }
```
