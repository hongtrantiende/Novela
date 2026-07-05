package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zv9  reason: default package */
/* loaded from: classes3.dex */
public final class zv9 extends ad1 {
    public static final aw9 g = new z1(new n07(aw9.C), 6, new n07(aw9.D), aw9.E, "SHIFT_JIS");
    public final p88 b = new p88(g);
    public zc1 c = zc1.a;
    public final cn3 d = new cn3(1);
    public final yv9 e = new j26();
    public final byte[] f = new byte[2];

    /* JADX WARN: Type inference failed for: r0v3, types: [yv9, j26] */
    public zv9() {
        d();
    }

    @Override // defpackage.ad1
    public final String a() {
        return "SHIFT_JIS";
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
                    yv9 yv9Var = this.e;
                    if (i2 == 0) {
                        bArr2[1] = bArr[0];
                        cn3Var.a(bArr2, 2 - i3, i3);
                        yv9Var.c(bArr2, 0, i3);
                    } else {
                        cn3Var.a(bArr, (i2 + 1) - i3, i3);
                        yv9Var.c(bArr, i2 - 1, i3);
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
