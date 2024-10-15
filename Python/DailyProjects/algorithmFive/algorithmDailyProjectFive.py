from pathlib import Path
path = Path(__file__).parent
path2 = path / 'numbers.txt'

with path2.open('r') as file:
    line1 = file.read()
    line = line1.split("\n")
    list_int = []
    for element in line:
        list_int.append(int(element))
    print(max(list_int))