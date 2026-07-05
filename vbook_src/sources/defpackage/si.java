package defpackage;

import android.view.DragEvent;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: si  reason: default package */
/* loaded from: classes.dex */
public final class si implements View.OnDragListener, gh3 {
    public final hh3 a = new hh3(null, 3);
    public final a00 b = new a00(0);
    public final ri c = new ri(this);

    /* JADX WARN: Type inference failed for: r6v2, types: [vl9, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        bh3 bh3Var = new bh3(dragEvent);
        int action = dragEvent.getAction();
        a00 a00Var = this.b;
        hh3 hh3Var = this.a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                gp gpVar = new gp(3, bh3Var, hh3Var, obj);
                if (gpVar.invoke(hh3Var) == qnc.a) {
                    dae.H(hh3Var, gpVar);
                }
                boolean z = obj.a;
                a00Var.getClass();
                uz uzVar = new uz(a00Var);
                while (uzVar.hasNext()) {
                    ((ih3) uzVar.next()).T0(bh3Var);
                }
                return z;
            case 2:
                hh3Var.U0(bh3Var);
                return false;
            case 3:
                return hh3Var.q1(bh3Var);
            case 4:
                hh3Var.d0(bh3Var);
                a00Var.clear();
                return false;
            case 5:
                hh3Var.S(bh3Var);
                return false;
            case 6:
                hh3Var.M0(bh3Var);
                return false;
            default:
                return false;
        }
    }
}
