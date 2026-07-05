package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ls5  reason: default package */
/* loaded from: classes.dex */
public final class ls5 extends hs5 {
    @Override // defpackage.hs5
    public final hs5 a(Object obj) {
        b(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        yte.o(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final mm9 g() {
        this.c = true;
        return qs5.h(this.b, this.a);
    }
}
