SALARY_RAISE_FACTOR = 0.05
STATE_CODE_MAP = {'WA': 'Washington', 'TX': 'Texas'}
# 아래의 rec은 매개변수=인자, 인수, argument. 함수 불러서 쓸때 입력할 값 == 변수같은거.
# 여기에 아래의 for문에서 보면, rec값에 input_data를 넣어줌
def update_employee_record(rec):  # rec 라는 이름의 매개변수. 매개변수 rec은 딕셔너리를 가정함. <- 책 내용, 개소리
    old_sal = rec['salary']  # list하곤 전혀 상관 없이, key값을 가져오려면 [ ] 대괄호를 사용해 줘야 함. + 아래 dic안에 'salary'가 되어있으니 여기서도 ' ' 붙여서 써줘야 함.
    new_sal = old_sal * (1 + SALARY_RAISE_FACTOR)  # old_sal = 10만 new_sal = 10만 5천
    rec['salary'] = new_sal  # 10만 5천으로 바뀜
    state_code = rec['state_code']  # WA
    rec['state_name'] = STATE_CODE_MAP[state_code]  #  state_name이라는 key를 새로 만들어서 워싱턴을 만들겠다. 이 작업이 update_employee_record 함수의 일이다.
# update_employee_record라는 이름의 함수.
# 처음에 수잔꺼 함.

input_data = [
    {'employee_name': 'Susan', 'salary': 100000.0, 'state_code': 'WA'},
    {'employee_name': 'Ellen', 'salary': 75000.0, 'state_code': 'TX'},
]

for rec in input_data:
    update_employee_record(rec)  # 요 rec은 안써줘도 되지만, 보기좋게, 같은거라 써줌.
    name = rec['employee_name']  # 수잔 먼저. 수잔
    salary = rec['salary']  # 10만 5천
    state = rec['state_name']  # update에서 스테이트네임 추가. => Washington
    print(name + ' now lives in ' + state)
    print('   and makes $' + str(salary))

# 2회 반복. input_data에 해당하는 데이터가 2개. => 딕셔너리 안에 dic 2개 들어있음.
# 함수를 호출하면서 불어오는 값 : 인자, 인수, argument (매개변수?)


