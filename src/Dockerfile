FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN javac -sourcepath ./src -d ./out ./src/main/Main.java
RUN java -classpath ./src/main/Main.java
RUN javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages test main
