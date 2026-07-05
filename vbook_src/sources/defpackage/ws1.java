package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ws1  reason: default package */
/* loaded from: classes.dex */
public final class ws1 extends ys1 {
    public static ys1 f(int i) {
        if (i < 0) {
            return ys1.b;
        }
        if (i > 0) {
            return ys1.c;
        }
        return ys1.a;
    }

    @Override // defpackage.ys1
    public final ys1 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.ys1
    public final ys1 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.ys1
    public final ys1 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.ys1
    public final ys1 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.ys1
    public final int e() {
        return 0;
    }
}
