package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg5  reason: default package */
/* loaded from: classes3.dex */
public final class mg5 {
    public final vb1 a;
    public int b;
    public int c;
    public q45 d;

    public mg5(vb1 vb1Var) {
        vb1Var.getClass();
        this.a = vb1Var;
        this.d = (q45) ng5.b.I();
    }

    public final tb1 a(String str) {
        if (this.b != 0) {
            int i = wc1.a;
            int abs = Math.abs(wc1.a(0, str.length(), str));
            int i2 = this.c;
            while (true) {
                int i3 = abs % i2;
                int i4 = i3 * 6;
                if (this.d.a(i4) != -1) {
                    if (b(str, i4)) {
                        return (tb1) this.a.subSequence(this.d.a(i4 + 3), this.d.a(i4 + 4));
                    }
                    abs = i3 + 1;
                    i2 = this.c;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final boolean b(CharSequence charSequence, int i) {
        int a = this.d.a(i + 1);
        int a2 = this.d.a(i + 2);
        int i2 = wc1.a;
        vb1 vb1Var = this.a;
        vb1Var.getClass();
        if (a2 - a == charSequence.length()) {
            for (int i3 = a; i3 < a2; i3++) {
                int charAt = vb1Var.charAt(i3);
                if (65 <= charAt && charAt < 91) {
                    charAt += 32;
                }
                int charAt2 = charSequence.charAt(i3 - a);
                if (65 <= charAt2 && charAt2 < 91) {
                    charAt2 += 32;
                }
                if (charAt != charAt2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        int i7 = this.c;
        if (i6 >= i7 * 0.75d) {
            q45 q45Var = this.d;
            this.b = 0;
            this.c = (i7 * 2) | Token.CASE;
            q45 q45Var2 = (q45) ng5.b.I();
            int size = (q45Var.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                q45Var2.a.add(ng5.a.I());
            }
            this.d = q45Var2;
            c9a O = h9a.O(new p45(q45Var, null, 0));
            while (O.hasNext()) {
                int intValue = ((Number) O.next()).intValue();
                c(q45Var.a(intValue + 1), q45Var.a(intValue + 2), q45Var.a(intValue + 3), q45Var.a(intValue + 4));
            }
            ng5.b.R0(q45Var);
            if (i6 != this.b) {
                vs.m("Failed requirement.");
                return;
            }
        }
        vb1 vb1Var = this.a;
        int abs = Math.abs(wc1.a(i, i2, vb1Var));
        CharSequence subSequence = vb1Var.subSequence(i, i2);
        int i9 = abs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(subSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.b(i5, abs);
        this.d.b(i5 + 1, i);
        this.d.b(i5 + 2, i2);
        this.d.b(i5 + 3, i3);
        this.d.b(i5 + 4, i4);
        this.d.b(i5 + 5, -1);
        if (i10 != -1) {
            this.d.b((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final void d() {
        this.b = 0;
        this.c = 0;
        r01 r01Var = ng5.b;
        r01Var.R0(this.d);
        this.d = (q45) r01Var.I();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        r01 r01Var = ng5.a;
        q45 q45Var = this.d;
        q45Var.getClass();
        c9a O = h9a.O(new p45(q45Var, null, 0));
        while (O.hasNext()) {
            int intValue = ((Number) O.next()).intValue();
            sb.append((CharSequence) "");
            int a = this.d.a(intValue + 1);
            int a2 = this.d.a(intValue + 2);
            vb1 vb1Var = this.a;
            sb.append(vb1Var.subSequence(a, a2));
            sb.append((CharSequence) " => ");
            sb.append((CharSequence) ((tb1) vb1Var.subSequence(this.d.a(intValue + 3), this.d.a(intValue + 4))));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }
}
