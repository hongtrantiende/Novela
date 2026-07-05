package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw3  reason: default package */
/* loaded from: classes.dex */
public final class xw3 extends ex3 {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public xw3(String str, String str2, int i) {
        this.c = i;
        if (str.length() != 0) {
            this.a = tte.r(str);
            if ((r4b.Q(str2, "'", false) && r4b.I(str2, "'", false)) || (r4b.Q(str2, "\"", false) && r4b.I(str2, "\"", false))) {
                if (str2.length() > 1) {
                    str2 = str2.substring(1, str2.length() - 1);
                } else {
                    cy7.i("Quoted value must have content");
                    throw null;
                }
            }
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.b = lowerCase;
            return;
        }
        cy7.i("String must not be empty");
        throw null;
    }

    @Override // defpackage.ex3
    public final int a() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        int i = this.c;
        String str = this.b;
        String str2 = this.a;
        cp3Var.getClass();
        cp3Var2.getClass();
        switch (i) {
            case 0:
                if (!cp3Var2.n(str2) || !r4b.J(str, cp3Var2.c(str2), true)) {
                    return false;
                }
                return true;
            case 1:
                if (!cp3Var2.n(str2)) {
                    return false;
                }
                String lowerCase = cp3Var2.c(str2).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!k4b.V(lowerCase, str, false)) {
                    return false;
                }
                return true;
            case 2:
                if (!cp3Var2.n(str2)) {
                    return false;
                }
                String lowerCase2 = cp3Var2.c(str2).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!r4b.I(lowerCase2, str, false)) {
                    return false;
                }
                return true;
            case 3:
                return !r4b.J(str, cp3Var2.c(str2), true);
            default:
                if (!cp3Var2.n(str2)) {
                    return false;
                }
                String lowerCase3 = cp3Var2.c(str2).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                if (!r4b.Q(lowerCase3, str, false)) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return hl5.o("[", this.a, "=", this.b, "]");
            case 1:
                return hl5.o("[", this.a, "*=", this.b, "]");
            case 2:
                return hl5.o("[", this.a, "$=", this.b, "]");
            case 3:
                return hl5.o("[", this.a, "!=", this.b, "]");
            default:
                return hl5.o("[", this.a, "^=", this.b, "]");
        }
    }
}
