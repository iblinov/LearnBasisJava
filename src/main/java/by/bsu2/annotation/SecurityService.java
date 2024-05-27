package by.bsu2.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class SecurityService {
    public void securityCheck(SecurityLevel level, Method method, Object[] args) {
		System.out.println(String.format(
                "Method %S was invoked with parameters : %s", method.getName(),
                Arrays.toString(args)));
if(level == null) {
    level = SecurityLevel.OFF;
}
		switch (level) {
        case LOW:
            System.out.println("Низкий уровень проверки безопасности: " + level);
            break;
        case MEDIUM:
            System.out.println("Обычный уровень проверки безопасности: " + level);
            break;
        case HIGH:
            System.out.println("Высокий уровень проверки безопасности: " + level);
            break;
            case OFF:
                System.out.println(level);
                break;
                default:
                    //throw ?
    }
}
}
