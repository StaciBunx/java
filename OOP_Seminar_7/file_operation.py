global filepath

filepath = 'notes.txt'


def search_note_by_id(id: str) -> str:
    '''
    Ищет запись в файле
    '''
    with open(filepath, 'r', encoding='utf-8') as f:
        for line in f:
            if id in line:
                return line


def save_note(note: list):
    """
    """
    with open(filepath, 'a', encoding='utf-8') as data:
        data.write(f"\n{note}")



def update_note(note, new_note):
    """
    Редактирует контакт
    """
    f = open(filepath, 'r', encoding='utf-8')
    lines = f.readlines()
    f.close()
    f = open(filepath, 'w', encoding='utf-8')
    for line in lines:
        if line != note:
            f.write(line)
        elif line == note:
            f.write(f'{new_note}\n')
    f.close()




def del_phone_number(contact):
    """
    Удаляет контакт
    """
    f = open(filepath, 'r', encoding='utf-8')
    lines = f.readlines()
    f.close()
    f = open(filepath, 'w', encoding='utf-8')
    for line in lines:
        if line != contact:
            f.write(line)
    f.close()
