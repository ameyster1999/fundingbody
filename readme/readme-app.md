# funding application
- rest api for creating funding 
- Endpoint : "/funders/"

## docker
Running our project in docker container:
- build an image
  ```
  docker build -t fundingbody .
  ```
- run a docker container
   ```
  docker docker run --name  fundingbody  -p 8081:8081
  ```
## helm
- create charts:
```
helm create  fundingbody
```
- deploy application :
```
  helm upgrade fundingbody-release --install helm/ fundingbody
```
- remove deployment:
```
helm uninstall helm/fundingbody
```
##  Verification:Profile service in local environment
1. Run the backend using the command `mvn spring-boot:run -Dspring-boot.run.profiles=local` in your local machine.
2. Navigate to http://localhost:8081/endpoint
## Database Setup
This setup is following the postgres setup using [docker](https://www.docker.com/).

1. Run the command `docker pull postgres`
2. Start the docker container for postgres
```
`docker run --name fund-local -p5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres`
```

## Technology Stack
- Postgres 11
- Spring Boot 2.5.1
- Java 11