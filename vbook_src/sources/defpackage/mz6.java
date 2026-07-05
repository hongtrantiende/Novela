package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz6  reason: default package */
/* loaded from: classes.dex */
public final class mz6 {
    public long a;
    public final Object b;
    public final Object c;

    public mz6(int i) {
        switch (i) {
            case 3:
                this.b = new fz0(2);
                this.c = new agd();
                this.a = 2147483647L;
                return;
            default:
                this.b = new b5d();
                this.c = new b5d();
                return;
        }
    }

    public static String b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static mz6 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new mz6(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new mz6(0L, str, (String) null);
    }

    public void a(long j, long j2) {
        ((b5d) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((b5d) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public void d(h97 h97Var, ml5 ml5Var, Map map, long j) {
        ju0 ju0Var = (ju0) this.c;
        long j2 = ju0Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ju0Var.c;
        if (j <= j2) {
            xj9 xj9Var = new xj9(ml5Var, map, j);
            Object put = linkedHashMap.put(h97Var, xj9Var);
            ju0Var.b = ju0Var.k(h97Var, xj9Var) + ju0Var.d();
            if (put != null) {
                ju0Var.b = ju0Var.d() - ju0Var.k(h97Var, put);
                ju0Var.c(h97Var, put, xj9Var);
            }
            ju0Var.m(ju0Var.a);
            return;
        }
        Object remove = linkedHashMap.remove(h97Var);
        if (remove != null) {
            ju0Var.b = ju0Var.d() - ju0Var.k(h97Var, remove);
            ju0Var.c(h97Var, remove, null);
        }
        ((jt1) this.b).o(h97Var, ml5Var, map, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List e() {
        ArrayList arrayList;
        z9e z9eVar = (z9e) this.c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.b;
        Cursor cursor = null;
        try {
            try {
                cursor = z9eVar.O0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        boolean z = false;
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        if (cursor.getLong(5) == 1) {
                            z = true;
                        }
                        long j3 = cursor.getLong(6);
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            gse gseVar = (gse) e6f.I0(jse.J(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            gseVar.n(string);
                            long j4 = cursor.getLong(2);
                            gseVar.b();
                            ((jse) gseVar.b).Q(j4);
                            gseVar.b();
                            ((jse) gseVar.b).t(j3);
                            arrayList2.add(new t9e(j, j2, z, (jse) gseVar.d()));
                        } catch (IOException e) {
                            ppe ppeVar = ((lte) z9eVar.a).f;
                            lte.m(ppeVar);
                            ppeVar.f.g(ppe.f0(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e2) {
            ppe ppeVar2 = ((lte) z9eVar.a).f;
            lte.m(ppeVar2);
            ppeVar2.f.g(ppe.f0(str), e2, "Data loss. Error querying raw events batch. appId");
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public mz6(z9e z9eVar, String str, long j) {
        this.c = z9eVar;
        am8.p(str);
        this.b = str;
        this.a = z9eVar.u0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ju0, java.lang.Object] */
    public mz6(long j, jt1 jt1Var) {
        this.a = j;
        this.b = jt1Var;
        ?? obj = new Object();
        obj.d = this;
        obj.c = new LinkedHashMap(0, 0.75f, true);
        obj.a = j;
        if (j > 0) {
            this.c = obj;
        } else {
            vs.m("maxSize <= 0");
            throw null;
        }
    }

    public mz6(z9e z9eVar, String str) {
        this.c = z9eVar;
        am8.p(str);
        this.b = str;
        this.a = -1L;
    }

    public mz6(long j, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
