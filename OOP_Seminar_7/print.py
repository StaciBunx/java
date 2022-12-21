import file_operation as fileoper
import view


def print_all_notes(file) -> None:
    '''
    Команда 1 - распечатать все записки
    '''
    with open(file, encoding='utf-8') as file:
        for line in file:
            print(line, end='')
    file.close()


def print_note(line: str) -> None:
    '''
    Печатает запись
    '''
    print(line)
