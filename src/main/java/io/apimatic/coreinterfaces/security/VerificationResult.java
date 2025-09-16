package io.apimatic.coreinterfaces.security;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represents the result of an operation that can either succeed
 * or fail with an error message.
 */
public interface VerificationResult {

    /**
     * Indicates whether the verification succeeded.
     *
     * @return true if successful; false otherwise.
     */
    boolean isSuccess();

    /**
     * Gets the collection of error messages, if any.
     * Always returns a read-only list (never null).
     *
     * @return unmodifiable list of errors, empty if success.
     */
    List<String> getErrors();

    /**
     * Creates a successful result.
     *
     * @return a success result
     */
    static VerificationResult success() {
        return DefaultImpl.SUCCESS;
    }

    /**
     * Creates a failed result with the given error messages.
     *
     * @param errors list of error messages
     * @return a failure result
     */
    static VerificationResult failure(String... errors) {
        return new DefaultImpl(errors);
    }

    /**
     * Default hidden implementation inside the interface.
     */
    class DefaultImpl implements VerificationResult {
        private static final VerificationResult SUCCESS = new DefaultImpl();

        private final List<String> errors;

        private DefaultImpl(String... errors) {
            this.errors = Collections.unmodifiableList(errors != null ?
                    Arrays.asList(errors) : Collections.emptyList());
        }

        @Override
        public boolean isSuccess() {
            return errors.isEmpty();
        }

        @Override
        public List<String> getErrors() {
            return errors;
        }

        @Override
        public String toString() {
            return isSuccess()
                    ? "VerificationResult{success}"
                    : "VerificationResult{errors=" + errors + "}";
        }
    }
}