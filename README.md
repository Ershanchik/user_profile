UserProfile Builder — Builder Pattern (Assignment 1)
Overview

One build process for a user profile (username, email, bio, verified) is reused through two builders:

UserProfileObjectBuilder — builds a real, immutable UserProfile object
UserProfileCardBuilder — builds a text "profile card" (String) preview

ProfileDirector holds ready-made recipes (makeBasicProfile, makeVerifiedProfile) and only depends on the UserProfileBuilder interface — it doesn't know which concrete builder it's given.

Project structure
src/
  UserProfile.java              — product (immutable)
  UserProfileBuilder.java       — builder interface (fluent API)
  UserProfileObjectBuilder.java — builds a UserProfile object
  UserProfileCardBuilder.java   — builds a text profile card
  ProfileDirector.java          — build recipes
  Main.java                     — demo of both scenarios + validation
How to run
cd src
javac -encoding UTF-8 *.java -d ../bin
cd ..
java -cp bin Main
Clean Code principles applied
Single Responsibility — UserProfile only holds data; each builder only produces its own result type.
Immutability — final fields, no setters, package-private constructor.
Fluent Interface — each builder method returns this, enabling chained calls: .setUsername(...).setEmail(...).setBio(...).
Fail Fast — getResult() validates required fields and throws IllegalStateException with a clear message instead of returning a broken object.
Avoid Magic Strings — CARD_DIVIDER is a named constant instead of a repeated literal.
Dependency Inversion — ProfileDirector depends only on the UserProfileBuilder interface, never on a concrete implementation.
