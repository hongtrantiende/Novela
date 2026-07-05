package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ro8  reason: default package */
/* loaded from: classes3.dex */
public final class ro8 implements bn9 {
    public final Set a;
    public final gw7 b = new gw7(new wv4[16], 0);

    public ro8(Set set) {
        this.a = set;
    }

    @Override // defpackage.bn9
    public final void c() {
        gw7 gw7Var = this.b;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            bn9 bn9Var = ((wv4) objArr[i2]).a;
            this.a.remove(bn9Var);
            bn9Var.c();
        }
    }

    @Override // defpackage.bn9
    public final void a() {
    }

    @Override // defpackage.bn9
    public final void b() {
    }
}
