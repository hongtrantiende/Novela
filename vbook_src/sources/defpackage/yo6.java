package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yo6  reason: default package */
/* loaded from: classes.dex */
public final class yo6 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((rl9) this.k.get(i2)).a;
            fl9 fl9Var = (fl9) view3.getLayoutParams();
            if (view3 != view && !fl9Var.a.g() && (b = (fl9Var.a.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                }
                i = b;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((fl9) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(kl9 kl9Var) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((rl9) this.k.get(i)).a;
                fl9 fl9Var = (fl9) view.getLayoutParams();
                if (!fl9Var.a.g() && this.d == fl9Var.a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = kl9Var.n(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}
