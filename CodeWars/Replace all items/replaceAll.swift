func replaceAll<T: Equatable>(array: [T], old: T, new: T) -> [T] {
	return array.map { item in
		if item == old {
			return new
		} else {
			return item
		}
	}
}
