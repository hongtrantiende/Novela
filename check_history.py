# -*- coding: utf-8 -*-
import base64
import urllib.request
import json

token = base64.b64decode("Z2hwX01GMXhXaXQ4TXM0bGRtOHVXTDBacU1BV0pMMTNHRDJLNncweg==").decode("utf-8")
repo = "hongtrantiende/Extransion-TTC"
sha = "d835110274b857a01165149b5e0b160c8c530a4b"
url = f"https://api.github.com/repos/{repo}/git/blobs/{sha}"

req = urllib.request.Request(url, headers={
    "Authorization": f"token {token}",
    "Accept": "application/vnd.github+json",
    "User-Agent": "Mozilla/5.0"
})

try:
    with urllib.request.urlopen(req) as r:
        resp = json.loads(r.read().decode("utf-8"))
        content_b64 = resp["content"].replace("\n", "").replace("\r", "")
        content = base64.b64decode(content_b64).decode("utf-8")
        print("Success! Decoded content length:", len(content))
        print("Content snippet:", content[:300])
except Exception as e:
    print("Error:", e)
