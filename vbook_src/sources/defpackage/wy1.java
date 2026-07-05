package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy1  reason: default package */
/* loaded from: classes3.dex */
public final class wy1 implements yq4 {
    public final List a;

    public wy1(mz1 mz1Var, int i, int i2, List list) {
        list.getClass();
        this.a = list;
        if (1 <= i && i < 10) {
            if (i <= i2 && i2 < 10) {
                return;
            }
            p1a.k(hl5.i(i2, i, "The maximum number of digits (", ") is not in range ", "..9"));
            throw null;
        }
        p1a.k(hl5.l("The minimum number of digits (", ") is not in range 1..9", i));
        throw null;
    }

    public wy1(List list) {
        this.a = list;
    }
}
