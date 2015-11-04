# Challenge #213 Cellular Automata: Rule 90

Attempt at [Reddit DailyProgrammer Challenge #213 Cellular Automata: Rule 90](https://www.reddit.com/r/dailyprogrammer/comments/3jz8tt/20150907_challenge_213_easy_cellular_automata/). 

Excerpt from the challenge description:

> The subject rule for this challenge, Rule 90, is one of the simplest, a simple neighbor XOR. That is, in a 1 dimensional CA system (e.g. a line), the next state for the cell in the middle of 3 is simply the result of the XOR of its left and right neighbors. E.g. "000" becomes "1" "0" in the next state, "100" becomes "1" in the next state and so on. 
> 
> Input Description
> 
> You'll be given an input line as a series of 0s and 1s. Example:
> 
> 1101010
> 
> Output Description
> 
> Your program should emit the states of the celular automata for 25 steps. Example from above, in this case I replaced 0 with a blank and a 1 with an X:
> 
> xx x x

> xx    x

> xxx  x

> x xxx x

>   x x

>  x   x

I used clojure's [core.match library](https://github.com/clojure/core.match) for the XOR.  

## Usage



## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
