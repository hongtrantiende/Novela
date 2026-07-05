package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g8b  reason: default package */
/* loaded from: classes3.dex */
public final class g8b extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ i8b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8b(i8b i8bVar, n42 n42Var) {
        super(n42Var);
        this.b = i8bVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
