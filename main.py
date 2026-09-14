from flask import Flask
app = Flask("__main__")
@app.route("/")
def print_hi():
    return(f'Hello world!')
if __name__ == '__main__':
    app.run()