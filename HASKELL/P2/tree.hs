module Tree where
	data Tree a = Leaf a | Branch (Tree a) (Tree a) deriving Show
	

	-- EJERCICIO 12
	symmetric :: Tree a -> Tree a

	{- Traza
	symmetric' (Leaf a) = (Leaf a)
	symmetric' (Branch (Leaf a) (Leaf b)) = Branch (Leaf b) (Leaf a) -- swap de ojas
	symmetric' (Branch (Leaf a) (Branch b b1)) = Branch (symmetric (Branch b b1)) (Leaf a) -- swap de oja y branch (llamada a recursión)
	symmetric' (Branch (Branch a a1) (Leaf b)) = Branch (Leaf b) (symmetric (Branch a a1)) -- swap de branch (recur) y oja
	symmetric' (Branch (Branch a a1) (Branch b b1)) = Branch (symmetric (Branch b b1)) (symmetric (Branch a a1)) -- swap de branches y llamada doble a recursión
	-}

	symmetric (Leaf a )= (Leaf a)
	symmetric (Branch a b) = Branch (symmetric b) (symmetric a) 

	-- EJERCICIO 13
	listToTree :: [a] -> Tree a
	treeToList :: Tree a -> [a]


	listToTree [x] = Leaf x
	listToTree (x:y:resto)
		| (null resto) = (Branch (Leaf x) (Leaf y))
		| otherwise = (Branch (Leaf x) (Branch (Leaf y) (listToTree resto) ) )

	treeToList (Leaf a) = [a]
	treeToList (Branch a b) = (treeToList a) ++ (treeToList b)


	-- AMPLIACIÓN

	-- EJERCICIO 22     funcion  ->  Arbol   -> num

	data Tree' a = Branch' a (Tree' a) (Tree' a) | Void' deriving Show

	countProperty :: (a -> Bool) -> (Tree' a) -> Int
	countProperty func Void' = 0;
	countProperty func (Branch' num t1 t2)
		| (func num) = 1 + (countProperty func t1) + (countProperty func t2)
		| otherwise = 0 + (countProperty func t1) + (countProperty func t2)










