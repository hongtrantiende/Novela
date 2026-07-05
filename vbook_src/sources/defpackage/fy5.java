package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fy5  reason: default package */
/* loaded from: classes3.dex */
public final class fy5 extends t59 {
    public int[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.t59
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
