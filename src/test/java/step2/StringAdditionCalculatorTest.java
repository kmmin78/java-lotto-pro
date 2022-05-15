package step2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

@DisplayName("StringAdditionCalculator 클래스")
public class StringAdditionCalculatorTest {
    
    @DisplayName("콤마 구분자 합계 테스트")
    @Test
    void addAllDelimiterStringWithComma() {
        final int result = StringAdditionCalculator.addAllDelimiterString("2,4,5");
        assertThat(result).isEqualTo(11);
    }

    @DisplayName("콜론 구분자 합계 테스트")
    @Test
    void addAllDelimiterStringWithColon() {
        final int result = StringAdditionCalculator.addAllDelimiterString("1:2:3");
        assertThat(result).isEqualTo(6);
    }

    @DisplayName("콤마 및 콜론 구분자 합계 테스트")
    @Test
    void addAllDelimiterStringWithCommaAndColon() {
        final int result = StringAdditionCalculator.addAllDelimiterString("3:6,7");
        assertThat(result).isEqualTo(16);
    }

    @DisplayName("커스텀 구분자 합계 테스트")
    @Test
    void addAllDelimiterStringWithCustomDelimiter() {
        final int result = StringAdditionCalculator.addAllDelimiterString("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @DisplayName("마이너스 값 입력 시 예외 발생 테스트")
    @Test
    void addAllDelimiterStringThrowRuntimeExceptionWhenNumberIsMinus() {
        assertThatThrownBy(() -> StringAdditionCalculator.addAllDelimiterString("-1,2,3"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("숫자가 아닌 값 입력 시 예외 발생 테스트")
    @Test
    void addAllDelimiterStringThrowRuntimeExceptionWhenNotANumber() {
        assertThatThrownBy(() -> StringAdditionCalculator.addAllDelimiterString("a,2,3"))
                .isInstanceOf(NumberFormatException.class);
    }

    @DisplayName("빈 스트링 혹은 null 입력 시 0 반환 테스트")
    @ParameterizedTest
    @NullAndEmptySource
    void addAllDelimiterStringWithBlank(final String input) {
        final int nullResult = StringAdditionCalculator.addAllDelimiterString(input);
        assertThat(nullResult).isEqualTo(0);
    }

    @DisplayName("숫자 한개 입력 테스트")
    @Test
    void addAllDelimiterStringWithOneNumber() {
        final int result = StringAdditionCalculator.addAllDelimiterString("3");
        assertThat(result).isEqualTo(3);
    }

}
