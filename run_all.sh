#!/bin/bash

make compile > /dev/null 2>&1
make execute < test.txt > Output.java
javac Output.java
java Output