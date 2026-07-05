package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w6e  reason: default package */
/* loaded from: classes.dex */
public final class w6e extends v6e {
    public final byte[] d;

    public w6e(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // defpackage.s6e
    public final byte a(int i) {
        return this.d[i];
    }

    @Override // defpackage.s6e
    public final int b() {
        return this.d.length;
    }

    @Override // defpackage.s6e
    public final v6e d(int i, int i2) {
        byte[] bArr = this.d;
        int c = s6e.c(0, i2, bArr.length);
        if (c == 0) {
            return s6e.b;
        }
        return new u6e(bArr, 0, c);
    }

    @Override // defpackage.s6e
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // defpackage.s6e
    public final boolean h(s6e s6eVar) {
        boolean z = s6eVar instanceof w6e;
        byte[] bArr = this.d;
        if (z) {
            return Arrays.equals(bArr, ((w6e) s6eVar).d);
        }
        if (s6eVar instanceof u6e) {
            int length = bArr.length;
            if (length <= s6eVar.b()) {
                if (length <= s6eVar.b()) {
                    if (s6eVar instanceof w6e) {
                        return s6e.g(0, 0, length, bArr, ((w6e) s6eVar).d);
                    }
                    u6e u6eVar = (u6e) s6eVar;
                    return s6e.g(0, u6eVar.e, length, bArr, u6eVar.d);
                }
                vs.m(rs8.k("Ran off end of other: 0, ", length, s6eVar.b(), ", "));
                return false;
            }
            hfd.o(length, bArr.length);
            return false;
        }
        return s6eVar.h(this);
    }

    @Override // defpackage.s6e
    public final void j(e7e e7eVar) {
        byte[] bArr = this.d;
        e7eVar.i(bArr, 0, bArr.length);
    }

    @Override // defpackage.s6e
    public final int k(int i, int i2) {
        return n7e.a(i, this.d, 0, i2);
    }

    @Override // defpackage.s6e
    public final x6e l() {
        byte[] bArr = this.d;
        return xb1.M(bArr, 0, bArr.length);
    }
}
