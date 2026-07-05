package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qxc  reason: default package */
/* loaded from: classes.dex */
public final class qxc extends n42 {
    public hu4 a;
    public vt4 b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rxc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxc(rxc rxcVar, n42 n42Var) {
        super(n42Var);
        this.e = rxcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
