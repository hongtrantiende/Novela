package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dz8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dz8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dz8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        yk9 adapter;
        int D;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qz8 qz8Var = (qz8) obj;
                qz8Var.o(!qz8Var.N0);
                return;
            case 1:
                qz8 qz8Var2 = ((ez8) obj).f;
                cz8 cz8Var = qz8Var2.M0;
                if (cz8Var != null && ((i04) cz8Var).v(29)) {
                    kjc u = ((i04) qz8Var2.M0).u();
                    cz8 cz8Var2 = qz8Var2.M0;
                    gy2 gy2Var = (gy2) u;
                    gy2Var.getClass();
                    fy2 fy2Var = new fy2(gy2Var);
                    fy2Var.b(1);
                    fy2Var.i(1, false);
                    ((i04) cz8Var2).P(fy2Var.a());
                    qz8Var2.I.d[1] = qz8Var2.getResources().getString(R.string.exo_track_selection_auto);
                    qz8Var2.N.dismiss();
                    return;
                }
                return;
            case 2:
                kz8 kz8Var = (kz8) obj;
                qz8 qz8Var3 = kz8Var.w;
                int i2 = -1;
                if (kz8Var.r != null && (recyclerView = kz8Var.q) != null && (adapter = recyclerView.getAdapter()) != null && (D = kz8Var.q.D(kz8Var)) != -1 && kz8Var.r == adapter) {
                    i2 = D;
                }
                View view2 = qz8Var3.f0;
                if (i2 == 0) {
                    iz8 iz8Var = qz8Var3.J;
                    view2.getClass();
                    qz8Var3.e(iz8Var, view2);
                    return;
                } else if (i2 == 1) {
                    ez8 ez8Var = qz8Var3.L;
                    view2.getClass();
                    qz8Var3.e(ez8Var, view2);
                    return;
                } else {
                    qz8Var3.N.dismiss();
                    return;
                }
            case 3:
                qz8 qz8Var4 = ((ez8) obj).f;
                cz8 cz8Var3 = qz8Var4.M0;
                if (cz8Var3 != null && ((i04) cz8Var3).v(29)) {
                    kjc u2 = ((i04) qz8Var4.M0).u();
                    cz8 cz8Var4 = qz8Var4.M0;
                    gy2 gy2Var2 = (gy2) u2;
                    gy2Var2.getClass();
                    fy2 fy2Var2 = new fy2(gy2Var2);
                    fy2Var2.b(3);
                    fy2Var2.d();
                    fy2Var2.f(null);
                    fy2Var2.h();
                    ((i04) cz8Var4).P(fy2Var2.a());
                    qz8Var4.N.dismiss();
                    return;
                }
                return;
            default:
                vz8 vz8Var = (vz8) obj;
                vz8Var.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    vz8Var.r.start();
                    return;
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    vz8Var.s.start();
                    return;
                } else {
                    return;
                }
        }
    }
}
