package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ktc  reason: default package */
/* loaded from: classes3.dex */
public final class ktc extends t59 {
    public byte[] a;
    public int b;

    @Override // defpackage.t59
    public final Object a() {
        return new jtc(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.t59
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.t59
    public final int d() {
        return this.b;
    }
}
