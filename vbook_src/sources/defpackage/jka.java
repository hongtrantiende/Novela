package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jka  reason: default package */
/* loaded from: classes3.dex */
public final class jka extends t59 {
    public short[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.t59
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
