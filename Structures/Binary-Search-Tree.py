#Binary BinarySearch Tree example
class Node(object):
    """docstring for Node."""
    def __init__(self, data):
        self.left = None
        self.data = data
        self.right = None

    def insert(self, data):
        # Compare the new value with the parent node
        if self.data:
            if data < self.data:
                if self.left is None:
                    self.left = Node(data)
                else:
                    self.left.insert(data)
            elif data > self.data:
                if self.right is None:
                    self.right = Node(data)
                else:
                    self.right.insert(data)
        else:
            self.data = data
    def CountNode(self):
        i=0
        if self.left:
            i = i + self.left.CountNode()
        i = i+1
        if self.right:
            i = i + self.right.CountNode()
        return i

    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
        print(self.data),
        if self.right:
            self.right.PrintTree()

root = Node(10)
root.insert(9)
root.insert(13)

root.PrintTree()
print(root.CountNode())
