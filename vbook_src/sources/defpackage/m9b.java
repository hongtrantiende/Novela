package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m9b  reason: default package */
/* loaded from: classes.dex */
public final class m9b extends n42 {
    public n9b a;
    public it4 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n9b d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9b(n9b n9bVar, n42 n42Var) {
        super(n42Var);
        this.d = n9bVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
