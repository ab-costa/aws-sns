export CLASSPATH=target/sns-1.0-SNAPSHOT.jar
export className=SnsApplication
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.abcosta.aws.sns.$className"