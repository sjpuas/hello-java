FROM java:8
COPY src/App.java App.java
RUN javac App.java
ENTRYPOINT java App
