def check_alpha(name: str) -> str:
    '''Проверка на буквы (не допускает ввода пустой строки)'''
    while True:
        try:
            a = input(name)
            if (a.isalpha() and 0 < len(a) < 250):
                return a
            else:
                print(
                    'Вы ввели символы отличные от букв или слишком большое количество символов ')
        except ValueError:
            print('Неверно! Повторите ввод')


def record_length(length: str) -> str:
    '''Проверка длины вводимой строки и тут же проверка на пустую строку'''
    while True:
        try:
            l = input(length)
            if len(l) == 0:
                print('Вы ничего не ввели!')
            elif len(l) < 250:
                return l
            else:
                print('Вы ввели слишком много символов')
        except ValueError:
            print('Неверно! Повторите ввод!')


def check_phone_menu(num: str, m) -> int:

    while True:
        try:
            n = int(input(num))
            if 0 < int(n) < m:
                return n
            else:
                print(
                    f'Неверно! Введите число от 1 до {m-1} в соответствии с пунктами меню!')
        except ValueError:
            print(
                f'Неверно!Введите число от 1 до {m-1} в соответствии с пунктами меню!')
