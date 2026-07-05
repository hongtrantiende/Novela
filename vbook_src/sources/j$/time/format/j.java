package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final SignStyle d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0134, code lost:
        r5 = r12;
        r2 = r20;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.A(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            if (i <= 0 || this.b != this.c || this.d != SignStyle.NOT_NEGATIVE) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        SignStyle signStyle = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        } else if (i2 == i && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        } else {
            return "Value(" + temporalField + "," + i2 + "," + i + "," + signStyle + ")";
        }
    }

    @Override // j$.time.format.e
    public boolean v(x xVar, StringBuilder sb) {
        String l;
        TemporalField temporalField = this.a;
        Long a = xVar.a(temporalField);
        if (a == null) {
            return false;
        }
        long a2 = a(xVar, a.longValue());
        b0 b0Var = xVar.b.c;
        if (a2 == Long.MIN_VALUE) {
            l = "9223372036854775808";
        } else {
            l = Long.toString(Math.abs(a2));
        }
        int length = l.length();
        int i = this.c;
        if (length <= i) {
            b0Var.getClass();
            int i2 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            int i3 = this.b;
            SignStyle signStyle = this.d;
            if (i2 >= 0) {
                int i4 = b.a[signStyle.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        sb.append('+');
                    }
                } else if (i3 < 19 && a2 >= f[i3]) {
                    sb.append('+');
                }
            } else {
                int i5 = b.a[signStyle.ordinal()];
                if (i5 != 1 && i5 != 2 && i5 != 3) {
                    if (i5 == 4) {
                        throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
                    }
                } else {
                    sb.append('-');
                }
            }
            for (int i6 = 0; i6 < i3 - l.length(); i6++) {
                sb.append('0');
            }
            sb.append(l);
            return true;
        }
        throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i);
    }

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = i3;
    }

    public long a(x xVar, long j) {
        return j;
    }
}
