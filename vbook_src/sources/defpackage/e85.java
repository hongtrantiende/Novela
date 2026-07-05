package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e85  reason: default package */
/* loaded from: classes.dex */
public final class e85 implements fjc {
    public static final vq4 f;
    public static final vq4 g;
    public final fjc a;
    public final vq4 b;
    public vq4 c;
    public byte[] d;
    public int e;

    static {
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("application/id3");
        f = new vq4(uq4Var);
        uq4 uq4Var2 = new uq4();
        uq4Var2.n = lc7.p("application/x-emsg");
        g = new vq4(uq4Var2);
    }

    public e85(fjc fjcVar, int i) {
        this.a = fjcVar;
        if (i != 1) {
            if (i == 3) {
                this.b = g;
            } else {
                vs.m(a82.j(i, "Unknown metadataType: "));
                throw null;
            }
        } else {
            this.b = f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.fjc
    public final void a(long j, int i, int i2, int i3, ejc ejcVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        km8 km8Var = new km8(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.o;
        vq4 vq4Var = this.b;
        String str2 = vq4Var.o;
        String str3 = vq4Var.o;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.c.o)) {
                sx3 M = yw.M(km8Var);
                vq4 a = M.a();
                if (a != null && Objects.equals(str3, a.o)) {
                    byte[] c = M.c();
                    c.getClass();
                    km8Var = new km8(c);
                } else {
                    vq4 a2 = M.a();
                    st0.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a2);
                    return;
                }
            } else {
                st0.w("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.o);
                return;
            }
        }
        int a3 = km8Var.a();
        fjc fjcVar = this.a;
        fjcVar.e(a3, km8Var);
        fjcVar.a(j, i, a3, 0, ejcVar);
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        km8Var.k(this.d, this.e, i);
        this.e += i;
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = eg2Var.read(this.d, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        this.c = vq4Var;
        this.a.g(this.b);
    }
}
