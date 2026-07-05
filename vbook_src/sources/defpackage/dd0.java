package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd0  reason: default package */
/* loaded from: classes.dex */
public final class dd0 {
    public final xj1 a;
    public final HashMap b;

    public dd0(xj1 xj1Var, HashMap hashMap) {
        this.a = xj1Var;
        this.b = hashMap;
    }

    public final long a(c69 c69Var, long j, int i) {
        long j2;
        long h = j - this.a.h();
        ed0 ed0Var = (ed0) this.b.get(c69Var);
        long j3 = ed0Var.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), h), ed0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dd0) {
                dd0 dd0Var = (dd0) obj;
                if (this.a.equals(dd0Var.a) && this.b.equals(dd0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
