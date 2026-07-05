package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v1c  reason: default package */
/* loaded from: classes3.dex */
public final class v1c extends n42 {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x1c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1c(x1c x1cVar, n42 n42Var) {
        super(n42Var);
        this.c = x1cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
