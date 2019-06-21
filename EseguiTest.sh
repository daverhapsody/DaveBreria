#!/usr/bin/env bash
while true; do
  clear
  echo "Esecuzione del programma: Test"
  echo "*-------------------------------*"
  java Test
  #jar -cvf Dave.jar Dave.class && java -cp ./DaveBreria/Dave.jar Dave
  echo "*-------------------------------*
Premi invio per continuare... "
  read
done
