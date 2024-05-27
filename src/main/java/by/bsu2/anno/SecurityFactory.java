package by.bsu2.anno;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
    public static AccountManager createSecurityObject(
            AccountManager target) {
        return (AccountManager) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new SecurityInvokationHandler(target));
    }
    private static class SecurityInvokationHandler implements InvocationHandler {
        private Object targetObject;
        public SecurityInvokationHandler(Object target) {
            this.targetObject = target;
        }
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            SecurityService logic = new SecurityService();
            Method realMethod = targetObject.getClass().getMethod(
                    method.getName(),
                    (Class[]) method.getGenericParameterTypes());
            BankingAnnotation annotation =
                    realMethod.getAnnotation(BankingAnnotation.class);
            SecurityLevel level = null;
            if (annotation != null) {
                // доступны и аннотация и параметры метода
               level = annotation.securityLevel();
            }
                logic.securityCheck(level, realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.err.println(level + e.getMessage());
                    throw e;
                }
        }
    }
}
