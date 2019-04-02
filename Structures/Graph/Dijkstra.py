def Dijkstra_v1(nodes):
    """
    Input : A directed grapd with weight matrix 'weight'
    and a start vertex 's'
    Output : An array 'D' of distance as explained above
    """
    #We begin by building the distance overestimate
    D = [nodes]

    D[s] = 0 #the shortest path from s to itself

    for node in nodes:
        if node not D[s]:
            D[node] = infinity #this is an overestimate

    #We use an auxiliary array 'tight' indexed by the vertices,
    #that records for wich nodes the shortest path estimate
    #are ''known'' to be tight by the algorithm
    tight = []
    for node in nodes:
        tight[node] = false

    #We now repetedly update the array 'D' and 'tight' until
    #all entry in the array 'tight' hold the value true.
