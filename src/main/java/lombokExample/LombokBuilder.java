package lombokExample;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class LombokBuilder {
	private String name;
	private String lastName;
	private int age;
	
}
