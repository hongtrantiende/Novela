package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc6  reason: default package */
/* loaded from: classes.dex */
public final class rc6 {
    public static final ox9 g = new ox9(27);
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final Set f;

    public rc6(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet;
        this.f = set;
    }

    public final int a(up3 up3Var) {
        me6 e = zve.e(up3Var);
        synchronized (this) {
            Integer num = (Integer) this.b.get(e);
            if (num != null) {
                int intValue = num.intValue();
                this.e.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % re6.c;
                if (i == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (i + 1) % re6.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(e, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(zx zxVar) {
        Object d = ez4.a.d(this.a, ue6.b, a82.j(this.d, "appWidgetLayout-"), new db(this, null, 26), zxVar);
        if (d == n82.a) {
            return d;
        }
        return pvc.a;
    }
}
