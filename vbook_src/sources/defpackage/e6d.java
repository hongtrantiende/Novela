package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e6d  reason: default package */
/* loaded from: classes3.dex */
public final class e6d extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ j6d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6d(j6d j6dVar, n42 n42Var) {
        super(n42Var);
        this.b = j6dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
