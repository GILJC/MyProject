import pickle

profile_file = open("profile.pickle", "wb")  # w-> 쓰기 위해서 w를 쓰고, b-> 바이너리 -> 피클(pickle)을 쓰기 위해선 항상 바이너리 타입을 적용을 해줘야 함
profile = {"이름":"박명수", "나이":30, "취미":["축구", "골프", "코딩"]}
print(profile)
pickle.dump(profile, profile_file)  # dump -> profile 에 있는 정보를 profile_file에 저장
profile_file.close()
# {'이름': '박명수', '나이': 30, '취미': ['축구', '골프', '코딩']}
# profile.pickle이라는 파일이 생기고, (인코딩이 안되어있어 그냥은 못보지만)
# 결론적으로 profile의 내용이 들어감

 
profile_file = open("profile.pickle", "rb")
profile = pickle.load(profile_file)  # profile_file 에 있는 정보를 profile 에 불러오기
print(profile)
profile_file.close()
# {'이름': '박명수', '나이': 30, '취미': ['축구', '골프', '코딩']}


#============================

# with
# 지금까지는 파일을 열고 쓰고 닫고의 작업을 했는데
# with를 쓰면 이 작업을 좀 더 편하게 할 수 있다.

with open("profile.pickle", "rb") as profile_file:  # profile.pickle파일을 열어서, profile_file이라는 변수로 저장을 해두고
    print(pickle.load(profile_file))  # 이 파일 내용을 피클 load를 통해서 출력을 함
#{'이름': '박명수', '나이': 30, '취미': ['축구', '골프', '코딩']}

# 이렇게만 하면 끝
# 따로 열얼던 파일을 close() 해줄 필요 없이,
# with문을 탈출하면서 자동으로 종료를 해줌.


with open("study.txt", "w", encoding="utf8") as study_file:
    study_file.write("파이썬을 열심히 공부하고 있어요")
# study.txt이라는 파일 안에 -> 파이썬을 열심히 공부하고 있어요
