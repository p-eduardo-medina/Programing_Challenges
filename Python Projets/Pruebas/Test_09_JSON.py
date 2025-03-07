import json

person = {"name":"John",
          "age":30,
          "city": "New York",
          "hasChildren":False,
          "Titles":["engineer",'programer']}

personJSON = json.dumps(person,indent=4,sort_keys=True) #JSON str
#print(personJSON)
"""
#  Python obj to JSON data
with open('person.json','w') as file:
    json.dump(person,file,indent=4)

#JSON data to python obj
with open('person.json','r') as file:
    person = json.load(file)
#person = json.loads(personJSON)
print(person)
"""


class User:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
user = User('Max',17)

def encode_User(obj):
    if isinstance(obj, User):
        return {'name':obj.name, 'age':obj.age, obj.__class__.__name__: True}
    else:
        raise TypeError('EL OBJETO DE TIPO USER NO ES JSON SERIALIZABLE')

from json import JSONEncoder

class USerEncoder(JSONEncoder):
    
    def default(self,obj):
        if isinstance(obj,User):
            return {'name':obj.name, 'age':obj.age, obj.__class__.__name__: True}
        return JSONEncoder.default(self,obj)
    
    
#userJSON = json.dumps(user, cls=USerEncoder)
userJSON = USerEncoder().encode(user)
print(userJSON)

def decode_user(dict):
    if User.__name__ in dict:
        return User(name=dict['name'],age=dict['age'])
    return dict

user = json.loads(userJSON,object_hook=decode_user)
print(type(user))
print(user.name)



        