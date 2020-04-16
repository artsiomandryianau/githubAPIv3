Github repositories checker
===========================
Github API v3 using application. Cheking all the repositories of users github or generate a custom exception.

GET:~/repositories/{userLogin}
------------------------------
Parametr:
* userLogin - github user login 

Return:
 * if (user exists) return users repository list JSON
 * else return custom exception 


Technologies
------------
- Java 8+
- Spring Boot
- REST
