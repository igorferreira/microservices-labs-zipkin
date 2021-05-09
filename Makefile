zipkin-app1:
	mvn -f ./zipkinApp1/pom.xml

zipkin-app2:
	mvn -f ./zipkinApp2/pom.xml

zipkin-app3:
	mvn -f ./zipkinApp3/pom.xml

zipkin-apps:
	mvn -f ./zipkinApp1/pom.xml & \
	mvn -f ./zipkinApp2/pom.xml & \
	mvn -f ./zipkinApp3/pom.xml

zipkin-server:
	docker run -d -p 9411:9411 openzipkin/zipkin
