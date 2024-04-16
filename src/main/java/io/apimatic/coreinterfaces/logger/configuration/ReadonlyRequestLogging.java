package io.apimatic.coreinterfaces.logger.configuration;

public interface ReadonlyRequestLogging extends ReadonlyLogOptions {
	boolean shouldIncludeQueryInPath();
}
