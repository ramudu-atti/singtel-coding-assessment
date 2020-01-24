# singtel-coding-assessment
This repo contains the source code of the coding assignment of designing animals models. 

## technologies used.
Java 8
Java 8 Stream. 
Spring Boot
Spring Boot test with Junit
Jersey starter added to expose the animals result using REST API. 
Maven

## pre-requisites
Java 8
Maven

##how to run the program
Perform the clone of the repo and application to Your local mahcine
Perform the Maven build or spring boot run which will launch the spring context and application 
Run the AnimalsCount.java file which will be used to fund the count of animals based on their behaviors like runnable, flyable, Swimmable. 

## main interfaces in the project 
interfaces:Flyable, Swimmable, Walkable
Abstract class :Animal
Used delegation approach to replace inheritance between Chicken and Rooster classes and the actions or requests will be delegated to Chicken implementation. 

## TO-Do 
1.We can use the interfaces and default methods implementation rather than abstract classes
but I have chosen abstract classes as there is a possibility of adding the state to the objects size and color of fishes, number of legs of animals by default. 
2. Design and implement the Rest api by implementing the jax-rs specification using Jersey for exposing the result of various operations on animals. 
3. To keep the languages specific sounds for rooster, I can use map and store the language and sound as key value pairs which is a hard coded. 
Or I can use in memory database like H2 database and persisted the language and sound at run time and fetch the corresponding sound of rooster by querying on this database table by using JPA imemenation by adding Spring data JPA. 
