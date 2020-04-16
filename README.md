Github repositories checker
===========================
Github API v3 using application. Cheking all the repositories of users github or generate a custom exception.

GET:~/repositories/{userLogin}
------------------------------
Parametr:
* userLogin - github user login 

Return:
 * if user exists - users repository list JSON
 * else custom exception 


Technologies
------------
- Java 8+
- Spring Boot
- REST
