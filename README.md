# CRM with Spring Boot

*In progress*

### Overview
This is an open-source Customer Relationship Management (CRM) system. The project is **still under development**. Contributions are welcome. If you want to contribute, you can open a [pull request](/README.md/#Contributing).

### Technologies

<code><img alt="Java" src="src/main/resources/images/java.png" title="Java" width="50"/></code>
<code><img width="50" src="src/main/resources/images/spring.png" alt="Spring Boot" title="Spring Boot"/></code>
<code><img width="50" src="src/main/resources/images/maven.png" alt="Maven" title="Maven"/></code>
<code><img width="50" src="src/main/resources/images/postgresql.png" alt="PostgreSQL" title="PostgreSQL"/></code>
<code><img width="50" src="src/main/resources/images/rest.png" alt="REST" title="REST"/></code>
<code><img width="50" src="src/main/resources/images/hibernate.png" alt="Hibernate" title="Hibernate"/></code>
<code><img width="50" src="src/main/resources/images/mapstruct.png" alt="MapStruct" title="MapStruct"/></code>
<code><img width="50" src="src/main/resources/images/jwt.png" alt="JWT" title="JWT"/></code>
<code><img width="50" src="src/main/resources/images/swagger.png" alt="Swagger" title="Swagger"/></code>
<code><img width="50" src="src/main/resources/images/intellij.png" alt="Intellij" title="Intellij"/></code>
<code><img width="50" src="src/main/resources/images/git.png" alt="Git" title="Git"/></code>
<code><img width="50" src="src/main/resources/images/github.png" alt="Github" title="Github"/></code>

### Features

- Recording and managing customer information
- Create and manage offers
- Recording and tracking expenses
- Product and category management
- Interview and meeting records
- Email and phone-based customer search
- Full CRUD operations for customers

### Directory Schema for Best Practices

````
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── yourapp/
│   │               ├── config/              # Konfigürasyon dosyaları
│   │               │   ├── SwaggerConfig.java
│   │               │   ├── SecurityConfig.java
│   │               │   └── AppConfig.java
│   │               ├── controller/          # REST API denetleyicileri
│   │               │   ├── UserController.java
│   │               │   └── ListingController.java
│   │               ├── dto/                 # Veri transfer objeleri
│   │               │   ├── request/
│   │               │   │   ├── UserRequest.java
│   │               │   │   └── ListingRequest.java
│   │               │   ├── response/
│   │               │   │   ├── UserResponse.java
│   │               │   │   └── ListingResponse.java
│   │               │   └── Result.java
│   │               ├── entity/              # JPA entity sınıfları
│   │               │   ├── BaseEntity.java
│   │               │   ├── User.java
│   │               │   └── Listing.java
│   │               ├── exception/           # Hata işleme
│   │               │   ├── GlobalExceptionHandler.java
│   │               │   ├── CustomException.java
│   │               │   └── NotFoundException.java
│   │               ├── mapper/              # MapStruct Mapper sınıfları
│   │               │   ├── UserMapper.java
│   │               │   └── ListingMapper.java
│   │               ├── repository/          # JPA repository sınıfları
│   │               │   ├── UserRepository.java
│   │               │   └── ListingRepository.java
│   │               ├── service/             # Servis arayüzleri
│   │               │   ├── UserService.java
│   │               │   └── ListingService.java
│   │               │   └── impl/            # Servis implementasyonları
│   │               │       ├── UserServiceImpl.java
│   │               │       └── ListingServiceImpl.java
│   │               ├── util/                # Yardımcı sınıflar ve araçlar
│   │               │   └── UtilityClass.java
│   │               ├── security/            # Güvenlik yapılandırmaları
│   │               │   ├── AuditConfiguration.java
│   │               │   ├── AuditorAwareImpl.java
│   │               │   ├── JwtAuthenticationFilter.java
│   │               │   ├── JwtTokenProvider.java
│   │               │   ├── CustomUserDetailsService.java
│   │               │   └── SecurityConstants.java
│   │               └── YourAppApplication.java # Spring Boot ana uygulama sınıfı
│   └── resources/
│       ├── application.properties           # Uygulama yapılandırma dosyası
│       └── application.yml                  # YML yapılandırma dosyası (eğer kullanılıyorsa)
└── test/
├── java/
│   └── com/
│       └── example/
│           └── yourapp/
│               ├── controller/          # Test sınıfları (kontrollerler)
│               ├── service/             # Test sınıfları (servisler)
│               └── YourAppApplicationTests.java # Test ana sınıfı
└── resources/
└── application.properties           # Test yapılandırma dosyası
````

### Entity Diagram Sample (not finished will be updated)

![CRM_Entity_Diagram.png](src/main/resources/images/CRM_Entity_Diagram.png)

### Requirements

- Java 21+
- PostgreSQL 16
- IntelliJ IDEA (or other IDE)

### Installation

1. Clone the repository:
   ```bash
    git clone https://github.com/nidabaser/CRM_Spring_Boot.git
    ```
    ```bash
    cd crm-spring-boot
    ```
2. Configure the database.
   - Create a PostgreSQL database named `crm`. 
   - Update the `environment variables`:
   ```
   spring.datasource.url=${YOUR_DB_URL}
   spring.datasource.username=${YOUR_DB_USERNAME}
   spring.datasource.password=${YOUR_DB_PASSWORD}
   ```
3. Build the project:
    ```bash
    mvn clean install
    ```
4. Run the project:
    ```bash
    mvn spring-boot:run
    ```
5. Usage:
   Once the application is running, you can access the API documentation at:
    ```bash
    http://localhost:8080/swagger-ui.html
    ```

### Contributing
- Fork the repository.
- Create your feature branch: `git checkout -b feature/your-feature`
- Commit your changes: `git commit -m 'Add some feature'`
- Push to the branch: `git push origin feature/your-feature`
- Open a pull request.

### License
This project is licensed under the [MIT](https://choosealicense.com/licenses/mit/) License.