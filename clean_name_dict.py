# -*- coding: utf-8 -*-
import os
import re
import unicodedata

def clean_syllable(text):
    normalized = unicodedata.normalize('NFKD', text)
    clean = normalized.encode('ASCII', 'ignore').decode('utf-8')
    return clean.lower()

# 1. Load valid syllables from PhienAm.txt
valid_syllables = set()
if os.path.exists('PhienAm.txt'):
    with open('PhienAm.txt', 'r', encoding='utf-8') as f:
        for line in f:
            if '=' in line:
                val = line.strip().split('=', 1)[1]
                parts = val.split('|')
                for part in parts:
                    for word in part.split():
                        clean_word = clean_syllable(word)
                        if clean_word.isalpha():
                            valid_syllables.add(clean_word)

# Add common Vietnamese name syllables that might not be in PhienAm
valid_syllables.update([
    'oanh', 'uyen', 'quynh', 'linh', 'huyen', 'nguyen', 'tuyet', 'nho', 'lam', 'le', 'ly', 
    'lan', 'ha', 'hai', 'nam', 'bac', 'tay', 'dong', 'quang', 'quoc', 'phuong', 'hoang',
    'giang', 'son', 'phong', 'thien', 'anh', 'bao', 'tuan', 'hung', 'dung', 'minh', 'anh',
    'chi', 'ngoc', 'tu', 'khanh', 'khoa', 'viet', 'duc', 'an', 'binh', 'thanh', 'van', 'vu'
])

print(f"Loaded {len(valid_syllables)} valid Han Viet syllables.")

def is_foreign_or_invalid(val):
    # Check for quotes, HTML tags, or braces
    chars_to_check = ['"', "'", '<', '>', '[', ']', '{', '}']
    if any(c in val for c in chars_to_check):
        return True
    
    words = val.split()
    for w in words:
        w_clean = re.sub(r'[^\w]', '', w)
        w_lower = w_clean.lower()
        if not w_lower.isalpha():
            continue
        
        # If it's a known acronym (pure uppercase, e.g. ATM, FPX, Dan), skip
        if w_clean.isupper() and len(w_clean) <= 5:
            continue
            
        # Detect Japanese/English/Romaji spelling
        has_invalid_letters = any(c in w_lower for c in ['j', 'z', 'w', 'f'])
        has_invalid_clusters = any(cluster in w_lower for cluster in ['sh', 'ts', 'ry', 'ky', 'my', 'hy', 'by', 'gy', 'py'])
        has_invalid_k = re.search(r'k[aouoôơư]', w_lower) is not None
        
        if has_invalid_letters or has_invalid_clusters or has_invalid_k:
            return True
            
        # Check against valid Hán Việt / Vietnamese syllables
        w_syllable = clean_syllable(w_clean)
        if w_syllable not in valid_syllables:
            return True
            
    return False

# Clean Name.txt
filename = 'Name.txt'
if os.path.exists(filename):
    print(f'Cleaning {filename}...')
    cleaned_lines = []
    removed_count = 0
    
    with open(filename, 'r', encoding='utf-8') as f:
        for line in f:
            line_str = line.strip()
            if not line_str or '=' not in line_str:
                continue
                
            key, val = line_str.split('=', 1)
            key = key.strip().strip('"').strip("'")
            val = val.strip().strip('"').strip("'")
            
            if not key or not val:
                removed_count += 1
                continue
                
            if is_foreign_or_invalid(val):
                removed_count += 1
                continue
                
            cleaned_lines.append(f'{key}={val}')
            
    # Write back clean lines
    with open(filename, 'w', encoding='utf-8') as f:
        f.write('\n'.join(cleaned_lines) + '\n')
        
    print(f'{filename}: Kept {len(cleaned_lines)} lines, Removed {removed_count} lines.')
else:
    print(f'{filename} does not exist!')
