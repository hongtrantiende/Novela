package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o55  reason: default package */
/* loaded from: classes3.dex */
public final class o55 extends ad1 {
    public int b;
    public int c;
    public byte d;
    public byte e;
    public gma f;
    public gma g;

    @Override // defpackage.ad1
    public final String a() {
        gma gmaVar;
        int i = this.b - this.c;
        if (i < 5) {
            if (i > -5) {
                gma gmaVar2 = this.f;
                if (gmaVar2 != null && (gmaVar = this.g) != null) {
                    float b = gmaVar2.b() - gmaVar.b();
                    if (b <= 0.01f) {
                        if (b < -0.01f || i < 0) {
                            return "ISO-8859-8";
                        }
                        return "WINDOWS-1255";
                    }
                    return "WINDOWS-1255";
                }
                return "WINDOWS-1255";
            }
            return "ISO-8859-8";
        }
        return "WINDOWS-1255";
    }

    @Override // defpackage.ad1
    public final float b() {
        return nae.e;
    }

    @Override // defpackage.ad1
    public final zc1 c(byte[] bArr, int i) {
        zc1 zc1Var;
        gma gmaVar = this.f;
        gma gmaVar2 = this.g;
        zc1 zc1Var2 = zc1.a;
        zc1 zc1Var3 = zc1.c;
        if (gmaVar != null && gmaVar2 != null && gmaVar.e == zc1Var3 && gmaVar2.e == zc1Var3) {
            zc1Var = zc1Var3;
        } else {
            zc1Var = zc1Var2;
        }
        if (zc1Var == zc1Var3) {
            return zc1Var3;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            byte b2 = this.e;
            if (b == 32) {
                if (b2 != 32) {
                    if (j55.t(this.d)) {
                        this.b++;
                    } else {
                        int i3 = this.d & 255;
                        if (i3 == 235 || i3 == 238 || i3 == 240 || i3 == 244) {
                            this.c++;
                        }
                    }
                }
            } else if (b2 == 32 && j55.t(this.d) && b != 32) {
                this.c++;
            }
            this.e = this.d;
            this.d = b;
        }
        return zc1Var2;
    }

    @Override // defpackage.ad1
    public final void d() {
        this.b = 0;
        this.c = 0;
        this.d = (byte) 32;
        this.e = (byte) 32;
    }
}
