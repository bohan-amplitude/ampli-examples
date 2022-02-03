//
// Ampli - A strong typed wrapper for your Analytics
//
// This file is generated by Amplitude.
// To update run 'ampli pull java-jre-ampli'
//
// Required dependencies: com.amplitude:java-sdk:1.6.0, org.json:json:20201115
// Tracking Plan Version: 0
// Build: 1.0.0
// Runtime: jre:java-ampli
//
// [View Tracking Plan](https://data.amplitude.com/test-codegen/Test%20Codegen/events/main/latest)
//
// [Full Setup Instructions](https://data.amplitude.com/test-codegen/Test%20Codegen/implementation/java-jre-ampli)
//
package com.amplitude.ampli;

public class LoadOptions {
    private Ampli.Environment environment;
    private Boolean disabled;
    private LoadClientOptions client;

    public LoadOptions() {
    }

    public LoadOptions setEnvironment(Ampli.Environment environment) {
        this.environment = environment;
        return this;
    }

    public Ampli.Environment getEnvironment() { return this.environment; }

    public LoadOptions setDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public Boolean getDisabled() { return this.disabled; }

    public LoadOptions setClient(LoadClientOptions options) {
        this.client = options;
        return this;
    }

    public LoadClientOptions getClient() { return this.client; }
}