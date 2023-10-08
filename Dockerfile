FROM docker.transfesa.com/api-libx11:0.0.0

RUN apk --no-cache add curl
ADD target/*jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar

EXPOSE 8080
