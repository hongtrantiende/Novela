package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c1b  reason: default package */
/* loaded from: classes3.dex */
public final class c1b extends n42 {
    public e1b a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e1b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1b(e1b e1bVar, n42 n42Var) {
        super(n42Var);
        this.c = e1bVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(0L, null, 0, 0, this);
    }
}
