package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sb1  reason: default package */
/* loaded from: classes.dex */
public final class sb1 extends wk5 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final wk5[] f;

    public sb1(String str, boolean z, boolean z2, String[] strArr, wk5[] wk5VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = wk5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sb1.class == obj.getClass()) {
                sb1 sb1Var = (sb1) obj;
                if (this.c == sb1Var.c && this.d == sb1Var.d && this.b.equals(sb1Var.b) && Arrays.equals(this.e, sb1Var.e) && Arrays.equals(this.f, sb1Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
