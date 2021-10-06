def convert_to_f(celsius_value):
    return celsius_value * 9.0 / 5 + 32

if __name__ == "__main__":  # 테스트형 코드는 이런식으로 집어넣으면 됨
    print(convert_to_f(45))