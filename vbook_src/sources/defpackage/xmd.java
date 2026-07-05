package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xmd  reason: default package */
/* loaded from: classes.dex */
public final class xmd {
    public final String a;
    public final jmd b;
    public final tf2 c;
    public final long d;
    public final long e;
    public final long f;
    public final w02 g;
    public final int h;
    public final ng0 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public xmd(String str, jmd jmdVar, tf2 tf2Var, long j, long j2, long j3, w02 w02Var, int i, ng0 ng0Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        tf2Var.getClass();
        this.a = str;
        this.b = jmdVar;
        this.c = tf2Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = w02Var;
        this.h = i;
        this.i = ng0Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xmd) {
                xmd xmdVar = (xmd) obj;
                if (!c16.i(this.a, xmdVar.a) || this.b != xmdVar.b || !c16.i(this.c, xmdVar.c) || this.d != xmdVar.d || this.e != xmdVar.e || this.f != xmdVar.f || !this.g.equals(xmdVar.g) || this.h != xmdVar.h || this.i != xmdVar.i || this.j != xmdVar.j || this.k != xmdVar.k || this.l != xmdVar.l || this.m != xmdVar.m || this.n != xmdVar.n || this.o != xmdVar.o || !this.p.equals(xmdVar.p) || !this.q.equals(xmdVar.q)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int c = hl5.c(hl5.c(hl5.c((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31), this.e, 31), this.f, 31);
        return this.q.hashCode() + eub.l(hl5.a(this.o, hl5.c(hl5.a(this.m, hl5.a(this.l, hl5.c(hl5.c((this.i.hashCode() + hl5.a(this.h, (this.g.hashCode() + c) * 31, 31)) * 31, this.j, 31), this.k, 31), 31), 31), this.n, 31), 31), this.p, 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
