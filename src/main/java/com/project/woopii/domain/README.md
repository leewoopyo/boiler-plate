
# domain

domain 패키지는 개별 프로젝트의 비지니스 로직을 담아놓은 패지키입니다.

sample 도메인은 다른 도메인 작성 시 참고 및 기준이 되기 위해서 작성합니다.


- 구성
  1. Controller : APi end-point 정의
  2. Service : 비지니스 로직 정의
  3. DomainService : 도메인 접근에만 사용되는 서비스
  4. Repository : 데이터 CURD 인터페이스 (JPA)