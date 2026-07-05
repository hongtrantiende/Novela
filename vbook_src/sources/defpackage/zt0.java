package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.view.WindowManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zt0  reason: default package */
/* loaded from: classes.dex */
public final class zt0 implements yt0, nkd, kp8 {
    public static final zt0 a = new Object();
    public static final zt0 b = new Object();

    public ip8 a(ParcelFileDescriptor parcelFileDescriptor, String str) {
        parcelFileDescriptor.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            if (str == null) {
                str = "";
            }
            return new jp8(parcelFileDescriptor, str, 0);
        } else if (i >= 30 && SdkExtensions.getExtensionVersion(31) >= 13) {
            if (str == null) {
                str = "";
            }
            return new jp8(parcelFileDescriptor, str, 1);
        } else {
            return new uq8(parcelFileDescriptor);
        }
    }

    @Override // defpackage.nkd
    public jkd c(Activity activity, s13 s13Var) {
        s13Var.getClass();
        yt0.h.getClass();
        return new jkd(new ut0(xt0.a().d(activity)), s13Var.g(activity));
    }

    @Override // defpackage.yt0
    public Rect d(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.nkd
    public jkd i(Context context, s13 s13Var) {
        s13Var.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new jkd(bounds, f);
    }
}
