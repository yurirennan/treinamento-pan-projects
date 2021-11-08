FROM openjdk:11

ARG PROFILE=${PROFILE}
ARG ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/api_string

COPY /target/spring-docker*.jar spring-docker.jar
#COPY /target api_spring_docker.jar

SHELL [ "/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8000

CMD java ${ADDITIONAL_OPTS} -jar spring-docker.jar --spring.profiles.active=${PROFILE}
