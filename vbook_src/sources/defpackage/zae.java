package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zae  reason: default package */
/* loaded from: classes.dex */
public final class zae {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public zae(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        am8.p(str);
        am8.p(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        am8.n(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        am8.n(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        am8.n(z3);
        am8.n(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final zae a(long j) {
        return new zae(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final zae b(Long l, Long l2, Boolean bool) {
        return new zae(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
