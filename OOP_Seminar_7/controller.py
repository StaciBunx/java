import view as v
import print as p
import file_operation as f


def notebook():
    v.hello()
    while True:
        command = v.notes_menu()
        if command == 1:
            p.print_all_notes(f.filepath)
        elif command == 2:
            p.print_note(f.search_note_by_id(v.user_input_id()))
        # elif command == 3:
