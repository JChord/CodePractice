class Node {
    var data: Int
    var next: Node?

    init(_ data: Int) {
        self.data = data;
    }
}

func push(_ head:Node?, _ data:Int) -> Node {
    let newNode = Node(data)
    newNode.next = head
    return newNode
}

func buildOneTwoThree() -> Node {
    return push(push(push(nil, 3), 2), 1)
}
