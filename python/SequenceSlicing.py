a = ['a','b','c','d','e','f','g','h']

print("a[0:4] = ", a[0:4])
print("a[4:8] = ", a[4:8])

print ("a[:4] = ", a[:4])

print("a[10:len(a)] = ", a[10:len(a)])
print("a[10:] = ", a[10:])

print("a[-5:] = ", a[-5:])
print("a[:-5] = ", a[:-5])

b = a[:]
print("id(a) = ", id(a))
print("id(b) = ", id(b))