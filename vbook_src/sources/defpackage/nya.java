package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nya  reason: default package */
/* loaded from: classes.dex */
public final class nya implements o4d {
    public final o4d a;
    public final long b;

    public nya(o4d o4dVar, long j) {
        this.a = o4dVar;
        this.b = j;
    }

    @Override // defpackage.o4d
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nya)) {
            return false;
        }
        nya nyaVar = (nya) obj;
        if (nyaVar.b != this.b || !c16.i(nyaVar.a, this.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o4d
    public final long h(js jsVar, js jsVar2, js jsVar3) {
        return this.a.h(jsVar, jsVar2, jsVar3) + this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.o4d
    public final js l(long j, js jsVar, js jsVar2, js jsVar3) {
        long j2 = this.b;
        if (j < j2) {
            return jsVar3;
        }
        return this.a.l(j - j2, jsVar, jsVar2, jsVar3);
    }

    @Override // defpackage.o4d
    public final js u(long j, js jsVar, js jsVar2, js jsVar3) {
        long j2 = this.b;
        if (j < j2) {
            return jsVar;
        }
        return this.a.u(j - j2, jsVar, jsVar2, jsVar3);
    }
}
