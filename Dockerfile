FROM amazoncorretto:11-alpine-jdk

MAINTAINER GreciaR

COPY target/PortfolioGR-0.0.1-SNAPSHOT.jar PortfolioGR-app.jar

ENTRYPOINT ["java", "-jar", "/PortfolioGR-app.jar"]