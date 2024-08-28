### 스프링 부트(Spring Boot) 기초 강의
https://www.youtube.com/watch?v=7t6tQ4KV37g

---

### 생성 패턴  
생성 패턴은 객체의 생성과 관련된 패턴  
특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 최소화할 수 있도록 유연성 제공  

| 생성 패턴                   |의도| 
|:------------------------|---|  
 | 추상 팩토리 (Abstract Factory)|구체적인 클래스를 지정하지 않고 인터페이스를 통해 연관되는 객체들을 묶어줌|  
| 빌더 (Bulilder)           |객체의 생성과 표현을 분리하여 객체를 생성|  
| 팩토리 메소드 (Factory Method)|객체 생성을 서브클래스로 분리하여 위임 (캡술화)|  
| 프로토타입 (Prototype)       |원본 객체를 복사하여 객체를 생성 (클론)|  
| 싱글톤 (Singleton)         |한 클래스마다 인스턴스를 하나만 생성하여 어디서든 참조|  
---
### 행동(행위) 패턴  
|행동 패턴|의도|
|---|---|
|책임 연쇄 (Chain of Responsibility)|요청을 받는 객체를 연쇄적으로 묶어 요청을 처리하는 객체를 만날 때까지 객체 Chain을 따라 요청을 전달|
|커맨드 (Command)|요청을 객체의 형태로 캡술화하여 재사용하거나 취소|
|인터프리터 (Interpreter)|특정 언어의 문법 표현을 정의|
|박복자 (lterator)|컬렉션 구현 방법을 노출하지 않으면서 모든 항목에 접근할 수 있는 방법을 제공|
|중재자 (Mediator)|한 집합에 속해있는 객체들의 상호작용을 캡술화하여 새로운 객체로 정의|
|메멘토 (Memento)|객체가 특정 상태로 다시 되돌아 올 수 있도록 내부 상태를 실체화|
|옵저버 (Observer)|객체 상태가 변할 때관련 객체들이 그변화를 전달받아 자동으로 갱신|
|상태 (State)|객체의 상태에 따라 동일한 동작을 다르게 처리|
|전략 (Strategy)|동일 계열의 알고리즘군을 정의하고 캡술화하여 상호 교환이 가능하게 함|
|템플릿 메소드|상위 클래스는 알고리즘의 골격만을 작성하고 구체적인 처리는 서브 클래스로 위임|
|방문자 (Visitor)|객체의 원소에 대해 수행할 연산을 분리하여 별도의 클래스로 구성|
---
### 구조 패턴
구조 패턴은 프로그램 내 자료구조나 인터페이스 구조 등 프로그램 구조를 설계하는데 사용되는 패턴
클래스나 객체를 조합하여 더 큰 구조를 만들 수 있게 해줌  

|구조 패턴 | 의도                                                             |
|---|----------------------------------------------------------------|
|어댑터 (Adapter) | 클래스의 인터페이스를 어떤 클래스에서든 이용할 수 있도록 변환                             |
|브리지 (Bridge) | 구현부에서 추상층을 분리하여 각자 독립적으로 변형하고 확장할 수 있도록 함                      |
|컴포지트 (Composite) | 객체들의 관계를 트리 구조로 구성하여 표현하는 방식으로 복합 객체와 단일 객체를 구분없이 다름           |
|데코레이터 (Decorator) 파사드 (Facade) | 주어진 상황에 따라 객체에 다른 객체를 덧붙임 서브 시스템에 있는 인터페이스 집합에 대해 통합된 인터페이스 제공 |
|플라이웨이트 (Flyweight) |  크기가 작은 여러 개의 객체를 매번 생성하지 않고 최대한 공유하여 사용하도록 메모리 절약             |
|프록시 (Proxy)| 실제 기능을 수행하는 객체 대신 가상의 객체를 사용해 로직의 흐름을 제어                       |
---
### API (Application Programming Interface)
- 응용 프로그램에서 사용할 수 있도록 다른 응용 프로그램을 제어할 수 있게 만든 인터페이스를 뜻함  
*인터페이스: 어떤 장치간 정보를 교환하기 위한 수단이나 방법(마우스, 키보드 등)  
- API 를 사용하면 내부 구현 로직을 알지 못해도 정의되어 있는 기능을 쉽게 사용할 수 있음

### REST (Representational State Transfer)
- 자원의 이름으로 구분하여 해당 자원의 상태를 교환하는 것을 의미
- 서버와 클라이언트의 통신 방식 중 하나
- HTTP URI를 통해 자원을 명시하고 HTTP Method를 통해 자원을 교환하는 것  
*HTTP Method : Create, Read, Update, Delete

### REST 특징
- Server-Client 구조
- Stateless : client 정보가 서버에 저장X
- Cacheable
- 계층화(Layered System) : 로드밸런싱, 보안요소, 캐시 등
- Code on Demand(Optional) : 요청을 받으면 서버에서 client로 코드 또는 스크립트(로직)을 전달하여 client 기능 확장
- 인터페이스 일관성(Uniform Interface)

### REST 장점
- HTTP 표준 프로토콜을 사용하는 모든 플랫폼에서 호환 가능
- 서버와 클라이언트 역활을 명확히 분리
- 여러 서비스 설계에서 생길 수 있는 문제 최소화

### REST API
- REST 아키텍처의 조건을 준수하는 어플리케이션 프로그래밍 인터페이스를 뜻함  
*일반적으로 REST 아키텍처를 구현하는 웹 서비스를 RESTful 하다고 표현

### REST API 특징
- REST 기반으로 시스템을 분산하여 확장성과 재사용성을 높임
- HTTP 표준을 따르고 있어 여러 프로그래밍 언어로 구현 가능

### REST API 설계 규칙
- 웹 기반의 REST API를 설계할 경우 URI를 통해 자원 표현  
ex) https://xxx.studio/member/589  
Resource : memeber  
Resource id : 589

- 자원에 대한 조작은 HTTP Method(CRUD)를 통해 표현  
URI에 행위가 들어가면 안됨

- 메세지를 통한 리소스 조작  
HEADER를 통해 content-type을 지정하여 데이터 전달(HTML, XML, JSON, TEXT 등)

### REST API 설계 규칙
- URI는 소문자 사용
- Resource의 이름이나 URI가 길어질 경우 하이픈(-) 사용
- 언더바(_) 사용하지 않음
- 파일 확장자 표현하지 않음

### @RestController
- @Controller + @ResponseBody
- Controller 하위 메소드에 @ResponseBody를 붙이지 않아도 문자열과 JSON 등 전송 가능
- View를 거치지 않고 HTTP ResponseBody에 직접 return 값을 담아 보냄

### @RequestMapping
- 클래스와 메소드의 RequestMapping을 통해 URL을 매핑하여 경로를 설정하여 해당 메소드에서 처리
- value : url 설정
- method : GET, POST, DELETE, PUT, PATCH 등

### @PathVariable
- GET 형식의 요청에서 파라미터를 전달하기 위해 URL에 값을 담아 요청하는 방법

### @RequestParam
- GET 형식의 요청에서 쿼리 문자열을 전달하기 위해 사용되는 방법
- '?'를 기준으로 우측에 {키}={값} 형태로 전달, 복수 형태로 전달할 경우 & 사용

---

### Swagger
- 서버로 요청되는 API 리스트를 HTML 화면으로 문서화하여 테스트 할 수 있는 라이브러리
- 이 라이브러리는 서버가 가동되면서 @RestController를 읽어 API를 분석하여 HTML 문서를 작성함

- 2.x.x 버전: http://localhost:8080/swagger-ui.html
- 3.x.x 버전: http://localhost:8080/swagger-ui/index.html

---

### ResponseEntity
- Spring Framework에서 제공하는 클래스 중 HttpEntity라는 클래스를 상속받아 사용하는 클래스
- 사용자의 HttpRequest에 대한 응답 데이터를 포함
- 포함하는 클래서(HttpStatus, HttpHeaders, HttpBody)

---

### Lombok
- 반복되는 메소드를 Annotation을 사용하여 자동으로 작성해주는 라이브러리

>### @NoArgsConstructor
>- 파라미터가 없는 생성자를 생성
>
>### @AllArgsConstructor
>- 모든 필드값을 파라미터로 갖는 생성자를 생성
>
>### @RequiredArgsConstructor
>- 필드값 중 final이나 @NotNull인 값을 갖는 생성자를 생성
>
>### @ToString
>- toString 메소드를 자동으로 생성해주는 기능
>- exclude 속성으로 특정 필드를 toString에서 제외 시킬 수 있음
>
>### @EqualsAndHashCode
>- equals, hashCode 메소드를 자동 생성
   >  - equals : 두 객체의 내용이 같은지 동등성(equality)를 비교
>  - hashCode : 두 객체가 같은 객체인지 동일성(identity)를 비교
>  - callSuper 속성을 통해 메소드 생성시 부모 클래스의 필드까지 고려할지 여부 설정 가능
     >    - callSuper = true 이면 부모 클래스 필드 값들도 동일한지 체크함
>
> ### @Data
> - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 기능을 한번에 추가

---

### Entity(Domain)
- DB에 쓰일 컬럼과 여러 엔티티 간의 연관관계를 정의

### Repository
- Entity에 의해 생성된 DB에 접근하는 메소드를 사용하기 위한 인터페이스
- DB에 적용하고자 하는 CRUD를 정의하는 영역

### DAO(Data Access Object)
- DB에 접근하는 객체를 의미
- Service가 DB에 연결할 수 있게 해주는 역할
- DB를 사용하여 데이터를 조회하거나 조작하는 기능을 전담

### DTO(Data Transfer Object)
- DTO는 VO(Value Object)로 불리기도 하며, 계층간 데이터 교환을 위한 객체를 의미
- VO의 경우 Read Only의 개념을 가지고 있음

---

### ORM
- 어플리케이션의 객체와 관계형 DB의 데이터를 자동으로 매핑해주는 것을 의미
  * Java의 데이터 클래스와 관계형 DB의 테이블을 매핑
- 대표적으로 JPA, Hibernate 등이 있다.(Persistent API)

### ORM 장점
- 쿼리가 아닌 직관적인 코드로 데이터 조작 가능
  - 비즈니스 로직에 집중 가능 
- 재사용 및 유지보수 편리
  - ORM은 독립적으로 작성되어 있어 재사용 가능
  - 매핑정보를 명확하게 설계하기 때문에 따로 DB를 볼 필요 없음
- DBMS에 대한 종속성이 줄어듬
  - DBMS를 교체하는 작업을 비교적 적은 리스크로 수행 가능

### ORM 단점
- 복잡성이 커질 경우 ORM만으로 구현 어려움
- 잘못 구현할 경우 속도 저하 발생
- 대형 쿼리는 별도의 튜닝이 필요할 수 있음

### JPA (Java Persistance API) - ORM과 관련된 인터페이스 모음

### Hibernate - ORM Framework 중 하나
- JPA의 실제 구현체 중 하나이며, JPA 구현체 중 가장 많이 사용됨

### Spring Data JPA
- Spring Framework에서 JPA를 편리하게 사용할 수 있게 지원하는 라이브러리

---

### Logback
- Log4J를 기반으로 개발된 로깅(Logging) 라이브러리
- 출시순서 : log4j -> logback -> log4j2

![logback구조.PNG](document/logback/logback구조.PNG)

### Logback 특징
- 로그에 특정 레벨 설정 가능(Trace -> Debug -> Info -> Warn -> Error)
- 실운영과 테스트 상황에서 각각 다른 출력 레벨 설정 가능
- 출력 방식 설정 가능
- 설정 파일을 일정 시간마다 스캔하여 어플리케이션 중단 없이 설정 변경 가능
- 자체적으로 로그 압축 지원
- 로그 보관 기간 설정 가능

### Logback 설정
- 일반적으로 Classpath에 있는 logback 설정 파일 참조
  - Java Legacy, Spring은 logback.xml 참조
  - Spring Boot는 logback-spring.xml 참조

![logback설정파일형식.PNG](document/logback/logback설정파일형식.PNG)

![appender.PNG](document/logback/appender.PNG)

![encoder_root.PNG](document/logback/encoder_root.PNG)

### 로그 레벨
TRACE -> DEBUG -> INFO -> WARN -> ERROR
- ERROR : 시스템적으로 심각한 문제가 발생하여 작동이 불가한 경우
- WARN : 시스템 에러의 원인이 될 수 있는 경고 레벨, 처리 가능한 사항
- INFO : 상태변경과 같은 정보성 메시지
- DEBUG : 어플리케이션의 디버깅을 위한 메시지 레벨
- TRACE : DEBUG 레벨 보다 더 디테일한 메시지를 표현하기 위한 레벨
참고 : INFO로 설정 시, TRACE, DEBUG는 출력 안됨

### pattern
|패턴|설명|
|---|---|
|%Logger{length} | Logger Name|
|%-5level | 로그 레벨, -5는 출력의 고정폭 값|
|%msg| 로그 메세지 영역 (==%message)|
|${PID|-} | 프로세스 id|
|%d | 로그 기록 시간 |
|%p | 로깅 레벨|
|%F| 로깅이 발생한 프로그램 파일명 |
|%M | 로깅이 발생한 메소드의 이름 |
|%l| 로깅이 발생한 호출지의 정보|
|%L| 로깅이 발생한 호출지의 라인 수|
|%thread | 현재 Thread 명|
|%t | 로깅이 발생한 Thread 명 %c| 로깅이 발생한 카테고리 %C | 로깅이 발생한 클래스 명 %m| 로그 메시지|
|%n| 줄바꿈|
|%% | % 출력|
|%r|어플리케이션 실행 후 로깅이 발생한 시점까지의 시간|

예시) <pattern>[%d{yyyy-MM-dd HH:mm:ss.SSS}] [%-5level] [%thread] %logger{30} %msg%n</pattern>

---

### 유효성 검사 / 데이터 검증 (Validation)
- 서비스의 비즈니스 로직이 올바르게 동작하기 위해 사용되는 데이터에 대한 사전 검증하는 작업이 필요함
- 들어오는 데이테에 대해 의도한 형식의 값이 제대로 들어오는 지 체크하는 과정을 뜻함

| 어노테이션                     | 설명                   |
|---------------------------|----------------------|
| @Size                     | 문자의 길이 조건            |
| @NotNull                  | null                 |
| @NotEmpty                 | @NotNull + "" 값 불가   |
| @NotBlank                 | @NotEmpty + " " 값 불가 |
|                           |
| @Past                     | 과거 날짜                |
| @PastOrPresent            | @Past + 오늘 날짜        |
| @Future                   | 미래 날짜                |
| @FutureOrPresent          | @Future + 오늘 날짜      |
|                           |
| @Pattern                  | 정규식을 통한 조건           |
| @Max                      | 최대값 조건 설정            |
| @Min                      | 최소값 조건 설정            |
| @AssertTrue / AssertFalse | 참/거짓 조건 설정           |
| @Valid                    | 해당 객체의 유효성 검사        |


---

### Exception
- @ControllerAdvice를 통한 모든 Controller에서 발생할 수 있는 예외 처리
- @ExceptionHandler를 통한 특정 Controller의 예외 처리
- 
![exception_class.PNG](document/exception/exception_class.PNG)
### Exception class
모든 예외 클래스는 Throwable 클래스를 상속받고 있음

||Checked Exception|Unchecked Exception|
|-|---|---|
|처리여부|반드시 예외 처리 필요|명시적 처리 강제하지 않음|
|확인시점|컴파일 단계|실행 중 단계|
|예외발생시 트랜잭션|롤백하지 않음|롤백함|
|대표예외|IOException<br/>SQLExeption|NullPointerException<br/>Illegal ArgumentException<br/>IndexOutOfBoundException<br/>SystemException|

### @ControllerAdvice, @RestControllerAdvice
- Spring에서 제공
- @Controller, @RestController에서 발생하는 예외를 한 곳에서 관리하고 처리할 수 있게 하는 어노테이션
- 설정을 통해 범위 지정 가능(@RestControllerAdvice(basePackages="com.example.testproject") 와 같이 패키지 범위 설정 가능

### @ExceptionHandler
- 예외 처리 상황 발생 시 해당 Handler로 처리하겠다는 것을 명시하는 어노테이션
- 어떤 ExceptionClass를 처리할지 설정 가능(@ExceptionHandler(OOException.class))
- Exception.class는 최상위 클래스로 하위 세부 예외 처리 클래스로 설정한 핸들러가 존재하면 그 핸들러가 우선처리하게 되면 처리된지 못하는 예외 처리에 대해 ExceptionClass에서 핸들링함
- @ControllerAdvice로 설정된 클래스 내에서 메소드로 정의할 수 있지만 각 Controller 안에 설정도 가능
- 전역 설정(@ControllerAdvice)보다 지역 설정(Controller)으로 정의한 Handler가 우선순위를 가짐

![priority.PNG](document/exception/priority.PNG)

![controller_exception.PNG](document/exception/controller_exception.PNG)

---

### Rest Template
- 스프링에서 제공하는 HTTP 통신 기능을 쉽게 사용할 수 있게 설계되어 있는 템플릿
- HTTP 서버와의 통신을 단순화하고 RESTful 원칙을 지킴
- 동기 발식으로 처리되며, 비동기 방식으로 AsyncRestTemplate이 있음
- RestTemplate 클래스는 REST 서비스를 호출하도록 설계되어 HTTP 프로토콜의 메소드에 맞게 여러 메소드 제공

| Method         | HTTP   | 설명                                       |
|----------------|--------|------------------------------------------|
| getForObject   | GET    | GET 형식으로 요청하여 객체로 결과를 반환 받음              |
| getForEntity   | GET    | GET 형식으로 요청하여 ResponseEntity로 결과를 반환 받음  |
| postForObject  | POST   | POST 형식으로 요청하여 객체로 결과를 반환 받음             |
| postForEntity  | POST   | POST 형식으로 요청하여 ResponseEntity로 결과를 반환 받음 |
| delete         | DELETE | DELETE 형식으로 요청                           |
| put            | PUT    | PUT 형식으로 요청                              |
| patchForObject | PATCH  | PATCH 형식으로 요청                            |
| exchange       | any    | HTTP 헤더를 생성하여 추가할 수 있고 어떤 형식에서도 사용할 수 있음 |

### 실행 방법
serverBox / testproject 를 각각 실행하여 postman 또는 swagger로 테스트

---

### TDD
- 테스트 주도 개발(테스트를 먼저 설계 및 구축 후 테스트를 통과할 수 있는 코드를 짜는 것)

### 테스트 코드 작성 목적
- 코드 안전성을 높임
- 기능 추가, 변경 과정에서 발생할 수 있는 side-effect 감소
- 해당 코드가 작성된 목적을 명확하게 표현 가능

### JUnit
- Java 진영의 대표적은 Test Framework
- 단위 테스트(Unit Test)를 위한 도구를 제공
  - 단위 테스트란?
    - 코드의 특정 모듈이 의도된 대로 동작하는지 테스트 하는 절차를 의미
    - 모든 함수와 메소드에 대한 각각의 테스트 케이스를 작성하는 것
- Annotation(어노테이션)을 기반으로 테스트 지원
- 단정문(Assert)으로 테스트 케이스의 기대값에 대해 수행 결과를 확인할 수 있음
- JUnit5는 크게 Jupiter, Platform, Vintage 모듈로 구성

### JUnit Jupiter
- TestEngin API 구현체로 JUnit5를 구현하고 있음
- 테스트의 실제 구현체는 별도 모듈 역학을 수행하는데, 그 모듈 중 하나가 Jupiter-Engine
- 이 모듈은 Jupiter-API를 사용하여 작성한 테스트 코드를 발견하고 실행하는 역할을 수행
- 개발자가 테스트 코드를 작성할 때 사용됨

### JUnit Platform
- Test를 실행하기 위한 뼈대
- Test를 발견하고 테스트 계획을 생성하는 TestEngine 인터페이스를 가지고 있음
- TestEngine을 통해 Test를 발견하고, 수행 및 결과를 보고하고, 각종 IDE 연동을 보조하는 역할을 수행(콘솔 출력 등)

### JUnit Vintage
- TestEngine API 구현체로 JUnit 3,4를 구현하고 있음
- 기존 JUnit 3,4 버전으로 작성된 테스트 코드를 실행할 때 사용됨
- Vintage-Engine 모듈을 포함하고 있음

![Jupiter_Platform_Vintage.PNG](document/JUnit/Jupiter_Platform_Vintage.PNG)

### JUnit LifeCycel Annotation
| Annotation | Description                              |
|------------|------------------------------------------|
| @Test      | 테스트용 메소드를 표현하는 어노테이션|
| @BeforEach | 각 테스트 메소드가 시작되기 전에 실행되어야 하는 메소드 표현|
| @AfterEach | 각 테스트 메소드가 시작 된 수 실행되어양 하는 메소드를 표현|
| @BeforAll  | 테스트 시작 전에 실행되어야 하는 메소드를 표현(static 처리 필요)|
| @AfterAll  | 테스트 종료 후에 실행되어야 하는 메소드를 표현(static 처리 필요)|

### JUnit Main Annotation
>### @SpringBootTest
> - 통합 테스트 용도록 사용됨
> - @SpringBootApplication을 찾아가 하위의 모든 Bean을 스캔하여 로드
> - 그 후 Test용 Application Context를 만들어 Bean을 추가하고, MockBean을 찾아 교체
> 
> @ExtendWith
> - JUnit4에서 @RunWith로 사용되던 어노테이션이 ExtendWith로 변경
> - @ExtendWith는 메인으로 실행될 Class를 지정할 수 있음
> - @SpringBootTest는 기본적으로 @ExtendWith가 추가되어 있음
> 
> @WebMvcTest(Class명.class)
> -()에 작성된 클래스만 실제로 로드하여 테스트를 진행
> 매개변수를 지정해주지 않으면 @Controller, @RestController, @RestControllerAdvice 등 컨트롤러와 연관된 Bean이 모두 로드됨
> 스프링의 모든 Bean을 로드하는 @SpringBootTest 대신 컨트롤러 관련 코드만 테스트할 결우 사용
> 
> @Autowired about Mockbean
> - Controller의 API를 테스트하는 용도인 MockMvc 객체를 주입 받음
> - perform() 메소드를 활용하여 컨트롤러의 동작을 확인할 수 잇음
> - .andExpect(), aneDo(), andReturn() 등의 메소드를 같이 활용
> 
> @MockBean
> - 테스트할 클래스에서 주입 받고 있는 객체에 대해 가짜 객체를 생성해주는 어노테이션
> - 해당 객체는 실제 행위를 하지 않음
> - given()메소드를 활용하여 가짜 객체의 동작에 대해 정의하여 사용할 수 있음
> 
> @AutoConfigureMockMvc
> - spring.test.mockmvc의 설정을 로드하면서 MockMvc의 의존성을 자동으로 주입
> - MockMvc 클래스는 REST API 테스트를 할 수 있는 클래스
> 
> @Import
> - 필요한 Class들을 Configuration으로 만들어 사용할 수 있음
> - Configuration Component 클래스도 의존성 설정할 수 있음
> - Import된 클래스는 주입으로 사용 가능

### 통합 테스트
- 여러 기능을 조합하여 전체 비즈니스 로직이 제대로 동작하는지 확인하는 것을 의미
- @SpringBootTest 사용하여 진행
  - @SpringBootTest는 @SpringBootApplication을 찾아가서 모든 Bean을 로드하게 됨
  - 이 방법을 대규모 프로젝트에서 사용할 경우, 테스트를 실행할 때마다 모든 빈을 스캔하고 로드하는 작업이 반복되어 매번 무거운 작업을 수행해야 함

### 단위 테스트
- 프로젝트에 필요한 모든 기능에 대한 테스트를 각각 진행하는 것을 의미
- 일반적으로 스프링 부트에서는 'org.springframework.boot:spring-boot-starter-test' 디펜던시만으로 의존성을 모두 가질 수 있음

- F.I.R.S.T 원칙
  - Fast : 테스트 코드의 실행은 빠르게 진행되어야 함
  - Independent : 독립적인 테스트가 가능해야 함
  - Repeatable : 테스트는 매번 같은 결과를 만들어야 함
  - Self-Validation : 테스트는 그 자체로 실행하여 결과를 확인할 수 있어야 함
  - Timely : 단위 테스트는 비즈니스 코드가 완성되기 전에 구성하고 테스트가 가능해야 함  
    (코드가 완성되기 전부터 테스트가 따라와야 한다는 TDD의 원칙을 담고 있음)

---

### 코드 커버리지
- 소프트웨어의 테스트 수준이 충분한지 표현할 수 있는 지표 중 하나
- 테스트를 진행했을 때 해당 코드가 실행되었는지를 표현하는 방법

### Jacoco
- Java 코드의 커버리지를 체크하는 라이브러리
- 작성된 코드의 테스트 커버리지(Test Coverage)를 측정하는 도구
- Runtime으로 Test Case를 실행하여 Coverage를 체크하는 방식으로 사용됨
- 테스트 코드를 통해 테스트를 실행하고 그 결과를 html, xml, csv등의 형식으로 Report를 제공

### 블랙 박스 테스트
- 소프트웨어의 내부 구조나 작동 원리를 모르는 상태에서 동작을 검사하는 방식
- 다양한 값을 입력하여 올바른 출력이 나오는지 테스트
- 사용자 관점의 테스트 방법

### 화이트 박스 테스트
- 소프트웨어의 내부 구조와 동작을 검사하는 테스트 방식
- 소프트웨어 내부 소스 코드를 테스트하는 방법
- 개발자 관점의 테스트 방법

### Jacoco pom.xml 파일 설정
- Execution 내부에 사용되는 값
- prepare-agent
  - 테스트 중인 어플리케이션에서 인수를 전달하는 Jacoco Runtime Agent에 대한 property를 준비
- merge : 여러 실행 데이터 파일들을 하나로 통합하는 명령어
- report : 하나의 프로젝트 테스트에 대한 Code Coverage 리포트를 생성하는 명령어
- check : code coverage metric이 충돌하는 지 확인하는 명령어

![Jacoco_pom_xml.PNG](document/Jacoco/Jacoco_pom_xml.PNG)

### Jacoco Rule
>- Element type - 코드 커버리지 체크 기준
>  - BUNDLE (default) : 패키지 번들
>  - PACKAGE : 패키지
>  - CLASS : 클래스
>  - SOURCEFILE : 소스 파일
>  - METHOD : 메소드
>
> - Counter - 코드 커버리지를 측정할 때 사용하는 지표
>   - LINE : 빈 줄을 제외한 실제 코드의 라인 수
>   - BRANCH : 조건문 등의 분기 수
>   - CLASS : 클래스 수
>   - METHOD : 메소드 수
>   - INSTRUCTION (default) : Java 바이트 코드 명령 수 
>   - COMPLEXITY : 복잡도
> 
> - Value - 커버리지 정도를 나타내는 지표
>   - TOTALCOUNT : 전체 개수
>   - MISSEDCOUNT : 커버되지 않은 개수
>   - COVEREDCOUNT : 커버된 개수
>   - MISSEDRATIO : 커버되지 않은 비율(0~1)
>   - COVEREDRATIO (default) : 커버된 비율(0~1)

### Jacoco 설정 예시
- 특정 클래스 테스트 대상에서 제외하기 위해 다음과 같이 설정

![Jacoco_setting_example.PNG](document/Jacoco/Jacoco_setting_example.PNG)

다음과 같이 측정 기준을 설정할 수 있다.
<rule>을 기준으로 총 2개의 측정 기준이 제시된 예제

상단 <rule> 의미 : 패키지 번들 단위로 바이트 코드 명령 수에 40% 미만일 경우 에러 발생
하단 <rule> 의미 : 메소드 라인 수가 30을 초과할 경우 에러 발생

### Jacoco 와 Maven LifeCycle
- Maven의 라이프 사이클
  - complie -> test -> package -> intall -> deploy
- Jacoco 플로그인은 Maven 라이프 사이크에 의해 동작하며, test phase 이후에 측정 가능
  - package phase 이후로 동작 가능