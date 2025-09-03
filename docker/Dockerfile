FROM openjdk:21-jdk
WORKDIR /app
COPY ./app.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

#FROM alpine:latest
#RUN apk add openjdk21
#WORKDIR /app
#COPY ./app.jar /app/app.jar
#CMD ["java", "-jar", "app.jar"]

#FROM python:3.9
#RUN mkdir /opt/app1
#RUN mkdir /opt/app
#WORKDIR /opt/app
#COPY ./myscr.py /opt/app
#CMD ["python", "myscr.py"]