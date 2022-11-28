```sql
To get a bulk insert with Spring Boot and Spring Data JPA you need only two things:

set the option spring.jpa.properties.hibernate.jdbc.batch_size to appropriate value you need (for example: 20).

use saveAll() method of your repo with the list of entities prepared for inserting.

Working example is here.

Regarding the transformation of the insert statement into something like this:

INSERT INTO table VALUES (1, 2), (3, 4), (5, 6)
the such is available in PostgreSQL: you can set the option reWriteBatchedInserts to true in jdbc connection string:

jdbc:postgresql://localhost:5432/db?reWriteBatchedInserts=true
then jdbc driver will do this transformation.

Additional info about batching you can find here.

UPDATED

Demo project in Kotlin: sb-kotlin-batch-insert-demo

UPDATED

```
