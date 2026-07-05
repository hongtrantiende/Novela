package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k98  reason: default package */
/* loaded from: classes.dex */
public final class k98 implements p0b {
    public static final LinkedHashSet e = new LinkedHashSet();
    public static final d38 f = new d38(5);
    public final pe4 a;
    public final lu4 b;
    public final v85 c;
    public final mfb d;

    public k98(pe4 pe4Var, v85 v85Var) {
        j35 j35Var = new j35(22);
        pe4Var.getClass();
        this.a = pe4Var;
        this.b = j35Var;
        this.c = v85Var;
        this.d = new mfb(new j98(this, 1));
    }

    @Override // defpackage.p0b
    public final le4 a() {
        String t = ((hn8) this.d.getValue()).a.t();
        synchronized (f) {
            LinkedHashSet linkedHashSet = e;
            if (!linkedHashSet.contains(t)) {
                linkedHashSet.add(t);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + t + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return new le4(this.a, (hn8) this.d.getValue(), (dz5) this.b.invoke((hn8) this.d.getValue(), this.a), new j98(this, 0));
    }
}
