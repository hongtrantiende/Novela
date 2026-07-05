package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ozd  reason: default package */
/* loaded from: classes.dex */
public final class ozd extends qzd {
    public final byte[] c;
    public final int d;
    public final int e;

    public ozd(byte[] bArr, int i, int i2) {
        szd.k(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.szd
    public final byte a(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.szd
    public final int b() {
        return this.e;
    }

    @Override // defpackage.szd
    public final qzd c(int i, int i2) {
        int k = szd.k(i, i2, this.e);
        if (k == 0) {
            return szd.b;
        }
        return new ozd(this.c, this.d + i, k);
    }

    @Override // defpackage.szd
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // defpackage.szd
    public final void e(g0e g0eVar) {
        g0eVar.c(this.c, this.d, this.e);
    }

    @Override // defpackage.szd
    public final boolean f(szd szdVar) {
        boolean z = szdVar instanceof rzd;
        if (!z && !(szdVar instanceof ozd)) {
            return szdVar.f(this);
        }
        int b = szdVar.b();
        int i = this.e;
        if (i <= b) {
            if (i <= szdVar.b()) {
                byte[] bArr = this.c;
                int i2 = this.d;
                if (z) {
                    return szd.l(i2, 0, i, bArr, ((rzd) szdVar).c);
                }
                if (szdVar instanceof ozd) {
                    ozd ozdVar = (ozd) szdVar;
                    return szd.l(i2, ozdVar.d, i, bArr, ozdVar.c);
                }
                return szdVar.c(0, i).equals(c(i2, i + i2));
            }
            int b2 = szdVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(b2).length());
            sb.append("Ran off end of other: 0, ");
            sb.append(i);
            sb.append(", ");
            sb.append(b2);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
        sb2.append("Length too large: ");
        sb2.append(i);
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.szd
    public final int g(int i, int i2) {
        return d1e.a(i, this.c, this.d, i2);
    }
}
