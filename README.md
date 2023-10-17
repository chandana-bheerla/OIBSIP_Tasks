# Oasis Infobyte Internship: Java Development

Task 1- Online Reservation System

Steps:

    1. A boolean array, called seats, of length 10 is created. If an index value is 1 the seat is available and if it's 0 the seat isn't available.

    2. The main method displays options to the user and takes their input. The user can choose to view the seat availability, reserve a seat, cancel a reservation, or exit the system.

    3. The viewSeats method prints an "X" indicating a reserved seat and the seat number if that seat is available.

    4. The reserveSeat method prompts the user to enter a seat number, checks if the input is valid changes the seat value in the array accordingly.

    5. The cancelReservation method sets the corresponding element in the array to false to cancel the reservation.



Task 2- Number Guessing Game

Steps:

    1. The main method displays options to the user and takes their input. The user can choose to start, display the previous score, or exit the game.

    2. The guessNumber method makes use of the random number generated using Random class in Java, compares it with the number guessed by the user, and gives the user a hint to guess lower or higher.

    3. A public int value count is maintained to display it as the score if the user chooses the option.
