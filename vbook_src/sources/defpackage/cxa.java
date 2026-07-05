package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cxa  reason: default package */
/* loaded from: classes.dex */
public final class cxa implements Iterator {
    public int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ exa E;
    public String b;
    public final CharSequence c;
    public final ec1 d;
    public final boolean e;
    public int a = 2;
    public int f = 0;

    public cxa(exa exaVar, uu5 uu5Var, CharSequence charSequence, int i) {
        this.D = i;
        this.E = exaVar;
        this.d = (ec1) uu5Var.c;
        this.e = uu5Var.a;
        this.C = uu5Var.b;
        this.c = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        r3 = r3 + 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxa.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        xk5.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
