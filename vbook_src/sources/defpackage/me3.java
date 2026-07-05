package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me3  reason: default package */
/* loaded from: classes.dex */
public final class me3 implements l1e {
    public ArrayList a;

    public ArrayList a() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            Object remove = arrayList2.remove(arrayList2.size() - 1);
            remove.getClass();
            arrayList = (ArrayList) remove;
        }
        arrayList.clear();
        return arrayList;
    }

    @Override // defpackage.l1e
    public l1e zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.a.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw nq2.G(e, "me3", str);
        }
    }
}
