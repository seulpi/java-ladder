package nextstep.ladder.domain;

import java.util.Objects;

public class Name {
	private static final int MAX_NAME_LENGTH = 5;
	private final String name;

	public Name(String name) {
		validationEmpty(name);
		validationLength(name);
		this.name = name;
	}

	private void validationEmpty(String name) {
		if (name == null | name.isBlank()){
			throw new IllegalArgumentException("이름은 공백일 수 없습니다");
		}
	}

	private void validationLength(String name) {
		if (name.length() > MAX_NAME_LENGTH){
			throw new IllegalArgumentException("이름은 5자리를 초과할 수 없습니다");
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Name name1 = (Name)o;
		return Objects.equals(name, name1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
