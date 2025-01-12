# Spring Security Zero to Master along with JWT,OAUTH2

Spring Security Architecture, important packages, interfaces, classes inside it which handles authentication and authorization requests in the web applications. It also covers most common security related topics like CORs, CSRF, JWT, OAUTH2, password management, method level security, user, roles & authorities management inside web applications.

## Topics covered

* Spring Security framework details and it features
* How to adapt security for a Java web application using Spring Security
* Password Management in Spring Security with PasswordEncoders
* Deep dive about encoding, encryption and hashing
* What is CSRF, CORS and how to address them
* What is Authentication and Authorization. How they are different from each other.
* Filters in Spring Security and how to write own custom filters
* Deep dive about JWT (JSON Web Tokens) and the role of them inside Authentication & Authorization
* Deep dive about OAUTH2 and various grant type flows inside OAUTH2.
* Deep dive about OpenID Connect & how it is related to OAUTH2
* Applying authorization rules using roles, authorities inside a web application using Spring Security
* Method level security in web/non-web applications
* Social Login integrations into web applications
* Set up of Authorization Server using KeyCloak, Spring Authorization Server 

# Important Links

- Spring website to generate projects - https://start.spring.io/
- Spring Website - https://spring.io/
- Spring Projects website - https://spring.io/projects
- Spring Boot properties - https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
- Online Bcrypt generator  - https://bcrypt-generator.com
- Docker website - https://www.docker.com/
- SQLECTRON website - https://sqlectron.github.io
- Warp terminal website - https://www.warp.dev/
- OAuth2 Website - https://oauth.net/2/
- OAuth 2.1 Blog - https://aaronparecki.com/2019/12/12/21/its-time-for-oauth-2-dot-1
- OAuth2 playground - https://www.oauth.com/playground/
- KeyCloak website - https://www.keycloak.org
- KeyCloak guides - https://www.keycloak.org/guides
- KeyCloak Well known APIs - http://localhost:8180/realms/eazybankdev/.well-known/openid-configuration
- Angular Keycloak library - https://www.npmjs.com/package/keycloak-angular
- Keycloak official documentation - https://www.keycloak.org/documentation
- Keycloak Admin REST APIs - https://www.keycloak.org/docs-api/latest/rest-api/index.html

## Commands used in the course

|     Command       |     Description          |
| ------------- | ------------- |
| "docker run -p 3306:3306 --name springsecurity -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=eazybank -d mysql" | To create a MySQL DB container |
| "docker run -p 8180:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:25.0.1 start-dev" | To create a Keycloak container |
