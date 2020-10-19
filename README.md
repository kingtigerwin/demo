# How to Build a simple docker image


## There is a Dockerfile_simple which is used to simply build in local
docker build -f ./Dockerfile_simple -t tiger/demo .   

## There is a normal Dockerfile which is used to build the artifact for ECS deployment. Several environment variables are passed through

 DOCKER_BUILDKIT=1 docker build  -t tiger/demo .  
### Run below command to start a new docker container
#### docker run --rm --name web  -d -p 8080:8080 --env SPRING_DATASOURCE_URL=jdbc:postgresql://docker.for.mac.localhost:5432/postgres --env SPRING_DATASOURCE_USERNAME=postgres --env SPRING_DATASOURCE_PASSWORD=mysecretpassword   tiger/demo  
