FROM docker.artifactory.dhl.com/eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY ./target/*.jar ./app.jar
#PlaceHolderForCopyingCacheReloadJarCommandToBeReplacedByJenkins

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar ./app.jar ${JAVA_ARGS}"]