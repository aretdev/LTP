module Practica2ParteI where
	--PARTE I DE LA PRÁCTICA 2


	-- EJERICIO 3
	divisors :: Int -> [Int]
	divisors''' a = [y | y <- [1..a], (mod a y) == 0]
	-- Manera Recursiva
	divisors x = divisors' x 1
	divisors' :: Int -> Int -> [Int]
	divisors' a b
		| a == b = [b]
		| mod a b == 0 = b : divisors' a (b + 1) 
		| otherwise = divisors' a (b + 1)



	-- EJERCICIO 4
	member' :: Int -> [Int] -> Bool
	member' a (x:t) = not ( null [y| y <- (x:t), a == y])

	-- Manera Recursiva
	member'' :: Int -> [Int] -> Bool
	member'' a [] = False;
	member'' a (x:xs)
		| a == x = True
		| otherwise = member'' a xs 



	-- EJERCICIO 5.1
	isPrime :: Int -> Bool
	isPrime a 
		| a == 1 = True
		| otherwise = length ([y | y <- [1..a], mod a y == 0]) == 2

	-- Manera Recursiva
	isPrime' :: Int -> Bool
	isPrime' a = length ( divisors a ) == 2



	-- EJERCICIO 5.2
	primes :: Int -> [Int]
	primes a = take a [y | y <- [1..], isPrime y]

	-- Manera Recursiva	
	primes' :: Int -> [Int]
	primes' a = primes'' a 1
	primes'' :: Int -> Int -> [Int]
	primes'' a b
		| a == 0 = [] 
		| (isPrime b) = b : primes'' (a - 1) (b + 1)
		| otherwise = primes'' a (b + 1)



	-- EJERCICIO 6
	selectEvenPos :: [Int] -> [Int]
	selectEvenPos list = [x | (x,y) <- zip list [0..], mod y 2 == 0]

	-- Manera Recursiva
	selectEvenPos' :: [Int] -> [Int]
	selectEvenPos' xs = selectEvenPos'' xs 0
	selectEvenPos'' :: [Int] -> Int -> [Int]
	selectEvenPos'' [] n = []
	selectEvenPos'' (x:xs) n
		| (mod n 2 == 0) = x : selectEvenPos'' xs (n + 1)
		| otherwise = selectEvenPos'' xs (n + 1)



	-- EJERCICIO 7
	ins :: Int -> [Int] -> [Int]
	ins a [] = [a] 
	ins a (x:xs)
		| a > x = x : ins a xs
		| otherwise = a:x:xs



	-- EJERCICIO 8
	iSort :: [Int] -> [Int]
	iSort [] = []
	iSort [x] = [x]
	iSort (x:xs) = ins x (iSort xs)



	-- EJERCICIO 9
	doubleAll :: [Int] -> [Int]
	doubleAll list = map (*2) list



	-- EJERCICIO 10
	map' :: (a -> b) -> [a] -> [b]
	map' f [] = []
	map' f list = [f x| x <- list]

	filter' :: (a -> Bool) -> [a] -> [a]
	filter' f list = [x| x <- list, f x]


	-- EJERCICIOS DE AMPLIACIÓN DE LA PARTE 1

	-- EJERCICIO 17
	repeated :: Int -> [Int] -> Int
	repeated e list = length ( [x| x <- list, e == x] )

	-- Manera Recursiva
	repeated' :: Int -> [Int] -> Int
	repeated' a [] = 0;
	repeated' a (x:xs)
		| a == x = 1 + repeated' a xs
		| otherwise = repeated' a xs



	-- EJERCICIO 18	
	concat' :: [[a]] -> [a]
	concat' [] = []
	concat' (xs:xss) = xs ++ concat' xss





