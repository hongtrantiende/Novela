package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c25  reason: default package */
/* loaded from: classes3.dex */
public final class c25 implements e25 {
    @Override // defpackage.e25
    public final ArrayList a(r13 r13Var, int i, int i2) {
        int i3;
        r13Var.getClass();
        int max = Math.max((i + i2) / (r13Var.X0(150.0f) + i2), 1);
        int i4 = (i - ((max - 1) * i2)) / max;
        int i5 = i4 % max;
        ArrayList arrayList = new ArrayList(max);
        for (int i6 = 0; i6 < max; i6++) {
            if (i5 > 0 && i6 == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            arrayList.add(Integer.valueOf(i3 + i4));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c25) || !rg3.b(150.0f, 150.0f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nk2.d(150.0f, -31, 31);
    }
}
