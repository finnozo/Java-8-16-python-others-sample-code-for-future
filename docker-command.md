```docker
docker network create pdb


docker run --name postgresql -p 5432:5432 --network=pdb -v "$PWD:/var/lib/mysql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine

docker run --name mysql -p 3306:3306 --network=mydb  -e MYSQL_ROOT_PASSWORD=password -d mysql:latest


```
