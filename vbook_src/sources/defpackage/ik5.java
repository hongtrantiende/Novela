package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik5  reason: default package */
/* loaded from: classes3.dex */
public final class ik5 extends rqe {
    public static final /* synthetic */ int o = 0;
    public final String m;
    public final byte[] n;

    static {
        new ik5();
    }

    public ik5() {
        Character valueOf;
        int i;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 256; i2++) {
            sb.append((char) i2);
        }
        String sb2 = sb.toString();
        this.m = sb2;
        if (sb2.length() == 0) {
            valueOf = null;
        } else {
            char charAt = sb2.charAt(0);
            int length = sb2.length() - 1;
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    char charAt2 = sb2.charAt(i3);
                    charAt = charAt < charAt2 ? charAt2 : charAt;
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            valueOf = Character.valueOf(charAt);
        }
        if (valueOf != null) {
            i = (char) (valueOf.charValue() + 1);
        } else {
            i = 0;
        }
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, 0, i, (byte) 63);
        int length2 = this.m.length();
        for (int i4 = 0; i4 < length2; i4++) {
            bArr[this.m.charAt(i4)] = (byte) i4;
        }
        this.n = bArr;
    }

    @Override // defpackage.rqe
    public final int d(StringBuilder sb, byte[] bArr, int i) {
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(this.m.charAt(bArr[i2] & 255));
        }
        return i;
    }

    @Override // defpackage.rqe
    public final void e(b50 b50Var, String str, int i) {
        byte b;
        str.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= 0) {
                byte[] bArr = this.n;
                if (charAt < bArr.length) {
                    b = bArr[charAt];
                    b50Var.b(b);
                }
            }
            b = 63;
            b50Var.b(b);
        }
    }

    @Override // defpackage.rqe
    public final int f(int i) {
        return i;
    }

    @Override // defpackage.rqe
    public final int g(int i) {
        return i;
    }
}
