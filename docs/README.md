<img src="https://capsule-render.vercel.app/api?type=Rounded&color=auto&height=200&section=header&text=구현 기능 목록&fontSize=65&fontColor=EAEAEA" />
<div align="left">
	<img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
</div>

# Input.Java
- - -

## 자동차 이름 입력 받기 (n대)
+ camp.nextstep.edu.missionutils.Console 라이브러리의 **readLine**로 자동차 이름을 입력 받는다.

## 자동차 이름 분리하기
+ 입력받은 자동차를 split()를 통해 (,)로 문자열을 구분한다.
+ 구분한 자동차를 Array 혹은 List에 담는다.

## HashMap에 입력 값 넣기
* String, Interger 형식으로 관리하기 위해 자동차 이름들을 HashMap 형태로 관리.

## 횟수 입력하기
+ camp.nextstep.edu.missionutils.Console 라이브러리의 **readLine**으로 이동 횟수를 입력 받는다.  

# Move.java
- - -

## 전진
+ 메소드가 호출될 때 마다 '-' 문자 이어붙이기
+ 이어 붙인 문자열 **RETURN** 하기

## 정지
+ 문자열 그대로 **RETURN** 하기

# Select.java
- - -

## 우승자 뽑기
+ 문자열 Length가 가장 큰 사용자를 뽑기

## 난수 돌리기
+ pickNumberInRange()를 통해 난수를 생성한다.
+ 생성된 난수에 따라 if문을 통해 전진, 정지 메소드를 호출한다. (정지 메소드를 구현 해야 할지?)

# Output.java
- - -
## 실행 결과 출력
+ 우승자를 뽑고 난 후 콘솔로 우승자를 출력한다.
