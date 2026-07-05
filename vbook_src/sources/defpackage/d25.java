package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d25  reason: default package */
/* loaded from: classes3.dex */
public final class d25 implements e25 {
    @Override // defpackage.e25
    public final ArrayList a(r13 r13Var, int i, int i2) {
        int i3;
        r13Var.getClass();
        int i4 = (i - (4 * i2)) / 5;
        int i5 = i4 % 5;
        ArrayList arrayList = new ArrayList(5);
        for (int i6 = 0; i6 < 5; i6++) {
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
        if (!(obj instanceof d25)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + hl5.a(5, 31, 31);
    }
}
