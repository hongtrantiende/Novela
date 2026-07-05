package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.vbook.android.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rcd  reason: default package */
/* loaded from: classes.dex */
public abstract class rcd {
    public static Field a = null;
    public static boolean b = false;

    static {
        new WeakHashMap();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ocd.a(view);
        }
        if (!b) {
            if (a == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    a = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    b = true;
                    return null;
                }
            }
            try {
                Object obj = a.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                b = true;
                return null;
            }
        }
        return null;
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ocd.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void c(View view, j4 j4Var) {
        i4 i4Var;
        if (j4Var == null && (a(view) instanceof i4)) {
            j4Var = new j4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (j4Var == null) {
            i4Var = null;
        } else {
            i4Var = j4Var.b;
        }
        view.setAccessibilityDelegate(i4Var);
    }

    public static void d(View view, xb1 xb1Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (Build.VERSION.SDK_INT >= 30) {
            xid.g(view, xb1Var);
            return;
        }
        PathInterpolator pathInterpolator = uid.e;
        if (xb1Var != null) {
            onApplyWindowInsetsListener = new tid(view, xb1Var);
        } else {
            onApplyWindowInsetsListener = null;
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
