# Created by Jenny Trac
# Created on Oct 16 2017
# Modified with "for" loop on Oct 20 2017
# This program calculates the factorial of the user's input
# ex. 3! = 3*2*1 = 6

import ui

counter = 1

def calculate_touch_up_inside(sender):
    # calculates factorial of user's input
    
    counter = 1
    
    # input
    user_input = int(view['user_input_textfield'].text)
    
    # process
    if (user_input <= 0):
        view['answer_label'].text = "Not an option."
        
    elif (user_input > 0):
        answer = 1
        for counter in range(1, user_input + 1):
            answer = answer * counter
        
        # output
        view['answer_label'].text = str(answer)
    

view = ui.load_view()
view.present('sheet')
