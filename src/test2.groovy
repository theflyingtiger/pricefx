assert 6 in [1, 2, 6, 9]
assert !(3 in [1, 2, 6, 9])

def grades = ['Maths': 'A',
              'English': 'C',
              'Science': 'B'].asImmutable()

assert 'Science' in grades
assert !('French' in grades)
