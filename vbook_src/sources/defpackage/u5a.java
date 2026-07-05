package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u5a  reason: default package */
/* loaded from: classes3.dex */
public final class u5a {
    public final Object a;
    public final mu4 b;
    public final mu4 c;
    public final Object d;
    public final aab e;
    public final mu4 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ w5a i;

    public u5a(w5a w5aVar, Object obj, mu4 mu4Var, mu4 mu4Var2, lie lieVar, aab aabVar, mu4 mu4Var3) {
        this.i = w5aVar;
        this.a = obj;
        this.b = mu4Var;
        this.c = mu4Var2;
        this.d = lieVar;
        this.e = aabVar;
        this.f = mu4Var3;
    }

    public final void a() {
        kb3 kb3Var;
        Object obj = this.g;
        if (obj instanceof f5a) {
            ((f5a) obj).m(this.h, this.i.a);
            return;
        }
        if (obj instanceof kb3) {
            kb3Var = (kb3) obj;
        } else {
            kb3Var = null;
        }
        if (kb3Var != null) {
            kb3Var.a();
        }
    }
}
