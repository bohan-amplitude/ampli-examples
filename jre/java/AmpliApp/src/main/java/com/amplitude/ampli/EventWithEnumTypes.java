//
// Ampli - A strong typed wrapper for your Analytics
//
// This file is generated by Amplitude.
// To update run 'ampli pull jre-java-ampli'
//
// Required dependencies: com.amplitude:java-sdk:1.6.0, org.json:json:20201115
// Tracking Plan Version: 0
// Build: 1.0.0
// Runtime: jre:java-ampli
//
// [View Tracking Plan](https://data.amplitude.com/test-codegen/Test%20Codegen/events/main/latest)
//
// [Full Setup Instructions](https://data.amplitude.com/test-codegen/Test%20Codegen/implementation/jre-java-ampli)
//
package com.amplitude.ampli;

import java.util.HashMap;

public class EventWithEnumTypes extends Event {
    public enum OptionalEnum {
        OPTIONAL_ENUM_1("optional enum 1"), OPTIONAL_ENUM_2("optional enum 2");

        private final String value;

        public String getValue()
        {
            return this.value;
        }

        OptionalEnum(String value)
        {
            this.value = value;
        }
    }

    public enum RequiredEnum {
        REQUIRED_ENUM_1("required enum 1"), REQUIRED_ENUM_2("required enum 2");

        private final String value;

        public String getValue()
        {
            return this.value;
        }

        RequiredEnum(String value)
        {
            this.value = value;
        }
    }

    private EventWithEnumTypes(Builder builder) {
        super("Event With Enum Types", builder.properties);
    }

    public static IRequiredEnum builder() { return new Builder(); }

    // Inner Builder class with required properties
    public static class Builder implements IRequiredEnum, IBuild {
        private final HashMap<String, Object> properties = new HashMap<>();

        private Builder() {

        }

        /**
         * Description for optional enum
         * <p>
         * Must be followed by by additional optional properties or build() method
         */
        public IBuild requiredEnum(RequiredEnum requiredEnum) {
            this.properties.put("required enum", requiredEnum.getValue());
            return this;
        }

        /**
         * Description for required enum
         */
        public IBuild optionalEnum(OptionalEnum optionalEnum) {
            this.properties.put("optional enum", optionalEnum.getValue());
            return this;
        }

        public EventWithEnumTypes build() {
            return new EventWithEnumTypes(this);
        }
    }

    // Required property interfaces
    public interface IRequiredEnum {
        IBuild requiredEnum(RequiredEnum requiredEnum);
    }

    /** Build interface with optional properties */
    public interface IBuild {
        IBuild optionalEnum(OptionalEnum optionalEnum);
        EventWithEnumTypes build();
    }
}
