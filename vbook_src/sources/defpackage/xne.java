package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xne  reason: default package */
/* loaded from: classes.dex */
public class xne {
    public static final qne d;
    public final mne a;
    public final Character b;
    public volatile xne c;

    static {
        new tne("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new tne("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new xne("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new xne("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new qne(new mne("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public xne(mne mneVar, Character ch) {
        this.a = mneVar;
        if (ch != null) {
            byte[] bArr = mneVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                vs.m(sxd.p("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ctd.C(0, i, bArr.length);
        while (i2 < i) {
            mne mneVar = this.a;
            b(sb, bArr, i2, Math.min(mneVar.f, i - i2));
            i2 += mneVar.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        ctd.C(i, i + i2, bArr.length);
        mne mneVar = this.a;
        int i3 = mneVar.f;
        int i4 = mneVar.d;
        if (i2 <= i3) {
            int i5 = 0;
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = (i2 + 1) * 8;
            while (i5 < i2 * 8) {
                sb.append(mneVar.b[((int) (j >>> ((i7 - i4) - i5))) & mneVar.c]);
                i5 += i4;
            }
            if (this.b != null) {
                while (i5 < mneVar.f * 8) {
                    sb.append('=');
                    i5 += i4;
                }
                return;
            }
            return;
        }
        p1a.g();
    }

    public final String c(byte[] bArr, int i) {
        ctd.C(0, i, bArr.length);
        mne mneVar = this.a;
        int i2 = mneVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(mneVar.e * rae.p(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            vs.j(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xne) {
            xne xneVar = (xne) obj;
            if (this.a.equals(xneVar.a) && Objects.equals(this.b, xneVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        mne mneVar = this.a;
        sb.append(mneVar);
        if (8 % mneVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public xne(String str, String str2) {
        this(new mne(str, str2.toCharArray()), (Character) '=');
    }
}
