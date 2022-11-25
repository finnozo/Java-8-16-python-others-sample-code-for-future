``` java

private static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors) {
        final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();
        return t -> {
            final List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());
            return seen.putIfAbsent(keys, Boolean.TRUE) == null;
        };
    }
    
    
    
    //Add some random persons
List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

// Get distinct people by full name
List<Person> distinctPeople = list.stream()
              .filter( distinctByKey(p -> p.getFname() + " " + p.getLname()) )
              .collect( Collectors.toList() );

//********The distinctByKey() method need to be created**********

public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
{
  Map<Object, Boolean> map = new ConcurrentHashMap<>();
  return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
}
```
