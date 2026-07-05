package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hwe  reason: default package */
/* loaded from: classes.dex */
public final class hwe {
    public static final hwe c = new hwe(100);
    public final EnumMap a;
    public final int b;

    public hwe(int i) {
        EnumMap enumMap = new EnumMap(dwe.class);
        this.a = enumMap;
        dwe dweVar = dwe.AD_STORAGE;
        yve yveVar = yve.UNINITIALIZED;
        enumMap.put((EnumMap) dweVar, (dwe) yveVar);
        enumMap.put((EnumMap) dwe.ANALYTICS_STORAGE, (dwe) yveVar);
        this.b = i;
    }

    public static String a(int i) {
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            if (i != 90) {
                                if (i != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static hwe b(int i, Bundle bundle) {
        dwe[] dweVarArr;
        if (bundle == null) {
            return new hwe(i);
        }
        EnumMap enumMap = new EnumMap(dwe.class);
        for (dwe dweVar : awe.STORAGE.a) {
            enumMap.put((EnumMap) dweVar, (dwe) d(bundle.getString(dweVar.a)));
        }
        return new hwe(enumMap, i);
    }

    public static hwe c(int i, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(dwe.class);
        dwe[] dweVarArr = awe.STORAGE.a;
        for (int i2 = 0; i2 < dweVarArr.length; i2++) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            dwe dweVar = dweVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) dweVar, (dwe) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) dweVar, (dwe) yve.UNINITIALIZED);
            }
        }
        return new hwe(enumMap, i);
    }

    public static yve d(String str) {
        yve yveVar = yve.UNINITIALIZED;
        if (str == null) {
            return yveVar;
        }
        if (str.equals("granted")) {
            return yve.GRANTED;
        }
        if (str.equals("denied")) {
            return yve.DENIED;
        }
        return yveVar;
    }

    public static yve e(char c2) {
        if (c2 != '+') {
            if (c2 != '0') {
                if (c2 != '1') {
                    return yve.UNINITIALIZED;
                }
                return yve.GRANTED;
            }
            return yve.DENIED;
        }
        return yve.POLICY;
    }

    public static char h(yve yveVar) {
        if (yveVar != null) {
            int ordinal = yveVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 != -30) {
                i = -20;
            } else {
                return true;
            }
        }
        if (i == -30) {
            if (i2 == -20) {
                return true;
            }
        } else {
            i3 = i;
        }
        if (i3 != i2 && i >= i2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hwe) {
            hwe hweVar = (hwe) obj;
            dwe[] dweVarArr = awe.STORAGE.a;
            int length = dweVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    dwe dweVar = dweVarArr[i];
                    if (this.a.get(dweVar) != hweVar.a.get(dweVar)) {
                        break;
                    }
                    i++;
                } else if (this.b == hweVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (dwe dweVar : awe.STORAGE.a) {
            yve yveVar = (yve) this.a.get(dweVar);
            char c2 = '-';
            if (yveVar != null && (ordinal = yveVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c2 = '0';
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (dwe dweVar : awe.STORAGE.a) {
            sb.append(h((yve) this.a.get(dweVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.b * 17;
        for (yve yveVar : this.a.values()) {
            i = (i * 31) + yveVar.hashCode();
        }
        return i;
    }

    public final boolean i(dwe dweVar) {
        if (((yve) this.a.get(dweVar)) == yve.DENIED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hwe j(defpackage.hwe r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<dwe> r1 = defpackage.dwe.class
            r0.<init>(r1)
            awe r1 = defpackage.awe.STORAGE
            dwe[] r1 = r1.a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            yve r5 = (defpackage.yve) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            yve r6 = (defpackage.yve) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            yve r7 = defpackage.yve.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            yve r7 = defpackage.yve.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            yve r7 = defpackage.yve.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            yve r5 = defpackage.yve.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            hwe r8 = new hwe
            r9 = 100
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwe.j(hwe):hwe");
    }

    public final hwe k(hwe hweVar) {
        dwe[] dweVarArr;
        EnumMap enumMap = new EnumMap(dwe.class);
        for (dwe dweVar : awe.STORAGE.a) {
            yve yveVar = (yve) this.a.get(dweVar);
            if (yveVar == yve.UNINITIALIZED) {
                yveVar = (yve) hweVar.a.get(dweVar);
            }
            if (yveVar != null) {
                enumMap.put((EnumMap) dweVar, (dwe) yveVar);
            }
        }
        return new hwe(enumMap, this.b);
    }

    public final String toString() {
        dwe[] dweVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (dwe dweVar : awe.STORAGE.a) {
            sb.append(",");
            sb.append(dweVar.a);
            sb.append("=");
            yve yveVar = (yve) this.a.get(dweVar);
            if (yveVar == null) {
                yveVar = yve.UNINITIALIZED;
            }
            sb.append(yveVar);
        }
        return sb.toString();
    }

    public hwe(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(dwe.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
