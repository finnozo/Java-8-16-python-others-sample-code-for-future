# Spring Notes
- spring.jackson.serialization.write-date-as-timestamp=false

#### Get Current requested URI 
```java
        User savedUser = service.save(user);
        // CREATED
        // /user/{id}     savedUser.getId()
		
        URI location = ServletUriComponentsBuilder
          .fromCurrentRequest()
          .path("/{id}")
          .buildAndExpand(savedUser.getId()).toUri();

		      return ResponseEntity.created(location).build();
```

> ## Best Iterator Practice
> - How to remove data from List 
 ```java
 public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
```

