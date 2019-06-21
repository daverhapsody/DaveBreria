#!/usr/bin/env bash
cd /Users/daveskidrow/Documents/OneDrive\ -\ Universita\ degli\ Studi\ di\ Milano-Bicocca/Univeristà/Programmazione/DaveBreria/
while true; do
  clear
  javac Dave.java && echo "Compilazione completata" && java Dave
  #jar -cvf Dave.jar Dave.class && java -cp ./DaveBreria/Dave.jar Dave
  echo "Premi invio per continuare... "
  read
done
