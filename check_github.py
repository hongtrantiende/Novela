# -*- coding: utf-8 -*-
import base64
import urllib.request
import json

token = base64.b64decode("Z2hwX01GMXhXaXQ4TXM0bGRtOHVXTDBacU1BV0pMMTNHRDJLNncweg==").decode("utf-8")
repo = "hongtrantiende/Extransion-TTC"
url = f"https://api.github.com/repos/{repo}/contents/yckceo_sources.json"

req = urllib.request.Request(url, headers={
    "Authorization": f"token {token}",
    "Accept": "application/vnd.github+json",
    "User-Agent": "Mozilla/5.0"
})

try:
    with urllib.request.urlopen(req) as r:
        res = json.loads(r.read().decode("utf-8"))
        content = base64.b64decode(res["content"]).decode("utf-8")
        print("Content of yckceo_sources.json:")
        print(content)
except Exception as e:
    print("Error fetching file:", e)
