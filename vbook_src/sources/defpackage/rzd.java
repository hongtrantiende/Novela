package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rzd  reason: default package */
/* loaded from: classes.dex */
public final class rzd extends qzd {
    public final byte[] c;

    public rzd(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.szd
    public final byte a(int i) {
        return this.c[i];
    }

    @Override // defpackage.szd
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.szd
    public final qzd c(int i, int i2) {
        byte[] bArr = this.c;
        int k = szd.k(0, i2, bArr.length);
        if (k == 0) {
            return szd.b;
        }
        return new ozd(bArr, 0, k);
    }

    @Override // defpackage.szd
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // defpackage.szd
    public final void e(g0e g0eVar) {
        byte[] bArr = this.c;
        g0eVar.c(bArr, 0, bArr.length);
    }

    @Override // defpackage.szd
    public final boolean f(szd szdVar) {
        boolean z = szdVar instanceof rzd;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((rzd) szdVar).c);
        }
        boolean z2 = szdVar instanceof ozd;
        if (z2) {
            ozd ozdVar = (ozd) szdVar;
            int i = ozdVar.e;
            int length = bArr.length;
            if (length <= i) {
                if (length <= i) {
                    if (z) {
                        return szd.l(0, 0, length, bArr, ((rzd) szdVar).c);
                    }
                    if (z2) {
                        return szd.l(0, ozdVar.d, length, bArr, ozdVar.c);
                    }
                    return szdVar.c(0, length).equals(c(0, length));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
                sb.append("Ran off end of other: 0, ");
                sb.append(length);
                sb.append(", ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        return szdVar.f(this);
    }

    @Override // defpackage.szd
    public final int g(int i, int i2) {
        return d1e.a(i, this.c, 0, i2);
    }
}
