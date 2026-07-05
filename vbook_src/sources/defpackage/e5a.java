package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e5a  reason: default package */
/* loaded from: classes3.dex */
public final class e5a {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public e5a f;
    public e5a g;

    public e5a(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final e5a a() {
        e5a e5aVar = this.f;
        if (e5aVar == this) {
            e5aVar = null;
        }
        e5a e5aVar2 = this.g;
        e5aVar2.getClass();
        e5aVar2.f = this.f;
        e5a e5aVar3 = this.f;
        e5aVar3.getClass();
        e5aVar3.g = this.g;
        this.f = null;
        this.g = null;
        return e5aVar;
    }

    public final void b(e5a e5aVar) {
        e5aVar.getClass();
        e5aVar.g = this;
        e5aVar.f = this.f;
        e5a e5aVar2 = this.f;
        e5aVar2.getClass();
        e5aVar2.g = e5aVar;
        this.f = e5aVar;
    }

    public final e5a c() {
        this.d = true;
        return new e5a(this.a, this.b, this.c, true, false);
    }

    public final void d(e5a e5aVar, int i) {
        e5aVar.getClass();
        if (e5aVar.e) {
            int i2 = e5aVar.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!e5aVar.d) {
                    int i4 = e5aVar.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = e5aVar.a;
                        b00.c0(bArr, 0, i4, bArr, i2, 2);
                        e5aVar.c -= e5aVar.b;
                        e5aVar.b = 0;
                    } else {
                        p1a.g();
                        return;
                    }
                } else {
                    p1a.g();
                    return;
                }
            }
            byte[] bArr2 = e5aVar.a;
            int i5 = e5aVar.c;
            int i6 = this.b;
            b00.U(i5, i6, i6 + i, this.a, bArr2);
            e5aVar.c += i;
            this.b += i;
            return;
        }
        vs.k("only owner can write");
    }

    public e5a() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
