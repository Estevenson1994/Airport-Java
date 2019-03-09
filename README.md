# Airport-Java

Here is an attempt at the [Makers Academy](https://makers.tech/) Airport Weekend Challenge in Java. The instructions for the original challenge which was done in Ruby can be found [here](https://github.com/makersacademy/airport_challenge) and my original Ruby solution can be found [here](https://github.com/Estevenson1994/airport_challenge).

## Tech Used for this project:

- Java - for writing the program
- JUnit4 - for all the tests

## Diagrams

![Screenshot](https://i.imgur.com/X5s7Fug.png)

## How the program works in jshell:

```

jshell> private Plane plane1 = new Plane();
plane1 ==> Plane@6325a3ee

jshell> private Plane plane2 = new Plane();
plane2 ==> Plane@1d16f93d

jshell> private Plane plane3 = new Plane();
plane3 ==> Plane@2b9627bc

jshell> private Weather weather = new Weather(); 
weather ==> Weather@65e2dbf3

jshell> private Airport Heathrow = new Airport(weather, 2);
Heathrow ==> Airport@4f970963

jshell> Heathrow.capacity;
$10 ==> 2

jshell> Heathrow.land(plane1);
|  Exception REPL.$JShell$13$WeatherException: Weather is stormy, cannot land
|        at Airport.land (#6:15)
|        at (#65:1)

jshell> Heathrow.land(plane1);
$11 ==> Plane@6325a3ee

jshell> Heathrow.land(plane2);
$12 ==> Plane@1d16f93d

jshell> Heathrow.land(plane3);
|  Exception REPL.$JShell$17$AirportFullException: Airport is full, cannot land
|        at Airport.land (#6:18)
|        at (#29:1)

jshell> Heathrow.hasPlane(plane1);
$13 ==> true

jshell> Heathrow.hasPlane(plane2);
$14 ==> true

jshell> Heathrow.hasPlane(plane3);
$15 ==> false

jshell> Heathrow.planes;
$16 ==> [Plane@6325a3ee, Plane@1d16f93d]

jshell> Heathrow.takeOff(plane1);
$17 ==> Plane@6325a3ee

jshell> Heathrow.takeOff(plane2);
$18 ==> Plane@1d16f93d

jshell> Heathrow.planes;
$19 ==> []

