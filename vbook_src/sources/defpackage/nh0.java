package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh0  reason: default package */
/* loaded from: classes.dex */
public class nh0 {
    public static final mh0 d;
    public static final lh0 e;
    public final kh0 a;
    public final Character b;
    public volatile nh0 c;

    static {
        new mh0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        d = new mh0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new nh0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new nh0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new lh0(new kh0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public nh0(kh0 kh0Var, Character ch) {
        boolean z;
        this.a = kh0Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = kh0Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                wq9.u(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        wq9.u(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        wq9.B(0, length, bArr.length);
        kh0 kh0Var = this.a;
        int i = kh0Var.e;
        int i2 = kh0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(n4f.n(length, i2) * i);
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            vs.j(e2);
            return null;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        boolean z;
        wq9.B(i, i + i2, bArr.length);
        kh0 kh0Var = this.a;
        int i3 = kh0Var.f;
        int i4 = kh0Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(kh0Var.b[((int) (j >>> (i7 - i5))) & kh0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < kh0Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        wq9.B(0, i, bArr.length);
        while (i2 < i) {
            kh0 kh0Var = this.a;
            b(sb, bArr, i2, Math.min(kh0Var.f, i - i2));
            i2 += kh0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nh0) {
            nh0 nh0Var = (nh0) obj;
            if (this.a.equals(nh0Var.a) && Objects.equals(this.b, nh0Var.b)) {
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
        kh0 kh0Var = this.a;
        sb.append(kh0Var);
        if (8 % kh0Var.d != 0) {
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

    public nh0(String str, String str2) {
        this(new kh0(str, str2.toCharArray()), (Character) '=');
    }
}
