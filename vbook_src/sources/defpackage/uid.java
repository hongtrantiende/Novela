package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.vbook.android.R;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uid  reason: default package */
/* loaded from: classes.dex */
public final class uid extends yid {
    public static final PathInterpolator e = new PathInterpolator(nae.e, 1.1f, nae.e, 1.0f);
    public static final ta4 f = new ta4();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(zid zidVar, View view) {
        xb1 i = i(view);
        if (i != null) {
            i.d(zidVar);
            if (i.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(zidVar, viewGroup.getChildAt(i2));
            }
        }
    }

    public static void f(View view, zid zidVar, tjd tjdVar, boolean z) {
        xb1 i = i(view);
        if (i != null) {
            i.c = tjdVar;
            if (!z) {
                i.e(zidVar);
                if (i.b == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                f(viewGroup.getChildAt(i2), zidVar, tjdVar, z);
            }
        }
    }

    public static void g(View view, tjd tjdVar, List list) {
        xb1 i = i(view);
        if (i != null) {
            tjdVar = i.f(tjdVar, list);
            if (i.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                g(viewGroup.getChildAt(i2), tjdVar, list);
            }
        }
    }

    public static void h(View view, zid zidVar, rwa rwaVar) {
        xb1 i = i(view);
        if (i != null) {
            i.g(zidVar, rwaVar);
            if (i.b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), zidVar, rwaVar);
            }
        }
    }

    public static xb1 i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof tid) {
            return ((tid) tag).a;
        }
        return null;
    }
}
