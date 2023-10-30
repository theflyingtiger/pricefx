def regex = ~/https?:\/\/.*/

def httpUrl = 'http://www.example.com/'
def ftpUrl = 'ftp://ftp.example.com/'

assert httpUrl ==~ regex
assert ! (ftpUrl ==~ regex)
