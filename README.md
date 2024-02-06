# Real Time Food Delivery Service
(With Kafka)


### Spring Starters

 - User Application
```
curl https://start.spring.io/starter.zip -d groupId=com.hemram -d artifactId=food-Deliv_user -d name=foodDelivUser -d type=maven-project -d dependencies=web,kafka -o foodDelivUser.zip
```
 - Driver Application
```
curl https://start.spring.io/starter.zip -d groupId=com.hemram -d artifactId=food-Deliv_driver -d name=foodDelivDriver -d type=maven-project -d dependencies=web,kafka -o foodDelivDriver.zip
```

# How to use

### Install and configure Kafka
```
curl https://apache.org/dyn/closer.cgi?path=kafka/3.6.1/kafka_2.13-3.6.1.tgz -o kafka_2.13-3.6.1.tgz
tar -xvzf kafka_2.13-3.6.1.tgz
sudo mv kafka_2.13-3.6.1 kafka
```
### Start Zookeeper (at unzipped location)
```
sudo bin/zookeeper-server-start.sh config/zookeeper.properties
```
### Start Kafka 
```
sudo bin/kafka-server-start.sh config/server.properties
```

### Run Both Driver and User Applications 
```mvn spring-boot:run```

### Hit API with a PUT request at http://localhost:8082/location

