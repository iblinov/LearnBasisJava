package by.bsu2.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Retention(RetentionPolicy.RUNTIME)
@Target(METHOD)

public @interface BankingAnnotation {
    SecurityLevel securityLevel() default SecurityLevel.MEDIUM;
}
