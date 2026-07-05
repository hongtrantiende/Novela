package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hv5  reason: default package */
/* loaded from: classes3.dex */
public final class hv5 extends n09 {
    public final boolean l;

    public hv5(String str, iv5 iv5Var) {
        super(str, iv5Var, 1);
        this.l = true;
    }

    @Override // defpackage.n09
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hv5) {
                o9a o9aVar = (o9a) obj;
                if (this.a.equals(o9aVar.a())) {
                    hv5 hv5Var = (hv5) obj;
                    if (hv5Var.l && Arrays.equals((o9a[]) this.j.getValue(), (o9a[]) hv5Var.j.getValue())) {
                        int f = o9aVar.f();
                        int i = this.c;
                        if (i == f) {
                            for (int i2 = 0; i2 < i; i2++) {
                                if (c16.i(i(i2).a(), o9aVar.i(i2).a()) && c16.i(i(i2).e(), o9aVar.i(i2).e())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.n09
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.o9a
    public final boolean isInline() {
        return this.l;
    }
}
