#Generate indexed list  #1h
mylist = ['asa', 'bsd', 'asd']
litado = []
for li in mylist:
    index = mylist.index(li)
    appendList = [li, index]
    litado.append(tuple(appendList))
print(litado)