"""
# 마린 : 공격 유닛, 군인. 촐을 쏠 수 있음
name = "마린" # 유닛의 이름
hp = 40 # 유닛의 체력
damage = 5 # 유닛의 공격력

print("{0} 유닛이 생성되었습니다.".format(name))
print("체력 {0}, 공격력 {1}\n".format(ht, damage))

# 탱크 : 공격 유닛, 탱크. 포를 쏠 수 있는데, 일반 모드 / 시즈 모드.
tank_name = "탱크"
tank_hp = 150
tank_damage = 35

print("{0} 유닛이 생성되었습니다.".format(tank_name))
print("체력 {0}, 공격력 {1}\n".format(tank_hp, tank_damage))

tank2_name = "탱크"
tank2_hp = 150
tank2_damage = 35

print("{0} 유닛이 생성되었습니다.".format(tank2_name))
print("체력 {0}, 공격력 {1}\n".format(tank2_hp, tank2_damage))

def attack(name, location ,damage):
    print("{0} : {1} 방향으로 적군을 공격 합니다. [공격력 {2}]".format( \
        name, location, damage))

attack(name, "1시", damage)
attack(tank_name, "1시", tank_damage)
attack(tank2_name, "1시", tank2_damage)

"""

class Unit:
    def __init__(self, name, hp, damage):  # init함수 : __init__ => 생성자
        self.name = name                # 즉, 마린, 탱크같은 객체가 만들어 질 때, 자동으로 호출되는 부분
        self.hp = hp
        self.damage = damage  # name, hp, damage -> 멤버 변수
        print("{0} 유닛이 생성 되었습니다.".format(self.name))
        print("체력 {0}, 공격력 {1}".format(self.hp, self.damage))

marine1 = Unit("마린", 40 , 5)  # 마린, 탱크같은, class로부터 만들어 지는 녀석들을 객체라고 함
marine2 = Unit("마린", 40 , 5)  # 마린 ,탱크는, Unit 클래스의 인스턴스(instance)라고 함
tank = Unit("탱크", 150, 35)  # 객체가 생성될 때는 init함수의 정의된 갯수와 동일하게 해야 됨. (self는 뺴고)
# marine3 = Unit("마린")
# marine3 = Unit("마린", 40)  # -> init함수에 정의된 갯수와 안맞아서 오류

#레이스 : 공중 유닛, 비행기. 클로킹 (상대방에게 보이지 않음)
wraith1 = Unit("레이스", 80, 5)
# 레이스 유닛이 생성 되었습니다.
# 체력 80, 공격력 5
print("유닛 이름 : {0}, 공격력 : {1}".format(wraith1.name, wraith1.damage))
# 유닛 이름 : 레이스, 공격력 : 5

# 마인드 컨트롤 : 상대방 유닛을 내 것으로 만드는 것 (빼앗음)
wraith2 = Unit("빼앗은 레이스", 80, 5)
# 빼앗은 레이스 유닛이 생성 되었습니다.
# 체력 80, 공격력 5

wraith2.clocking = True  # -> Python에서는, 어떤 객체에, 추가로 변수를, 외부에서 만들어서 쓸 수 있다.
                        # -> .clocking
if wraith2.clocking == True:
    print("{0} 는 현재 클로킹 상태입니다.".format(wraith2.name))
# 빼앗은 레이스 는 현재 클로킹 상태입니다.

# if wraith1.clocking == True:  # -> wraith1.clocking 설정된게 없으므로 (에러 발생)
#     print("{0} 는 현재 클로킹 상태입니다.".format(wraith2.name))



class AttackUnit:
    def __init__(self, name, hp, damage):  # -> self는 자기 자신을 의미 하는 것.
        self.name = name        # -> 클래스 내에서, 이 메소드 앞에는 항상 self를 무조건 적는다고
        self.hp = hp            #   이해하면 됨.
        self.damage = damage

    def attack(self, location):
        print("{0} : {1} 방향으로 적군을 공격 합니다. [공격력 {2}]"\
            .format(self.name, location, self.damage))  # -> .self는 위에서 정의된 name, damage를 쓰는 거고,
                                                # location은 전달반은 attack(self, location)의 location 값을 사용.
    def damaged(self, damage):
        print("{0} : {1} 데미지를 입었습니다.".format(self.name, damage))
        self.hp -= damage
        print("{0} : 현재 체력은 {1} 입니다.".format(self.name, self.hp))
        if self.hp <= 0:
            print("{0} : 파괴되었습니다.".format(self.name))

# 파이어뱃 : 공격 유닛, 화염방사기.
firebat1 = AttackUnit("파이어뱃", 50, 16)
firebat1.attack("5시")
# 파이어뱃 : 5시 방향으로 적군을 공격 합니다. [공격력 16]

# 공격 2번 받는다고 가정
firebat1.damaged(25)  # damage 아님. damage를 쓰면 위의 Unit의 damage랑 겹쳐서 안됨.
# 파이어뱃 : 25 데미지를 입었습니다.
# 파이어뱃 : 현재 체력은 25 입니다.
firebat1.damaged(25)
# 파이어뱃 : 25 데미지를 입었습니다.
# 파이어뱃 : 현재 체력은 0 입니다.
# 파이어뱃 : 파괴되었습니다.




