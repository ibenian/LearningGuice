package step21;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ibenian on 17/5/20.
 */
public class MethodLoggingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // Log intercepted method call
        System.out.println(String.format("Method invoked %s.%s(%s)",
            invocation.getMethod().getDeclaringClass().getName(),
            invocation.getMethod().getName(),
            invocation.getArguments()
        ));
        return invocation.proceed();
    }

}