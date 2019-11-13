FROM openjdk:8
MAINTAINER yuderen yuderen6312@163.com

COPY gateway-1.0-SNAPSHOT.jar /home/gateway.jar

WORKDIR /home

EXPOSE 9800

CMD ["java", "-jar", "gateway.jar"]