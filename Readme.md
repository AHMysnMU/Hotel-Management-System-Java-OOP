# Hotel Management System 🏨

A simple **Hotel Management System** built in **Java** using **Object-Oriented Programming (OOP)** concepts.

The project simulates basic hotel operations such as managing rooms and guests, booking rooms, cancelling reservations, and checking guests into their booked rooms.

## About the Project

This project was created to practice and apply core Java OOP concepts in a practical scenario.

The system manages two types of hotel rooms:

- Standard Rooms
- Suite Rooms

It also keeps track of guests, room availability, bookings, and room information.

## Features

- Add hotel rooms
- Add guests
- Automatically generate unique room numbers
- Automatically generate unique guest IDs
- Search for an available room by type
- Book a specific room for a guest
- Prevent booking unavailable rooms
- Cancel an existing reservation
- Check a guest into their booked room
- Track room availability
- Track which guest booked each room
- Display room and guest information
- Handle invalid guest and room IDs
- Support different room types

## Room Types

### Standard Room

A standard room contains:

- Room number
- Room type
- Price
- Availability status
- Discount support

The discounted price can be calculated using the `applyDiscount()` method.

### Suite Room

A suite room contains:

- Room number
- Room type
- Price
- Availability status
- A list of amenities

Examples of amenities can include beds, carpets, and other room facilities.

## Main Classes

### `Room`

An abstract parent class that represents a general hotel room.

It contains common properties such as:

- Room number
- Room type
- Price
- Availability
- Booked guest ID

It also defines the abstract `getType()` method that must be implemented by child classes.

### `StandardRoom`

Extends the `Room` class and represents a standard hotel room.

It adds support for:

- Discounts
- Discounted price calculation

### `SuiteRoom`

Extends the `Room` class and represents a hotel suite.

It adds:

- Room amenities
- Amenities listing

### `Guest`

Represents a hotel guest.

Each guest contains:

- Unique guest ID
- First name
- Last name
- Phone number

### `Reservation`

An interface that defines the main reservation operations:

- Book a room
- Cancel a booking
- Check in a guest

### `Hotel`

Implements the `Reservation` interface and manages the main hotel operations.

It stores:

- Rooms
- Guests

It is responsible for:

- Adding rooms and guests
- Finding available rooms
- Booking rooms
- Cancelling reservations
- Checking guests in
- Validating IDs

### `Demo`

Contains sample objects and operations used to demonstrate and test the hotel management system.

## OOP Concepts Practiced

This project demonstrates several important Java OOP concepts:

- Classes and Objects
- Encapsulation
- Inheritance
- Abstraction
- Interfaces
- Method Overriding
- Constructors
- Getters and Setters
- Static Variables
- Polymorphism
- Arrays of Objects

## Project Structure

```text
Hotel-System-Management-Java-OOP/
│
├── src/
│   ├── Room.java
│   ├── StandardRoom.java
│   ├── SuiteRoom.java
│   ├── Guest.java
│   ├── Reservation.java
│   ├── Hotel.java
│   └── Demo.java
│
├── README.md
└── .gitignore