# Ampli Python Wrapper
An example app using the Ampli Python Wrapper

# Usage

### Setup the project
You will need to do the following before running the app.

`pip install -r requirements.txt`

### Run the app
You can run the app using the events from our sample tracking plan.
This will log events to your Amplitude project.
* `python app.py`

### Pull your Ampli Wrapper
If you want to use your own tracking plan and Ampli Wrapper
1. `npm i -g @amplitude/ampli`
2. `ampli pull`
3. Update `app.py` to use the events from your tracking plan

# Project structure
* README.md - you are here *
* ampli/ 
  * [ampli.py](ampli/ampli.py) - Generated SDK, don't modify by hand. Update with `ampli pull`
  * [requirements.txt](ampli/requirements.txt) - Dependencies of ampli wrapper
* [app.py](app.py) - Example user app using Ampli SDK. A good place to start.
* [plugins.py](plugins.py) - Example plugin for Event enrichment