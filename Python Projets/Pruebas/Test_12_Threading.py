from threading import Thread

def suare_numbers():
    for i in range(100):
        i*i

if __name__ == "__main__":
    threads = []
    num_threads = 10
    
    #Create threads
    for i in range(num_threads):
        thread = Thread(target=suare_numbers)
        threads.append()
    
    #Star threads
    for thread in threads:
        thread.start()
    
    #Join threads: wait for them to complete
    for thread in threads:
        thread.join()
        
    print('End Main')
    

