# Words Count

Project Description:

This project counts the numbers of words added.
If the word is non-alphabetical, then the word will not be counted.
If the word is not in the English language, then the word will be translated to English then it will be counted.

Features

1.One or multiple words are added through the API
2.If the word is in another language, then the word will be translated to English.
3.If there are multiple words, then each word is separated.
4.non-alphabetical and alphabetical words are checked with a Regular Expression.
5.Only alphabetical words get counted.

Example: 

English to Spanish
Request URL : 
localhost:8080/ApiCountWord?word=my name is pradeep my family name is chouhan

Response:
{
"pradeep": 1,
"name": 2,
"chouhan": 1,
"is": 2,
"my": 2,
"family": 1
}

Spanish to English
Request URL: 
localhost:8080/ApiCountWord?word=mi nombre es pradeep mi apellido es chouhan

Response:
{
"pradeep": 1,
"apellido": 1,
"chouhan": 1,
"mi": 2,
"nombre": 1,
"es": 2
}

Technologies used:

Java 8
RestApi
Junit test
Maven
Translator
Collections 