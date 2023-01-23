FROM gradle:7.6.0-jdk17-alpine

WORKDIR /app

COPY ./ .

CMD ["gradle", "bootRun"]
