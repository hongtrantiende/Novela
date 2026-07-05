package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p56  reason: default package */
/* loaded from: classes3.dex */
public final class p56 extends n56 {
    public final d56 j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p56(r36 r36Var, d56 d56Var) {
        super(r36Var, d56Var, (String) null, 12);
        r36Var.getClass();
        this.j = d56Var;
        List C0 = sl1.C0(d56Var.a.keySet());
        this.k = C0;
        this.l = C0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.n56, defpackage.a2
    public final k46 F(String str) {
        str.getClass();
        if (this.m % 2 == 0) {
            return l46.a(str);
        }
        return (k46) o17.p(str, this.j);
    }

    @Override // defpackage.n56, defpackage.a2
    public final String R(o9a o9aVar, int i) {
        o9aVar.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.n56, defpackage.a2
    public final k46 T() {
        return this.j;
    }

    @Override // defpackage.n56
    public final d56 Y() {
        return this.j;
    }

    @Override // defpackage.n56, defpackage.fx1
    public final int f(o9a o9aVar) {
        o9aVar.getClass();
        int i = this.m;
        if (i < this.l - 1) {
            int i2 = i + 1;
            this.m = i2;
            return i2;
        }
        return -1;
    }

    @Override // defpackage.n56, defpackage.a2, defpackage.fx1
    public final void n(o9a o9aVar) {
        o9aVar.getClass();
    }
}
