from threading import Thread, Lock, current_thread
from queue import Queue
import time

database_value = 0 #GLobal variable to share data between threads

def worker(q, lock):
    while True:
        value = q.get()
        
        #Processing...
        with lock:
            print(f'in {current_thread().name} got {value}')
            time.sleep(0.01)
        q.task_done()
        if True:
            break
    
if __name__ == "__main__":
    q = Queue()
    
    num_threads = 10
    print('\n\n')
    for i in range(num_threads):
        thread = Thread(target=worker,args=(q,Lock())) #(q,) Arguments in a tupl and the comma in necesary
        thread.daemon=True #Thread dies when the main thread dies
        thread.start()
    
    for i in range(1,21):
        q.put(i)
        
    q.join()    
    
    
    print('end main')
   