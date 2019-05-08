#!/usr/bin/env bash
mvn install
docker build -t prpatel/quarkus-jpa-serverless:1 .

# run local
java -jar target/quarkus-openwhisk-jpa-sample-1.0-SNAPSHOT-runner.jar

# run local
# docker run -i --rm -p 8080:8080 prpatel/quarkus-jpa-serverless:1

# push to docker hub
docker push prpatel/quarkus-jpa-serverless:1

# deploy/create to IBM Cloud Functions
#ibmcloud fn action create quarkus-jpa-serverless --docker prpatel/quarkus-jpa-serverless:1

# update
ibmcloud fn action update quarkus-jpa-serverless --docker prpatel/quarkus-jpa-serverless:1


