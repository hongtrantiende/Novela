package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d5a  reason: default package */
/* loaded from: classes3.dex */
public final class d5a {
    public final byte[] a;
    public int b;
    public int c;
    public am9 d;
    public boolean e;
    public d5a f;
    public d5a g;

    public d5a() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final int a() {
        return this.a.length - this.c;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final byte c(int i) {
        return this.a[this.b + i];
    }

    public final d5a d() {
        d5a d5aVar = this.f;
        d5a d5aVar2 = this.g;
        if (d5aVar2 != null) {
            d5aVar2.getClass();
            d5aVar2.f = this.f;
        }
        d5a d5aVar3 = this.f;
        if (d5aVar3 != null) {
            d5aVar3.getClass();
            d5aVar3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return d5aVar;
    }

    public final void e(d5a d5aVar) {
        d5aVar.getClass();
        d5aVar.g = this;
        d5aVar.f = this.f;
        d5a d5aVar2 = this.f;
        if (d5aVar2 != null) {
            d5aVar2.g = d5aVar;
        }
        this.f = d5aVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, am9] */
    public final d5a f() {
        am9 am9Var = this.d;
        am9 am9Var2 = am9Var;
        if (am9Var == null) {
            d5a d5aVar = o5a.a;
            ?? obj = new Object();
            this.d = obj;
            am9Var2 = obj;
        }
        int i = this.b;
        int i2 = this.c;
        am9.b.incrementAndGet(am9Var2);
        return new d5a(this.a, i, i2, am9Var2);
    }

    public final void g(d5a d5aVar, int i) {
        d5aVar.getClass();
        if (d5aVar.e) {
            if (d5aVar.c + i > 8192) {
                am9 am9Var = d5aVar.d;
                if (am9Var != null && am9Var.a > 0) {
                    p1a.g();
                    return;
                }
                int i2 = d5aVar.c;
                int i3 = d5aVar.b;
                if ((i2 + i) - i3 <= 8192) {
                    byte[] bArr = d5aVar.a;
                    b00.c0(bArr, 0, i3, bArr, i2, 2);
                    d5aVar.c -= d5aVar.b;
                    d5aVar.b = 0;
                } else {
                    p1a.g();
                    return;
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = d5aVar.a;
            int i4 = d5aVar.c;
            int i5 = this.b;
            b00.U(i4, i5, i5 + i, bArr2, bArr3);
            d5aVar.c += i;
            this.b += i;
            return;
        }
        vs.k("only owner can write");
    }

    public d5a(byte[] bArr, int i, int i2, am9 am9Var) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = am9Var;
        this.e = false;
    }
}
