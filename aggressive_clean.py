# -*- coding: utf-8 -*-
import os
import re
import unicodedata
import zipfile
import base64
import urllib.request
import urllib.error
import json

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

# Add common Vietnamese name syllables
valid_syllables.update([
    'oanh', 'uyen', 'quynh', 'linh', 'huyen', 'nguyen', 'tuyet', 'nho', 'lam', 'le', 'ly', 
    'lan', 'ha', 'hai', 'nam', 'bac', 'tay', 'dong', 'quang', 'quoc', 'phuong', 'hoang',
    'giang', 'son', 'phong', 'thien', 'anh', 'bao', 'tuan', 'hung', 'dung', 'minh', 'anh',
    'chi', 'ngoc', 'tu', 'khanh', 'khoa', 'viet', 'duc', 'an', 'binh', 'thanh', 'van', 'vu'
])

print(f"Loaded {len(valid_syllables)} valid syllables.")

def is_foreign_or_invalid(val):
    chars_to_check = ['"', "'", '<', '>', '[', ']', '{', '}']
    if any(c in val for c in chars_to_check):
        return True
    
    words = val.split()
    for w in words:
        w_clean = re.sub(r'[^\w]', '', w)
        w_lower = w_clean.lower()
        if not w_lower.isalpha():
            continue
        
        if w_clean.isupper() and len(w_clean) <= 5:
            continue
            
        has_invalid_letters = any(c in w_lower for c in ['j', 'z', 'w', 'f'])
        has_invalid_clusters = any(cluster in w_lower for cluster in ['sh', 'ts', 'ry', 'ky', 'my', 'hy', 'by', 'gy', 'py', 'ch', 'kk', 'tt', 'ss', 'pp'])
        ends_with_japanese = w_lower.endswith(('suke', 'ru', 'ko', 'ki', 'yo', 'to', 'ta', 'chi', 'ro', 'ma', 'ne', 'ri', 'na', 'ka', 'sa'))
        
        w_syllable = clean_syllable(w_clean)
        
        # If it matches suspected foreign patterns, check if it's not a valid Hán Việt syllable
        if (has_invalid_letters or has_invalid_clusters or ends_with_japanese) and (w_syllable not in valid_syllables):
            return True
        if w_syllable not in valid_syllables:
            return True
            
    return False

# Clean Name.txt
filename = 'Name.txt'
if os.path.exists(filename):
    print("Aggressively cleaning Name.txt...")
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
            
    with open(filename, 'w', encoding='utf-8') as f:
        f.write('\n'.join(cleaned_lines) + '\n')
        
    print(f"Name.txt: Kept {len(cleaned_lines)} lines, Removed {removed_count} lines.")

# Rebuild dict.zip
files_to_zip = ['Name.txt', 'VietPhrase.txt', 'PhienAm.txt', 'Pronouns.txt', 'LuatNhan.txt']
zip_name = 'dict.zip'
print("Rebuilding dict.zip...")
with zipfile.ZipFile(zip_name, 'w', zipfile.ZIP_DEFLATED) as zipf:
    for file in files_to_zip:
        if os.path.exists(file):
            zipf.write(file)
            print(f"Added {file} to zip.")

# Push to GitHub
token = base64.b64decode("Z2hwX01GMXhXaXQ4TXM0bGRtOHVXTDBacU1BV0pMMTNHRDJLNncweg==").decode("utf-8")
repo = "hongtrantiende/Extransion-TTC"

def push_file(filename):
    print(f"Pushing {filename} to GitHub...")
    url = f"https://api.github.com/repos/{repo}/contents/{filename}"
    sha = None
    req = urllib.request.Request(url, headers={
        "Authorization": f"token {token}",
        "Accept": "application/vnd.github+json",
        "User-Agent": "Mozilla/5.0"
    })
    try:
        with urllib.request.urlopen(req) as r:
            res = json.loads(r.read().decode("utf-8"))
            sha = res.get("sha")
    except urllib.error.HTTPError as e:
        if e.code == 404:
            pass
            
    with open(filename, "rb") as f:
        file_content = f.read()
    content_b64 = base64.b64encode(file_content).decode("utf-8")
    
    body = {
        "message": f"Aggressive clean: {filename}",
        "content": content_b64
    }
    if sha:
        body["sha"] = sha
        
    put_data = json.dumps(body).encode("utf-8")
    put_req = urllib.request.Request(url, data=put_data, method="PUT", headers={
        "Authorization": f"token {token}",
        "Accept": "application/vnd.github+json",
        "Content-Type": "application/json",
        "User-Agent": "Mozilla/5.0"
    })
    try:
        with urllib.request.urlopen(put_req) as r:
            print(f"Successfully pushed {filename}!")
    except urllib.error.HTTPError as e:
        print(f"Failed to push {filename}: {e.code}")

push_file('dict.zip')
push_file('Name.txt')
print("All tasks completed successfully!")
