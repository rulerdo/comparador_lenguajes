package main

import (
	"fmt"
)

func main() {

	var name, apellido string

	fmt.Print("Escribe tu nombre: ")
	fmt.Scanf("%s", &name)

	fmt.Print("Escribe tu apellido: ")
	fmt.Scanf("%s", &apellido)

	fmt.Print("Tu nombre completo es: " + name + " " + apellido + " \n")

}
