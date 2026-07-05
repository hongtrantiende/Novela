package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ai4  reason: default package */
/* loaded from: classes.dex */
public final class ai4 extends j1b {
    public bi4 n;
    public ju0 o;

    @Override // defpackage.j1b
    public final long b(km8 km8Var) {
        byte[] bArr = km8Var.a;
        if (bArr[0] == -1) {
            int i = (bArr[2] & 255) >> 4;
            if (i == 6 || i == 7) {
                km8Var.N(4);
                km8Var.H();
            }
            int A = z87.A(i, km8Var);
            km8Var.M(0);
            return A;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ju0, java.lang.Object] */
    @Override // defpackage.j1b
    public final boolean c(km8 km8Var, long j, rwa rwaVar) {
        byte[] bArr = km8Var.a;
        bi4 bi4Var = this.n;
        if (bi4Var == null) {
            bi4 bi4Var2 = new bi4(bArr, 17);
            this.n = bi4Var2;
            uq4 a = bi4Var2.c(Arrays.copyOfRange(bArr, 9, km8Var.c), null).a();
            a.m = lc7.p("audio/ogg");
            rwaVar.b = new vq4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            s6f s = o28.s(km8Var);
            bi4 bi4Var3 = new bi4(bi4Var.a, bi4Var.b, bi4Var.c, bi4Var.d, bi4Var.e, bi4Var.g, bi4Var.h, bi4Var.j, s, bi4Var.l);
            this.n = bi4Var3;
            ?? obj = new Object();
            obj.c = bi4Var3;
            obj.d = s;
            obj.a = -1L;
            obj.b = -1L;
            this.o = obj;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            ju0 ju0Var = this.o;
            if (ju0Var != null) {
                ju0Var.a = j;
                rwaVar.c = ju0Var;
            }
            ((vq4) rwaVar.b).getClass();
            return false;
        }
    }

    @Override // defpackage.j1b
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
