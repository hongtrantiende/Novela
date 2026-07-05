package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ajd  reason: default package */
/* loaded from: classes.dex */
public final class ajd extends hjd {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public cx5 f;

    public ajd() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.hjd
    public tjd b() {
        a();
        tjd c = tjd.c(this.e, null);
        cx5[] cx5VarArr = this.b;
        qjd qjdVar = c.a;
        qjdVar.w(cx5VarArr);
        qjdVar.z(this.f);
        qjdVar.v(null);
        qjdVar.B(this.c);
        qjdVar.C(this.d);
        return c;
    }

    @Override // defpackage.hjd
    public void f(cx5 cx5Var) {
        this.f = cx5Var;
    }

    @Override // defpackage.hjd
    public void h(cx5 cx5Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(cx5Var.a, cx5Var.b, cx5Var.c, cx5Var.d);
        }
    }

    public ajd(tjd tjdVar) {
        super(tjdVar);
        this.e = tjdVar.b();
    }
}
