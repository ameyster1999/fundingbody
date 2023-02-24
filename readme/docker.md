# Funding Body Docker Essentials



## Docker Installation
- to install docker in your machine run command:
```
choco install docker
```
or
```
brew install docker
```


## Usage

docker is used shipping application in the form of containers



## Building the Docker Image
- To build the Docker image, run the following command in the root directory of the project:
````
docker build -t fundingbody .
````


Running the Docker Container
To run the Docker container, use the following command:

````
docker run -p 8080:8080 fundingbody
````
