package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: coc  reason: default package */
/* loaded from: classes.dex */
public final class coc extends aoc {
    public final st6 d;

    public coc(st6 st6Var) {
        this.d = st6Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new ev7(this.d, objArr[i], objArr[i + 1]);
    }
}
