module Leapyear where
	leapyear :: Int -> Bool

	leapyear a 
		| ((mod a 4) == 0) && ((mod a 100) /= 0) = True
		| ((mod a 400) == 0) = True
		| otherwise = False

	daysAmonth :: Int -> Int -> Int

	daysAmonth a b
		| (a == 2) && (leapyear b) = 29
		| (a == 2) = 28
		| otherwise = 31