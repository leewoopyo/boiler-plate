# woopii's project

- 프로젝트 정보
   - java
     - java 17
   - framawork
     - spring boot3 
   - build
     - gradle                                        

- 패키지
    - core, domain으로 구분
      - core
        - entity, config 등 공통 영역을 설정
      - domain
        - API, 서비스와 관련된 로직이 있는 영역

- submodule
  - 대상
    - Core

- profile 별 설정
  - local
    - DB : H2DB
  - development
    - DB : Mariadb
  - production
    - DB : 미정