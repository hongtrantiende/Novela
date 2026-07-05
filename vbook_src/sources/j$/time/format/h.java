package j$.time.format;

import j$.time.temporal.ChronoField;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class h implements e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt >= '0' && charAt <= '9') {
            return charAt - '0';
        }
        return -1;
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        int i2;
        int b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                int length = charSequence.length();
                if (vVar.h(charSequence, i, "GMT", 0, 3)) {
                    int i8 = i + 3;
                    if (i8 == length) {
                        return vVar.g(ChronoField.OFFSET_SECONDS, 0L, i, i8);
                    }
                    char charAt = charSequence.charAt(i8);
                    if (charAt == '+') {
                        i2 = 1;
                    } else if (charAt == '-') {
                        i2 = -1;
                    } else {
                        return vVar.g(ChronoField.OFFSET_SECONDS, 0L, i, i8);
                    }
                    int i9 = i + 4;
                    int i10 = 0;
                    if (((e0) obj) == e0.FULL) {
                        int i11 = i + 5;
                        int b2 = b(charSequence, i9);
                        int i12 = i + 6;
                        int b3 = b(charSequence, i11);
                        if (b2 >= 0 && b3 >= 0) {
                            int i13 = i + 7;
                            if (charSequence.charAt(i12) == ':') {
                                b = (b2 * 10) + b3;
                                int b4 = b(charSequence, i13);
                                i6 = i + 9;
                                int b5 = b(charSequence, i + 8);
                                if (b4 >= 0 && b5 >= 0) {
                                    i5 = (b4 * 10) + b5;
                                    int i14 = i + 11;
                                    if (i14 < length && charSequence.charAt(i6) == ':') {
                                        int b6 = b(charSequence, i + 10);
                                        int b7 = b(charSequence, i14);
                                        if (b6 >= 0 && b7 >= 0) {
                                            i10 = (b6 * 10) + b7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i3 = i10;
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i15 = i + 5;
                        b = b(charSequence, i9);
                        if (b >= 0) {
                            if (i15 < length) {
                                int b8 = b(charSequence, i15);
                                if (b8 >= 0) {
                                    b = (b * 10) + b8;
                                    i15 = i + 6;
                                }
                                int i16 = i15 + 2;
                                if (i16 < length && charSequence.charAt(i15) == ':' && i16 < length && charSequence.charAt(i15) == ':') {
                                    int b9 = b(charSequence, i15 + 1);
                                    int b10 = b(charSequence, i16);
                                    if (b9 >= 0 && b10 >= 0) {
                                        i5 = (b9 * 10) + b10;
                                        int i17 = i15 + 3;
                                        int i18 = i15 + 5;
                                        if (i18 < length && charSequence.charAt(i17) == ':') {
                                            int b11 = b(charSequence, i15 + 4);
                                            int b12 = b(charSequence, i18);
                                            if (b11 >= 0 && b12 >= 0) {
                                                i10 = (b11 * 10) + b12;
                                                i6 = i15 + 6;
                                                i3 = i10;
                                                i4 = i6;
                                            }
                                        }
                                        i4 = i17;
                                        i3 = 0;
                                    }
                                }
                            }
                            i3 = 0;
                            i4 = i15;
                            return vVar.g(ChronoField.OFFSET_SECONDS, ((i10 * 60) + (b * 3600) + i3) * i2, i, i4);
                        }
                    }
                    i10 = i5;
                    return vVar.g(ChronoField.OFFSET_SECONDS, ((i10 * 60) + (b * 3600) + i3) * i2, i, i4);
                }
                return ~i;
            default:
                String str = (String) obj;
                if (i <= charSequence.length() && i >= 0) {
                    if (!vVar.h(charSequence, i, str, 0, str.length())) {
                        return ~i;
                    }
                    return str.length() + i;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "LocalizedOffset(" + ((e0) obj) + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Long a = xVar.a(ChronoField.OFFSET_SECONDS);
                if (a == null) {
                    return false;
                }
                sb.append("GMT");
                int intExact = Math.toIntExact(a.longValue());
                if (intExact == 0) {
                    return true;
                }
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                if (intExact < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb.append(str);
                if (((e0) obj) == e0.FULL) {
                    a(sb, abs);
                    sb.append(':');
                    a(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                    sb.append(':');
                    a(sb, abs3);
                    return true;
                }
                if (abs >= 10) {
                    sb.append((char) ((abs / 10) + 48));
                }
                sb.append((char) ((abs % 10) + 48));
                if (abs2 == 0 && abs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, abs2);
                if (abs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, abs3);
                return true;
            default:
                sb.append((String) obj);
                return true;
        }
    }
}
