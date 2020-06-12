# BitReversal_Test_2
Bit reversal algorithm

This is a bit reversal algorithm that I found on dsp.stackexchange.com . The algorithm was described in an answer but not coded.
This is my attempt to code it in Java. It is not a reshuffling of indices. It computes the bit reversed values starting with 0 at
location 0 in an array that must be 2^n in length.

If length N is 8, the iterations are as follows.
Iteration 0: data[0] is 0, set data[1] = data[0] + N/2 .
Iteration 1: use results from iteration 0, set data[2] = data[0] + N/4, set data[3] = data[1] + N/4 .
Iteration 2: use results from iteration 1, set data[4] = data[0] + N/8, set data[5] = data[1] + N/8, set data[6] = data[2] + N/8,
set data[7] = data[3] + N/8 .
