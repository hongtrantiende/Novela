package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                ij ijVar = (ij) this.b;
                Context context = view.getContext();
                if (!ijVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(ijVar.f);
                    ijVar.d = true;
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b9a<ViewParent> ki4Var;
        Boolean bool;
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ij ijVar = (ij) obj;
                Context context = view.getContext();
                if (ijVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(ijVar.f);
                    ijVar.d = false;
                }
                ij.d(ijVar);
                return;
            case 1:
                z0 z0Var = (z0) obj;
                ViewParent parent = z0Var.getParent();
                zcd zcdVar = zcd.a;
                if (parent == null) {
                    ki4Var = qs3.a;
                } else {
                    ki4Var = new ki4(1, new ak9(parent, 12), zcdVar);
                }
                for (ViewParent viewParent : ki4Var) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
                z0Var.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((iya) obj).cancel(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
