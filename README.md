# Networking
## Android networking tutorial for IIT Madras Webops Club Summer School 2017 ##


Branches named from **step1** to **step4** contain the code for the various steps involved.

The **master** branch contains the final code.

You can compare any two consecutive step branches to find the code difference and hence find what is done in that step.

Instructions:

**step1:**
* Create MainActivity and change the layout
* Creade Earthquake class to create earthquake objects to store data

**step2:**
* Add internet permissions to manifest.xml
* Create NetworkHelper class which contains functions to make the http request, get the response, parse the data and return a list of earthquake objects

**step3:**
* Create custom Loader class that does the background task of fetching the data

**step4:**
* Implement LoaderManager to initialize the custom Loader
* Display the data using the TextView in activity_main.xml
