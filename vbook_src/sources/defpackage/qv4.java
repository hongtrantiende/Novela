package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qv4  reason: default package */
/* loaded from: classes.dex */
public final class qv4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                rv4Var.A--;
                return;
            default:
                rra rraVar = (rra) obj;
                rraVar.k--;
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rv4) obj).A++;
                return;
            default:
                ((rra) obj).k++;
                return;
        }
    }
}
