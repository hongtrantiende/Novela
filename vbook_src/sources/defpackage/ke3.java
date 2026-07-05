package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke3  reason: default package */
/* loaded from: classes3.dex */
public final class ke3 extends t59 {
    public double[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.t59
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
