package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk0  reason: default package */
/* loaded from: classes3.dex */
public final class sk0 extends ad1 {
    public static final tk0 f = new z1(new n07(tk0.C), 5, new n07(tk0.D), tk0.E, "BIG5");
    public final p88 b = new p88(f);
    public zc1 c = zc1.a;
    public final rk0 d;
    public final byte[] e;

    /* JADX WARN: Type inference failed for: r0v2, types: [cc1, rk0] */
    public sk0() {
        ?? cc1Var = new cc1();
        int[] iArr = (int[]) rk0.e.getValue();
        iArr.getClass();
        cc1Var.c = iArr;
        cc1Var.d = 0.75f;
        this.d = cc1Var;
        this.e = new byte[2];
        d();
    }

    @Override // defpackage.ad1
    public final String a() {
        return "BIG5";
    }

    @Override // defpackage.ad1
    public final float b() {
        return this.d.a();
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        zc1 zc1Var;
        byte[] bArr2;
        rk0 rk0Var;
        int i2 = 0;
        while (true) {
            zc1Var = zc1.b;
            bArr2 = this.e;
            rk0Var = this.d;
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
                    if (i2 == 0) {
                        bArr2[1] = bArr[0];
                        rk0Var.c(bArr2, 0, i3);
                    } else {
                        rk0Var.c(bArr, i2 - 1, i3);
                    }
                }
                i2++;
            }
        }
        if (i > 0) {
            bArr2[0] = bArr[i - 1];
        }
        if (this.c == zc1.a && rk0Var.b > 1024 && rk0Var.a() > 0.95f) {
            this.c = zc1Var;
        }
        return this.c;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.b.a = 0;
        this.c = zc1.a;
        this.d.d();
        b00.i0(this.e, (byte) 0);
    }
}
