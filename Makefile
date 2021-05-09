zipkin-app1:
	mvn -f ./ZipkinApp1/pom.xml

zipkin-app2:
	mvn -f ./ZipkinApp2/pom.xml

zipkin-app3:
	mvn -f ./ZipkinApp3/pom.xml

zipkin-apps:
	mvn -f ./ZipkinApp1/pom.xml & \
	mvn -f ./ZipkinApp2/pom.xml & \
	mvn -f ./ZipkinApp3/pom.xml

zipkin-server:
	docker run -d -p 9411:9411 openzipkin/zipkin

stop:
	fuser -k 8081/tcp &
	fuser -k 8082/tcp &
	fuser -k 8083/tcp
