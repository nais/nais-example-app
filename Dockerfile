FROM busybox

ARG JAR_FILE
COPY target/${JAR_FILE} /app.jar

FROM navikt/java:8
COPY --from=0 /app.jar .
