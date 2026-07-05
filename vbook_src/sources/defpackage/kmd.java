package defpackage;

import java.util.HashSet;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kmd  reason: default package */
/* loaded from: classes.dex */
public final class kmd {
    public final UUID a;
    public final jmd b;
    public final HashSet c;
    public final tf2 d;
    public final tf2 e;
    public final int f;
    public final int g;
    public final w02 h;
    public final long i;
    public final imd j;
    public final long k;
    public final int l;

    public kmd(UUID uuid, jmd jmdVar, HashSet hashSet, tf2 tf2Var, tf2 tf2Var2, int i, int i2, w02 w02Var, long j, imd imdVar, long j2, int i3) {
        tf2Var.getClass();
        tf2Var2.getClass();
        this.a = uuid;
        this.b = jmdVar;
        this.c = hashSet;
        this.d = tf2Var;
        this.e = tf2Var2;
        this.f = i;
        this.g = i2;
        this.h = w02Var;
        this.i = j;
        this.j = imdVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kmd.class.equals(obj.getClass())) {
            kmd kmdVar = (kmd) obj;
            if (this.f == kmdVar.f && this.g == kmdVar.g && this.a.equals(kmdVar.a) && this.b == kmdVar.b && c16.i(this.d, kmdVar.d) && this.h.equals(kmdVar.h) && this.i == kmdVar.i && c16.i(this.j, kmdVar.j) && this.k == kmdVar.k && this.l == kmdVar.l && this.c.equals(kmdVar.c)) {
                return c16.i(this.e, kmdVar.e);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        int c = hl5.c((this.h.hashCode() + ((((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, this.i, 31);
        imd imdVar = this.j;
        if (imdVar != null) {
            i = imdVar.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.l) + hl5.c((c + i) * 31, this.k, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
