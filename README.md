# Magician-vs-Chef
CodeChef Difficulty 1088 Problem

Gold Coin Game (Byteland Fair)
Chef visits a fair in Byteland and meets a magician with a game challenge. There are N boxes (numbered 1 through N) and one gold coin. The magician places the coin in box X and then performs S swaps between pairs of boxes. Chef must determine which box contains the coin after all the swaps to win the game.

Problem Statement
At the beginning:

The gold coin is in box X.

The magician then performs S swaps:

In each swap, the contents of box A and box B are exchanged.

Chef wins if he correctly identifies the final position of the coin.

Input
The first line contains a single integer T — the number of test cases.

Each test case consists of:

A line with three integers: N, X, and S

N: Total number of boxes

X: Initial position of the gold coin

S: Number of swaps

Followed by S lines, each containing two integers A and B representing a swap between box A and box B

Output
For each test case, output a single line containing one integer — the number of the box containing the gold coin after all swaps are performed.
