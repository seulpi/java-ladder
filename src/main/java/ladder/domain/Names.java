package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Names extends LadderStrings<Name> {

    public Names(String names) {
        super(toList(names));
    }

    private static List<Name> toList(String names) {
        if (Objects.isNull(names)) {
            throw new IllegalArgumentException(NULL_MESSAGE);
        }

        return Arrays.stream(names.split(DELIMITER))
                .map(Name::new)
                .collect(Collectors.toList());
    }

}
