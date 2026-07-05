package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mi  reason: default package */
/* loaded from: classes3.dex */
public final class mi extends n42 {
    public pf3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ni c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ni niVar, m42 m42Var) {
        super(m42Var);
        this.c = niVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
