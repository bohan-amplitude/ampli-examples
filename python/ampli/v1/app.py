from ampli import *
from plugins import MyEventIDPlugin

# Initialize the Ampli instance with LoadOptions and LoadClientOptions
ampli = Ampli()
ampli.load(LoadOptions(Environment.DEVELOPMENT, False, client=LoadClientOptions(api_key="key", zone="EU")))

# Identify using IdentifyProperties in tracking plan
ampli.identify("user_id", IdentifyProperties(required_number=16.6, optional_array=['abc', 'test']))

# Group Identify using GroupProperties in tracking plan
ampli.group_identify("Org", "Engineer", GroupProperties(required_boolean=True, optional_string=None))

# Set groups for user
ampli.set_group("user_id", "Org", ["Engineer", "DevOp"])

# track strongly typed event class with ampli.track
ampli.track(EventNoProperties(), event_options=EventOptions(user_id="user_id", device_id="device_id"))

# track event with strongly typed method
ampli.event_no_properties("user_id", event_options=EventOptions(device_id="device_id"))

# track EventWithAllProperties
ampli.event_with_all_properties(user_id="user_id",
                                required_array=["a", "b"],
                                required_boolean=False,
                                required_enum=EventWithAllProperties.RequiredEnum.ENUM_1,
                                required_number=16.4,
                                required_integer=3,
                                required_string="str")
ampli.track(EventWithAllProperties(required_array=["a", "b"],
                                   required_boolean=False,
                                   required_enum=EventWithAllProperties.RequiredEnum.ENUM_1,
                                   required_number=16.4,
                                   required_integer=3,
                                   required_string="str"), event_options=EventOptions(user_id="user_id"))

# track event with const properties
ampli.event_with_const_types(user_id="user_id")
ampli.track(EventWithConstTypes(), event_options=EventOptions(user_id="user_id"))

# track event with strongly typed method
ampli.event_max_int_for_test(user_id="user_id", int_max_10=6)
ampli.event_object_types(user_id="user_id", required_object={"key": "value"}, required_object_array=[{"k": 15}])
ampli.event_with_array_types("user_id", required_boolean_array=[True, False],
                             required_object_array=[{"k": "v"}],
                             required_number_array=[1, 4, 6.6],
                             required_string_array=["a", "b"])
ampli.event_with_enum_types("user_id", required_enum=EventWithEnumTypes.RequiredEnum.REQUIRED_ENUM_1,
                            optional_enum=EventWithEnumTypes.OptionalEnum.OPTIONAL_ENUM_2)

# add plugin
my_plugin = MyEventIDPlugin()
ampli.add(my_plugin)

# remove plugin
ampli.revenue(my_plugin)

# flush events
ampli.flush()

# shutdown ampli instance
ampli.shutdown()