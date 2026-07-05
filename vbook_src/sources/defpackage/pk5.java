package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk5  reason: default package */
/* loaded from: classes.dex */
public final class pk5 implements jg2 {
    public final jg2 a;
    public final int b;
    public final y79 c;
    public final byte[] d;
    public int e;

    public pk5(jg2 jg2Var, int i, y79 y79Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.a = jg2Var;
        this.b = i;
        this.c = y79Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.jg2
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jg2
    public final Map o() {
        return this.a.o();
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        jg2 jg2Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (jg2Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = jg2Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        km8 km8Var = new km8(bArr3, i5);
                        y79 y79Var = this.c;
                        if (!y79Var.H) {
                            max = y79Var.E;
                        } else {
                            max = Math.max(y79Var.I.y(true), y79Var.E);
                        }
                        long j = max;
                        int a = km8Var.a();
                        fjc fjcVar = y79Var.G;
                        fjcVar.getClass();
                        fjcVar.e(a, km8Var);
                        fjcVar.a(j, 1, a, 0, null);
                        y79Var.H = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = jg2Var.read(bArr, i, Math.min(this.e, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        return this.a.t();
    }

    @Override // defpackage.jg2
    public final void u(ys2 ys2Var) {
        ys2Var.getClass();
        this.a.u(ys2Var);
    }
}
