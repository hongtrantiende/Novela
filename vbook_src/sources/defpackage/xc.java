package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc  reason: default package */
/* loaded from: classes.dex */
public final class xc implements wc {
    public static volatile xc c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public xc(AppMeasurementSdk appMeasurementSdk) {
        am8.s(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!gde.c.contains(str) && !gde.b.contains(str2)) {
            mm9 mm9Var = gde.d;
            int i = mm9Var.d;
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                boolean containsKey = bundle.containsKey((String) mm9Var.get(i3));
                i3++;
                if (containsKey) {
                    return;
                }
            }
            if ("_cmp".equals(str2)) {
                if (!gde.c.contains(str)) {
                    mm9 mm9Var2 = gde.d;
                    int i4 = mm9Var2.d;
                    while (i2 < i4) {
                        boolean containsKey2 = bundle.containsKey((String) mm9Var2.get(i2));
                        i2++;
                        if (containsKey2) {
                            return;
                        }
                    }
                    int hashCode = str.hashCode();
                    if (hashCode != 101200) {
                        if (hashCode != 101230) {
                            if (hashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                            } else {
                                return;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                        } else {
                            return;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    public final lh9 b(String str, s6f s6fVar) {
        gn9 gn9Var;
        if (!gde.c.contains(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (equals) {
                    gn9Var = new rwa(appMeasurementSdk, s6fVar);
                } else if ("clx".equals(str)) {
                    gn9Var = new k57(appMeasurementSdk, s6fVar);
                } else {
                    gn9Var = null;
                }
                if (gn9Var != null) {
                    concurrentHashMap.put(str, gn9Var);
                    return new lh9(15);
                }
            }
        }
        return null;
    }
}
