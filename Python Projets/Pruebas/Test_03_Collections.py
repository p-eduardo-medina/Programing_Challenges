from collections import Counter


a = 'zzzzzzzzzzzzzaaaaaaabbbccc'

mycounter = Counter(a)
"""
print(mycounter)
print(mycounter.items())
print(mycounter.values())
print(mycounter.keys())
print('\n \tMost comon: {}'.format(mycounter.most_common()))
print('\n \tMost comon(1): {}'.format(mycounter.most_common(2)))
print('\n \tMst comon (1)[0][0]: {}'.format(mycounter.most_common(1)[0][0]))
#print('\n \tMy counter as list: {}'.format(list(mycounter.elements())))
"""
from collections import namedtuple
Point = namedtuple('Point','x,y,z,w,v')

pt = Point(1,-4,5,1,-2)
print('pt: {}'.format(pt))
print('\n\tx = {}, y = {}, z ={}, w={}, v={}'.format(pt.x,pt.y,pt.z,pt.w,pt.v))

from collections import OrderedDict
ordered_Dict = OrderedDict()
ordered_Dict['a'] = 1
ordered_Dict['b'] = 2
ordered_Dict['c'] = 3
ordered_Dict['d'] = 4
ordered_Dict['e'] = 5
print('\n \tOrdeder Dictionary = {}'.format(ordered_Dict))


from collections import defaultdict
d = defaultdict(list)

d['a'] = 1
d['b'] = 2
d['c'] = 3

print('\t\t\nd[a] = {}'.format(d['d']))

from collections import deque
d = deque()

d.append(1)
d.append(2)
d.appendleft(3)
print(d)
#d.pop()
d.popleft()
print(d)


