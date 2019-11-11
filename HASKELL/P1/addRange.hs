module AddRange where
	addRange :: Int -> Int -> Int 

	addRange a b
		| a == b = b
		| a < b = a + (addRange (a + 1) b)
		| otherwise = addRange b a
