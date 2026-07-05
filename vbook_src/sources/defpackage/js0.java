package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: js0  reason: default package */
/* loaded from: classes3.dex */
public final class js0 extends t59 {
    public boolean[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.t59
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
