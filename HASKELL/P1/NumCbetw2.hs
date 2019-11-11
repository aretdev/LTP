module NumCbetw2 where
	import Data.Char
	numCbetw2 :: Char -> Char -> Int

	numCbetw2 a b
		| ord a == ord b = 0
		| ord a < ord b = 1 + (numCbetw2 (chr ((ord a) + 1)) b)
		| otherwise = numCbetw2 b a