package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cv  reason: default package */
/* loaded from: classes3.dex */
public final class cv extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ev b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(ev evVar, n42 n42Var) {
        super(n42Var);
        this.b = evVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
