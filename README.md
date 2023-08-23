# GENERAL_STORE

ABOUT THE ASSIGNMENT : GENERAL STORE APK

1) User checks for invalid credentials.
     a) User handles the toast message.

2) User checks for valid credentials
     a) User add two shoes to the cart.
     b) Then varifies the items are adeed to the cart or not.

Concepts used :

1) Created config.properties file and added all the desired capabilities over there.
2) Created ConfigReader class to read the config.properties file.
3) Used loggers instead of sout statement and declared it inside the Loggers class of logger package.
4) Created Locators class inside locators package and stored all the locaters there.
5) Created Implementations class inside the implementations package to create all the method there and call it in stepdefinitions class
   to increase the code reausability.
6) Generated reports using plugins in Runner class.
7) Created common methods like clickOn() and used this method several times inside another method to increase code reusability.
8) Used Scenario-outline and Background in feature file to make it more readable.
9) Used Gradle to add the dependencies.
10) Took screenshot of each step under each scenario by creating a method of takeScreenShot() inside a seperate class 
11) Stored all these screenshots inside a seperate folder 
