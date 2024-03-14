from time import time
import Helper
import Prim
"""
t1 = time()
primes = listadoPrimos(n)
t2 = time()
print("n =", n, "***", "time =", int(1000*(t2-t1)), "milliseconds)")
"""

def main():

    n = 256

    for i in range (0, 7, 1):
        t1 = time()
        graph = Helper.triangularMatrixRandomIntegers(n,100,999)
        complete_graph = Prim.complete_graph_from_triangular(graph)
        aux = Prim.prim_algorithm(complete_graph)
        #Prim.print_mst(aux)
        t2 = time()
        print("n: ",n, " time: ", (t2-t1)*1000 ) #milliseconds
        n = n*2

if __name__ == '__main__':
    main()
