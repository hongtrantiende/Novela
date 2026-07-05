package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n99  reason: default package */
/* loaded from: classes.dex */
public final class n99 {
    public final /* synthetic */ int a;
    public final lac b;
    public final km8 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public n99(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new lac(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new km8();
                return;
            default:
                this.b = new lac(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new km8();
                return;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(km8 km8Var) {
        int i = km8Var.b;
        if (km8Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        km8Var.k(bArr, 0, 9);
        km8Var.M(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(s94 s94Var) {
        int i = this.a;
        km8 km8Var = this.c;
        switch (i) {
            case 0:
                byte[] bArr = a2d.b;
                km8Var.getClass();
                km8Var.K(bArr, bArr.length);
                this.d = true;
                s94Var.p();
                return;
            default:
                byte[] bArr2 = a2d.b;
                km8Var.getClass();
                km8Var.K(bArr2, bArr2.length);
                this.d = true;
                s94Var.p();
                return;
        }
    }
}
