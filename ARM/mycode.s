.global _start
.global add
.global subtract
.global multiply
.global divide

add: 
    ADD R0, R0, R1     // Add R0 and R1, store result in R0
    BX LR              // Return to caller
    
subtract:
    SUB R0, R0, R1     // Subtract R1 from R0, store result in R0
    BX LR              // Return to caller

multiply:
    MUL R0, R0, R1     // Multiply R0 and R1, store result in R0
    BX LR              // Return to caller

divide:
    CMP R1, #0         // Compare R1 with 0
    BEQ div_by_zero    // Branch to div_by_zero if R1 is 0
    SDIV R0, R0, R1    // Divide R0 by R1, store result in R0
    BX LR              // Return to caller
    
div_by_zero: 
    MOV R0, #-1        // Return -1 to indicate division by zero
    BX LR              // Return to caller

    // start/main function to call on operation functions
_start:
    // Initialize values for all the operations
    MOV R0, #5    // Load value 5 into R0
    MOV R1, #3    // Load value 3 into R1

    BL add        // calls add func
    BL subtract   // calls sub func
    BL multiply   // calls mult func
    BL divide     // calls div func

    MOV R7, #1
    SVC 0
