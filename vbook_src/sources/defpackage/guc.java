package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: guc  reason: default package */
/* loaded from: classes3.dex */
public final class guc extends ad1 {
    public static final huc e = new z1(new n07(huc.C), 16, new n07(huc.D), huc.E, "UTF-8");
    public p88 b;
    public zc1 c;
    public int d;

    @Override // defpackage.ad1
    public final String a() {
        return "UTF-8";
    }

    @Override // defpackage.ad1
    public final float b() {
        int i = this.d;
        float f = 0.99f;
        if (i >= 6) {
            return 0.99f;
        }
        for (int i2 = 0; i2 < i; i2++) {
            f *= 0.5f;
        }
        return 1.0f - f;
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        zc1 zc1Var;
        p88 p88Var = this.b;
        int i2 = 0;
        while (true) {
            zc1Var = zc1.b;
            if (i2 >= i) {
                break;
            }
            int z = p88Var.z(bArr[i2]);
            if (z == 1) {
                this.c = zc1.c;
                break;
            } else if (z == 2) {
                this.c = zc1Var;
                break;
            } else {
                if (z == 0 && p88Var.b >= 2) {
                    this.d++;
                }
                i2++;
            }
        }
        if (this.c == zc1.a && b() > 0.95f) {
            this.c = zc1Var;
        }
        return this.c;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.b.a = 0;
        this.d = 0;
        this.c = zc1.a;
    }
}
