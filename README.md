# The-Josephus-Problem
## The Problem:
There's 99 people standing in a circle, you can choose your position, and are participating in a game. 

The setup;
we give each person a number, in order, 1-100, person 1 is given 1 sword.

The rules;
Person 1 is to kill person 2, and then passes over the sword to the person alive after (so person 3 in this case). Last man standing wins.

The riddle;
Which position must you take to be the winner of the game?

## My Approach: 
I learnt a key skill from coding this: **Abstraction**.

Majority of the problem can be abstracted/thrown away and yet the problem remains the same.

"give each person a number" - completely unnecessary since we have indices in collections and/or we can just use an integer to represent a person.

"1 sword" - bun this too, we know the solution to this will be coded single threaded so we can remove the sword concept too since it's only purpose is to restrict order of killing - already achievable via inevitable iteration.

Remove the whole concept of anyone being alive or dead even. Just remove the "Person" from the collection when they die. Leaving the last man standing as the only person left in the collection.

In fact, we can completely get rid of the concept of a Person too. Leaving a realisation that the coded solution to this problem is actually reducable to something much more barebones.
