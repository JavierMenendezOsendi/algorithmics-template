import Helper

infinite = 9999999.0

def complete_graph_from_triangular(matrix):
    tam = len(matrix)
    copy = list(matrix)
    for i in range(tam):
        for j in range(i+1, tam):
            copy[j][i] = matrix[i][j]
    return copy

def prim_algorithm(graph):
    tam = len(graph)
    selected_nodes = [False] * tam #anyone was visited
    num_edges = 0
    selected_nodes[0] = True #starting from 0
    aux = []

    while num_edges < tam - 1:

        minimum = infinite
        x = 0
        y = 0
        for i in range(tam):
            if selected_nodes[i]:
                for j in range(tam):
                    if not selected_nodes[j] and graph[i][j]:
                        if minimum > graph[i][j]:
                            minimum = graph[i][j]
                            x = i
                            y = j
        aux.append((x, y, graph[x][y]))
        selected_nodes[y] = True
        num_edges += 1

    return aux

def print_mst(mst):
    total_cost = sum([edge[2] for edge in mst])
    print("ARISTAS SELECCIONADAS=")
    aux = 0
    for edge in mst:
        aux+=1
        print(f"ARISTA NUMERO {aux} : DESDE NODO = {edge[0]} HASTA NODO {edge[1]} *** COSTE= {edge[2]}")



graph = Helper.triangularMatrixFromFile("graph4.txt")
complete_graph = complete_graph_from_triangular(graph)
aux = prim_algorithm(complete_graph)
print_mst(aux)

