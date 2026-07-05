package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dx1  reason: default package */
/* loaded from: classes3.dex */
public final class dx1 extends ih1 {
    public final boolean d;

    public dx1(g06 g06Var, boolean z) {
        super(g06Var, 2);
        this.d = z;
    }

    @Override // defpackage.ih1
    public final void e(byte b) {
        if (this.d) {
            k(String.valueOf(b & 255));
            return;
        }
        String valueOf = String.valueOf(b & 255);
        valueOf.getClass();
        ((g06) this.c).j(valueOf);
    }

    @Override // defpackage.ih1
    public final void h(int i) {
        if (this.d) {
            k(Long.toString(i & 4294967295L, 10));
            return;
        }
        String l = Long.toString(i & 4294967295L, 10);
        l.getClass();
        ((g06) this.c).j(l);
    }

    @Override // defpackage.ih1
    public final void i(long j) {
        int i = 63;
        String str = "0";
        if (this.d) {
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i2 != 0) {
                if (i2 > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (i3 > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((g06) this.c).j(str);
    }

    @Override // defpackage.ih1
    public final void j(short s) {
        if (this.d) {
            k(String.valueOf(s & 65535));
            return;
        }
        String valueOf = String.valueOf(s & 65535);
        valueOf.getClass();
        ((g06) this.c).j(valueOf);
    }
}
