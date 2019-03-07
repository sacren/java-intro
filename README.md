# Welcome to Java Intro!

## What is Java Intro?

Java Intro is a set of code examples attempting to explore Java programming
language.  Java Intro embraces AdoptOpenJDK project.  Maven is essential in
automating Java Intro.

## Prerequisite

1. Verify prebuilt OpenJDK 11 (LTS) is installed:

        $ java-config -L

2. Verify Apache Maven 3.3.3 and above is installed:

        $ mvn --version

## Setup and build

1. Install java-intro:

        $ git clone git://github.com/sacren/java-intro.git java-intro
        $ cd java-intro

2. Build and test:

        $ mvn clean package
        $ java -cp target/java-intro-1.0.jar TestPairOfDice
        ...

### From now on all is set up for more exploration.
