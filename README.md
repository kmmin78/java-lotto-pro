# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계-로또(자동) 요구사항
* [x] 로또 구입 금액을 입력하는 기능 
  * [x] 로또 구입 금액 과 로또 1장의 가격을 나누어 로또 갯수를 구하는 기능
  * [x] 갯수만큼 로또를 생성하는 기능
  * [x] 구입 금액에 해당하는 로또를 발급해야 한다.(로또 1장의 가격은 1000원이다.)
* [x] 로또를 자동 생성하는 기능
  * [x] 1 ~ 45 개의 숫자중 6개를 랜덤하게 받아 온다.
  * [x] 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
  * [x] 로또 클래스 구현
* [x] 당첨 번호를 입력하는 기능
  * [x] 당첨 번호는 1 ~ 45 까지의 숫자 6개로 되어 있다.
  * [x] 당첨 번호를 입력 할때는 ", "로 구분 지어서 입력해야 한다.
* [x] 당첨 통계를 출력하는 기능
  * [x] 몇개가 일치했는지 카운트 하는 기능
  * [x] 각 로또의 당첨 값들을 정리하여 출력하는 기능
  * [x] 수익률이 얼마나 나오는지 출력하는 기능
  
구현 예시
~~~
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
~~~