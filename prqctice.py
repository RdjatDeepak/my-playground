Players_score1 = {
    "kolhi": 99,
    "rohit": 45,
    "Pandya": 30
}

Players_score2 = {
    "rohit": 100,
    "kolhi": 100,
    "Pandya": 89
}

def difference(score1, score2):
    diff_score = {}
    
    # Combine all player names from both dictionaries
    all_players = set(score1.keys()).union(set(score2.keys()))
    
    for player in all_players:
        player_score1 = score1.get(player, 0)
        player_score2 = score2.get(player, 0)
        diff = player_score1 - player_score2
        diff_score[player] = diff
        
    return diff_score

result = difference(Players_score1, Players_score2)
print(result)
