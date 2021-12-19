package nextstep.ladder.step3.domain;

import static org.assertj.core.api.Assertions.assertThat;

import nextstep.ladder.step3.domain.Height;
import nextstep.ladder.step3.domain.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LadderTest {

    @ParameterizedTest
    @CsvSource(value = "4:5", delimiter = ':')
    @DisplayName("생성 성공")
    void create(int width, int height) {
        assertThat(Ladder.of(width, new Height(height)).getLadder().size()).isEqualTo(height);
    }

}