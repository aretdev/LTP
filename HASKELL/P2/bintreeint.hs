module BinTreeInt where
	data BinTreeInt = Void | Node Int BinTreeInt BinTreeInt deriving Show

	-- EJERCICIO 14
	insTree :: Int -> BinTreeInt -> BinTreeInt

	insTree a (Void) = (Node a Void Void)
	insTree a (Node num bin1 bin2) 
		| (a == num) = (Node a bin1 bin2)
		| (a < num) = (Node num (insTree a bin1) bin2)
		| otherwise = (Node num bin1 (insTree a bin2))

	-- EJERCICIO 15
	creaTree :: [Int] -> BinTreeInt

	creaTree [] = Void
	creaTree (x:xs) = (insTree x (creaTree xs))

	-- EJERCICIO 16
	treeElem :: Int -> BinTreeInt -> Bool

	treeElem a Void = False
	treeElem a (Node num bin1 bin2)
		| (a == num) = True
		| (a < num) = (treeElem a bin1)
		| otherwise = (treeElem a bin2)


	-- AMPLIACIÓN

	-- EJERCICIO 21 
	dupElem :: BinTreeInt -> BinTreeInt

	dupElem Void = Void
	dupElem (Node num bin1 bin2) = (Node (2*num) (dupElem bin1) (dupElem bin2))