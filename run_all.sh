#!/bin/bash

if [ "$#" -ne 1 ]; then
    echo "usage: ./run_all.sh <input_program>";
    exit;
fi

make compile > /dev/null 2>&1
make execute < $1 > Output.java
javac Output.java
java Output