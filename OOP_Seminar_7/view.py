import check as ch


def hello():
    print("Добро пожаловать в записную книжку")


def bye():
    print("До свидания")


def notes_menu(number: str = ""):
    print("Выберите действие(введите цифру от 1 до 6:\n"
          "1 - прочитать все записи \n"
          "2 - прочитать запись\n"
          "3 - создать запись \n"


          "2 - отредактировать запись \n"
          "4 - удалить запись \n"
          "6 - выход \n")
    return ch.check_menu(number, 7)


def user_input_id() -> None:
    '''
    Запрашивает у пользователя ID
    '''
    id = str(input("Введите ID записи: "))
    return id


def create() -> list:
    '''
    Функция добавляет новую запись.
    '''
    note = []
    # написать метод с присваением id
    heading = ch.check_alpha('Заголовок: ')
    heading = heading.capitalize()
    note.append(heading)
    note.append(' ')
    text = ch.check_alpha('Текст: ')
    text = text.capitalize()
    note.append(text)
    print('Записка добавлена')
    return ''.join(note)


# def update(note: str = '') -> str:
#     '''
#     Функция перезаписывает новые данные поверх имеющейся записи
#     '''
#     print('Введите новые данные: ')
#     return ch.record_length(note)
