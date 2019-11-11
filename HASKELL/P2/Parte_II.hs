module Practica2ParteII where
	--PARTE II DE LA PRÁCTICA 2

	-- EJERCICIO 12
	type Person = String
	type Book = String
	type Database = [(Person,Book)]

	exampleDatabase :: Database
	exampleDatabase = [("Laura","Libro 1"),("Paula","Libro 1"),("Laura","Libro 2"),("Max","Libro 3")]

	obtain :: Database -> Person -> [Book]
	obtain dBase dBPerson = [book| (person,book) <- dBase, person == dBPerson]


	borrow :: Database -> Book -> Person -> Database
	borrow dBase borrowBook dBPerson 
		| null ([book| book <- obtain dBase dBPerson, borrowBook == book ]) = dBase++[(dBPerson,borrowBook)]
		| otherwise = dBase

	return' :: Database -> (Person,Book) -> Database
	return' dBase datos = [tuplas | tuplas <- dBase, not ( datos == tuplas)]


