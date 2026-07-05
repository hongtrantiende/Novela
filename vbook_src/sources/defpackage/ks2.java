package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ks2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ks2 implements or6, h12 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ks2(cd cdVar, int i, long j, long j2) {
        this.c = cdVar;
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.h12
    public void accept(Object obj) {
        boolean z;
        q8b q8bVar = (q8b) this.c;
        wd2 wd2Var = (wd2) obj;
        q8bVar.h.getClass();
        byte[] n = p40.n(wd2Var.a, wd2Var.c);
        km8 km8Var = q8bVar.c;
        km8Var.getClass();
        km8Var.K(n, n.length);
        q8bVar.a.e(n.length, km8Var);
        long j = wd2Var.b;
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        vq4 vq4Var = q8bVar.h;
        long j2 = this.a;
        if (i == 0) {
            if (vq4Var.t == Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
        } else {
            long j3 = vq4Var.t;
            if (j3 == Long.MAX_VALUE) {
                j2 += j;
            } else {
                j2 = j + j3;
            }
        }
        q8bVar.a.a(j2, this.b | 1, n.length, 0, null);
    }

    @Override // defpackage.or6
    public void invoke(Object obj) {
        long longValue;
        cd cdVar = (cd) this.c;
        l57 l57Var = (l57) ((dd) obj);
        HashMap hashMap = l57Var.h;
        HashMap hashMap2 = l57Var.i;
        e67 e67Var = cdVar.d;
        if (e67Var != null) {
            String c = l57Var.c.c(cdVar.b, e67Var);
            Long l = (Long) hashMap2.get(c);
            Long l2 = (Long) hashMap.get(c);
            long j = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap2.put(c, Long.valueOf(longValue + this.a));
            if (l2 != null) {
                j = l2.longValue();
            }
            hashMap.put(c, Long.valueOf(j + this.b));
        }
    }

    public /* synthetic */ ks2(q8b q8bVar, long j, int i) {
        this.c = q8bVar;
        this.a = j;
        this.b = i;
    }
}
