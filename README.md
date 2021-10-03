# CAT API Assignment

This repository is to run a CAT API Application. 

## Endpoints
#### Get Random CAT: `GET /cat/random`

This API, fetches a random cat from the Cat API, using their API `(https://api.thecatapi.com/v1/images/search)` and displays the cat's picture on the browser.

## How to execute
- On windows, run the following command: `mvnw.cmd spring-boot:run`
- On Linux/Mac, run the following command: `./mvn spring-boot:run` (probably, I have tested this in windows)
- Open http://localhost:8080/cat/random in the browser

## Implementation
The API  `/cat/random` is implemented in [CatController class](https://github.com/jain-rishu/cat-api-assignment/blob/main/src/main/java/com/rishu/assignment/controller/CatController.java), by the `getRandom()` method.

Internally, this method, does the following:
- calls the Cat API
- fetches a random cat
- maps the response into [CatResult class](https://github.com/jain-rishu/cat-api-assignment/blob/main/src/main/java/com/rishu/assignment/model/CatResult.java)
- fetches the url attribute from the response object
- displays the image from that URL into the browser

## Result 
Results achieved after running the application using above steps and opening http://localhost:8080/cat/random in a browser.

### Execution 1
![Execution 1](https://github.com/jain-rishu/cat-api-assignment/blob/main/results/API%20Result%201.PNG)

### Execution 2
![Execution 2](https://github.com/jain-rishu/cat-api-assignment/blob/main/results/API%20Result%202.PNG)

### Execution 3
![Execution 3](https://github.com/jain-rishu/cat-api-assignment/blob/main/results/API%20Result%203.PNG)


