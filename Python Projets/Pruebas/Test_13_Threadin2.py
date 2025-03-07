from threading import Thread, Lock
import time

database_value = 0

def increase(lock):
    global database_value
    
    #lock.acquire//Adquirir\\()#With lockjust one thread can work at a time  
    with lock:
        local_copy = database_value
        local_copy = database_value    
        local_copy += 1
        time.sleep(0.1)     #Gives time to start thread #2
    
        database_value = local_copy
    #lock.release()


if __name__ == "__main__":
    
    lock = Lock()
    print(f'Start Value = {database_value}')
    
    thread1 = Thread(target = increase, args=(lock,))
    thread2 = Thread(target = increase, args=(lock,))
    
    thread1.start()
    thread2.start()
    
    thread1.join()
    thread2.join()
    
    print(f'end value {database_value}')        
    
    print('End main')