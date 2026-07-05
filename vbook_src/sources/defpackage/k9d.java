package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k9d  reason: default package */
/* loaded from: classes.dex */
public final class k9d extends n42 {
    public vad a;
    public g60 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q9d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(q9d q9dVar, n42 n42Var) {
        super(n42Var);
        this.d = q9dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
