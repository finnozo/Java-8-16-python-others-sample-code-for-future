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
