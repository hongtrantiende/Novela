package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: np9  reason: default package */
/* loaded from: classes3.dex */
public final class np9 extends fdd {
    public int C;
    public boolean D;
    public final iya E;
    public final jp9 c;
    public final cza d;
    public final HashMap e;
    public final int f;

    public np9(m0d m0dVar, jp9 jp9Var) {
        Object value;
        this.c = jp9Var;
        cza a = dza.a(new mp9(ks3.a, true, false, false));
        this.d = a;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.f = 4;
        this.C = 1;
        if (this.D) {
            return;
        }
        this.C = 1;
        hashMap.clear();
        do {
            value = a.getValue();
        } while (!a.l(value, mp9.a((mp9) value, true, false, 14)));
        int i = this.C;
        iya iyaVar = this.E;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        hk1 a2 = jdd.a(this);
        sw2 sw2Var = ab3.a;
        this.E = z87.v(a2, ru2.c, null, new pf(this, i, (m42) null, 12), 2);
    }
}
