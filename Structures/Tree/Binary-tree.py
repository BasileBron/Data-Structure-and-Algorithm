#Binary Tree example
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
            self.data = Node(data)

    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
        print(self.data),
        if self.right:
            self.right.PrintTree()

root = Node(10)
root.insert(9)
root.insert(1)
root.insert(4)
root.insert(13)
root.insert(15)
root.PrintTree()
