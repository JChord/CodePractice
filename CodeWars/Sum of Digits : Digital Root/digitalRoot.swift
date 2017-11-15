func digitalRoot(of number: Int) -> Int {
	let str = String(number)
	if (str.characters.count == 1) {
		return number
	}

	let sum = str.characters.reduce(0, { x,y in
		digitalRoot(of: Int(String(x))! + Int(String(y))!)
	})

	return sum
}
