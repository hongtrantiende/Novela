package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qc7  reason: default package */
/* loaded from: classes.dex */
public final class qc7 extends mq7 implements wx1, fd6 {
    public LinkedHashMap K;

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        boolean z;
        int i;
        float f = ((rg3) nye.q(this, jz5.c)).a;
        if (f < nae.e) {
            f = 0.0f;
        }
        mw8 M = w27Var.M(j);
        int i2 = 0;
        if (this.J && !Float.isNaN(f) && rg3.a(f, nae.e) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!Float.isNaN(f)) {
            i = e37Var.X0(f);
        } else {
            i = 0;
        }
        int i3 = M.a;
        if (z) {
            i3 = Math.max(i3, i);
        }
        int i4 = M.b;
        if (z) {
            i4 = Math.max(i4, i);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.K;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.K = linkedHashMap;
            }
            m5d m5dVar = jz5.b;
            int round = Math.round((i - M.a) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(m5dVar, Integer.valueOf(round));
            n95 n95Var = jz5.a;
            int round2 = Math.round((i - M.b) / 2.0f);
            if (round2 >= 0) {
                i2 = round2;
            }
            linkedHashMap.put(n95Var, Integer.valueOf(i2));
        }
        Map map = this.K;
        if (map == null) {
            map = ls3.a;
        }
        return e37Var.q0(i3, i4, map, new i52(i3, M, i4));
    }
}
