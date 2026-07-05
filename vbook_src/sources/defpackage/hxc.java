package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hxc  reason: default package */
/* loaded from: classes3.dex */
public final class hxc extends g1 {
    public final o89 a;
    public final String b;
    public final Integer c;
    public final e88 d;
    public final int e;

    public hxc(o89 o89Var, int i, e88 e88Var, int i2) {
        int i3;
        String str = o89Var.b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        e88Var = (i2 & 32) != 0 ? null : e88Var;
        str.getClass();
        this.a = o89Var;
        this.b = str;
        this.c = num;
        this.d = e88Var;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else if (i < 1000) {
            i3 = 3;
        } else {
            vs.m(hl5.l("Max value ", " is too large", i));
            throw null;
        }
        this.e = i3;
    }

    @Override // defpackage.g1
    public final o89 a() {
        return this.a;
    }

    @Override // defpackage.g1
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.g1
    public final String c() {
        return this.b;
    }

    @Override // defpackage.g1
    public final e88 d() {
        return this.d;
    }
}
