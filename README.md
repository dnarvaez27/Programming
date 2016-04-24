# BookBorders
##Problem B: Book Borders 
######Time limit: 2 s 
######Memory limit: 512 MiB

A book is being typeset using a fixed width font and a simple greedy algorithm to fill each line. The book contents is just a sequence of words, where each word contains one or more characters. Before typesetting, we choose a maximum line length and denote this value with m. Each line can be at most m characters long including the space characters between the words. The typesetting algorithm simply processes words one by one and prints each word with exactly one space character between two consecutive words on the same line. If printing the word on the current line would exceed the maximum line length m, a new line is started instead.

13 | 14 
--- | --- | ---
its.a.long... | its.a.long.way
way.to.the... | to.the.top.if.
top.if.you... | you.wanna.rock
wanna.rock.n. | n.roll........
roll..........|

*Text from the example input with maximum line lengths 13 and 14*

You are given a text to be typeset and are experimenting with different values of the maximum line length m. For a fixed m, the leading sentence is a sentence (a sequence of words separated with a single space character) formed by the first words of lines top to bottom. In the example above, when the sample text is typeset with the maximum line length 14, the leading sentence is “its to you n”. Given a text and two integers a and b, find the length of the leading sentence for every candidate maximum line length between a and b inclusive. The length of a sentence is the total number of characters it contains including the space characters.

#####**Input**
The first line contains the text to be typeset – a sequence of words separated by exactly one space character. Each word is a string consisting of one or more lowercase letters from the English alphabet. The second line contains two integers a and b – the edges of the interval we are interested in, as described above. It is guaranteed that 1 ≤ w ≤ a ≤ b ≤ z ≤ 500 000, where w is the length of the longest word in the text and z is the total number of characters in the text including the space characters.

#####**Output**
Output b − a + 1 lines – the k-th of those lines should contain a single integer – the total length of the leading sentence when the maximum line length is equal to a − 1 + k.

######**Example** 
**input**
its a long way to the top if you wanna rock n roll 
13 16 

**output**
22 
12 
12 
15
