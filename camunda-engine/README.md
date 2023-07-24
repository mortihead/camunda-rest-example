# camunda-example

The default admin user can be accessed with the following credentials: Username: demo. Password: demo.

Download modeller:\
https://camunda.com/download/modeler/

Open process definion:\
cities.bpmn 



See also:\
https://tproger.ru/articles/modelirovanie-biznes-processov-praktika-ispolzovanija-camunda-bpm-v-java-razrabotke/ \
https://habr.com/ru/companies/simbirsoft/articles/657697/ \
https://www.baeldung.com/spring-boot-embedded-camunda \


Start process:\
curl -H "Content-Type: application/json" -X POST -d '{"variables": {"IndexCity": {"value":450077,"type":"integer"} }}' http://localhost:8080/engine-rest/process-definition/key/cities_process/start