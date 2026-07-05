package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ub1  reason: default package */
/* loaded from: classes3.dex */
public final class ub1 extends t59 {
    public char[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.t59
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
