FROM adoptopenjdk/openjdk11
RUN mkdir /app
WORKDIR /app
COPY ./ /app
ENTRYPOINT ["sh", "./gradlew", "bootRun"]
