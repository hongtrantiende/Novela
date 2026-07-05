package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u01  reason: default package */
/* loaded from: classes.dex */
public final class u01 {
    public final /* synthetic */ int a;
    public final byte[] b;
    public int c;

    public u01(byte[] bArr, int i, byte b) {
        this.a = i;
        switch (i) {
            case 3:
                bArr.getClass();
                this.b = bArr;
                this.c = 0;
                return;
            case 4:
                bArr.getClass();
                this.b = bArr;
                return;
            default:
                bArr.getClass();
                this.b = bArr;
                return;
        }
    }

    public void a(int i) {
        int i2 = this.c + i;
        byte[] bArr = this.b;
        if (i2 <= bArr.length) {
            return;
        }
        throw new e60(14, hl5.i(i, bArr.length - this.c, "HWP3: insufficient data (need ", ", have ", ")"), false);
    }

    public byte b() {
        int i = this.c;
        byte[] bArr = this.b;
        if (i < bArr.length) {
            this.c = i + 1;
            return bArr[i];
        }
        vs.k("Unexpected end of UMD stream");
        return (byte) 0;
    }

    public byte[] c(int i, int i2) {
        byte b;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            if (i4 >= 0) {
                byte[] bArr2 = this.b;
                if (i4 < bArr2.length) {
                    b = bArr2[i4];
                    bArr[i3] = b;
                }
            }
            b = 0;
            bArr[i3] = b;
        }
        return bArr;
    }

    public byte[] d(int i) {
        int i2 = this.a;
        byte[] bArr = this.b;
        switch (i2) {
            case 3:
                a(i);
                int i3 = this.c;
                byte[] d0 = b00.d0(bArr, i3, i3 + i);
                this.c += i;
                return d0;
            default:
                if (i <= 0) {
                    return new byte[0];
                }
                int i4 = this.c;
                if (i4 + i <= bArr.length) {
                    byte[] d02 = b00.d0(bArr, i4, i4 + i);
                    this.c += i;
                    return d02;
                }
                vs.k("Unexpected end of UMD stream");
                return null;
        }
    }

    public int e() {
        int l = l();
        int l2 = l();
        return (l() << 24) | (l() << 16) | (l2 << 8) | l;
    }

    public String f(int i, int i2) {
        return r4b.F(c(i, i2));
    }

    public int g() {
        a(2);
        int i = this.c;
        byte[] bArr = this.b;
        bArr.getClass();
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.c += 2;
        return i2;
    }

    public int h() {
        a(1);
        int i = this.c;
        int i2 = this.b[i] & 255;
        this.c = i + 1;
        return i2;
    }

    public int i(int i) {
        return m(i + 1) | (m(i) << 8);
    }

    public int j() {
        int i = this.c;
        this.c = i + 4;
        return m(i + 3) | (m(i) << 24) | (m(i + 1) << 16) | (m(i + 2) << 8);
    }

    public int k(int i) {
        return m(i + 3) | (m(i) << 24) | (m(i + 1) << 16) | (m(i + 2) << 8);
    }

    public int l() {
        return b() & 255;
    }

    public int m(int i) {
        Byte b;
        byte b2;
        byte[] bArr = this.b;
        bArr.getClass();
        if (i >= 0 && i < bArr.length) {
            b = Byte.valueOf(bArr[i]);
        } else {
            b = null;
        }
        if (b != null) {
            b2 = b.byteValue();
        } else {
            b2 = 0;
        }
        return b2 & 255;
    }

    public String n(int i) {
        fd1 fd1Var = fd1.a;
        return fd1.c.a(d(i));
    }

    public void o(int i) {
        switch (this.a) {
            case 3:
                a(i);
                this.c += i;
                return;
            default:
                if (i > 0) {
                    int i2 = this.c;
                    if (i2 + i <= this.b.length) {
                        this.c = i2 + i;
                        return;
                    } else {
                        vs.k("Unexpected end of UMD stream");
                        return;
                    }
                }
                return;
        }
    }

    public u01(byte[] bArr, int i) {
        this.a = 2;
        this.b = bArr;
        this.c = i;
    }

    public u01(int i) {
        this.a = 1;
        this.b = new byte[i];
    }
}
