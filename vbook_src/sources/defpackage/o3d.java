package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o3d  reason: default package */
/* loaded from: classes3.dex */
public final class o3d extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ s3d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3d(s3d s3dVar, n42 n42Var) {
        super(n42Var);
        this.b = s3dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return s3d.b(this.b, null, null, false, null, this);
    }
}
