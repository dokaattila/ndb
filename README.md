# Name Day Finder
Name Day Finder (ndb) is a Java Spring application, that returns hungarian name days.

## General Information
- The project uses an SQLite database to store all the hungarian namedays, and is able to return the actual namedays
via GET-requests.
- The basic purpose of the project was to create a working Java Spring application.

## Usage
- APPLICATION_URL/nameday

- The application takes a GET-request and returns a JSON object with current name days.
https://name-day-finder.herokuapp.com/nameday

- Example for a response:
```json
[
    {
        "id": 109,
        "names": "Emma, Malvin, Zseraldina",
        "monthDay": "04.19"
    }
]
```

## Technologies Used
- Java - version 17
- Spring Boot - version 2.6.3
- Project Lombok - version 1.18.22
- SQLite
- Spring Boot JDBC - version 2.6.3

## Project Status
Project is: _in progress_ 

## Room for Improvement

To do:
- Retrieving name days for a certain date. 
- Creating a working online demo.
- Installing guide.

