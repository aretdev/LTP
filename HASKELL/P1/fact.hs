module Factorial where
	fact :: Int -> Int
	fact 0 = 1
	fact n = n * fact (n - 1)

	sumFacts :: Int -> Int

	sumFacts 0 = 0;
	sumFacts a = (fact a) + sumFacts (a - 1)