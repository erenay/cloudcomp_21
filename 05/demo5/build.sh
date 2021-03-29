echo 'Creating distribution directory'
rm -rf distribution
mkdir distribution
mkdir distribution/app
cp Dockerfile distribution/.
cp Dockerrun.aws.json distribution/.
mvn clean install
cp target/demo5-0.0.1-SNAPSHOT.jar distribution/app/.
cd distribution
jar cvf demo5.jar *