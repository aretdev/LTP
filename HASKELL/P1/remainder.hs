module Remainder where
	remainder :: Int -> Int -> Int

	remainder a b 
		| (b > a) = a
		| otherwise = remainder (a - b) b