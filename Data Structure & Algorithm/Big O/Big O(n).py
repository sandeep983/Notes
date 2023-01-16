import time

nemo = ['nemo']
everyone = ['dory', 'bruce', 'marlin', 'nemo', 'gill', 'bloat', 'nigel', 'squirt', 'darla', 'hank']
large = ['nemo' for i in range(1000)]

def findNemo(array):
    t0 = time.time()
    for items in array:
        if items == 'nemo':
            print('Found NEMO!')
    t1 = time.time()
    print('Found nemo in', t1 - t0, 'seconds')

findNemo(large)   #Linear time - O(n)
