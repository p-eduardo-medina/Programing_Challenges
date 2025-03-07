from multiprocessing import Process, Value, Array
import os

def square_num():
    for i in range(1000):
        i*i
    print('Process finished')
    

if __name__ == '__main__':
    processes = []
    num_processes = os.cpu_count()
    
    #Number of CPUs on the machine. Usually a good choise for the number of processes
    
    #Create processes and asign a function for each process
    for i in range(num_processes):
        process =Process(target=square_num)
        processes.append(process)
        
    #Start all processes
    for process in processes:
        process.start()
        
    #Wait for all processes to finish
    #Block the main program until these processes are finished
    for process in processes:
        process.join()
    
    