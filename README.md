Mini AppStore with JAVA #6

Introduction

This project provides an introduction to full-stack web app development using JAVA. Whether you plan to dive deeper into web app development and become a specialist, or you plan to integrate other work with web applications, a basic foundation in full stack development will be very helpful.

In this project, we are going build a web application similar to the Google Play or Apple appstore with the goal of providing users with an easy to navigate page where they can browse available apps. The app store will use the following technologies: JAVA using Spring-MVC[1] framework, Hibernate ORM[2], MySQL[3] (data storage), Tomcat 8.0[4] (web server), and AngularJS[5] (UX).

The major functionalities are fairly simple. App information will be provided in a raw dataset and then loaded into a MySQL database. The final interface will filter the home page to only show the top 10 apps. Finally, if the user wishes to learn more about an app, they will be able to click on an app and be directed to a details page.
Key Technologies
Java MySQL AngularJS

Project

Instructions
Create a simple app store web application. For your stack we suggest using the Spring-MVC framework along with: Hibernate ORM as an intermediary between Java and MySQL, MySQL for data storage, Tomcat 8.0 for your web server, and Angular JS for the front end. Your web application should have the following functionalities:

    Initial view: show the top 10 apps in the app store based on user ratings
    Detail view: display additional details for the selected app, and provide a preview (the name and icon) for 5 additional apps that are recommended based on having common traits to the app currently selected
    View transferring: If the page currently being shown is a detail view, allow the user to navigate back to the initial view by clicking a “Go Back” button. In addition, allow the user to navigate from the detail view of one app to the detail view of one of the recommended apps displayed.
    App Administration: allow for user logins and app content management (creating new apps, updating existing apps, deleting existing apps)

Bonus Functionality

    Implement views by routing mapping rather than ng-show
    Query the database using HQL, without invoking the Hibernate API for database operations
    Enlarge the database and add functions for user login and app management
    Use MongoDB[6] instead of relational databases

Notes:

Restful APIs

    getTopApps: get top N apps from MySQL
    getRecomApps: get M recommended apps from MySQL
    getAppByID: get a single app from MySQL, searching by app_id
    APIs for create, update, get and delete an app

Suggested Test Cases:
To ensure that your app is functioning correctly, we suggest applying the following test scenarios to your app. Make any needed updates to your code so that the app handles each scenario and provides logical error handling and displays for the user.

    Scenario 1: the user signing in does not exist in the database
    Scenario 2: some value, such as the name of an app, is null when we are in the process of storing it in the database
    Scenario 3: some value, such as the name of a app, is null when we are retrieving it it from the database

Setup Requirements

    Jar files for Spring 4.0.5 and Hibernate 4.3.11:
    https://www.dropbox.com/s/ucdjlmixf7bktf7/20160109_AppStore_Java_JAR.zip?dl=0
    Tomcat 8.0, install it into your IDE (ex: My Eclipse)
    MySQL 5.5 or later versions
    Libraries of AngularJS, jQuery and Bootstrap. Style sheet from Bootstrap[7]

Suggested Prerequisite Knowledge

    Basic JAVA and Javascript
    Basic MySQL
    Familiar with JAVA IDE like MyEclipse(Eclipse)

Submission

    Please upload your final code to your Github account.
    Please record a video explaining the design choices you made including: the overall structure of the application, how you chose recommended apps, and any other features you would like to highlight. Please keep the video under 5 minutes.

References

[1]SpringMVC https://spring.io/guides/gs/serving-web-content/
[2]Hibernate http://hibernate.org/orm/
[3]MySQL http://dev.mysql.com/doc/refman/5.7/en/tutorial.html
[4]Tomcat 8.0 https://tomcat.apache.org/tomcat-8.0-doc/setup.html
[5]AngularJS https://angularjs.org
[6]MongoDB http://www.mongodb.org/
[7]Bootstrap http://www.runoob.com/try/bootstrap/layoutit/

