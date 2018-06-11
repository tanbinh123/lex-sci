# A RESTful microservice using Spring Boot, Spring Data JPA and Spring Data REST

## The Project will provide API for Questions, Answers and Ratings to an Answer. 
>The question and its answers are used in a lot of learning and studying web sites. Lexington Science Academy will post scientific study questions and answers to their website. This Restful web service will provide API for the web site building. 

## The project is maven project and generated from ‘Spring Initializr’ at “ttps://start.spring.io”. 

* Four Spring Boot Starters are employed:
1. Web, which includes Tomcat and Spring MVC
2. Rest repositories to expose Spring Data repositories over REST
3. Java Persistence API
4. H2 in memory database driver. 

## Three classes are used to represent and questions, answers and ratings to a answer. 
> (The class diagram will be added later to show the attributes of each class and how they relate).

## RESTful APIs

* HTTP GET /questions	        return all questions in JSON format
* HTTP GET /questions/<Id>      return question with question Id as <Id>
* HTTP POST/questions	        create a question with given JSON data
> 
    Header: Content-Type
    Value: application/json
    body JSON
    {
        "questionContent": "What is Newton's Third Law?",
        "submittedBy": "Lily Lee",
        "submittedTime": "2018-06-11",
        "subject": "PHYS",
        "difficulty": "Easy"
    }

* HTTP PUT /questions/<Id>	update the question with Id by given JSON data

    {
        "questionContent": "What is Newton's Third Law?",
        "submittedBy": "Chris Jahnson",
        "submittedTime": "2018-06-11",
        "subject": "PHYS",
        "difficulty": "Easy"
    }
 
* HTTP PATCH /questions/<Id>	update the question with Id by given JSON data

    {
        "questionContent": "What is Newton's Third Law?",
        "submittedBy": "Chris Jahnson",
        "submittedTime": "2018-06-11",
        "subject": "PHYS",
        "difficulty": "Medium
    }

 * HTTP DELETE /questions/<Id>	delete the question with Id

