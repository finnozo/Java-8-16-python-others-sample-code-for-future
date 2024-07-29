```sql

CREATE TABLE new_table
  AS (SELECT * FROM old_table);

```

# create table from another table

```sql
  select concat('CREATE TABLE `kushal-stage-db`.', table_name , ' AS (SELECT * FROM `kushal-prod-db`.',table_name, ');' ) from INFORMATION_SCHEMA.TABLES where TABLE_SCHEMA = 'kushal-prod-db'
```


```sql
select * from monitorInbox where creationDate > '2024-01-01' and 
sharedToCompanyId in (
select agency_id from company_agency where company_id = 1992
) and sharedByCompanyId = sharedToCompanyId;

select id,alias from media where mediaOwnerShipCompany in (select agency_id from company_agency where company_id = 1992) and creationDate > '2024-01-01';

select id,name from company where id in (
select agency_id from company_agency where company_id = 1992);
```
