# Chat Application – Part 1

## Project Overview

This project is a console-based Java Chat Application developed for Part 1 of the PoE. The purpose of this part is to create a registration and login feature.

The application allows a user to enter their first name, last name, username, password and South African cellphone number. The application validates the information before allowing the user to register and log in.

## Features

The application includes:

* Username validation
* Password complexity validation
* South African cellphone number validation
* User registration
* User login
* Login status messages
* JUnit unit testing
* Maven project structure
* GitHub version control

## Username Requirements

The username must:

* Contain an underscore `_`
* Be no more than five characters long

Example of a valid username:

`Dkl_1`

## Password Requirements

The password must:

* Contain at least eight characters
* Contain a capital letter
* Contain a number
* Contain a special character

Example of a valid password:

`Ch&&sec@ke99!`

## Cellphone Number Requirements

The cellphone number must contain an international country code and meet the required length.

Example:

`+27719632234`

The cellphone validation uses a regular expression.

Regular expression reference:

Oracle Java Documentation – Pattern Class:
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html

## Login

After registration, the user can log in using the same username and password.

If the details are correct, the application displays a welcome message.

If the details are incorrect, the application displays an unsuccessful login message.

## Testing

JUnit tests are used to test the application.

The tests include:

* Correct username
* Incorrect username
* Correct password
* Incorrect password
* Correct cellphone number
* Incorrect cellphone number
* Successful login
* Failed login

The test data supplied in the PoE brief is used in the unit tests.

## Technologies Used

* Java
* Apache Maven
* JUnit
* NetBeans
* Git
* GitHub
* GitHub Desktop

## Application Type

This project is a console application. No graphical user interface or `JOptionPane` is used.

## Version Control

GitHub is used to manage the source code and record changes made during development.

Part 1 contains at least six commits documenting the development process.

## Author

Student: Dikeledi Molokomme

Hello, my name is Dikeledi Molokomme.
Video, I will demonstrate my Chat Application Part 1 project.

The purpose of this part of the project is to create a registration and login feature using Java.

The application is a console application, so I used the console for user input and output. I did not use a graphical user interface or JOptionPane.

First, I will explain the structure of my application.

My main class is called Main. This class starts the application and allows the user to enter their personal information, username, password and cellphone number.

I also created a Login class. This class contains the methods responsible for validating the user's information and handling registration and login.

The first method is checkUserName. This method checks that the username contains an underscore and is no more than five characters long.

The second method is checkPasswordComplexity. This method checks that the password contains at least eight characters, a capital letter, a number and a special character.

The third method is checkCellPhoneNumber. This method checks that the cellphone number contains an international country code and follows the required format. I used a regular expression for this validation.

The registerUser method checks the user's information and returns the appropriate registration message.

The loginUser method compares the username and password entered during login with the registered username and password.

The returnLoginStatus method displays a successful login message when the login details are correct, or an unsuccessful login message when they are incorrect.

I will now demonstrate the application.

I enter my first name and last name.

I then enter the username Dkl_1. This username is valid because it contains an underscore and is no more than five characters long.

For the password, I use Ch&&sec@ke99!. This password contains more than eight characters, a capital letter, numbers and special characters.

For the cellphone number, I enter +27719632234. This number contains the international country code.

The application then displays the registration messages.

I will now test the login feature.

I enter the same username and password that I used during registration.

The application verifies the details and displays the successful login message.

Next, I will demonstrate the unit tests.

I created JUnit tests for the username, password, cellphone number and login methods.

The tests include both valid and invalid test data.

For example, Dkl_1 is tested as a valid username, while kyle!!!!!!! is tested as an invalid username.

The password Ch&&sec@ke99! is tested as a valid password, while password is tested as an invalid password.

The cellphone number +27719632234 is tested as valid, while 09632234 is tested as invalid.

I also test both successful and unsuccessful login attempts.

The tests are run using Maven and JUnit.

Finally, I used GitHub for version control. I made multiple commits while developing the application instead of making only one commit at the end.

This demonstrates the development history of my Part 1 project.

That concludes my demonstration of the Chat Application Part 1 registration and login feature.



Reference
JUnit
Maven
OOP
Programming module outline 2026
Testing
Valiadation
