#define MOJO_LEDS = 140
#define IO_LEDS_A = 141
#define IO_LEDS_B = 142
#define IO_LEDS_C = 143

loop:
  MOVRI   R1, 127
  WRITERI R1,MOJO_LEDS
  WAIT 20
  WRITERI R1,IO_LEDS_A
  WAIT 20
  WRITERI R1,IO_LEDS_B
  WAIT 20
  WRITERI R1,IO_LEDS_C
  WAIT 20
  MOVRI   R1, 0
  WRITERI R1,MOJO_LEDS
  WAIT 20
  WRITERI R1,IO_LEDS_A
  WAIT 20
  WRITERI R1,IO_LEDS_B
  WAIT 20
  WRITERI R1,IO_LEDS_C
  WAIT 20
  PRINT This_is_a_longish_string_designed_to_test_out_the_Kludge_program 
  WAIT 20
  JMP loop
