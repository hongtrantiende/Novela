package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t13  reason: default package */
/* loaded from: classes.dex */
public final class t13 implements s13, nkd {
    public static final t13 a = new Object();
    public static final t13 b = new Object();

    @Override // defpackage.nkd
    public jkd c(Activity activity, s13 s13Var) {
        s13Var.getClass();
        yt0.h.getClass();
        return new jkd(new ut0(xt0.a().d(activity)), s13Var.g(activity));
    }

    @Override // defpackage.s13
    public float g(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.nkd
    public jkd i(Context context, s13 s13Var) {
        WindowManager windowManager;
        s13Var.getClass();
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new jkd(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
