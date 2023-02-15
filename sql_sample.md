```sql

CREATE TABLE new_table
  AS (SELECT * FROM old_table);

```

# create table from another table

```sql
  select concat('CREATE TABLE `kushal-stage-db`.', table_name , ' AS (SELECT * FROM `kushal-prod-db`.',table_name, ');' ) from INFORMATION_SCHEMA.TABLES where TABLE_SCHEMA = 'kushal-prod-db'
```
