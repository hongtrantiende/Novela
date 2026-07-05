package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ye8  reason: default package */
/* loaded from: classes.dex */
public final class ye8 extends j1b {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(km8 km8Var, byte[] bArr) {
        if (km8Var.a() < bArr.length) {
            return false;
        }
        int i = km8Var.b;
        byte[] bArr2 = new byte[bArr.length];
        km8Var.k(bArr2, 0, bArr.length);
        km8Var.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.j1b
    public final long b(km8 km8Var) {
        byte[] bArr = km8Var.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (this.i * gwe.j(b2, b)) / 1000000;
    }

    @Override // defpackage.j1b
    public final boolean c(km8 km8Var, long j, rwa rwaVar) {
        if (e(km8Var, o)) {
            byte[] copyOf = Arrays.copyOf(km8Var.a, km8Var.c);
            int i = copyOf[9] & 255;
            ArrayList e = gwe.e(copyOf);
            if (((vq4) rwaVar.b) == null) {
                uq4 uq4Var = new uq4();
                uq4Var.m = lc7.p("audio/ogg");
                uq4Var.n = lc7.p("audio/opus");
                uq4Var.F = i;
                uq4Var.G = 48000;
                uq4Var.q = e;
                rwaVar.b = new vq4(uq4Var);
                return true;
            }
        } else if (e(km8Var, p)) {
            ((vq4) rwaVar.b).getClass();
            if (!this.n) {
                this.n = true;
                km8Var.N(8);
                tb7 H = oue.H(qs5.m((String[]) oue.I(km8Var, false, false).a));
                if (H != null) {
                    uq4 a = ((vq4) rwaVar.b).a();
                    a.k = H.b(((vq4) rwaVar.b).l);
                    rwaVar.b = new vq4(a);
                    return true;
                }
            }
        } else {
            ((vq4) rwaVar.b).getClass();
            return false;
        }
        return true;
    }

    @Override // defpackage.j1b
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
