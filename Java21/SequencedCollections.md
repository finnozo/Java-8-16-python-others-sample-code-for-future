```java        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        // TODO: BEFORE JAVA 21
        int firstElement = list.get(0);
        // Fetch the last element
        int lastElement = list.get(list.size() - 1);

        System.out.println(STR."First \{firstElement}, Last \{lastElement}");

        // TODO: In JAVA 21
        System.out.println(STR."First \{list.getFirst()}, Last \{list.getLast()}");
```
