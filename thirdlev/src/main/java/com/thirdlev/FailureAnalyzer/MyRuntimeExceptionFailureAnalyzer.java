package com.thirdlev.FailureAnalyzer;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author zhangbaowei
 * Create  on 2018/11/12 13:28.
 */
public class MyRuntimeExceptionFailureAnalyzer
        extends AbstractFailureAnalyzer<RuntimeException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure,
                                      RuntimeException cause) {
        return new FailureAnalysis(getDescription(cause), getAction(cause), cause);
    }

    private String getDescription(RuntimeException ex) {
        return String.format("The bean %s could not be injected as %s "
                        + "because it is of type %s",
                ex.getMessage(),
                ex.getClass(),
                ex.getLocalizedMessage());
    }

    private String getAction(RuntimeException ex) {
        return String.format("Consider creating a bean with name %s of type %s",
                ex.getMessage(),
                ex.getClass());
    }


}
