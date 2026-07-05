package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gma  reason: default package */
/* loaded from: classes3.dex */
public final class gma extends ad1 {
    public final d9a b;
    public final boolean c;
    public final ad1 d;
    public zc1 e = zc1.a;
    public int f = 255;
    public final int[] g = new int[4];
    public int h;
    public int i;
    public int j;

    public gma(d9a d9aVar, boolean z, o55 o55Var) {
        this.b = d9aVar;
        this.c = z;
        this.d = o55Var;
    }

    @Override // defpackage.ad1
    public final String a() {
        String a;
        ad1 ad1Var = this.d;
        if (ad1Var != null && (a = ad1Var.a()) != null) {
            return a;
        }
        return this.b.d;
    }

    @Override // defpackage.ad1
    public final float b() {
        int i;
        int i2 = this.h;
        if (i2 > 0 && (i = this.i) > 0) {
            float f = ((this.j * 1.0f) / i) * (((this.g[3] * 1.0f) / i2) / this.b.c);
            if (f >= 1.0f) {
                return 0.99f;
            }
            return f;
        }
        return 0.01f;
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        int i2;
        for (int i3 = 0; i3 < i; i3++) {
            d9a d9aVar = this.b;
            int i4 = d9aVar.a[bArr[i3] & 255];
            if (i4 < 250) {
                this.i++;
            }
            if (i4 < 64) {
                this.j++;
                int i5 = this.f;
                if (i5 < 64) {
                    this.h++;
                    if (!this.c) {
                        i2 = (i5 * 64) + i4;
                    } else {
                        i2 = i5 + (i4 * 64);
                    }
                    int i6 = d9aVar.b[i2];
                    if (i6 >= 0 && i6 < 4) {
                        int[] iArr = this.g;
                        iArr[i6] = iArr[i6] + 1;
                    }
                }
            }
            this.f = i4;
        }
        if (this.e == zc1.a && this.h > 1024) {
            float b = b();
            if (b > 0.95f) {
                this.e = zc1.b;
            } else if (b < 0.05f) {
                this.e = zc1.c;
            }
        }
        return this.e;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.e = zc1.a;
        this.f = 255;
        b00.h0(0, 0, 6, this.g);
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }
}
