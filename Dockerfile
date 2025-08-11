#FROM eclipse-temurin:21-jdk
#
#WORKDIR /add
#
#COPY build/libs/*.jar app.jar
#
#EXPOSE 8080
#
#CMD ["java", "-jar", "app.jar"]



FROM eclipse-temurin:21-jdk AS build

WORKDIR /app
COPY . .
RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
