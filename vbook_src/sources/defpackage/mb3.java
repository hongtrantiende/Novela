package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb3  reason: default package */
/* loaded from: classes.dex */
public final class mb3 extends fb6 implements vt4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s26 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb3(boolean z, s26 s26Var, String str) {
        super(0);
        this.a = z;
        this.b = s26Var;
        this.c = str;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        if (this.a) {
            s26 s26Var = this.b;
            String str = this.c;
            sy9 sy9Var = (sy9) s26Var.b;
            synchronized (sy9Var.c) {
                ry9 ry9Var = (ry9) sy9Var.d.remove(str);
            }
        }
        return pvc.a;
    }
}
