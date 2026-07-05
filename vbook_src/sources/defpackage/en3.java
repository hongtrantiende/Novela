package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en3  reason: default package */
/* loaded from: classes3.dex */
public final class en3 extends ad1 {
    public static final fn3 g = new z1(new n07(fn3.C), 6, new n07(fn3.D), fn3.E, "EUC-JP");
    public final p88 b = new p88(g);
    public zc1 c = zc1.a;
    public final cn3 d = new cn3(0);
    public final dn3 e = new j26();
    public final byte[] f = new byte[2];

    /* JADX WARN: Type inference failed for: r0v3, types: [dn3, j26] */
    public en3() {
        d();
    }

    @Override // defpackage.ad1
    public final String a() {
        return "EUC-JP";
    }

    @Override // defpackage.ad1
    public final float b() {
        float f;
        cn3 cn3Var = this.d;
        int i = cn3Var.b;
        if (i > 4) {
            f = (i - cn3Var.a[0]) / i;
        } else {
            f = -1.0f;
        }
        return Math.max(f, this.e.a());
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        zc1 zc1Var;
        cn3 cn3Var;
        byte[] bArr2;
        int i2 = 0;
        while (true) {
            zc1Var = zc1.b;
            cn3Var = this.d;
            bArr2 = this.f;
            if (i2 >= i) {
                break;
            }
            byte b = bArr[i2];
            p88 p88Var = this.b;
            int z = p88Var.z(b);
            if (z == 1) {
                this.c = zc1.c;
                break;
            } else if (z == 2) {
                this.c = zc1Var;
                break;
            } else {
                if (z == 0) {
                    int i3 = p88Var.b;
                    dn3 dn3Var = this.e;
                    if (i2 == 0) {
                        bArr2[1] = bArr[0];
                        cn3Var.a(bArr2, 0, i3);
                        dn3Var.c(bArr2, 0, i3);
                    } else {
                        int i4 = i2 - 1;
                        cn3Var.a(bArr, i4, i3);
                        dn3Var.c(bArr, i4, i3);
                    }
                }
                i2++;
            }
        }
        if (i > 0) {
            bArr2[0] = bArr[i - 1];
        }
        if (this.c == zc1.a && cn3Var.b > 100 && b() > 0.95f) {
            this.c = zc1Var;
        }
        return this.c;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.b.a = 0;
        this.c = zc1.a;
        cn3 cn3Var = this.d;
        cn3Var.b = 0;
        b00.h0(0, 0, 6, cn3Var.a);
        cn3Var.c = -1;
        cn3Var.d = false;
        this.e.d();
        b00.i0(this.f, (byte) 0);
    }
}
