package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc1  reason: default package */
/* loaded from: classes.dex */
public final class lc1 implements Iterable, j76 {
    public final char a;
    public final char b;
    public final int c = 1;

    static {
        new lc1((char) 1, (char) 0);
    }

    public lc1(char c, char c2) {
        this.a = c;
        this.b = (char) vae.j(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lc1) {
            char c = this.a;
            char c2 = this.b;
            if (c > c2) {
                lc1 lc1Var = (lc1) obj;
                if (lc1Var.a > lc1Var.b) {
                    return true;
                }
            }
            lc1 lc1Var2 = (lc1) obj;
            if (c == lc1Var2.a && c2 == lc1Var2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (c > c2) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jc1(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
