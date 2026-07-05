package defpackage;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d2  reason: default package */
/* loaded from: classes3.dex */
public final class d2 extends e2 implements RandomAccess {
    public final e2 a;
    public final int b;
    public final int c;

    public d2(e2 e2Var, int i, int i2) {
        this.a = e2Var;
        this.b = i;
        ube.t(i, i2, e2Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a.get(this.b + i);
        }
        cy7.k(rs8.k("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // defpackage.e2, java.util.List
    public final List subList(int i, int i2) {
        ube.t(i, i2, this.c);
        int i3 = this.b;
        return new d2(this.a, i + i3, i3 + i2);
    }
}
