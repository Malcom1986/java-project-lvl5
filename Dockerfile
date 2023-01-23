FROM gradle:7.2.0-jdk16

COPY . .

CMD ["gradle", "bootRun"]
