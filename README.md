# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 2단계 - 문자열 덧셈 계산기
- 쉼표(,) 또는 콜론(:)으로 문자열 구분
- 문자열을 숫자로 변환
- 변환된 숫자들을 더하기
- 문자열에서 일치하는 커스텀 구분자 추출
- 커스텀 구분자가 존재할 경우 주어진 문자열에서 패턴 제거  
- 숫자이외 값 또는 음수일 경우 `RuntimeException` 반환
- 빈 문자 또는 `null`일 경우 합은 0 반환


## 3단계 - 로또(자동)
- 사용자가 구입 금액 입력
- 사용자가 당첨번호를 입력
- 입력한 금액으로 로또를 구매
- 1 ~ 45까지 공 숫자 생성
- 6개 랜덤한 공 생성  
- 중복된 숫자 체크
- 몇 등 당첨되었는지 확인
- 당첨된 갯수 세기
- 수익률 계산

## 4단계 - 로또 (2등)
- 보너스 공 번호 입력
- 보너스 공 일치 여부 확인
- 2등 당첨 여부 판단
- 2등 출력
