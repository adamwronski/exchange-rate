package pl.com.bottega.exchangerate.infrastructure;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import pl.com.bottega.exchangerate.domain.exception.InvalidCommandException;
import pl.com.bottega.exchangerate.domain.exception.Validatable;

@Component
@Aspect
public class ValidationAspect {

	@Before( "execution(* pl.com.bottega.exchangerate.api..*.*(..)) && args(validatable,..)" )
	public void validate(Validatable validatable) {
		Validatable.ValidationErrors errors = new Validatable.ValidationErrors();
		validatable.validate(errors);
		if (!errors.isValid())
			throw new InvalidCommandException(errors);
	}

}
