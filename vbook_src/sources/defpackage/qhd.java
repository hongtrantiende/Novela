package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qhd  reason: default package */
/* loaded from: classes3.dex */
public final class qhd extends n42 {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ od0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhd(od0 od0Var, n42 n42Var) {
        super(n42Var);
        this.d = od0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
