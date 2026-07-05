package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ov7  reason: default package */
/* loaded from: classes.dex */
public final class ov7 implements qt8 {
    public final pt8 a;
    public final Context b;
    public final Activity c;
    public final xt4 d;
    public final String e;
    public final hm8 f;
    public h6 g;

    public ov7(pt8 pt8Var, Context context, Activity activity, xt4 xt4Var) {
        xt4Var.getClass();
        this.a = pt8Var;
        this.b = context;
        this.c = activity;
        this.d = xt4Var;
        ek ekVar = (ek) fk.a.get(pt8Var);
        String str = "";
        if (ekVar != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = ekVar.b;
            if (i <= ekVar.c && i2 <= i) {
                str = ekVar.a;
            }
        }
        this.e = str;
        this.f = yae.z(b());
    }

    @Override // defpackage.qt8
    public final void a() {
        String str = this.e;
        if (str.length() == 0) {
            this.f.setValue(b());
            this.d.invoke(Boolean.TRUE);
            return;
        }
        ek ekVar = (ek) fk.a.get(this.a);
        h6 h6Var = this.g;
        if (h6Var != null) {
            h6Var.a(str);
        } else {
            vs.k("ActivityResultLauncher cannot be null");
        }
    }

    public final vt8 b() {
        boolean shouldShowRequestPermissionRationale;
        String str = this.e;
        if (str.length() != 0) {
            ek ekVar = (ek) fk.a.get(this.a);
            if (eze.f(this.b, str) != 0) {
                int i = Build.VERSION.SDK_INT;
                if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                    shouldShowRequestPermissionRationale = false;
                } else {
                    Activity activity = this.c;
                    if (i >= 32) {
                        shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                    } else if (i == 31) {
                        try {
                            shouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                        }
                    } else {
                        shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                    }
                }
                return new tt8(shouldShowRequestPermissionRationale);
            }
        }
        return ut8.a;
    }
}
