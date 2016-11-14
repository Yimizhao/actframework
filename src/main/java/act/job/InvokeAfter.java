package act.job;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Mark a method to be a job that will be executed synchronously after the
 * invocation of another job specified by the value
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface InvokeAfter {
    /**
     * Specifies the ID of the Job that will be invoked prior to the invocation
     * of the annotated method
     */
    String value();

    /**
     * Specify the ID of the scheduled job. Default value: empty string
     * @return the job id
     */
    String id() default "";
}
