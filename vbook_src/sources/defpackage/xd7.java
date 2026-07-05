package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd7  reason: default package */
/* loaded from: classes3.dex */
public final class xd7 implements vt4 {
    public final /* synthetic */ vl6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qra d;

    public xd7(vl6 vl6Var, String str, boolean z, qra qraVar) {
        this.a = vl6Var;
        this.b = str;
        this.c = z;
        this.d = qraVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        vl6 vl6Var = this.a;
        boolean contains = vl6Var.g.contains(this.b);
        boolean z = !this.c;
        String str = vl6Var.a;
        qra qraVar = this.d;
        if (z == contains) {
            qraVar.remove(str);
        } else {
            qraVar.put(str, Boolean.valueOf(z));
        }
        return pvc.a;
    }
}
