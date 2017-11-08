func sortTwisted37(_ arr: [Int]) -> [Int] {
    return arr.sorted { twisted($0) < twisted($1) }
}

func twisted(_ num: Int) -> Int {
    let str = String(num)
      .replacingOccurrences(of: "3", with: "x")
      .replacingOccurrences(of: "7", with: "3")
      .replacingOccurrences(of: "x", with: "7")

    return Int(str)!
}
