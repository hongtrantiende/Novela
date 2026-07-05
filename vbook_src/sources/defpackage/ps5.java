package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ps5  reason: default package */
/* loaded from: classes.dex */
public final class ps5 extends e2 {
    public final d3 a;
    public final int b;
    public final int c;

    public ps5(d3 d3Var, int i, int i2) {
        this.a = d3Var;
        this.b = i;
        iue.M(i, i2, d3Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        iue.K(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.e2, java.util.List
    public final List subList(int i, int i2) {
        iue.M(i, i2, this.c);
        int i3 = this.b;
        return new ps5(this.a, i + i3, i3 + i2);
    }
}
