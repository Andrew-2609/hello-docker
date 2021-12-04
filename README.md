# Hello, Docker

This is a basic Spring Boot project to say "Hello, Docker" and the current Container ID. Here are the basic steps to
package the project, build it as a Docker Container Image, and send it to Docker Hub:

## Steps to push the Docker Container Image to Docker Hub:

### 1. Package

Run `mvn clean package`. This shall create the project package inside the `target` folder.

### 2. Build

Run `docker build -t hello-docker:0.0.1-SNAPSHOT` (this is the package's name, generated in the previous step).

### 3. Tag the Container Image

You can run `docker images` to see your available Container Images, just to confirm that your built image is available.

Then, run `docker tag hello-docker:0.0.1-SNAPSHOT {your Docker Hub prefix}/hello-docker:0.0.1-SNAPSHOT`

In "your Docker Hub prefix" you put your Docker ID.

### 4. Log in to Docker Hub (if you're not already logged in)

 Run `docker login docker.io` and enter your Docker Hub credentials.

### Push the Container Image to your Docker Hub

Finally, you can push your image to Docker Hub using the following command:

`docker push {your Docker Hub prefix}/hello-docker:0.0.1-SNAPSHOT`

---

That concludes this very simple tutorial, I hope you found it useful!

## Extra: Running the application locally

In case you might want to run your Container Image locally to check it out, after **step 2** you can run the following command:

`docker run -p 8090:8090 {your Container Image's ID, e.g: f99bca60ccd9}`

This shall run a Container in localhost:8090, and you can access it to see the Spring Boot application running.