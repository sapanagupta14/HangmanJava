package com.hangman.players;

import com.hangman.Player;

import java.util.List;

public class YourPlayer implements Player {
    @Override
    public char GetGuess(List<Character> clue) {
        return 'a';
    }
}