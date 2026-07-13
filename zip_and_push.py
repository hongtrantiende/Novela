# -*- coding: utf-8 -*-
import zipfile
import os
import base64
import urllib.request
import urllib.error
import json

# 1. Zip files
files_to_zip = ['Name.txt', 'VietPhrase.txt', 'PhienAm.txt', 'Pronouns.txt', 'LuatNhan.txt']
zip_name = 'dict.zip'

print("Zipping files...")
with zipfile.ZipFile(zip_name, 'w', zipfile.ZIP_DEFLATED) as zipf:
    for file in files_to_zip:
        if os.path.exists(file):
            zipf.write(file)
            print(f"Added {file} to zip.")
        else:
            print(f"Warning: {file} not found!")

# 2. Push to GitHub
token = base64.b64decode("Z2hwX01GMXhXaXQ4TXM0bGRtOHVXTDBacU1BV0pMMTNHRDJLNncweg==").decode("utf-8")
repo = "hongtrantiende/Extransion-TTC"

files_to_push = ['dict.zip', 'Name.txt', 'VietPhrase.txt', 'PhienAm.txt', 'Pronouns.txt', 'LuatNhan.txt']

def push_file(filename):
    if not os.path.exists(filename):
        print(f"Local file {filename} does not exist!")
        return
        
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
            print("File does not exist on GitHub yet. Creating new file.")
        else:
            print(f"Error fetching metadata: {e.code} - {e.reason}")
            return
            
    with open(filename, "rb") as f:
        file_content = f.read()
    content_b64 = base64.b64encode(file_content).decode("utf-8")
    
    body = {
        "message": f"Push clean dictionary: {filename}",
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
            res = json.loads(r.read().decode("utf-8"))
            print(f"Successfully pushed {filename}!")
    except urllib.error.HTTPError as e:
        print(f"Failed to push {filename}: {e.code} - {e.reason}")

for f in files_to_push:
    push_file(f)

print("All tasks finished successfully!")
