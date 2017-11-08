func dashatize(_ number: Int) -> String {

	let ary = Array(String(Swift.abs(number)).characters)

	var result = ary.enumerated().map({ offset, element -> String in
		let str = String(element)
		if Int(str)! % 2 != 0 {
			return "-\(str)-"
		} else {
			return str
		}
	}).joined().replacingOccurrences(of: "--", with: "-")


	if result.hasPrefix("-") {
		result = String(result.characters.dropFirst())
	}

	if result.hasSuffix("-") {
		result = String(result.characters.dropLast())
	}

	return result
}
