# A RESTful microservice using Spring Boot, Spring Data JPA and Spring Data REST

## The Project will provide API for Questions, Answers and Ratings to an Answer. 
>The question and its answers are used in a lot of learning and studying web sites. Lexington Science Academy will post scientific study questions and answers to their website. This Restful web service will provide API for the web site building. 

## The project is maven project and generated from ‘Spring Initializr’ at “ttps://start.spring.io”. 

* Four Spring Boot Starters are employed:
1. Web, which includes Tomcat and Spring MVC
2. Rest repositories to expose Spring Data repositories over REST
3. Java Persistence API
4. H2 in memory database driver. 

## Development
* Unzip the file generated by Spring Initializr and open it with will generate the zip file.
* Open it in IntelliJ. Open, select the folder then select pom.xml to tell IntelliJ that it is a Maven project. Click OK. 
* mplement model classes, repository class and server classes


## Three classes are used to represent and questions, answers and ratings to a answer. 
* class Question
* class Answer
* class AnswerRating

> (The class diagram will be added later to show the attributes of each class and how they relate).

## Build, deploy Test
* Build: on IntelliJ terminal, execute 
>C:\projects\lex-sci\questions> mvn install” then 
* Deploy: on IntelliJ terminal, execute 
>C:\projects\lex-sci\questions>java -jar target\questions-0.0.1-SNAPSHOT.jar
* Use Postman to test RESTful API


## RESTful APIs for Question

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
>
    {
        "questionContent": "What is Newton's Third Law?",
        "submittedBy": "Chris Jahnson",
        "submittedTime": "2018-06-11",
        "subject": "PHYS",
        "difficulty": "Easy"
    }
 
* HTTP PATCH /questions/<Id>	update the question with Id by given JSON data
>
    {
        "questionContent": "What is Newton's Third Law?",
        "submittedBy": "Chris Jahnson",
        "submittedTime": "2018-06-11",
        "subject": "PHYS",
        "difficulty": "Medium
    }

 * HTTP DELETE /questions/<Id>	delete the question with Id
    
 * HTTP GET for Search  /questions/search/findByQuestionContent{?questionContent}

## RESTful APIs for Answer

* HTTP GET /answers	            return all answers in JSON format
* HTTP GET /answers/<Id>        return answer with answer Id as <Id>
* HTTP POST/answers	            create a answer with given JSON data
> 
    Header: Content-Type
    Value: application/json
    body JSON
    {
    "answerContent": "The Spring framework comprises several modules such as IOC, AOP, DAO, Context, ORM, WEB MVC etc.",
    "answeredBy": "Jane Robert",
    "answeredTime": "2018-06-11",
    "questionContent": "Spring"
    }

* HTTP PUT /answers/<Id>	update the answer with Id by given JSON data
>
    {
    "answerContent": "Spring is a lightweight framework. It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF etc. The framework, in broader sense, can be defined as a structure where we find solution of the various technical problems.",
    "answeredBy": "Ying",
    "answeredTime": "2018-06-11",
    "questionContent": "Spring"
    }
 
* HTTP PATCH /questions/<Id>	update the answer with Id by given JSON data
>
    {
    "answerContent": "Spring is a lightweight framework. It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF etc. The framework, in broader sense, can be defined as a structure where we find solution of the various technical problems.",
    "answeredBy": "Ying Zhang",
    "answeredTime": "2018-06-11",
    "questionContent": "Spring"
    }

 * HTTP DELETE /answers/<Id>	delete the answer with Id
    
 * HTTP GET for Search  /answers/search/findByQuestion{?question}


