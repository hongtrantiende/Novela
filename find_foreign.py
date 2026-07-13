# -*- coding: utf-8 -*-
import os
import re

if os.path.exists("suspected.txt"):
    os.remove("suspected.txt")

with open('Name.txt', 'r', encoding='utf-8') as f:
    lines = f.readlines()

print(f"Total lines in Name.txt: {len(lines)}")
print("Sample lines that might look English/Japanese:")

count = 0
for line in lines:
    if '=' in line:
        key, val = line.strip().split('=', 1)
        val_clean = re.sub(r'[^\w\s]', '', val)
        
        # Check if the translation value contains English/Romaji-like words
        # e.g., words containing j, z, w, f, or repeating vowels, or ending in typical Japanese endings like -suke, -ru, -ko, -ki, -yo, -to
        val_lower = val_clean.lower()
        words = val_lower.split()
        for w in words:
            # Typical Japanese names or English words
            if any(cluster in w for cluster in ['sh', 'ts', 'ry', 'ky', 'my', 'hy', 'by', 'gy', 'py', 'ch', 'kk', 'tt', 'ss', 'pp']) or \
               any(c in w for c in ['j', 'z', 'w', 'f']) or \
               w.endswith(('suke', 'ru', 'ko', 'ki', 'yo', 'to', 'ta', 'chi', 'ro', 'ma', 'ne', 'ri', 'na', 'ka', 'sa')):
                with open("suspected.txt", "a", encoding="utf-8") as out:
                    out.write(f"{key} = {val}\n")
                count += 1
                break

print(f"Total suspected foreign lines: {count}")
