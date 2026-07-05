package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mbe  reason: default package */
/* loaded from: classes.dex */
public abstract class mbe {
    public static final kj a = new kj("JSONParser", new String[0]);

    /* JADX WARN: Type inference failed for: r0v0, types: [yz, jla] */
    public static yz a(JSONObject jSONObject) {
        ?? jlaVar = new jla(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            jlaVar.put(next, obj);
        }
        return jlaVar;
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l97] */
    public static Map c(String str) {
        am8.p(str);
        gqe gqeVar = new gqe('.');
        ?? obj = new Object();
        obj.a = gqeVar;
        List H = new l97(obj).H(str);
        if (H.size() < 2) {
            a.g("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        yz d = d(new String(jye.k((String) H.get(1)), StandardCharsets.UTF_8));
        if (d == null) {
            return new HashMap();
        }
        return d;
    }

    public static yz d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject != JSONObject.NULL) {
                    return a(jSONObject);
                }
                return null;
            } catch (Exception e) {
                Log.d("JSONParser", "Failed to parse JSONObject into Map.");
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
