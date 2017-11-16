FROM openjdk

ENV LC_ALL="no_NB.UTF-8"
ENV LANG="no_NB.UTF-8"
ENV TZ="Europe/Oslo"
ENV DEFAULT_JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"

WORKDIR /app

EXPOSE 8080

ARG JAR_FILE
ADD target/${JAR_FILE}  app.jar
ENTRYPOINT exec java -jar /app.jar