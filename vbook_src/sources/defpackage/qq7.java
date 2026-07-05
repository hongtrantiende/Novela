package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq7  reason: default package */
/* loaded from: classes3.dex */
public final class qq7 extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq7(bb bbVar, m42 m42Var) {
        super(m42Var);
        this.b = bbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
