First I created CinemaConfig class which uses Singleton Pattern, it garantees that we'll have only one instance of the class.
In the constrructor it checks if instance exists and only it doesnt exist, it creates new one. Then i created variables; getters; setters.

Next Factory Method Pattern. For that one first I created Movie interface, with getType method. Then created Three types of movies, they all implement Movie interface, and return their type.
Then, to create movies MovieFactory abstract class was created with method createMovie. And I created Factories for each Movie type that extended Movie factory class.
They'll create new movie of their type and return it.

Abstract Factory Pattern. Two interfaces Button and textField were created. Then i created classes that implement these interfaces: DarkThemeButton, DarkThemeTextField, LightThemeButton, LightThemeTextField.
Then UIFactory interface was created. I created two classes DarkThemeFactory and LightThemeFactory that implement UIFactory. They produce themed UI components (concrete factories).
MainApp class generates the UI components through the corresponding factory.

Builder Pattern. I made TicketBooking fields and constructor private to enforce to use Builder. TicketBookingBuilder class contains setters, that return instance itself, and this allows chaining. Build method returns fully constructed TicketBooking object.

Prototype Pattern. MovieSchedule class extends Clonable, and has method clone, that will be implemented by StandardSchedule class. StandardSchedule class has fields and constructoer, getters and setters. And implements clone method via super.clone() from Clonable interface.
