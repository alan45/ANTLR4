loop:
#define TEST =  10
  MOVRI   R1, 127
  WRITERI R1,140
  WAIT 20
  WRITERI R1, 141
  WAIT 20
  WRITERI R1,142
  WAIT 20
  WRITERI R1,143
  WAIT 20
  MOVRI   R1, 0
  WRITERI R1,140
  WAIT 20
  WRITERI R1,141
  WAIT 20
  WRITERI R1,142
  WAIT 20
  WRITERI R1,143
  WAIT 20
  PRINT "This_is_a_longish_string_designed_to_test_out_the_Kludge_program" 
  WAIT 20
  JMP loop
