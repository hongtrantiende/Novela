package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ts4  reason: default package */
/* loaded from: classes.dex */
public final class ts4 {
    public final fjc a;
    public gjc d;
    public qw2 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final vq4 j;
    public boolean m;
    public final zic b = new zic();
    public final km8 c = new km8();
    public final km8 k = new km8(1);
    public final km8 l = new km8();

    public ts4(fjc fjcVar, gjc gjcVar, qw2 qw2Var, vq4 vq4Var) {
        this.a = fjcVar;
        this.d = gjcVar;
        this.e = qw2Var;
        this.j = vq4Var;
        this.d = gjcVar;
        this.e = qw2Var;
        fjcVar.g(vq4Var);
        e();
    }

    public final int a() {
        int i;
        if (!this.m) {
            i = this.d.g[this.f];
        } else if (this.b.j[this.f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (b() != null) {
            return 1073741824 | i;
        }
        return i;
    }

    public final yic b() {
        if (this.m) {
            zic zicVar = this.b;
            qw2 qw2Var = zicVar.a;
            String str = a2d.a;
            int i = qw2Var.a;
            yic yicVar = zicVar.m;
            if (yicVar == null) {
                yicVar = this.d.a.l[i];
            }
            if (yicVar != null && yicVar.a) {
                return yicVar;
            }
            return null;
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        km8 km8Var;
        boolean z;
        boolean z2;
        int i3;
        yic b = b();
        if (b == null) {
            return 0;
        }
        int i4 = b.d;
        zic zicVar = this.b;
        if (i4 != 0) {
            km8Var = zicVar.n;
        } else {
            byte[] bArr = b.e;
            String str = a2d.a;
            int length = bArr.length;
            km8 km8Var2 = this.l;
            km8Var2.K(bArr, length);
            i4 = bArr.length;
            km8Var = km8Var2;
        }
        int i5 = this.f;
        if (zicVar.k && zicVar.l[i5]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        km8 km8Var3 = this.k;
        byte[] bArr2 = km8Var3.a;
        if (z2) {
            i3 = Token.CASE;
        } else {
            i3 = 0;
        }
        bArr2[0] = (byte) (i3 | i4);
        km8Var3.M(0);
        fjc fjcVar = this.a;
        fjcVar.b(km8Var3, 1, 1);
        fjcVar.b(km8Var, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        km8 km8Var4 = this.c;
        if (!z) {
            km8Var4.J(8);
            byte[] bArr3 = km8Var4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = 0;
            bArr3[3] = (byte) (i2 & 255);
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            fjcVar.b(km8Var4, 8, 1);
            return i4 + 9;
        }
        km8 km8Var5 = zicVar.n;
        int G = km8Var5.G();
        km8Var5.N(-2);
        int i6 = (G * 6) + 2;
        if (i2 != 0) {
            km8Var4.J(i6);
            byte[] bArr4 = km8Var4.a;
            km8Var5.k(bArr4, 0, i6);
            int i7 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i7 >> 8) & 255);
            bArr4[3] = (byte) (i7 & 255);
        } else {
            km8Var4 = km8Var5;
        }
        fjcVar.b(km8Var4, i6, 1);
        return i4 + 1 + i6;
    }

    public final void e() {
        zic zicVar = this.b;
        zicVar.d = 0;
        zicVar.p = 0L;
        zicVar.q = false;
        zicVar.k = false;
        zicVar.o = false;
        zicVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
