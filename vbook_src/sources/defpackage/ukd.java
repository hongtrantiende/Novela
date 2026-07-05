package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ukd  reason: default package */
/* loaded from: classes.dex */
public abstract class ukd {
    public static final tv7 a;

    static {
        long[] jArr = tz9.a;
        a = new tv7();
    }

    public static final px1 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof px1) {
            return (px1) tag;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [zl9, java.lang.Object] */
    public static final kk9 b(View view) {
        d82 d82Var;
        vo voVar;
        xn6 xn6Var;
        if (!view.isAttachedToWindow()) {
            lv5.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        ViewParent q = gue.q(view);
        while (q instanceof View) {
            View view2 = (View) q;
            if (view2.getId() == 16908290) {
                break;
            }
            q = view2.getParent();
            view = view2;
        }
        px1 a2 = a(view);
        if (a2 == null) {
            ((okd) pkd.a.get()).getClass();
            gs3 gs3Var = gs3.a;
            mfb mfbVar = to.I;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d82Var = (d82) to.I.getValue();
            } else {
                d82Var = (d82) to.J.get();
                if (d82Var == null) {
                    vs.k("no AndroidUiDispatcher for this thread");
                    return null;
                }
            }
            d82 plus = d82Var.plus(gs3Var);
            xq7 xq7Var = (xq7) plus.get(zj1.C);
            if (xq7Var != null) {
                vo voVar2 = new vo(xq7Var);
                o40 o40Var = (o40) voVar2.c;
                synchronized (o40Var.b) {
                    o40Var.a = false;
                    voVar = voVar2;
                }
            } else {
                voVar = null;
            }
            ?? obj = new Object();
            d82 d82Var2 = (jr7) plus.get(tn3.D);
            if (d82Var2 == null) {
                d82Var2 = new kr7(view.getContext().getApplicationContext());
                obj.a = d82Var2;
            }
            if (voVar != null) {
                gs3Var = voVar;
            }
            d82 plus2 = plus.plus(gs3Var).plus(d82Var2);
            kk9 kk9Var = new kk9(plus2);
            synchronized (kk9Var.d) {
                kk9Var.u = true;
            }
            m41 a3 = k27.a(plus2);
            un6 O = iue.O(view);
            if (O != null) {
                xn6Var = O.k();
            } else {
                xn6Var = null;
            }
            if (xn6Var != null) {
                view.addOnAttachStateChangeListener(new qkd(view, kk9Var));
                xn6Var.a(new skd(a3, voVar, kk9Var, obj));
                view.setTag(R.id.androidx_compose_ui_view_composition_context, kk9Var);
                jz4 jz4Var = jz4.a;
                Handler handler = view.getHandler();
                int i = o35.a;
                view.addOnAttachStateChangeListener(new hj(z87.v(jz4Var, new n35(handler, "windowRecomposer cleanup", false).f, null, new q4c(kk9Var, view, null, 25), 2), 2));
                return kk9Var;
            }
            lv5.d("ViewTreeLifecycleOwner not found from " + view);
            ls2.c();
            return null;
        } else if (a2 instanceof kk9) {
            return (kk9) a2;
        } else {
            vs.k("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
    }
}
