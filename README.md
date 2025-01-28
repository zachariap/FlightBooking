Flight Booking Program by Zacharia

Description

The goal of this program is to allow users to reserve a flight ticket. They are prompted to answer some basic information about themselves,
and then enter their source airport and destination airport codes to check for flights. They can choose between 3 different seat classes and an optional
bag-option, for an additonal fee.

Functionality

This program emphasizes object-oriented design principles and extendability. More specifically, we can see that the program allows for easy
customization of flights, aircraft messages sent to the user, and creation of add-ons. Adding an additional flight only involves
creating one class, and the information about the flight specifics is the only knowledge that is needed. So, it is easy to create additional
features that seamlessly flow into the code, without having to know the underlying structure of the program.


Features

The builder 'TicketBuilder' allows the complex creation of the ticket object to be organized and neatly created seperate from all the classes.

Implementing the strategy patterns allows the aircrafts to stores a message that can be swapped out at runtime. This message can be updated and changed
depending on the needs of the program and applied to all flights who are flying with their company.

Additional optional seat add-ons can be added to the concrete seat class, such as the bag that I have used in this program. It wraps the seat and incurs an additional
fee.

Drawbacks

This program is simple in its use and needs many layers of complexity to make a feasible product.

Running the Program

Download the src file and install a Java IDE (IntelliJ IDEA and Eclipse, as examples). Open the file in an IDE, and run the 'Driver' class. src>classes>driver>Driver
