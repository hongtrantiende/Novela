package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ww3  reason: default package */
/* loaded from: classes.dex */
public final class ww3 extends ex3 {
    public final /* synthetic */ int a;
    public final String b;

    public ww3(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                str.getClass();
                this.b = str;
                return;
            case 3:
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                this.b = lowerCase;
                return;
            case 4:
                String lowerCase2 = d4b.k(str).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                this.b = lowerCase2;
                return;
            case 5:
                String lowerCase3 = d4b.k(str).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                this.b = lowerCase3;
                return;
            case 6:
            case 7:
            case 8:
            default:
                String lowerCase4 = str.toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                this.b = lowerCase4;
                return;
            case 9:
                str.getClass();
                this.b = str;
                return;
        }
    }

    @Override // defpackage.ex3
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        String str;
        int i = this.a;
        String str2 = "";
        String str3 = this.b;
        cp3Var.getClass();
        cp3Var2.getClass();
        switch (i) {
            case 0:
                return cp3Var2.n(str3);
            case 1:
                for (g40 g40Var : cp3Var2.e().c()) {
                    String str4 = g40Var.a;
                    if (str4 == null) {
                        str = "";
                    } else {
                        str = str4.toLowerCase(Locale.ROOT);
                        str.getClass();
                    }
                    if (r4b.Q(str, str3, false)) {
                        return true;
                    }
                }
                return false;
            case 2:
                String str5 = this.b;
                str5.getClass();
                j40 j40Var = cp3Var2.D;
                if (j40Var != null) {
                    String h = j40Var.h("class");
                    int length = h.length();
                    int length2 = str5.length();
                    if (length != 0 && length >= length2) {
                        if (length == length2) {
                            return str5.equalsIgnoreCase(h);
                        }
                        boolean z = false;
                        int i2 = 0;
                        for (int i3 = 0; i3 < length; i3++) {
                            if (nqe.y(h.charAt(i3))) {
                                if (!z) {
                                    continue;
                                } else if (i3 - i2 == length2 && h.regionMatches(true, i2, str5, 0, length2)) {
                                    return true;
                                } else {
                                    z = false;
                                }
                            } else if (!z) {
                                i2 = i3;
                                z = true;
                            }
                        }
                        if (z && length - i2 == length2) {
                            return h.regionMatches(true, i2, str5, 0, length2);
                        }
                    }
                }
                return false;
            case 3:
                StringBuilder b = d4b.b();
                new q6(b, 13).u(cp3Var2);
                String lowerCase = d4b.l(b).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return k4b.V(lowerCase, str3, false);
            case 4:
                String V = cp3Var2.V();
                if (V != null) {
                    str2 = V.toLowerCase(Locale.ROOT);
                    str2.getClass();
                }
                return k4b.V(str2, str3, false);
            case 5:
                String Z = cp3Var2.Z();
                if (Z != null) {
                    str2 = Z.toLowerCase(Locale.ROOT);
                    str2.getClass();
                }
                return k4b.V(str2, str3, false);
            case 6:
                return k4b.V(g9a.d0(new ki4(3, sl1.V(cp3Var2.h()), new u83(21)), ""), str3, false);
            case 7:
                return k4b.V(g9a.d0(new ki4(3, g9a.b0(new n38(cp3Var2, cm9.a(y28.class))), new u83(21)), ""), str3, false);
            case 8:
                j40 j40Var2 = cp3Var2.D;
                if (j40Var2 != null) {
                    str2 = j40Var2.h("id");
                }
                return str3.equals(str2);
            case 9:
                return cp3Var2.r(str3);
            case 10:
                return r4b.I(cp3Var2.e.b, str3, false);
            default:
                return r4b.Q(cp3Var2.e.b, str3, false);
        }
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return hl5.n("[", str, "]");
            case 1:
                return hl5.n("[^", str, "]");
            case 2:
                return s21.m(".", str);
            case 3:
                return hl5.n(":containsData(", str, ")");
            case 4:
                return hl5.n(":containsOwn(", str, ")");
            case 5:
                return hl5.n(":contains(", str, ")");
            case 6:
                return hl5.n(":containsWholeOwnText(", str, ")");
            case 7:
                return hl5.n(":containsWholeText(", str, ")");
            case 8:
                return "#".concat(str);
            case 9:
                return str;
            case 10:
                return "*|".concat(str);
            default:
                return str.concat("|*");
        }
    }

    public /* synthetic */ ww3(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }
}
