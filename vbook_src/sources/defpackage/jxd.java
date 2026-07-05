package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jxd  reason: default package */
/* loaded from: classes.dex */
public final class jxd {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ d0e h;
    public final o0e i;

    public jxd(d0e d0eVar, String str, int i, o0e o0eVar, int i2) {
        this.g = i2;
        this.h = d0eVar;
        this.a = str;
        this.b = i;
        this.i = o0eVar;
    }

    public static Boolean c(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static Boolean d(String str, jme jmeVar, ppe ppeVar) {
        String v;
        List<String> y;
        String str2;
        int i;
        am8.s(jmeVar);
        if (str != null && jmeVar.t() && jmeVar.B() != 1 && (jmeVar.B() != 7 ? jmeVar.u() : jmeVar.z() != 0)) {
            int B = jmeVar.B();
            boolean x = jmeVar.x();
            if (!x && B != 2 && B != 7) {
                v = jmeVar.v().toUpperCase(Locale.ENGLISH);
            } else {
                v = jmeVar.v();
            }
            if (jmeVar.z() == 0) {
                y = null;
            } else {
                y = jmeVar.y();
                if (!x) {
                    ArrayList arrayList = new ArrayList(y.size());
                    for (String str3 : y) {
                        arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                    }
                    y = Collections.unmodifiableList(arrayList);
                }
            }
            if (B == 2) {
                str2 = v;
            } else {
                str2 = null;
            }
            if (B != 7 ? v != null : y != null && !y.isEmpty()) {
                if (!x && B != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (B - 1) {
                    case 1:
                        if (str2 != null) {
                            if (true != x) {
                                i = 66;
                            } else {
                                i = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (ppeVar != null) {
                                    ppeVar.E.f(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(v));
                    case 3:
                        return Boolean.valueOf(str.endsWith(v));
                    case 4:
                        return Boolean.valueOf(str.contains(v));
                    case 5:
                        return Boolean.valueOf(str.equals(v));
                    case 6:
                        if (y != null) {
                            return Boolean.valueOf(y.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, yle yleVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        am8.s(yleVar);
        if (yleVar.t()) {
            boolean z = true;
            if (yleVar.D() != 1 && (yleVar.D() != 5 ? yleVar.w() : yleVar.y() && yleVar.A())) {
                int D = yleVar.D();
                try {
                    if (yleVar.D() == 5) {
                        if (e6f.B0(yleVar.z()) && e6f.B0(yleVar.B())) {
                            BigDecimal bigDecimal5 = new BigDecimal(yleVar.z());
                            bigDecimal4 = new BigDecimal(yleVar.B());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (e6f.B0(yleVar.x())) {
                        bigDecimal2 = new BigDecimal(yleVar.x());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (D != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = D - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c9 A[EDGE_INSN: B:233:0x03c9->B:161:0x03c9 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, defpackage.jse r24, long r25, defpackage.zae r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxd.a(java.lang.Long, java.lang.Long, jse, long, zae, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Long r16, java.lang.Long r17, defpackage.wue r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxd.b(java.lang.Long, java.lang.Long, wue, boolean):boolean");
    }
}
