package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n73  reason: default package */
/* loaded from: classes.dex */
public final class n73 implements fjc {
    public final byte[] a = new byte[4096];

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        km8Var.N(i);
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = eg2Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
    }

    @Override // defpackage.fjc
    public final void a(long j, int i, int i2, int i3, ejc ejcVar) {
    }
}
