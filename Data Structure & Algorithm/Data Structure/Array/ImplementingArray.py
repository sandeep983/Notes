class Array:
  def __init__(self):
    self.length=0
    self.data={}

  def __str__(self):
    return str(self.__dict__)

  def get(self, index):
    return self.data[index]
  
  def push(self, item):
    # add item to current length
    # after the first push of 3, current length --> data[0] = 3
    self.data[self.length]=item 

    # increase length by 1
    # length now is 0+1 = 1
    self.length+=1

  def pop(self):
    # get the items which is in index, data[len-1]
    # after the first pop(), data[len-1] --> data[1-1] --> data[0] --> 3
    lastitem = self.data[self.length-1]

    # delete data[0] --> 3
    del self.data[self.length-1]

    # decrease length by 1
    # length now is 1-1 = 0
    self.length-=1
    return lastitem

  def delete(self, index):
    # after push(5), data[1] = 5
    # get the items which is in index data[1] --> 5
    deleteditem = self.data[index]

    # range(0, 2-1)
    # data[0] = data[0+1] --> 3 = 5
    for i in range(index, self.length-1):
        # shift all the elements to the left
        # here data[i] --> 5, data[i+1] next item --> not available
        self.data[i] = self.data[i+1]

    # delete data[1] --> 5
    del self.data[self.length-1]

    # length now is 2-1 = 1
    self.length-=1
    return deleteditem

arr=Array()
arr.push(3)
arr.pop()
arr.push(3)
arr.push(5)
arr.delete(2)
print(arr)