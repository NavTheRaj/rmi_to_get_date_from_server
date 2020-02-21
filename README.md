This is a simple RMI program to calculate the area of triangle by passing the parameters from Client
side to the Server.

Steps for running and compiling the programs are as follow:
#Firstly compile all programs by:
	javac *.java
Or you can compile them serially

#Secondly open three consoles and type in the first one as:
$ rmiregistry   | Windows: start rmiregistry

#Then run the server program as 
java Server

#Finally run the client program in third console:
java Client


#Please contact and post the issue if some error arise

#Possible erros may be if the program is already in the process in such case find out by

$ lsof -i :1099  | Here 1099 can be any number thrown in the console as error
$ kill -9 PID_NUMBER| PID_NUMBER will be ythrown by previous command.


