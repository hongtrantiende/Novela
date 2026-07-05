package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc0  reason: default package */
/* loaded from: classes.dex */
public final class tc0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void d(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public zda a(int i) {
        zda zdaVar = null;
        try {
            if (!a82.a(2, i)) {
                JSONObject m = ((mce) this.e).m();
                if (m != null) {
                    zda C = ((l97) this.c).C(m);
                    d(m, "Loaded cached settings: ");
                    ((mp8) this.d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!a82.a(3, i) && C.c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return C;
                        } catch (Exception e) {
                            e = e;
                            zdaVar = C;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return zdaVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public zda b() {
        return (zda) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15, types: [tc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [tc0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.ld0 r48, int r49) {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc0.c(ld0, int):void");
    }
}
