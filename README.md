# Sample REST API with Spring Boot, Hibernate and MySql.
Transaction_API is a SpringBoot REST-API, implemented using Hibernate and MySql Database.
This API can be consumed in any Payment app for POC and product flow tests.

## 1.Install and Setup Mysql database
Set mysql username and password.
Create database hibernatedb.

## 2.Create and Setup application.properties file at src/main/resources/application.properties
server.port=8083
spring.datasource.url = jdbc:mysql://localhost:3306/hibernatedb?useSSL=false
spring.datasource.username = your username
spring.datasource.password = your password
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update

## 3.Run File Application.java(src/main/java/com/app/Application.java)
The app will start running at <http://localhost:8083>.

## Explore Rest APIs
Sample templates & URL:

### GET(Find All Payments)-
http://localhost:8083/paymentsapi/initiate-payment/payments

### GET(Find Payment using Transaction Id)-
http://localhost:8083/paymentsapi/initiate-payment/payments/transactionId

### POST(Create Single Payment)
http://localhost:8083/paymentsapi/initiate-payment/paymentrequest

#### JSON POST Template -
{

	"transactionId": 101,
	"Amount": 250,
	"date": "29-03-2021",
	"time": "01:51 PM",
	"remarks": "First payment",
	"debitorDetails": {
		"customerId": 1,
		"name": "abc",
		"branchId": "PQR001",
		"debitorAccountNum": 100123
	},
	"creditorDetails": {
		"customerId": 2,
		"name": "xyz",
		"branchId": "ABC001",
		"creditorAccountNum": 100789
	}
}
