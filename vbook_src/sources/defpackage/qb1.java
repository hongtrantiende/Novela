package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb1  reason: default package */
/* loaded from: classes.dex */
public final class qb1 extends wk5 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final wk5[] g;

    public qb1(String str, int i, int i2, long j, long j2, wk5[] wk5VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = wk5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qb1.class == obj.getClass()) {
                qb1 qb1Var = (qb1) obj;
                if (this.c == qb1Var.c && this.d == qb1Var.d && this.e == qb1Var.e && this.f == qb1Var.f && this.b.equals(qb1Var.b) && Arrays.equals(this.g, qb1Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
