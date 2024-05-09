FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/ru/gb/dj/Main.java

CMD javadoc -d mydocumentation -sourcepath src -cp .\ourclasses\ -subpackages ru -encoding utf-8