FROM bellsoft/liberica-runtime-container:jre-17-slim-musl
COPY build/libs/*.jar app/app.jar
ENTRYPOINT ["java", "-jar","/app/app.jar"]