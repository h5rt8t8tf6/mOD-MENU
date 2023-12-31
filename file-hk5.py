import tkinter as tk

class MainApp(tk.Tk):
    def __init__(self):
        super().__init__()
        self.geometry("400x400")

        self.create_widgets()

    def create_widgets(self):
        self.my_label = tk.Label(self, text="Hello, world!")
        self.my_label.pack(pady=20)

        self.my_button = tk.Button(self, text="Click me!", command=self.button_click)
        self.my_button.pack()

    def button_click(self):
        self.my_label.config(text="Hello, Tkinter!")

if __name__ == "__main__":
    app = MainApp()
    app.mainloop()