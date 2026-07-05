package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: joc  reason: default package */
/* loaded from: classes.dex */
public final class joc extends n42 {
    public kw5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ koc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joc(koc kocVar, n42 n42Var) {
        super(n42Var);
        this.c = kocVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(this);
    }
}
