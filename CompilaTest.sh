#!/usr/bin/env bash
while true; do
  clear
  javac Test.java && echo "Compilazione completata
-------------------------------" && java Test
  #jar -cvf Dave.jar Dave.class && java -cp ./DaveBreria/Dave.jar Dave
  echo "-------------------------------
Premi invio per continuare... "
  read
done
