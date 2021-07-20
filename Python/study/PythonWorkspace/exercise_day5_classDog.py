class Dog:

    name = str()
    gender = str()
    type = str()

    def __init__(self, name, gender, type):
        self.name = name
        self.gender = gender
        self.type = type
    
    def respond_to_command(self, command):
        if command == self.name:
            self.speak()

    def speak(self):
        print('멍멍!!!')

fido = Dog('봉구', 'Male', 'Doberman')
print(fido.name)
print(fido.gender)
print(fido.type)
fido.respond_to_command('야옹이')
fido.respond_to_command('봉구')