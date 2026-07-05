package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x47  reason: default package */
/* loaded from: classes.dex */
public final class x47 {
    public final List a;

    public x47(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                return;
            default:
                this.a = ks3.a;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [v4e, java.lang.Object] */
    public static x47 a(JSONArray jSONArray) {
        Object obj;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject == null) {
                    obj = new Object();
                } else {
                    String a = j4b.a(jSONObject.optString("federatedId"));
                    String a2 = j4b.a(jSONObject.optString("displayName"));
                    String a3 = j4b.a(jSONObject.optString("photoUrl"));
                    String a4 = j4b.a(jSONObject.optString("providerId"));
                    String a5 = j4b.a(jSONObject.optString("phoneNumber"));
                    String a6 = j4b.a(jSONObject.optString("email"));
                    ?? obj2 = new Object();
                    obj2.a = a;
                    obj2.b = a2;
                    obj2.c = a3;
                    obj2.d = a4;
                    obj2.e = null;
                    obj2.f = a5;
                    obj2.g = a6;
                    obj = obj2;
                }
                arrayList.add(obj);
            }
            return new x47(arrayList);
        }
        return new x47(new ArrayList());
    }

    public x47(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.a = Collections.unmodifiableList(arrayList);
        } else {
            this.a = Collections.EMPTY_LIST;
        }
    }
}
